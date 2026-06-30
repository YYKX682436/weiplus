package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public class j5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f290530d;

    public j5(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, java.lang.Runnable runnable) {
        this.f290530d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f290530d.run();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }
}
