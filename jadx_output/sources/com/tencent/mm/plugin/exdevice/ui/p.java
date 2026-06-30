package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.q f99611d;

    public p(com.tencent.mm.plugin.exdevice.ui.q qVar) {
        this.f99611d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.exdevice.model.q0.c(this.f99611d.f99624e.getContext(), "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492290fy1) + "/steprank/step/connect-help.html");
    }
}
