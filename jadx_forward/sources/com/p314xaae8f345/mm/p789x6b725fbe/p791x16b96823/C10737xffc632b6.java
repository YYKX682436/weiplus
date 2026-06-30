package com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823;

/* renamed from: com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment */
/* loaded from: classes13.dex */
public class C10737xffc632b6 extends p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 {

    /* renamed from: mHellTags */
    private android.util.SparseArray<java.lang.Object> f29250xf5b23883;

    /* renamed from: getHellTag */
    public java.lang.Object m46166x6dd30ee7(int i17) {
        android.util.SparseArray<java.lang.Object> sparseArray = this.f29250xf5b23883;
        if (sparseArray != null) {
            return sparseArray.get(i17);
        }
        return null;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        xj0.a.h().c(this, 7);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        xj0.a.h().c(this, 13);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        xj0.a.h().c(this, 12);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onHiddenChanged */
    public void mo7506x87316e0b(boolean z17) {
        super.mo7506x87316e0b(z17);
        xj0.a h17 = xj0.a.h();
        h17.getClass();
        if (h17.f536306a == null || !nz1.a.f423074b) {
            return;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nz1.a.f423073a).iterator();
        while (it.hasNext()) {
            try {
                ((nz1.b) it.next()).i(this, z17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.FragmentLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        xj0.a.h().c(this, 9);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        xj0.a.h().c(this, 8);
    }

    /* renamed from: setHellTag */
    public void m46167xe1445c5b(int i17, java.lang.Object obj) {
        if (this.f29250xf5b23883 == null) {
            this.f29250xf5b23883 = new android.util.SparseArray<>(2);
        }
        this.f29250xf5b23883.put(i17, obj);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: setUserVisibleHint */
    public void mo7583x951b248c(boolean z17) {
        super.mo7583x951b248c(z17);
        xj0.a h17 = xj0.a.h();
        h17.getClass();
        if (h17.f536306a == null || !nz1.a.f423074b) {
            return;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nz1.a.f423073a).iterator();
        while (it.hasNext()) {
            try {
                ((nz1.b) it.next()).F(this, z17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.FragmentLifecycleTracker", e17.getMessage());
            }
        }
    }
}
