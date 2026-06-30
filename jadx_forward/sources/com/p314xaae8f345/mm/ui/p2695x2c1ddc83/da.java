package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public class da implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f289169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289171f;

    public da(android.content.SharedPreferences sharedPreferences, int i17, int i18) {
        this.f289169d = sharedPreferences;
        this.f289170e = i17;
        this.f289171f = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f289169d.edit().putInt("show_rating_flag", 4).commit();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.f289188a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11216, 1, java.lang.Integer.valueOf(this.f289170e), java.lang.Integer.valueOf(this.f289171f));
    }
}
