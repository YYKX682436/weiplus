package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010%\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR,\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/accessibility/core/ViewTagManager;", "", "Landroidx/lifecycle/y;", "owner", "Ljz5/f0;", "addObserver", "Landroid/view/View;", "view", "Lcom/tencent/mm/accessibility/base/ViewTag;", "getTagData", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "tagMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.ViewTagManager */
/* loaded from: classes11.dex */
public final class C4876xaa469f58 {
    private static final java.lang.String TAG = "MicroMsg.Acc.ViewTagManager";

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58 f21085x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58();
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Map<java.lang.Integer, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695>> tagMap = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: $stable */
    public static final int f21084x3b2de05f = 8;

    private C4876xaa469f58() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.accessibility.core.ViewTagManager$addObserver$1$observer$1] */
    /* renamed from: addObserver */
    private final void m42516xdab4fe97(final p012xc85e97e9.p093xedfae76a.y yVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "wait synchronized " + yVar);
        synchronized (this) {
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Map<java.lang.Integer, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695>> concurrentHashMap = tagMap;
            if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(yVar.hashCode()))) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "addObserver init " + yVar);
            final ?? r07 = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.accessibility.core.ViewTagManager$addObserver$1$observer$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m42518xac79a11b() {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2;
                    concurrentHashMap2 = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.tagMap;
                    concurrentHashMap2.remove(java.lang.Integer.valueOf(p012xc85e97e9.p093xedfae76a.y.this.hashCode()));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Acc.ViewTagManager", "removeObserver onDestroy: " + p012xc85e97e9.p093xedfae76a.y.this);
                }
            };
            ((ku5.t0) ku5.t0.f394148d).D(new java.lang.Runnable() { // from class: com.tencent.mm.accessibility.core.ViewTagManager$addObserver$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Acc.ViewTagManager", "addObserver in uiAtFront:" + p012xc85e97e9.p093xedfae76a.y.this + ' ' + p012xc85e97e9.p093xedfae76a.y.this.mo273xed6858b4().b().name());
                    p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = p012xc85e97e9.p093xedfae76a.y.this.mo273xed6858b4();
                    com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4878xea1804ef c4878xea1804ef = r07;
                    p012xc85e97e9.p093xedfae76a.y yVar2 = p012xc85e97e9.p093xedfae76a.y.this;
                    if (mo273xed6858b4.b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
                        mo273xed6858b4.a(c4878xea1804ef);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Acc.ViewTagManager", "addObserver in uiAtFront but destroy " + yVar2);
                    concurrentHashMap2 = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.tagMap;
                    concurrentHashMap2.remove(java.lang.Integer.valueOf(yVar2.hashCode()));
                }
            });
            concurrentHashMap.put(java.lang.Integer.valueOf(yVar.hashCode()), new java.util.LinkedHashMap());
        }
    }

    /* renamed from: getTagData */
    public final com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e(android.view.View view) {
        java.util.Map<java.lang.Integer, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695> putIfAbsent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.nwb);
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 c4853x7e4b6695 = tag instanceof com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 ? (com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695) tag : null;
        if (c4853x7e4b6695 != null) {
            return c4853x7e4b6695;
        }
        java.lang.Object context = view.getContext();
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar == null) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.Map<java.lang.Integer, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695>> concurrentHashMap = tagMap;
        if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(yVar.hashCode()))) {
            m42516xdab4fe97(yVar);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(yVar.hashCode());
        java.util.Map<java.lang.Integer, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695> map = concurrentHashMap.get(valueOf);
        if (map == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (map = new java.util.LinkedHashMap<>()))) != null) {
            map = putIfAbsent;
        }
        java.util.Map<java.lang.Integer, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695> map2 = map;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(view.hashCode());
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 c4853x7e4b66952 = map2.get(valueOf2);
        if (c4853x7e4b66952 == null) {
            c4853x7e4b66952 = new com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695();
            map2.put(valueOf2, c4853x7e4b66952);
        }
        return c4853x7e4b66952;
    }
}
