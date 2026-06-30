package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzi implements com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzm<java.lang.Void> {

    /* renamed from: val$extras */
    private final /* synthetic */ android.os.Bundle f5722xbe526546;
    private final /* synthetic */ java.lang.String zzt;

    public zzi(java.lang.String str, android.os.Bundle bundle) {
        this.zzt = str;
        this.f5722xbe526546 = bundle;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzm
    public final /* synthetic */ java.lang.Void zze(android.os.IBinder iBinder) {
        java.lang.Object zzd;
        zzd = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.zzg.zzd(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzi.zzd(iBinder).zzd(this.zzt, this.f5722xbe526546));
        android.os.Bundle bundle = (android.os.Bundle) zzd;
        java.lang.String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.C1636x9e992dae(string);
    }
}
