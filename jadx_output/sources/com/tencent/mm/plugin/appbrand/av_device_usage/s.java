package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public abstract class s {
    public static final java.lang.String a(fb1.d dVar) {
        int i17;
        int ordinal = dVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new jz5.j();
                            }
                            i17 = 0;
                        }
                    }
                }
                i17 = com.tencent.mm.R.string.f491048bp4;
            }
            i17 = com.tencent.mm.R.string.bp6;
        } else {
            i17 = com.tencent.mm.R.string.f491049bp5;
        }
        if (i17 == 0) {
            return "";
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
