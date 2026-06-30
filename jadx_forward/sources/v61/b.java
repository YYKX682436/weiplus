package v61;

/* loaded from: classes5.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f514958e;

    public b(java.lang.String str, android.content.Context context) {
        this.f514957d = str;
        this.f514958e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String c17;
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f514957d;
        java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.c(str);
        java.lang.String c19 = u11.b.c(c18);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q0(str).booleanValue() && str.startsWith("+") && (c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.c((str = str.replace("+", "")))) != null) {
            str = str.substring(c17.length());
        }
        intent.putExtra("bindmcontact_shortmobile", str);
        intent.putExtra("couttry_code", c18);
        intent.putExtra("country_name", c19);
        boolean e17 = u11.c.e(c18);
        android.content.Context context = this.f514958e;
        if (e17) {
            intent.putExtra("mobile_input_purpose", 2);
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
        } else {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.class);
        }
        android.content.Context context2 = this.f514958e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/account/model/AccountCommonLogic$Companion$showNoBindPhoneRegisterDialog$mAlertBuilder$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/account/model/AccountCommonLogic$Companion$showNoBindPhoneRegisterDialog$mAlertBuilder$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
