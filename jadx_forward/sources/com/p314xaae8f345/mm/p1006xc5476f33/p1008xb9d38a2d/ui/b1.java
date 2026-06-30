package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class b1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f155267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d1 f155269f;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d1 d1Var, android.content.Context context, java.lang.String str) {
        this.f155269f = d1Var;
        this.f155267d = context;
        this.f155268e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r61.q0.k(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d1 d1Var = this.f155269f;
        d1Var.f155324c.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
        android.content.Context context = this.f155267d;
        d1Var.b(context, this.f155268e);
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
    }
}
