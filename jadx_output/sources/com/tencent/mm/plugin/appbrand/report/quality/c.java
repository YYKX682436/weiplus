package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a() {
        x46.a aVar = new x46.a();
        byte[] byteArray = com.tencent.mm.plugin.appbrand.report.quality.d.f88160b.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        int length = byteArray.length;
        int i17 = 0;
        while (true) {
            java.lang.String str = "0";
            if (i17 >= length) {
                break;
            }
            java.lang.String valueOf = java.lang.String.valueOf((int) byteArray[i17]);
            if (!(valueOf.length() == 0)) {
                str = valueOf;
            }
            aVar.c(str);
            i17++;
        }
        return aVar.f451940e == 0 ? "0" : aVar.toString();
    }
}
