package com.google.android.gms.common.util;

/* loaded from: classes5.dex */
public class MapUtils {
    public static void writeStringMapToJson(java.lang.StringBuilder sb6, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        sb6.append("{");
        boolean z17 = true;
        for (java.lang.String str : hashMap.keySet()) {
            if (!z17) {
                sb6.append(",");
            }
            java.lang.String str2 = hashMap.get(str);
            sb6.append("\"");
            sb6.append(str);
            sb6.append("\":");
            if (str2 == null) {
                sb6.append("null");
            } else {
                sb6.append("\"");
                sb6.append(str2);
                sb6.append("\"");
            }
            z17 = false;
        }
        sb6.append("}");
    }
}
