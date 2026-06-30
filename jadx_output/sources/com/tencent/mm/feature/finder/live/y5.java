package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class y5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f67047d;

    public y5(kotlin.coroutines.Continuation continuation) {
        this.f67047d = continuation;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f67047d.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
