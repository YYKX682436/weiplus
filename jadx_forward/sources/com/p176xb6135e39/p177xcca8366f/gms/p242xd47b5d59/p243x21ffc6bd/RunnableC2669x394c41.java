package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzhi */
/* loaded from: classes13.dex */
final class RunnableC2669x394c41 implements java.lang.Runnable {

    /* renamed from: zzco */
    private final /* synthetic */ android.net.Uri f7779x394bac;

    /* renamed from: zzcp */
    private final /* synthetic */ boolean f7780x394bad;

    /* renamed from: zzcs */
    private final /* synthetic */ java.lang.String f7781x394bb0;

    /* renamed from: zzfh */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder f7782x394c02;

    /* renamed from: zzfi */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f f7783x394c03;

    public RunnableC2669x394c41(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f c2667x394c3f, android.net.Uri uri, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder resultHolder, boolean z17, java.lang.String str) {
        this.f7783x394c03 = c2667x394c3f;
        this.f7779x394bac = uri;
        this.f7782x394c02 = resultHolder;
        this.f7780x394bad = z17;
        this.f7781x394bb0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ResultHolder resultHolder;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12;
        android.util.Log.isLoggable("WearableClient", 2);
        if ("file".equals(this.f7779x394bac.getScheme())) {
            java.io.File file = new java.io.File(this.f7779x394bac.getPath());
            try {
                android.os.ParcelFileDescriptor open = android.os.ParcelFileDescriptor.open(file, (this.f7780x394bad ? com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432 : 0) | com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32753xe3901aa2);
                try {
                    try {
                        ((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2598x394beb) this.f7783x394c03.m18108xb411027f()).zza(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.BinderC2666x394c3e(this.f7782x394c02), this.f7781x394bb0, open);
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
                    this.f7782x394c02.mo17877x921f43c(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(8));
                    try {
                        open.close();
                        return;
                    } catch (java.io.IOException unused4) {
                        return;
                    }
                }
            } catch (java.io.FileNotFoundException unused5) {
                new java.lang.StringBuilder(java.lang.String.valueOf(file).length() + 49);
                resultHolder = this.f7782x394c02;
                c1763x9432bc12 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(13);
            }
        } else {
            resultHolder = this.f7782x394c02;
            c1763x9432bc12 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(10, "Channel.receiveFile used with non-file URI");
        }
        resultHolder.mo17877x921f43c(c1763x9432bc12);
    }
}
