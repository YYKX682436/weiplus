package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.zacz */
/* loaded from: classes13.dex */
public final class HandlerC1874x38edde extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zau {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1874x38edde(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede4, android.os.Looper looper) {
        super(looper);
        this.zaa = c1875x38ede4;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.Object obj;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede4;
        int i17 = message.what;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) message.obj;
            "Runtime exception on the transformation worker thread: ".concat(java.lang.String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074 abstractC1752x4624a074 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074) message.obj;
        obj = this.zaa.zae;
        synchronized (obj) {
            c1875x38ede4 = this.zaa.zab;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4 c1875x38ede42 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1875x38ede4) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1875x38ede4);
            if (abstractC1752x4624a074 == null) {
                c1875x38ede42.zaj(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(13, "Transform returned null"));
            } else if (abstractC1752x4624a074 instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1864x38edd4) {
                c1875x38ede42.zaj(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1864x38edd4) abstractC1752x4624a074).zaa());
            } else {
                c1875x38ede42.zai(abstractC1752x4624a074);
            }
        }
    }
}
