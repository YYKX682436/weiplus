package com.tencent.magicbrush.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"Lcom/tencent/magicbrush/internal/EventDispatcher;", "", "", "exception", "stack", "", "contextId", "Ljz5/f0;", "onJSError", "output", "onConsole", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class EventDispatcher {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.magicbrush.MagicBrush f48636a;

    public EventDispatcher(com.tencent.magicbrush.MagicBrush magicbrush) {
        kotlin.jvm.internal.o.g(magicbrush, "magicbrush");
        this.f48636a = magicbrush;
    }

    public final void onConsole(java.lang.String output) {
        kotlin.jvm.internal.o.g(output, "output");
        try {
            this.f48636a.f48588l.c(new fh.a(output));
        } catch (java.lang.Exception e17) {
            ah.i.c("MagicBrush", e17, "dispatch event failed", new java.lang.Object[0]);
        }
    }

    public final void onJSError(java.lang.String exception, java.lang.String stack, int i17) {
        kotlin.jvm.internal.o.g(exception, "exception");
        kotlin.jvm.internal.o.g(stack, "stack");
        try {
            this.f48636a.f48588l.c(new fh.b(exception, stack, i17));
        } catch (java.lang.Exception e17) {
            ah.i.c("MagicBrush", e17, "dispatch event failed", new java.lang.Object[0]);
        }
    }
}
