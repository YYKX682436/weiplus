package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public class aa implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f288977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f288978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f288979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f288980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f288981h;

    public aa(android.content.SharedPreferences sharedPreferences, android.content.Context context, boolean z17, int i17, int i18) {
        this.f288977d = sharedPreferences;
        this.f288978e = context;
        this.f288979f = z17;
        this.f288980g = i17;
        this.f288981h = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.SharedPreferences sharedPreferences = this.f288977d;
        sharedPreferences.edit().putInt("show_rating_flag", 4).commit();
        java.lang.String str = "market://details?id=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(str));
        android.content.Context context = this.f288978e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/conversation/RatingDialogHelper$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/conversation/RatingDialogHelper$3", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        sharedPreferences.edit().putBoolean("show_rating_again", false).commit();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.f289188a = null;
        boolean z17 = this.f288979f;
        int i18 = this.f288981h;
        int i19 = this.f288980g;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11216, 5, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11216, 4, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        }
    }
}
