package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.Status */
/* loaded from: classes13.dex */
public final class C1763x9432bc12 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {
    private final int zzb;
    private final java.lang.String zzc;
    private final android.app.PendingIntent zzd;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zze;

    /* renamed from: RESULT_SUCCESS_CACHE */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 f5904xa39ec764 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(-1);

    /* renamed from: RESULT_SUCCESS */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 f5903x535c1c1 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(0);

    /* renamed from: RESULT_INTERRUPTED */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 f5902xe4a79900 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(14);

    /* renamed from: RESULT_INTERNAL_ERROR */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 f5901x9c108648 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(8);

    /* renamed from: RESULT_TIMEOUT */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 f5905x262fcf1f = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(15);

    /* renamed from: RESULT_CANCELED */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 f5899x14383a7b = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(16);
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(17);

    /* renamed from: RESULT_DEAD_CLIENT */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 f5900x923bcee4 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(18);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> f5898x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zzb();

    public C1763x9432bc12(int i17, java.lang.String str, android.app.PendingIntent pendingIntent, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        this.zzb = i17;
        this.zzc = str;
        this.zzd = pendingIntent;
        this.zze = c1700xff0c58bb;
    }

    /* renamed from: equals */
    public boolean m17846xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12) obj;
        return this.zzb == c1763x9432bc12.zzb && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zzc, c1763x9432bc12.zzc) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zzd, c1763x9432bc12.zzd) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zze, c1763x9432bc12.zze);
    }

    /* renamed from: getConnectionResult */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb m17847xd9207c11() {
        return this.zze;
    }

    /* renamed from: getResolution */
    public android.app.PendingIntent m17848x8ee230a2() {
        return this.zzd;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d
    /* renamed from: getStatus */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 mo17538x2fe4f2e8() {
        return this;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: getStatusCode */
    public int m17849xfd0160f5() {
        return this.zzb;
    }

    /* renamed from: getStatusMessage */
    public java.lang.String m17850x843b0fff() {
        return this.zzc;
    }

    /* renamed from: hasResolution */
    public boolean m17851xc9b9eee6() {
        return this.zzd != null;
    }

    /* renamed from: hashCode */
    public int m17852x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    /* renamed from: isCanceled */
    public boolean m17853xc9602be3() {
        return this.zzb == 16;
    }

    /* renamed from: isInterrupted */
    public boolean m17854x37ddcab8() {
        return this.zzb == 14;
    }

    /* renamed from: isSuccess */
    public boolean m17855x6e268779() {
        return this.zzb <= 0;
    }

    /* renamed from: startResolutionForResult */
    public void m17856x706e0338(android.app.Activity activity, int i17) {
        if (m17851xc9b9eee6()) {
            android.app.PendingIntent pendingIntent = this.zzd;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i17, null, 0, 0, 0);
        }
    }

    /* renamed from: toString */
    public java.lang.String m17858x9616526c() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.ToStringHelper m18191xbe50cd3a = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18191xbe50cd3a(this);
        m18191xbe50cd3a.add("statusCode", zza());
        m18191xbe50cd3a.add(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54473x7fe978e1, this.zzd);
        return m18191xbe50cd3a.m18192x9616526c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, m17849xfd0160f5());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, m17850x843b0fff(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 3, this.zzd, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 4, m17847xd9207c11(), i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final java.lang.String zza() {
        java.lang.String str = this.zzc;
        return str != null ? str : com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1744x3e726449.m17735x30a6166(this.zzb);
    }

    public C1763x9432bc12(int i17) {
        this(i17, (java.lang.String) null);
    }

    public C1763x9432bc12(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, java.lang.String str) {
        this(c1700xff0c58bb, str, 17);
    }

    /* renamed from: startResolutionForResult */
    public void m17857x706e0338(p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c cVar) {
        if (m17851xc9b9eee6()) {
            android.app.PendingIntent pendingIntent = this.zzd;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(pendingIntent);
            cVar.a(new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0061xc6e4d93e(pendingIntent.getIntentSender(), null, 0, 0), null);
        }
    }

    public C1763x9432bc12(int i17, java.lang.String str) {
        this(i17, str, (android.app.PendingIntent) null);
    }

    @java.lang.Deprecated
    public C1763x9432bc12(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, java.lang.String str, int i17) {
        this(i17, str, c1700xff0c58bb.m17602x8ee230a2(), c1700xff0c58bb);
    }

    public C1763x9432bc12(int i17, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(i17, str, pendingIntent, null);
    }
}
