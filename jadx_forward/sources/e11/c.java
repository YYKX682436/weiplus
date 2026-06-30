package e11;

/* loaded from: classes12.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(java.io.InputStream r6) {
        /*
            java.lang.String r0 = "Read close exception:"
            java.lang.String r1 = "MicroMsg.ObjectUtil"
            java.lang.String r2 = "Read exception:"
            r3 = 0
            if (r6 == 0) goto L6f
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2e
            r4.close()     // Catch: java.lang.Exception -> L16
            goto L6f
        L16:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
        L1c:
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r6)
            goto L6f
        L2b:
            r6 = move-exception
            r3 = r4
            goto L54
        L2e:
            r6 = move-exception
            goto L34
        L30:
            r6 = move-exception
            goto L54
        L32:
            r6 = move-exception
            r4 = r3
        L34:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L2b
            r5.append(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L2b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r6)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L6f
            r4.close()     // Catch: java.lang.Exception -> L4d
            goto L6f
        L4d:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            goto L1c
        L54:
            if (r3 == 0) goto L6e
            r3.close()     // Catch: java.lang.Exception -> L5a
            goto L6e
        L5a:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r0)
        L6e:
            throw r6
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.c.a(java.io.InputStream):java.lang.Object");
    }

    public static void b(java.io.Serializable serializable, java.io.OutputStream outputStream) {
        java.lang.StringBuilder sb6;
        java.io.ObjectOutputStream objectOutputStream;
        if (serializable == null || outputStream == null) {
            return;
        }
        java.io.ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new java.io.ObjectOutputStream(outputStream);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            objectOutputStream.writeObject(serializable);
            objectOutputStream.flush();
            try {
                objectOutputStream.close();
            } catch (java.lang.Exception e18) {
                e = e18;
                sb6 = new java.lang.StringBuilder("Write close exception:");
                sb6.append(e.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ObjectUtil", sb6.toString());
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            objectOutputStream2 = objectOutputStream;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ObjectUtil", "Write exception:" + e.getMessage());
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (java.lang.Exception e27) {
                    e = e27;
                    sb6 = new java.lang.StringBuilder("Write close exception:");
                    sb6.append(e.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ObjectUtil", sb6.toString());
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (java.lang.Exception e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ObjectUtil", "Write close exception:" + e28.getMessage());
                }
            }
            throw th;
        }
    }
}
