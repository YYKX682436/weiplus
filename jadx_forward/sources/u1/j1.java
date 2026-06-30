package u1;

/* loaded from: classes14.dex */
public final class j1 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final u1.w f505141d;

    /* renamed from: e, reason: collision with root package name */
    public final t1.d f505142e;

    /* renamed from: f, reason: collision with root package name */
    public u1.j1 f505143f;

    /* renamed from: g, reason: collision with root package name */
    public u1.j1 f505144g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f505145h;

    /* renamed from: i, reason: collision with root package name */
    public final o0.i f505146i;

    public j1(u1.w layoutNode, t1.d modifier) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutNode, "layoutNode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
        this.f505141d = layoutNode;
        this.f505142e = modifier;
        this.f505146i = new o0.i(new u1.i1[16], 0);
    }

    public final void a() {
        this.f505145h = false;
        o0.i iVar = this.f505146i;
        int i17 = iVar.f423385f;
        if (i17 > 0) {
            java.lang.Object[] objArr = iVar.f423383d;
            int i18 = 0;
            do {
                u1.i1 i1Var = (u1.i1) objArr[i18];
                i1Var.f505136e.B(u1.i1.f505134h);
                i1Var.f505138g = false;
                i18++;
            } while (i18 < i17);
        }
        e(this.f505142e.mo156xb5884f29(), false);
    }

    public final t1.d d(t1.a local) {
        u1.j1 j1Var;
        t1.d d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(local, "local");
        t1.d dVar = this.f505142e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.mo156xb5884f29(), local)) {
            return dVar;
        }
        u1.j1 j1Var2 = this.f505144g;
        if (j1Var2 != null && (d17 = j1Var2.d(local)) != null) {
            return d17;
        }
        u1.w p17 = this.f505141d.p();
        if (p17 == null || (j1Var = p17.Q) == null) {
            return null;
        }
        return j1Var.d(local);
    }

    public final void e(t1.a local, boolean z17) {
        jz5.f0 f0Var;
        o0.i r17;
        int i17;
        u1.r1 r1Var;
        if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505142e.mo156xb5884f29(), local)) {
            return;
        }
        o0.i iVar = this.f505146i;
        int i18 = iVar.f423385f;
        int i19 = 0;
        if (i18 > 0) {
            java.lang.Object[] objArr = iVar.f423383d;
            int i27 = 0;
            do {
                u1.i1 i1Var = (u1.i1) objArr[i27];
                i1Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(local, "local");
                if (i1Var.f505137f.f(local) && (r1Var = i1Var.f505135d.f505141d.f505222m) != null) {
                    ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) r1Var).r(i1Var);
                }
                i27++;
            } while (i27 < i18);
        }
        u1.j1 j1Var = this.f505143f;
        if (j1Var != null) {
            j1Var.e(local, true);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var != null || (i17 = (r17 = this.f505141d.r()).f423385f) <= 0) {
            return;
        }
        java.lang.Object[] objArr2 = r17.f423383d;
        do {
            ((u1.w) objArr2[i19]).P.e(local, true);
            i19++;
        } while (i19 < i17);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f505145h) {
            e(this.f505142e.mo156xb5884f29(), false);
        }
        return jz5.f0.f384359a;
    }
}
