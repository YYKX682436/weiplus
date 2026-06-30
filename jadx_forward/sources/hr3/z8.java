package hr3;

/* loaded from: classes.dex */
public final class z8 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f365768d;

    /* renamed from: e, reason: collision with root package name */
    public final int f365769e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f365770f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f365769e = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 50);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        gm0.j1.n().f354821b.a(3990, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        gm0.j1.n().f354821b.q(3990, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        java.lang.String m150572x17ec12d2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteContactUIC", "onSceneEnd() called with: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str + ", scene = " + scene);
        if (scene instanceof w11.h0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f365768d;
            if (f4Var != null) {
                f4Var.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                yz5.l lVar = this.f365770f;
                if (lVar != null) {
                    java.util.List list = ((w11.h0) scene).f523579o;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getReqNames(...)");
                    lVar.mo146xb9724478(list);
                    return;
                }
                return;
            }
            if (i18 != -3503) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m158354x19263085());
                if (i18 == -3500) {
                    w11.h0 h0Var = (w11.h0) scene;
                    m150572x17ec12d2 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bba, java.lang.Integer.valueOf(h0Var.f523578n - ((java.util.LinkedList) h0Var.f523572e).size()));
                } else {
                    m150572x17ec12d2 = scene.mo47948x7f0c4558().mo13821x7f35c2d1().m150572x17ec12d2();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m150572x17ec12d2)) {
                        m150572x17ec12d2 = ((w11.h0) scene).H() == null ? m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bbb) : m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bbc);
                    }
                }
                u1Var.g(m150572x17ec12d2);
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
                u1Var.l(hr3.y8.f365739a);
                u1Var.q(false);
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(m158354x19263085());
            java.lang.String m150572x17ec12d22 = scene.mo47948x7f0c4558().mo13821x7f35c2d1().m150572x17ec12d2();
            java.lang.String m158362x2fec8307 = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bbc);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m150572x17ec12d22 == null) {
                m150572x17ec12d22 = m158362x2fec8307;
            }
            u1Var2.g(m150572x17ec12d22);
            u1Var2.a(true);
            u1Var2.j(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.hmr));
            u1Var2.m(com.p314xaae8f345.mm.R.C30867xcad56011.hms);
            u1Var2.b(new hr3.x8(this));
            u1Var2.q(false);
        }
    }
}
