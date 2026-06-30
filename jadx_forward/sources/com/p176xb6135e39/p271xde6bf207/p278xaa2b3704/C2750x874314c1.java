package com.p176xb6135e39.p271xde6bf207.p278xaa2b3704;

/* renamed from: com.google.firebase.messaging.RemoteMessage */
/* loaded from: classes13.dex */
public final class C2750x874314c1 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p271xde6bf207.p278xaa2b3704.C2750x874314c1> f7866x681a0c0c = new eb.e();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f126197d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f126198e;

    public C2750x874314c1(android.os.Bundle bundle) {
        this.f126197d = bundle;
    }

    public final java.util.Map D() {
        if (this.f126198e == null) {
            this.f126198e = new x.b();
            android.os.Bundle bundle = this.f126197d;
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str);
                if (obj instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        this.f126198e.put(str, str2);
                    }
                }
            }
        }
        return this.f126198e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18315x3736d141(parcel, 2, this.f126197d, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}
