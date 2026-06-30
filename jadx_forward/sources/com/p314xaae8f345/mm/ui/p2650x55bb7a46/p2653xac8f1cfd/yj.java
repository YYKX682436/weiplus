package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class yj implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.i f281860e;

    public yj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ck ckVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p944x882e457a.i iVar) {
        this.f281859d = f9Var;
        this.f281860e = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.RevokeMsgComponent", "cancel revoke msg:%s", java.lang.Long.valueOf(this.f281859d.I0()));
        this.f281860e.j();
    }
}
