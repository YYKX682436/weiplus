package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class c1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f73761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.d1 f73762e;

    public c1(com.tencent.mm.plugin.account.ui.d1 d1Var, android.content.Context context) {
        this.f73762e = d1Var;
        this.f73761d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r61.q0.k(false);
        this.f73762e.f73791c.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
        android.content.Context context = this.f73761d;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
    }
}
