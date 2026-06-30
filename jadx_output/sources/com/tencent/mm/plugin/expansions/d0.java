package com.tencent.mm.plugin.expansions;

/* loaded from: classes7.dex */
public class d0 implements z95.c {
    @Override // z95.c
    public java.io.File a() {
        return new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().nativeLibraryDir);
    }

    @Override // z95.c
    public android.content.res.AssetManager getAssets() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
    }
}
