package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class b1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f73734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f73735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.d1 f73736f;

    public b1(com.tencent.mm.plugin.account.ui.d1 d1Var, android.content.Context context, java.lang.String str) {
        this.f73736f = d1Var;
        this.f73734d = context;
        this.f73735e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r61.q0.k(true);
        com.tencent.mm.plugin.account.ui.d1 d1Var = this.f73736f;
        d1Var.f73791c.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
        android.content.Context context = this.f73734d;
        d1Var.b(context, this.f73735e);
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
    }
}
