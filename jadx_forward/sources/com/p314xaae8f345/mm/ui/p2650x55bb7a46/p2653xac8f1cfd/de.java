package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class de implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le f280468d;

    public de(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar) {
        this.f280468d = leVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "dialog onCancel");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar = this.f280468d;
        java.lang.Thread thread = leVar.f280962x;
        if (thread == null || !thread.isAlive()) {
            return;
        }
        leVar.f280962x.interrupt();
    }
}
