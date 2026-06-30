package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class bf implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f73753d;

    public bf(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI, h11.e eVar) {
        this.f73753d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        synchronized (this.f73753d) {
            try {
                gm0.j1.d().d(this.f73753d);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
