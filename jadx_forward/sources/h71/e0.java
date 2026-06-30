package h71;

/* loaded from: classes.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11394xd9667693 f360919d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11394xd9667693 activityC11394xd9667693) {
        this.f360919d = activityC11394xd9667693;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11394xd9667693 activityC11394xd9667693 = this.f360919d;
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(activityC11394xd9667693.getSharedPreferences(e17, 0), activityC11394xd9667693);
        android.content.Intent intent = new android.content.Intent();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11394xd9667693.f154761h)) {
            intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11394xd9667693.f154757p, o17));
        } else {
            intent.putExtra("rawUrl", activityC11394xd9667693.f154761h);
        }
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activityC11394xd9667693.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7y));
        intent.putExtra("show_bottom", false);
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, activityC11394xd9667693);
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
