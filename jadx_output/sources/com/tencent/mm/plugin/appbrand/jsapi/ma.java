package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
class ma implements com.tencent.mm.ipcinvoker.k0 {
    private ma() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((h45.q) i95.n0.c(h45.q.class)).startLqtDetailUseCaseInOtherProcess()).booleanValue() ? new com.tencent.mm.ipcinvoker.type.IPCBoolean(true) : new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
    }
}
