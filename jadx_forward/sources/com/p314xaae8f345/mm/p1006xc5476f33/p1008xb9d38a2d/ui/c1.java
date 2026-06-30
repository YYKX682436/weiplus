package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class c1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f155294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d1 f155295e;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d1 d1Var, android.content.Context context) {
        this.f155295e = d1Var;
        this.f155294d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r61.q0.k(false);
        this.f155295e.f155324c.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
        android.content.Context context = this.f155294d;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
    }
}
