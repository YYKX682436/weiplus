package az2;

/* loaded from: classes10.dex */
public class j extends bz2.c implements cz2.j {

    /* renamed from: r */
    public static final az2.h f97666r = new az2.h(null);

    /* renamed from: s */
    public static final android.util.SparseArray f97667s = new android.util.SparseArray();

    /* renamed from: n */
    public final r45.qt2 f97668n;

    /* renamed from: o */
    public az2.f f97669o;

    /* renamed from: p */
    public boolean f97670p;

    /* renamed from: q */
    public final jz5.g f97671q;

    public j(r45.qt2 qt2Var, im5.b bVar) {
        super(bVar);
        this.f97668n = qt2Var;
        this.f97670p = true;
        this.f97671q = jz5.h.b(new az2.i(this));
    }

    public static /* synthetic */ az2.j u(az2.j jVar, android.content.Context context, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delayLoading");
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            j17 = 500;
        }
        jVar.t(context, str, j17);
        return jVar;
    }

    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f resp, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public void j() {
        az2.f fVar = this.f97669o;
        if (fVar != null) {
            fVar.b();
        }
        super.j();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public final void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f resp, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        jz5.g gVar = this.f97671q;
        cz2.i iVar = (cz2.i) ((jz5.n) gVar).mo141623x754a37bb();
        iVar.f306545e = iVar.f306544d.a();
        az2.f fVar = this.f97669o;
        if (fVar != null) {
            fVar.b();
        }
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152179f;
        java.lang.String str2 = oVar != null ? oVar.f152245c : null;
        if (str2 == null) {
            str2 = "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List s17 = s();
        if (s17 != null) {
            arrayList.addAll(s17);
        }
        arrayList.add(new jz5.l("errType", java.lang.String.valueOf(i17)));
        arrayList.add(new jz5.l("errCode", java.lang.String.valueOf(i18)));
        ((b92.d1) zbVar).Di(str2, 1, arrayList);
        A(i17, i18, str, resp, m1Var);
        cz2.i iVar2 = (cz2.i) ((jz5.n) gVar).mo141623x754a37bb();
        iVar2.f306546f = iVar2.f306544d.a();
        ((cz2.i) ((jz5.n) gVar).mo141623x754a37bb()).a(i17, i18, str, this.f152179f);
        if (this.f97670p) {
            hz2.d dVar = hz2.d.f367846a;
            dVar.g(i17, i18, str);
            dVar.i(i17, i18, str);
            dVar.e(i17, i18, str);
        }
        az2.m.b(az2.m.f97677a, i18, str, 0, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        az2.f fVar = this.f97669o;
        if (fVar != null) {
            fVar.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dispatchCgi] ");
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152179f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(oVar, "getReqResp(...)");
        sb6.append(oVar.f152245c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCgi", sb6.toString());
        if (y()) {
            r45.qt2 qt2Var = this.f97668n;
            f97667s.put(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0, java.lang.Long.valueOf(c01.id.c()));
        }
        ((cz2.i) ((jz5.n) this.f97671q).mo141623x754a37bb()).c(this.f152179f);
        az2.k.f97672a.a(this.f152179f.f152246d);
        pq5.g l17 = super.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        return l17;
    }

    public java.util.List s() {
        return null;
    }

    public final az2.j t(android.content.Context context, java.lang.String str, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f97669o = az2.c.a(az2.f.f97658d, context, str, j17, null, 8, null);
        return this;
    }

    @Override // cz2.j
    public cz2.f v() {
        return cz2.f.f306535d;
    }

    @Override // cz2.j
    public org.json.JSONObject w() {
        return null;
    }

    @Override // ay1.m
    /* renamed from: x */
    public java.lang.String mo8871xb5884f29() {
        return java.lang.String.valueOf(this.f152179f.f152246d);
    }

    public boolean y() {
        return this instanceof db2.e1;
    }

    @Override // cz2.j
    public org.json.JSONObject z() {
        return null;
    }

    public /* synthetic */ j(r45.qt2 qt2Var, im5.b bVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : qt2Var, (i17 & 2) != 0 ? null : bVar);
    }
}
