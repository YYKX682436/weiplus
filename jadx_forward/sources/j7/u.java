package j7;

/* loaded from: classes13.dex */
public final class u implements j7.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f379561d = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    @Override // j7.k
    /* renamed from: onDestroy */
    public void mo15461xac79a11b() {
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f379561d)).iterator();
        while (it.hasNext()) {
            ((n7.h) it.next()).mo15461xac79a11b();
        }
    }

    @Override // j7.k
    /* renamed from: onStart */
    public void mo15462xb05099c3() {
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f379561d)).iterator();
        while (it.hasNext()) {
            ((n7.h) it.next()).mo15462xb05099c3();
        }
    }

    @Override // j7.k
    /* renamed from: onStop */
    public void mo15463xc39f8281() {
        java.util.Iterator it = ((java.util.ArrayList) q7.p.d(this.f379561d)).iterator();
        while (it.hasNext()) {
            ((n7.h) it.next()).mo15463xc39f8281();
        }
    }
}
