package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes14.dex */
public class c implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback f65731d;

    public c(com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, com.tencent.mm.feature.ecs.nirvana.input.b bVar) {
        this.f65731d = imeSyncDeferringInsetsCallback;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        com.tencent.mm.feature.ecs.nirvana.input.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f65731d;
        imeSyncDeferringInsetsCallback.view = view;
        if (imeSyncDeferringInsetsCallback.needsSave) {
            imeSyncDeferringInsetsCallback.lastWindowInsets = windowInsets;
            imeSyncDeferringInsetsCallback.needsSave = false;
        }
        return imeSyncDeferringInsetsCallback.animating ? android.view.WindowInsets.CONSUMED : view.onApplyWindowInsets(windowInsets);
    }
}
