package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class v0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f164819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 f164821d;

    public v0(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var) {
        this.f164818a = activity;
        this.f164819b = yVar;
        this.f164820c = i17;
        this.f164821d = a1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12240x358662ba c12240x358662ba = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12240x358662ba) abstractC11888x1a859600;
        if (c12240x358662ba == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, result is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164781e.a(c12240x358662ba.f164629d);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, shareResult is null");
            a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t2.f164784h;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, shareResult: " + a17);
        int ordinal = a17.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var = this.f164821d;
        int i17 = this.f164820c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f164819b;
        if (ordinal == 0) {
            android.app.Activity activity = this.f164818a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activity, null, null);
            yVar.a(i17, a1Var.o("ok"));
        } else if (ordinal == 1) {
            yVar.a(i17, a1Var.o("cancel"));
        } else {
            if (ordinal != 2) {
                return;
            }
            yVar.a(i17, a1Var.o("fail"));
        }
    }
}
