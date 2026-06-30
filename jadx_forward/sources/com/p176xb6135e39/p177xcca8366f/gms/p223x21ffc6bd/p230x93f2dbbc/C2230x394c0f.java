package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzfu */
/* loaded from: classes16.dex */
public final class C2230x394c0f {

    /* renamed from: value */
    private long f6673x6ac9171;

    /* renamed from: zzakp */
    private boolean f6674x6f02246;

    /* renamed from: zzakq */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c f6675x6f02247;

    /* renamed from: zzakr */
    private final long f6676x6f02248;

    /* renamed from: zzny */
    private final java.lang.String f6677x394d0b;

    public C2230x394c0f(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c c2227x394c0c, java.lang.String str, long j17) {
        this.f6675x6f02247 = c2227x394c0c;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        this.f6677x394d0b = str;
        this.f6676x6f02248 = j17;
    }

    public final long get() {
        android.content.SharedPreferences m19123x394c70;
        if (!this.f6674x6f02246) {
            this.f6674x6f02246 = true;
            m19123x394c70 = this.f6675x6f02247.m19123x394c70();
            this.f6673x6ac9171 = m19123x394c70.getLong(this.f6677x394d0b, this.f6676x6f02248);
        }
        return this.f6673x6ac9171;
    }

    public final void set(long j17) {
        android.content.SharedPreferences m19123x394c70;
        m19123x394c70 = this.f6675x6f02247.m19123x394c70();
        android.content.SharedPreferences.Editor edit = m19123x394c70.edit();
        edit.putLong(this.f6677x394d0b, j17);
        edit.apply();
        this.f6673x6ac9171 = j17;
    }
}
