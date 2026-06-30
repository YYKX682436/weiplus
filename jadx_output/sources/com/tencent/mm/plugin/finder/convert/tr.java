package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class tr implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f104643d;

    public tr(android.content.Context context) {
        this.f104643d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((android.app.Activity) this.f104643d).finish();
    }
}
