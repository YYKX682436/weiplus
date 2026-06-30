package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzft */
/* loaded from: classes16.dex */
public final class C2229x394c0e {

    /* renamed from: value */
    private boolean f6668x6ac9171;

    /* renamed from: zzako */
    private final boolean f6669x6f02245;

    /* renamed from: zzakp */
    private boolean f6670x6f02246;

    /* renamed from: zzakq */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c f6671x6f02247;

    /* renamed from: zzny */
    private final java.lang.String f6672x394d0b;

    public C2229x394c0e(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c c2227x394c0c, java.lang.String str, boolean z17) {
        this.f6671x6f02247 = c2227x394c0c;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        this.f6672x394d0b = str;
        this.f6669x6f02245 = true;
    }

    public final boolean get() {
        android.content.SharedPreferences m19123x394c70;
        if (!this.f6670x6f02246) {
            this.f6670x6f02246 = true;
            m19123x394c70 = this.f6671x6f02247.m19123x394c70();
            this.f6668x6ac9171 = m19123x394c70.getBoolean(this.f6672x394d0b, this.f6669x6f02245);
        }
        return this.f6668x6ac9171;
    }

    public final void set(boolean z17) {
        android.content.SharedPreferences m19123x394c70;
        m19123x394c70 = this.f6671x6f02247.m19123x394c70();
        android.content.SharedPreferences.Editor edit = m19123x394c70.edit();
        edit.putBoolean(this.f6672x394d0b, z17);
        edit.apply();
        this.f6668x6ac9171 = z17;
    }
}
