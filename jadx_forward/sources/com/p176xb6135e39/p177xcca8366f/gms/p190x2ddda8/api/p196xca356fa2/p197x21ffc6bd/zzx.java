package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzx extends com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzs {

    /* renamed from: mContext */
    private final android.content.Context f5707xd6cfe882;

    public zzx(android.content.Context context) {
        this.f5707xd6cfe882 = context;
    }

    private final void zzs() {
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1713x90a1c9c9.m17681x6510ccbb(this.f5707xd6cfe882, android.os.Binder.getCallingUid())) {
            return;
        }
        int callingUid = android.os.Binder.getCallingUid();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(52);
        sb6.append("Calling UID ");
        sb6.append(callingUid);
        sb6.append(" is not Google Play services.");
        throw new java.lang.SecurityException(sb6.toString());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzr
    public final void zzq() {
        zzs();
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b m17551x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.C1692xf2e8da5b.m17551x9cf0d20b(this.f5707xd6cfe882);
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17553xc1f1cc02 = m17551x9cf0d20b.m17553xc1f1cc02();
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.f5669xbb03bac9;
        if (m17553xc1f1cc02 != null) {
            c1682x64d992a3 = m17551x9cf0d20b.m17554xbda4c873();
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c m17804x59bc66e = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder(this.f5707xd6cfe882).m17798xab35b9b9(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.C1645x1f51c8.f5373xf9fae79c, c1682x64d992a3).m17804x59bc66e();
        try {
            if (m17804x59bc66e.mo17769x9eb66ef5().m17605x6e268779()) {
                if (m17553xc1f1cc02 != null) {
                    com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.C1645x1f51c8.f5374x45dd509f.mo17500xcd5c338a(m17804x59bc66e);
                } else {
                    m17804x59bc66e.mo17771xd7f4e239();
                }
            }
        } finally {
            m17804x59bc66e.mo17774x1f9d589c();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzr
    public final void zzr() {
        zzs();
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq.zze(this.f5707xd6cfe882).m17569x5a5b64d();
    }
}
