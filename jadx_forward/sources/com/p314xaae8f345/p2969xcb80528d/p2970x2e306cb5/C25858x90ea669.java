package com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5;

/* renamed from: com.tencent.tavkit.ciimage.CIContext */
/* loaded from: classes14.dex */
public class C25858x90ea669 {
    private final java.lang.String TAG = "CIContext@" + java.lang.Integer.toHexString(hashCode());

    /* renamed from: copyFilter */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25860x6c39346d f48801xb2d63b4d;

    /* renamed from: filter */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25860x6c39346d f48802xb408cb78;

    /* renamed from: renderContext */
    private final com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 f48803x399b739;

    /* renamed from: textureInfo */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f48804x602aa869;

    public C25858x90ea669(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719) {
        this.f48803x399b739 = c25779x3338e719;
    }

    /* renamed from: newTextureInfo */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98338x7e2662a9(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        return m98336x7e2662a9(c25732x76648a85.f47833x6be2dc6, c25732x76648a85.f47832xb7389127);
    }

    /* renamed from: setDestImage */
    private void m98339xcfe9c197(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        if (this.f48802xb408cb78 == null) {
            this.f48802xb408cb78 = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25860x6c39346d();
        }
        this.f48802xb408cb78.mo98383xa85d066(c25745xc3945049);
    }

    /* renamed from: clear */
    public void m98340x5a5b64d(int i17) {
        this.f48802xb408cb78.mo98381xca4e38d(i17);
    }

    /* renamed from: convertImageToTexture */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98341x2f4f6f98(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        if (c25745xc3945049 == null) {
            return null;
        }
        if (this.f48801xb2d63b4d == null) {
            this.f48801xb2d63b4d = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25860x6c39346d();
        }
        this.f48801xb2d63b4d.mo98383xa85d066(c25745xc3945049);
        this.f48801xb2d63b4d.mo98381xca4e38d(-16777216);
        c25859x590b0095.m98359x2f2d44(this.f48801xb2d63b4d);
        return c25745xc3945049;
    }

    /* renamed from: getRenderContext */
    public com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 m98342xc0f97383() {
        return this.f48803x399b739;
    }

    /* renamed from: release */
    public void m98343x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release: begin, currentThread = " + java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25860x6c39346d c25860x6c39346d = this.f48802xb408cb78;
        if (c25860x6c39346d != null) {
            c25860x6c39346d.mo98382x41012807();
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48804x602aa869;
        if (c25745xc3945049 != null) {
            c25745xc3945049.m97285x41012807();
        }
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25860x6c39346d c25860x6c39346d2 = this.f48801xb2d63b4d;
        if (c25860x6c39346d2 != null) {
            c25860x6c39346d2.mo98382x41012807();
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release: end, currentThread = " + java.lang.Thread.currentThread().getName());
    }

    /* renamed from: renderToSampleBuffer */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 m98344xc0b69fdb(com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25859x590b0095 c25859x590b0095, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719) {
        c25779x3338e719.m97634x900967ab();
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = this.f48804x602aa869;
        if (c25745xc3945049 != null && (c25745xc3945049.f47894x6be2dc6 != c25779x3338e719.m97645x6be2dc6() || this.f48804x602aa869.f47883xb7389127 != c25779x3338e719.m97632xb7389127())) {
            this.f48804x602aa869.m97285x41012807();
            this.f48804x602aa869 = null;
        }
        if (this.f48804x602aa869 == null) {
            this.f48804x602aa869 = m98337x7e2662a9(c25779x3338e719.m97645x6be2dc6(), c25779x3338e719.m97632xb7389127());
        }
        m98339xcfe9c197(this.f48804x602aa869);
        m98340x5a5b64d(-16777216);
        c25859x590b0095.m98359x2f2d44(this.f48802xb408cb78);
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14(c25736x76b98a57, this.f48804x602aa869, false);
    }

    /* renamed from: newTextureInfo */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98336x7e2662a9(float f17, float f18) {
        return m98337x7e2662a9((int) f17, (int) f18);
    }

    /* renamed from: newTextureInfo */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98337x7e2662a9(int i17, int i18) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(3553), 3553, i17, i18, null, 0);
        c25745xc3945049.m97286xcac4ef9(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e);
        return c25745xc3945049;
    }
}
