package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.ErrorInfo */
/* loaded from: classes13.dex */
public class C25535x8b1186b6 {

    /* renamed from: errMsg */
    public final java.lang.String f46682xb2d4efdc;

    /* renamed from: errno */
    public final int f46683x5c4d1e6;

    public C25535x8b1186b6(int i17) {
        this(i17, null);
    }

    /* renamed from: equals */
    public boolean m95562xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f46683x5c4d1e6 == ((com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25535x8b1186b6) obj).f46683x5c4d1e6;
    }

    /* renamed from: hashCode */
    public int m95563x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f46683x5c4d1e6));
    }

    /* renamed from: isOk */
    public boolean m95564x3174a6() {
        return this.f46683x5c4d1e6 == 0;
    }

    /* renamed from: toJsonString */
    public java.lang.String m95565x9d6b37f4() {
        return "{'errno':" + this.f46683x5c4d1e6 + ",'errMsg'='" + this.f46682xb2d4efdc + "'}";
    }

    /* renamed from: toString */
    public java.lang.String m95566x9616526c() {
        return "ErrorInfo{errno=" + this.f46683x5c4d1e6 + ", errMsg='" + this.f46682xb2d4efdc + "'}";
    }

    public C25535x8b1186b6(int i17, java.lang.String str) {
        this.f46683x5c4d1e6 = i17;
        this.f46682xb2d4efdc = str;
    }

    public C25535x8b1186b6(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872 c25536x34648872) {
        this.f46683x5c4d1e6 = c25536x34648872.f46695x139cb015;
        this.f46682xb2d4efdc = c25536x34648872.f46696x47b7ecdf;
    }
}
