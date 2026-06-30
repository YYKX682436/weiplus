package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.feature.performance.adpf.k2 f67439a = new com.tencent.mm.feature.performance.adpf.k2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f67440b = jz5.h.b(com.tencent.mm.feature.performance.adpf.g2.f67422d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f67441c = jz5.h.b(com.tencent.mm.feature.performance.adpf.i2.f67429d);

    public final com.tencent.mm.feature.performance.adpf.IAdpfState a(final java.lang.String stateName, final com.tencent.matrix.lifecycle.IStatefulOwner statefulOwner) {
        com.tencent.mm.feature.performance.adpf.IAdpfState iAdpfState;
        kotlin.jvm.internal.o.g(stateName, "stateName");
        kotlin.jvm.internal.o.g(statefulOwner, "statefulOwner");
        synchronized (c()) {
            com.tencent.mm.feature.performance.adpf.k2 k2Var = f67439a;
            if (k2Var.c().containsKey(stateName)) {
                throw new java.lang.IllegalStateException("Already created: ".concat(stateName).toString());
            }
            iAdpfState = new com.tencent.mm.feature.performance.adpf.IAdpfState() { // from class: com.tencent.mm.feature.performance.adpf.IAdpfState$Companion$createCompositeState$1$1
                @Override // com.tencent.mm.feature.performance.adpf.IAdpfState, com.tencent.matrix.lifecycle.IStatefulOwner, com.tencent.matrix.lifecycle.l
                public boolean active() {
                    return statefulOwner.active();
                }

                @Override // com.tencent.mm.feature.performance.adpf.IAdpfState
                /* renamed from: getName, reason: from getter */
                public java.lang.String get$stateName() {
                    return stateName;
                }

                @Override // com.tencent.mm.feature.performance.adpf.IAdpfState, com.tencent.matrix.lifecycle.IStatefulOwner
                public void observeForever(com.tencent.matrix.lifecycle.k observer) {
                    kotlin.jvm.internal.o.g(observer, "observer");
                    statefulOwner.observeForever(observer);
                }

                @Override // com.tencent.mm.feature.performance.adpf.IAdpfState, com.tencent.matrix.lifecycle.IStatefulOwner
                public void observeWithLifecycle(androidx.lifecycle.y lifecycleOwner, com.tencent.matrix.lifecycle.k observer) {
                    kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
                    kotlin.jvm.internal.o.g(observer, "observer");
                    statefulOwner.observeWithLifecycle(lifecycleOwner, observer);
                }

                @Override // com.tencent.mm.feature.performance.adpf.IAdpfState, com.tencent.matrix.lifecycle.IStatefulOwner
                public void removeObserver(com.tencent.matrix.lifecycle.k observer) {
                    kotlin.jvm.internal.o.g(observer, "observer");
                    statefulOwner.removeObserver(observer);
                }
            };
            iAdpfState.observeForever(new com.tencent.mm.feature.performance.adpf.j2(iAdpfState));
            k2Var.c().put(stateName, iAdpfState);
        }
        return iAdpfState;
    }

    public final com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState b(java.lang.String stateName) {
        com.tencent.mm.feature.performance.adpf.AdpfStateImpl adpfStateImpl;
        kotlin.jvm.internal.o.g(stateName, "stateName");
        synchronized (c()) {
            com.tencent.mm.feature.performance.adpf.k2 k2Var = f67439a;
            if (k2Var.c().containsKey(stateName)) {
                throw new java.lang.IllegalStateException("Already created: ".concat(stateName).toString());
            }
            adpfStateImpl = new com.tencent.mm.feature.performance.adpf.AdpfStateImpl(stateName);
            adpfStateImpl.observeForever(new com.tencent.mm.feature.performance.adpf.j2(adpfStateImpl));
            k2Var.c().put(stateName, adpfStateImpl);
        }
        return adpfStateImpl;
    }

    public final java.util.Map c() {
        return (java.util.Map) ((jz5.n) f67440b).getValue();
    }

    public final com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState d(java.lang.String stateName) {
        kotlin.jvm.internal.o.g(stateName, "stateName");
        return e(stateName).asMutable();
    }

    public final com.tencent.mm.feature.performance.adpf.IAdpfState e(java.lang.String stateName) {
        com.tencent.mm.feature.performance.adpf.IAdpfState iAdpfState;
        kotlin.jvm.internal.o.g(stateName, "stateName");
        synchronized (c()) {
            java.lang.Object obj = f67439a.c().get(stateName);
            kotlin.jvm.internal.o.d(obj);
            iAdpfState = (com.tencent.mm.feature.performance.adpf.IAdpfState) obj;
        }
        return iAdpfState;
    }
}
