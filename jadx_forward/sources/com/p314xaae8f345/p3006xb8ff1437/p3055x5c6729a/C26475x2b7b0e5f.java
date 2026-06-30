package com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a;

/* renamed from: com.tencent.thumbplayer.event.TPPlayerEventPublisher */
/* loaded from: classes15.dex */
public class C26475x2b7b0e5f {
    private static final java.lang.String TAG = "TPPlayerEventPublisher";

    /* renamed from: mReceiverList */
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24>> f53975x6a90983a = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: doRemoveReceiver */
    private void m103219x48270bfe(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24 interfaceC26472xf18ada24) {
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24>> it = this.f53975x6a90983a.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().get() == interfaceC26472xf18ada24) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            this.f53975x6a90983a.remove(i17);
        }
    }

    /* renamed from: addEventReceiver */
    public void m103220x5a420b88(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24 interfaceC26472xf18ada24) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24>> copyOnWriteArrayList;
        if (interfaceC26472xf18ada24 == null || (copyOnWriteArrayList = this.f53975x6a90983a) == null || copyOnWriteArrayList.contains(interfaceC26472xf18ada24)) {
            return;
        }
        this.f53975x6a90983a.add(new java.lang.ref.WeakReference<>(interfaceC26472xf18ada24));
    }

    /* renamed from: getReceiverSize */
    public int m103221x33f14106() {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24>> copyOnWriteArrayList = this.f53975x6a90983a;
        if (copyOnWriteArrayList == null) {
            return 0;
        }
        return copyOnWriteArrayList.size();
    }

    /* renamed from: publishEvent */
    public void m103222x8f7db6cb(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.BaseEventInfo baseEventInfo) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24>> copyOnWriteArrayList = this.f53975x6a90983a;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24 interfaceC26472xf18ada24 = it.next().get();
                if (interfaceC26472xf18ada24 != null) {
                    interfaceC26472xf18ada24.mo103162xaf8c47fb(baseEventInfo);
                }
            }
        }
    }

    /* renamed from: release */
    public void m103223x41012807() {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24>> copyOnWriteArrayList = this.f53975x6a90983a;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
    }

    /* renamed from: removeEventReceiver */
    public void m103224x5f48b485(com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.InterfaceC26472xf18ada24 interfaceC26472xf18ada24) {
        if (interfaceC26472xf18ada24 == null || this.f53975x6a90983a == null) {
            return;
        }
        m103219x48270bfe(interfaceC26472xf18ada24);
    }
}
