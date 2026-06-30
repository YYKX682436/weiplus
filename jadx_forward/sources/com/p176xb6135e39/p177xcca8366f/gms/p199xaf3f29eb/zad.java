package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zad extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc zaa;
    private final android.content.Context zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc c1705x2db7dcfc, android.content.Context context) {
        super(android.os.Looper.myLooper() == null ? android.os.Looper.getMainLooper() : android.os.Looper.myLooper());
        this.zaa = c1705x2db7dcfc;
        this.zab = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc c1705x2db7dcfc = this.zaa;
        int mo17630x402556f4 = c1705x2db7dcfc.mo17630x402556f4(this.zab);
        if (c1705x2db7dcfc.mo17632xd322c280(mo17630x402556f4)) {
            this.zaa.m17638xd6620196(this.zab, mo17630x402556f4);
        }
    }
}
