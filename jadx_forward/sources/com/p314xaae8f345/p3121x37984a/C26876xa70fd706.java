package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.CursorWindow */
/* loaded from: classes12.dex */
public class C26876xa70fd706 extends com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26941x822ab333 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p3121x37984a.C26876xa70fd706> f57754x681a0c0c;

    /* renamed from: STATS_TAG */
    private static final java.lang.String f57755x2a9ce7ba = "WCDB.CursorWindowStats";

    /* renamed from: sCursorWindowSize */
    private static int f57756x9a16f29a;

    /* renamed from: mName */
    private final java.lang.String f57757x624f098;

    /* renamed from: mStartPos */
    private int f57758x737a2a1f;

    /* renamed from: mWindowPtr */
    public long f57759x6dc7e2f1;

    static {
        int identifier = android.content.res.Resources.getSystem().getIdentifier("config_cursorWindowSize", "integer", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        if (identifier != 0) {
            f57756x9a16f29a = android.content.res.Resources.getSystem().getInteger(identifier) * 1024;
        } else {
            f57756x9a16f29a = 2097152;
        }
        f57754x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p3121x37984a.C26876xa70fd706>() { // from class: com.tencent.wcdb.CursorWindow.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.p3121x37984a.C26876xa70fd706 createFromParcel(android.os.Parcel parcel) {
                return new com.p314xaae8f345.p3121x37984a.C26876xa70fd706(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.p3121x37984a.C26876xa70fd706[] newArray(int i17) {
                return new com.p314xaae8f345.p3121x37984a.C26876xa70fd706[i17];
            }
        };
    }

    /* renamed from: dispose */
    private void m106171x63a5261f() {
        long j17 = this.f57759x6dc7e2f1;
        if (j17 != 0) {
            m106176x2a9c7608(j17);
            this.f57759x6dc7e2f1 = 0L;
        }
    }

    /* renamed from: nativeAllocRow */
    private static native boolean m106172x83fb839c(long j17);

    /* renamed from: nativeClear */
    private static native void m106173x66d1ec76(long j17);

    /* renamed from: nativeCopyStringToBuffer */
    private static native void m106174xeb374918(long j17, int i17, int i18, android.database.CharArrayBuffer charArrayBuffer);

    /* renamed from: nativeCreate */
    private static native long m106175x73c02ff3(java.lang.String str, int i17);

    /* renamed from: nativeDispose */
    private static native void m106176x2a9c7608(long j17);

    /* renamed from: nativeFreeLastRow */
    private static native void m106177xd09f82c1(long j17);

    /* renamed from: nativeGetBlob */
    private static native byte[] m106178xc274e7fc(long j17, int i17, int i18);

    /* renamed from: nativeGetDouble */
    private static native double m106179xfc719870(long j17, int i17, int i18);

    /* renamed from: nativeGetLong */
    private static native long m106180xc2797edb(long j17, int i17, int i18);

    /* renamed from: nativeGetNumRows */
    private static native int m106181xac84e5c0(long j17);

    /* renamed from: nativeGetString */
    private static native java.lang.String m106182x164f7cb0(long j17, int i17, int i18);

    /* renamed from: nativeGetType */
    private static native int m106183xc27d4799(long j17, int i17, int i18);

    /* renamed from: nativePutBlob */
    private static native boolean m106184xb9da8735(long j17, byte[] bArr, int i17, int i18);

    /* renamed from: nativePutDouble */
    private static native boolean m106185xb0ec4d69(long j17, double d17, int i17, int i18);

    /* renamed from: nativePutLong */
    private static native boolean m106186xb9df1e14(long j17, long j18, int i17, int i18);

    /* renamed from: nativePutNull */
    private static native boolean m106187xb9e01d1f(long j17, int i17, int i18);

    /* renamed from: nativePutString */
    private static native boolean m106188xcaca31a9(long j17, java.lang.String str, int i17, int i18);

    /* renamed from: nativeSetNumColumns */
    private static native boolean m106189x517aa4a2(long j17, int i17);

    /* renamed from: newFromParcel */
    public static com.p314xaae8f345.p3121x37984a.C26876xa70fd706 m106190xacfa1a13(android.os.Parcel parcel) {
        return f57754x681a0c0c.createFromParcel(parcel);
    }

    /* renamed from: windowSize */
    public static int m106191x6f03b811(int i17) {
        int i18 = f57756x9a16f29a;
        if (i17 > 0) {
            f57756x9a16f29a = i17;
        }
        return i18;
    }

    /* renamed from: allocRow */
    public boolean m106192x6c08d665() {
        m107403x3e28f15();
        try {
            return m106172x83fb839c(this.f57759x6dc7e2f1);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: clear */
    public void m106193x5a5b64d() {
        m107403x3e28f15();
        try {
            this.f57758x737a2a1f = 0;
            m106173x66d1ec76(this.f57759x6dc7e2f1);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: copyStringToBuffer */
    public void m106194xfd674a1(int i17, int i18, android.database.CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            throw new java.lang.IllegalArgumentException("CharArrayBuffer should not be null");
        }
        m107403x3e28f15();
        try {
            m106174xeb374918(this.f57759x6dc7e2f1, i17 - this.f57758x737a2a1f, i18, charArrayBuffer);
        } finally {
            m107405xb81b4f04();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: finalize */
    public void m106195xd764dc1e() {
        try {
            m106171x63a5261f();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: freeLastRow */
    public void m106196xf7144f58() {
        m107403x3e28f15();
        try {
            m106177xd09f82c1(this.f57759x6dc7e2f1);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: getBlob */
    public byte[] m106197xfb7d9813(int i17, int i18) {
        m107403x3e28f15();
        try {
            return m106178xc274e7fc(this.f57759x6dc7e2f1, i17 - this.f57758x737a2a1f, i18);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: getDouble */
    public double m106198x160e9ec7(int i17, int i18) {
        m107403x3e28f15();
        try {
            return m106179xfc719870(this.f57759x6dc7e2f1, i17 - this.f57758x737a2a1f, i18);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: getFloat */
    public float m106199x746dc8a6(int i17, int i18) {
        return (float) m106198x160e9ec7(i17, i18);
    }

    /* renamed from: getInt */
    public int m106200xb58848b9(int i17, int i18) {
        return (int) m106201xfb822ef2(i17, i18);
    }

    /* renamed from: getLong */
    public long m106201xfb822ef2(int i17, int i18) {
        m107403x3e28f15();
        try {
            return m106180xc2797edb(this.f57759x6dc7e2f1, i17 - this.f57758x737a2a1f, i18);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: getName */
    public java.lang.String m106202xfb82e301() {
        return this.f57757x624f098;
    }

    /* renamed from: getNumRows */
    public int m106203xc688aa49() {
        m107403x3e28f15();
        try {
            return m106181xac84e5c0(this.f57759x6dc7e2f1);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: getShort */
    public short m106204x75232ac6(int i17, int i18) {
        return (short) m106201xfb822ef2(i17, i18);
    }

    /* renamed from: getStartPosition */
    public int m106205xf185fbf5() {
        return this.f57758x737a2a1f;
    }

    /* renamed from: getString */
    public java.lang.String m106206x2fec8307(int i17, int i18) {
        m107403x3e28f15();
        try {
            return m106182x164f7cb0(this.f57759x6dc7e2f1, i17 - this.f57758x737a2a1f, i18);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: getType */
    public int m106207xfb85f7b0(int i17, int i18) {
        m107403x3e28f15();
        try {
            return m106183xc27d4799(this.f57759x6dc7e2f1, i17 - this.f57758x737a2a1f, i18);
        } finally {
            m107405xb81b4f04();
        }
    }

    @java.lang.Deprecated
    /* renamed from: isBlob */
    public boolean m106208xb9a10be7(int i17, int i18) {
        int m106207xfb85f7b0 = m106207xfb85f7b0(i17, i18);
        return m106207xfb85f7b0 == 4 || m106207xfb85f7b0 == 0;
    }

    @java.lang.Deprecated
    /* renamed from: isFloat */
    public boolean m106209x7ab8cf52(int i17, int i18) {
        return m106207xfb85f7b0(i17, i18) == 2;
    }

    @java.lang.Deprecated
    /* renamed from: isLong */
    public boolean m106210xb9a5a2c6(int i17, int i18) {
        return m106207xfb85f7b0(i17, i18) == 1;
    }

    @java.lang.Deprecated
    /* renamed from: isNull */
    public boolean m106211xb9a6a1d1(int i17, int i18) {
        return m106207xfb85f7b0(i17, i18) == 0;
    }

    @java.lang.Deprecated
    /* renamed from: isString */
    public boolean m106212xf30251db(int i17, int i18) {
        int m106207xfb85f7b0 = m106207xfb85f7b0(i17, i18);
        return m106207xfb85f7b0 == 3 || m106207xfb85f7b0 == 0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26941x822ab333
    /* renamed from: onAllReferencesReleased */
    public void mo106213x355542c7() {
        m106171x63a5261f();
    }

    /* renamed from: putBlob */
    public boolean m106214xf2e3374c(byte[] bArr, int i17, int i18) {
        m107403x3e28f15();
        try {
            return m106184xb9da8735(this.f57759x6dc7e2f1, bArr, i17 - this.f57758x737a2a1f, i18);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: putDouble */
    public boolean m106215xca8953c0(double d17, int i17, int i18) {
        m107403x3e28f15();
        try {
            return m106185xb0ec4d69(this.f57759x6dc7e2f1, d17, i17 - this.f57758x737a2a1f, i18);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: putLong */
    public boolean m106216xf2e7ce2b(long j17, int i17, int i18) {
        m107403x3e28f15();
        try {
            return m106186xb9df1e14(this.f57759x6dc7e2f1, j17, i17 - this.f57758x737a2a1f, i18);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: putNull */
    public boolean m106217xf2e8cd36(int i17, int i18) {
        m107403x3e28f15();
        try {
            return m106187xb9e01d1f(this.f57759x6dc7e2f1, i17 - this.f57758x737a2a1f, i18);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: putString */
    public boolean m106218xe4673800(java.lang.String str, int i17, int i18) {
        m107403x3e28f15();
        try {
            return m106188xcaca31a9(this.f57759x6dc7e2f1, str, i17 - this.f57758x737a2a1f, i18);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: setNumColumns */
    public boolean m106219xadeea779(int i17) {
        m107403x3e28f15();
        try {
            return m106189x517aa4a2(this.f57759x6dc7e2f1, i17);
        } finally {
            m107405xb81b4f04();
        }
    }

    /* renamed from: setStartPosition */
    public void m106220x845c6269(int i17) {
        this.f57758x737a2a1f = i17;
    }

    /* renamed from: toString */
    public java.lang.String m106221x9616526c() {
        return m106202xfb82e301() + " {" + java.lang.Long.toHexString(this.f57759x6dc7e2f1) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    public C26876xa70fd706(java.lang.String str) {
        this.f57758x737a2a1f = 0;
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.f57757x624f098 = str;
        long m106175x73c02ff3 = m106175x73c02ff3(str, f57756x9a16f29a);
        this.f57759x6dc7e2f1 = m106175x73c02ff3;
        if (m106175x73c02ff3 != 0) {
            return;
        }
        throw new com.p314xaae8f345.p3121x37984a.C26877xc3b63269("Cursor window allocation of " + (f57756x9a16f29a / 1024) + " kb failed. ");
    }

    @java.lang.Deprecated
    public C26876xa70fd706(boolean z17) {
        this((java.lang.String) null);
    }

    private C26876xa70fd706(android.os.Parcel parcel) {
        throw new java.lang.UnsupportedOperationException();
    }
}
