package com.p314xaae8f345.p3121x37984a.p3125x2eaf9f;

/* renamed from: com.tencent.wcdb.core.PreparedStatement */
/* loaded from: classes12.dex */
public class C26923xdf786992 extends com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f58043x7118e671 = false;

    /* renamed from: autoFinalize */
    boolean f58044xcd07feed = false;

    /* renamed from: columnCount */
    int f58045xccb23359 = -1;

    /* renamed from: com.tencent.wcdb.core.PreparedStatement$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$wcdb$winq$ColumnType */
        static final /* synthetic */ int[] f58046x1da28687;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.m108124xcee59d22().length];
            f58046x1da28687 = iArr;
            try {
                iArr[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Integer.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f58046x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Float.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f58046x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Text.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f58046x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.BLOB.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f58046x1da28687[com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Null.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public C26923xdf786992(long j17) {
        this.f57826xaf4e2c54 = j17;
    }

    /* renamed from: bindBLOB */
    private static native void m107000x37f6e55a(long j17, byte[] bArr, int i17);

    /* renamed from: bindDouble */
    private static native void m107001x1b3baa6e(long j17, double d17, int i17);

    /* renamed from: bindInteger */
    private static native void m107002x52f72641(long j17, long j18, int i17);

    /* renamed from: bindNull */
    private static native void m107003x37fcf764(long j17, int i17);

    /* renamed from: bindParameterIndex */
    private static native int m107004x6282a846(long j17, java.lang.String str);

    /* renamed from: bindText */
    private static native void m107005x37ff770a(long j17, java.lang.String str, int i17);

    /* renamed from: checkPrepared */
    private static native boolean m107006x43a85565(long j17);

    /* renamed from: clearBindings */
    private static native void m107007xc089ffb(long j17);

    /* renamed from: createException */
    private com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 m107008xfbaab3() {
        return com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.m106368xfbaab3(m107016x74627852(this.f57826xaf4e2c54));
    }

    /* renamed from: finalize */
    private static native void m107009xd764dc1e(long j17);

    /* renamed from: getBLOB */
    private static native byte[] m107010xfb7d1bf3(long j17, int i17);

    /* renamed from: getColumnCount */
    private static native int m107011xa6887a23(long j17);

    /* renamed from: getColumnName */
    private static native java.lang.String m107012x70bedef7(long j17, int i17);

    /* renamed from: getColumnTableName */
    private static native java.lang.String m107013x14b5128d(long j17, int i17);

    /* renamed from: getColumnType */
    private static native int m107014x70c1f3a6(long j17, int i17);

    /* renamed from: getDouble */
    private static native double m107015x160e9ec7(long j17, int i17);

    /* renamed from: getError */
    private static native long m107016x74627852(long j17);

    /* renamed from: getInteger */
    private static native long m107017xb282bd08(long j17, int i17);

    /* renamed from: getOriginalColumnName */
    private static native java.lang.String m107018xbabd9da8(long j17, int i17);

    /* renamed from: getText */
    private static native java.lang.String m107019xfb85ada3(long j17, int i17);

    /* renamed from: isDone */
    private static native boolean m107020xb9a1ffcc(long j17);

    /* renamed from: isReadOnly */
    private static native boolean m107021x9cffd9ac(long j17);

    /* renamed from: prepare */
    private static native boolean m107022xed060d07(long j17, long j18);

    /* renamed from: prepareSQL */
    private static native boolean m107023xb3274347(long j17, java.lang.String str);

    /* renamed from: reset */
    private static native void m107024x6761d4f(long j17);

    /* renamed from: step */
    private static native boolean m107025x3606cc(long j17);

    /* renamed from: bindBLOB */
    public void m107026x37f6e55a(byte[] bArr, int i17) {
        if (bArr == null) {
            m107041x37fcf764(i17);
        } else {
            m107000x37f6e55a(this.f57826xaf4e2c54, bArr, i17);
        }
    }

    /* renamed from: bindBool */
    public void m107028x37f76cc7(boolean z17, int i17) {
        m107002x52f72641(this.f57826xaf4e2c54, z17 ? 1L : 0L, i17);
    }

    /* renamed from: bindDouble */
    public void m107030x1b3baa6e(float f17, int i17) {
        m107001x1b3baa6e(this.f57826xaf4e2c54, f17, i17);
    }

    /* renamed from: bindInteger */
    public void m107033x52f72641(byte b17, int i17) {
        m107002x52f72641(this.f57826xaf4e2c54, b17, i17);
    }

    /* renamed from: bindNull */
    public void m107041x37fcf764(int i17) {
        m107003x37fcf764(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: bindObject */
    public <T> void m107043x2d44d1dc(T t17, com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> interfaceC26982x5a8a1af7) {
        if (t17 == null) {
            return;
        }
        int i17 = 1;
        for (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da : interfaceC26982x5a8a1af7.mo107912xefdf857d()) {
            interfaceC26982x5a8a1af7.mo107914xc72baabd(t17, c26981x40bb0da, i17, this);
            i17++;
        }
    }

    /* renamed from: bindParameterIndex */
    public int m107045x6282a846(java.lang.String str) {
        return m107004x6282a846(this.f57826xaf4e2c54, str);
    }

    /* renamed from: bindRow */
    public void m107046xf98c585d(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151[] c26901x4e9a151Arr) {
        int i17 = 1;
        for (com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151 : c26901x4e9a151Arr) {
            m107048xc8099b34(c26901x4e9a151, i17);
            i17++;
        }
    }

    /* renamed from: bindText */
    public void m107047x37ff770a(java.lang.String str, int i17) {
        if (str == null) {
            m107041x37fcf764(i17);
        } else {
            m107005x37ff770a(this.f57826xaf4e2c54, str, i17);
        }
    }

    /* renamed from: bindValue */
    public void m107048xc8099b34(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 c26901x4e9a151, int i17) {
        if (c26901x4e9a151 == null) {
            m107041x37fcf764(i17);
            return;
        }
        int i18 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992.AnonymousClass1.f58046x1da28687[c26901x4e9a151.m106364xfb85f7b0().ordinal()];
        if (i18 == 1) {
            m107035x52f72641(c26901x4e9a151.m106361xfb822ef2(), i17);
            return;
        }
        if (i18 == 2) {
            m107029x1b3baa6e(c26901x4e9a151.m106358x160e9ec7(), i17);
            return;
        }
        if (i18 == 3) {
            m107047x37ff770a(c26901x4e9a151.m106363xfb85ada3(), i17);
        } else if (i18 == 4) {
            m107026x37f6e55a(c26901x4e9a151.m106355xfb7d1bf3(), i17);
        } else {
            if (i18 != 5) {
                return;
            }
            m107041x37fcf764(i17);
        }
    }

    /* renamed from: checkPrepared */
    public boolean m107049x43a85565() {
        return m107006x43a85565(this.f57826xaf4e2c54);
    }

    /* renamed from: clearBindings */
    public void m107050xc089ffb() {
        m107007xc089ffb(this.f57826xaf4e2c54);
    }

    /* renamed from: finalizeStatement */
    public void m107051xf2172ef1() {
        m107009xd764dc1e(this.f57826xaf4e2c54);
    }

    /* renamed from: getAllObjects */
    public <T> java.util.List<T> m107052xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        return m107053xde3eb429(c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da.m107902xc6702485(c26981x40bb0daArr));
    }

    /* renamed from: getBLOB */
    public byte[] m107054xfb7d1bf3(int i17) {
        return m107010xfb7d1bf3(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getBool */
    public boolean m107055xfb7da360(int i17) {
        return m107017xb282bd08(this.f57826xaf4e2c54, i17) > 0;
    }

    /* renamed from: getByte */
    public byte m107056xfb7dc97e(int i17) {
        return (byte) m107017xb282bd08(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getColumnCount */
    public int m107057xa6887a23() {
        if (this.f58045xccb23359 == -1) {
            this.f58045xccb23359 = m107011xa6887a23(this.f57826xaf4e2c54);
        }
        return this.f58045xccb23359;
    }

    /* renamed from: getColumnName */
    public java.lang.String m107058x70bedef7(int i17) {
        return m107012x70bedef7(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getColumnTableName */
    public java.lang.String m107059x14b5128d(int i17) {
        return m107013x14b5128d(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getColumnType */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0 m107060x70c1f3a6(int i17) {
        return com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.m108122xdce0328(m107014x70c1f3a6(this.f57826xaf4e2c54, i17));
    }

    /* renamed from: getDouble */
    public double m107061x160e9ec7(int i17) {
        return m107015x160e9ec7(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getFloat */
    public float m107062x746dc8a6(int i17) {
        return (float) m107015x160e9ec7(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getInt */
    public int m107063xb58848b9(int i17) {
        return (int) m107017xb282bd08(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getLong */
    public long m107064xfb822ef2(int i17) {
        return m107017xb282bd08(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getMultiRows */
    public java.util.List<com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151[]> m107065xb77bf7fc() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m107085x3606cc();
        while (!m107020xb9a1ffcc(this.f57826xaf4e2c54)) {
            arrayList.add(m107075x28be548a());
            m107085x3606cc();
        }
        return arrayList;
    }

    /* renamed from: getOneColumn */
    public java.util.List<com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151> m107066x4353faa6() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m107085x3606cc();
        while (!m107020xb9a1ffcc(this.f57826xaf4e2c54)) {
            arrayList.add(m107079x754a37bb(0));
            m107085x3606cc();
        }
        return arrayList;
    }

    /* renamed from: getOneColumnBLOB */
    public java.util.List<byte[]> m107067x2e095f43() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m107085x3606cc();
        while (!m107020xb9a1ffcc(this.f57826xaf4e2c54)) {
            arrayList.add(m107054xfb7d1bf3(0));
            m107085x3606cc();
        }
        return arrayList;
    }

    /* renamed from: getOneColumnDouble */
    public java.util.List<java.lang.Double> m107068xd6974e17() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m107085x3606cc();
        while (!m107020xb9a1ffcc(this.f57826xaf4e2c54)) {
            arrayList.add(java.lang.Double.valueOf(m107061x160e9ec7(0)));
            m107085x3606cc();
        }
        return arrayList;
    }

    /* renamed from: getOneColumnFloat */
    public java.util.List<java.lang.Float> m107069x9369ef56() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m107085x3606cc();
        while (!m107020xb9a1ffcc(this.f57826xaf4e2c54)) {
            arrayList.add(java.lang.Float.valueOf((float) m107061x160e9ec7(0)));
            m107085x3606cc();
        }
        return arrayList;
    }

    /* renamed from: getOneColumnInt */
    public java.util.List<java.lang.Integer> m107070x9be5b69() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m107085x3606cc();
        while (!m107020xb9a1ffcc(this.f57826xaf4e2c54)) {
            arrayList.add(java.lang.Integer.valueOf((int) m107064xfb822ef2(0)));
            m107085x3606cc();
        }
        return arrayList;
    }

    /* renamed from: getOneColumnLong */
    public java.util.List<java.lang.Long> m107071x2e0e7242() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m107085x3606cc();
        while (!m107020xb9a1ffcc(this.f57826xaf4e2c54)) {
            arrayList.add(java.lang.Long.valueOf(m107064xfb822ef2(0)));
            m107085x3606cc();
        }
        return arrayList;
    }

    /* renamed from: getOneColumnString */
    public java.util.List<java.lang.String> m107072xf0753257() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m107085x3606cc();
        while (!m107020xb9a1ffcc(this.f57826xaf4e2c54)) {
            arrayList.add(m107078xfb85ada3(0));
            m107085x3606cc();
        }
        return arrayList;
    }

    /* renamed from: getOneObject */
    public <T> T m107073x5715ca8f(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        return (T) m107074x5715ca8f(c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da.m107902xc6702485(c26981x40bb0daArr));
    }

    /* renamed from: getOneRow */
    public com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151[] m107075x28be548a() {
        int m107057xa6887a23 = m107057xa6887a23();
        if (m107057xa6887a23 == 0) {
            return new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151[0];
        }
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151[] c26901x4e9a151Arr = new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151[m107057xa6887a23];
        for (int i17 = 0; i17 < m107057xa6887a23; i17++) {
            c26901x4e9a151Arr[i17] = m107079x754a37bb(i17);
        }
        return c26901x4e9a151Arr;
    }

    /* renamed from: getOriginalColumnName */
    public java.lang.String m107076xbabd9da8(int i17) {
        return m107018xbabd9da8(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getShort */
    public short m107077x75232ac6(int i17) {
        return (short) m107017xb282bd08(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getText */
    public java.lang.String m107078xfb85ada3(int i17) {
        return m107019xfb85ada3(this.f57826xaf4e2c54, i17);
    }

    /* renamed from: getValue */
    public com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107079x754a37bb(int i17) {
        int m107014x70c1f3a6 = m107014x70c1f3a6(this.f57826xaf4e2c54, i17);
        return m107014x70c1f3a6 != 1 ? m107014x70c1f3a6 != 2 ? m107014x70c1f3a6 != 3 ? m107014x70c1f3a6 != 4 ? new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151() : new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(m107010xfb7d1bf3(this.f57826xaf4e2c54, i17)) : new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(m107019xfb85ada3(this.f57826xaf4e2c54, i17)) : new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(m107015x160e9ec7(this.f57826xaf4e2c54, i17)) : new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(m107017xb282bd08(this.f57826xaf4e2c54, i17));
    }

    /* renamed from: isDone */
    public boolean m107080xb9a1ffcc() {
        return m107020xb9a1ffcc(this.f57826xaf4e2c54);
    }

    /* renamed from: isReadOnly */
    public boolean m107081x9cffd9ac() {
        return m107021x9cffd9ac(this.f57826xaf4e2c54);
    }

    /* renamed from: prepare */
    public void m107082xed060d07(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f c27024xfb29494f) {
        this.f58045xccb23359 = -1;
        if (!m107022xed060d07(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27024xfb29494f))) {
            throw m107008xfbaab3();
        }
    }

    /* renamed from: reset */
    public void m107084x6761d4f() {
        m107024x6761d4f(this.f57826xaf4e2c54);
    }

    /* renamed from: step */
    public void m107085x3606cc() {
        if (m107025x3606cc(this.f57826xaf4e2c54)) {
            return;
        }
        if (this.f58044xcd07feed) {
            m107051xf2172ef1();
        }
        throw m107008xfbaab3();
    }

    /* renamed from: bindBool */
    public void m107027x37f76cc7(java.lang.Boolean bool, int i17) {
        if (bool != null) {
            m107002x52f72641(this.f57826xaf4e2c54, bool.booleanValue() ? 1L : 0L, i17);
        } else {
            m107041x37fcf764(i17);
        }
    }

    /* renamed from: bindDouble */
    public void m107032x1b3baa6e(java.lang.Float f17, int i17) {
        if (f17 != null) {
            m107001x1b3baa6e(this.f57826xaf4e2c54, f17.floatValue(), i17);
        } else {
            m107041x37fcf764(i17);
        }
    }

    /* renamed from: bindInteger */
    public void m107036x52f72641(java.lang.Byte b17, int i17) {
        if (b17 != null) {
            m107002x52f72641(this.f57826xaf4e2c54, b17.byteValue(), i17);
        } else {
            m107041x37fcf764(i17);
        }
    }

    /* renamed from: getAllObjects */
    public <T, R extends T> java.util.List<R> m107053xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.Class<R> cls) {
        com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> m107908xb1b1594d = c26981x40bb0daArr[0].m107908xb1b1594d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m107085x3606cc();
        while (!m107020xb9a1ffcc(this.f57826xaf4e2c54)) {
            try {
                arrayList.add(m107908xb1b1594d.mo107916xd4074720(c26981x40bb0daArr, this, cls));
                m107085x3606cc();
            } catch (java.lang.ReflectiveOperationException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        return arrayList;
    }

    /* renamed from: getOneObject */
    public <T, R extends T> R m107074x5715ca8f(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.Class<R> cls) {
        try {
            return (R) c26981x40bb0daArr[0].m107908xb1b1594d().mo107916xd4074720(c26981x40bb0daArr, this, cls);
        } catch (java.lang.ReflectiveOperationException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: bindObject */
    public <T> void m107042x2d44d1dc(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, int i17) {
        if (t17 == null) {
            m107041x37fcf764(i17);
        } else {
            c26981x40bb0da.m107908xb1b1594d().mo107914xc72baabd(t17, c26981x40bb0da, i17, this);
        }
    }

    /* renamed from: bindDouble */
    public void m107029x1b3baa6e(double d17, int i17) {
        m107001x1b3baa6e(this.f57826xaf4e2c54, d17, i17);
    }

    /* renamed from: bindInteger */
    public void m107040x52f72641(short s17, int i17) {
        m107002x52f72641(this.f57826xaf4e2c54, s17, i17);
    }

    /* renamed from: prepare */
    public void m107083xed060d07(java.lang.String str) {
        this.f58045xccb23359 = -1;
        if (!m107023xb3274347(this.f57826xaf4e2c54, str)) {
            throw m107008xfbaab3();
        }
    }

    /* renamed from: bindDouble */
    public void m107031x1b3baa6e(java.lang.Double d17, int i17) {
        if (d17 != null) {
            m107001x1b3baa6e(this.f57826xaf4e2c54, d17.doubleValue(), i17);
        } else {
            m107041x37fcf764(i17);
        }
    }

    /* renamed from: bindInteger */
    public void m107039x52f72641(java.lang.Short sh6, int i17) {
        if (sh6 != null) {
            m107002x52f72641(this.f57826xaf4e2c54, sh6.shortValue(), i17);
        } else {
            m107041x37fcf764(i17);
        }
    }

    /* renamed from: bindObject */
    public <T> void m107044x2d44d1dc(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        if (t17 == null || c26981x40bb0daArr.length == 0) {
            return;
        }
        com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> m107908xb1b1594d = c26981x40bb0daArr[0].m107908xb1b1594d();
        int i17 = 1;
        for (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da : c26981x40bb0daArr) {
            m107908xb1b1594d.mo107914xc72baabd(t17, c26981x40bb0da, i17, this);
            i17++;
        }
    }

    /* renamed from: bindInteger */
    public void m107034x52f72641(int i17, int i18) {
        m107002x52f72641(this.f57826xaf4e2c54, i17, i18);
    }

    /* renamed from: bindInteger */
    public void m107037x52f72641(java.lang.Integer num, int i17) {
        if (num != null) {
            m107002x52f72641(this.f57826xaf4e2c54, num.intValue(), i17);
        } else {
            m107041x37fcf764(i17);
        }
    }

    /* renamed from: bindInteger */
    public void m107035x52f72641(long j17, int i17) {
        m107002x52f72641(this.f57826xaf4e2c54, j17, i17);
    }

    /* renamed from: bindInteger */
    public void m107038x52f72641(java.lang.Long l17, int i17) {
        if (l17 != null) {
            m107002x52f72641(this.f57826xaf4e2c54, l17.longValue(), i17);
        } else {
            m107041x37fcf764(i17);
        }
    }
}
