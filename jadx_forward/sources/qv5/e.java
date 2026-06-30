package qv5;

/* loaded from: classes13.dex */
public abstract class e extends qv5.c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f448580a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f448581b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f448582c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f448583d = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104754x7b9a1122();

    public static boolean c(java.lang.String str) {
        java.util.HashMap hashMap = f448582c;
        hashMap.clear();
        java.util.ArrayList arrayList = f448581b;
        boolean z17 = false;
        if (!arrayList.isEmpty() && f448583d) {
            java.util.Iterator it = arrayList.iterator();
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed99 = null;
            java.io.File file = null;
            while (it.hasNext()) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed992 = (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99) it.next();
                java.io.File file2 = new java.io.File(str + c26632x3b07ed992.f55763xccb84949);
                if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55630x4296ce58.matcher(file2.getName()).matches()) {
                    hashMap.put(c26632x3b07ed992, file2);
                }
                if (c26632x3b07ed992.f55762x3abe52d3.startsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55726x3eeb7ee0)) {
                    c26632x3b07ed99 = c26632x3b07ed992;
                    file = file2;
                }
            }
            if (c26632x3b07ed99 != null) {
                hashMap.put(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104721xf5db5ba6(c26632x3b07ed99, hashMap.size() + 1), file);
            }
            java.io.File file3 = new java.io.File(str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55629x4d21106);
            if (file3.exists()) {
                java.util.Iterator it6 = hashMap.keySet().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z17 = true;
                        break;
                    }
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed993 = (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99) it6.next();
                    if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104693x8a7ff3a4(file3, c26632x3b07ed993.f55762x3abe52d3, c26632x3b07ed993.f55754xf2f170e2)) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DexDiffPatchInternal", "verify dex file md5 error, entry name; %s, file len: %d", c26632x3b07ed993.f55762x3abe52d3, java.lang.Long.valueOf(file3.length()));
                        break;
                    }
                }
                if (!z17) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104690x85427134(file3);
                }
            }
            if (z17) {
                java.util.Iterator it7 = hashMap.values().iterator();
                while (it7.hasNext()) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104690x85427134((java.io.File) it7.next());
                }
            }
        }
        return z17;
    }

    public static boolean d(java.util.zip.ZipFile zipFile, java.util.zip.ZipEntry zipEntry, java.io.File file, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed99) {
        java.util.zip.ZipOutputStream zipOutputStream;
        java.lang.String str = f448583d ? c26632x3b07ed99.f55754xf2f170e2 : c26632x3b07ed99.f55755xf2f17c9a;
        java.lang.String str2 = c26632x3b07ed99.f55762x3abe52d3;
        boolean z17 = c26632x3b07ed99.f55758x70b709d4;
        if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104687x81f6e9b5(str2) || !z17) {
            return qv5.c.a(zipFile, zipEntry, file, str, true);
        }
        int i17 = 0;
        boolean z18 = false;
        while (i17 < 2 && !z18) {
            i17++;
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DexDiffPatchInternal", "try Extracting " + file.getPath(), new java.lang.Object[0]);
            java.io.BufferedInputStream bufferedInputStream = null;
            try {
                if (file.exists()) {
                    file.delete();
                }
                zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(file)));
                try {
                    if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(33, true)) {
                        file.setReadOnly();
                    }
                    java.io.BufferedInputStream bufferedInputStream2 = new java.io.BufferedInputStream(zipFile.getInputStream(zipEntry));
                    try {
                        byte[] bArr = new byte[4096];
                        zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55634xb1d49d29));
                        for (int read = bufferedInputStream2.read(bArr); read != -1; read = bufferedInputStream2.read(bArr)) {
                            zipOutputStream.write(bArr, 0, read);
                        }
                        zipOutputStream.closeEntry();
                        lv5.a.a(bufferedInputStream2);
                        lv5.a.a(zipOutputStream);
                        z18 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104692x8a7ff3a4(file, str);
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DexDiffPatchInternal", "isExtractionSuccessful: %b", java.lang.Boolean.valueOf(z18));
                        if (!z18 && (!file.delete() || file.exists())) {
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DexDiffPatchInternal", "Failed to delete corrupted dex " + file.getPath(), new java.lang.Object[0]);
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedInputStream = bufferedInputStream2;
                        lv5.a.a(bufferedInputStream);
                        lv5.a.a(zipOutputStream);
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                zipOutputStream = null;
            }
        }
        return z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(android.content.Context r16, java.io.File r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qv5.e.e(android.content.Context, java.io.File, java.lang.String):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.zip.ZipInputStream, java.lang.Object, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v15, types: [hv5.a] */
    /* JADX WARN: Type inference failed for: r5v16, types: [hv5.a] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.zip.ZipOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.OutputStream, java.lang.Object, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r7v8, types: [hv5.a] */
    public static void f(java.util.zip.ZipFile zipFile, java.util.zip.ZipFile zipFile2, java.util.zip.ZipEntry zipEntry, java.util.zip.ZipEntry zipEntry2, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26632x3b07ed99 c26632x3b07ed99, java.io.File file) {
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        java.io.BufferedInputStream bufferedInputStream3;
        ?? zipOutputStream;
        java.util.zip.ZipEntry nextEntry;
        ?? bufferedOutputStream;
        java.io.BufferedInputStream bufferedInputStream4 = null;
        try {
            bufferedInputStream2 = new java.io.BufferedInputStream(zipFile.getInputStream(zipEntry));
            if (zipEntry2 != null) {
                try {
                    bufferedInputStream3 = new java.io.BufferedInputStream(zipFile2.getInputStream(zipEntry2));
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedInputStream = null;
                    bufferedInputStream4 = bufferedInputStream2;
                    lv5.a.a(bufferedInputStream4);
                    lv5.a.a(bufferedInputStream);
                    throw th;
                }
            } else {
                bufferedInputStream3 = null;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            bufferedInputStream = null;
        }
        try {
            if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(33, true)) {
                file.setReadOnly();
            }
            boolean m104687x81f6e9b5 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104687x81f6e9b5(c26632x3b07ed99.f55762x3abe52d3);
            try {
                try {
                    if (m104687x81f6e9b5 && !c26632x3b07ed99.f55758x70b709d4) {
                        ?? aVar = new hv5.a(bufferedInputStream2, bufferedInputStream3);
                        try {
                            bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file));
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                        }
                        try {
                            aVar.a(bufferedOutputStream);
                            lv5.a.a(bufferedOutputStream);
                            lv5.a.a(bufferedInputStream2);
                            lv5.a.a(bufferedInputStream3);
                            return;
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            bufferedInputStream4 = bufferedOutputStream;
                            lv5.a.a(bufferedInputStream4);
                            throw th;
                        }
                    }
                    zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55634xb1d49d29));
                    if (m104687x81f6e9b5) {
                        new hv5.a(bufferedInputStream2, bufferedInputStream3).a(zipOutputStream);
                    } else {
                        try {
                            ?? zipInputStream = new java.util.zip.ZipInputStream(bufferedInputStream2);
                            do {
                                try {
                                    nextEntry = zipInputStream.getNextEntry();
                                    if (nextEntry == null) {
                                        break;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    bufferedInputStream4 = zipInputStream;
                                    lv5.a.a(bufferedInputStream4);
                                    throw th;
                                }
                            } while (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55634xb1d49d29.equals(nextEntry.getName()));
                            if (nextEntry == null) {
                                throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("can't recognize zip dex format file:" + file.getAbsolutePath());
                            }
                            new hv5.a(zipInputStream, bufferedInputStream3).a(zipOutputStream);
                            lv5.a.a(zipInputStream);
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                        }
                    }
                    zipOutputStream.closeEntry();
                    lv5.a.a(zipOutputStream);
                    lv5.a.a(bufferedInputStream2);
                    lv5.a.a(bufferedInputStream3);
                    return;
                } catch (java.lang.Throwable th12) {
                    th = th12;
                    bufferedInputStream4 = zipOutputStream;
                    lv5.a.a(bufferedInputStream4);
                    throw th;
                }
                if (file.exists()) {
                    file.delete();
                }
                zipOutputStream = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(file)));
            } catch (java.lang.Throwable th13) {
                th = th13;
            }
        } catch (java.lang.Throwable th14) {
            bufferedInputStream4 = bufferedInputStream2;
            bufferedInputStream = bufferedInputStream3;
            th = th14;
            lv5.a.a(bufferedInputStream4);
            lv5.a.a(bufferedInputStream);
            throw th;
        }
    }

    public static boolean g(java.io.File file, tv5.b bVar) {
        boolean z17;
        java.util.ArrayList arrayList = f448580a;
        if (arrayList.isEmpty()) {
            return true;
        }
        java.util.ArrayList arrayList2 = f448581b;
        int size = arrayList2.size() * 30;
        if (size > 120) {
            size = 120;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DexDiffPatchInternal", "raw dex count: %d, dex opt dex count: %d, final wait times: %d", java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(size));
        int i17 = 0;
        while (i17 < size) {
            i17++;
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = true;
                    break;
                }
                java.io.File file2 = (java.io.File) it.next();
                if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file2) && !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104691x54677ec4(file2)) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DexDiffPatchInternal", "parallel dex optimizer file %s is not exist, just wait %d times", file2.getName(), java.lang.Integer.valueOf(i17));
                    z17 = false;
                    break;
                }
            }
            if (!z17) {
                try {
                    java.lang.Thread.sleep(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                } catch (java.lang.InterruptedException e17) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DexDiffPatchInternal", "thread sleep InterruptedException e:" + e17, new java.lang.Object[0]);
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.io.File file3 = (java.io.File) it6.next();
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DexDiffPatchInternal", "check dex optimizer file exist: %s, size %d", file3.getPath(), java.lang.Long.valueOf(file3.length()));
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file3) && !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104691x54677ec4(file3)) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DexDiffPatchInternal", "final parallel dex optimizer file %s is not exist, return false", file3.getName());
                arrayList3.add(file3);
            }
        }
        if (!arrayList3.isEmpty()) {
            bVar.f503905e.b(file, arrayList3, new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55626x99ea7522));
            return false;
        }
        java.util.Iterator it7 = arrayList.iterator();
        java.lang.Throwable th6 = null;
        while (it7.hasNext()) {
            java.io.File file4 = (java.io.File) it7.next();
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104691x54677ec4(file4)) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DexDiffPatchInternal", "check dex optimizer file format: %s, size %d", file4.getName(), java.lang.Long.valueOf(file4.length()));
                try {
                    if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.m104631x9feb9daa(file4) == 1) {
                        try {
                            lv5.a.a(new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc(file4));
                        } catch (java.lang.Throwable th7) {
                            th6 = th7;
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DexDiffPatchInternal", "final parallel dex optimizer file %s is not elf format, return false", file4.getName());
                            arrayList3.add(file4);
                        }
                    }
                } catch (java.io.IOException unused) {
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return true;
        }
        bVar.f503905e.b(file, arrayList3, th6 == null ? new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55627x6a5b804a) : new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55627x6a5b804a, th6));
        return false;
    }
}
