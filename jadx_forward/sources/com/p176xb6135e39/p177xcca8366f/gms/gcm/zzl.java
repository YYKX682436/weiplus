package com.p176xb6135e39.p177xcca8366f.gms.gcm;

/* loaded from: classes13.dex */
public final class zzl {

    /* renamed from: zzao */
    public static final com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl f6088x394b6e = new com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl(0, 30, 3600);

    /* renamed from: zzap */
    private static final com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl f6089x394b6f = new com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl(1, 30, 3600);

    /* renamed from: zzaq */
    private final int f6090x394b70;

    /* renamed from: zzar */
    private final int f6091x394b71 = 30;

    /* renamed from: zzas */
    private final int f6092x394b72 = 3600;

    private zzl(int i17, int i18, int i19) {
        this.f6090x394b70 = i17;
    }

    /* renamed from: equals */
    public final boolean m18750xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl zzlVar = (com.p176xb6135e39.p177xcca8366f.gms.gcm.zzl) obj;
        return zzlVar.f6090x394b70 == this.f6090x394b70 && zzlVar.f6091x394b71 == this.f6091x394b71 && zzlVar.f6092x394b72 == this.f6092x394b72;
    }

    /* renamed from: hashCode */
    public final int m18751x8cdac1b() {
        return (((((this.f6090x394b70 + 1) ^ 1000003) * 1000003) ^ this.f6091x394b71) * 1000003) ^ this.f6092x394b72;
    }

    /* renamed from: toString */
    public final java.lang.String m18752x9616526c() {
        int i17 = this.f6090x394b70;
        int i18 = this.f6091x394b71;
        int i19 = this.f6092x394b72;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(74);
        sb6.append("policy=");
        sb6.append(i17);
        sb6.append(" initial_backoff=");
        sb6.append(i18);
        sb6.append(" maximum_backoff=");
        sb6.append(i19);
        return sb6.toString();
    }

    public final android.os.Bundle zzf(android.os.Bundle bundle) {
        bundle.putInt("retry_policy", this.f6090x394b70);
        bundle.putInt("initial_backoff_seconds", this.f6091x394b71);
        bundle.putInt("maximum_backoff_seconds", this.f6092x394b72);
        return bundle;
    }

    public final int zzh() {
        return this.f6090x394b70;
    }

    public final int zzi() {
        return this.f6091x394b71;
    }

    public final int zzj() {
        return this.f6092x394b72;
    }
}
