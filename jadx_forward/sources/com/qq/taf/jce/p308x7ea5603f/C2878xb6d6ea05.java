package com.qq.taf.jce.p308x7ea5603f;

/* renamed from: com.qq.taf.jce.dynamic.StructField */
/* loaded from: classes13.dex */
public class C2878xb6d6ea05 extends com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e {

    /* renamed from: tagComp */
    private static final java.util.Comparator<com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e> f9782xa3a485c9 = new java.util.Comparator<com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e>() { // from class: com.qq.taf.jce.dynamic.StructField.1
        @Override // java.util.Comparator
        public int compare(com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e c2871x2c850a2e, com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e c2871x2c850a2e2) {
            return c2871x2c850a2e.m21442xb5887064() - c2871x2c850a2e2.m21442xb5887064();
        }
    };

    /* renamed from: data */
    private com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] f9783x2eefaa;

    public C2878xb6d6ea05(com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr, int i17) {
        super(i17);
        this.f9783x2eefaa = c2871x2c850a2eArr;
    }

    public com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] get() {
        return this.f9783x2eefaa;
    }

    /* renamed from: getFieldByTag */
    public com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e m21458xf0bfadf(int i17) {
        int binarySearch = java.util.Arrays.binarySearch(this.f9783x2eefaa, com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21441x519f35c4(i17), f9782xa3a485c9);
        if (binarySearch >= 0) {
            return this.f9783x2eefaa[binarySearch];
        }
        return null;
    }

    /* renamed from: setByTag */
    public boolean m21459x52c90881(int i17, com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e c2871x2c850a2e) {
        int binarySearch = java.util.Arrays.binarySearch(this.f9783x2eefaa, com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e.m21441x519f35c4(i17), f9782xa3a485c9);
        if (binarySearch >= 0) {
            this.f9783x2eefaa[binarySearch] = c2871x2c850a2e;
            return true;
        }
        int i18 = (-binarySearch) - 1;
        com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr = new com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[this.f9783x2eefaa.length + 1];
        for (int i19 = 0; i19 < i18; i19++) {
            c2871x2c850a2eArr[i19] = this.f9783x2eefaa[i19];
        }
        c2871x2c850a2eArr[i18] = c2871x2c850a2e;
        while (true) {
            com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr2 = this.f9783x2eefaa;
            if (i18 >= c2871x2c850a2eArr2.length) {
                return false;
            }
            int i27 = i18 + 1;
            c2871x2c850a2eArr[i27] = c2871x2c850a2eArr2[i18];
            i18 = i27;
        }
    }
}
