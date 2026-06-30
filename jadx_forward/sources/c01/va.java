package c01;

/* loaded from: classes9.dex */
public class va implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.ua f119058d;

    public va(c01.ua uaVar) {
        this.f119058d = uaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT count(*) FROM ");
        c01.ua uaVar = this.f119058d;
        sb6.append(uaVar.L0(20));
        android.database.Cursor f17 = uaVar.f119043d.f(sb6.toString(), null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        if (i17 > 1000) {
            java.lang.String format = java.lang.String.format("%s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", "time", "time", "readerappnews1", "time", 100);
            uaVar.s0(format);
            uaVar.f119043d.A("readerappnews1", java.lang.String.format("DELETE FROM %s WHERE %s", "readerappnews1", format));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReaderAppInfoStorage", "deleteOldData delete cost: %d, count: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReaderAppInfoStorage", "deleteOldData count: %d", java.lang.Integer.valueOf(i17));
        }
        c01.ua.f119042f = false;
    }
}
