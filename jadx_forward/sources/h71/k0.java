package h71;

/* loaded from: classes.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a f360931d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a activityC11395xb9d37a9a) {
        this.f360931d = activityC11395xb9d37a9a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(h71.k0.class.getName());
        sb6.append(",L600_300,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L600_300"));
        sb6.append(",1");
        n71.a.b(10645, sb6.toString());
        java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a activityC11395xb9d37a9a = this.f360931d;
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(activityC11395xb9d37a9a.getSharedPreferences(e17, 0), activityC11395xb9d37a9a);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a.f154766s, o17));
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activityC11395xb9d37a9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7y));
        intent.putExtra("show_bottom", false);
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, activityC11395xb9d37a9a);
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
