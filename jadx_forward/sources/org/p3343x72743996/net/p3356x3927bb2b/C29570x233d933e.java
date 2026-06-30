package org.p3343x72743996.net.p3356x3927bb2b;

/* renamed from: org.chromium.net.apihelpers.CronetResponse */
/* loaded from: classes7.dex */
public class C29570x233d933e<T> {

    /* renamed from: mResponseBody */
    private final T f74361xed55d290;

    /* renamed from: mUrlResponseInfo */
    private final org.p3343x72743996.net.AbstractC29564x6974077e f74362x748f7f71;

    public C29570x233d933e(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, T t17) {
        this.f74362x748f7f71 = abstractC29564x6974077e;
        this.f74361xed55d290 = t17;
    }

    /* renamed from: equals */
    public boolean m153728xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.p3343x72743996.net.p3356x3927bb2b.C29570x233d933e)) {
            return false;
        }
        org.p3343x72743996.net.p3356x3927bb2b.C29570x233d933e c29570x233d933e = (org.p3343x72743996.net.p3356x3927bb2b.C29570x233d933e) obj;
        return java.util.Objects.equals(this.f74362x748f7f71, c29570x233d933e.f74362x748f7f71) && java.util.Objects.equals(this.f74361xed55d290, c29570x233d933e.f74361xed55d290);
    }

    /* renamed from: getResponseBody */
    public T m153729xb6b34bf9() {
        return this.f74361xed55d290;
    }

    /* renamed from: getUrlResponseInfo */
    public org.p3343x72743996.net.AbstractC29564x6974077e m153730x89432168() {
        return this.f74362x748f7f71;
    }

    /* renamed from: hashCode */
    public int m153731x8cdac1b() {
        return java.util.Objects.hash(this.f74362x748f7f71, this.f74361xed55d290);
    }
}
