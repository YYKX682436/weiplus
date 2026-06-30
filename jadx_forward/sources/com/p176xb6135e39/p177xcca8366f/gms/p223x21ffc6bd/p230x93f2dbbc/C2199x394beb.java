package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzep */
/* loaded from: classes16.dex */
public final class C2199x394beb {

    /* renamed from: name */
    final java.lang.String f6510x337a8b;

    /* renamed from: origin */
    private final java.lang.String f6511xc3e1af26;

    /* renamed from: timestamp */
    final long f6512x3492916;

    /* renamed from: zzafp */
    final long f6513x6f021ab;

    /* renamed from: zzafq */
    final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed f6514x6f021ac;

    /* renamed from: zzti */
    final java.lang.String f6515x394db5;

    public C2199x394beb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed c2201x394bed;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str3);
        this.f6515x394db5 = str2;
        this.f6510x337a8b = str3;
        this.f6511xc3e1af26 = android.text.TextUtils.isEmpty(str) ? null : str;
        this.f6512x3492916 = j17;
        this.f6513x6f021ab = j18;
        if (j18 != 0 && j18 > j17) {
            c2247x394c25.mo18976x394c1e().m19111x394c67().zzg("Event created with reverse previous/current timestamps. appId", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c2201x394bed = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed(new android.os.Bundle());
        } else {
            android.os.Bundle bundle2 = new android.os.Bundle(bundle);
            java.util.Iterator<java.lang.String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (next == null) {
                    c2247x394c25.mo18976x394c1e().m19108x394c64().log("Param name can't be null");
                } else {
                    java.lang.Object zzh = c2247x394c25.mo19173x394c1b().zzh(next, bundle2.get(next));
                    if (zzh == null) {
                        c2247x394c25.mo18976x394c1e().m19111x394c67().zzg("Param value can't be null", c2247x394c25.mo19172x394c1a().m19102x394b89(next));
                    } else {
                        c2247x394c25.mo19173x394c1b().zza(bundle2, next, zzh);
                    }
                }
                it.remove();
            }
            c2201x394bed = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed(bundle2);
        }
        this.f6514x6f021ac = c2201x394bed;
    }

    /* renamed from: toString */
    public final java.lang.String m19072x9616526c() {
        java.lang.String str = this.f6515x394db5;
        java.lang.String str2 = this.f6510x337a8b;
        java.lang.String valueOf = java.lang.String.valueOf(this.f6514x6f021ac);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 33 + java.lang.String.valueOf(str2).length() + valueOf.length());
        sb6.append("Event{appId='");
        sb6.append(str);
        sb6.append("', name='");
        sb6.append(str2);
        sb6.append("', params=");
        sb6.append(valueOf);
        sb6.append('}');
        return sb6.toString();
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2199x394beb zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25, long j17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2199x394beb(c2247x394c25, this.f6511xc3e1af26, this.f6515x394db5, this.f6510x337a8b, this.f6512x3492916, j17, this.f6514x6f021ac);
    }

    private C2199x394beb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2201x394bed c2201x394bed) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str2);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str3);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2201x394bed);
        this.f6515x394db5 = str2;
        this.f6510x337a8b = str3;
        this.f6511xc3e1af26 = android.text.TextUtils.isEmpty(str) ? null : str;
        this.f6512x3492916 = j17;
        this.f6513x6f021ab = j18;
        if (j18 != 0 && j18 > j17) {
            c2247x394c25.mo18976x394c1e().m19111x394c67().zze("Event created with reverse previous/current timestamps. appId, name", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str2), com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(str3));
        }
        this.f6514x6f021ac = c2201x394bed;
    }
}
