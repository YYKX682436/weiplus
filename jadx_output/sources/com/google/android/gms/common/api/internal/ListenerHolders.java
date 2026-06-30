package com.google.android.gms.common.api.internal;

/* loaded from: classes13.dex */
public class ListenerHolders {
    private final java.util.Set zaa = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(L l17, android.os.Looper looper, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l17, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.ListenerHolder<>(looper, l17, str);
    }

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> createListenerKey(L l17, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l17, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<>(l17, str);
    }

    public final com.google.android.gms.common.api.internal.ListenerHolder zaa(java.lang.Object obj, android.os.Looper looper, java.lang.String str) {
        java.util.Set set = this.zaa;
        com.google.android.gms.common.api.internal.ListenerHolder createListenerHolder = createListenerHolder(obj, looper, "NO_TYPE");
        set.add(createListenerHolder);
        return createListenerHolder;
    }

    public final void zab() {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.ListenerHolder) it.next()).clear();
        }
        this.zaa.clear();
    }

    public static <L> com.google.android.gms.common.api.internal.ListenerHolder<L> createListenerHolder(L l17, java.util.concurrent.Executor executor, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l17, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(executor, "Executor must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.ListenerHolder<>(executor, l17, str);
    }
}
