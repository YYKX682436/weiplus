package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674;

/* renamed from: com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool */
/* loaded from: classes14.dex */
public class C26392xec756b22<T> {

    /* renamed from: DEFAULT_CORE_POOL_SIZE */
    private static final int f53098x77aeff82 = 2;
    private static final java.lang.String TAG = "[PlayerCore][TPDoubleQueueCachedPool]";

    /* renamed from: mCorePoolSize */
    private final int f53100x91da9c09;

    /* renamed from: mObjectLifecycleMgr */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22.ITPObjectLifecycleMgr<T> f53102x6c76827a;

    /* renamed from: mIdleCacheList */
    private final java.util.List<T> f53101xb814ba5f = new java.util.ArrayList();

    /* renamed from: mBusyCacheList */
    private final java.util.List<T> f53099xdd4941da = new java.util.ArrayList();

    /* renamed from: com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool$ITPObjectLifecycleMgr */
    /* loaded from: classes14.dex */
    public interface ITPObjectLifecycleMgr<T> {
        /* renamed from: create */
        T mo102555xaf65a0fc(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<T> c26392xec756b22);

        /* renamed from: release */
        void mo102556x41012807(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<T> c26392xec756b22, T t17);

        /* renamed from: reset */
        boolean mo102557x6761d4f(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22<T> c26392xec756b22, T t17);
    }

    public C26392xec756b22(int i17, int i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.drm.p3040x6762674.C26392xec756b22.ITPObjectLifecycleMgr<T> iTPObjectLifecycleMgr) {
        this.f53100x91da9c09 = i18 <= 0 ? 2 : i18;
        i17 = i17 <= 0 ? 2 : i17;
        this.f53102x6c76827a = iTPObjectLifecycleMgr;
        for (int i19 = 0; i19 < i17; i19++) {
            T mo102555xaf65a0fc = iTPObjectLifecycleMgr.mo102555xaf65a0fc(this);
            if (mo102555xaf65a0fc == null) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(3, TAG, "TPDoubleQueueCachedPool, createObject failed.");
            } else {
                this.f53101xb814ba5f.add(mo102555xaf65a0fc);
            }
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "TPDoubleQueueCachedPool init size:" + this.f53101xb814ba5f.size());
    }

    /* renamed from: allocObject */
    public synchronized T m102551x129336d4() {
        T remove;
        if (this.f53101xb814ba5f.isEmpty()) {
            remove = this.f53102x6c76827a.mo102555xaf65a0fc(this);
            if (remove == null) {
                return null;
            }
        } else {
            remove = this.f53101xb814ba5f.remove(0);
        }
        this.f53099xdd4941da.add(remove);
        return remove;
    }

    /* renamed from: freeObject */
    public synchronized void m102552xc2ce24cb(T t17) {
        this.f53099xdd4941da.remove(t17);
        this.f53102x6c76827a.mo102556x41012807(this, t17);
    }

    /* renamed from: recycleObject */
    public synchronized void m102553xdf4787b2(T t17) {
        if (this.f53099xdd4941da.remove(t17) && this.f53101xb814ba5f.size() < this.f53100x91da9c09 && this.f53102x6c76827a.mo102557x6761d4f(this, t17)) {
            this.f53101xb814ba5f.add(t17);
        } else {
            this.f53102x6c76827a.mo102556x41012807(this, t17);
        }
    }

    /* renamed from: release */
    public synchronized void m102554x41012807() {
        java.util.ListIterator<T> listIterator = this.f53099xdd4941da.listIterator();
        while (listIterator.hasNext()) {
            this.f53102x6c76827a.mo102556x41012807(this, listIterator.next());
            listIterator.remove();
        }
        java.util.ListIterator<T> listIterator2 = this.f53101xb814ba5f.listIterator();
        while (listIterator2.hasNext()) {
            this.f53102x6c76827a.mo102556x41012807(this, listIterator2.next());
            listIterator2.remove();
        }
        this.f53102x6c76827a = null;
    }
}
