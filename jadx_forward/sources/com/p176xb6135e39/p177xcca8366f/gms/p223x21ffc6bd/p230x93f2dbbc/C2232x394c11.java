package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzfw */
/* loaded from: classes16.dex */
public final class C2232x394c11 {

    /* renamed from: value */
    private java.lang.String f6683x6ac9171;

    /* renamed from: zzakp */
    private boolean f6684x6f02246;

    /* renamed from: zzakq */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c f6685x6f02247;

    /* renamed from: zzakv */
    private final java.lang.String f6686x6f0224c;

    /* renamed from: zzny */
    private final java.lang.String f6687x394d0b;

    public C2232x394c11(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2227x394c0c c2227x394c0c, java.lang.String str, java.lang.String str2) {
        this.f6685x6f02247 = c2227x394c0c;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        this.f6687x394d0b = str;
        this.f6686x6f0224c = null;
    }

    /* renamed from: zzbs */
    public final void m19139x394b91(java.lang.String str) {
        android.content.SharedPreferences m19123x394c70;
        if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(str, this.f6683x6ac9171)) {
            return;
        }
        m19123x394c70 = this.f6685x6f02247.m19123x394c70();
        android.content.SharedPreferences.Editor edit = m19123x394c70.edit();
        edit.putString(this.f6687x394d0b, str);
        edit.apply();
        this.f6683x6ac9171 = str;
    }

    /* renamed from: zzjg */
    public final java.lang.String m19140x394c7d() {
        android.content.SharedPreferences m19123x394c70;
        if (!this.f6684x6f02246) {
            this.f6684x6f02246 = true;
            m19123x394c70 = this.f6685x6f02247.m19123x394c70();
            this.f6683x6ac9171 = m19123x394c70.getString(this.f6687x394d0b, null);
        }
        return this.f6683x6ac9171;
    }
}
