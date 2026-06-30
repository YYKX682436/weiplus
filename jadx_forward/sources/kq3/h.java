package kq3;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 f392806a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f392807b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f392808c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f392809d;

    public h(java.lang.String str) {
        if (this.f392806a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Priority.PriorityDB", "before initDB, pre DB is not close, why?");
            this.f392806a.close();
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(str, "MicroMsgPriority.db").o();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107647xa5e841c4 = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107647xa5e841c4(o17, kk.k.g((gm0.j1.b().j() + c01.z1.r() + wo.w0.g(true)).getBytes()).substring(0, 7).getBytes(), (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory) null, (com.p314xaae8f345.p3121x37984a.InterfaceC26879x4f347d5d) null);
        this.f392806a = m107647xa5e841c4;
        d95.f fVar = new d95.f();
        fVar.f309212b = m107647xa5e841c4;
        ((java.util.concurrent.ConcurrentHashMap) d95.f.f309196i).put(fVar.k(), fVar);
        d95.f.d(fVar);
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = this.f392806a;
        long m107657x12386953 = c26948xabb259c7.m107657x12386953("initPriority", false, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.C16805x732e3f41.m67595xb90145c7(m107657x12386953);
        c26948xabb259c7.m107714x63db387c(m107657x12386953, null);
        this.f392806a.m107671xb158737d(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (type INTEGER PRIMARY KEY, version INTEGER);", "PriorityConfig"));
        this.f392807b = this.f392806a.m107663xac8b87c(java.lang.String.format("SELECT version FROM %s WHERE type=?;", "PriorityConfig"));
        this.f392808c = this.f392806a.m107663xac8b87c(java.lang.String.format("INSERT OR REPLACE INTO %s (type, version) VALUES (?, ?);", "PriorityConfig"));
        this.f392809d = this.f392806a.m107663xac8b87c(java.lang.String.format("DELETE FROM %s WHERE type=?", "PriorityConfig"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityDB", "initDB index params %d %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i0(com.p314xaae8f345.mm.vfs.w6.k(o17), 100.0d));
    }

    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 a(java.lang.String str) {
        return this.f392806a.m107663xac8b87c(str);
    }

    public void b(java.lang.String str) {
        this.f392806a.m107671xb158737d(java.lang.String.format("DROP TABLE %s", str));
    }

    public void c(java.lang.String str) {
        this.f392806a.m107671xb158737d(str);
    }

    public void d(java.lang.String str, java.lang.Object[] objArr) {
        this.f392806a.m107672xb158737d(str, objArr);
    }

    public long e(long j17, long j18) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f392807b;
        c26970x63d6eaa3.m107799x37fbf859(1, j17);
        try {
            return c26970x63d6eaa3.m107873x58f653cf();
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26958x769a621 unused) {
            return j18;
        }
    }

    public int f(java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107710x1d3f4980 = this.f392806a.m107710x1d3f4980(java.lang.String.format("SELECT count(*) FROM %s;", str), null);
        try {
            if (m107710x1d3f4980.moveToNext()) {
                return m107710x1d3f4980.getInt(0);
            }
            return 0;
        } finally {
            m107710x1d3f4980.close();
        }
    }

    public boolean g(java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107710x1d3f4980 = this.f392806a.m107710x1d3f4980("SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;", new java.lang.String[]{str});
        boolean moveToNext = m107710x1d3f4980.moveToNext();
        m107710x1d3f4980.close();
        return moveToNext;
    }

    public android.database.Cursor h(java.lang.String str, java.lang.String[] strArr) {
        return this.f392806a.m107712x46d43bc4(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, str, strArr, null);
    }

    public void i(long j17, long j18) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f392808c;
        c26970x63d6eaa3.m107799x37fbf859(1, j17);
        c26970x63d6eaa3.m107799x37fbf859(2, j18);
        c26970x63d6eaa3.m107867xb158f775();
    }
}
