package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3031xd1c47ede;

/* renamed from: com.tencent.thumbplayer.core.connection.TPNativePlayerConnectionMgr */
/* loaded from: classes16.dex */
public class C26340x9cf57846 {

    /* renamed from: mIsLibLoaded */
    private boolean f52478xe0a15a33;

    /* renamed from: mInited */
    private boolean f52477x8d8947c = false;

    /* renamed from: mNativeContext */
    private long f52479x5abc8e2b = 0;

    public C26340x9cf57846() {
        this.f52478xe0a15a33 = false;
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101882x9ec66011(null);
            this.f52478xe0a15a33 = true;
        } catch (java.lang.UnsupportedOperationException unused) {
            this.f52478xe0a15a33 = false;
        }
    }

    /* renamed from: _activeAllConnections */
    private native int m102012x904a9079();

    /* renamed from: _activeConnection */
    private native int m102013xe618ace3(int i17);

    /* renamed from: _addConnection */
    private native int m102014xa4441060(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4);

    /* renamed from: _addConnectionWithAddr */
    private native int m102015xcc9d0257(long j17, java.lang.Object obj, long j18, java.lang.Object obj2);

    /* renamed from: _deactiveAllConnections */
    private native void m102016xf08516ba();

    /* renamed from: _deactiveConnection */
    private native void m102017xe54a7ba4(int i17);

    /* renamed from: _init */
    private native void m102018x56c1def();

    /* renamed from: _removeConnection */
    private native void m102019xfe80e0e1(int i17);

    /* renamed from: _unInit */
    private native void m102020x6f47f068();

    /* renamed from: activeAllConnections */
    public int m102021xe387759a() {
        if (!this.f52478xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f52477x8d8947c) {
            return m102012x904a9079();
        }
        throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
    }

    /* renamed from: activeConnection */
    public int m102022xf70f4a84(int i17) {
        if (!this.f52478xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f52477x8d8947c) {
            return m102013xe618ace3(i17);
        }
        throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
    }

    /* renamed from: addConnection */
    public int m102024xd2f63e5f(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae74, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3031xd1c47ede.C26341x1ba2194 c26341x1ba2194, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26406x391cae74 c26406x391cae742, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3031xd1c47ede.C26341x1ba2194 c26341x1ba21942) {
        if (this.f52478xe0a15a33) {
            if (this.f52477x8d8947c) {
                return m102014xa4441060(c26406x391cae74, c26341x1ba2194, c26406x391cae742, c26341x1ba21942);
            }
            throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
        }
        throw new java.lang.UnsupportedOperationException("Failed to load native library");
    }

    /* renamed from: deactiveAllConnections */
    public void m102025x681d379b() {
        if (!this.f52478xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.f52477x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
        }
        m102016xf08516ba();
    }

    /* renamed from: deactiveConnection */
    public void m102026x93103505(int i17) {
        if (!this.f52478xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.f52477x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
        }
        m102017xe54a7ba4(i17);
    }

    /* renamed from: init */
    public void m102027x316510() {
        if (!this.f52478xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f52477x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to init due to invalid state.");
        }
        this.f52477x8d8947c = true;
        m102018x56c1def();
    }

    /* renamed from: removeConnection */
    public void m102028xf777e82(int i17) {
        if (!this.f52478xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (!this.f52477x8d8947c) {
            throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
        }
        m102019xfe80e0e1(i17);
    }

    /* renamed from: unInit */
    public void m102029xcdd7f349() {
        if (!this.f52478xe0a15a33) {
            throw new java.lang.UnsupportedOperationException("Failed to load native library");
        }
        if (this.f52477x8d8947c) {
            this.f52477x8d8947c = false;
            m102020x6f47f068();
        }
    }

    /* renamed from: addConnection */
    public int m102023xd2f63e5f(long j17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3031xd1c47ede.C26341x1ba2194 c26341x1ba2194, long j18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3031xd1c47ede.C26341x1ba2194 c26341x1ba21942) {
        if (this.f52478xe0a15a33) {
            if (this.f52477x8d8947c) {
                return m102015xcc9d0257(j17, c26341x1ba2194, j18, c26341x1ba21942);
            }
            throw new java.lang.IllegalStateException("Failed to addConnection due to invalid state.");
        }
        throw new java.lang.UnsupportedOperationException("Failed to load native library");
    }
}
