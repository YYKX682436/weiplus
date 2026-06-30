package com.google.protobuf;

/* loaded from: classes13.dex */
public abstract class ia {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.logging.Logger f45201a = java.util.logging.Logger.getLogger(com.google.protobuf.ia.class.getName());

    static {
        int i17 = com.google.protobuf.oa.f45369b;
        com.google.protobuf.oa oaVar = com.google.protobuf.na.f45340a;
    }

    public static int a(byte b17) {
        if (48 > b17 || b17 > 57) {
            return ((97 > b17 || b17 > 122) ? b17 - 65 : b17 - 97) + 10;
        }
        return b17 - 48;
    }

    public static long b(java.lang.String str, boolean z17, boolean z18) {
        int i17;
        int i18 = 0;
        if (str.startsWith("-", 0)) {
            if (!z17) {
                throw new java.lang.NumberFormatException(str.length() != 0 ? "Number must be positive: ".concat(str) : new java.lang.String("Number must be positive: "));
            }
            i18 = 1;
        }
        int i19 = i18;
        if (str.startsWith("0x", i18)) {
            i18 += 2;
            i17 = 16;
        } else {
            i17 = str.startsWith("0", i18) ? 8 : 10;
        }
        java.lang.String substring = str.substring(i18);
        if (substring.length() < 16) {
            long parseLong = java.lang.Long.parseLong(substring, i17);
            if (i19 != 0) {
                parseLong = -parseLong;
            }
            if (z18) {
                return parseLong;
            }
            if (z17) {
                if (parseLong > 2147483647L || parseLong < -2147483648L) {
                    throw new java.lang.NumberFormatException(str.length() != 0 ? "Number out of range for 32-bit signed integer: ".concat(str) : new java.lang.String("Number out of range for 32-bit signed integer: "));
                }
                return parseLong;
            }
            if (parseLong >= 4294967296L || parseLong < 0) {
                throw new java.lang.NumberFormatException(str.length() != 0 ? "Number out of range for 32-bit unsigned integer: ".concat(str) : new java.lang.String("Number out of range for 32-bit unsigned integer: "));
            }
            return parseLong;
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(substring, i17);
        if (i19 != 0) {
            bigInteger = bigInteger.negate();
        }
        if (z18) {
            if (z17) {
                if (bigInteger.bitLength() > 63) {
                    throw new java.lang.NumberFormatException(str.length() != 0 ? "Number out of range for 64-bit signed integer: ".concat(str) : new java.lang.String("Number out of range for 64-bit signed integer: "));
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new java.lang.NumberFormatException(str.length() != 0 ? "Number out of range for 64-bit unsigned integer: ".concat(str) : new java.lang.String("Number out of range for 64-bit unsigned integer: "));
            }
        } else if (z17) {
            if (bigInteger.bitLength() > 31) {
                throw new java.lang.NumberFormatException(str.length() != 0 ? "Number out of range for 32-bit signed integer: ".concat(str) : new java.lang.String("Number out of range for 32-bit signed integer: "));
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new java.lang.NumberFormatException(str.length() != 0 ? "Number out of range for 32-bit unsigned integer: ".concat(str) : new java.lang.String("Number out of range for 32-bit unsigned integer: "));
        }
        return bigInteger.longValue();
    }

    public static com.google.protobuf.y c(java.lang.CharSequence charSequence) {
        int i17;
        int i18;
        byte[] bArr = ((com.google.protobuf.w) com.google.protobuf.y.h(charSequence.toString())).f45626g;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i19 = 0;
        int i27 = 0;
        while (i19 < bArr.length) {
            byte b17 = bArr[i19];
            if (b17 == 92) {
                i19++;
                if (i19 >= bArr.length) {
                    throw new com.google.protobuf.ea("Invalid escape sequence: '\\' at end of string.");
                }
                byte b18 = bArr[i19];
                if (48 <= b18 && b18 <= 55) {
                    int a17 = a(b18);
                    int i28 = i19 + 1;
                    if (i28 < bArr.length) {
                        byte b19 = bArr[i28];
                        if (48 <= b19 && b19 <= 55) {
                            a17 = (a17 * 8) + a(b19);
                            i19 = i28;
                        }
                    }
                    int i29 = i19 + 1;
                    if (i29 < bArr.length) {
                        byte b27 = bArr[i29];
                        if (48 <= b27 && b27 <= 55) {
                            a17 = (a17 * 8) + a(b27);
                            i19 = i29;
                        }
                    }
                    i17 = i27 + 1;
                    bArr2[i27] = (byte) a17;
                } else {
                    if (b18 == 34) {
                        i18 = i27 + 1;
                        bArr2[i27] = 34;
                    } else if (b18 == 39) {
                        i18 = i27 + 1;
                        bArr2[i27] = 39;
                    } else if (b18 == 92) {
                        i18 = i27 + 1;
                        bArr2[i27] = 92;
                    } else if (b18 == 102) {
                        i18 = i27 + 1;
                        bArr2[i27] = 12;
                    } else if (b18 == 110) {
                        i18 = i27 + 1;
                        bArr2[i27] = 10;
                    } else if (b18 == 114) {
                        i18 = i27 + 1;
                        bArr2[i27] = 13;
                    } else if (b18 == 116) {
                        i18 = i27 + 1;
                        bArr2[i27] = 9;
                    } else if (b18 == 118) {
                        i18 = i27 + 1;
                        bArr2[i27] = 11;
                    } else {
                        if (b18 == 120) {
                            i19++;
                            if (i19 < bArr.length) {
                                byte b28 = bArr[i19];
                                if ((48 <= b28 && b28 <= 57) || (97 <= b28 && b28 <= 102) || (65 <= b28 && b28 <= 70)) {
                                    int a18 = a(b28);
                                    int i37 = i19 + 1;
                                    if (i37 < bArr.length) {
                                        byte b29 = bArr[i37];
                                        if ((48 <= b29 && b29 <= 57) || (97 <= b29 && b29 <= 102) || (65 <= b29 && b29 <= 70)) {
                                            a18 = (a18 * 16) + a(b29);
                                            i19 = i37;
                                        }
                                    }
                                    i17 = i27 + 1;
                                    bArr2[i27] = (byte) a18;
                                }
                            }
                            throw new com.google.protobuf.ea("Invalid escape sequence: '\\x' with no digits");
                        }
                        if (b18 == 97) {
                            i18 = i27 + 1;
                            bArr2[i27] = 7;
                        } else {
                            if (b18 != 98) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(29);
                                sb6.append("Invalid escape sequence: '\\");
                                sb6.append((char) b18);
                                sb6.append('\'');
                                throw new com.google.protobuf.ea(sb6.toString());
                            }
                            i18 = i27 + 1;
                            bArr2[i27] = 8;
                        }
                    }
                    i27 = i18;
                    i19++;
                }
            } else {
                i17 = i27 + 1;
                bArr2[i27] = b17;
            }
            i27 = i17;
            i19++;
        }
        return length == i27 ? new com.google.protobuf.w(bArr2) : com.google.protobuf.y.g(bArr2, 0, i27);
    }

    public static java.lang.String d(long j17) {
        return j17 >= 0 ? java.lang.Long.toString(j17) : java.math.BigInteger.valueOf(j17 & com.tencent.wcdb.core.Database.DictDefaultMatchValue).setBit(63).toString();
    }
}
