package com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf;

/* renamed from: com.eclipsesource.mmv8.debug.mirror.Mirror */
/* loaded from: classes7.dex */
public class C1503x896257df implements com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 {

    /* renamed from: IS_ARRAY */
    private static final java.lang.String f4958x6bb1dee4 = "isArray";

    /* renamed from: IS_BOOLEAN */
    private static final java.lang.String f4959x7657ddf3 = "isBoolean";

    /* renamed from: IS_FUNCTION */
    private static final java.lang.String f4960x2f613b4d = "isFunction";

    /* renamed from: IS_NULL */
    private static final java.lang.String f4961xa8a8977c = "isNull";

    /* renamed from: IS_NUMBER */
    private static final java.lang.String f4962x20e0fffe = "isNumber";

    /* renamed from: IS_OBJECT */
    private static final java.lang.String f4963x2188c7f4 = "isObject";

    /* renamed from: IS_STRING */
    private static final java.lang.String f4964x295d84c6 = "isString";

    /* renamed from: IS_UNDEFINED */
    private static final java.lang.String f4965x8746885b = "isUndefined";

    /* renamed from: IS_VALUE */
    private static final java.lang.String f4966x6cd1fdfc = "isValue";

    /* renamed from: v8Object */
    protected com.p159x477cd522.p160x333422.C1477x4679881 f4967x8d3461;

    public C1503x896257df(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        this.f4967x8d3461 = c1477x4679881.mo16314x3686e8();
    }

    /* renamed from: createMirror */
    public static com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1513x3a7f870 m16571x50b24bdb(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        return m16575xb9a6a1d1(c1477x4679881) ? new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1504xdf297846(c1477x4679881) : m16579x85ca346(c1477x4679881) ? new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1512x813a350f(c1477x4679881) : m16574x23071b22(c1477x4679881) ? new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1502x779855d7(c1477x4679881) : m16572x7a751f4f(c1477x4679881) ? new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1499x83c58b58(c1477x4679881) : m16577xeb2d9509(c1477x4679881) ? new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1506xb290a3fe(c1477x4679881) : m16578xf30251db(c1477x4679881) ? new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1511x3c4fb50(c1477x4679881) : m16576xea85cd13(c1477x4679881) ? new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1505x3ddd2c88(c1477x4679881) : m16573xe14cb39e(c1477x4679881) ? new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1500x919535e7(c1477x4679881) : new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1513x3a7f870(c1477x4679881);
    }

    /* renamed from: equals */
    public boolean m16581xb2c87fbf(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df)) {
            return this.f4967x8d3461.mo16317xb2c87fbf(((com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df) obj).f4967x8d3461);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m16582x8cdac1b() {
        return this.f4967x8d3461.mo16334x8cdac1b();
    }

    /* renamed from: isArray */
    public boolean mo16553x7a751f4f() {
        return false;
    }

    /* renamed from: isBoolean */
    public boolean mo16555xe14cb39e() {
        return false;
    }

    /* renamed from: isFrame */
    public boolean mo16567x7abb5663() {
        return false;
    }

    /* renamed from: isFunction */
    public boolean mo16570x23071b22() {
        return false;
    }

    /* renamed from: isNull */
    public boolean mo16583xb9a6a1d1() {
        return false;
    }

    /* renamed from: isNumber */
    public boolean mo16584xea85cd13() {
        return false;
    }

    /* renamed from: isObject */
    public boolean mo16585xeb2d9509() {
        return false;
    }

    /* renamed from: isProperty */
    public boolean mo16586x9585851f() {
        return false;
    }

    /* renamed from: isString */
    public boolean mo16587xf30251db() {
        return false;
    }

    /* renamed from: isUndefined */
    public boolean mo16588x85ca346() {
        return this.f4967x8d3461.mo16319x6581e3eb(f4965x8746885b, null);
    }

    /* renamed from: isValue */
    public boolean mo16589x7b953e67() {
        return false;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98
    /* renamed from: release */
    public void mo15825x41012807() {
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = this.f4967x8d3461;
        if (c1477x4679881 == null || c1477x4679881.mo16335xafdb8087()) {
            return;
        }
        this.f4967x8d3461.mo15825x41012807();
        this.f4967x8d3461 = null;
    }

    /* renamed from: toString */
    public java.lang.String mo16556x9616526c() {
        return this.f4967x8d3461.mo16313x9616526c();
    }

    /* renamed from: isArray */
    private static boolean m16572x7a751f4f(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        try {
            return c1477x4679881.mo16319x6581e3eb(f4958x6bb1dee4, null);
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return false;
        }
    }

    /* renamed from: isBoolean */
    private static boolean m16573xe14cb39e(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        try {
            return c1477x4679881.mo16319x6581e3eb(f4959x7657ddf3, null);
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return false;
        }
    }

    /* renamed from: isFunction */
    private static boolean m16574x23071b22(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        try {
            return c1477x4679881.mo16319x6581e3eb(f4960x2f613b4d, null);
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return false;
        }
    }

    /* renamed from: isNull */
    private static boolean m16575xb9a6a1d1(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        try {
            return c1477x4679881.mo16319x6581e3eb(f4961xa8a8977c, null);
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return false;
        }
    }

    /* renamed from: isNumber */
    private static boolean m16576xea85cd13(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        try {
            return c1477x4679881.mo16319x6581e3eb(f4962x20e0fffe, null);
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return false;
        }
    }

    /* renamed from: isObject */
    private static boolean m16577xeb2d9509(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        try {
            return c1477x4679881.mo16319x6581e3eb(f4963x2188c7f4, null);
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return false;
        }
    }

    /* renamed from: isString */
    private static boolean m16578xf30251db(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        try {
            return c1477x4679881.mo16319x6581e3eb(f4964x295d84c6, null);
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return false;
        }
    }

    /* renamed from: isUndefined */
    private static boolean m16579x85ca346(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        try {
            return c1477x4679881.mo16319x6581e3eb(f4965x8746885b, null);
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return false;
        }
    }

    /* renamed from: isValue */
    public static boolean m16580x7b953e67(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        try {
            return c1477x4679881.mo16319x6581e3eb(f4966x6cd1fdfc, null);
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return false;
        }
    }
}
