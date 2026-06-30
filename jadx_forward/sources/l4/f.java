package l4;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l4.j f397245d;

    public f(l4.j jVar) {
        this.f397245d = jVar;
    }

    public final java.util.Set a() {
        java.util.HashSet hashSet = new java.util.HashSet();
        android.database.Cursor g17 = this.f397245d.f397254c.g(new p4.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (g17.moveToNext()) {
            try {
                hashSet.add(java.lang.Integer.valueOf(g17.getInt(0)));
            } catch (java.lang.Throwable th6) {
                g17.close();
                throw th6;
            }
        }
        g17.close();
        if (!hashSet.isEmpty()) {
            ((q4.i) this.f397245d.f397257f).a();
        }
        return hashSet;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f397245d.f397254c.f397286h.readLock();
        java.util.Set set = null;
        try {
            try {
                readLock.lock();
            } catch (android.database.sqlite.SQLiteException | java.lang.IllegalStateException unused) {
            }
            if (this.f397245d.a()) {
                if (this.f397245d.f397255d.compareAndSet(true, false)) {
                    if (((q4.c) this.f397245d.f397254c.f397281c.d0()).f441540d.inTransaction()) {
                        return;
                    }
                    l4.q qVar = this.f397245d.f397254c;
                    if (qVar.f397284f) {
                        q4.c cVar = (q4.c) qVar.f397281c.d0();
                        cVar.a();
                        try {
                            set = a();
                            cVar.j();
                            cVar.b();
                        } catch (java.lang.Throwable th6) {
                            cVar.b();
                            throw th6;
                        }
                    } else {
                        set = a();
                    }
                    if (set == null || set.isEmpty()) {
                        return;
                    }
                    synchronized (this.f397245d.f397259h) {
                        q.f fVar = (q.f) this.f397245d.f397259h.iterator();
                        if (fVar.hasNext()) {
                            ((l4.i) ((java.util.Map.Entry) fVar.next()).getValue()).getClass();
                            throw null;
                        }
                    }
                }
            }
        } finally {
            readLock.unlock();
        }
    }
}
