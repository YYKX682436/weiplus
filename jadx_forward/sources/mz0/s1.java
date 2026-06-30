package mz0;

/* loaded from: classes5.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414574d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414577g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c f414578h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(java.lang.String str, mz0.b2 b2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414576f = str;
        this.f414577g = b2Var;
        this.f414578h = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mz0.s1 s1Var = new mz0.s1(this.f414576f, this.f414577g, this.f414578h, interfaceC29045xdcb5ca57);
        s1Var.f414575e = obj;
        return s1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.s1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2;
        p3325xe03a0797.p3326xc267989b.r2 r2Var2;
        p3325xe03a0797.p3326xc267989b.y0 y0Var3;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414574d;
        boolean z17 = false;
        mz0.b2 b2Var = this.f414577g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f414575e;
            p3325xe03a0797.p3326xc267989b.r2 r2Var3 = b2Var.B;
            if (r2Var3 != null) {
                ((p3325xe03a0797.p3326xc267989b.a) r2Var3).a();
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var4 = b2Var.C;
            if (r2Var4 != null) {
                r2Var4.a();
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var5 = b2Var.C;
            if ((r2Var5 != null && r2Var5.a()) && (r2Var = b2Var.C) != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            android.app.Activity context = b2Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            az0.n7 n7Var = ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) ((dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class))).f151316d;
            p3325xe03a0797.p3326xc267989b.r2 r2Var6 = n7Var != null ? n7Var.f97280f : null;
            if (r2Var6 != null && r2Var6.a()) {
                this.f414575e = y0Var;
                this.f414574d = 1;
                if (r2Var6.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y0Var3 = (p3325xe03a0797.p3326xc267989b.y0) this.f414575e;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                y0Var2 = y0Var3;
                b2Var.C = p3325xe03a0797.p3326xc267989b.l.d(y0Var2, null, null, new mz0.r1(this.f414578h, this.f414576f, b2Var, null), 3, null);
                return jz5.f0.f384359a;
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var4 = (p3325xe03a0797.p3326xc267989b.y0) this.f414575e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = y0Var4;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var7 = b2Var.B;
        if (r2Var7 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var7).a()) {
            z17 = true;
        }
        if (!z17 || (r2Var2 = b2Var.B) == null) {
            y0Var2 = y0Var;
            b2Var.C = p3325xe03a0797.p3326xc267989b.l.d(y0Var2, null, null, new mz0.r1(this.f414578h, this.f414576f, b2Var, null), 3, null);
            return jz5.f0.f384359a;
        }
        this.f414575e = y0Var;
        this.f414574d = 2;
        if (((p3325xe03a0797.p3326xc267989b.c3) r2Var2).C(this) == aVar) {
            return aVar;
        }
        y0Var3 = y0Var;
        y0Var2 = y0Var3;
        b2Var.C = p3325xe03a0797.p3326xc267989b.l.d(y0Var2, null, null, new mz0.r1(this.f414578h, this.f414576f, b2Var, null), 3, null);
        return jz5.f0.f384359a;
    }
}
