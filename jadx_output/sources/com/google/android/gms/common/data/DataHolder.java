package com.google.android.gms.common.data;

/* loaded from: classes13.dex */
public final class DataHolder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.io.Closeable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.DataHolder> CREATOR = new com.google.android.gms.common.data.zaf();
    private static final com.google.android.gms.common.data.DataHolder.Builder zaf = new com.google.android.gms.common.data.zab(new java.lang.String[0], null);
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

    /* loaded from: classes13.dex */
    public static class Builder {
        private final java.lang.String[] zaa;
        private final java.util.ArrayList zab = new java.util.ArrayList();
        private final java.util.HashMap zac = new java.util.HashMap();

        public /* synthetic */ Builder(java.lang.String[] strArr, java.lang.String str, com.google.android.gms.common.data.zac zacVar) {
            this.zaa = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public com.google.android.gms.common.data.DataHolder build(int i17) {
            return new com.google.android.gms.common.data.DataHolder(this, i17);
        }

        public com.google.android.gms.common.data.DataHolder.Builder withRow(android.content.ContentValues contentValues) {
            com.google.android.gms.common.internal.Asserts.checkNotNull(contentValues);
            java.util.HashMap hashMap = new java.util.HashMap(contentValues.size());
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        public com.google.android.gms.common.data.DataHolder.Builder zaa(java.util.HashMap hashMap) {
            com.google.android.gms.common.internal.Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }

        public com.google.android.gms.common.data.DataHolder build(int i17, android.os.Bundle bundle) {
            return new com.google.android.gms.common.data.DataHolder(this, i17, bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.android.gms.common.data.DataHolder.Builder builder(java.lang.String[] strArr) {
        return new com.google.android.gms.common.data.DataHolder.Builder(strArr, null, 0 == true ? 1 : 0);
    }

    public static com.google.android.gms.common.data.DataHolder empty(int i17) {
        return new com.google.android.gms.common.data.DataHolder(zaf, i17, (android.os.Bundle) null);
    }

    private final void zae(java.lang.String str, int i17) {
        android.os.Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("No such column: ".concat(java.lang.String.valueOf(str)));
        }
        if (isClosed()) {
            throw new java.lang.IllegalArgumentException("Buffer is closed.");
        }
        if (i17 < 0 || i17 >= this.zad) {
            throw new android.database.CursorIndexOutOfBoundsException(i17, this.zad);
        }
    }

    private static android.database.CursorWindow[] zaf(com.google.android.gms.common.data.DataHolder.Builder builder, int i17) {
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
                    throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
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

    public final void finalize() {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public boolean getBoolean(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return java.lang.Long.valueOf(this.zah[i18].getLong(i17, this.zab.getInt(str))).longValue() == 1;
    }

    public byte[] getByteArray(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].getBlob(i17, this.zab.getInt(str));
    }

    public int getCount() {
        return this.zad;
    }

    public int getInteger(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].getInt(i17, this.zab.getInt(str));
    }

    public long getLong(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].getLong(i17, this.zab.getInt(str));
    }

    public android.os.Bundle getMetadata() {
        return this.zaj;
    }

    public int getStatusCode() {
        return this.zai;
    }

    public java.lang.String getString(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].getString(i17, this.zab.getInt(str));
    }

    public int getWindowIndex(int i17) {
        int length;
        int i18 = 0;
        com.google.android.gms.common.internal.Preconditions.checkState(i17 >= 0 && i17 < this.zad);
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

    public boolean hasColumn(java.lang.String str) {
        return this.zab.containsKey(str);
    }

    public boolean hasNull(java.lang.String str, int i17, int i18) {
        zae(str, i17);
        return this.zah[i18].isNull(i17, this.zab.getInt(str));
    }

    public boolean isClosed() {
        boolean z17;
        synchronized (this) {
            z17 = this.zae;
        }
        return z17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String[] strArr = this.zag;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
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

    public DataHolder(int i17, java.lang.String[] strArr, android.database.CursorWindow[] cursorWindowArr, int i18, android.os.Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i17;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i18;
        this.zaj = bundle;
    }

    public DataHolder(java.lang.String[] strArr, android.database.CursorWindow[] cursorWindowArr, int i17, android.os.Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        this.zah = (android.database.CursorWindow[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i17;
        this.zaj = bundle;
        zad();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DataHolder(android.database.Cursor r8, int r9, android.os.Bundle r10) {
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
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L76
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
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L76
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    private DataHolder(com.google.android.gms.common.data.DataHolder.Builder builder, int i17, android.os.Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i17, (android.os.Bundle) null);
    }
}
