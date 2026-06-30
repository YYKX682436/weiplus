package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzbr */
/* loaded from: classes13.dex */
public final class BinderC2522x394b90 extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.AbstractBinderC2592x394be5 {

    /* renamed from: lock */
    private final java.lang.Object f7608x32c52b = new java.lang.Object();

    /* renamed from: zzcw */
    private com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75 f7609x394bb4;

    /* renamed from: zzda */
    private com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2523x394b91 f7610x394bbd;

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2591x394be4
    public final void zza(int i17, int i18) {
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2523x394b91 interfaceC2523x394b91;
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75 c2500x394b75;
        synchronized (this.f7608x32c52b) {
            interfaceC2523x394b91 = this.f7610x394bbd;
            c2500x394b75 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75(i17, i18);
            this.f7609x394bb4 = c2500x394b75;
        }
        if (interfaceC2523x394b91 != null) {
            interfaceC2523x394b91.zzb(c2500x394b75);
        }
    }

    public final void zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2523x394b91 interfaceC2523x394b91) {
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2500x394b75 c2500x394b75;
        synchronized (this.f7608x32c52b) {
            this.f7610x394bbd = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.InterfaceC2523x394b91) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC2523x394b91);
            c2500x394b75 = this.f7609x394bb4;
        }
        if (c2500x394b75 != null) {
            interfaceC2523x394b91.zzb(c2500x394b75);
        }
    }
}
