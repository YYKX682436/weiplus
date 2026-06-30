package mj4;

/* loaded from: classes11.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.v f408613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(mj4.v vVar) {
        super(0);
        this.f408613d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int e17 = c01.id.e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select rowid, * from TextStatus where ExpireTime > ");
        java.lang.String[] strArr = mj4.v.f408614f;
        sb6.append(e17);
        sb6.append(' ');
        android.database.Cursor B = this.f408613d.f408615d.B(sb6.toString(), null);
        if (B != null) {
            while (B.moveToNext()) {
                mj4.a aVar = new mj4.a();
                aVar.mo9015xbf5d97fd(B);
                concurrentHashMap.put(aVar.f76535x11b86abb, aVar);
            }
            B.close();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("init time ");
        sb7.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb7.append(" serverCurTime:");
        sb7.append(e17);
        sb7.append(" size:");
        sb7.append(B != null ? java.lang.Integer.valueOf(B.getCount()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusStorage", sb7.toString());
        return concurrentHashMap;
    }
}
