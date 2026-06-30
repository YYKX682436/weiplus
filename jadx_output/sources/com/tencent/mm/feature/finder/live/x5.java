package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class x5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f67041d;

    public x5(kotlin.coroutines.Continuation continuation) {
        this.f67041d = continuation;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f67041d.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
