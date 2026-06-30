package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f74071d;

    public o(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI, h11.e eVar) {
        this.f74071d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74071d);
    }
}
