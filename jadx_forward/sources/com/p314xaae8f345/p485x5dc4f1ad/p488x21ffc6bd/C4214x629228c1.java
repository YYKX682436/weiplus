package com.p314xaae8f345.p485x5dc4f1ad.p488x21ffc6bd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"Lcom/tencent/magicbrush/internal/EventDispatcher;", "", "", "exception", "stack", "", "contextId", "Ljz5/f0;", "onJSError", "output", "onConsole", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.tencent.magicbrush.internal.EventDispatcher */
/* loaded from: classes7.dex */
public final class C4214x629228c1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f130169a;

    public C4214x629228c1(com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad magicbrush) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(magicbrush, "magicbrush");
        this.f130169a = magicbrush;
    }

    /* renamed from: onConsole */
    public final void m34827x885ce678(java.lang.String output) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(output, "output");
        try {
            this.f130169a.f130121l.c(new fh.a(output));
        } catch (java.lang.Exception e17) {
            ah.i.c("MagicBrush", e17, "dispatch event failed", new java.lang.Object[0]);
        }
    }

    /* renamed from: onJSError */
    public final void m34828xc89ea780(java.lang.String exception, java.lang.String stack, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
        try {
            this.f130169a.f130121l.c(new fh.b(exception, stack, i17));
        } catch (java.lang.Exception e17) {
            ah.i.c("MagicBrush", e17, "dispatch event failed", new java.lang.Object[0]);
        }
    }
}
