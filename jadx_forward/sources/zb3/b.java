package zb3;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.h {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16340xe900d22f) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        f(activity, null);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "LuckyFreePwdProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        intent.putExtras(bundle);
        k(activity, "luckymoney", ".sns.SnsLuckyMoneyFreePwdSetting", -1, intent, true);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        f(activity, bundle);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            return new zb3.a(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
