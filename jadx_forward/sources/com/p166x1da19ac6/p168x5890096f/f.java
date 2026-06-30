package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public class f extends com.p166x1da19ac6.p168x5890096f.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f125555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125556b;

    public f(java.io.File file, int i17) {
        this.f125555a = file;
        this.f125556b = i17;
    }

    @Override // com.p166x1da19ac6.p168x5890096f.d0
    public int a(java.lang.String str, int i17, android.os.StrictMode.ThreadPolicy threadPolicy) {
        return c(str, i17, this.f125555a, threadPolicy);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(java.lang.String r9, int r10, java.io.File r11, android.os.StrictMode.ThreadPolicy r12) {
        /*
            r8 = this;
            com.facebook.soloader.y r0 = com.p166x1da19ac6.p168x5890096f.c0.f125538b
            if (r0 == 0) goto Lb6
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.f125555a
            r0.<init>(r1, r9)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L13
            goto L14
        L13:
            r0 = r2
        L14:
            r1 = 0
            if (r0 != 0) goto L1b
            r11.getCanonicalPath()
            return r1
        L1b:
            r11.getCanonicalPath()
            r11 = r10 & 1
            int r3 = r8.f125556b
            if (r11 == 0) goto L2a
            r11 = r3 & 2
            if (r11 == 0) goto L2a
            r9 = 2
            return r9
        L2a:
            r11 = 1
            r3 = r3 & r11
            if (r3 == 0) goto L30
            r3 = r11
            goto L31
        L30:
            r3 = r1
        L31:
            java.lang.String r4 = r0.getName()
            boolean r4 = r4.equals(r9)
            if (r3 != 0) goto L40
            if (r4 != 0) goto L3e
            goto L40
        L3e:
            r5 = r2
            goto L45
        L40:
            com.facebook.soloader.h r5 = new com.facebook.soloader.h     // Catch: java.lang.Throwable -> Laf
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Laf
        L45:
            if (r3 == 0) goto L75
            boolean r3 = com.p166x1da19ac6.p168x5890096f.c0.f125537a     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L52
            java.lang.String r3 = "SoLoader.getElfDependencies["
            java.lang.String r6 = "]"
            com.p166x1da19ac6.p168x5890096f.a.a(r3, r9, r6)     // Catch: java.lang.Throwable -> L98
        L52:
            java.lang.String[] r9 = com.p166x1da19ac6.p168x5890096f.w.a(r5)     // Catch: java.lang.Throwable -> L6f
            java.util.Arrays.toString(r9)     // Catch: java.lang.Throwable -> L98
            int r3 = r9.length     // Catch: java.lang.Throwable -> L98
        L5a:
            if (r1 >= r3) goto L75
            r6 = r9[r1]     // Catch: java.lang.Throwable -> L98
            java.lang.String r7 = "/"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L67
            goto L6c
        L67:
            r7 = r10 | 1
            com.p166x1da19ac6.p168x5890096f.c0.f(r6, r2, r2, r7, r12)     // Catch: java.lang.Throwable -> L98
        L6c:
            int r1 = r1 + 1
            goto L5a
        L6f:
            r9 = move-exception
            boolean r10 = com.p166x1da19ac6.p168x5890096f.c0.f125537a     // Catch: java.lang.Throwable -> L98
            throw r9     // Catch: java.lang.Throwable -> L98
        L73:
            r2 = r5
            goto Lb0
        L75:
            if (r4 == 0) goto L88
            com.facebook.soloader.y r9 = com.p166x1da19ac6.p168x5890096f.c0.f125538b     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
            java.lang.String r12 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
            com.facebook.soloader.z r9 = (com.p166x1da19ac6.p168x5890096f.z) r9     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
            r9.b(r12, r10)     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
            if (r5 == 0) goto L87
            r5.close()
        L87:
            return r11
        L88:
            com.facebook.soloader.y r9 = com.p166x1da19ac6.p168x5890096f.c0.f125538b     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
            r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
            com.facebook.soloader.z r9 = (com.p166x1da19ac6.p168x5890096f.z) r9     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
            r9.getClass()     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
            r9.<init>()     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
            throw r9     // Catch: java.lang.Throwable -> L98 java.lang.UnsatisfiedLinkError -> L9a
        L98:
            r9 = move-exception
            goto L73
        L9a:
            r9 = move-exception
            java.lang.String r10 = r9.getMessage()     // Catch: java.lang.Throwable -> L98
            java.lang.String r11 = "bad ELF magic"
            boolean r10 = r10.contains(r11)     // Catch: java.lang.Throwable -> L98
            if (r10 == 0) goto Lae
            if (r5 == 0) goto Lac
            r5.close()
        Lac:
            r9 = 3
            return r9
        Lae:
            throw r9     // Catch: java.lang.Throwable -> L98
        Laf:
            r9 = move-exception
        Lb0:
            if (r2 == 0) goto Lb5
            r2.close()
        Lb5:
            throw r9
        Lb6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "SoLoader.init() not yet called"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p166x1da19ac6.p168x5890096f.f.c(java.lang.String, int, java.io.File, android.os.StrictMode$ThreadPolicy):int");
    }

    @Override // com.p166x1da19ac6.p168x5890096f.d0
    /* renamed from: toString */
    public java.lang.String mo16739x9616526c() {
        java.lang.String name;
        java.io.File file = this.f125555a;
        try {
            name = java.lang.String.valueOf(file.getCanonicalPath());
        } catch (java.io.IOException unused) {
            name = file.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.f125556b + ']';
    }
}
