package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzaw */
/* loaded from: classes13.dex */
public final class C2501x394b76 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2501x394b76> f7572x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2502x394b77();

    /* renamed from: type */
    private final int f7573x368f3a;

    /* renamed from: zzcj */
    private final int f7574x394ba7;

    /* renamed from: zzck */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78 f7575x394ba8;
    private final int zzg;

    public C2501x394b76(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78 c2503x394b78, int i17, int i18, int i19) {
        this.f7575x394ba8 = c2503x394b78;
        this.f7573x368f3a = i17;
        this.zzg = i18;
        this.f7574x394ba7 = i19;
    }

    /* renamed from: toString */
    public final java.lang.String m19897x9616526c() {
        java.lang.String valueOf = java.lang.String.valueOf(this.f7575x394ba8);
        int i17 = this.f7573x368f3a;
        java.lang.String num = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? java.lang.Integer.toString(i17) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i18 = this.zzg;
        java.lang.String num2 = i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 3 ? java.lang.Integer.toString(i18) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i19 = this.f7574x394ba7;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 81 + java.lang.String.valueOf(num).length() + java.lang.String.valueOf(num2).length());
        sb6.append("ChannelEventParcelable[, channel=");
        sb6.append(valueOf);
        sb6.append(", type=");
        sb6.append(num);
        sb6.append(", closeReason=");
        sb6.append(num2);
        sb6.append(", appErrorCode=");
        sb6.append(i19);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 2, this.f7575x394ba8, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 3, this.f7573x368f3a);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 4, this.zzg);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 5, this.f7574x394ba7);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener) {
        int i17 = this.f7573x368f3a;
        if (i17 == 1) {
            channelListener.mo19676x81a407ad(this.f7575x394ba8);
            return;
        }
        if (i17 == 2) {
            channelListener.mo19675x6cf620b0(this.f7575x394ba8, this.zzg, this.f7574x394ba7);
        } else if (i17 == 3) {
            channelListener.mo19677xee922e77(this.f7575x394ba8, this.zzg, this.f7574x394ba7);
        } else {
            if (i17 != 4) {
                return;
            }
            channelListener.mo19678x51bded4c(this.f7575x394ba8, this.zzg, this.f7574x394ba7);
        }
    }
}
