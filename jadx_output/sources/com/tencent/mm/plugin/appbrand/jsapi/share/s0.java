package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class s0 {
    public s0(kotlin.jvm.internal.i iVar) {
    }

    public final int a(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(str, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW)) {
            return 1;
        }
        if (kotlin.jvm.internal.o.b(str, "compressed")) {
            return 0;
        }
        return a("compressed");
    }
}
