package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441;

/* renamed from: com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse */
/* loaded from: classes13.dex */
public abstract class AbstractC1977x5d6c1755 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.InterfaceC1940x58398470 {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m18482xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5 abstractC1975xf0edc3e5 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5) obj;
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field : mo17356xb4d428c9().values()) {
            if (mo17358x9957f052(field)) {
                if (!abstractC1975xf0edc3e5.mo17358x9957f052(field) || !com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(mo17357x101b448d(field), abstractC1975xf0edc3e5.mo17357x101b448d(field))) {
                    return false;
                }
            } else if (abstractC1975xf0edc3e5.mo17358x9957f052(field)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: getValueObject */
    public java.lang.Object mo18459x7d17ceda(java.lang.String str) {
        return null;
    }

    /* renamed from: hashCode */
    public int m18483x8cdac1b() {
        int i17 = 0;
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> field : mo17356xb4d428c9().values()) {
            if (mo17358x9957f052(field)) {
                i17 = (i17 * 31) + com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(mo17357x101b448d(field)).hashCode();
            }
        }
        return i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5
    /* renamed from: isPrimitiveFieldSet */
    public boolean mo18460x9e40cf05(java.lang.String str) {
        return false;
    }

    /* renamed from: toByteArray */
    public byte[] mo18484x5f01b1f6() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
