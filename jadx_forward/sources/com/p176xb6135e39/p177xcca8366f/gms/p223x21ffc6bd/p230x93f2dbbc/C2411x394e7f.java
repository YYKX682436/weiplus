package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzzy */
/* loaded from: classes13.dex */
public class C2411x394e7f {

    /* renamed from: zzbsw */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2395x394e6f f7267x6f02706 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2395x394e6f.m19389x394db1();

    /* renamed from: zzbsx */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e f7268x6f02707;

    /* renamed from: zzbsy */
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c f7269x6f02708;

    /* renamed from: zzbsz */
    private volatile com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e f7270x6f02709;

    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c zzb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c interfaceC2129x6f0210c) {
        if (this.f7269x6f02708 == null) {
            synchronized (this) {
                if (this.f7269x6f02708 == null) {
                    try {
                        this.f7269x6f02708 = interfaceC2129x6f0210c;
                        this.f7270x6f02709 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e.f7208x6f026c9;
                    } catch (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2406x394e7a unused) {
                        this.f7269x6f02708 = interfaceC2129x6f0210c;
                        this.f7270x6f02709 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e.f7208x6f026c9;
                    }
                }
            }
        }
        return this.f7269x6f02708;
    }

    /* renamed from: zztp */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e m19419x394dbc() {
        if (this.f7270x6f02709 != null) {
            return this.f7270x6f02709;
        }
        synchronized (this) {
            if (this.f7270x6f02709 != null) {
                return this.f7270x6f02709;
            }
            this.f7270x6f02709 = this.f7269x6f02708 == null ? com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e.f7208x6f026c9 : this.f7269x6f02708.m18844x394dbc();
            return this.f7270x6f02709;
        }
    }

    /* renamed from: equals */
    public boolean mo19415xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2411x394e7f)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2411x394e7f c2411x394e7f = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2411x394e7f) obj;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c interfaceC2129x6f0210c = this.f7269x6f02708;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c interfaceC2129x6f0210c2 = c2411x394e7f.f7269x6f02708;
        return (interfaceC2129x6f0210c == null && interfaceC2129x6f0210c2 == null) ? m19419x394dbc().mo19372xb2c87fbf(c2411x394e7f.m19419x394dbc()) : (interfaceC2129x6f0210c == null || interfaceC2129x6f0210c2 == null) ? interfaceC2129x6f0210c != null ? interfaceC2129x6f0210c.equals(c2411x394e7f.zzb(interfaceC2129x6f0210c.m18845x394dc6())) : zzb(interfaceC2129x6f0210c2.m18845x394dc6()).equals(interfaceC2129x6f0210c2) : interfaceC2129x6f0210c.equals(interfaceC2129x6f0210c2);
    }

    /* renamed from: hashCode */
    public int mo19416x8cdac1b() {
        return 1;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c zzc(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c interfaceC2129x6f0210c) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c interfaceC2129x6f0210c2 = this.f7269x6f02708;
        this.f7268x6f02707 = null;
        this.f7270x6f02709 = null;
        this.f7269x6f02708 = interfaceC2129x6f0210c;
        return interfaceC2129x6f0210c2;
    }
}
