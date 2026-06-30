package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzaap */
/* loaded from: classes13.dex */
final class C2133x6f02110<T> implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2139x6f02116<T> {

    /* renamed from: zzbtk */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c f6280x6f02719;

    /* renamed from: zzbtl */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129<?, ?> f6281x6f0271a;

    /* renamed from: zzbtm */
    private final boolean f6282x6f0271b;

    /* renamed from: zzbtn */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2396x394e70<?> f6283x6f0271c;

    private C2133x6f02110(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129<?, ?> abstractC2153x6f02129, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2396x394e70<?> abstractC2396x394e70, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c interfaceC2129x6f0210c) {
        this.f6281x6f0271a = abstractC2153x6f02129;
        this.f6282x6f0271b = abstractC2396x394e70.zza(interfaceC2129x6f0210c);
        this.f6283x6f0271c = abstractC2396x394e70;
        this.f6280x6f02719 = interfaceC2129x6f0210c;
    }

    public static <T> com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2133x6f02110<T> zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2153x6f02129<?, ?> abstractC2153x6f02129, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2396x394e70<?> abstractC2396x394e70, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2129x6f0210c interfaceC2129x6f0210c) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2133x6f02110<>(abstractC2153x6f02129, abstractC2396x394e70, interfaceC2129x6f0210c);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2139x6f02116
    /* renamed from: equals */
    public final boolean mo18848xb2c87fbf(T t17, T t18) {
        if (!this.f6281x6f0271a.zzu(t17).equals(this.f6281x6f0271a.zzu(t18))) {
            return false;
        }
        if (this.f6282x6f0271b) {
            return this.f6283x6f0271c.zzs(t17).m19397xb2c87fbf(this.f6283x6f0271c.zzs(t18));
        }
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2139x6f02116
    /* renamed from: hashCode */
    public final int mo18849x8cdac1b(T t17) {
        int hashCode = this.f6281x6f0271a.zzu(t17).hashCode();
        return this.f6282x6f0271b ? (hashCode * 53) + this.f6283x6f0271c.zzs(t17).m19398x8cdac1b() : hashCode;
    }
}
