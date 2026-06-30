package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010%\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR,\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/accessibility/core/ViewTagManager;", "", "Landroidx/lifecycle/y;", "owner", "Ljz5/f0;", "addObserver", "Landroid/view/View;", "view", "Lcom/tencent/mm/accessibility/base/ViewTag;", "getTagData", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "tagMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ViewTagManager {
    private static final java.lang.String TAG = "MicroMsg.Acc.ViewTagManager";
    public static final com.tencent.mm.accessibility.core.ViewTagManager INSTANCE = new com.tencent.mm.accessibility.core.ViewTagManager();
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Map<java.lang.Integer, com.tencent.mm.accessibility.base.ViewTag>> tagMap = new java.util.concurrent.ConcurrentHashMap<>();
    public static final int $stable = 8;

    private ViewTagManager() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.accessibility.core.ViewTagManager$addObserver$1$observer$1] */
    private final void addObserver(final androidx.lifecycle.y yVar) {
        com.tencent.mars.xlog.Log.i(TAG, "wait synchronized " + yVar);
        synchronized (this) {
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Map<java.lang.Integer, com.tencent.mm.accessibility.base.ViewTag>> concurrentHashMap = tagMap;
            if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(yVar.hashCode()))) {
                return;
            }
            com.tencent.mars.xlog.Log.i(TAG, "addObserver init " + yVar);
            final ?? r07 = new androidx.lifecycle.x() { // from class: com.tencent.mm.accessibility.core.ViewTagManager$addObserver$1$observer$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2;
                    concurrentHashMap2 = com.tencent.mm.accessibility.core.ViewTagManager.tagMap;
                    concurrentHashMap2.remove(java.lang.Integer.valueOf(androidx.lifecycle.y.this.hashCode()));
                    com.tencent.mars.xlog.Log.i("MicroMsg.Acc.ViewTagManager", "removeObserver onDestroy: " + androidx.lifecycle.y.this);
                }
            };
            ((ku5.t0) ku5.t0.f312615d).D(new java.lang.Runnable() { // from class: com.tencent.mm.accessibility.core.ViewTagManager$addObserver$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Acc.ViewTagManager", "addObserver in uiAtFront:" + androidx.lifecycle.y.this + ' ' + androidx.lifecycle.y.this.mo133getLifecycle().b().name());
                    androidx.lifecycle.o mo133getLifecycle = androidx.lifecycle.y.this.mo133getLifecycle();
                    com.tencent.mm.accessibility.core.ViewTagManager$addObserver$1$observer$1 viewTagManager$addObserver$1$observer$1 = r07;
                    androidx.lifecycle.y yVar2 = androidx.lifecycle.y.this;
                    if (mo133getLifecycle.b() != androidx.lifecycle.n.DESTROYED) {
                        mo133getLifecycle.a(viewTagManager$addObserver$1$observer$1);
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Acc.ViewTagManager", "addObserver in uiAtFront but destroy " + yVar2);
                    concurrentHashMap2 = com.tencent.mm.accessibility.core.ViewTagManager.tagMap;
                    concurrentHashMap2.remove(java.lang.Integer.valueOf(yVar2.hashCode()));
                }
            });
            concurrentHashMap.put(java.lang.Integer.valueOf(yVar.hashCode()), new java.util.LinkedHashMap());
        }
    }

    public final com.tencent.mm.accessibility.base.ViewTag getTagData(android.view.View view) {
        java.util.Map<java.lang.Integer, com.tencent.mm.accessibility.base.ViewTag> putIfAbsent;
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.nwb);
        com.tencent.mm.accessibility.base.ViewTag viewTag = tag instanceof com.tencent.mm.accessibility.base.ViewTag ? (com.tencent.mm.accessibility.base.ViewTag) tag : null;
        if (viewTag != null) {
            return viewTag;
        }
        java.lang.Object context = view.getContext();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar == null) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Map<java.lang.Integer, com.tencent.mm.accessibility.base.ViewTag>> concurrentHashMap = tagMap;
        if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(yVar.hashCode()))) {
            addObserver(yVar);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(yVar.hashCode());
        java.util.Map<java.lang.Integer, com.tencent.mm.accessibility.base.ViewTag> map = concurrentHashMap.get(valueOf);
        if (map == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (map = new java.util.LinkedHashMap<>()))) != null) {
            map = putIfAbsent;
        }
        java.util.Map<java.lang.Integer, com.tencent.mm.accessibility.base.ViewTag> map2 = map;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(view.hashCode());
        com.tencent.mm.accessibility.base.ViewTag viewTag2 = map2.get(valueOf2);
        if (viewTag2 == null) {
            viewTag2 = new com.tencent.mm.accessibility.base.ViewTag();
            map2.put(valueOf2, viewTag2);
        }
        return viewTag2;
    }
}
