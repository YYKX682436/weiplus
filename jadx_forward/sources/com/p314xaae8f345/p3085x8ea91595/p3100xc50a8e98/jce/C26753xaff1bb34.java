package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode */
/* loaded from: classes11.dex */
public final class C26753xaff1bb34 implements java.io.Serializable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56689x7118e671 = false;

    /* renamed from: _EC_BUSINESS_ERROR */
    public static final int f56692x518c5beb = -11;

    /* renamed from: _EC_SERVER_INTERNAL_ERROR */
    public static final int f56693xf8bba0e0 = -10;
    private java.lang.String __T;

    /* renamed from: __value */
    private int f56695x4a38f191;

    /* renamed from: __values */
    private static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26753xaff1bb34[] f56694xfce54102 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26753xaff1bb34[2];

    /* renamed from: EC_SERVER_INTERNAL_ERROR */
    public static final com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26753xaff1bb34 f56691xeacf0d81 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26753xaff1bb34(0, -10, "EC_SERVER_INTERNAL_ERROR");

    /* renamed from: EC_BUSINESS_ERROR */
    public static final com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26753xaff1bb34 f56690x5f69726a = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26753xaff1bb34(1, -11, "EC_BUSINESS_ERROR");

    private C26753xaff1bb34(int i17, int i18, java.lang.String str) {
        new java.lang.String();
        this.__T = str;
        this.f56695x4a38f191 = i18;
        f56694xfce54102[i17] = this;
    }

    /* renamed from: convert */
    public static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26753xaff1bb34 m105308x38b81db3(int i17) {
        int i18 = 0;
        while (true) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26753xaff1bb34[] c26753xaff1bb34Arr = f56694xfce54102;
            if (i18 >= c26753xaff1bb34Arr.length) {
                return null;
            }
            if (c26753xaff1bb34Arr[i18].m105311x6ac9171() == i17) {
                return f56694xfce54102[i18];
            }
            i18++;
        }
    }

    /* renamed from: toString */
    public java.lang.String m105310x9616526c() {
        return this.__T;
    }

    /* renamed from: value */
    public int m105311x6ac9171() {
        return this.f56695x4a38f191;
    }

    /* renamed from: convert */
    public static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26753xaff1bb34 m105309x38b81db3(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26753xaff1bb34[] c26753xaff1bb34Arr = f56694xfce54102;
            if (i17 >= c26753xaff1bb34Arr.length) {
                return null;
            }
            if (c26753xaff1bb34Arr[i17].m105310x9616526c().equals(str)) {
                return f56694xfce54102[i17];
            }
            i17++;
        }
    }
}
