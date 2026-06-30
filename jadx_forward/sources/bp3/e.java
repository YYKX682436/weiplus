package bp3;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2802xd031a825.h {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd.class, bundle);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "ShowOrdersInfoProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        g(activity);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16778x6ec76dfd) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16779xfb7fe1e6.class, bundle);
            return;
        }
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d)) {
            if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16777xd3921e27) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16779xfb7fe1e6)) {
                m(activity);
                return;
            }
            return;
        }
        int i18 = bundle.getInt("key_enter_id");
        if (i18 == 0) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16777xd3921e27.class, bundle);
        } else if (i18 == 1) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16779xfb7fe1e6.class, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
