package com.p314xaae8f345.p3121x37984a.p3124xaf3f3382;

/* renamed from: com.tencent.wcdb.compat.ValueCursor */
/* loaded from: classes12.dex */
class C26916xf340a007 extends android.database.AbstractCursor {

    /* renamed from: mColumnNames */
    private final java.lang.String[] f57998x7753cae5;

    /* renamed from: mRows */
    private final java.util.List<com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151[]> f57999x626f7e6;

    public C26916xf340a007(java.util.List<com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151[]> list, java.lang.String[] strArr) {
        this.f57999x626f7e6 = list;
        this.f57998x7753cae5 = strArr;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public byte[] getBlob(int i17) {
        return this.f57999x626f7e6.get(((android.database.AbstractCursor) this).mPos)[i17].m106355xfb7d1bf3();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.f57998x7753cae5;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        return this.f57999x626f7e6.size();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public double getDouble(int i17) {
        return this.f57999x626f7e6.get(((android.database.AbstractCursor) this).mPos)[i17].m106358x160e9ec7();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public float getFloat(int i17) {
        return (float) this.f57999x626f7e6.get(((android.database.AbstractCursor) this).mPos)[i17].m106358x160e9ec7();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getInt(int i17) {
        return this.f57999x626f7e6.get(((android.database.AbstractCursor) this).mPos)[i17].m106360xb58848b9();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public long getLong(int i17) {
        return this.f57999x626f7e6.get(((android.database.AbstractCursor) this).mPos)[i17].m106361xfb822ef2();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public short getShort(int i17) {
        return (short) this.f57999x626f7e6.get(((android.database.AbstractCursor) this).mPos)[i17].m106361xfb822ef2();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public java.lang.String getString(int i17) {
        return this.f57999x626f7e6.get(((android.database.AbstractCursor) this).mPos)[i17].m106363xfb85ada3();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getType(int i17) {
        return this.f57999x626f7e6.get(((android.database.AbstractCursor) this).mPos)[i17].m106364xfb85f7b0().ordinal();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean isNull(int i17) {
        return this.f57999x626f7e6.get(((android.database.AbstractCursor) this).mPos)[i17].m106364xfb85f7b0() == com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Null;
    }
}
