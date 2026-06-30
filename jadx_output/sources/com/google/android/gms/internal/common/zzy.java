package com.google.android.gms.internal.common;

@org.jspecify.nullness.NullMarked
/* loaded from: classes13.dex */
public final class zzy {
    public static java.lang.String zza(java.lang.String str, java.lang.Object... objArr) {
        int length;
        int length2;
        int indexOf;
        java.lang.String str2;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            length = objArr.length;
            if (i18 >= length) {
                break;
            }
            java.lang.Object obj = objArr[i18];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (java.lang.Exception e17) {
                    java.lang.String str3 = obj.getClass().getName() + "@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(java.util.logging.Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (java.lang.Throwable) e17);
                    str2 = "<" + str3 + " threw " + e17.getClass().getName() + ">";
                }
            }
            objArr[i18] = str2;
            i18++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length() + (length * 16));
        int i19 = 0;
        while (true) {
            length2 = objArr.length;
            if (i17 >= length2 || (indexOf = str.indexOf("%s", i19)) == -1) {
                break;
            }
            sb6.append((java.lang.CharSequence) str, i19, indexOf);
            sb6.append(objArr[i17]);
            i19 = indexOf + 2;
            i17++;
        }
        sb6.append((java.lang.CharSequence) str, i19, str.length());
        if (i17 < length2) {
            sb6.append(" [");
            sb6.append(objArr[i17]);
            for (int i27 = i17 + 1; i27 < objArr.length; i27++) {
                sb6.append(", ");
                sb6.append(objArr[i27]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }
}
