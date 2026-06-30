package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.ObserverList */
/* loaded from: classes13.dex */
public class C29324xf28570b4<E> implements java.lang.Iterable<E> {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73342x7118e671 = false;

    /* renamed from: mCount */
    private int f73343xbde49ca2;

    /* renamed from: mIterationDepth */
    private int f73345x1e9fb7b3;

    /* renamed from: mNeedsCompact */
    private boolean f73346x35e0a6d3;

    /* renamed from: mObservers */
    public final java.util.List<E> f73347xfeda5270 = new java.util.ArrayList();

    /* renamed from: mEnableThreadAsserts */
    private boolean f73344x81dde613 = true;

    /* renamed from: mThreadChecker */
    private final org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.ThreadChecker f73348x8ec462de = new org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.ThreadChecker();

    /* renamed from: org.chromium.base.ObserverList$ObserverListIterator */
    /* loaded from: classes13.dex */
    public class ObserverListIterator implements org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.RewindableIterator<E> {

        /* renamed from: mIndex */
        private int f73349xbe387465;

        /* renamed from: mIsExhausted */
        private boolean f73350x4a8c1292;

        /* renamed from: mListEndMarker */
        private int f73351x8249028a;

        /* renamed from: compactListIfNeeded */
        private void m152540xc8e540b3() {
            if (this.f73350x4a8c1292) {
                return;
            }
            this.f73350x4a8c1292 = true;
            org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.m152529x3494b9d7();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.f73344x81dde613) {
                org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.f73348x8ec462de.m152672xb702e421();
            }
            int i17 = this.f73349xbe387465;
            while (i17 < this.f73351x8249028a && org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.m152530xee7eb59f(i17) == null) {
                i17++;
            }
            if (i17 < this.f73351x8249028a) {
                return true;
            }
            m152540xc8e540b3();
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            if (org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.f73344x81dde613) {
                org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.f73348x8ec462de.m152672xb702e421();
            }
            while (true) {
                int i17 = this.f73349xbe387465;
                if (i17 >= this.f73351x8249028a || org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.m152530xee7eb59f(i17) != null) {
                    break;
                }
                this.f73349xbe387465++;
            }
            int i18 = this.f73349xbe387465;
            if (i18 >= this.f73351x8249028a) {
                m152540xc8e540b3();
                throw new java.util.NoSuchElementException();
            }
            org.p3343x72743996.p3344x2e06d1.C29324xf28570b4 c29324xf28570b4 = org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this;
            this.f73349xbe387465 = i18 + 1;
            return (E) c29324xf28570b4.m152530xee7eb59f(i18);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.RewindableIterator
        /* renamed from: rewind */
        public void mo152541xc84f6cbb() {
            if (org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.f73344x81dde613) {
                org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.f73348x8ec462de.m152672xb702e421();
            }
            m152540xc8e540b3();
            org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.m152531x6aadd735();
            this.f73351x8249028a = org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.m152527xfbf514ba();
            this.f73350x4a8c1292 = false;
            this.f73349xbe387465 = 0;
        }

        private ObserverListIterator() {
            org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.m152531x6aadd735();
            this.f73351x8249028a = org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.this.m152527xfbf514ba();
        }
    }

    /* renamed from: org.chromium.base.ObserverList$RewindableIterator */
    /* loaded from: classes6.dex */
    public interface RewindableIterator<E> extends java.util.Iterator<E> {
        /* renamed from: rewind */
        void mo152541xc84f6cbb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: capacity */
    public int m152527xfbf514ba() {
        return this.f73347xfeda5270.size();
    }

    /* renamed from: compact */
    private void m152528x38a73b23() {
        for (int size = this.f73347xfeda5270.size() - 1; size >= 0; size--) {
            if (this.f73347xfeda5270.get(size) == null) {
                this.f73347xfeda5270.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decrementIterationDepthAndCompactIfNeeded */
    public void m152529x3494b9d7() {
        int i17 = this.f73345x1e9fb7b3 - 1;
        this.f73345x1e9fb7b3 = i17;
        if (i17 <= 0 && this.f73346x35e0a6d3) {
            this.f73346x35e0a6d3 = false;
            m152528x38a73b23();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getObserverAt */
    public E m152530xee7eb59f(int i17) {
        return this.f73347xfeda5270.get(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: incrementIterationDepth */
    public void m152531x6aadd735() {
        this.f73345x1e9fb7b3++;
    }

    /* renamed from: addObserver */
    public boolean m152532xdab4fe97(E e17) {
        if (this.f73344x81dde613) {
            this.f73348x8ec462de.m152672xb702e421();
        }
        if (e17 == null || this.f73347xfeda5270.contains(e17)) {
            return false;
        }
        this.f73347xfeda5270.add(e17);
        this.f73343xbde49ca2++;
        return true;
    }

    /* renamed from: clear */
    public void m152533x5a5b64d() {
        if (this.f73344x81dde613) {
            this.f73348x8ec462de.m152672xb702e421();
        }
        this.f73343xbde49ca2 = 0;
        if (this.f73345x1e9fb7b3 == 0) {
            this.f73347xfeda5270.clear();
            return;
        }
        int size = this.f73347xfeda5270.size();
        this.f73346x35e0a6d3 |= size != 0;
        for (int i17 = 0; i17 < size; i17++) {
            this.f73347xfeda5270.set(i17, null);
        }
    }

    /* renamed from: disableThreadAsserts */
    public void m152534x1ffc867b() {
        this.f73344x81dde613 = false;
    }

    /* renamed from: hasObserver */
    public boolean m152535xc01c0f90(E e17) {
        if (this.f73344x81dde613) {
            this.f73348x8ec462de.m152672xb702e421();
        }
        return this.f73347xfeda5270.contains(e17);
    }

    /* renamed from: isEmpty */
    public boolean m152536x7aab3243() {
        if (this.f73344x81dde613) {
            this.f73348x8ec462de.m152672xb702e421();
        }
        return this.f73343xbde49ca2 == 0;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        if (this.f73344x81dde613) {
            this.f73348x8ec462de.m152672xb702e421();
        }
        return new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.ObserverListIterator();
    }

    /* renamed from: removeObserver */
    public boolean m152537xb5bdeb7a(E e17) {
        int indexOf;
        if (this.f73344x81dde613) {
            this.f73348x8ec462de.m152672xb702e421();
        }
        if (e17 == null || (indexOf = this.f73347xfeda5270.indexOf(e17)) == -1) {
            return false;
        }
        if (this.f73345x1e9fb7b3 == 0) {
            this.f73347xfeda5270.remove(indexOf);
        } else {
            this.f73346x35e0a6d3 = true;
            this.f73347xfeda5270.set(indexOf, null);
        }
        this.f73343xbde49ca2--;
        return true;
    }

    /* renamed from: rewindableIterator */
    public org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.RewindableIterator<E> m152538xc713423() {
        if (this.f73344x81dde613) {
            this.f73348x8ec462de.m152672xb702e421();
        }
        return new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4.ObserverListIterator();
    }

    /* renamed from: size */
    public int m152539x35e001() {
        if (this.f73344x81dde613) {
            this.f73348x8ec462de.m152672xb702e421();
        }
        return this.f73343xbde49ca2;
    }
}
