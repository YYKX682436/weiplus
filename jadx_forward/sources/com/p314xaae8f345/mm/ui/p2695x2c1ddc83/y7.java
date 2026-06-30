package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class y7 extends android.database.AbstractCursor {

    /* renamed from: f, reason: collision with root package name */
    public android.database.Cursor f289799f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7[] f289800g;

    /* renamed from: h, reason: collision with root package name */
    public final int f289801h;

    /* renamed from: d, reason: collision with root package name */
    public final android.database.DataSetObserver f289797d = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r7(this);

    /* renamed from: e, reason: collision with root package name */
    public int f289798e = -1;

    /* renamed from: i, reason: collision with root package name */
    public final int f289802i = 100;

    /* renamed from: m, reason: collision with root package name */
    public int f289803m = -1;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f289804n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u7 f289805o = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u7();

    public y7(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x7 x7Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7... t7VarArr) {
        this.f289801h = 1;
        this.f289801h = x7Var.f289770d;
        if (t7VarArr.length < 2) {
            this.f289800g = t7VarArr;
        } else {
            this.f289800g = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7[]{t7VarArr[0], t7VarArr[1]};
        }
        this.f289799f = this.f289800g[0].d();
        for (int i17 = 0; i17 < this.f289800g.length; i17++) {
            if (i(i17) != null) {
                i(i17).registerDataSetObserver(this.f289797d);
            }
        }
    }

    public static /* synthetic */ int a(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var, int i17) {
        ((android.database.AbstractCursor) y7Var).mPos = i17;
        return i17;
    }

    public static /* synthetic */ int b(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y7 y7Var, int i17) {
        ((android.database.AbstractCursor) y7Var).mPos = i17;
        return i17;
    }

    public void c() {
        if (this.f289803m != -1) {
            this.f289805o.f289635c++;
        }
        this.f289803m = -1;
        this.f289804n = new java.util.LinkedList();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int length = this.f289800g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).close();
            }
        }
        super.close();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void deactivate() {
        int length = this.f289800g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).deactivate();
            }
        }
        super.deactivate();
    }

    public final android.database.Cursor f() {
        android.database.Cursor cursor = this.f289799f;
        if (cursor == null || cursor.isClosed()) {
            onMove(-1, this.f289798e);
        }
        return this.f289799f;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        return f().getBlob(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f289799f != null ? f().getColumnNames() : new java.lang.String[0];
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        int length = this.f289800g.length;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            if (i(i18) != null) {
                i17 += i(i18).getCount();
            }
        }
        return i17;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public double getDouble(int i17) {
        return f().getDouble(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public float getFloat(int i17) {
        return f().getFloat(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getInt(int i17) {
        return f().getInt(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public long getLong(int i17) {
        return f().getLong(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public short getShort(int i17) {
        return f().getShort(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        return f().getString(i17);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getType(int i17) {
        return f().getType(i17);
    }

    public final android.database.Cursor i(int i17) {
        return this.f289800g[i17].d();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean isNull(int i17) {
        return f().isNull(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i17, int i18) {
        int i19;
        int i27;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v7 v7Var;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u7 u7Var = this.f289805o;
        u7Var.f289633a++;
        this.f289798e = i18;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7[] t7VarArr = this.f289800g;
        if (t7VarArr.length < 2) {
            try {
                u7Var.f289634b++;
                android.database.Cursor d17 = t7VarArr[0].d();
                this.f289799f = d17;
                return d17.moveToPosition(i18);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MergeSortCursorWrapper", "onMoveOneCursorOnly fail:" + th6.getMessage());
                return false;
            }
        }
        int i28 = this.f289803m;
        int size = this.f289804n.size() + i28;
        if (i28 > i18 || i18 >= size) {
            u7Var.f289636d++;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7 t7Var = t7VarArr[0];
            int i29 = 1;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7 t7Var2 = t7VarArr[1];
            int i37 = this.f289802i;
            if (i18 > 0) {
                i37 *= ((i37 - 1) + i18) / i37;
            }
            int i38 = i37 * 2;
            int min = java.lang.Math.min(i38, getCount());
            if (min < i38) {
                i37 = min;
            }
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7 b17 = t7Var.b(0);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7 b18 = t7Var2.b(0);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int i39 = 0;
            int i47 = 0;
            int i48 = 0;
            while (i48 < i37) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7 w7Var = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7.f289753f;
                if (w7Var == b17 && w7Var == b18) {
                    break;
                }
                if (w7Var == b17) {
                    linkedList.add(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v7(i29, i39, b18));
                    i39++;
                    b18 = t7Var2.b(i39);
                } else if (w7Var == b18) {
                    linkedList.add(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v7(0, i47, b17));
                    i47++;
                    b17 = t7Var.b(i47);
                } else {
                    u7Var.f289637e++;
                    if (this.f289801h * b17.compareTo(b18) <= 0) {
                        linkedList.add(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v7(0, i47, b17));
                        i47++;
                        b17 = t7Var.b(i47);
                        i27 = 1;
                    } else {
                        i27 = 1;
                        linkedList.add(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v7(1, i39, b18));
                        i39++;
                        b18 = t7Var2.b(i39);
                    }
                    i48++;
                    i29 = i27;
                }
                i27 = 1;
                i48++;
                i29 = i27;
            }
            if (linkedList.size() != i37) {
                i19 = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MergeSortCursorWrapper", "fillWindow K=%d, N=%d (%d), iterator=[%d, %d]", 0, java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(i39));
            } else {
                i19 = 0;
            }
            this.f289803m = i19;
            this.f289804n = linkedList;
        } else {
            u7Var.f289634b++;
            i19 = 0;
        }
        try {
            v7Var = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v7) this.f289804n.get(i18 - this.f289803m);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MergeSortCursorWrapper", "locateElement fail:" + e17.getMessage());
            v7Var = null;
        }
        if (v7Var != null) {
            try {
                android.database.Cursor d18 = t7VarArr[v7Var.f289724a].d();
                this.f289799f = d18;
                return d18.moveToPosition(v7Var.f289725b);
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MergeSortCursorWrapper", "onMoveTwoCursorMixed fail:" + th7.getMessage());
            }
        }
        return i19;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        int length = this.f289800g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).registerContentObserver(contentObserver);
            }
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        int length = this.f289800g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean requery() {
        int length = this.f289800g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null && !i(i17).requery()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        int length = this.f289800g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).unregisterContentObserver(contentObserver);
            }
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        int length = this.f289800g.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i(i17) != null) {
                i(i17).unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
}
