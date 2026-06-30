package com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf;

/* renamed from: com.eclipsesource.mmv8.debug.mirror.Frame */
/* loaded from: classes7.dex */
public class C1501x40fb94d extends com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df {

    /* renamed from: ARGUMENT_COUNT */
    private static final java.lang.String f4940x6a1e48ed = "argumentCount";

    /* renamed from: ARGUMENT_NAME */
    private static final java.lang.String f4941xb91e8acd = "argumentName";

    /* renamed from: ARGUMENT_VALUE */
    private static final java.lang.String f4942x6b23894f = "argumentValue";

    /* renamed from: COLUMN */
    private static final java.lang.String f4943x76d1c756 = "column";

    /* renamed from: FUNC */
    private static final java.lang.String f4944x211ac4 = "func";

    /* renamed from: LINE */
    private static final java.lang.String f4945x23a7f4 = "line";

    /* renamed from: LOCAL_COUNT */
    private static final java.lang.String f4946x1eefbefb = "localCount";

    /* renamed from: LOCAL_NAME */
    private static final java.lang.String f4947x6c5f1aff = "localName";

    /* renamed from: LOCAL_VALUE */
    private static final java.lang.String f4948x1ff4ff5d = "localValue";

    /* renamed from: NAME */
    private static final java.lang.String f4949x24728b = "name";

    /* renamed from: POSITION */
    private static final java.lang.String f4950x5b388929 = "position";

    /* renamed from: SCOPE */
    private static final java.lang.String f4951x4b14634 = "scope";

    /* renamed from: SCOPE_COUNT */
    private static final java.lang.String f4952x54da8b24 = "scopeCount";

    /* renamed from: SCRIPT */
    private static final java.lang.String f4953x9178c4cb = "script";

    /* renamed from: SOURCE_LOCATION */
    private static final java.lang.String f4954xf2fdd359 = "sourceLocation";

    /* renamed from: SOURCE_TEXT */
    private static final java.lang.String f4955x7d0af2d1 = "sourceText";

    public C1501x40fb94d(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        super(c1477x4679881);
    }

    /* renamed from: getArgumentCount */
    public int m16557xb9736c9c() {
        return this.f4967x8d3461.mo16321xb7588301(f4940x6a1e48ed, null);
    }

    /* renamed from: getArgumentName */
    public java.lang.String m16558x81df395e(int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16306x34af1a(i17);
        try {
            return this.f4967x8d3461.mo16323xfe95a9de(f4941xb91e8acd, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: getArgumentValue */
    public com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1513x3a7f870 m16559xba78acfe(int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16306x34af1a(i17);
        com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 interfaceC1464x1c628e98 = null;
        try {
            com.p159x477cd522.p160x333422.C1477x4679881 mo16322x2919df0c = this.f4967x8d3461.mo16322x2919df0c(f4942x6b23894f, c1469x28b0ccd7);
            if (!com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df.m16580x7b953e67(mo16322x2919df0c)) {
                throw new java.lang.IllegalStateException("Argument value is not a ValueMirror");
            }
            com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1513x3a7f870 c1513x3a7f870 = new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1513x3a7f870(mo16322x2919df0c);
            c1469x28b0ccd7.mo15825x41012807();
            if (mo16322x2919df0c != null) {
                mo16322x2919df0c.mo15825x41012807();
            }
            return c1513x3a7f870;
        } catch (java.lang.Throwable th6) {
            c1469x28b0ccd7.mo15825x41012807();
            if (0 != 0) {
                interfaceC1464x1c628e98.mo15825x41012807();
            }
            throw th6;
        }
    }

    /* renamed from: getFunction */
    public com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1502x779855d7 m16560xce29b14e() {
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = null;
        try {
            c1477x4679881 = this.f4967x8d3461.mo16322x2919df0c(f4944x211ac4, null);
            return new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1502x779855d7(c1477x4679881);
        } finally {
            if (c1477x4679881 != null) {
                c1477x4679881.mo15825x41012807();
            }
        }
    }

    /* renamed from: getLocalCount */
    public int m16561x3a69245a() {
        return this.f4967x8d3461.mo16321xb7588301(f4946x1eefbefb, null);
    }

    /* renamed from: getLocalName */
    public java.lang.String m16562xb79491e0(int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16306x34af1a(i17);
        try {
            return this.f4967x8d3461.mo16323xfe95a9de(f4947x6c5f1aff, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: getLocalValue */
    public com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1513x3a7f870 m16563x3b6e64bc(int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16306x34af1a(i17);
        com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 interfaceC1464x1c628e98 = null;
        try {
            com.p159x477cd522.p160x333422.C1477x4679881 mo16322x2919df0c = this.f4967x8d3461.mo16322x2919df0c(f4948x1ff4ff5d, c1469x28b0ccd7);
            if (!com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df.m16580x7b953e67(mo16322x2919df0c)) {
                throw new java.lang.IllegalStateException("Local value is not a ValueMirror");
            }
            com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1513x3a7f870 m16571x50b24bdb = com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df.m16571x50b24bdb(mo16322x2919df0c);
            c1469x28b0ccd7.mo15825x41012807();
            if (mo16322x2919df0c != null) {
                mo16322x2919df0c.mo15825x41012807();
            }
            return m16571x50b24bdb;
        } catch (java.lang.Throwable th6) {
            c1469x28b0ccd7.mo15825x41012807();
            if (0 != 0) {
                interfaceC1464x1c628e98.mo15825x41012807();
            }
            throw th6;
        }
    }

    /* renamed from: getScope */
    public com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1509x4c04e34 m16564x7520e49e(int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16306x34af1a(i17);
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = null;
        try {
            c1477x4679881 = this.f4967x8d3461.mo16322x2919df0c(f4951x4b14634, c1469x28b0ccd7);
            return new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1509x4c04e34(c1477x4679881);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
            if (c1477x4679881 != null) {
                c1477x4679881.mo15825x41012807();
            }
        }
    }

    /* renamed from: getScopeCount */
    public int m16565xe14faf11() {
        return this.f4967x8d3461.mo16321xb7588301(f4952x54da8b24, null);
    }

    /* renamed from: getSourceLocation */
    public com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1510xe450ed10 m16566xea1ede6() {
        java.lang.String str = null;
        com.p159x477cd522.p160x333422.C1477x4679881 mo16322x2919df0c = this.f4967x8d3461.mo16322x2919df0c(f4954xf2fdd359, null);
        com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1502x779855d7 m16560xce29b14e = m16560xce29b14e();
        java.lang.String m16569xbc1019ec = m16560xce29b14e.m16569xbc1019ec();
        try {
            com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = (com.p159x477cd522.p160x333422.C1477x4679881) mo16322x2919df0c.get(f4953x9178c4cb);
            if (c1477x4679881 != null) {
                str = c1477x4679881.mo16332x2fec8307("name");
                c1477x4679881.mo15825x41012807();
            }
            if (str != null || m16569xbc1019ec == null) {
                m16569xbc1019ec = "undefined";
            }
            return new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1510xe450ed10(m16569xbc1019ec, mo16322x2919df0c.mo16328xb282bd08(f4950x5b388929), mo16322x2919df0c.mo16328xb282bd08(f4945x23a7f4), mo16322x2919df0c.mo16328xb282bd08(f4943x76d1c756), mo16322x2919df0c.mo16332x2fec8307(f4955x7d0af2d1));
        } finally {
            m16560xce29b14e.mo15825x41012807();
            mo16322x2919df0c.mo15825x41012807();
        }
    }

    @Override // com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df
    /* renamed from: isFrame */
    public boolean mo16567x7abb5663() {
        return true;
    }
}
