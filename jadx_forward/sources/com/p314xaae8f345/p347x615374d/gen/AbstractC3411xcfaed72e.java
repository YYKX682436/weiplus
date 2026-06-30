package com.p314xaae8f345.p347x615374d.gen;

/* renamed from: com.tencent.kinda.gen.ITransmitKvData */
/* loaded from: classes9.dex */
public abstract class AbstractC3411xcfaed72e {

    /* renamed from: com.tencent.kinda.gen.ITransmitKvData$CppProxy */
    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f13539x7118e671 = false;

        /* renamed from: destroyed */
        private final java.util.concurrent.atomic.AtomicBoolean f13540x766b9619 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: nativeRef */
        private final long f13541xc3e764fc;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.f13541xc3e764fc = j17;
        }

        /* renamed from: nativeDestroy */
        private native void m27568x23caefe3(long j17);

        /* renamed from: native_allKeys */
        private native java.util.ArrayList<java.lang.String> m27569x6a45530d(long j17);

        /* renamed from: native_getBinary */
        private native byte[] m27570x28b888cf(long j17, java.lang.String str);

        /* renamed from: native_getBool */
        private native boolean m27571x9c259338(long j17, java.lang.String str);

        /* renamed from: native_getBoolList */
        private native java.util.ArrayList<java.lang.Boolean> m27572x1c5d5bf6(long j17, java.lang.String str);

        /* renamed from: native_getInt */
        private native int m27573xbab6fde1(long j17, java.lang.String str);

        /* renamed from: native_getIntList */
        private native java.util.ArrayList<java.lang.Integer> m27574x69774a1f(long j17, java.lang.String str);

        /* renamed from: native_getJSEvent */
        private native com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426 m27575x6dc763e3(long j17, java.lang.String str);

        /* renamed from: native_getKvData */
        private native com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27576x38b84083(long j17, java.lang.String str);

        /* renamed from: native_getLong */
        private native long m27577x9c2a1eca(long j17, java.lang.String str);

        /* renamed from: native_getLongList */
        private native java.util.ArrayList<java.lang.Long> m27578x292dce88(long j17, java.lang.String str);

        /* renamed from: native_getPlatformCallback */
        private native com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c m27579xdbc91d26(long j17, java.lang.String str);

        /* renamed from: native_getString */
        private native java.lang.String m27580x4657dcdf(long j17, java.lang.String str);

        /* renamed from: native_getStringList */
        private native java.util.ArrayList<java.lang.String> m27581x6b747a1d(long j17, java.lang.String str);

        /* renamed from: native_modifyBool */
        private native void m27582xff2c1bec(long j17, java.lang.String str, boolean z17);

        /* renamed from: native_modifyInt */
        private native void m27583xa5228ead(long j17, java.lang.String str, int i17);

        /* renamed from: native_putBinary */
        private native void m27584xdd333dc8(long j17, java.lang.String str, byte[] bArr);

        /* renamed from: native_putBool */
        private native void m27585x938b3271(long j17, java.lang.String str, boolean z17);

        /* renamed from: native_putInt */
        private native void m27586xcaf41388(long j17, java.lang.String str, int i17);

        /* renamed from: native_putJSEvent */
        private native void m27587x48a34e0a(long j17, java.lang.String str, com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426 interfaceC3473x4b2b0426);

        /* renamed from: native_putKvData */
        private native void m27588xed32f57c(long j17, java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

        /* renamed from: native_putListBool */
        private native void m27589x75a4bcaf(long j17, java.lang.String str, java.util.ArrayList<java.lang.Boolean> arrayList);

        /* renamed from: native_putListInt */
        private native void m27590xda81498a(long j17, java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList);

        /* renamed from: native_putListLong */
        private native void m27591x75a94841(long j17, java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList);

        /* renamed from: native_putListString */
        private native void m27592xbcb28496(long j17, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList);

        /* renamed from: native_putLong */
        private native void m27593x938fbe03(long j17, java.lang.String str, long j18);

        /* renamed from: native_putPlatformCallback */
        private native void m27594x5fe4aedf(long j17, java.lang.String str, com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c interfaceC3614x9e78e9c);

        /* renamed from: native_putString */
        private native void m27595xfad291d8(long j17, java.lang.String str, java.lang.String str2);

        /* renamed from: native_toJson */
        private native java.lang.String m27596xd1606f2b(long j17);

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: allKeys */
        public java.util.ArrayList<java.lang.String> mo27540xc99d6335() {
            return m27569x6a45530d(this.f13541xc3e764fc);
        }

        /* renamed from: destroy */
        public void m27597x5cd39ffa() {
            if (this.f13540x766b9619.getAndSet(true)) {
                return;
            }
            m27568x23caefe3(this.f13541xc3e764fc);
        }

        /* renamed from: finalize */
        public void m27598xd764dc1e() {
            m27597x5cd39ffa();
            super.finalize();
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getBinary */
        public byte[] mo27541x124d2ef7(java.lang.String str) {
            return m27570x28b888cf(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getBool */
        public boolean mo27542xfb7da360(java.lang.String str) {
            return m27571x9c259338(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getBoolList */
        public java.util.ArrayList<java.lang.Boolean> mo27543xf361181e(java.lang.String str) {
            return m27572x1c5d5bf6(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getInt */
        public int mo27544xb58848b9(java.lang.String str) {
            return m27573xbab6fde1(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getIntList */
        public java.util.ArrayList<java.lang.Integer> mo27545xb27768f7(java.lang.String str) {
            return m27574x69774a1f(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getJSEvent */
        public com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426 mo27546xb6c782bb(java.lang.String str) {
            return m27575x6dc763e3(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getKvData */
        public com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo27547x224ce6ab(java.lang.String str) {
            return m27576x38b84083(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getLong */
        public long mo27548xfb822ef2(java.lang.String str) {
            return m27577x9c2a1eca(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getLongList */
        public java.util.ArrayList<java.lang.Long> mo27549x318ab0(java.lang.String str) {
            return m27578x292dce88(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getPlatformCallback */
        public com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c mo27550x6c02314e(java.lang.String str) {
            return m27579xdbc91d26(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getString */
        public java.lang.String mo27551x2fec8307(java.lang.String str) {
            return m27580x4657dcdf(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: getStringList */
        public java.util.ArrayList<java.lang.String> mo27552x9079cc45(java.lang.String str) {
            return m27581x6b747a1d(this.f13541xc3e764fc, str);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: modifyBool */
        public void mo27553x482c3ac4(java.lang.String str, boolean z17) {
            m27582xff2c1bec(this.f13541xc3e764fc, str, z17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: modifyInt */
        public void mo27554x8eb734d5(java.lang.String str, int i17) {
            m27583xa5228ead(this.f13541xc3e764fc, str, i17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putBinary */
        public void mo27555xc6c7e3f0(java.lang.String str, byte[] bArr) {
            m27584xdd333dc8(this.f13541xc3e764fc, str, bArr);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putBool */
        public void mo27556xf2e34299(java.lang.String str, boolean z17) {
            m27585x938b3271(this.f13541xc3e764fc, str, z17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putInt */
        public void mo27557xc5c55e60(java.lang.String str, int i17) {
            m27586xcaf41388(this.f13541xc3e764fc, str, i17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putJSEvent */
        public void mo27558x91a36ce2(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426 interfaceC3473x4b2b0426) {
            m27587x48a34e0a(this.f13541xc3e764fc, str, interfaceC3473x4b2b0426);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putKvData */
        public void mo27559xd6c79ba4(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            m27588xed32f57c(this.f13541xc3e764fc, str, abstractC3411xcfaed72e);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putListBool */
        public void mo27560x4ca878d7(java.lang.String str, java.util.ArrayList<java.lang.Boolean> arrayList) {
            m27589x75a4bcaf(this.f13541xc3e764fc, str, arrayList);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putListInt */
        public void mo27561x23816862(java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList) {
            m27590xda81498a(this.f13541xc3e764fc, str, arrayList);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putListLong */
        public void mo27562x4cad0469(java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList) {
            m27591x75a94841(this.f13541xc3e764fc, str, arrayList);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putListString */
        public void mo27563xe1b7d6be(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
            m27592xbcb28496(this.f13541xc3e764fc, str, arrayList);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putLong */
        public void mo27564xf2e7ce2b(java.lang.String str, long j17) {
            m27593x938fbe03(this.f13541xc3e764fc, str, j17);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putPlatformCallback */
        public void mo27565xf01dc307(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c interfaceC3614x9e78e9c) {
            m27594x5fe4aedf(this.f13541xc3e764fc, str, interfaceC3614x9e78e9c);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: putString */
        public void mo27566xe4673800(java.lang.String str, java.lang.String str2) {
            m27595xfad291d8(this.f13541xc3e764fc, str, str2);
        }

        @Override // com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e
        /* renamed from: toJson */
        public java.lang.String mo27567xcc31ba03() {
            return m27596xd1606f2b(this.f13541xc3e764fc);
        }
    }

    /* renamed from: create */
    public static native com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc();

    /* renamed from: allKeys */
    public abstract java.util.ArrayList<java.lang.String> mo27540xc99d6335();

    /* renamed from: getBinary */
    public abstract byte[] mo27541x124d2ef7(java.lang.String str);

    /* renamed from: getBool */
    public abstract boolean mo27542xfb7da360(java.lang.String str);

    /* renamed from: getBoolList */
    public abstract java.util.ArrayList<java.lang.Boolean> mo27543xf361181e(java.lang.String str);

    /* renamed from: getInt */
    public abstract int mo27544xb58848b9(java.lang.String str);

    /* renamed from: getIntList */
    public abstract java.util.ArrayList<java.lang.Integer> mo27545xb27768f7(java.lang.String str);

    /* renamed from: getJSEvent */
    public abstract com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426 mo27546xb6c782bb(java.lang.String str);

    /* renamed from: getKvData */
    public abstract com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo27547x224ce6ab(java.lang.String str);

    /* renamed from: getLong */
    public abstract long mo27548xfb822ef2(java.lang.String str);

    /* renamed from: getLongList */
    public abstract java.util.ArrayList<java.lang.Long> mo27549x318ab0(java.lang.String str);

    /* renamed from: getPlatformCallback */
    public abstract com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c mo27550x6c02314e(java.lang.String str);

    /* renamed from: getString */
    public abstract java.lang.String mo27551x2fec8307(java.lang.String str);

    /* renamed from: getStringList */
    public abstract java.util.ArrayList<java.lang.String> mo27552x9079cc45(java.lang.String str);

    /* renamed from: modifyBool */
    public abstract void mo27553x482c3ac4(java.lang.String str, boolean z17);

    /* renamed from: modifyInt */
    public abstract void mo27554x8eb734d5(java.lang.String str, int i17);

    /* renamed from: putBinary */
    public abstract void mo27555xc6c7e3f0(java.lang.String str, byte[] bArr);

    /* renamed from: putBool */
    public abstract void mo27556xf2e34299(java.lang.String str, boolean z17);

    /* renamed from: putInt */
    public abstract void mo27557xc5c55e60(java.lang.String str, int i17);

    /* renamed from: putJSEvent */
    public abstract void mo27558x91a36ce2(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426 interfaceC3473x4b2b0426);

    /* renamed from: putKvData */
    public abstract void mo27559xd6c79ba4(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e);

    /* renamed from: putListBool */
    public abstract void mo27560x4ca878d7(java.lang.String str, java.util.ArrayList<java.lang.Boolean> arrayList);

    /* renamed from: putListInt */
    public abstract void mo27561x23816862(java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList);

    /* renamed from: putListLong */
    public abstract void mo27562x4cad0469(java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList);

    /* renamed from: putListString */
    public abstract void mo27563xe1b7d6be(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList);

    /* renamed from: putLong */
    public abstract void mo27564xf2e7ce2b(java.lang.String str, long j17);

    /* renamed from: putPlatformCallback */
    public abstract void mo27565xf01dc307(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c interfaceC3614x9e78e9c);

    /* renamed from: putString */
    public abstract void mo27566xe4673800(java.lang.String str, java.lang.String str2);

    /* renamed from: toJson */
    public abstract java.lang.String mo27567xcc31ba03();
}
