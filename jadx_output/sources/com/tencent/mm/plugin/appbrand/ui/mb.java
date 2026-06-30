package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public final class mb implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f89870d;

    public mb(yz5.a aVar) {
        this.f89870d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f89870d.invoke();
    }
}
