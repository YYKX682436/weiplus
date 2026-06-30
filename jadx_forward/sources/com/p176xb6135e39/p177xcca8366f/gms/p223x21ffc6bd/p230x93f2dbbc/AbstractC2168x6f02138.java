package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzaby */
/* loaded from: classes16.dex */
public abstract class AbstractC2168x6f02138<M extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138<M>> extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 {

    /* renamed from: zzbww */
    protected com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f f6385x6f02782;

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    /* renamed from: clone */
    public /* synthetic */ java.lang.Object mo18921x5a5dd5d() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138 abstractC2168x6f02138 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138) super.mo18921x5a5dd5d();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2172x6f02141.zza(this, abstractC2168x6f02138);
        return abstractC2168x6f02138;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public int zza() {
        if (this.f6385x6f02782 == null) {
            return 0;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f6385x6f02782.m18932x35e001(); i18++) {
            i17 += this.f6385x6f02782.m18934x394b74(i18).zza();
        }
        return i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    /* renamed from: zzvf */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143 mo18921x5a5dd5d() {
        return (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2168x6f02138) mo18921x5a5dd5d();
    }

    public final <T> T zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2169x6f02139<M, T> c2169x6f02139) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 m18933x394b73;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f == null || (m18933x394b73 = c2170x6f0213f.m18933x394b73(c2169x6f02139.tag >>> 3)) == null) {
            return null;
        }
        return (T) m18933x394b73.zzb(c2169x6f02139);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2174x6f02143
    public void zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2166x6f02136 c2166x6f02136) {
        if (this.f6385x6f02782 == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f6385x6f02782.m18932x35e001(); i17++) {
            this.f6385x6f02782.m18934x394b74(i17).zza(c2166x6f02136);
        }
    }

    public final boolean zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2165x6f02135 c2165x6f02135, int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140 m18933x394b73;
        int m18898xa86cd69f = c2165x6f02135.m18898xa86cd69f();
        if (!c2165x6f02135.m18902x394b6a(i17)) {
            return false;
        }
        int i18 = i17 >>> 3;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145 c2176x6f02145 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2176x6f02145(i17, c2165x6f02135.zzc(m18898xa86cd69f, c2165x6f02135.m18898xa86cd69f() - m18898xa86cd69f));
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f c2170x6f0213f = this.f6385x6f02782;
        if (c2170x6f0213f == null) {
            this.f6385x6f02782 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2170x6f0213f();
            m18933x394b73 = null;
        } else {
            m18933x394b73 = c2170x6f0213f.m18933x394b73(i18);
        }
        if (m18933x394b73 == null) {
            m18933x394b73 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2171x6f02140();
            this.f6385x6f02782.zza(i18, m18933x394b73);
        }
        m18933x394b73.zza(c2176x6f02145);
        return true;
    }
}
