package com.p314xaae8f345.p3121x37984a.p3125x2eaf9f;

/* renamed from: com.tencent.wcdb.core.Handle */
/* loaded from: classes12.dex */
public class C26919x80675a48 extends com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.AbstractC26920xa8c17405 implements java.lang.AutoCloseable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f58036x7118e671 = false;

    /* renamed from: database */
    private final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b f58037x6aa9117b;

    /* renamed from: mainStatement */
    private com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 f58038x7c9ea3b6;

    /* renamed from: writeHint */
    private boolean f58039xac27a306;

    /* renamed from: com.tencent.wcdb.core.Handle$CancellationSignal */
    /* loaded from: classes12.dex */
    public static class CancellationSignal extends com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2 {
        public CancellationSignal() {
            this.f57826xaf4e2c54 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48.m106738xbbd77af0();
        }

        /* renamed from: cancel */
        public void m106785xae7a2e7a() {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48.m106742x92f245c2(this.f57826xaf4e2c54);
        }
    }

    public C26919x80675a48(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b, boolean z17) {
        this.f58038x7c9ea3b6 = null;
        this.f58037x6aa9117b = c26918x6e83759b;
        this.f58039xac27a306 = z17;
    }

    /* renamed from: access$000 */
    public static /* synthetic */ long m106738xbbd77af0() {
        return m106744x5fec6ba7();
    }

    /* renamed from: attachCancellationSignal */
    private static native void m106740xe56258b0(long j17, long j18);

    /* renamed from: beginTransaction */
    public static native boolean m106741xb2c12e75(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelSignal */
    public static native void m106742x92f245c2(long j17);

    /* renamed from: commitTransaction */
    public static native boolean m106743xa1123927(long j17);

    /* renamed from: createCancellationSignal */
    private static native long m106744x5fec6ba7();

    /* renamed from: detachCancellationSignal */
    private static native void m106745x807f0a7e(long j17);

    /* renamed from: execute */
    public static native boolean m106746xb158f775(long j17, long j18);

    /* renamed from: executeSQL */
    public static native boolean m106747x20261a19(long j17, java.lang.String str);

    /* renamed from: finalizeAllStatements */
    public static native void m106748x650ff9e7(long j17);

    /* renamed from: finalizeAndReturnPreparedStatement */
    public static native void m106749xec7dd49(long j17, long j18);

    /* renamed from: getChanges */
    public static native int m106750x69d89e8d(long j17);

    /* renamed from: getError */
    public static native long m106751x74627852(long j17);

    /* renamed from: getLastInsertedRowId */
    public static native long m106752xc54eb6b1(long j17);

    /* renamed from: getMainStatement */
    public static native long m106753x39fe6000(long j17);

    /* renamed from: getNativeConnectionHandle */
    private static native long m106754xa974b7d3(long j17);

    /* renamed from: getOrCreatePreparedStatement */
    public static native long m106755x896d7fd(long j17, long j18);

    /* renamed from: getOrCreatePreparedStatementWithSQL */
    public static native long m106756xbce0cc6b(long j17, java.lang.String str);

    /* renamed from: getTotalChanges */
    public static native int m106757xae133d55(long j17);

    /* renamed from: isInTransaction */
    public static native boolean m106758x865c8b6f(long j17);

    /* renamed from: onPausableTransaction */
    private int m106759xfefcd496(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.InterfaceC26922x12044d5 interfaceC26922x12044d5, boolean z17) {
        try {
            return interfaceC26922x12044d5.m106999x1b311542(new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48(j17, this.f58037x6aa9117b), z17) ? 1 : 0;
        } catch (com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 unused) {
            return 2;
        }
    }

    /* renamed from: onTransaction */
    private boolean m106760x9c2f5b7f(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.InterfaceC26927xe30a7abe interfaceC26927xe30a7abe) {
        try {
            return interfaceC26927xe30a7abe.mo14059x1b311542(new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48(j17, this.f58037x6aa9117b));
        } catch (com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 unused) {
            return false;
        }
    }

    /* renamed from: prepareNewStatement */
    public static native long m106761x60978256(long j17, long j18);

    /* renamed from: prepareNewStatementWithSQL */
    public static native long m106762x9f57bf2(long j17, java.lang.String str);

    /* renamed from: rollbackTransaction */
    public static native void m106763x5452055a(long j17);

    /* renamed from: tableExist */
    public static native int m106764xa4e76fc9(long j17, java.lang.String str);

    /* renamed from: acquireNativeConnectionHandle */
    public long m106765x12386953() {
        long m106754xa974b7d3 = m106754xa974b7d3(m106772x6d8946f5());
        if (m106754xa974b7d3 != 0) {
            return m106754xa974b7d3;
        }
        throw this.f58037x6aa9117b.m106659xfbaab3();
    }

    /* renamed from: attachCancellationSignal */
    public void m106766xe56258b0(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48.CancellationSignal cancellationSignal) {
        m106740xe56258b0(m106772x6d8946f5(), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) cancellationSignal));
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.AbstractC26921x6472abff
    /* renamed from: autoInvalidateHandle */
    public boolean mo106650x96555712() {
        return false;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        m106777x92d0313b();
    }

    /* renamed from: createException */
    public com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 m106767xfbaab3() {
        return com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.m106368xfbaab3(m106751x74627852(this.f57826xaf4e2c54));
    }

    /* renamed from: detachCancellationSignal */
    public void m106768x807f0a7e() {
        long j17 = this.f57826xaf4e2c54;
        if (j17 != 0) {
            m106745x807f0a7e(j17);
        }
    }

    /* renamed from: finalizeAllStatements */
    public void m106769x650ff9e7() {
        long j17 = this.f57826xaf4e2c54;
        if (j17 != 0) {
            m106748x650ff9e7(j17);
        }
    }

    /* renamed from: finalizeAndReturnPreparedStatement */
    public void m106770xec7dd49(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992) {
        long j17 = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26923xdf786992);
        long j18 = this.f57826xaf4e2c54;
        if (j18 == 0 || j17 == 0) {
            return;
        }
        m106749xec7dd49(j18, j17);
    }

    /* renamed from: getChanges */
    public int m106771x69d89e8d() {
        return m106750x69d89e8d(m106772x6d8946f5());
    }

    /* renamed from: getCppHandle */
    public long m106772x6d8946f5() {
        if (this.f57826xaf4e2c54 == 0) {
            long m106581x1c19911e = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106581x1c19911e(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) this.f58037x6aa9117b), this.f58039xac27a306);
            this.f57826xaf4e2c54 = m106581x1c19911e;
            if (m106581x1c19911e == 0) {
                throw this.f58037x6aa9117b.m106659xfbaab3();
            }
        }
        return this.f57826xaf4e2c54;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.AbstractC26920xa8c17405
    /* renamed from: getDatabase */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b mo106668xe6834ef1() {
        return this.f58037x6aa9117b;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.AbstractC26921x6472abff
    /* renamed from: getHandle */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e(boolean z17) {
        return this;
    }

    /* renamed from: getLastInsertedRowId */
    public long m106773xc54eb6b1() {
        return m106752xc54eb6b1(m106772x6d8946f5());
    }

    /* renamed from: getOrCreatePreparedStatement */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106774x896d7fd(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f c27024xfb29494f) {
        long m106755x896d7fd = m106755x896d7fd(m106772x6d8946f5(), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27024xfb29494f));
        if (m106755x896d7fd != 0) {
            return new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992(m106755x896d7fd);
        }
        throw m106767xfbaab3();
    }

    /* renamed from: getTotalChanges */
    public int m106776xae133d55() {
        return m106757xae133d55(m106772x6d8946f5());
    }

    /* renamed from: invalidate */
    public void m106777x92d0313b() {
        this.f58038x7c9ea3b6 = null;
        long j17 = this.f57826xaf4e2c54;
        if (j17 != 0) {
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.m106351xd06d167b(j17);
            this.f57826xaf4e2c54 = 0L;
            this.f58039xac27a306 = false;
        }
    }

    /* renamed from: prepareNewStatement */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106778x60978256(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f c27024xfb29494f) {
        long m106761x60978256 = m106761x60978256(m106772x6d8946f5(), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27024xfb29494f));
        if (m106761x60978256 != 0) {
            return new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992(m106761x60978256);
        }
        throw m106767xfbaab3();
    }

    /* renamed from: preparedWithMainStatement */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106780x1b7421d3(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f c27024xfb29494f) {
        if (this.f58038x7c9ea3b6 == null) {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992(m106753x39fe6000(m106772x6d8946f5()));
            this.f58038x7c9ea3b6 = c26923xdf786992;
            c26923xdf786992.f58044xcd07feed = true;
        }
        this.f58038x7c9ea3b6.m107082xed060d07(c27024xfb29494f);
        return this.f58038x7c9ea3b6;
    }

    /* renamed from: releaseNativeConnectionHandle */
    public void m106782x507d45c4(long j17) {
    }

    /* renamed from: runPausableTransaction */
    public native boolean m106783x321fb06a(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.InterfaceC26922x12044d5 interfaceC26922x12044d5);

    /* renamed from: runTransaction */
    public native boolean m106784xc8054b53(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.InterfaceC26927xe30a7abe interfaceC26927xe30a7abe);

    /* renamed from: getOrCreatePreparedStatement */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106775x896d7fd(java.lang.String str) {
        long m106756xbce0cc6b = m106756xbce0cc6b(m106772x6d8946f5(), str);
        if (m106756xbce0cc6b != 0) {
            return new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992(m106756xbce0cc6b);
        }
        throw m106767xfbaab3();
    }

    /* renamed from: prepareNewStatement */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106779x60978256(java.lang.String str) {
        long m106762x9f57bf2 = m106762x9f57bf2(m106772x6d8946f5(), str);
        if (m106762x9f57bf2 != 0) {
            return new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992(m106762x9f57bf2);
        }
        throw m106767xfbaab3();
    }

    public C26919x80675a48(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b) {
        this.f58038x7c9ea3b6 = null;
        this.f58039xac27a306 = false;
        this.f57826xaf4e2c54 = j17;
        this.f58037x6aa9117b = c26918x6e83759b;
    }

    /* renamed from: preparedWithMainStatement */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106781x1b7421d3(java.lang.String str) {
        if (this.f58038x7c9ea3b6 == null) {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992(m106753x39fe6000(m106772x6d8946f5()));
            this.f58038x7c9ea3b6 = c26923xdf786992;
            c26923xdf786992.f58044xcd07feed = true;
        }
        this.f58038x7c9ea3b6.m107083xed060d07(str);
        return this.f58038x7c9ea3b6;
    }
}
