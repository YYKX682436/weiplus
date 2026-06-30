package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class j2 implements com.tencent.mm.vfs.t6 {
    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        return com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.g(r6Var, "store_", true);
    }
}
