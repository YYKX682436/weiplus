package j4;

/* loaded from: classes13.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f379113a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f379114b = {112, 114, 109, 0};

    public static byte[] a(j4.b[] bVarArr, byte[] bArr) {
        int i17 = 0;
        int i18 = 0;
        for (j4.b bVar : bVarArr) {
            i18 += b(bVar.f379092a, bVar.f379093b, bArr).getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 16 + (bVar.f379096e * 2) + bVar.f379097f + (((((bVar.f379098g * 2) + 8) - 1) & (-8)) / 8);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i18);
        if (java.util.Arrays.equals(bArr, j4.o.f379117c)) {
            int length = bVarArr.length;
            while (i17 < length) {
                j4.b bVar2 = bVarArr[i17];
                l(byteArrayOutputStream, bVar2, b(bVar2.f379092a, bVar2.f379093b, bArr));
                n(byteArrayOutputStream, bVar2);
                k(byteArrayOutputStream, bVar2);
                m(byteArrayOutputStream, bVar2);
                i17++;
            }
        } else {
            for (j4.b bVar3 : bVarArr) {
                l(byteArrayOutputStream, bVar3, b(bVar3.f379092a, bVar3.f379093b, bArr));
            }
            int length2 = bVarArr.length;
            while (i17 < length2) {
                j4.b bVar4 = bVarArr[i17];
                n(byteArrayOutputStream, bVar4);
                k(byteArrayOutputStream, bVar4);
                m(byteArrayOutputStream, bVar4);
                i17++;
            }
        }
        if (byteArrayOutputStream.size() == i18) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new java.lang.IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i18);
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, byte[] bArr) {
        byte[] bArr2 = j4.o.f379119e;
        boolean equals = java.util.Arrays.equals(bArr, bArr2);
        byte[] bArr3 = j4.o.f379118d;
        java.lang.String str3 = (equals || java.util.Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        }
        if (str2.equals(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55634xb1d49d29)) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append((java.util.Arrays.equals(bArr, bArr2) || java.util.Arrays.equals(bArr, bArr3)) ? ":" : "!");
        sb6.append(str2);
        return sb6.toString();
    }

    public static int c(int i17, int i18, int i19) {
        if (i17 == 1) {
            throw new java.lang.IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i17 == 2) {
            return i18;
        }
        if (i17 == 4) {
            return i18 + i19;
        }
        throw new java.lang.IllegalStateException("Unexpected flag: " + i17);
    }

    public static int[] d(java.io.InputStream inputStream, int i17) {
        int[] iArr = new int[i17];
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            i18 += j4.c.e(inputStream);
            iArr[i19] = i18;
        }
        return iArr;
    }

    public static j4.b[] e(java.io.InputStream inputStream, byte[] bArr, byte[] bArr2, j4.b[] bVarArr) {
        byte[] bArr3 = j4.o.f379120f;
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            if (!java.util.Arrays.equals(bArr, j4.o.f379121g)) {
                throw new java.lang.IllegalStateException("Unsupported meta version");
            }
            int e17 = j4.c.e(inputStream);
            byte[] c17 = j4.c.c(inputStream, (int) j4.c.d(inputStream, 4), (int) j4.c.d(inputStream, 4));
            if (inputStream.read() > 0) {
                throw new java.lang.IllegalStateException("Content found after the end of file");
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(c17);
            try {
                j4.b[] g17 = g(byteArrayInputStream, bArr2, e17, bVarArr);
                byteArrayInputStream.close();
                return g17;
            } catch (java.lang.Throwable th6) {
                try {
                    byteArrayInputStream.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        }
        if (java.util.Arrays.equals(j4.o.f379115a, bArr2)) {
            throw new java.lang.IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            throw new java.lang.IllegalStateException("Unsupported meta version");
        }
        int d17 = (int) j4.c.d(inputStream, 1);
        byte[] c18 = j4.c.c(inputStream, (int) j4.c.d(inputStream, 4), (int) j4.c.d(inputStream, 4));
        if (inputStream.read() > 0) {
            throw new java.lang.IllegalStateException("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(c18);
        try {
            j4.b[] f17 = f(byteArrayInputStream2, d17, bVarArr);
            byteArrayInputStream2.close();
            return f17;
        } catch (java.lang.Throwable th8) {
            try {
                byteArrayInputStream2.close();
            } catch (java.lang.Throwable th9) {
                th8.addSuppressed(th9);
            }
            throw th8;
        }
    }

    public static j4.b[] f(java.io.InputStream inputStream, int i17, j4.b[] bVarArr) {
        if (inputStream.available() == 0) {
            return new j4.b[0];
        }
        if (i17 != bVarArr.length) {
            throw new java.lang.IllegalStateException("Mismatched number of dex files found in metadata");
        }
        java.lang.String[] strArr = new java.lang.String[i17];
        int[] iArr = new int[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            int e17 = j4.c.e(inputStream);
            iArr[i18] = j4.c.e(inputStream);
            strArr[i18] = new java.lang.String(j4.c.b(inputStream, e17), java.nio.charset.StandardCharsets.UTF_8);
        }
        for (int i19 = 0; i19 < i17; i19++) {
            j4.b bVar = bVarArr[i19];
            if (!bVar.f379093b.equals(strArr[i19])) {
                throw new java.lang.IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i27 = iArr[i19];
            bVar.f379096e = i27;
            bVar.f379099h = d(inputStream, i27);
        }
        return bVarArr;
    }

    public static j4.b[] g(java.io.InputStream inputStream, byte[] bArr, int i17, j4.b[] bVarArr) {
        j4.b bVar;
        if (inputStream.available() == 0) {
            return new j4.b[0];
        }
        if (i17 != bVarArr.length) {
            throw new java.lang.IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i18 = 0; i18 < i17; i18++) {
            j4.c.e(inputStream);
            java.lang.String str = new java.lang.String(j4.c.b(inputStream, j4.c.e(inputStream)), java.nio.charset.StandardCharsets.UTF_8);
            long d17 = j4.c.d(inputStream, 4);
            int e17 = j4.c.e(inputStream);
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                java.lang.String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i19 = 0; i19 < bVarArr.length; i19++) {
                    if (bVarArr[i19].f379093b.equals(substring)) {
                        bVar = bVarArr[i19];
                        break;
                    }
                }
            }
            bVar = null;
            if (bVar == null) {
                throw new java.lang.IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f379095d = d17;
            int[] d18 = d(inputStream, e17);
            if (java.util.Arrays.equals(bArr, j4.o.f379119e)) {
                bVar.f379096e = e17;
                bVar.f379099h = d18;
            }
        }
        return bVarArr;
    }

    public static j4.b[] h(java.io.InputStream inputStream, byte[] bArr, java.lang.String str) {
        if (!java.util.Arrays.equals(bArr, j4.o.f379116b)) {
            throw new java.lang.IllegalStateException("Unsupported version");
        }
        int d17 = (int) j4.c.d(inputStream, 1);
        byte[] c17 = j4.c.c(inputStream, (int) j4.c.d(inputStream, 4), (int) j4.c.d(inputStream, 4));
        if (inputStream.read() > 0) {
            throw new java.lang.IllegalStateException("Content found after the end of file");
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(c17);
        try {
            j4.b[] i17 = i(byteArrayInputStream, str, d17);
            byteArrayInputStream.close();
            return i17;
        } catch (java.lang.Throwable th6) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    public static j4.b[] i(java.io.InputStream inputStream, java.lang.String str, int i17) {
        java.util.TreeMap treeMap;
        if (inputStream.available() == 0) {
            return new j4.b[0];
        }
        j4.b[] bVarArr = new j4.b[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            int e17 = j4.c.e(inputStream);
            int e18 = j4.c.e(inputStream);
            bVarArr[i18] = new j4.b(str, new java.lang.String(j4.c.b(inputStream, e17), java.nio.charset.StandardCharsets.UTF_8), j4.c.d(inputStream, 4), 0L, e18, (int) j4.c.d(inputStream, 4), (int) j4.c.d(inputStream, 4), new int[e18], new java.util.TreeMap());
        }
        for (int i19 = 0; i19 < i17; i19++) {
            j4.b bVar = bVarArr[i19];
            int available = inputStream.available() - bVar.f379097f;
            int i27 = 0;
            while (true) {
                int available2 = inputStream.available();
                treeMap = bVar.f379100i;
                if (available2 <= available) {
                    break;
                }
                i27 += j4.c.e(inputStream);
                treeMap.put(java.lang.Integer.valueOf(i27), 1);
                for (int e19 = j4.c.e(inputStream); e19 > 0; e19--) {
                    j4.c.e(inputStream);
                    int d17 = (int) j4.c.d(inputStream, 1);
                    if (d17 != 6 && d17 != 7) {
                        while (d17 > 0) {
                            j4.c.d(inputStream, 1);
                            for (int d18 = (int) j4.c.d(inputStream, 1); d18 > 0; d18--) {
                                j4.c.e(inputStream);
                            }
                            d17--;
                        }
                    }
                }
            }
            if (inputStream.available() != available) {
                throw new java.lang.IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f379099h = d(inputStream, bVar.f379096e);
            int i28 = bVar.f379098g;
            java.util.BitSet valueOf = java.util.BitSet.valueOf(j4.c.b(inputStream, ((((i28 * 2) + 8) - 1) & (-8)) / 8));
            for (int i29 = 0; i29 < i28; i29++) {
                int i37 = valueOf.get(c(2, i29, i28)) ? 2 : 0;
                if (valueOf.get(c(4, i29, i28))) {
                    i37 |= 4;
                }
                if (i37 != 0) {
                    java.lang.Integer num = (java.lang.Integer) treeMap.get(java.lang.Integer.valueOf(i29));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37 | num.intValue()));
                }
            }
        }
        return bVarArr;
    }

    public static boolean j(java.io.OutputStream outputStream, byte[] bArr, j4.b[] bVarArr) {
        java.util.ArrayList arrayList;
        int length;
        byte[] bArr2 = j4.o.f379115a;
        int i17 = 0;
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = j4.o.f379116b;
            if (java.util.Arrays.equals(bArr, bArr3)) {
                byte[] a17 = a(bVarArr, bArr3);
                j4.c.f(outputStream, bVarArr.length, 1);
                j4.c.f(outputStream, a17.length, 4);
                byte[] a18 = j4.c.a(a17);
                j4.c.f(outputStream, a18.length, 4);
                outputStream.write(a18);
                return true;
            }
            byte[] bArr4 = j4.o.f379118d;
            if (java.util.Arrays.equals(bArr, bArr4)) {
                j4.c.f(outputStream, bVarArr.length, 1);
                for (j4.b bVar : bVarArr) {
                    int size = bVar.f379100i.size() * 4;
                    java.lang.String b17 = b(bVar.f379092a, bVar.f379093b, bArr4);
                    j4.c.g(outputStream, b17.getBytes(java.nio.charset.StandardCharsets.UTF_8).length);
                    j4.c.g(outputStream, bVar.f379099h.length);
                    j4.c.f(outputStream, size, 4);
                    j4.c.f(outputStream, bVar.f379094c, 4);
                    outputStream.write(b17.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                    java.util.Iterator it = bVar.f379100i.keySet().iterator();
                    while (it.hasNext()) {
                        j4.c.g(outputStream, ((java.lang.Integer) it.next()).intValue());
                        j4.c.g(outputStream, 0);
                    }
                    for (int i18 : bVar.f379099h) {
                        j4.c.g(outputStream, i18);
                    }
                }
                return true;
            }
            byte[] bArr5 = j4.o.f379117c;
            if (java.util.Arrays.equals(bArr, bArr5)) {
                byte[] a19 = a(bVarArr, bArr5);
                j4.c.f(outputStream, bVarArr.length, 1);
                j4.c.f(outputStream, a19.length, 4);
                byte[] a27 = j4.c.a(a19);
                j4.c.f(outputStream, a27.length, 4);
                outputStream.write(a27);
                return true;
            }
            byte[] bArr6 = j4.o.f379119e;
            if (!java.util.Arrays.equals(bArr, bArr6)) {
                return false;
            }
            j4.c.g(outputStream, bVarArr.length);
            for (j4.b bVar2 : bVarArr) {
                java.lang.String b18 = b(bVar2.f379092a, bVar2.f379093b, bArr6);
                j4.c.g(outputStream, b18.getBytes(java.nio.charset.StandardCharsets.UTF_8).length);
                java.util.TreeMap treeMap = bVar2.f379100i;
                j4.c.g(outputStream, treeMap.size());
                j4.c.g(outputStream, bVar2.f379099h.length);
                j4.c.f(outputStream, bVar2.f379094c, 4);
                outputStream.write(b18.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                java.util.Iterator it6 = treeMap.keySet().iterator();
                while (it6.hasNext()) {
                    j4.c.g(outputStream, ((java.lang.Integer) it6.next()).intValue());
                }
                for (int i19 : bVar2.f379099h) {
                    j4.c.g(outputStream, i19);
                }
            }
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(3);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            j4.c.g(byteArrayOutputStream, bVarArr.length);
            int i27 = 2;
            int i28 = 2;
            for (j4.b bVar3 : bVarArr) {
                j4.c.f(byteArrayOutputStream, bVar3.f379094c, 4);
                j4.c.f(byteArrayOutputStream, bVar3.f379095d, 4);
                j4.c.f(byteArrayOutputStream, bVar3.f379098g, 4);
                java.lang.String b19 = b(bVar3.f379092a, bVar3.f379093b, bArr2);
                int length2 = b19.getBytes(java.nio.charset.StandardCharsets.UTF_8).length;
                j4.c.g(byteArrayOutputStream, length2);
                i28 = i28 + 4 + 4 + 4 + 2 + (length2 * 1);
                byteArrayOutputStream.write(b19.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i28 != byteArray.length) {
                throw new java.lang.IllegalStateException("Expected size " + i28 + ", does not match actual size " + byteArray.length);
            }
            j4.p pVar = new j4.p(j4.d.DEX_FILES, i28, byteArray, false);
            byteArrayOutputStream.close();
            arrayList2.add(pVar);
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
            int i29 = 0;
            for (int i37 = 0; i37 < bVarArr.length; i37++) {
                try {
                    j4.b bVar4 = bVarArr[i37];
                    j4.c.g(byteArrayOutputStream2, i37);
                    j4.c.g(byteArrayOutputStream2, bVar4.f379096e);
                    i29 = i29 + 2 + 2 + (bVar4.f379096e * 2);
                    k(byteArrayOutputStream2, bVar4);
                } finally {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            if (i29 != byteArray2.length) {
                throw new java.lang.IllegalStateException("Expected size " + i29 + ", does not match actual size " + byteArray2.length);
            }
            j4.p pVar2 = new j4.p(j4.d.CLASSES, i29, byteArray2, true);
            byteArrayOutputStream2.close();
            arrayList2.add(pVar2);
            byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
            int i38 = 0;
            int i39 = 0;
            while (i38 < bVarArr.length) {
                try {
                    j4.b bVar5 = bVarArr[i38];
                    java.util.Iterator it7 = bVar5.f379100i.entrySet().iterator();
                    int i47 = i17;
                    while (it7.hasNext()) {
                        i47 |= ((java.lang.Integer) ((java.util.Map.Entry) it7.next()).getValue()).intValue();
                    }
                    java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
                    try {
                        m(byteArrayOutputStream3, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        byteArrayOutputStream3.close();
                        byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
                        try {
                            n(byteArrayOutputStream3, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                            byteArrayOutputStream3.close();
                            j4.c.g(byteArrayOutputStream2, i38);
                            int length3 = byteArray3.length + i27 + byteArray4.length;
                            int i48 = i39 + 2 + 4;
                            java.util.ArrayList arrayList4 = arrayList3;
                            j4.c.f(byteArrayOutputStream2, length3, 4);
                            j4.c.g(byteArrayOutputStream2, i47);
                            byteArrayOutputStream2.write(byteArray3);
                            byteArrayOutputStream2.write(byteArray4);
                            i39 = i48 + length3;
                            i38++;
                            arrayList3 = arrayList4;
                            i17 = 0;
                            i27 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            java.util.ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
            if (i39 != byteArray5.length) {
                throw new java.lang.IllegalStateException("Expected size " + i39 + ", does not match actual size " + byteArray5.length);
            }
            j4.p pVar3 = new j4.p(j4.d.METHODS, i39, byteArray5, true);
            byteArrayOutputStream2.close();
            arrayList2.add(pVar3);
            long j17 = 4;
            long size2 = j17 + j17 + 4 + (arrayList2.size() * 16);
            j4.c.f(outputStream, arrayList2.size(), 4);
            int i49 = 0;
            while (i49 < arrayList2.size()) {
                j4.p pVar4 = (j4.p) arrayList2.get(i49);
                j4.c.f(outputStream, pVar4.f379122a.f379105d, 4);
                j4.c.f(outputStream, size2, 4);
                boolean z17 = pVar4.f379124c;
                byte[] bArr7 = pVar4.f379123b;
                if (z17) {
                    long length4 = bArr7.length;
                    byte[] a28 = j4.c.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a28);
                    j4.c.f(outputStream, a28.length, 4);
                    j4.c.f(outputStream, length4, 4);
                    length = a28.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    j4.c.f(outputStream, bArr7.length, 4);
                    j4.c.f(outputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i49++;
                arrayList5 = arrayList;
            }
            java.util.ArrayList arrayList6 = arrayList5;
            for (int i57 = 0; i57 < arrayList6.size(); i57++) {
                outputStream.write((byte[]) arrayList6.get(i57));
            }
            return true;
        } finally {
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (java.lang.Throwable th6) {
                th.addSuppressed(th6);
            }
        }
    }

    public static void k(java.io.OutputStream outputStream, j4.b bVar) {
        int i17 = 0;
        for (int i18 : bVar.f379099h) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            j4.c.g(outputStream, valueOf.intValue() - i17);
            i17 = valueOf.intValue();
        }
    }

    public static void l(java.io.OutputStream outputStream, j4.b bVar, java.lang.String str) {
        j4.c.g(outputStream, str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length);
        j4.c.g(outputStream, bVar.f379096e);
        j4.c.f(outputStream, bVar.f379097f, 4);
        j4.c.f(outputStream, bVar.f379094c, 4);
        j4.c.f(outputStream, bVar.f379098g, 4);
        outputStream.write(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public static void m(java.io.OutputStream outputStream, j4.b bVar) {
        byte[] bArr = new byte[((((bVar.f379098g * 2) + 8) - 1) & (-8)) / 8];
        for (java.util.Map.Entry entry : bVar.f379100i.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            int i17 = intValue2 & 2;
            int i18 = bVar.f379098g;
            if (i17 != 0) {
                int c17 = c(2, intValue, i18);
                int i19 = c17 / 8;
                bArr[i19] = (byte) ((1 << (c17 % 8)) | bArr[i19]);
            }
            if ((intValue2 & 4) != 0) {
                int c18 = c(4, intValue, i18);
                int i27 = c18 / 8;
                bArr[i27] = (byte) ((1 << (c18 % 8)) | bArr[i27]);
            }
        }
        outputStream.write(bArr);
    }

    public static void n(java.io.OutputStream outputStream, j4.b bVar) {
        int i17 = 0;
        for (java.util.Map.Entry entry : bVar.f379100i.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            if ((((java.lang.Integer) entry.getValue()).intValue() & 1) != 0) {
                j4.c.g(outputStream, intValue - i17);
                j4.c.g(outputStream, 0);
                i17 = intValue;
            }
        }
    }
}
