package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class gd implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.qd f73887d;

    public gd(com.tencent.mm.plugin.account.ui.qd qdVar) {
        this.f73887d = qdVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f73887d.f74139d.finish();
        v61.u0.a(v61.t0.NONE);
    }
}
