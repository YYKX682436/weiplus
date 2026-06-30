package w52;

/* loaded from: classes15.dex */
public abstract class b {
    public static nm5.b a() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, getCurPageFlowItem, doNotNeedSessionMonitor: TRUE");
            return null;
        }
        r45.c45 e17 = x52.c.e();
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, curSession is NULL");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, curSession: %s", e17.f452803d);
        r45.b2 e18 = f52.c.b().e();
        if (e18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, curAR is NULL");
            return null;
        }
        nm5.b e19 = y52.b.e(e17.f452803d, e18.f451967d.f452433d);
        if (e19 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, getPageFlowItemOfCurSession is NULL");
            return null;
        }
        ((java.lang.Integer) e19.a(1)).intValue();
        return e19;
    }
}
