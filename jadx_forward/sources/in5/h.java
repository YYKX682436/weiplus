package in5;

/* loaded from: classes2.dex */
public abstract class h {
    public static final void a(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            in5.e eVar = (in5.e) it.next();
            long a17 = hq.d.a();
            eVar.f374557c = a17;
            eVar.f374558d = a17 - eVar.f374556b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EasyExposeTimeRecordListener", "updateTimeRecord: " + eVar);
        }
    }
}
