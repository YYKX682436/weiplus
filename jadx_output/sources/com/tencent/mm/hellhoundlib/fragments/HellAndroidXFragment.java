package com.tencent.mm.hellhoundlib.fragments;

/* loaded from: classes13.dex */
public class HellAndroidXFragment extends androidx.fragment.app.Fragment {
    private android.util.SparseArray<java.lang.Object> mHellTags;

    public java.lang.Object getHellTag(int i17) {
        android.util.SparseArray<java.lang.Object> sparseArray = this.mHellTags;
        if (sparseArray != null) {
            return sparseArray.get(i17);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        xj0.a.h().c(this, 7);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        xj0.a.h().c(this, 13);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        xj0.a.h().c(this, 12);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z17) {
        super.onHiddenChanged(z17);
        xj0.a h17 = xj0.a.h();
        h17.getClass();
        if (h17.f454773a == null || !nz1.a.f341541b) {
            return;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nz1.a.f341540a).iterator();
        while (it.hasNext()) {
            try {
                ((nz1.b) it.next()).i(this, z17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.FragmentLifecycleTracker", e17.getMessage());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        xj0.a.h().c(this, 9);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        xj0.a.h().c(this, 8);
    }

    public void setHellTag(int i17, java.lang.Object obj) {
        if (this.mHellTags == null) {
            this.mHellTags = new android.util.SparseArray<>(2);
        }
        this.mHellTags.put(i17, obj);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        super.setUserVisibleHint(z17);
        xj0.a h17 = xj0.a.h();
        h17.getClass();
        if (h17.f454773a == null || !nz1.a.f341541b) {
            return;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) nz1.a.f341540a).iterator();
        while (it.hasNext()) {
            try {
                ((nz1.b) it.next()).F(this, z17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.FragmentLifecycleTracker", e17.getMessage());
            }
        }
    }
}
