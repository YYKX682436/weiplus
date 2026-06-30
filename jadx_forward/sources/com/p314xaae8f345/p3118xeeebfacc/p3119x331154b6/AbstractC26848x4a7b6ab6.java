package com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6;

/* renamed from: com.tencent.unit_rc.cleaner.PhantomCleanable */
/* loaded from: classes16.dex */
public abstract class AbstractC26848x4a7b6ab6<T> extends java.lang.ref.PhantomReference<T> implements com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96.Cleanable {

    /* renamed from: list */
    private final com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6<?> f57684x32b09e;

    /* renamed from: next */
    com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6<?> f57685x338af3;

    /* renamed from: prev */
    com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6<?> f57686x34a233;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC26848x4a7b6ab6(T t17, com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96 c26846x9649ec96) {
        super(t17, com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.RunnableC26847x4fd887d6.m106056xc64526c0(c26846x9649ec96).f57681x66f1911);
        java.util.Objects.requireNonNull(t17);
        this.f57686x34a233 = this;
        this.f57685x338af3 = this;
        this.f57684x32b09e = com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.RunnableC26847x4fd887d6.m106056xc64526c0(c26846x9649ec96).f57680x691a1054;
        m106060xb970c2b9();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: insert */
    private void m106060xb970c2b9() {
        synchronized (this.f57684x32b09e) {
            com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6<?> abstractC26848x4a7b6ab6 = this.f57684x32b09e;
            this.f57686x34a233 = abstractC26848x4a7b6ab6;
            com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6<?> abstractC26848x4a7b6ab62 = abstractC26848x4a7b6ab6.f57685x338af3;
            this.f57685x338af3 = abstractC26848x4a7b6ab62;
            abstractC26848x4a7b6ab62.f57686x34a233 = this;
            abstractC26848x4a7b6ab6.f57685x338af3 = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: remove */
    private boolean m106061xc84af884() {
        synchronized (this.f57684x32b09e) {
            com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6<?> abstractC26848x4a7b6ab6 = this.f57685x338af3;
            if (abstractC26848x4a7b6ab6 == this) {
                return false;
            }
            abstractC26848x4a7b6ab6.f57686x34a233 = this.f57686x34a233;
            this.f57686x34a233.f57685x338af3 = abstractC26848x4a7b6ab6;
            this.f57686x34a233 = this;
            this.f57685x338af3 = this;
            return true;
        }
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96.Cleanable
    /* renamed from: clean */
    public final void mo106055x5a5b649() {
        if (m106061xc84af884()) {
            super.clear();
            mo106059x6e702803();
        }
    }

    @Override // java.lang.ref.Reference
    public void clear() {
        if (m106061xc84af884()) {
            super.clear();
        }
    }

    @Override // java.lang.ref.Reference
    public final boolean enqueue() {
        throw new java.lang.UnsupportedOperationException("enqueue");
    }

    @Override // java.lang.ref.Reference
    public final boolean isEnqueued() {
        throw new java.lang.UnsupportedOperationException("isEnqueued");
    }

    /* renamed from: isListEmpty */
    public boolean m106062xfbd5d945() {
        boolean z17;
        synchronized (this.f57684x32b09e) {
            com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.AbstractC26848x4a7b6ab6<?> abstractC26848x4a7b6ab6 = this.f57684x32b09e;
            z17 = abstractC26848x4a7b6ab6 == abstractC26848x4a7b6ab6.f57685x338af3;
        }
        return z17;
    }

    /* renamed from: performCleanup */
    public abstract void mo106059x6e702803();

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC26848x4a7b6ab6() {
        super(null, null);
        this.f57686x34a233 = this;
        this.f57685x338af3 = this;
        this.f57684x32b09e = this;
    }
}
