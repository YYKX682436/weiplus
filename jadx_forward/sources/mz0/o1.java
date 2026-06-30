package mz0;

/* loaded from: classes5.dex */
public final class o1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c f414549g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(mz0.b2 b2Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f414547e = b2Var;
        this.f414548f = str;
        this.f414549g = cVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c cVar = this.f414549g;
        mz0.o1 o1Var = new mz0.o1(this.f414547e, this.f414548f, cVar, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        o1Var.f414546d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        o1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.app.Activity m80379x76847179;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f414546d;
        mz0.b2 b2Var = this.f414547e;
        java.lang.String str = this.f414548f;
        b2Var.s7(th6, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c cVar = this.f414549g;
        if (th6 == null) {
            if (!((com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p920xd1075a44.C11009x358a2db0) b2Var.f414431v.mo141623x754a37bb()).f151297h && (m80379x76847179 = b2Var.m80379x76847179()) != null) {
                java.lang.Object systemService = m80379x76847179.getSystemService("vibrator");
                android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
                if (vibrator != null) {
                    vibrator.vibrate(10L);
                }
            }
            if (cVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.k1) cVar).a(new cw3.h(null, 1, null), str);
            }
            mz0.b2.Q6(b2Var);
        } else if (cVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.k1) cVar).a(new cw3.e(th6), str);
        }
        return jz5.f0.f384359a;
    }
}
