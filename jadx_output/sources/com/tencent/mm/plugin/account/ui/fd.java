package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class fd implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f73857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.qd f73858e;

    public fd(com.tencent.mm.plugin.account.ui.qd qdVar, h11.e eVar) {
        this.f73858e = qdVar;
        this.f73857d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73857d);
        gm0.j1.d().q(145, this.f73858e);
    }
}
