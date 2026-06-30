package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzaaf */
/* loaded from: classes13.dex */
final class C2123x6f02106 implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2128x6f0210b {

    /* renamed from: zzbtf */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2128x6f0210b[] f6275x6f02714;

    public C2123x6f02106(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2128x6f0210b... interfaceC2128x6f0210bArr) {
        this.f6275x6f02714 = interfaceC2128x6f0210bArr;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2128x6f0210b
    public final boolean zzd(java.lang.Class<?> cls) {
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2128x6f0210b interfaceC2128x6f0210b : this.f6275x6f02714) {
            if (interfaceC2128x6f0210b.zzd(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2128x6f0210b
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2127x6f0210a zze(java.lang.Class<?> cls) {
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2128x6f0210b interfaceC2128x6f0210b : this.f6275x6f02714) {
            if (interfaceC2128x6f0210b.zzd(cls)) {
                return interfaceC2128x6f0210b.zze(cls);
            }
        }
        java.lang.String name = cls.getName();
        throw new java.lang.UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new java.lang.String("No factory is available for message type: "));
    }
}
