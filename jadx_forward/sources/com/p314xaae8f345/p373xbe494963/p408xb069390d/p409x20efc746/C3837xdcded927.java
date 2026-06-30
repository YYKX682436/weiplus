package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

/* renamed from: com.tencent.liteav.videoproducer.capture.CameraCaptureParams */
/* loaded from: classes14.dex */
public class C3837xdcded927 extends com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58.CaptureParams {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f128525a = null;

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58.CaptureParams
    /* renamed from: equals */
    public boolean mo31356xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3837xdcded927)) {
            return false;
        }
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3837xdcded927 c3837xdcded927 = (com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3837xdcded927) obj;
        return super.mo31356xb2c87fbf(c3837xdcded927) && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.h.a(this.f128525a, c3837xdcded927.f128525a);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58.CaptureParams
    /* renamed from: toString */
    public java.lang.String mo31357x9616526c() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "%s, frontCamera: %b", super.mo31357x9616526c(), this.f128525a);
    }
}
