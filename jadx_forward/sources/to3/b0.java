package to3;

/* loaded from: classes9.dex */
public class b0 extends com.p314xaae8f345.mm.p2802xd031a825.h {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        java.lang.String str;
        java.util.List list;
        if (bundle != null) {
            str = "key_trans_id";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bundle.getString("key_trans_id"))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) bundle.getParcelable("key_orders");
                if (c19099x8d444f05 != null && (list = c19099x8d444f05.M) != null && ((java.util.ArrayList) list).size() >= 1) {
                    str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) c19099x8d444f05.M).get(0)).f261247r;
                }
            }
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new wo3.g("offlineshowpage", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63, str));
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7.class, bundle);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            return this;
        }
        str = "";
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new wo3.g("offlineshowpage", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63, str));
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7.class, bundle);
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "ShowOrderSuccessProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        g(activity);
        if (this.f295334c.getInt("key_from_scene") == 8) {
            yo3.m.h(this.f295334c.getString("key_appid"));
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7) {
            m(activity);
            f(activity, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
