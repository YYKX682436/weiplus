package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.DataHolder */
/* loaded from: classes13.dex */
public final class C1888xafe09e16 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements java.io.Closeable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16> f5920x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.zaf();
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.Builder zaf = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.zab(new java.lang.String[0], null);
    final int zaa;
    android.os.Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final java.lang.String[] zag;
    private final android.database.CursorWindow[] zah;
    private final int zai;
    private final android.os.Bundle zaj;
    private boolean zak;

    /* renamed from: com.google.android.gms.common.data.DataHolder$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {
        private final java.lang.String[] zaa;
        private final java.util.ArrayList zab = new java.util.ArrayList();
        private final java.util.HashMap zac = new java.util.HashMap();

        public /* synthetic */ Builder(java.lang.String[] strArr, java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.zac zacVar) {
            this.zaa = (java.lang.String[]) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 m18036x59bc66e(int i17) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16(this, i17);
        }

        /* renamed from: withRow */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.Builder mo18038x50c59334(android.content.ContentValues contentValues) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(contentValues);
            java.util.HashMap hashMap = new java.util.HashMap(contentValues.size());
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.Builder zaa(java.util.HashMap hashMap) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18081x7b41bcd2(hashMap);
            this.zab.add(hashMap);
            return this;
        }

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 m18037x59bc66e(int i17, android.os.Bundle bundle) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16(this, i17, bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: builder */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.Builder m18021xdc3ef9b(java.lang.String[] strArr) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.Builder(strArr, null, 0 == true ? 1 : 0);
    }

    /* renamed from: empty */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 m18022x5c2854d(int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16(zaf, i17, (android.os.Bundle) null);
    }

    private final void zae(java.lang.String str, int i17) {
        android.os.Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("No such column: ".concat(java.lang.String.valueOf(str)));
        }
        if (m18035xd742d336()) {
            throw new java.lang.IllegalArgumentException("Buffer is closed.");
        }
        if (i17 < 0 || i17 >= this.zad) {
            throw new android.database.CursorIndexOutOfBoundsException(i17, this.zad);
        }
    }

    private static android.database.CursorWindow[] zaf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.Builder builder, int i17) {
        if (builder.zaa.length == 0) {
            return new android.database.CursorWindow[0];
        }
        java.util.ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        android.database.CursorWindow cursorWindow = new android.database.CursorWindow(false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i18 = 0;
        boolean z17 = false;
        while (i18 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    cursorWindow = new android.database.CursorWindow(false);
                    cursorWindow.setStartPosition(i18);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        arrayList2.remove(cursorWindow);
                        return (android.database.CursorWindow[]) arrayList2.toArray(new android.database.CursorWindow[arrayList2.size()]);
                    }
                }
                java.util.Map map = (java.util.Map) arrayList.get(i18);
                int i19 = 0;
                boolean z18 = true;
                while (true) {
                    if (i19 < builder.zaa.length) {
                        if (!z18) {
                            break;
                        }
                        java.lang.String str = builder.zaa[i19];
                        java.lang.Object obj = map.get(str);
                        if (obj == null) {
                            z18 = cursorWindow.putNull(i18, i19);
                        } else if (obj instanceof java.lang.String) {
                            z18 = cursorWindow.putString((java.lang.String) obj, i18, i19);
                        } else if (obj instanceof java.lang.Long) {
                            z18 = cursorWindow.putLong(((java.lang.Long) obj).longValue(), i18, i19);
                        } else if (obj instanceof java.lang.Integer) {
                            z18 = cursorWindow.putLong(((java.lang.Integer) obj).intValue(), i18, i19);
                        } else if (obj instanceof java.lang.Boolean) {
                            z18 = cursorWindow.putLong(true != ((java.lang.Boolean) obj).booleanValue() ? 0L : 1L, i18, i19);
                        } else if (obj instanceof byte[]) {
                            z18 = cursorWindow.putBlob((byte[]) obj, i18, i19);
                        } else if (obj instanceof java.lang.Double) {
                            z18 = cursorWindow.putDouble(((java.lang.Double) obj).doubleValue(), i18, i19);
                        } else {
                            if (!(obj instanceof java.lang.Float)) {
                                throw new java.lang.IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                            }
                            z18 = cursorWindow.putDouble(((java.lang.Float) obj).floatValue(), i18, i19);
                        }
                        i19++;
                    } else if (z18) {
                        z17 = false;
                    }
                }
                if (z17) {
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
                cursorWindow.freeLastRow();
                cursorWindow = new android.database.CursorWindow(false);
                cursorWindow.setStartPosition(i18);
                cursorWindow.setNumColumns(builder.zaa.length);
                arrayList2.add(cursorWindow);
                i18--;
                z17 = true;
                i18++;
            } catch (java.lang.RuntimeException e17) {
                int size2 = arrayList2.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    ((android.database.CursorWindow) arrayList2.get(i27)).close();
                }
                throw e17;
            }
        }
        return (android.database.CursorWindow[]) arrayList2.toArray(new android.database.CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.zae) {
                this.zae = true;
                int i17 = 0;
                while (true) {
                    android.database.CursorWindow[] cursorWindowArr = this.zah;
                    if (i17 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i17].close();
                    i17++;
                }
            }
        }
    }

    /* renamed from: finalize */
    public final void m18023xd764dc1e() {
        try {
            if (this.zak && this.zah.length > 0 && !m18035xd742d336()) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: getBoolean */
    public boolean m18024x41a8a7f2(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return java.lang.Long.valueOf(this.zah[i18].getLong(i17, this.zab.getInt(str))).longValue() == 1;
    }

    /* renamed from: getByteArray */
    public byte[] m18025x8383f77b(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].getBlob(i17, this.zab.getInt(str));
    }

    /* renamed from: getCount */
    public int m18026x7444f759() {
        return this.zad;
    }

    /* renamed from: getInteger */
    public int m18027xb282bd08(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].getInt(i17, this.zab.getInt(str));
    }

    /* renamed from: getLong */
    public long m18028xfb822ef2(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].getLong(i17, this.zab.getInt(str));
    }

    /* renamed from: getMetadata */
    public android.os.Bundle m18029x6107b8a5() {
        return this.zaj;
    }

    /* renamed from: getStatusCode */
    public int m18030xfd0160f5() {
        return this.zai;
    }

    /* renamed from: getString */
    public java.lang.String m18031x2fec8307(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].getString(i17, this.zab.getInt(str));
    }

    /* renamed from: getWindowIndex */
    public int m18032x4abe998c(int i17) {
        int length;
        int i18 = 0;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18220xe071d469(i17 >= 0 && i17 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i18 >= length) {
                break;
            }
            if (i17 < iArr[i18]) {
                i18--;
                break;
            }
            i18++;
        }
        return i18 == length ? i18 - 1 : i18;
    }

    /* renamed from: hasColumn */
    public boolean m18033xd42f7690(java.lang.String str) {
        return this.zab.containsKey(str);
    }

    /* renamed from: hasNull */
    public boolean m18034x2987ef41(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].isNull(i17, this.zab.getInt(str));
    }

    /* renamed from: isClosed */
    public boolean m18035xd742d336() {
        boolean z17;
        synchronized (this) {
            z17 = this.zae;
        }
        return z17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String[] strArr = this.zag;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18356xa6ac8369(parcel, 1, strArr, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18359xa472054e(parcel, 2, this.zah, i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 3, m18030xfd0160f5());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18315x3736d141(parcel, 4, m18029x6107b8a5(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1000, this.zaa);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
        if ((i17 & 1) != 0) {
            close();
        }
    }

    public final double zaa(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].getDouble(i17, this.zab.getInt(str));
    }

    public final float zab(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].getFloat(i17, this.zab.getInt(str));
    }

    public final void zac(java.lang.String str, int i17, int i18, android.database.CharArrayBuffer charArrayBuffer) {
        zae(str, i17);
        this.zah[i18].copyStringToBuffer(i17, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new android.os.Bundle();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            java.lang.String[] strArr = this.zag;
            if (i18 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i18], i18);
            i18++;
        }
        this.zac = new int[this.zah.length];
        int i19 = 0;
        while (true) {
            android.database.CursorWindow[] cursorWindowArr = this.zah;
            if (i17 >= cursorWindowArr.length) {
                this.zad = i19;
                return;
            }
            this.zac[i17] = i19;
            i19 += this.zah[i17].getNumRows() - (i19 - cursorWindowArr[i17].getStartPosition());
            i17++;
        }
    }

    public C1888xafe09e16(int i17, java.lang.String[] strArr, android.database.CursorWindow[] cursorWindowArr, int i18, android.os.Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i17;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i18;
        this.zaj = bundle;
    }

    public C1888xafe09e16(java.lang.String[] strArr, android.database.CursorWindow[] cursorWindowArr, int i17, android.os.Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (java.lang.String[]) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(strArr);
        this.zah = (android.database.CursorWindow[]) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(cursorWindowArr);
        this.zai = i17;
        this.zaj = bundle;
        zad();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1888xafe09e16(android.database.Cursor r8, int r9, android.os.Bundle r10) {
        /*
            r7 = this;
            com.google.android.gms.common.sqlite.CursorWrapper r0 = new com.google.android.gms.common.sqlite.CursorWrapper
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L76
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L2e
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L76
            if (r6 != 0) goto L2e
            r3.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.m18491x295832f2(r4)     // Catch: java.lang.Throwable -> L76
            r1.add(r3)     // Catch: java.lang.Throwable -> L76
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L76
            goto L2f
        L2e:
            r3 = r5
        L2f:
            if (r3 >= r2) goto L63
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L63
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L44
            r6.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.m18491x295832f2(r4)     // Catch: java.lang.Throwable -> L76
            goto L4f
        L44:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L76
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L76
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L76
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L76
        L4f:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L56
            goto L63
        L56:
            r1.add(r6)     // Catch: java.lang.Throwable -> L76
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L76
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L76
            int r3 = r3 + r6
            goto L2f
        L63:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L76:
            r8 = move-exception
            r0.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    private C1888xafe09e16(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16.Builder builder, int i17, android.os.Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i17, (android.os.Bundle) null);
    }
}
