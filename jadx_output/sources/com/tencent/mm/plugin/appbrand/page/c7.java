package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes5.dex */
public abstract class c7 {
    public static java.lang.String a(java.lang.String str) {
        int i17 = 0;
        java.lang.String str2 = "";
        while (true) {
            int indexOf = str.indexOf("<script>", i17);
            int indexOf2 = str.indexOf("</script>", i17);
            if (indexOf == -1 || indexOf2 == -1 || indexOf2 <= indexOf) {
                break;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str2);
            sb6.append(i17 > 0 ? ";" : "");
            sb6.append(str.substring(indexOf + 8, indexOf2));
            str2 = sb6.toString();
            i17 = indexOf2 + 9;
        }
        return str2;
    }
}
