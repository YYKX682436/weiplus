package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class jd implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.w0 f73959d;

    public jd(com.tencent.mm.plugin.account.ui.qd qdVar, com.tencent.mm.modelsimple.w0 w0Var) {
        this.f73959d = w0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73959d);
    }
}
