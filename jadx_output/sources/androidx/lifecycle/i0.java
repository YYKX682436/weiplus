package androidx.lifecycle;

/* loaded from: classes13.dex */
public class i0 extends androidx.lifecycle.j0 {
    private q.h mSources = new q.h();

    public void addSource(androidx.lifecycle.g0 g0Var, androidx.lifecycle.k0 k0Var) {
        androidx.lifecycle.h0 h0Var = new androidx.lifecycle.h0(g0Var, k0Var);
        androidx.lifecycle.h0 h0Var2 = (androidx.lifecycle.h0) this.mSources.e(g0Var, h0Var);
        if (h0Var2 != null && h0Var2.f11628e != k0Var) {
            throw new java.lang.IllegalArgumentException("This source was already added with the different observer");
        }
        if (h0Var2 == null && hasActiveObservers()) {
            g0Var.observeForever(h0Var);
        }
    }

    @Override // androidx.lifecycle.g0
    public void onActive() {
        java.util.Iterator it = this.mSources.iterator();
        while (true) {
            q.f fVar = (q.f) it;
            if (!fVar.hasNext()) {
                return;
            }
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) ((java.util.Map.Entry) fVar.next()).getValue();
            h0Var.f11627d.observeForever(h0Var);
        }
    }

    @Override // androidx.lifecycle.g0
    public void onInactive() {
        java.util.Iterator it = this.mSources.iterator();
        while (true) {
            q.f fVar = (q.f) it;
            if (!fVar.hasNext()) {
                return;
            }
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) ((java.util.Map.Entry) fVar.next()).getValue();
            h0Var.f11627d.removeObserver(h0Var);
        }
    }

    public <S> void removeSource(androidx.lifecycle.g0 g0Var) {
        androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.mSources.g(g0Var);
        if (h0Var != null) {
            h0Var.f11627d.removeObserver(h0Var);
        }
    }
}
