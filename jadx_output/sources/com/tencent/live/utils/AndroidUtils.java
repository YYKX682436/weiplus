package com.tencent.live.utils;

/* loaded from: classes.dex */
public class AndroidUtils {
    public static java.util.Map getMapByBundle(android.os.Bundle bundle) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (bundle != null) {
            for (java.lang.String str : bundle.keySet()) {
                hashMap.put(str, bundle.get(str));
            }
        }
        return hashMap;
    }
}
