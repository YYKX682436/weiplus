package kt4;

/* loaded from: classes9.dex */
public class a extends qs4.j {
    @Override // qs4.j, qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        a("start", activity, bundle);
        if (bundle != null) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, bundle.getInt("key_bind_scene"));
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(bundle.getInt("key_bind_scene"));
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(6, 0);
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.b(0);
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            if (bundle == null) {
                return super.A(activity, bundle);
            }
            if (bundle.getBoolean("key_is_import_bind", false)) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2.class, bundle);
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle);
            }
            return this;
        }
        if (bundle != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.b(activity, bundle.getInt("key_bind_scene", 0), 1);
        }
        if (bundle == null || !bundle.getBoolean("key_is_import_bind", false)) {
            return super.A(activity, bundle);
        }
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2.class, bundle);
        return this;
    }

    @Override // qs4.j, com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "OpenECardBindCardProcess";
    }

    @Override // qs4.j, com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (bundle != null && bundle.getBoolean("intent_bind_end", false)) {
            k(activity, "wallet_ecard", ".ui.WalletECardBindCardListUI", -1, new android.content.Intent(), true);
        } else {
            k(activity, "wallet_ecard", ".ui.WalletECardBindCardListUI", 0, new android.content.Intent(), true);
            activity.finish();
        }
    }
}
