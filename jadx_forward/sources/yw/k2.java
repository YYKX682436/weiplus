package yw;

/* loaded from: classes9.dex */
public final class k2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f547913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a f547915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f547916g;

    public k2(o25.y1 y1Var, yz5.l lVar, com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f547913d = y1Var;
        this.f547914e = lVar;
        this.f547915f = c23232x91bb1d7a;
        this.f547916g = abstractActivityC21394xb3d2c0cf;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        yw.j2 j2Var = new yw.j2(this.f547914e, this.f547915f, this.f547916g);
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) this.f547913d).aj((db5.h4) menuItem, j2Var);
    }
}
