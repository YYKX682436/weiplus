package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d;

/* loaded from: classes13.dex */
public abstract class zze extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zze implements com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.p191xb9d38a2d.zzd {
    public zze() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zze
    /* renamed from: dispatchTransaction */
    public final boolean mo17328x87078604(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            zzf((android.accounts.Account) com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(parcel, android.accounts.Account.CREATOR));
        } else {
            if (i17 != 2) {
                return false;
            }
            zzd(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.zzd(parcel));
        }
        return true;
    }
}
