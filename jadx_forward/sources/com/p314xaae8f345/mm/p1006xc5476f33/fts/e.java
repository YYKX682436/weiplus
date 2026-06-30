package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public class e extends android.database.CursorWrapper {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f218935d = new java.util.concurrent.ConcurrentHashMap();

    public e(android.database.Cursor cursor) {
        super(cursor);
        ((java.util.concurrent.ConcurrentHashMap) f218935d).put(cursor, java.lang.Long.valueOf(c01.id.c()));
    }

    public static final void a() {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) f218935d).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            android.database.Cursor cursor = (android.database.Cursor) entry.getKey();
            long longValue = ((java.lang.Long) entry.getValue()).longValue();
            if (cursor.isClosed()) {
                it.remove();
            } else if (c01.id.c() - longValue > 600000) {
                try {
                    cursor.close();
                } catch (java.lang.Exception unused) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSCursor", "not close cursor!!! %d add in %d", java.lang.Integer.valueOf(cursor.hashCode()), java.lang.Long.valueOf(longValue));
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("FTSLeakCursor");
            }
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        ((java.util.concurrent.ConcurrentHashMap) f218935d).remove(getWrappedCursor());
    }
}
