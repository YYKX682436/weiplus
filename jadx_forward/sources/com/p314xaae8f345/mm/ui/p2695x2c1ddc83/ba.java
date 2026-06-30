package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public class ba implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f289018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f289019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f289021g;

    public ba(android.content.SharedPreferences sharedPreferences, boolean z17, int i17, int i18) {
        this.f289018d = sharedPreferences;
        this.f289019e = z17;
        this.f289020f = i17;
        this.f289021g = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.SharedPreferences sharedPreferences = this.f289018d;
        sharedPreferences.edit().putInt("show_rating_flag", 4).commit();
        boolean z17 = this.f289019e;
        int i18 = this.f289021g;
        int i19 = this.f289020f;
        if (z17) {
            sharedPreferences.edit().putBoolean("show_rating_again", false).commit();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11216, 3, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        } else {
            sharedPreferences.edit().putBoolean("show_rating_again", true).commit();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11216, 6, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        }
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.f289188a = null;
    }
}
