package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzl implements com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzm<java.lang.Boolean> {
    private final /* synthetic */ java.lang.String zzw;

    public zzl(java.lang.String str) {
        this.zzw = str;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzm
    public final /* synthetic */ java.lang.Boolean zze(android.os.IBinder iBinder) {
        java.lang.Object zzd;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p209x1466cb5f.C1959x87fce1b0 c1959x87fce1b0;
        zzd = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.zzd(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzi.zzd(iBinder).zzd(this.zzw));
        android.os.Bundle bundle = (android.os.Bundle) zzd;
        java.lang.String string = bundle.getString("Error");
        android.content.Intent intent = (android.content.Intent) bundle.getParcelable("userRecoveryIntent");
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90 zzh = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90.zzh(string);
        if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90.SUCCESS.equals(zzh)) {
            return java.lang.Boolean.TRUE;
        }
        if (!com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.EnumC2105x394b90.zzd(zzh)) {
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
