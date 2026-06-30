package com.p176xb6135e39.p177xcca8366f.gms.p235x38927740;

/* loaded from: classes13.dex */
final class zza extends android.os.AsyncTask {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p235x38927740.C2419x8fa6b077.ProviderInstallListener zzb;

    public zza(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p235x38927740.C2419x8fa6b077.ProviderInstallListener providerInstallListener) {
        this.zza = context;
        this.zzb = providerInstallListener;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] objArr) {
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p235x38927740.C2419x8fa6b077.m19509xcdf275ed(this.zza);
            return 0;
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1710x6991fbce e17) {
            return java.lang.Integer.valueOf(e17.f5831x139cb015);
        } catch (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1711xec211afd e18) {
            return java.lang.Integer.valueOf(e18.m17652x4e7042f3());
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(java.lang.Object obj) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a c1706xe937257a;
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num.intValue() == 0) {
            this.zzb.m19512x33363c6a();
            return;
        }
        android.content.Context context = this.zza;
        c1706xe937257a = com.p176xb6135e39.p177xcca8366f.gms.p235x38927740.C2419x8fa6b077.zza;
        this.zzb.m19511xc6aed2a8(num.intValue(), c1706xe937257a.mo17626x91cd42da(context, num.intValue(), "pi"));
    }
}
