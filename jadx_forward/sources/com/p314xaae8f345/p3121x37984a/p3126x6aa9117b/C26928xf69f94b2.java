package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.ChunkedCursorWindow */
/* loaded from: classes12.dex */
public class C26928xf69f94b2 extends com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26941x822ab333 {

    /* renamed from: CHUNK_NOT_FOUND */
    public static final long f58054x17ae8764 = -1;

    /* renamed from: mNumColumns */
    private int f58055x6dbb99c4 = 0;

    /* renamed from: mWindowPtr */
    long f58056x6dc7e2f1;

    public C26928xf69f94b2(int i17) {
        long m107339x73c02ff3 = m107339x73c02ff3(i17);
        this.f58056x6dc7e2f1 = m107339x73c02ff3;
        if (m107339x73c02ff3 == 0) {
            throw new com.p314xaae8f345.p3121x37984a.C26877xc3b63269("Cursor window allocation failed.");
        }
    }

    /* renamed from: dispose */
    private void m107337x63a5261f() {
        long j17 = this.f58056x6dc7e2f1;
        if (j17 != 0) {
            m107340x2a9c7608(j17);
            this.f58056x6dc7e2f1 = 0L;
        }
    }

    /* renamed from: nativeClear */
    private static native void m107338x66d1ec76(long j17);

    /* renamed from: nativeCreate */
    private static native long m107339x73c02ff3(int i17);

    /* renamed from: nativeDispose */
    private static native void m107340x2a9c7608(long j17);

    /* renamed from: nativeEndRow */
    private static native void m107341x76f0d5f6(long j17, long j18);

    /* renamed from: nativeGetBlob */
    private static native byte[] m107342xc274e7fc(long j17, int i17);

    /* renamed from: nativeGetDouble */
    private static native double m107343xfc719870(long j17, int i17);

    /* renamed from: nativeGetLong */
    private static native long m107344xc2797edb(long j17, int i17);

    /* renamed from: nativeGetNumChunks */
    private static native int m107345x84e631cd(long j17);

    /* renamed from: nativeGetRow */
    private static native long m107346x79e2f99b(long j17, int i17);

    /* renamed from: nativeGetString */
    private static native java.lang.String m107347x164f7cb0(long j17, int i17);

    /* renamed from: nativeGetType */
    private static native int m107348xc27d4799(long j17, int i17);

    /* renamed from: nativeRemoveChunk */
    private static native long m107349xc67c1fb2(long j17, int i17);

    /* renamed from: nativeSetNumColumns */
    private static native boolean m107350x517aa4a2(long j17, int i17);

