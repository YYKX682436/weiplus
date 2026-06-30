package vz5;

/* loaded from: classes7.dex */
public abstract class q extends vz5.p {
    public static final boolean d(java.io.File file) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "<this>");
        vz5.j jVar = new vz5.j(new vz5.l(file, vz5.m.f523334e));
        while (true) {
            boolean z17 = true;
            while (jVar.hasNext()) {
                java.io.File file2 = (java.io.File) jVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z17) {
                        break;
                    }
                }
                z17 = false;
            }
            return z17;
        }
    }

    public static final vz5.d e(vz5.d dVar) {
        java.io.File file = dVar.f523315a;
        java.util.List<java.io.File> list = dVar.f523316b;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.io.File file2 : list) {
            java.lang.String name = file2.getName();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, ".")) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.io.File) kz5.n0.i0(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return new vz5.d(file, arrayList);
    }

    public static final java.io.File f(java.io.File file, java.lang.String relative) {
        java.io.File file2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(relative, "relative");
        java.io.File file3 = new java.io.File(relative);
        java.lang.String path = file3.getPath();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "getPath(...)");
        if (vz5.n.a(path) > 0) {
            return file3;
        }
        java.lang.String file4 = file.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(file4, "toString(...)");
        if ((file4.length() == 0) || r26.n0.E(file4, java.io.File.separatorChar, false, 2, null)) {
            file2 = new java.io.File(file4 + file3);
        } else {
            file2 = new java.io.File(file4 + java.io.File.separatorChar + file3);
        }
        return file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String g(java.io.File r18, java.io.File r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r2)
            java.lang.String r2 = "base"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            vz5.d r2 = vz5.n.b(r18)
            vz5.d r2 = e(r2)
            vz5.d r3 = vz5.n.b(r19)
            vz5.d r3 = e(r3)
            java.io.File r4 = r2.f523315a
            java.io.File r5 = r3.f523315a
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r5)
            if (r4 != 0) goto L29
            goto L68
        L29:
            java.util.List r3 = r3.f523316b
            int r4 = r3.size()
            java.util.List r2 = r2.f523316b
            int r5 = r2.size()
            int r6 = java.lang.Math.min(r5, r4)
            r7 = 0
        L3a:
            if (r7 >= r6) goto L4d
            java.lang.Object r8 = r2.get(r7)
            java.lang.Object r9 = r3.get(r7)
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r9)
            if (r8 == 0) goto L4d
            int r7 = r7 + 1
            goto L3a
        L4d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r8 = r4 + (-1)
            if (r7 > r8) goto L79
        L56:
            java.lang.Object r9 = r3.get(r8)
            java.io.File r9 = (java.io.File) r9
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = ".."
            boolean r9 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r9, r10)
            if (r9 == 0) goto L6a
        L68:
            r2 = 0
            goto L9e
        L6a:
            r6.append(r10)
            if (r8 == r7) goto L74
            char r9 = java.io.File.separatorChar
            r6.append(r9)
        L74:
            if (r8 == r7) goto L79
            int r8 = r8 + (-1)
            goto L56
        L79:
            if (r7 >= r5) goto L9a
            if (r7 >= r4) goto L82
            char r3 = java.io.File.separatorChar
            r6.append(r3)
        L82:
            java.util.List r8 = kz5.n0.R(r2, r7)
            java.lang.String r10 = java.io.File.separator
            java.lang.String r2 = "separator"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r2)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 124(0x7c, float:1.74E-43)
            r17 = 0
            r9 = r6
            kz5.n0.f0(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L9a:
            java.lang.String r2 = r6.toString()
        L9e:
            if (r2 == 0) goto La1
            return r2
        La1:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "this and base files have different roots: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " and "
            r3.append(r0)
            r3.append(r1)
            r0 = 46
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vz5.q.g(java.io.File, java.io.File):java.lang.String");
    }
}
