package com.p314xaae8f345.tav.p2947x2eaf9f;

/* renamed from: com.tencent.tav.core.AudioResample */
/* loaded from: classes16.dex */
public class C25673xa753cb73 {
    public final java.lang.String TAG;

    /* renamed from: avResample */
    private com.p314xaae8f345.tav.p2957xa228aba5.InterfaceC25741x399731fb f47448xd61c3cf2;

    /* renamed from: destAudioInfo */
    private final com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f47449x4aed1122;

    /* renamed from: destBuffer */
    private java.nio.ByteBuffer f47450x56a7d82;

    /* renamed from: srcAudioInfo */
    private com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f47451xbdb05c20;

    public C25673xa753cb73() {
        this(m96696x30262a21());
    }

    /* renamed from: compareAudioInfo */
    private boolean m96695xd2132e3f(com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b9842 = this.f47451xbdb05c20;
        return c25756x82a4b9842 != null && c25756x82a4b9842.f47984x2771c84d == c25756x82a4b984.f47984x2771c84d && c25756x82a4b9842.f47983xf99d8dcc == c25756x82a4b984.f47983xf99d8dcc && c25756x82a4b9842.f47985x88751aa == c25756x82a4b984.f47985x88751aa;
    }

    /* renamed from: newDefaultDestAudioInfo */
    private static com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 m96696x30262a21() {
        com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984();
        c25756x82a4b984.f47983xf99d8dcc = 1;
        c25756x82a4b984.f47985x88751aa = 44100;
        c25756x82a4b984.f47984x2771c84d = 2;
        return c25756x82a4b984;
    }

    /* renamed from: getDestAudioInfo */
    public com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 m96697x84ccd6c() {
        return this.f47449x4aed1122;
    }

    /* renamed from: resample */
    public java.nio.ByteBuffer m96698xeae2d19d(java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "resample() called with: srcBuffer = [" + byteBuffer + "], srcAudioInfo = [" + c25756x82a4b984 + "]， thread = " + java.lang.Thread.currentThread().getName());
        if (!m96695xd2132e3f(c25756x82a4b984) && com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8.m97805x9cf0d20b().m97807x439a014a()) {
            com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8 m97805x9cf0d20b = com.p314xaae8f345.tav.p2959x5befac44.p2961xbeeb310a.C25794x2670fbb8.m97805x9cf0d20b();
            int i17 = c25756x82a4b984.f47985x88751aa;
            int i18 = c25756x82a4b984.f47983xf99d8dcc;
            com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b9842 = this.f47449x4aed1122;
            com.p314xaae8f345.tav.p2957xa228aba5.InterfaceC25741x399731fb m97808x80125a92 = m97805x9cf0d20b.m97808x80125a92(i17, i18, c25756x82a4b9842.f47985x88751aa, c25756x82a4b9842.f47983xf99d8dcc);
            this.f47448xd61c3cf2 = m97808x80125a92;
            this.f47451xbdb05c20 = c25756x82a4b984;
            java.lang.String name = m97808x80125a92 != null ? m97808x80125a92.getClass().getName() : "null";
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(this.TAG, "resample: 创建重采样库，class = " + name + ", srcAudioInfo = " + c25756x82a4b984 + ", thread = " + java.lang.Thread.currentThread().getName());
        }
        com.p314xaae8f345.tav.p2957xa228aba5.InterfaceC25741x399731fb interfaceC25741x399731fb = this.f47448xd61c3cf2;
        if (interfaceC25741x399731fb == null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.w(this.TAG, "resample: avResample 创建失败！");
            return null;
        }
        byte[] m97268xeae2d19d = interfaceC25741x399731fb.m97268xeae2d19d(byteBuffer, byteBuffer.limit());
        java.nio.ByteBuffer byteBuffer2 = this.f47450x56a7d82;
        if (byteBuffer2 == null || m97268xeae2d19d.length > byteBuffer2.limit()) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(m97268xeae2d19d.length);
            this.f47450x56a7d82 = allocateDirect;
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        this.f47450x56a7d82.clear();
        this.f47450x56a7d82.put(m97268xeae2d19d);
        this.f47450x56a7d82.position(0);
        this.f47450x56a7d82.limit(m97268xeae2d19d.length);
        return this.f47450x56a7d82;
    }

    public C25673xa753cb73(com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984) {
        java.lang.String str = "AudioResample@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        this.f47449x4aed1122 = c25756x82a4b984;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(str, "AudioResample() called with: destAudioInfo = [" + c25756x82a4b984 + "], thread = " + java.lang.Thread.currentThread().getName());
    }
}