    /* renamed from: clear */
    public void m107351x5a5b64d() {
        m107403x3e28f15();
        try {
            m107338x66d1ec76(this.f58056x6dc7e2f1);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: endRowUnsafe */
    public void m107352x26ee9185(long j17) {
        if (j17 == 0) {
            return;
        }
        m107341x76f0d5f6(this.f58056x6dc7e2f1, j17);
        m107405xb81b4f04();
    }

    /* renamed from: finalize */
    public void m107353xd764dc1e() {
        try {
            m107337x63a5261f();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: getBlob */
    public byte[] m107354xfb7d9813(int i17, int i18) {
        long m107362x3edea56a = m107362x3edea56a(i17);
        if (m107362x3edea56a != 0) {
            try {
                return m107342xc274e7fc(m107362x3edea56a, i18);
            } finally {
                m107352x26ee9185(m107362x3edea56a);
            }
        }
        throw new java.lang.IllegalStateException("Couldn't read row " + i17 + ", column " + i18 + " from ChunkedCursorWindow.");
    }

    /* renamed from: getBlobUnsafe */
    public byte[] m107355xe151c399(long j17, int i17) {
        return m107342xc274e7fc(j17, i17);
    }

    /* renamed from: getDouble */
    public double m107356x160e9ec7(int i17, int i18) {
        long m107362x3edea56a = m107362x3edea56a(i17);
        if (m107362x3edea56a != 0) {
            try {
                return m107343xfc719870(m107362x3edea56a, i18);
            } finally {
                m107352x26ee9185(m107362x3edea56a);
            }
        }
        throw new java.lang.IllegalStateException("Couldn't read row " + i17 + ", column " + i18 + " from ChunkedCursorWindow.");
    }

    /* renamed from: getDoubleUnsafe */
    public double m107357xa267f34d(long j17, int i17) {
        return m107343xfc719870(j17, i17);
    }

    /* renamed from: getLong */
    public long m107358xfb822ef2(int i17, int i18) {
        long m107362x3edea56a = m107362x3edea56a(i17);
        if (m107362x3edea56a != 0) {
            try {
                return m107344xc2797edb(m107362x3edea56a, i18);
            } finally {
                m107352x26ee9185(m107362x3edea56a);
            }
        }
        throw new java.lang.IllegalStateException("Couldn't read row " + i17 + ", column " + i18 + " from ChunkedCursorWindow.");
    }

    /* renamed from: getLongUnsafe */
    public long m107359xc99b7738(long j17, int i17) {
        return m107344xc2797edb(j17, i17);
    }

    /* renamed from: getNumChunks */
    public int m107360x2d0af816() {
        m107403x3e28f15();
        try {
            return m107345x84e631cd(this.f58056x6dc7e2f1);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: getNumColumns */
    public int m107361x7fca596d() {
        return this.f58055x6dbb99c4;
    }

    /* renamed from: getRowUnsafe */
    public long m107362x3edea56a(int i17) {
        m107403x3e28f15();
        long m107346x79e2f99b = m107346x79e2f99b(this.f58056x6dc7e2f1, i17);
        if (m107346x79e2f99b == 0) {
            m107405xb81b4f04();
        }
        return m107346x79e2f99b;
    }

    /* renamed from: getString */
    public java.lang.String m107363x2fec8307(int i17, int i18) {
        long m107362x3edea56a = m107362x3edea56a(i17);
        if (m107362x3edea56a != 0) {
            try {
                return m107347x164f7cb0(m107362x3edea56a, i18);
            } finally {
                m107352x26ee9185(m107362x3edea56a);
            }
        }
        throw new java.lang.IllegalStateException("Couldn't read row " + i17 + ", column " + i18 + " from ChunkedCursorWindow.");
    }

    /* renamed from: getStringUnsafe */
    public java.lang.String m107364x68d9a78d(long j17, int i17) {
        return m107347x164f7cb0(j17, i17);
    }

    /* renamed from: getType */
    public int m107365xfb85f7b0(int i17, int i18) {
        long m107362x3edea56a = m107362x3edea56a(i17);
        if (m107362x3edea56a != 0) {
            try {
                return m107348xc27d4799(m107362x3edea56a, i18);
            } finally {
                m107352x26ee9185(m107362x3edea56a);
            }
        }
        throw new java.lang.IllegalStateException("Couldn't read row " + i17 + ", column " + i18 + " from ChunkedCursorWindow.");
    }

    /* renamed from: getTypeUnsafe */
    public int m107366x9c893976(long j17, int i17) {
        return m107348xc27d4799(j17, i17);
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26941x822ab333
    /* renamed from: onAllReferencesReleased */
    public void mo106213x355542c7() {
        m107337x63a5261f();
    }

    /* renamed from: removeChunk */
    public long m107367xecf0ec49(int i17) {
        m107403x3e28f15();
        try {
            return m107349xc67c1fb2(this.f58056x6dc7e2f1, i17);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: setNumColumns */
    public boolean m107368xadeea779(int i17) {
        m107403x3e28f15();
        try {
            boolean m107350x517aa4a2 = m107350x517aa4a2(this.f58056x6dc7e2f1, i17);
            if (m107350x517aa4a2) {
                this.f58055x6dbb99c4 = i17;
            }
            return m107350x517aa4a2;
        } finally {
            m107405xb81b4f04();
        }
    }
}
