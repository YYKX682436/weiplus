package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e;

/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.MJAudioChannels3aInterface */
/* loaded from: classes5.dex */
public class C10932x97174782 {

    /* renamed from: _hellAccFlag_ */
    private byte f29774x7f11beae;

    /* renamed from: nativePtr */
    private final long f29775xc3e75f57 = m47014x48491571();

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("voipCodec");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/audio/services/MJAudioChannels3aInterface", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/mj_publisher/finder/movie_composing/audio/services/MJAudioChannels3aInterface", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: nCreateProcessorInterface */
    private native long m47014x48491571();

    /* renamed from: nDestroyProcessorInterface */
    private native void m47015x69496d93(long j17);

    /* renamed from: nGetVersion */
    private native int m47016xc3d903b0();

    /* renamed from: nInit */
    private native int m47017x630f29e(long j17);

    /* renamed from: nProcessPlayoutData */
    private native int m47018x98822983(long j17, byte[] bArr, int i17, int i18, int i19);

    /* renamed from: nProcessRecordedData */
    private native int m47019x2f425d3b(long j17, byte[] bArr, int i17, int i18, int i19);

    /* renamed from: nReset */
    private native int m47020xc0684181(long j17);

    /* renamed from: nSetConfig */
    private native int m47021x768c9576(long j17, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.C10930x8784eb16 c10930x8784eb16);

    /* renamed from: nSetModelBinFilePath */
    private native int m47022xd515c433(long j17, java.lang.String str, int i17);

    /* renamed from: destroy */
    public void m47023x5cd39ffa() {
        long j17 = this.f29775xc3e75f57;
        if (j17 == 0) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
        m47015x69496d93(j17);
    }

    /* renamed from: getVersion */
    public int m47024x52c258a2() {
        return m47016xc3d903b0();
    }

    /* renamed from: init */
    public boolean m47025x316510() {
        long j17 = this.f29775xc3e75f57;
        if (j17 != 0) {
            return m47017x630f29e(j17) == 0;
        }
        throw new java.lang.IllegalStateException("Unable to initialize");
    }

    /* renamed from: processPlayoutData */
    public int m47026xcb886c75(byte[] bArr, int i17, int i18, int i19) {
        long j17 = this.f29775xc3e75f57;
        if (j17 != 0) {
            return m47018x98822983(j17, bArr, i17, i18, i19);
        }
        throw new java.lang.IllegalStateException("Not initialized");
    }

    /* renamed from: processRecordedData */
    public int m47027x5d047889(byte[] bArr, int i17, int i18, int i19) {
        long j17 = this.f29775xc3e75f57;
        if (j17 != 0) {
            return m47019x2f425d3b(j17, bArr, i17, i18, i19);
        }
        throw new java.lang.IllegalStateException("Not initialized");
    }

    /* renamed from: reset */
    public int m47028x6761d4f() {
        long j17 = this.f29775xc3e75f57;
        if (j17 != 0) {
            return m47020xc0684181(j17);
        }
        throw new java.lang.IllegalStateException("Not initialized");
    }

    /* renamed from: setConfig */
    public int m47029x78bda44(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.C10930x8784eb16 c10930x8784eb16) {
        long j17 = this.f29775xc3e75f57;
        if (j17 != 0) {
            return m47021x768c9576(j17, c10930x8784eb16);
        }
        throw new java.lang.IllegalStateException("Not initialized");
    }

    /* renamed from: setModelBinFilePath */
    public int m47030x2d7df81(java.lang.String str, int i17) {
        long j17 = this.f29775xc3e75f57;
        if (j17 != 0) {
            return m47022xd515c433(j17, str, i17);
        }
        throw new java.lang.IllegalStateException("Unable to initialize");
    }
}
