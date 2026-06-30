package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.ConnectionResult */
/* loaded from: classes13.dex */
public final class C1700xff0c58bb extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: API_DISABLED */
    public static final int f5795x68b57721 = 23;

    /* renamed from: API_DISABLED_FOR_CONNECTION */
    public static final int f5796xb48f8d12 = 24;

    /* renamed from: API_UNAVAILABLE */
    public static final int f5797x9cf7a16b = 16;

    /* renamed from: CANCELED */
    public static final int f5798x274e7499 = 13;

    /* renamed from: DEVELOPER_ERROR */
    public static final int f5800x75664d13 = 10;

    /* renamed from: DRIVE_EXTERNAL_STORAGE_REQUIRED */
    @java.lang.Deprecated
    public static final int f5801x7c105c62 = 1500;

    /* renamed from: INTERNAL_ERROR */
    public static final int f5802xe30e31e6 = 8;

    /* renamed from: INTERRUPTED */
    public static final int f5803xc3cc222 = 15;

    /* renamed from: INVALID_ACCOUNT */
    public static final int f5804x357673a5 = 5;

    /* renamed from: LICENSE_CHECK_FAILED */
    public static final int f5805xeeab1ad2 = 11;

    /* renamed from: NETWORK_ERROR */
    public static final int f5806xcb8ee077 = 7;

    /* renamed from: RESOLUTION_ACTIVITY_NOT_FOUND */
    public static final int f5807x6e202019 = 22;

    /* renamed from: RESOLUTION_REQUIRED */
    public static final int f5808x3cf969d2 = 6;

    /* renamed from: RESTRICTED_PROFILE */
    public static final int f5809x6ca025a5 = 20;

    /* renamed from: SERVICE_DISABLED */
    public static final int f5811x18fd20e6 = 3;

    /* renamed from: SERVICE_INVALID */
    public static final int f5812x859d122d = 9;

    /* renamed from: SERVICE_MISSING */
    public static final int f5813x508ba19c = 1;

    /* renamed from: SERVICE_MISSING_PERMISSION */
    public static final int f5814x22c48c52 = 19;

    /* renamed from: SERVICE_UPDATING */
    public static final int f5815x57ac2db0 = 18;

    /* renamed from: SERVICE_VERSION_UPDATE_REQUIRED */
    public static final int f5816x83982924 = 2;

    /* renamed from: SIGN_IN_FAILED */
    public static final int f5817x70326095 = 17;

    /* renamed from: SIGN_IN_REQUIRED */
    public static final int f5818xed6b3df7 = 4;

    /* renamed from: SUCCESS */
    public static final int f5819xbb80cbe3 = 0;

    /* renamed from: TIMEOUT */
    public static final int f5820xdc7ad941 = 14;

    /* renamed from: UNKNOWN */
    public static final int f5821x19d1382a = -1;
    final int zza;
    private final int zzb;
    private final android.app.PendingIntent zzc;
    private final java.lang.String zzd;

    /* renamed from: RESULT_SUCCESS */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb f5810x535c1c1 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(0);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb> f5799x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzb();

    public C1700xff0c58bb(int i17, int i18, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.zza = i17;
        this.zzb = i18;
        this.zzc = pendingIntent;
        this.zzd = str;
    }

    public static java.lang.String zza(int i17) {
        if (i17 == 99) {
            return "UNFINISHED";
        }
        if (i17 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i17) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i17) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.f6097xbb18f1ea;
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i17 + ")";
                }
        }
    }

    /* renamed from: equals */
    public boolean m17599xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb) obj;
        return this.zzb == c1700xff0c58bb.zzb && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zzc, c1700xff0c58bb.zzc) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zzd, c1700xff0c58bb.zzd);
    }

    /* renamed from: getErrorCode */
    public int m17600x130a215f() {
        return this.zzb;
    }

    /* renamed from: getErrorMessage */
    public java.lang.String m17601xa8aa7f55() {
        return this.zzd;
    }

    /* renamed from: getResolution */
    public android.app.PendingIntent m17602x8ee230a2() {
        return this.zzc;
    }

    /* renamed from: hasResolution */
    public boolean m17603xc9b9eee6() {
        return (this.zzb == 0 || this.zzc == null) ? false : true;
    }

    /* renamed from: hashCode */
    public int m17604x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    /* renamed from: isSuccess */
    public boolean m17605x6e268779() {
        return this.zzb == 0;
    }

    /* renamed from: startResolutionForResult */
    public void m17606x706e0338(android.app.Activity activity, int i17) {
        if (m17603xc9b9eee6()) {
            android.app.PendingIntent pendingIntent = this.zzc;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i17, null, 0, 0, 0);
        }
    }

    /* renamed from: toString */
    public java.lang.String m17607x9616526c() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.ToStringHelper m18191xbe50cd3a = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18191xbe50cd3a(this);
        m18191xbe50cd3a.add("statusCode", zza(this.zzb));
        m18191xbe50cd3a.add(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54473x7fe978e1, this.zzc);
        m18191xbe50cd3a.add(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, this.zzd);
        return m18191xbe50cd3a.m18192x9616526c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zza;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, i18);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 2, m17600x130a215f());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 3, m17602x8ee230a2(), i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 4, m17601xa8aa7f55(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C1700xff0c58bb(int i17) {
        this(i17, null, null);
    }

    public C1700xff0c58bb(int i17, android.app.PendingIntent pendingIntent) {
        this(i17, pendingIntent, null);
    }

    public C1700xff0c58bb(int i17, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this(1, i17, pendingIntent, str);
    }
}
