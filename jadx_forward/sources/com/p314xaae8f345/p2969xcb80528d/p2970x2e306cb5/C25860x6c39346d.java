package com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.tavkit.ciimage.CIImageFilter */
/* loaded from: classes14.dex */
public class C25860x6c39346d extends com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 {
    private final java.lang.String TAG = "CIImageFilter@" + java.lang.Integer.toHexString(hashCode());

    /* renamed from: clearColor */
    private int f48819xd2c57116;

    /* renamed from: destTextureInfo */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 f48820x9b253867;

    /* renamed from: oesFilter */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 f48821x865d2b35;

    /* renamed from: rgbFilter */
    private com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 f48822x8fa2e2a5;

    public C25860x6c39346d() {
        if (this.f48822x8fa2e2a5 == null) {
            this.f48822x8fa2e2a5 = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53();
        }
        if (this.f48821x865d2b35 == null) {
            this.f48821x865d2b35 = new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53();
        }
    }

    /* renamed from: tryApplyOESFilter */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98378x35122a02(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, float f17, com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468) {
        return this.f48821x865d2b35.mo98380x79f87086(c25745xc3945049, matrix, matrix2, f17, c25731x76640468);
    }

    /* renamed from: tryApplyRGBFilter */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98379x3e57e172(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, float f17, com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468) {
        return this.f48822x8fa2e2a5.mo98380x79f87086(c25745xc3945049, matrix, matrix2, f17, c25731x76640468);
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53
    /* renamed from: applyFilter */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 mo98380x79f87086(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, float f17, com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468) {
        if (c25745xc3945049 != null) {
            return c25745xc3945049.f47893x602fd2f5 == 36197 ? m98378x35122a02(c25745xc3945049, matrix, matrix2, f17, c25731x76640468) : m98379x3e57e172(c25745xc3945049, matrix, matrix2, f17, c25731x76640468);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53
    /* renamed from: clearBufferBuffer */
    public void mo98381xca4e38d(int i17) {
        this.f48819xd2c57116 = i17;
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 c25863x2a5f3c53 = this.f48821x865d2b35;
        if (c25863x2a5f3c53 != null) {
            c25863x2a5f3c53.mo98381xca4e38d(i17);
        }
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 c25863x2a5f3c532 = this.f48822x8fa2e2a5;
        if (c25863x2a5f3c532 != null) {
            c25863x2a5f3c532.mo98381xca4e38d(i17);
        }
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53
    /* renamed from: release */
    public void mo98382x41012807() {
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 c25863x2a5f3c53 = this.f48821x865d2b35;
        if (c25863x2a5f3c53 != null) {
            c25863x2a5f3c53.mo98382x41012807();
        }
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 c25863x2a5f3c532 = this.f48822x8fa2e2a5;
        if (c25863x2a5f3c532 != null) {
            c25863x2a5f3c532.mo98382x41012807();
        }
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53
    /* renamed from: setOutputTextureInfo */
    public void mo98383xa85d066(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        this.f48820x9b253867 = c25745xc3945049;
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 c25863x2a5f3c53 = this.f48821x865d2b35;
        if (c25863x2a5f3c53 != null) {
            c25863x2a5f3c53.mo98383xa85d066(c25745xc3945049);
        }
        com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53 c25863x2a5f3c532 = this.f48822x8fa2e2a5;
        if (c25863x2a5f3c532 != null) {
            c25863x2a5f3c532.mo98383xa85d066(c25745xc3945049);
        }
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25863x2a5f3c53
    /* renamed from: toString */
    public java.lang.String mo98384x9616526c() {
        return "CIImageFilter{program=" + this.f48841xed8f1e84 + ", clearColor=" + this.f48819xd2c57116 + ", destTextureInfo=" + this.f48820x9b253867 + '}';
    }
}
