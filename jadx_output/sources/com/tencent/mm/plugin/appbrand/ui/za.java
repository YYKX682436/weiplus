package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public final class za implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f90371d;

    public za(yz5.a aVar) {
        this.f90371d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f90371d.invoke();
    }
}
