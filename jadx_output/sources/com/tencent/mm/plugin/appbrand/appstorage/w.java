package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class w implements com.tencent.mm.vfs.t6 {
    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        return r6Var.m() && !r6Var.y() && !com.tencent.mm.sdk.platformtools.t8.K0(r6Var.getName()) && r6Var.getName().startsWith("tmp_");
    }
}
