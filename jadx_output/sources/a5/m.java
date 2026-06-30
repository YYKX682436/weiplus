package a5;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final a5.m f1410b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f1411a;

    static {
        a5.a0.e("Data");
        a5.m mVar = new a5.m(new java.util.HashMap());
        d(mVar);
        f1410b = mVar;
    }

    public m(a5.m mVar) {
        this.f1411a = new java.util.HashMap(mVar.f1411a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x002c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static a5.m a(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L4c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L40
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L40
            int r5 = r2.readInt()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L32
        L19:
            if (r5 <= 0) goto L29
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L32
            java.lang.Object r4 = r2.readObject()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L32
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L32
            int r5 = r5 + (-1)
            goto L19
        L29:
            r2.close()     // Catch: java.io.IOException -> L2c
        L2c:
            r1.close()     // Catch: java.io.IOException -> L46
            goto L46
        L30:
            r5 = move-exception
            goto L37
        L32:
            r5 = r2
            goto L40
        L34:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L37:
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r1.close()     // Catch: java.io.IOException -> L3f
        L3f:
            throw r5
        L40:
            if (r5 == 0) goto L2c
            r5.close()     // Catch: java.io.IOException -> L2c
            goto L2c
        L46:
            a5.m r5 = new a5.m
            r5.<init>(r0)
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.m.a(byte[]):a5.m");
    }

    public static byte[] d(a5.m mVar) {
        java.io.ObjectOutputStream objectOutputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            } catch (java.io.IOException unused) {
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            objectOutputStream.writeInt(((java.util.HashMap) mVar.f1411a).size());
            for (java.util.Map.Entry entry : ((java.util.HashMap) mVar.f1411a).entrySet()) {
                objectOutputStream.writeUTF((java.lang.String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (java.io.IOException unused2) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException unused3) {
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (java.io.IOException unused4) {
            objectOutputStream2 = objectOutputStream;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (java.io.IOException unused5) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (java.io.IOException unused6) {
            }
            return byteArray;
        } catch (java.lang.Throwable th7) {
            th = th7;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (java.io.IOException unused7) {
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (java.io.IOException unused8) {
                throw th;
            }
        }
    }

    public int b(java.lang.String str, int i17) {
        java.lang.Object obj = this.f1411a.get(str);
        return obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : i17;
    }

    public java.lang.String c(java.lang.String str) {
        java.lang.Object obj = this.f1411a.get(str);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.m.class != obj.getClass()) {
            return false;
        }
        a5.m mVar = (a5.m) obj;
        java.util.Map map = this.f1411a;
        java.util.Set<java.lang.String> keySet = map.keySet();
        if (!keySet.equals(mVar.f1411a.keySet())) {
            return false;
        }
        for (java.lang.String str : keySet) {
            java.lang.Object obj2 = map.get(str);
            java.lang.Object obj3 = mVar.f1411a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof java.lang.Object[]) && (obj3 instanceof java.lang.Object[])) ? java.util.Arrays.deepEquals((java.lang.Object[]) obj2, (java.lang.Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f1411a.hashCode() * 31;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Data {");
        java.util.Map map = this.f1411a;
        if (!map.isEmpty()) {
            for (java.lang.String str : map.keySet()) {
                sb6.append(str);
                sb6.append(" : ");
                java.lang.Object obj = map.get(str);
                if (obj instanceof java.lang.Object[]) {
                    sb6.append(java.util.Arrays.toString((java.lang.Object[]) obj));
                } else {
                    sb6.append(obj);
                }
                sb6.append(", ");
            }
        }
        sb6.append("}");
        return sb6.toString();
    }

    public m(java.util.Map map) {
        this.f1411a = new java.util.HashMap(map);
    }
}
