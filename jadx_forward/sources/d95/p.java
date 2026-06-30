package d95;

/* loaded from: classes12.dex */
public class p extends com.p314xaae8f345.p3121x37984a.C26878x4994ec3d {

    /* renamed from: d, reason: collision with root package name */
    public final int f309232d;

    /* renamed from: e, reason: collision with root package name */
    public final long f309233e;

    public p(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, java.lang.String str) {
        super(interfaceC26872x78faff76);
        if (interfaceC26872x78faff76 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb) {
            this.f309232d = 2;
        } else if (interfaceC26872x78faff76 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26945x5aacfea2) {
            this.f309232d = 1;
        } else {
            this.f309232d = -1;
        }
        this.f309233e = java.lang.System.nanoTime();
    }

    @Override // com.p314xaae8f345.p3121x37984a.C26878x4994ec3d, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f57760xff023a23.close();
        long nanoTime = (java.lang.System.nanoTime() - this.f309233e) / 1000;
        int i17 = this.f309232d;
        int i18 = i17 == 1 ? 0 : i17 == 2 ? 3 : -1;
        if (i18 >= 0) {
            d95.f.f309206s.b(i18 + 1, i18 + 2, nanoTime);
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.C26878x4994ec3d, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public byte[] getBlob(int i17) {
        try {
            return super.getBlob(i17);
        } catch (com.p314xaae8f345.p3121x37984a.C26873x6901bdb1 | java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.C26878x4994ec3d, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        if (this.f309232d == 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Slow operation: ");
            java.lang.Throwable th6 = new java.lang.Throwable();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDataBase", sb6.toString());
        }
        try {
            return this.f57760xff023a23.getCount();
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.C26878x4994ec3d, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public double getDouble(int i17) {
        try {
            return super.getDouble(i17);
        } catch (com.p314xaae8f345.p3121x37984a.C26873x6901bdb1 | java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return 0.0d;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.C26878x4994ec3d, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public float getFloat(int i17) {
        try {
            return super.getFloat(i17);
        } catch (com.p314xaae8f345.p3121x37984a.C26873x6901bdb1 | java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return 0.0f;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.C26878x4994ec3d, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getInt(int i17) {
        try {
            return super.getInt(i17);
        } catch (com.p314xaae8f345.p3121x37984a.C26873x6901bdb1 | java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.C26878x4994ec3d, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public long getLong(int i17) {
        try {
            return super.getLong(i17);
        } catch (com.p314xaae8f345.p3121x37984a.C26873x6901bdb1 | java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return 0L;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.C26878x4994ec3d, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public short getShort(int i17) {
        try {
            return super.getShort(i17);
        } catch (com.p314xaae8f345.p3121x37984a.C26873x6901bdb1 | java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return (short) 0;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.C26878x4994ec3d, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String getString(int i17) {
        try {
            return super.getString(i17);
        } catch (com.p314xaae8f345.p3121x37984a.C26873x6901bdb1 | java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMDataBase", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
