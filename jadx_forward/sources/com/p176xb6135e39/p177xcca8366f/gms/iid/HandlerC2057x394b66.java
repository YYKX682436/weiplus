package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.iid.zzag */
/* loaded from: classes13.dex */
public final class HandlerC2057x394b66 extends android.os.Handler {

    /* renamed from: zzcx */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65 f6121x394bb5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2057x394b66(com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65 c2056x394b65, android.os.Looper looper) {
        super(looper);
        this.f6121x394bb5 = c2056x394b65;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        this.f6121x394bb5.zze(message);
    }
}
