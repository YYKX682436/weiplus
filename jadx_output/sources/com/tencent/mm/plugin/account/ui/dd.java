package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class dd implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f73806d;

    public dd(com.tencent.mm.plugin.account.ui.qd qdVar, h11.e eVar) {
        this.f73806d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73806d);
    }
}
