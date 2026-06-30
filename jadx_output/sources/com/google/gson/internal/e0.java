package com.google.gson.internal;

/* loaded from: classes5.dex */
public abstract class e0 {
    public static java.text.DateFormat a(int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i17 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i17 == 1) {
            str = "MMMM d, yyyy";
        } else if (i17 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i17 != 3) {
                throw new java.lang.IllegalArgumentException("Unknown DateFormat style: " + i17);
            }
            str = "M/d/yy";
        }
        sb6.append(str);
        sb6.append(" ");
        if (i18 == 0 || i18 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i18 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i18 != 3) {
                throw new java.lang.IllegalArgumentException("Unknown DateFormat style: " + i18);
            }
            str2 = "h:mm a";
        }
        sb6.append(str2);
        return new java.text.SimpleDateFormat(sb6.toString(), java.util.Locale.US);
    }
}
