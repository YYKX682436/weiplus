package d95;

/* loaded from: classes12.dex */
public final class e extends android.database.AbstractCursor {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f309189d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object[] f309190e;

    /* renamed from: f, reason: collision with root package name */
    public int f309191f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final int f309192g;

    public e(java.lang.String[] strArr) {
        this.f309189d = strArr;
        int length = strArr.length;
        this.f309192g = length;
        this.f309190e = new java.lang.Object[length * 16];
    }

    public void a(java.lang.Object[] objArr) {
        int length = objArr.length;
        int i17 = this.f309192g;
        if (length != i17) {
            throw new java.lang.IllegalArgumentException("columnNames.length = " + i17 + ", columnValues.length = " + objArr.length);
        }
        int i18 = this.f309191f;
        this.f309191f = i18 + 1;
        int i19 = i18 * i17;
        int i27 = i19 + i17;
        java.lang.Object[] objArr2 = this.f309190e;
        if (i27 > objArr2.length) {
            int length2 = objArr2.length * 2;
            if (length2 >= i27) {
                i27 = length2;
            }
            java.lang.Object[] objArr3 = new java.lang.Object[i27];
            this.f309190e = objArr3;
            java.lang.System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        }
        java.lang.System.arraycopy(objArr, 0, this.f309190e, i19, i17);
    }

    public int b(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof java.lang.Float) || (obj instanceof java.lang.Double)) {
            return 2;
        }
        return ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Byte)) ? 1 : 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r2 >= r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        r3 = b(get(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r3 == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r3 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r3 == 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r3 == 4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r3 = getString(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r3 = r7.putString(r3, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r3 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        r7.freeLastRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (moveToNext() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        r3 = r7.putNull(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        r3 = getBlob(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        r3 = r7.putBlob(r3, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        r3 = r7.putNull(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        r3 = r7.putDouble(getDouble(r2), r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r3 = r7.putLong(getLong(r2), r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        r3 = r7.putNull(r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        moveToPosition(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (moveToPosition(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r7.allocRow() != false) goto L12;
     */
    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fillWindow(int r6, android.database.CursorWindow r7) {
        /*
            r5 = this;
            if (r6 < 0) goto L92
            int r0 = r5.f309191f
            if (r6 < r0) goto L8
            goto L92
        L8:
            r7.acquireReference()
            int r0 = r5.getPosition()     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            int r1 = r5.getColumnCount()     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            r7.clear()     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            r7.setStartPosition(r6)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            r7.setNumColumns(r1)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            boolean r2 = r5.moveToPosition(r6)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            if (r2 == 0) goto L86
        L22:
            boolean r2 = r7.allocRow()     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            if (r2 != 0) goto L29
            goto L86
        L29:
            r2 = 0
        L2a:
            if (r2 >= r1) goto L7e
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            int r3 = r5.b(r3)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            if (r3 == 0) goto L71
            r4 = 1
            if (r3 == r4) goto L68
            r4 = 2
            if (r3 == r4) goto L5f
            r4 = 4
            if (r3 == r4) goto L4f
            java.lang.String r3 = r5.getString(r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            if (r3 == 0) goto L4a
            boolean r3 = r7.putString(r3, r6, r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            goto L75
        L4a:
            boolean r3 = r7.putNull(r6, r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            goto L75
        L4f:
            byte[] r3 = r5.getBlob(r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            if (r3 == 0) goto L5a
            boolean r3 = r7.putBlob(r3, r6, r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            goto L75
        L5a:
            boolean r3 = r7.putNull(r6, r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            goto L75
        L5f:
            double r3 = r5.getDouble(r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            boolean r3 = r7.putDouble(r3, r6, r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            goto L75
        L68:
            long r3 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            boolean r3 = r7.putLong(r3, r6, r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            goto L75
        L71:
            boolean r3 = r7.putNull(r6, r2)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
        L75:
            if (r3 != 0) goto L7b
            r7.freeLastRow()     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            goto L7e
        L7b:
            int r2 = r2 + 1
            goto L2a
        L7e:
            int r6 = r6 + 1
            boolean r2 = r5.moveToNext()     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            if (r2 != 0) goto L22
        L86:
            r5.moveToPosition(r0)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalStateException -> L8f
            goto L8f
        L8a:
            r6 = move-exception
            r7.releaseReference()
            throw r6
        L8f:
            r7.releaseReference()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d95.e.fillWindow(int, android.database.CursorWindow):void");
    }

    public final java.lang.Object get(int i17) {
        int i18 = this.f309192g;
        if (i17 < 0 || i17 >= i18) {
            throw new android.database.CursorIndexOutOfBoundsException("Requested column: " + i17 + ", # of columns: " + i18);
        }
        int i19 = ((android.database.AbstractCursor) this).mPos;
        if (i19 < 0) {
            throw new android.database.CursorIndexOutOfBoundsException("Before first row.");
        }
        if (i19 < this.f309191f) {
            return this.f309190e[(i19 * i18) + i17];
        }
        throw new android.database.CursorIndexOutOfBoundsException("After last row.");
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        return (byte[]) get(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f309189d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        return this.f309191f;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public double getDouble(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0.0d;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).doubleValue() : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(obj.toString(), 0.0d);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public float getFloat(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0.0f;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).floatValue() : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(obj.toString(), 0.0f);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getInt(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).intValue() : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(obj.toString(), 0);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public long getLong(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return 0L;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).longValue() : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(obj.toString(), 0L);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public short getShort(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return (short) 0;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).shortValue() : java.lang.Short.parseShort(obj.toString());
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        java.lang.Object obj = get(i17);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getType(int i17) {
        return b(get(i17));
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean isNull(int i17) {
        return get(i17) == null;
    }
}
