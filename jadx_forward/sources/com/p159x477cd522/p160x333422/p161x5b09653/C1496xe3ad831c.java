package com.p159x477cd522.p160x333422.p161x5b09653;

/* renamed from: com.eclipsesource.mmv8.debug.ScriptBreakPoint */
/* loaded from: classes7.dex */
public class C1496xe3ad831c implements com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 {

    /* renamed from: CONDITION */
    private static final java.lang.String f4896x72c17cfb = "condition";

    /* renamed from: LINE */
    private static final java.lang.String f4897x23a7f4 = "line";

    /* renamed from: NUMBER */
    private static final java.lang.String f4898x89ebcf49 = "number";

    /* renamed from: SET_CONDITION */
    private static final java.lang.String f4899x5c69cd3e = "setCondition";

    /* renamed from: v8Object */
    private com.p159x477cd522.p160x333422.C1477x4679881 f4900x8d3461;

    public C1496xe3ad831c(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        this.f4900x8d3461 = c1477x4679881.mo16314x3686e8();
    }

    /* renamed from: getBreakPointNumber */
    public int m16509x22fe21f0() {
        return this.f4900x8d3461.mo16321xb7588301(f4898x89ebcf49, null);
    }

    /* renamed from: getCondition */
    public java.lang.String m16510xcc16de65() {
        try {
            return this.f4900x8d3461.mo16323xfe95a9de(f4896x72c17cfb, null);
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return "undefined";
        }
    }

    /* renamed from: getLine */
    public int m16511xfb82186a() {
        return this.f4900x8d3461.mo16321xb7588301(f4897x23a7f4, null);
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98
    /* renamed from: release */
    public void mo15825x41012807() {
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = this.f4900x8d3461;
        if (c1477x4679881 == null || c1477x4679881.mo16335xafdb8087()) {
            return;
        }
        this.f4900x8d3461.mo15825x41012807();
        this.f4900x8d3461 = null;
    }

    /* renamed from: setCondition */
    public void m16512x286a9ed9(java.lang.String str) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4900x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16309x34af1a(str);
        try {
            this.f4900x8d3461.mo16324x725c19a1(f4899x5c69cd3e, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }
}
