package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class w3 {
    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.replace("\u2028", "\\n").replace("\u2029", "\\n");
    }
}
