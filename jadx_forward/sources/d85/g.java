package d85;

/* loaded from: classes12.dex */
public final class g implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f308715a;

    public g(java.lang.Object originObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originObject, "originObject");
        this.f308715a = originObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0038  */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r9, java.lang.reflect.Method r10, java.lang.Object[] r11) {
        /*
            r8 = this;
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "[contentProvider], method:"
            r9.<init>(r0)
            r0 = 0
            if (r10 == 0) goto Lf
            java.lang.String r1 = r10.getName()
            goto L10
        Lf:
            r1 = r0
        L10:
            r9.append(r1)
            java.lang.String r1 = ", args:"
            r9.append(r1)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "Kenneth-methodCall"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            r9 = 1
            r1 = 0
            if (r11 == 0) goto L33
            int r2 = r11.length
            if (r2 != 0) goto L2d
            r2 = r9
            goto L2e
        L2d:
            r2 = r1
        L2e:
            r2 = r2 ^ r9
            if (r2 != r9) goto L33
            r2 = r9
            goto L34
        L33:
            r2 = r1
        L34:
            if (r2 == 0) goto L38
            r2 = r11
            goto L39
        L38:
            r2 = r0
        L39:
            if (r2 == 0) goto L56
            int r3 = r2.length
            r4 = r1
            r5 = r4
        L3e:
            if (r4 >= r3) goto L57
            r6 = r2[r4]
            boolean r7 = r6 instanceof android.net.Uri
            if (r7 == 0) goto L53
            java.lang.String r7 = "external"
            android.net.Uri r7 = android.provider.MediaStore.Files.getContentUri(r7)
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r7)
            if (r6 == 0) goto L53
            r5 = r9
        L53:
            int r4 = r4 + 1
            goto L3e
        L56:
            r5 = r1
        L57:
            java.lang.String r9 = "invoke method catch err:"
            java.lang.String r2 = "ContentProviderHooker"
            java.lang.Object r3 = r8.f308715a
            if (r5 == 0) goto L99
            k85.t r4 = k85.t.f386972a
            r5 = 2
            java.lang.String r6 = "queryMedia"
            boolean r4 = k85.t.b(r4, r6, r0, r5, r0)
            if (r4 == 0) goto L6c
            return r0
        L6c:
            if (r11 != 0) goto L79
            if (r10 == 0) goto L98
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r10.invoke(r3, r11)     // Catch: java.lang.Throwable -> L77
            goto L98
        L77:
            r10 = move-exception
            goto L85
        L79:
            if (r10 == 0) goto L98
            int r1 = r11.length     // Catch: java.lang.Throwable -> L77
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r1)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r10.invoke(r3, r11)     // Catch: java.lang.Throwable -> L77
            goto L98
        L85:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r9)
            java.lang.String r9 = r10.getMessage()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
        L98:
            return r0
        L99:
            if (r11 != 0) goto La6
            if (r10 == 0) goto Lc5
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La4
            java.lang.Object r0 = r10.invoke(r3, r11)     // Catch: java.lang.Throwable -> La4
            goto Lc5
        La4:
            r10 = move-exception
            goto Lb2
        La6:
            if (r10 == 0) goto Lc5
            int r1 = r11.length     // Catch: java.lang.Throwable -> La4
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r1)     // Catch: java.lang.Throwable -> La4
            java.lang.Object r0 = r10.invoke(r3, r11)     // Catch: java.lang.Throwable -> La4
            goto Lc5
        Lb2:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r9)
            java.lang.String r9 = r10.getMessage()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d85.g.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
