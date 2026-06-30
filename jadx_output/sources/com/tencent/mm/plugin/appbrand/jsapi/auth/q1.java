package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes.dex */
public final class q1 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f79690d;

    public q1(kotlinx.coroutines.q qVar) {
        this.f79690d = qVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        kotlinx.coroutines.q qVar = this.f79690d;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
    }
}
