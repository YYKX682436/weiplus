package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.DiscardableReferencePool */
/* loaded from: classes13.dex */
public class C29299x4d78f60f {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73256x7118e671 = false;

    /* renamed from: mPool */
    private final java.util.Set<org.p3343x72743996.p3344x2e06d1.C29299x4d78f60f.DiscardableReference<?>> f73257x6260e29 = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    /* renamed from: org.chromium.base.DiscardableReferencePool$DiscardableReference */
    /* loaded from: classes13.dex */
    public static class DiscardableReference<T> {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f73258x7118e671 = false;

        /* renamed from: mPayload */
        private T f73259x6f349461;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: discard */
        public void m152373x639f089e() {
            this.f73259x6f349461 = null;
        }

        public T get() {
            return this.f73259x6f349461;
        }

        private DiscardableReference(T t17) {
            this.f73259x6f349461 = t17;
        }
    }

    /* renamed from: drain */
    public void m152371x5b679f8() {
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29299x4d78f60f.DiscardableReference<?>> it = this.f73257x6260e29.iterator();
        while (it.hasNext()) {
            it.next().m152373x639f089e();
        }
        this.f73257x6260e29.clear();
    }

    public <T> org.p3343x72743996.p3344x2e06d1.C29299x4d78f60f.DiscardableReference<T> put(T t17) {
        org.p3343x72743996.p3344x2e06d1.C29299x4d78f60f.DiscardableReference<T> discardableReference = new org.p3343x72743996.p3344x2e06d1.C29299x4d78f60f.DiscardableReference<>(t17);
        this.f73257x6260e29.add(discardableReference);
        return discardableReference;
    }

    /* renamed from: remove */
    public void m152372xc84af884(org.p3343x72743996.p3344x2e06d1.C29299x4d78f60f.DiscardableReference<?> discardableReference) {
        if (this.f73257x6260e29.contains(discardableReference)) {
            discardableReference.m152373x639f089e();
            this.f73257x6260e29.remove(discardableReference);
        }
    }
}
