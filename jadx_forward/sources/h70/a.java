package h70;

@j95.b
/* loaded from: classes8.dex */
public final class a extends i95.w implements f70.e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f360904d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f360905e = new java.lang.Object();

    public void Ai() {
        if (this.f360904d) {
            return;
        }
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        ((mn3.h) ((ra0.u) i95.n0.c(ra0.u.class))).aj();
        ((mn3.h) ((ra0.u) i95.n0.c(ra0.u.class))).Zi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        if (hm4.c.f363826a.b()) {
            arrayList.add(10);
        }
        arrayList.add(11);
        w71.m1 wi6 = ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).wi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initAffSync businessTypeList: %s, reddotSyncManager: ");
        sb6.append(wi6 != null ? java.lang.Integer.valueOf(wi6.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffRedDotFeatureService", sb6.toString(), kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
        if (wi6 != null) {
            synchronized (this.f360905e) {
                if (this.f360904d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AffRedDotFeatureService", "initAffSync has init and ignore");
                } else {
                    this.f360904d = true;
                    p3380x6a61f93.p3386xf51b86f1.C30596x21b1ccf3.m170137x21b3985e(((w71.n1) wi6).m105978x2737f10(), kz5.n0.R0(arrayList));
                }
            }
        }
    }

    public w71.m1 wi() {
        int i17 = w71.n1.f524955d;
        return (w71.m1) p3380x6a61f93.p3386xf51b86f1.C30596x21b1ccf3.m170131x21b0d463();
    }
}
