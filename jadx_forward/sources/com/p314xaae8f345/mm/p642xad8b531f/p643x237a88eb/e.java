package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes7.dex */
public abstract class e {
    public static java.lang.String a(java.lang.String str) {
        try {
            int length = str.length();
            int i17 = 0;
            int i18 = 9;
            java.lang.StringBuilder sb6 = null;
            byte b17 = 0;
            while (i18 != 1) {
                if (i18 == 3) {
                    i18 = i17 >= length ? i18 - 2 : i18 + 2;
                } else if (i18 != 5) {
                    if (i18 != 7) {
                        if (i18 == 9) {
                            sb6 = new java.lang.StringBuilder();
                        } else if (i18 == 11) {
                            sb6.append((char) b17);
                        } else if (i18 == 13) {
                            b17 = (byte) (b17 ^ 60);
                            i18 += 4;
                        } else if (i18 == 15) {
                            b17 = (byte) (b17 ^ (i17 - length));
                        } else {
                            if (i18 != 17) {
                                throw new java.lang.IllegalStateException();
                            }
                            b17 = (byte) (b17 & 255);
                        }
                        i18 -= 6;
                    } else {
                        i17++;
                    }
                    i18 -= 4;
                } else {
                    b17 = (byte) str.charAt(i17);
                    i18 += 10;
                }
            }
            return sb6.toString();
        } catch (java.lang.Throwable unused) {
            return str;
        }
    }

    public static java.lang.reflect.Field b(java.lang.Class cls, java.lang.String str) {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod(a("«¨º\u008b\u00adª¦ª¶ ¢\u0081©¤®§"), java.lang.String.class);
            java.lang.Class cls2 = cls;
            do {
                try {
                    java.lang.reflect.Field field = (java.lang.reflect.Field) declaredMethod.invoke(cls2, str);
                    field.setAccessible(true);
                    return field;
                } catch (java.lang.IllegalAccessException unused) {
                    throw new java.lang.NoSuchFieldException("E2: " + cls.getName() + "," + str);
                } catch (java.lang.reflect.InvocationTargetException e17) {
                    if (!(e17.getTargetException() instanceof java.lang.NoSuchFieldException)) {
                        throw new java.lang.NoSuchFieldException("E3: " + cls.getName() + "," + str);
                    }
                    cls2 = cls2.getSuperclass();
                    if (cls2 == java.lang.Object.class) {
                        break;
                    }
                    throw new java.lang.NoSuchFieldException(a("\u0085«å ®¥\u00ad¦ã") + str + a("ê¢ªå¥«¡²±ã") + cls.getName() + a("ö¸¢ñ»§¿í½º¸¬¸ë§©§´³¤±í"));
                }
            } while (cls2 != null);
            throw new java.lang.NoSuchFieldException(a("\u0085«å ®¥\u00ad¦ã") + str + a("ê¢ªå¥«¡²±ã") + cls.getName() + a("ö¸¢ñ»§¿í½º¸¬¸ë§©§´³¤±í"));
        } catch (java.lang.NoSuchMethodException unused2) {
            throw new java.lang.NoSuchFieldException("E1: " + cls.getName() + "," + str);
        }
    }
}
