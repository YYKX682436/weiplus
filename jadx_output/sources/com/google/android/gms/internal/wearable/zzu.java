package com.google.android.gms.internal.wearable;

/* loaded from: classes13.dex */
public final class zzu {
    private static void zza(java.lang.String str, java.lang.Object obj, java.lang.StringBuffer stringBuffer, java.lang.StringBuffer stringBuffer2) {
        if (obj != null) {
            int i17 = 0;
            if (!(obj instanceof com.google.android.gms.internal.wearable.zzt)) {
                java.lang.String zzh = zzh(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(zzh);
                stringBuffer2.append(": ");
                if (obj instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) obj;
                    if (!str2.startsWith("http") && str2.length() > 200) {
                        str2 = java.lang.String.valueOf(str2.substring(0, 200)).concat("[...]");
                    }
                    int length = str2.length();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(length);
                    while (i17 < length) {
                        char charAt = str2.charAt(i17);
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                            sb6.append(java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(charAt)));
                        } else {
                            sb6.append(charAt);
                        }
                        i17++;
                    }
                    java.lang.String sb7 = sb6.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(sb7);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer2.append('\"');
                    while (i17 < bArr.length) {
                        int i18 = bArr[i17] & 255;
                        if (i18 == 92 || i18 == 34) {
                            stringBuffer2.append('\\');
                        } else if (i18 < 32 || i18 >= 127) {
                            stringBuffer2.append(java.lang.String.format("\\%03o", java.lang.Integer.valueOf(i18)));
                            i17++;
                        }
                        stringBuffer2.append((char) i18);
                        i17++;
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
                return;
            }
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(zzh(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            java.lang.Class<?> cls = obj.getClass();
            for (java.lang.reflect.Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                java.lang.String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    java.lang.Class<?> type = field.getType();
                    java.lang.Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == java.lang.Byte.TYPE) {
                        zza(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length3 = obj2 == null ? 0 : java.lang.reflect.Array.getLength(obj2);
                        for (int i19 = 0; i19 < length3; i19++) {
                            zza(name, java.lang.reflect.Array.get(obj2, i19), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (java.lang.reflect.Method method : cls.getMethods()) {
                java.lang.String name2 = method.getName();
                if (name2.startsWith("set")) {
                    java.lang.String substring = name2.substring(3);
                    try {
                        java.lang.String valueOf = java.lang.String.valueOf(substring);
                        if (((java.lang.Boolean) cls.getMethod(valueOf.length() != 0 ? "has".concat(valueOf) : new java.lang.String("has"), new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).booleanValue()) {
                            java.lang.String valueOf2 = java.lang.String.valueOf(substring);
                            zza(substring, cls.getMethod(valueOf2.length() != 0 ? "get".concat(valueOf2) : new java.lang.String("get"), new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]), stringBuffer, stringBuffer2);
                        }
                    } catch (java.lang.NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
        }
    }

    public static <T extends com.google.android.gms.internal.wearable.zzt> java.lang.String zzc(T t17) {
        if (t17 == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            zza(null, t17, new java.lang.StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (java.lang.IllegalAccessException e17) {
            java.lang.String valueOf = java.lang.String.valueOf(e17.getMessage());
            return valueOf.length() != 0 ? "Error printing proto: ".concat(valueOf) : new java.lang.String("Error printing proto: ");
        } catch (java.lang.reflect.InvocationTargetException e18) {
            java.lang.String valueOf2 = java.lang.String.valueOf(e18.getMessage());
            return valueOf2.length() != 0 ? "Error printing proto: ".concat(valueOf2) : new java.lang.String("Error printing proto: ");
        }
    }

    private static java.lang.String zzh(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < str.length(); i17++) {
            char charAt = str.charAt(i17);
            if (i17 != 0) {
                if (java.lang.Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = java.lang.Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }
}
