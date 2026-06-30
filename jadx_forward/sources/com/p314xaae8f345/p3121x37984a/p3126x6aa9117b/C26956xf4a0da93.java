package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteDirectQuery */
/* loaded from: classes12.dex */
public class C26956xf4a0da93 extends com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 {

    /* renamed from: SQLITE_TYPE_MAPPING */
    private static final int[] f58294x854b01fc = {3, 1, 2, 3, 4, 0};
    private static final java.lang.String TAG = "WCDB.SQLiteDirectQuery";

    /* renamed from: mCancellationSignal */
    private final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f58295x808230d8;

    public C26956xf4a0da93(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        super(c26948xabb259c7, str, objArr, c26987xeef691ab);
        this.f58295x808230d8 = c26987xeef691ab;
    }

    /* renamed from: nativeGetBlob */
    private static native byte[] m107761xc274e7fc(long j17, int i17);

    /* renamed from: nativeGetDouble */
    private static native double m107762xfc719870(long j17, int i17);

    /* renamed from: nativeGetLong */
    private static native long m107763xc2797edb(long j17, int i17);

    /* renamed from: nativeGetString */
    private static native java.lang.String m107764x164f7cb0(long j17, int i17);

    /* renamed from: nativeGetType */
    private static native int m107765xc27d4799(long j17, int i17);

    /* renamed from: nativeStep */
    private static native int m107766xb905e783(long j17, int i17);

    /* renamed from: getBlob */
    public byte[] m107767xfb7d9813(int i17) {
        return m107761xc274e7fc(this.f58324x9195b0c5.m107546xb58863b8(), i17);
    }

    /* renamed from: getDouble */
    public double m107768x160e9ec7(int i17) {
        return m107762xfc719870(this.f58324x9195b0c5.m107546xb58863b8(), i17);
    }

    /* renamed from: getLong */
    public long m107769xfb822ef2(int i17) {
        return m107763xc2797edb(this.f58324x9195b0c5.m107546xb58863b8(), i17);
    }

    /* renamed from: getString */
    public java.lang.String m107770x2fec8307(int i17) {
        return m107764x164f7cb0(this.f58324x9195b0c5.m107546xb58863b8(), i17);
    }

    /* renamed from: getType */
    public int m107771xfb85f7b0(int i17) {
        return f58294x854b01fc[m107765xc27d4799(this.f58324x9195b0c5.m107546xb58863b8(), i17)];
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26941x822ab333
    /* renamed from: onAllReferencesReleased */
    public void mo106213x355542c7() {
        synchronized (this) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement = this.f58324x9195b0c5;
            if (preparedStatement != null) {
                preparedStatement.m107543x807f0a7e(this.f58295x808230d8);
                this.f58324x9195b0c5.m107544x4a9832cc(null);
            }
        }
        super.mo106213x355542c7();
    }

    /* renamed from: reset */
    public synchronized void m107772x6761d4f(boolean z17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement = this.f58324x9195b0c5;
        if (preparedStatement != null) {
            preparedStatement.m107550x6761d4f(false);
            if (z17) {
                this.f58324x9195b0c5.m107543x807f0a7e(this.f58295x808230d8);
                this.f58324x9195b0c5.m107544x4a9832cc(null);
                m107812xcbe9706b();
            }
        }
    }

    /* renamed from: step */
    public int m107773x3606cc(int i17) {
        try {
            if (m107794x54fc0f7c(false)) {
                this.f58324x9195b0c5.m107541x8cfb2abe("directQuery", m107805xb3d14030());
                this.f58324x9195b0c5.m107540xe56258b0(this.f58295x808230d8);
            }
            return m107766xb905e783(this.f58324x9195b0c5.m107546xb58863b8(), i17);
        } catch (java.lang.RuntimeException e17) {
            if (e17 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Got exception on stepping: " + e17.getMessage() + ", SQL: " + m107810xb5886e98());
                m107802xa8a7f203((com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183) e17);
            }
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement preparedStatement = this.f58324x9195b0c5;
            if (preparedStatement != null) {
                preparedStatement.m107543x807f0a7e(this.f58295x808230d8);
                this.f58324x9195b0c5.m107545xedda3fe9(e17);
            }
            m107812xcbe9706b();
            throw e17;
        }
    }
}
