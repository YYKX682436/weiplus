package com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf;

/* renamed from: com.eclipsesource.mmv8.debug.mirror.ObjectMirror */
/* loaded from: classes7.dex */
public class C1506xb290a3fe extends com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1513x3a7f870 {

    /* renamed from: PROPERTIES */
    private static final java.lang.String f4968xe5b77933 = "properties";

    /* renamed from: PROPERTY_NAMES */
    private static final java.lang.String f4969x58bb9c3e = "propertyNames";

    /* renamed from: com.eclipsesource.mmv8.debug.mirror.ObjectMirror$PropertyKind */
    /* loaded from: classes6.dex */
    public enum PropertyKind {
        Named(1),
        Indexed(2);


        /* renamed from: index */
        int f4973x5fb28d2;

        PropertyKind(int i17) {
            this.f4973x5fb28d2 = i17;
        }
    }

    public C1506xb290a3fe(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        super(c1477x4679881);
    }

    /* renamed from: getProperties */
    public com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1507x6a05f4c6 m16590xb70e4529(com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1506xb290a3fe.PropertyKind propertyKind, int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16306x34af1a(propertyKind.f4973x5fb28d2);
        c1469x28b0ccd7.mo16306x34af1a(i17);
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd72 = null;
        try {
            c1469x28b0ccd72 = this.f4967x8d3461.mo16318xba1b9fdc(f4968xe5b77933, c1469x28b0ccd7);
            return new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1507x6a05f4c6(c1469x28b0ccd72);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
            if (c1469x28b0ccd72 != null && !c1469x28b0ccd72.mo16335xafdb8087()) {
                c1469x28b0ccd72.mo15825x41012807();
            }
        }
    }

    /* renamed from: getPropertyNames */
    public java.lang.String[] m16591x7fa522bd(com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1506xb290a3fe.PropertyKind propertyKind, int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4967x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16306x34af1a(propertyKind.f4973x5fb28d2);
        c1469x28b0ccd7.mo16306x34af1a(i17);
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd72 = null;
        try {
            c1469x28b0ccd72 = this.f4967x8d3461.mo16318xba1b9fdc(f4969x58bb9c3e, c1469x28b0ccd7);
            int mo16304xbe0e3ae6 = c1469x28b0ccd72.mo16304xbe0e3ae6();
            java.lang.String[] strArr = new java.lang.String[mo16304xbe0e3ae6];
            for (int i18 = 0; i18 < mo16304xbe0e3ae6; i18++) {
                strArr[i18] = c1469x28b0ccd72.mo16298x2fec8307(i18);
            }
            c1469x28b0ccd7.mo15825x41012807();
            c1469x28b0ccd72.mo15825x41012807();
            return strArr;
        } catch (java.lang.Throwable th6) {
            c1469x28b0ccd7.mo15825x41012807();
            if (c1469x28b0ccd72 != null) {
                c1469x28b0ccd72.mo15825x41012807();
            }
            throw th6;
        }
    }

    @Override // com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df
    /* renamed from: isObject */
    public boolean mo16585xeb2d9509() {
        return true;
    }

    @Override // com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1503x896257df
    /* renamed from: toString */
    public java.lang.String mo16556x9616526c() {
        return this.f4967x8d3461.mo16313x9616526c();
    }
}
