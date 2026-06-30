package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public class ca implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f289147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f289148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f289150g;

    public ca(android.content.SharedPreferences sharedPreferences, android.content.Context context, int i17, int i18) {
        this.f289147d = sharedPreferences;
        this.f289148e = context;
        this.f289149f = i17;
        this.f289150g = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f289147d.edit().putInt("show_rating_flag", 4).commit();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        o25.z.n(this.f289148e, "weixin://dl/feedback", null, 0, null, o45.cg.a(), new byte[0], null);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.f289188a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11216, 2, java.lang.Integer.valueOf(this.f289149f), java.lang.Integer.valueOf(this.f289150g));
    }
}
