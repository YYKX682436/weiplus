package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441;

/* renamed from: com.google.android.gms.common.server.response.FastParser */
/* loaded from: classes13.dex */
public class C1976x2a8d27bb<T extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zai zag = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zaa();
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zai zah = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zab();
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zai zai = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zac();
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zai zaj = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zad();
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zai zak = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zae();
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zai zal = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zaf();
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zai zam = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zag();
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zai zan = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final java.lang.StringBuilder zar = new java.lang.StringBuilder(32);
    private final java.lang.StringBuilder zas = new java.lang.StringBuilder(1024);
    private final java.util.Stack zat = new java.util.Stack();

    /* renamed from: com.google.android.gms.common.server.response.FastParser$ParseException */
    /* loaded from: classes13.dex */
    public static class ParseException extends java.lang.Exception {
        public ParseException(java.lang.String str) {
            super(str);
        }

        public ParseException(java.lang.String str, java.lang.Throwable th6) {
            super("Error instantiating inner object", th6);
        }

        public ParseException(java.lang.Throwable th6) {
            super(th6);
        }
    }

    private static final java.lang.String zaA(java.io.BufferedReader bufferedReader, char[] cArr, java.lang.StringBuilder sb6, char[] cArr2) {
        sb6.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z17 = false;
        boolean z18 = false;
        loop0: while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected EOF while parsing string");
            }
            int i17 = 0;
            while (i17 < read) {
                char c17 = cArr[i17];
                if (!java.lang.Character.isISOControl(c17) || (cArr2 != null && cArr2[0] == c17)) {
                    int i18 = i17 + 1;
                    if (c17 == '\"') {
                        if (!z17) {
                            sb6.append(cArr, 0, i17);
                            bufferedReader.reset();
                            bufferedReader.skip(i18);
                            return z18 ? com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2002x365c2489.m18590x2e64990b(sb6.toString()) : sb6.toString();
                        }
                    } else if (c17 == '\\') {
                        z17 = !z17;
                        z18 = true;
                        i17 = i18;
                    }
                    z17 = false;
                    i17 = i18;
                }
            }
            sb6.append(cArr, 0, read);
            bufferedReader.mark(cArr.length);
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected control character while reading string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return r3.zao[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (r4.read(r3.zao) != (-1)) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (java.lang.Character.isWhitespace(r3.zao[0]) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r4.read(r3.zao) != (-1)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final char zai(java.io.BufferedReader r4) {
        /*
            r3 = this;
            char[] r0 = r3.zao
            int r0 = r4.read(r0)
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L22
        La:
            char[] r0 = r3.zao
            char r0 = r0[r1]
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L1d
            char[] r0 = r3.zao
            int r0 = r4.read(r0)
            if (r0 != r2) goto La
            goto L22
        L1d:
            char[] r4 = r3.zao
            char r4 = r4[r1]
            return r4
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.zai(java.io.BufferedReader):char");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(java.io.BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0d;
        }
        return java.lang.Double.parseDouble(new java.lang.String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(java.io.BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0f;
        }
        return java.lang.Float.parseFloat(new java.lang.String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(java.io.BufferedReader bufferedReader) {
        int i17;
        int i18;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("No number to parse");
        }
        char c17 = cArr[0];
        int i19 = c17 == '-' ? Integer.MIN_VALUE : -2147483647;
        int i27 = c17 == '-' ? 1 : 0;
        if (i27 < zam2) {
            i18 = i27 + 1;
            int digit = java.lang.Character.digit(cArr[i27], 10);
            if (digit < 0) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected non-digit character");
            }
            i17 = -digit;
        } else {
            i17 = 0;
            i18 = i27;
        }
        while (i18 < zam2) {
            int i28 = i18 + 1;
            int digit2 = java.lang.Character.digit(cArr[i18], 10);
            if (digit2 < 0) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected non-digit character");
            }
            if (i17 < -214748364) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Number too large");
            }
            int i29 = i17 * 10;
            if (i29 < i19 + digit2) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Number too large");
            }
            i17 = i29 - digit2;
            i18 = i28;
        }
        if (i27 == 0) {
            return -i17;
        }
        if (i18 > 1) {
            return i17;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("No digits to parse");
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final int zam(java.io.BufferedReader bufferedReader, char[] cArr) {
        int i17;
        char zai2 = zai(bufferedReader);
        if (zai2 == 0) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected EOF");
        }
        if (zai2 == ',') {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Missing value");
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (zai2 == '\"') {
            i17 = 0;
            boolean z17 = false;
            while (i17 < 1024 && bufferedReader.read(cArr, i17, 1) != -1) {
                char c17 = cArr[i17];
                if (java.lang.Character.isISOControl(c17)) {
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected control character while reading string");
                }
                int i18 = i17 + 1;
                if (c17 == '\"') {
                    if (!z17) {
                        bufferedReader.reset();
                        bufferedReader.skip(i18);
                        return i17;
                    }
                } else if (c17 == '\\') {
                    z17 = !z17;
                    i17 = i18;
                }
                z17 = false;
                i17 = i18;
            }
        } else {
            cArr[0] = zai2;
            i17 = 1;
            while (i17 < 1024 && bufferedReader.read(cArr, i17, 1) != -1) {
                char c18 = cArr[i17];
                if (c18 == '}' || c18 == ',' || java.lang.Character.isWhitespace(c18) || cArr[i17] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i17 - 1);
                    cArr[i17] = 0;
                    return i17;
                }
                i17++;
            }
        }
        if (i17 == 1024) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Absurdly long value");
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(java.io.BufferedReader bufferedReader) {
        long j17;
        int i17;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("No number to parse");
        }
        char c17 = cArr[0];
        long j18 = c17 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i18 = c17 == '-' ? 1 : 0;
        if (i18 < zam2) {
            i17 = i18 + 1;
            int digit = java.lang.Character.digit(cArr[i18], 10);
            if (digit < 0) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected non-digit character");
            }
            j17 = -digit;
        } else {
            j17 = 0;
            i17 = i18;
        }
        while (i17 < zam2) {
            int i19 = i17 + 1;
            int digit2 = java.lang.Character.digit(cArr[i17], 10);
            if (digit2 < 0) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected non-digit character");
            }
            if (j17 < -922337203685477580L) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Number too large");
            }
            long j19 = j17 * 10;
            int i27 = zam2;
            long j27 = digit2;
            if (j19 < j18 + j27) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Number too large");
            }
            j17 = j19 - j27;
            zam2 = i27;
            i17 = i19;
        }
        if (i18 == 0) {
            return -j17;
        }
        if (i17 > 1) {
            return j17;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zao(java.io.BufferedReader bufferedReader) {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final java.lang.String zap(java.io.BufferedReader bufferedReader, char[] cArr, java.lang.StringBuilder sb6, char[] cArr2) {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            return zaA(bufferedReader, cArr, sb6, cArr2);
        }
        if (zai2 != 'n') {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final java.lang.String zaq(java.io.BufferedReader bufferedReader) {
        this.zat.push(2);
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            this.zat.push(3);
            java.lang.String zaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return zaA;
            }
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Expected key/value separator");
        }
        if (zai2 == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (zai2 == '}') {
            zaw(2);
            return null;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected token: " + zai2);
    }

    private final java.lang.String zar(java.io.BufferedReader bufferedReader) {
        bufferedReader.mark(1024);
        char zai2 = zai(bufferedReader);
        int i17 = 1;
        if (zai2 == '\"') {
            if (bufferedReader.read(this.zao) == -1) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected EOF while parsing string");
            }
            char c17 = this.zao[0];
            boolean z17 = false;
            do {
                if (c17 == '\"') {
                    if (z17) {
                        c17 = '\"';
                        z17 = true;
                    }
                }
                z17 = c17 == '\\' ? !z17 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected EOF while parsing string");
                }
                c17 = this.zao[0];
            } while (!java.lang.Character.isISOControl(c17));
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected control character while reading string");
        }
        if (zai2 == ',') {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Missing value");
        }
        if (zai2 == '[') {
            this.zat.push(5);
            bufferedReader.mark(32);
            if (zai(bufferedReader) == ']') {
                zaw(5);
            } else {
                bufferedReader.reset();
                boolean z18 = false;
                boolean z19 = false;
                while (i17 > 0) {
                    char zai3 = zai(bufferedReader);
                    if (zai3 == 0) {
                        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected EOF while parsing array");
                    }
                    if (java.lang.Character.isISOControl(zai3)) {
                        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected control character while reading array");
                    }
                    if (zai3 == '\"') {
                        if (!z19) {
                            z18 = !z18;
                        }
                        zai3 = '\"';
                    }
                    if (zai3 == '[') {
                        if (!z18) {
                            i17++;
                        }
                        zai3 = '[';
                    }
                    if (zai3 == ']' && !z18) {
                        i17--;
                    }
                    z19 = (zai3 == '\\' && z18) ? !z19 : false;
                }
                zaw(5);
            }
        } else if (zai2 != '{') {
            bufferedReader.reset();
            zam(bufferedReader, this.zaq);
        } else {
            this.zat.push(1);
            bufferedReader.mark(32);
            char zai4 = zai(bufferedReader);
            if (zai4 == '}') {
                zaw(1);
            } else {
                if (zai4 != '\"') {
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected token " + zai4);
                }
                bufferedReader.reset();
                zaq(bufferedReader);
                do {
                } while (zar(bufferedReader) != null);
                zaw(1);
            }
        }
        char zai5 = zai(bufferedReader);
        if (zai5 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (zai5 == '}') {
            zaw(2);
            return null;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected token " + zai5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.math.BigDecimal zas(java.io.BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new java.math.BigDecimal(new java.lang.String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.math.BigInteger zat(java.io.BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new java.math.BigInteger(new java.lang.String(this.zaq, 0, zam2));
    }

    private final java.util.ArrayList zau(java.io.BufferedReader bufferedReader, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.zai zaiVar) {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (zai2 != '[') {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Expected start of array");
        }
        this.zat.push(5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char zai3 = zai(bufferedReader);
            if (zai3 == 0) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected EOF");
            }
            if (zai3 != ',') {
                if (zai3 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    private final java.util.ArrayList zav(java.io.BufferedReader bufferedReader, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field field) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 == ']') {
            zaw(5);
            return arrayList;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (zai2 != '{') {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected token: " + zai2);
        }
        this.zat.push(1);
        while (true) {
            try {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5 zad2 = field.zad();
                if (!zaz(bufferedReader, zad2)) {
                    return arrayList;
                }
                arrayList.add(zad2);
                char zai3 = zai(bufferedReader);
                if (zai3 != ',') {
                    if (zai3 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected token: " + zai3);
                }
                if (zai(bufferedReader) != '{') {
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (java.lang.IllegalAccessException e17) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Error instantiating inner object", e17);
            } catch (java.lang.InstantiationException e18) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Error instantiating inner object", e18);
            }
        }
    }

    private final void zaw(int i17) {
        if (this.zat.isEmpty()) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Expected state " + i17 + " but had empty stack");
        }
        int intValue = ((java.lang.Integer) this.zat.pop()).intValue();
        if (intValue == i17) {
            return;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Expected state " + i17 + " but had " + intValue);
    }

    private final void zax(java.io.BufferedReader bufferedReader, char[] cArr) {
        int i17 = 0;
        while (true) {
            int length = cArr.length;
            if (i17 >= length) {
                return;
            }
            int read = bufferedReader.read(this.zap, 0, length - i17);
            if (read == -1) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected EOF");
            }
            for (int i18 = 0; i18 < read; i18++) {
                if (cArr[i18 + i17] != this.zap[i18]) {
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected character");
                }
            }
            i17 += read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(java.io.BufferedReader bufferedReader, boolean z17) {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            if (z17) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (zai2 == 'f') {
            zax(bufferedReader, z17 ? zae : zad);
            return false;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (zai2 == 't') {
            zax(bufferedReader, z17 ? zac : zab);
            return true;
        }
        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected token: " + zai2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x003b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x024d A[SYNTHETIC] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zaz(java.io.BufferedReader r17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5 r18) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.zaz(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    /* renamed from: parse */
    public void m18481x6581ab3(java.io.InputStream inputStream, T t17) {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 == 0) {
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("No data to parse");
                }
                if (zai2 == '[') {
                    this.zat.push(5);
                    java.util.Map<java.lang.String, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?>> mo17356xb4d428c9 = t17.mo17356xb4d428c9();
                    if (mo17356xb4d428c9.size() != 1) {
                        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Object array response class must have a single Field");
                    }
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.AbstractC1975xf0edc3e5.Field<?, ?> value = mo17356xb4d428c9.entrySet().iterator().next().getValue();
                    t17.mo17354x74407976(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (zai2 != '{') {
                        throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException("Unexpected token: " + zai2);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t17);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused) {
                }
            } catch (java.io.IOException e17) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p213xca022f43.p215xebb71441.C1976x2a8d27bb.ParseException(e17);
            }
        } catch (java.lang.Throwable th6) {
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused2) {
            }
            throw th6;
        }
    }
}
