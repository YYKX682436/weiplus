package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public class pm implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f281257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm f281258e;

    public pm(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm smVar, boolean z17) {
        this.f281258e = smVar;
        this.f281257d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f281258e.t0(this.f281257d ? "fromBanner" : "fromPluginTalk");
    }
}
