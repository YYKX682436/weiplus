package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public abstract class w {
    public static java.lang.String[] a(com.p166x1da19ac6.p168x5890096f.g gVar) {
        if (!(gVar instanceof com.p166x1da19ac6.p168x5890096f.h)) {
            return b(gVar);
        }
        com.p166x1da19ac6.p168x5890096f.h hVar = (com.p166x1da19ac6.p168x5890096f.h) gVar;
        int i17 = 0;
        while (true) {
            try {
                return b(hVar);
            } catch (java.nio.channels.ClosedByInterruptException e17) {
                i17++;
                if (i17 > 4) {
                    throw e17;
                }
                java.lang.Thread.interrupted();
                hVar.getClass();
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(hVar.f125565d);
                hVar.f125566e = fileInputStream;
                hVar.f125567f = fileInputStream.getChannel();
            }
        }
    }

    public static java.lang.String[] b(com.p166x1da19ac6.p168x5890096f.g gVar) {
        long j17;
        long j18;
        long j19;
        long j27;
        int i17;
        int i18;
        long j28;
        long j29;
        int i19;
        long j37;
        long j38;
        int i27;
        long j39;
        long j47;
        long j48;
        long j49;
        int i28 = 8;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        long d17 = d(gVar, allocate, 0L);
        if (d17 != 1179403647) {
            throw new com.p166x1da19ac6.p168x5890096f.v("file is not ELF: 0x" + java.lang.Long.toHexString(d17));
        }
        e(gVar, allocate, 1, 4L);
        boolean z17 = ((short) (allocate.get() & 255)) == 1;
        e(gVar, allocate, 1, 5L);
        if (((short) (allocate.get() & 255)) == 2) {
            allocate.order(java.nio.ByteOrder.BIG_ENDIAN);
        }
        if (z17) {
            j17 = d(gVar, allocate, 28L);
        } else {
            e(gVar, allocate, 8, 32L);
            j17 = allocate.getLong();
        }
        long c17 = z17 ? c(gVar, allocate, 44L) : c(gVar, allocate, 56L);
        int c18 = c(gVar, allocate, z17 ? 42L : 54L);
        if (c17 == 65535) {
            if (z17) {
                j49 = d(gVar, allocate, 32L);
            } else {
                e(gVar, allocate, 8, 40L);
                j49 = allocate.getLong();
            }
            c17 = z17 ? d(gVar, allocate, j49 + 28) : d(gVar, allocate, j49 + 44);
        }
        long j57 = j17;
        long j58 = 0;
        while (true) {
            if (j58 >= c17) {
                j18 = 0;
                break;
            }
            if ((z17 ? d(gVar, allocate, j57 + 0) : d(gVar, allocate, j57 + 0)) != 2) {
                j57 += c18;
                j58++;
            } else if (z17) {
                j18 = d(gVar, allocate, j57 + 4);
            } else {
                e(gVar, allocate, 8, j57 + 8);
                j18 = allocate.getLong();
            }
        }
        long j59 = 0;
        if (j18 == 0) {
            throw new com.p166x1da19ac6.p168x5890096f.v("ELF file does not contain dynamic linking information");
        }
        long j66 = j18;
        long j67 = 0;
        int i29 = 0;
        while (true) {
            if (z17) {
                j19 = j18;
                j27 = d(gVar, allocate, j66 + j59);
            } else {
                j19 = j18;
                e(gVar, allocate, i28, j66 + j59);
                j27 = allocate.getLong();
            }
            if (j27 == 1) {
                if (i29 == Integer.MAX_VALUE) {
                    throw new com.p166x1da19ac6.p168x5890096f.v("malformed DT_NEEDED section");
                }
                i29++;
                i17 = c18;
            } else if (j27 == 5) {
                if (z17) {
                    i17 = c18;
                    i18 = i29;
                    j28 = d(gVar, allocate, j66 + 4);
                } else {
                    i17 = c18;
                    i18 = i29;
                    e(gVar, allocate, 8, j66 + 8);
                    j28 = allocate.getLong();
                }
                j67 = j28;
                i29 = i18;
            } else {
                i17 = c18;
            }
            j66 += z17 ? 8L : 16L;
            j59 = 0;
            if (j27 != 0) {
                j18 = j19;
                c18 = i17;
                i28 = 8;
            } else {
                if (j67 == 0) {
                    throw new com.p166x1da19ac6.p168x5890096f.v("Dynamic section string-table not found");
                }
                int i37 = 0;
                while (true) {
                    if (i37 >= c17) {
                        j29 = 0;
                        break;
                    }
                    if ((z17 ? d(gVar, allocate, j17 + j59) : d(gVar, allocate, j17 + j59)) == 1) {
                        if (z17) {
                            j39 = d(gVar, allocate, j17 + 8);
                            i27 = 8;
                        } else {
                            i27 = 8;
                            e(gVar, allocate, 8, j17 + 16);
                            j39 = allocate.getLong();
                        }
                        if (z17) {
                            j47 = d(gVar, allocate, j17 + 20);
                        } else {
                            e(gVar, allocate, i27, j17 + 40);
                            j47 = allocate.getLong();
                        }
                        if (j39 <= j67 && j67 < j47 + j39) {
                            if (z17) {
                                j48 = d(gVar, allocate, j17 + 4);
                            } else {
                                e(gVar, allocate, 8, j17 + 8);
                                j48 = allocate.getLong();
                            }
                            j29 = j48 + (j67 - j39);
                        }
                    }
                    int i38 = i17;
                    j17 += i38;
                    i37++;
                    i17 = i38;
                    j59 = 0;
                }
                long j68 = 0;
                if (j29 == 0) {
                    throw new com.p166x1da19ac6.p168x5890096f.v("did not find file offset of DT_STRTAB table");
                }
                java.lang.String[] strArr = new java.lang.String[i29];
                int i39 = 0;
                while (true) {
                    long j69 = j19 + j68;
                    if (z17) {
                        j37 = d(gVar, allocate, j69);
                        i19 = 8;
                    } else {
                        i19 = 8;
                        e(gVar, allocate, 8, j69);
                        j37 = allocate.getLong();
                    }
                    if (j37 == 1) {
                        if (z17) {
                            j38 = d(gVar, allocate, j19 + 4);
                        } else {
                            e(gVar, allocate, i19, j19 + 8);
                            j38 = allocate.getLong();
                        }
                        long j76 = j38 + j29;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        while (true) {
                            long j77 = j76 + 1;
                            e(gVar, allocate, 1, j76);
                            short s17 = (short) (allocate.get() & 255);
                            if (s17 == 0) {
                                break;
                            }
                            sb6.append((char) s17);
                            j76 = j77;
                        }
                        strArr[i39] = sb6.toString();
                        if (i39 == Integer.MAX_VALUE) {
                            throw new com.p166x1da19ac6.p168x5890096f.v("malformed DT_NEEDED section");
                        }
                        i39++;
                    }
                    j19 += z17 ? 8L : 16L;
                    if (j37 == 0) {
                        if (i39 == i29) {
                            return strArr;
                        }
                        throw new com.p166x1da19ac6.p168x5890096f.v("malformed DT_NEEDED section");
                    }
                    j68 = 0;
                }
            }
        }
    }

    public static int c(com.p166x1da19ac6.p168x5890096f.g gVar, java.nio.ByteBuffer byteBuffer, long j17) {
        e(gVar, byteBuffer, 2, j17);
        return byteBuffer.getShort() & 65535;
    }

    public static long d(com.p166x1da19ac6.p168x5890096f.g gVar, java.nio.ByteBuffer byteBuffer, long j17) {
        e(gVar, byteBuffer, 4, j17);
        return byteBuffer.getInt() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
    }

    public static void e(com.p166x1da19ac6.p168x5890096f.g gVar, java.nio.ByteBuffer byteBuffer, int i17, long j17) {
        int s17;
        byteBuffer.position(0);
        byteBuffer.limit(i17);
        while (byteBuffer.remaining() > 0 && (s17 = gVar.s(byteBuffer, j17)) != -1) {
            j17 += s17;
        }
        if (byteBuffer.remaining() > 0) {
            throw new com.p166x1da19ac6.p168x5890096f.v("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
