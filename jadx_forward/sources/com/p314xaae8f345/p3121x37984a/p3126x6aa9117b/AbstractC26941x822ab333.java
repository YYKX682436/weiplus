package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteClosable */
/* loaded from: classes12.dex */
public abstract class AbstractC26941x822ab333 implements java.io.Closeable {

    /* renamed from: mReferenceCount */
    private int f58097x93e70251 = 1;

    /* renamed from: acquireReference */
    public void m107403x3e28f15() {
        synchronized (this) {
            int i17 = this.f58097x93e70251;
            if (i17 <= 0) {
                throw new java.lang.IllegalStateException("attempt to re-open an already-closed object: " + this);
            }
            this.f58097x93e70251 = i17 + 1;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m107405xb81b4f04();
    }

    /* renamed from: onAllReferencesReleased */
    public abstract void mo106213x355542c7();

    @java.lang.Deprecated
    /* renamed from: onAllReferencesReleasedFromContainer */
    public void m107404x347f3c70() {
        mo106213x355542c7();
    }

    /* renamed from: releaseReference */
    public void m107405xb81b4f04() {
        boolean z17;
        synchronized (this) {
            z17 = true;
            int i17 = this.f58097x93e70251 - 1;
            this.f58097x93e70251 = i17;
            if (i17 != 0) {
                z17 = false;
            }
        }
        if (z17) {
            mo106213x355542c7();
        }
    }

    @java.lang.Deprecated
    /* renamed from: releaseReferenceFromContainer */
    public void m107406x1ac5bb53() {
        boolean z17;
        synchronized (this) {
            z17 = true;
            int i17 = this.f58097x93e70251 - 1;
            this.f58097x93e70251 = i17;
            if (i17 != 0) {
                z17 = false;
            }
        }
        if (z17) {
            mo106213x355542c7();
        }
    }
}
