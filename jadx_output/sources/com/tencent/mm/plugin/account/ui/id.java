package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class id implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f73934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.qd f73935e;

    public id(com.tencent.mm.plugin.account.ui.qd qdVar, h11.e eVar) {
        this.f73935e = qdVar;
        this.f73934d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73934d);
        gm0.j1.d().q(145, this.f73935e);
    }
}
