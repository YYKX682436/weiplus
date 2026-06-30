package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes.dex */
final class h implements com.tencent.mm.ipcinvoker.k0 {
    private h() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        sb6.append(gm0.j1.u().h());
        sb6.append("address");
        java.lang.String sb7 = sb6.toString();
        return com.tencent.mm.vfs.w6.j(sb7) ? new com.tencent.mm.ipcinvoker.type.IPCString(sb7) : new com.tencent.mm.ipcinvoker.type.IPCString("");
    }
}
