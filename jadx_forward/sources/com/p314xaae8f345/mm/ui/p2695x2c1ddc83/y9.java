package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public class y9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f289807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f289808e;

    public y9(android.content.SharedPreferences sharedPreferences, android.content.Context context) {
        this.f289807d = sharedPreferences;
        this.f289808e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f289807d.edit().putInt("show_rating_flag", 1).commit();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.f289188a = null;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.b(this.f289808e, true);
    }
}
