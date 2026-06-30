package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes3.dex */
public abstract class r1 {
    public static java.lang.String a(int i17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return i17 + "@" + str.hashCode();
    }
}
