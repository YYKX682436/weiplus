package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzhj */
/* loaded from: classes13.dex */
final class RunnableC2670x394c42 implements java.lang.Runnable {

    /* renamed from: zzco */
    private final /* synthetic */ android.net.Uri f7784x394bac;

    /* renamed from: zzcq */
    private final /* synthetic */ long f7785x394bae;

    /* renamed from: zzcr */
    private final /* synthetic */ long f7786x394baf;

    /* renamed from: zzcs */
    private final /* synthetic */ java.lang.String f7787x394bb0;

    /* renamed from: zzfh */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder f7788x394c02;

    /* renamed from: zzfi */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f f7789x394c03;

    public RunnableC2670x394c42(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f c2667x394c3f, android.net.Uri uri, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder resultHolder, java.lang.String str, long j17, long j18) {
        this.f7789x394c03 = c2667x394c3f;
        this.f7784x394bac = uri;
        this.f7788x394c02 = resultHolder;
        this.f7787x394bb0 = str;
        this.f7785x394bae = j17;
        this.f7786x394baf = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder resultHolder;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12;
        android.util.Log.isLoggable("WearableClient", 2);
        if ("file".equals(this.f7784x394bac.getScheme())) {
            java.io.File file = new java.io.File(this.f7784x394bac.getPath());
            try {
                android.os.ParcelFileDescriptor open = android.os.ParcelFileDescriptor.open(file, 268435456);
                try {
                    try {
                        ((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb) this.f7789x394c03.m18108xb411027f()).zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2663x394c3b(this.f7788x394c02), this.f7787x394bb0, open, this.f7785x394bae, this.f7786x394baf);
                        try {
                            open.close();
                            return;
                        } catch (java.io.IOException unused) {
                            return;
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            open.close();
                        } catch (java.io.IOException unused2) {
                        }
                        throw th6;
                    }
                } catch (android.os.RemoteException unused3) {
                    this.f7788x394c02.mo17877x921f43c(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(8));
                    try {
                        open.close();
                        return;
                    } catch (java.io.IOException unused4) {
                        return;
                    }
                }
            } catch (java.io.FileNotFoundException unused5) {
                new java.lang.StringBuilder(java.lang.String.valueOf(file).length() + 46);
                resultHolder = this.f7788x394c02;
                c1763x9432bc12 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(13);
            }
        } else {
            resultHolder = this.f7788x394c02;
            c1763x9432bc12 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(10, "Channel.sendFile used with non-file URI");
        }
        resultHolder.mo17877x921f43c(c1763x9432bc12);
    }
}
