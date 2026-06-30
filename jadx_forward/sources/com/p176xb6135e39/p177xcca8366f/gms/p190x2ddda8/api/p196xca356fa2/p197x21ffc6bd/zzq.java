package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzq {

    /* renamed from: zzfa */
    private static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq f5703x394bfb;

    /* renamed from: zzfb */
    private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b f5704x394bfc;

    /* renamed from: zzfc */
    private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 f5705x394bfd;

    /* renamed from: zzfd */
    private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 f5706x394bfe;

    private zzq(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b m17551x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b.m17551x9cf0d20b(context);
        this.f5704x394bfc = m17551x9cf0d20b;
        this.f5705x394bfd = m17551x9cf0d20b.m17553xc1f1cc02();
        this.f5706x394bfe = this.f5704x394bfc.m17554xbda4c873();
    }

    public static synchronized com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq zze(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq zzf;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq.class) {
            zzf = zzf(context.getApplicationContext());
        }
        return zzf;
    }

    private static synchronized com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq zzf(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq zzqVar;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq.class) {
            if (f5703x394bfb == null) {
                f5703x394bfb = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq(context);
            }
            zzqVar = f5703x394bfb;
        }
        return zzqVar;
    }

    /* renamed from: clear */
    public final synchronized void m17569x5a5b64d() {
        this.f5704x394bfc.m17552x5a5b64d();
        this.f5705x394bfd = null;
        this.f5706x394bfe = null;
    }

    public final synchronized void zzd(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632) {
        this.f5704x394bfc.m17556xe67fb9ae(c1679x69269632, c1682x64d992a3);
        this.f5705x394bfd = c1679x69269632;
        this.f5706x394bfe = c1682x64d992a3;
    }

    public final synchronized com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 zzo() {
        return this.f5705x394bfd;
    }

    public final synchronized com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 zzp() {
        return this.f5706x394bfe;
    }
}
