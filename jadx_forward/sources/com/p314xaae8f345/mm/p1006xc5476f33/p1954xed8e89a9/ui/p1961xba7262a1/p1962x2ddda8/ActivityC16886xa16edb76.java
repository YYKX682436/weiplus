package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.p1962x2ddda8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthMainUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI */
/* loaded from: classes3.dex */
public final class ActivityC16886xa16edb76 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f235725d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f235726e;

    public final java.lang.String U6() {
        java.lang.String str = this.f235725d;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(dm.i4.f66875xa013b0d5);
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a1r;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        java.util.Set i17 = mo43419xa59964ef != null ? kz5.q1.i(mo43419xa59964ef, kz5.z.D0(new java.lang.Class[]{rr3.k.class, rr3.z.class})) : null;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return i17;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f235725d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_add_contact_openim_appid");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f235726e = stringExtra2;
        m78591x7f5d15fd(false);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo54448x9c8c0d33(new rr3.l(this));
    }
}
