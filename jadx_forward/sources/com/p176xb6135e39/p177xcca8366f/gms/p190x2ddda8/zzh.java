package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzh implements com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzm<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923> {

    /* renamed from: val$options */
    private final /* synthetic */ android.os.Bundle f5721xf4dec1b;
    private final /* synthetic */ android.accounts.Account zzr;
    private final /* synthetic */ java.lang.String zzs;

    public zzh(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        this.zzr = account;
        this.zzs = str;
        this.f5721xf4dec1b = bundle;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzm
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923 zze(android.os.IBinder iBinder) {
        java.lang.Object zzd;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0 c1959x87fce1b0;
        zzd = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.zzd(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzi.zzd(iBinder).zzd(this.zzr, this.zzs, this.f5721xf4dec1b));
        android.os.Bundle bundle = (android.os.Bundle) zzd;
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923 zzd2 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1639x7fd99923.zzd(bundle, "tokenDetails");
        if (zzd2 != null) {
            return zzd2;
        }
        java.lang.String string = bundle.getString("Error");
        android.content.Intent intent = (android.content.Intent) bundle.getParcelable("userRecoveryIntent");
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90 zzh = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90.zzh(string);
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90.zzd(zzh)) {
            if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90.NETWORK_ERROR.equals(zzh) || com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90.SERVICE_UNAVAILABLE.equals(zzh)) {
                throw new java.io.IOException(string);
            }
            throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1636x9e992dae(string);
        }
        c1959x87fce1b0 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.zzq;
        java.lang.String valueOf = java.lang.String.valueOf(zzh);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 31);
        sb6.append("isUserRecoverableError status: ");
        sb6.append(valueOf);
        c1959x87fce1b0.w("GoogleAuthUtil", sb6.toString());
        throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1640xc0e88674(string, intent);
    }
}
