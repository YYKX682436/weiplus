package yw;

/* loaded from: classes9.dex */
public final class f2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a f547851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f547853c;

    public f2(com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a, java.lang.String str, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f547851a = c23232x91bb1d7a;
        this.f547852b = str;
        this.f547853c = abstractActivityC21394xb3d2c0cf;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        yw.q2 q2Var;
        com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 a17;
        if (!z17 || (a17 = yw.q2.a((q2Var = yw.q2.f547967a), (c23232x91bb1d7a = this.f547851a))) == null) {
            return;
        }
        java.lang.String str2 = this.f547852b;
        yw.q2.b(q2Var, a17, str2, c23232x91bb1d7a, str);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f547853c;
        db5.t7.h(abstractActivityC21394xb3d2c0cf, j65.q.a(abstractActivityC21394xb3d2c0cf).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().g(str2);
    }
}
