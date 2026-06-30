package com.tencent.mm.plugin.appbrand.game.preload;

/* loaded from: classes.dex */
final class d implements com.tencent.mm.ipcinvoker.k0 {
    private d() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String h17 = gm0.j1.u().h();
        if (!h17.endsWith("/")) {
            h17 = h17.concat("/");
        }
        return new com.tencent.mm.ipcinvoker.type.IPCString(h17 + "appbrand/loadingurl");
    }
}
