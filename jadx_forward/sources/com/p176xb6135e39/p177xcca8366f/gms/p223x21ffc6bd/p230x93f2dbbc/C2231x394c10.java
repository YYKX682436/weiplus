package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzfv */
/* loaded from: classes16.dex */
public final class C2231x394c10 {

    /* renamed from: zzabj */
    private final long f6678x6f02129;

    /* renamed from: zzakq */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c f6679x6f02247;

    /* renamed from: zzaks */
    private final java.lang.String f6680x6f02249;

    /* renamed from: zzakt */
    private final java.lang.String f6681x6f0224a;

    /* renamed from: zzaku */
    private final java.lang.String f6682x6f0224b;

    private C2231x394c10(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c c2227x394c0c, java.lang.String str, long j17) {
        this.f6679x6f02247 = c2227x394c0c;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18197x312c1fe5(j17 > 0);
        this.f6680x6f02249 = java.lang.String.valueOf(str).concat(":start");
        this.f6681x6f0224a = java.lang.String.valueOf(str).concat(":count");
        this.f6682x6f0224b = java.lang.String.valueOf(str).concat(":value");
        this.f6678x6f02129 = j17;
    }

    /* renamed from: zzfh */
    private final void m19136x394c02() {
        android.content.SharedPreferences m19123x394c70;
        this.f6679x6f02247.mo18961x394b61();
        long mo18536x5cbba1cc = this.f6679x6f02247.mo18962x394b92().mo18536x5cbba1cc();
        m19123x394c70 = this.f6679x6f02247.m19123x394c70();
        android.content.SharedPreferences.Editor edit = m19123x394c70.edit();
        edit.remove(this.f6681x6f0224a);
        edit.remove(this.f6682x6f0224b);
        edit.putLong(this.f6680x6f02249, mo18536x5cbba1cc);
        edit.apply();
    }

    /* renamed from: zzfj */
    private final long m19137x394c04() {
        android.content.SharedPreferences m19123x394c70;
        m19123x394c70 = this.f6679x6f02247.m19123x394c70();
        return m19123x394c70.getLong(this.f6680x6f02249, 0L);
    }

    public final void zzc(java.lang.String str, long j17) {
        android.content.SharedPreferences m19123x394c70;
        android.content.SharedPreferences m19123x394c702;
        android.content.SharedPreferences m19123x394c703;
        this.f6679x6f02247.mo18961x394b61();
        if (m19137x394c04() == 0) {
            m19136x394c02();
        }
        if (str == null) {
            str = "";
        }
        m19123x394c70 = this.f6679x6f02247.m19123x394c70();
        long j18 = m19123x394c70.getLong(this.f6681x6f0224a, 0L);
        if (j18 <= 0) {
            m19123x394c703 = this.f6679x6f02247.m19123x394c70();
            android.content.SharedPreferences.Editor edit = m19123x394c703.edit();
            edit.putString(this.f6682x6f0224b, str);
            edit.putLong(this.f6681x6f0224a, 1L);
            edit.apply();
            return;
        }
        long j19 = j18 + 1;
        boolean z17 = (this.f6679x6f02247.mo18973x394c1b().m19291x394cb7().nextLong() & com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) < com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 / j19;
        m19123x394c702 = this.f6679x6f02247.m19123x394c70();
        android.content.SharedPreferences.Editor edit2 = m19123x394c702.edit();
        if (z17) {
            edit2.putString(this.f6682x6f0224b, str);
        }
        edit2.putLong(this.f6681x6f0224a, j19);
        edit2.apply();
    }

    /* renamed from: zzfi */
    public final android.util.Pair<java.lang.String, java.lang.Long> m19138x394c03() {
        long abs;
        android.content.SharedPreferences m19123x394c70;
        android.content.SharedPreferences m19123x394c702;
        this.f6679x6f02247.mo18961x394b61();
        this.f6679x6f02247.mo18961x394b61();
        long m19137x394c04 = m19137x394c04();
        if (m19137x394c04 == 0) {
            m19136x394c02();
            abs = 0;
        } else {
            abs = java.lang.Math.abs(m19137x394c04 - this.f6679x6f02247.mo18962x394b92().mo18536x5cbba1cc());
        }
        long j17 = this.f6678x6f02129;
        if (abs < j17) {
            return null;
        }
        if (abs > (j17 << 1)) {
            m19136x394c02();
            return null;
        }
        m19123x394c70 = this.f6679x6f02247.m19123x394c70();
        java.lang.String string = m19123x394c70.getString(this.f6682x6f0224b, null);
        m19123x394c702 = this.f6679x6f02247.m19123x394c70();
        long j18 = m19123x394c702.getLong(this.f6681x6f0224a, 0L);
        m19136x394c02();
        return (string == null || j18 <= 0) ? com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c.f6645x6f0222a : new android.util.Pair<>(string, java.lang.Long.valueOf(j18));
    }
}
