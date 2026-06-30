package com.tencent.magicbrush.ui;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b'\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0019J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR0\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0 j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/tencent/magicbrush/ui/MBViewManager;", "", "Lgh/t;", "l", "Ljz5/f0;", "addSurfaceListenerForAllViews", "Lgh/l;", "addListener", "removeListener", "", "virtualElementId", "Lcom/tencent/magicbrush/ui/MagicBrushView;", "findOrNull", "find", "view", "add$lib_magicbrush_nano_release", "(Lcom/tencent/magicbrush/ui/MagicBrushView;)V", "add", "fromId", "(Lcom/tencent/magicbrush/ui/MagicBrushView;I)V", "remove$lib_magicbrush_nano_release", "remove", "clear$lib_magicbrush_nano_release", "()V", "clear", "Lkotlin/Function1;", "fn", "forEach", "", "toString", "idGenerator", "I", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "viewContainer", "Ljava/util/HashMap;", "Lhh/d;", "listeners", "Lhh/d;", "<init>", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class MBViewManager {
    private int idGenerator;
    private final java.util.HashMap<java.lang.Integer, com.tencent.magicbrush.ui.MagicBrushView> viewContainer = new java.util.HashMap<>();
    private final hh.d listeners = new hh.d();

    public final void add$lib_magicbrush_nano_release(com.tencent.magicbrush.ui.MagicBrushView view) {
        kotlin.jvm.internal.o.g(view, "view");
        add$lib_magicbrush_nano_release(view, -1);
    }

    public final void addListener(gh.l l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        this.listeners.a(l17);
    }

    public final void addSurfaceListenerForAllViews(gh.t l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        this.listeners.a(new gh.n(l17));
    }

    public final synchronized void clear$lib_magicbrush_nano_release() {
        this.viewContainer.clear();
        this.listeners.b();
    }

    public final synchronized com.tencent.magicbrush.ui.MagicBrushView find(int virtualElementId) {
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView;
        magicBrushView = this.viewContainer.get(java.lang.Integer.valueOf(virtualElementId));
        kotlin.jvm.internal.o.d(magicBrushView);
        return magicBrushView;
    }

    public final synchronized com.tencent.magicbrush.ui.MagicBrushView findOrNull(int virtualElementId) {
        return this.viewContainer.get(java.lang.Integer.valueOf(virtualElementId));
    }

    public final void forEach(yz5.l fn6) {
        kotlin.jvm.internal.o.g(fn6, "fn");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            for (com.tencent.magicbrush.ui.MagicBrushView v17 : this.viewContainer.values()) {
                kotlin.jvm.internal.o.f(v17, "v");
                arrayList.add(v17);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fn6.invoke(it.next());
        }
    }

    public final void remove$lib_magicbrush_nano_release(com.tencent.magicbrush.ui.MagicBrushView view) {
        kotlin.jvm.internal.o.g(view, "view");
        synchronized (this) {
            int virtualElementId = view.getVirtualElementId();
            if (!this.viewContainer.containsKey(java.lang.Integer.valueOf(virtualElementId))) {
                java.lang.String format = java.lang.String.format("VirtualElementId error. current [%s] request [%d]", java.util.Arrays.copyOf(new java.lang.Object[]{toString(), java.lang.Integer.valueOf(virtualElementId)}, 2));
                kotlin.jvm.internal.o.f(format, "format(...)");
                throw new java.lang.IllegalStateException(format.toString());
            }
            this.viewContainer.remove(java.lang.Integer.valueOf(virtualElementId));
        }
        this.listeners.c(new gh.o(view));
    }

    public final void removeListener(gh.l l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        hh.d dVar = this.listeners;
        synchronized (dVar.f281433a) {
            ((java.util.ArrayList) dVar.f281433a).remove(l17);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ViewManager(");
        sb6.append(hashCode());
        sb6.append(")");
        synchronized (this) {
            java.util.Set<java.lang.Integer> keySet = this.viewContainer.keySet();
            kotlin.jvm.internal.o.f(keySet, "viewContainer.keys");
            sb6.append(kz5.n0.R0(keySet));
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "result.toString()");
        return sb7;
    }

    public final void add$lib_magicbrush_nano_release(com.tencent.magicbrush.ui.MagicBrushView view, int fromId) {
        kotlin.jvm.internal.o.g(view, "view");
        synchronized (this) {
            if (fromId < 0) {
                try {
                    fromId = this.idGenerator;
                    this.idGenerator = fromId + 1;
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            this.viewContainer.put(java.lang.Integer.valueOf(fromId), view);
        }
        view.setVirtualElementId$lib_magicbrush_nano_release(fromId);
        this.listeners.c(new gh.m(view));
    }
}
