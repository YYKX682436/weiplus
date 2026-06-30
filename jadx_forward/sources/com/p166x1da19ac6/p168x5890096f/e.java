package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public class e extends com.p166x1da19ac6.p168x5890096f.d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f125552c = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f125553a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.File f125554b;

    public e(android.content.Context context) {
        java.lang.String str;
        java.lang.String a17 = com.p166x1da19ac6.p168x5890096f.a0.a();
        if (a17 != null) {
            java.lang.String[] split = a17.split(":");
            int length = split.length;
            for (int i17 = 0; i17 < length; i17++) {
                str = split[i17];
                if (str.contains(".apk!/")) {
                    break;
                }
            }
        }
        str = null;
        this.f125553a = str;
        this.f125554b = new java.io.File(context.getApplicationInfo().sourceDir);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        r5 = new com.p166x1da19ac6.p168x5890096f.i(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (com.p166x1da19ac6.p168x5890096f.c0.f125537a == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        com.p166x1da19ac6.p168x5890096f.a.a("SoLoader.getElfDependencies[", r13, "]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r6 = com.p166x1da19ac6.p168x5890096f.w.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r8 >= r7) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        r9 = r6[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r0.contains(r9) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r9.startsWith("/") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        com.p166x1da19ac6.p168x5890096f.c0.f(r9, null, null, r14 | 1, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        r4.close();
        r14 = r14 | 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        ((com.p166x1da19ac6.p168x5890096f.z) com.p166x1da19ac6.p168x5890096f.c0.f125538b).b(r1 + java.io.File.separator + r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007f, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0080, code lost:
    
        r14 = com.p166x1da19ac6.p168x5890096f.c0.f125537a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
    
        r13 = move-exception;
     */
    @Override // com.p166x1da19ac6.p168x5890096f.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.lang.String r13, int r14, android.os.StrictMode.ThreadPolicy r15) {
        /*
            r12 = this;
            com.facebook.soloader.y r0 = com.p166x1da19ac6.p168x5890096f.c0.f125538b
            if (r0 == 0) goto Lbf
            java.util.Set r0 = com.p166x1da19ac6.p168x5890096f.e.f125552c
            boolean r1 = r0.contains(r13)
            r2 = 0
            if (r1 == 0) goto Lbe
            java.lang.String r1 = r12.f125553a
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L17
            goto Lbe
        L17:
            java.lang.String r3 = "/"
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile
            java.io.File r5 = r12.f125554b
            r4.<init>(r5)
            java.util.Enumeration r5 = r4.entries()     // Catch: java.lang.Throwable -> Lb2
        L24:
            boolean r6 = r5.hasMoreElements()     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L8f
            java.lang.Object r6 = r5.nextElement()     // Catch: java.lang.Throwable -> Lb2
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L24
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r8.<init>()     // Catch: java.lang.Throwable -> Lb2
            r8.append(r3)     // Catch: java.lang.Throwable -> Lb2
            r8.append(r13)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lb2
            boolean r7 = r7.endsWith(r8)     // Catch: java.lang.Throwable -> Lb2
            if (r7 == 0) goto L24
            com.facebook.soloader.i r5 = new com.facebook.soloader.i     // Catch: java.lang.Throwable -> Lb2
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> Lb2
            boolean r6 = com.p166x1da19ac6.p168x5890096f.c0.f125537a     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L5b
            java.lang.String r6 = "SoLoader.getElfDependencies["
            java.lang.String r7 = "]"
            com.p166x1da19ac6.p168x5890096f.a.a(r6, r13, r7)     // Catch: java.lang.Throwable -> L83
        L5b:
            java.lang.String[] r6 = com.p166x1da19ac6.p168x5890096f.w.a(r5)     // Catch: java.lang.Throwable -> L7f
            int r7 = r6.length     // Catch: java.lang.Throwable -> L83
            r8 = r2
        L61:
            if (r8 >= r7) goto L7b
            r9 = r6[r8]     // Catch: java.lang.Throwable -> L83
            boolean r10 = r0.contains(r9)     // Catch: java.lang.Throwable -> L83
            if (r10 != 0) goto L78
            boolean r10 = r9.startsWith(r3)     // Catch: java.lang.Throwable -> L83
            if (r10 == 0) goto L72
            goto L78
        L72:
            r10 = r14 | 1
            r11 = 0
            com.p166x1da19ac6.p168x5890096f.c0.f(r9, r11, r11, r10, r15)     // Catch: java.lang.Throwable -> L83
        L78:
            int r8 = r8 + 1
            goto L61
        L7b:
            r5.close()     // Catch: java.lang.Throwable -> Lb2
            goto L8f
        L7f:
            r13 = move-exception
            boolean r14 = com.p166x1da19ac6.p168x5890096f.c0.f125537a     // Catch: java.lang.Throwable -> L83
            throw r13     // Catch: java.lang.Throwable -> L83
        L83:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> L85
        L85:
            r14 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r15 = move-exception
            r13.addSuppressed(r15)     // Catch: java.lang.Throwable -> Lb2
        L8e:
            throw r14     // Catch: java.lang.Throwable -> Lb2
        L8f:
            r4.close()
            r14 = r14 | 4
            com.facebook.soloader.y r15 = com.p166x1da19ac6.p168x5890096f.c0.f125538b     // Catch: java.lang.UnsatisfiedLinkError -> Lb1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.UnsatisfiedLinkError -> Lb1
            r0.<init>()     // Catch: java.lang.UnsatisfiedLinkError -> Lb1
            r0.append(r1)     // Catch: java.lang.UnsatisfiedLinkError -> Lb1
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.UnsatisfiedLinkError -> Lb1
            r0.append(r1)     // Catch: java.lang.UnsatisfiedLinkError -> Lb1
            r0.append(r13)     // Catch: java.lang.UnsatisfiedLinkError -> Lb1
            java.lang.String r13 = r0.toString()     // Catch: java.lang.UnsatisfiedLinkError -> Lb1
            com.facebook.soloader.z r15 = (com.p166x1da19ac6.p168x5890096f.z) r15     // Catch: java.lang.UnsatisfiedLinkError -> Lb1
            r15.b(r13, r14)     // Catch: java.lang.UnsatisfiedLinkError -> Lb1
            r13 = 1
            return r13
        Lb1:
            return r2
        Lb2:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r14 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Lb9
            goto Lbd
        Lb9:
            r15 = move-exception
            r13.addSuppressed(r15)
        Lbd:
            throw r14
        Lbe:
            return r2
        Lbf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "SoLoader.init() not yet called"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p166x1da19ac6.p168x5890096f.e.a(java.lang.String, int, android.os.StrictMode$ThreadPolicy):int");
    }

    @Override // com.p166x1da19ac6.p168x5890096f.d0
    public void b(int i17) {
        int indexOf;
        int i18;
        java.lang.String str = this.f125553a;
        java.lang.String substring = (android.text.TextUtils.isEmpty(str) || (indexOf = str.indexOf(33)) < 0 || (i18 = indexOf + 2) >= str.length()) ? null : str.substring(i18);
        if (substring == null) {
            return;
        }
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(this.f125554b);
        try {
            java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                java.util.zip.ZipEntry nextElement = entries.nextElement();
                if (nextElement != null && nextElement.getName().startsWith(substring) && nextElement.getName().endsWith(".so") && nextElement.getMethod() == 0) {
                    f125552c.add(nextElement.getName().substring(substring.length() + 1));
                }
            }
            zipFile.close();
        } finally {
        }
    }

    @Override // com.p166x1da19ac6.p168x5890096f.d0
    /* renamed from: toString */
    public java.lang.String mo16739x9616526c() {
        return com.p166x1da19ac6.p168x5890096f.e.class.getName() + "[root = " + this.f125553a + ']';
    }
}
