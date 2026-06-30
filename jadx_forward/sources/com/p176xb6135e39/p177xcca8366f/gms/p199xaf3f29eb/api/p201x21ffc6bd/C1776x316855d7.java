package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.common.api.internal.GoogleServices */
/* loaded from: classes13.dex */
public final class C1776x316855d7 {
    private static final java.lang.Object zza = new java.lang.Object();
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1776x316855d7 zzb;
    private final java.lang.String zzc;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zzd;
    private final boolean zze;
    private final boolean zzf;

    public C1776x316855d7(java.lang.String str, boolean z17) {
        this.zzc = str;
        this.zzd = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5903x535c1c1;
        this.zze = z17;
        this.zzf = !z17;
    }

    /* renamed from: checkInitialized */
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1776x316855d7 m17892xf9ef74ac(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1776x316855d7 c1776x316855d7;
        synchronized (zza) {
            c1776x316855d7 = zzb;
            if (c1776x316855d7 == null) {
                throw new java.lang.IllegalStateException("Initialize must be called before " + str + ".");
            }
        }
        return c1776x316855d7;
    }

    /* renamed from: clearInstanceForTest */
    public static void m17893x25e05899() {
        synchronized (zza) {
            zzb = null;
        }
    }

    /* renamed from: getGoogleAppId */
    public static java.lang.String m17894xc43a732d() {
        return m17892xf9ef74ac("getGoogleAppId").zzc;
    }

    /* renamed from: initialize */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 m17895x33ebcb90(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "Context must not be null.");
        synchronized (zza) {
            if (zzb == null) {
                zzb = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1776x316855d7(context);
            }
            c1763x9432bc12 = zzb.zzd;
        }
        return c1763x9432bc12;
    }

    /* renamed from: isMeasurementEnabled */
    public static boolean m17897x38846eaf() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1776x316855d7 m17892xf9ef74ac = m17892xf9ef74ac("isMeasurementEnabled");
        return m17892xf9ef74ac.zzd.m17855x6e268779() && m17892xf9ef74ac.zze;
    }

    /* renamed from: isMeasurementExplicitlyDisabled */
    public static boolean m17898xd80a502f() {
        return m17892xf9ef74ac("isMeasurementExplicitlyDisabled").zzf;
    }

    /* renamed from: checkGoogleAppId */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 m17899x9ac5fa3b(java.lang.String str) {
        java.lang.String str2 = this.zzc;
        if (str2 == null || str2.equals(str)) {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5903x535c1c1;
        }
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + this.zzc + "'.");
    }

    public C1776x316855d7(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.R.C1721xcad56011.f5845xcb01d1bc));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z17 = integer == 0;
            r2 = integer != 0;
            this.zzf = z17;
        } else {
            this.zzf = false;
        }
        this.zze = r2;
        java.lang.String zzb2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1954x394b67.zzb(context);
        zzb2 = zzb2 == null ? new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1930x4f90b0b5(context).m18233x2fec8307("google_app_id") : zzb2;
        if (android.text.TextUtils.isEmpty(zzb2)) {
            this.zzd = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzc = null;
        } else {
            this.zzc = zzb2;
            this.zzd = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5903x535c1c1;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: initialize */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 m17896x33ebcb90(android.content.Context context, java.lang.String str, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "Context must not be null.");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(str, "App ID must be nonempty.");
        synchronized (zza) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1776x316855d7 c1776x316855d7 = zzb;
            if (c1776x316855d7 != null) {
                return c1776x316855d7.m17899x9ac5fa3b(str);
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1776x316855d7 c1776x316855d72 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1776x316855d7(str, z17);
            zzb = c1776x316855d72;
            return c1776x316855d72.zzd;
        }
    }
}
