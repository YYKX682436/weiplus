package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class i implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.j f73918d;

    public i(com.tencent.mm.plugin.account.ui.j jVar) {
        this.f73918d = jVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f73918d.f73939b = null;
    }
}
