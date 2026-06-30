package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29;

/* renamed from: com.tencent.tavkit.composition.model.TAVVideoConfiguration */
/* loaded from: classes14.dex */
public class C25902x4abb7fa4 implements java.lang.Cloneable {

    /* renamed from: DEFAULT_VIDEO_FRAME */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 f49008xfb79d74b;

    /* renamed from: FIX_RENDER_SIZE */
    public static final com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 f49009xf3478fc0 = new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468();

    /* renamed from: SOURCE_SIZE */
    public static final com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 f49010x7d0a8da5;

    /* renamed from: frame */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 f49013x5d2a96d = f49008xfb79d74b;

    /* renamed from: preferRotation */
    private int f49014xcc7d15ae = 0;

    /* renamed from: contentMode */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode f49011xe8cafdbc = com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode.aspectFit;

    /* renamed from: transform */
    private android.graphics.Matrix f49015x3ebe6b6c = new android.graphics.Matrix();

    /* renamed from: effects */
    private java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3> f49012x92b07902 = new java.util.ArrayList();

    /* renamed from: com.tencent.tavkit.composition.model.TAVVideoConfiguration$TAVVideoConfigurationContentMode */
    /* loaded from: classes10.dex */
    public enum TAVVideoConfigurationContentMode {
        aspectFit,
        aspectFill,
        scaleToFit
    }

    static {
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468 = new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468();
        f49010x7d0a8da5 = c25731x76640468;
        f49008xfb79d74b = c25731x76640468;
    }

    /* renamed from: addEffect */
    public void m98695xe75e6192(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3) {
        if (this.f49012x92b07902 == null) {
            this.f49012x92b07902 = new java.util.ArrayList();
        }
        this.f49012x92b07902.add(interfaceC25918xca9d36a3);
    }

    /* renamed from: frameEnable */
    public boolean m98698xdf713550() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468 = this.f49013x5d2a96d;
        return (c25731x76640468 == null || c25731x76640468 == f49009xf3478fc0 || c25731x76640468 == f49010x7d0a8da5 || !com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25931x4e42091.m98863x8872166e(c25731x76640468)) ? false : true;
    }

    /* renamed from: getContentMode */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode m98699xc2a14486() {
        return this.f49011xe8cafdbc;
    }

    /* renamed from: getEffects */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3> m98700xd07db4cc() {
        return this.f49012x92b07902;
    }

    /* renamed from: getFrame */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m98701x74704fb7() {
        return this.f49013x5d2a96d;
    }

    /* renamed from: getPreferRotation */
    public int m98702xbb14e2a4() {
        return this.f49014xcc7d15ae;
    }

    /* renamed from: getTransform */
    public android.graphics.Matrix m98703x3e2bdcb6() {
        return this.f49015x3ebe6b6c;
    }

    /* renamed from: setContentMode */
    public void m98704x5906b7fa(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        this.f49011xe8cafdbc = tAVVideoConfigurationContentMode;
    }

    /* renamed from: setEffects */
    public void m98705x43ef0240(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3> list) {
        this.f49012x92b07902 = list;
    }

    /* renamed from: setFrame */
    public void m98706x52fe6a2b(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468) {
        this.f49013x5d2a96d = c25731x76640468;
    }

    /* renamed from: setPreferRotation */
    public void m98707x830b4ab0(int i17) {
        this.f49014xcc7d15ae = i17;
    }

    /* renamed from: setTransform */
    public void m98708x9a7f9d2a(android.graphics.Matrix matrix) {
        this.f49015x3ebe6b6c = matrix;
    }

    /* renamed from: toString */
    public java.lang.String m98709x9616526c() {
        return "TAVVideoConfiguration{contentMode=" + this.f49011xe8cafdbc + ", frame=" + this.f49013x5d2a96d + ", transform=" + this.f49015x3ebe6b6c + '}';
    }

    /* renamed from: updateTimeRange */
    public void m98710x494a67a7(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3> list = this.f49012x92b07902;
        if (list == null) {
            return;
        }
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25918xca9d36a3 interfaceC25918xca9d36a3 : list) {
            if (interfaceC25918xca9d36a3 instanceof com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25914x22054d8e) {
                ((com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25914x22054d8e) interfaceC25918xca9d36a3).m98758xad7a1dab(c25738xead39d26);
            }
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 m98697x5a5dd5d() {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4 c25902x4abb7fa4 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4();
        c25902x4abb7fa4.f49011xe8cafdbc = this.f49011xe8cafdbc;
        c25902x4abb7fa4.f49013x5d2a96d = this.f49013x5d2a96d;
        c25902x4abb7fa4.f49015x3ebe6b6c = this.f49015x3ebe6b6c;
        c25902x4abb7fa4.f49012x92b07902 = new java.util.ArrayList(this.f49012x92b07902);
        c25902x4abb7fa4.f49014xcc7d15ae = this.f49014xcc7d15ae;
        return c25902x4abb7fa4;
    }
}
