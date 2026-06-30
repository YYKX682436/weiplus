package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d;

/* loaded from: classes13.dex */
public final class zzh extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzd implements com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d.zzf {
    public zzh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d.zzf
    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d.zzd zzdVar, android.accounts.Account account) {
        android.os.Parcel m18796x3e4375ad = m18796x3e4375ad();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(m18796x3e4375ad, zzdVar);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(m18796x3e4375ad, account);
        m18798x8523f7d0(3, m18796x3e4375ad);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d.zzf
    public final void zze(boolean z17) {
        android.os.Parcel m18796x3e4375ad = m18796x3e4375ad();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(m18796x3e4375ad, z17);
        m18798x8523f7d0(1, m18796x3e4375ad);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d.zzf
    public final void zzd(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d.zzd zzdVar, java.lang.String str) {
        android.os.Parcel m18796x3e4375ad = m18796x3e4375ad();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(m18796x3e4375ad, zzdVar);
        m18796x3e4375ad.writeString(str);
        m18798x8523f7d0(2, m18796x3e4375ad);
    }
}
