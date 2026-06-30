package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2063x2cefd8ff.p2064x6c160a37;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/more_safe/SettingGroupQQAccount;", "Ls24/f;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.more_safe.SettingGroupQQAccount */
/* loaded from: classes.dex */
public final class C17541xe7dd3a9e extends s24.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17541xe7dd3a9e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo_MoreSafe_QQAccount";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2063x2cefd8ff.C17535x7b063fd1.class, null);
    }

    @Override // s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.f575359p84;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2063x2cefd8ff.C17535x7b063fd1.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF243505p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF243498p() {
        java.lang.Object l17 = gm0.j1.u().c().l(9, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) l17).intValue();
        if (intValue == 0) {
            return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ipy);
        }
        return "" + new kk.v(intValue);
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF243481p() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityQQ.h();
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        t7(m158354x19263085().getIntent());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityQQ.k(context, null)) {
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).i(new android.content.Intent(), context);
        }
    }
}
