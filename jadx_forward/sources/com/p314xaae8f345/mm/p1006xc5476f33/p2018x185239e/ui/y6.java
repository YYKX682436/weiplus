package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class y6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f239584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f239585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f239586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f239587g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h45.i f239588h;

    public y6(android.app.Activity activity, java.lang.String str, android.app.Dialog dialog, h45.i iVar) {
        this.f239585e = activity;
        this.f239586f = str;
        this.f239587g = dialog;
        this.f239588h = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceLqtSaveJumpHandler", "[jumpToLqtSaveKinda] WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f239584d));
        if (!this.f239584d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.z6.f239598a.a(this.f239585e, this.f239586f, this.f239587g, this.f239588h);
        }
        this.f239584d = true;
    }
}
