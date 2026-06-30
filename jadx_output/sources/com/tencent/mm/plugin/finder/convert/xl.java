package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class xl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yl f104960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f104961f;

    public xl(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.convert.yl ylVar, int i17) {
        this.f104959d = h0Var;
        this.f104960e = ylVar;
        this.f104961f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = this.f104959d;
        ((android.view.View) h0Var.f310123d).animate().alpha(0.0f).setDuration(1000L).setListener(new com.tencent.mm.plugin.finder.convert.wl(h0Var, this.f104960e, this.f104961f)).start();
    }
}
