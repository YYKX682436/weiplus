package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.zabh */
/* loaded from: classes13.dex */
public final class HandlerC1830x38edad extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1830x38edad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae, android.os.Looper looper) {
        super(looper);
        this.zaa = c1831x38edae;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1829x38edac) message.obj).zab(this.zaa);
        } else if (i17 == 2) {
            throw ((java.lang.RuntimeException) message.obj);
        }
    }
}
