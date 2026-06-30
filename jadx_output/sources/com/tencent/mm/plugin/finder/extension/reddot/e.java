package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class e extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.g f105477a;

    public e(com.tencent.mm.plugin.finder.extension.reddot.g gVar) {
        this.f105477a = gVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.finder.extension.reddot.g gVar;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var;
        kotlin.jvm.internal.o.g(view, "view");
        if (!z17 || (z9Var = (gVar = this.f105477a).f105529c) == null) {
            return;
        }
        gVar.e(1, z9Var != null ? z9Var.f105329c : null, z9Var != null ? z9Var.f105328b : null);
    }
}
