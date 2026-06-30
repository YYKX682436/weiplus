package com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf;

/* renamed from: com.eclipsesource.mmv8.debug.mirror.Scope */
/* loaded from: classes7.dex */
public class C1509x4c04e34 extends com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df {

    /* renamed from: SCOPE_OBJECT */
    private static final java.lang.String f4975x5a34abaa = "scopeObject";

    /* renamed from: SCOPE_TYPE */
    private static final java.lang.String f4976x1348ba65 = "scopeType";

    /* renamed from: SET_VARIABLE_VALUE */
    private static final java.lang.String f4977x316b536b = "setVariableValue";

    /* renamed from: com.eclipsesource.mmv8.debug.mirror.Scope$ScopeType */
    /* loaded from: classes6.dex */
    public enum ScopeType {
        Global(0),
        Local(1),
        With(2),
        Closure(3),
        Catch(4),
        Block(5),
        Script(6);


        /* renamed from: index */
        int f4986x5fb28d2;

        ScopeType(int i17) {
            this.f4986x5fb28d2 = i17;
        }
    }

    public C1509x4c04e34(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        super(c1477x4679881);
    }

    /* renamed from: getScopeObject */
    public com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1506xb290a3fe m16600x5c64057d() {
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = null;
        try {
            c1477x4679881 = this.f4967x8d3461.mo16322x2919df0c(f4975x5a34abaa, null);
            return (com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1506xb290a3fe) com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df.m16571x50b24bdb(c1477x4679881);
        } finally {
            if (c1477x4679881 != null) {
                c1477x4679881.mo15825x41012807();
            }
        }
    }

    /* renamed from: getType */
    public com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1509x4c04e34.ScopeType m16601xfb85f7b0() {
        return com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1509x4c04e34.ScopeType.m16610xcee59d22()[this.f4967x8d3461.mo16321xb7588301(f4976x1348ba65, null)];
    }

    /* renamed from: setVariableValue */
    public void m16603x9f671f13(java.lang.String str, int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16309x34af1a(str);
        c1469x28b0ccd7.mo16306x34af1a(i17);
        try {
            this.f4967x8d3461.mo16324x725c19a1(f4977x316b536b, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: setVariableValue */
    public void m16604x9f671f13(java.lang.String str, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16309x34af1a(str);
        c1469x28b0ccd7.mo16307x34af1a(abstractC1488x29d0ebef);
        try {
            this.f4967x8d3461.mo16324x725c19a1(f4977x316b536b, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: setVariableValue */
    public void m16606x9f671f13(java.lang.String str, boolean z17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16309x34af1a(str);
        c1469x28b0ccd7.mo16310x34af1a(z17);
        try {
            this.f4967x8d3461.mo16324x725c19a1(f4977x316b536b, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: setVariableValue */
    public void m16605x9f671f13(java.lang.String str, java.lang.String str2) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16309x34af1a(str);
        c1469x28b0ccd7.mo16309x34af1a(str2);
        try {
            this.f4967x8d3461.mo16324x725c19a1(f4977x316b536b, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: setVariableValue */
    public void m16602x9f671f13(java.lang.String str, double d17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16309x34af1a(str);
        c1469x28b0ccd7.mo16305x34af1a(d17);
        try {
            this.f4967x8d3461.mo16324x725c19a1(f4977x316b536b, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }
}
