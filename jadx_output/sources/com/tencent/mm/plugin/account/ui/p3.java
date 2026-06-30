package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public final class p3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.o3 f74106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h11.e f74107e;

    public p3(com.tencent.mm.plugin.account.ui.o3 o3Var, h11.e eVar) {
        this.f74106d = o3Var;
        this.f74107e = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.account.ui.q3.f74128a.a(this.f74106d, this.f74107e);
    }
}
