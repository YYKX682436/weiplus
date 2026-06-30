package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2063x2cefd8ff;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/SettingGroupNoPwdItem;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.acount_info.SettingGroupNoPwdItem */
/* loaded from: classes.dex */
public final class C17536x930e6180 extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17536x930e6180(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // s24.a
    public java.lang.String L7() {
        return "";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "";
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo_NoPwd";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17516x8a590acc.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2063x2cefd8ff.C17537xa2bb281d.class);
    }

    @Override // s24.a, s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.p_1;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17516x8a590acc.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF243505p() {
        return 2;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF243498p() {
        return ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ri() ? m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p9n) : m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p9m);
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF243481p() {
        if (com.p314xaae8f345.mm.ui.bk.A() || c01.z1.x()) {
            return false;
        }
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        return ((is.f) r0Var).bj(r17);
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        t7(m158354x19263085().getIntent());
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        pf5.j0.a(intent, q14.d.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/SettingGroupNoPwdItem", "onClick", "(Landroid/content/Context;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting_new/settings/acount_info/SettingGroupNoPwdItem", "onClick", "(Landroid/content/Context;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
