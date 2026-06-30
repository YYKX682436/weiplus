package com.p159x477cd522.p160x333422.p164x6a710b1;

/* renamed from: com.eclipsesource.mmv8.utils.SingleTypeAdapter */
/* loaded from: classes7.dex */
public abstract class AbstractC1522x1af55d2d implements com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95 {

    /* renamed from: typeToAdapt */
    private int f5044xe4d700cd;

    public AbstractC1522x1af55d2d(int i17) {
        this.f5044xe4d700cd = i17;
    }

    @Override // com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95
    /* renamed from: adapt */
    public java.lang.Object mo16646x585d722(int i17, java.lang.Object obj) {
        if (i17 == this.f5044xe4d700cd) {
            return m16647x585d722(obj);
        }
        return com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1523x4a2d9e95.f5045x86df6221;
    }

    /* renamed from: adapt */
    public abstract java.lang.Object m16647x585d722(java.lang.Object obj);
}
