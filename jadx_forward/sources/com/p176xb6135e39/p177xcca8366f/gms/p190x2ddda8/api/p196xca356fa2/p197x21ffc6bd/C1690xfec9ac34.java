package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* renamed from: com.google.android.gms.auth.api.signin.internal.SignInConfiguration */
/* loaded from: classes13.dex */
public final class C1690xfec9ac34 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1690xfec9ac34> f5682x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzy();

    /* renamed from: zzfe */
    private final java.lang.String f5683x394bff;

    /* renamed from: zzff */
    private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 f5684x394c00;

    public C1690xfec9ac34(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3) {
        this.f5683x394bff = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        this.f5684x394c00 = c1682x64d992a3;
    }

    /* renamed from: equals */
    public final boolean m17548xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1690xfec9ac34 c1690xfec9ac34 = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1690xfec9ac34) obj;
            if (this.f5683x394bff.equals(c1690xfec9ac34.f5683x394bff)) {
                com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3 = this.f5684x394c00;
                if (c1682x64d992a3 == null) {
                    if (c1690xfec9ac34.f5684x394c00 == null) {
                        return true;
                    }
                } else if (c1682x64d992a3.m17511xb2c87fbf(c1690xfec9ac34.f5684x394c00)) {
                    return true;
                }
            }
        } catch (java.lang.ClassCastException unused) {
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m17549x8cdac1b() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1689x8a6cf278().m17545xf8384b40(this.f5683x394bff).m17545xf8384b40(this.f5684x394c00).m17546x30c10e();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, this.f5683x394bff, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 5, this.f5684x394c00, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 zzt() {
        return this.f5684x394c00;
    }
}
