package e11;

/* loaded from: classes15.dex */
public class d implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f327894d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f327895e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f327896f = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f327897g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f327898h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f327899i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f327900m = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f327901n = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f327902o = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f327903p = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f327904q = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f327905r = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f327906s = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f327907t = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f327908u = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f327909v = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f327910w = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f327911x = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f327912y = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f327913z = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List A = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List B = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List C = new java.util.concurrent.CopyOnWriteArrayList();

    public void a(java.util.List list, java.util.List list2) {
        if (list.size() > 10000) {
            for (int i17 = 0; i17 < list2.size() + 100; i17++) {
                try {
                    list.remove(0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addDelayedMsgList %s", e17.getMessage());
                }
            }
        }
        list.addAll(list2);
    }

    public void b(e11.f fVar) {
        java.util.List list = this.f327894d;
        if (((java.util.concurrent.CopyOnWriteArrayList) list).size() > 30000) {
            for (int i17 = 0; i17 < 100; i17++) {
                try {
                    ((java.util.concurrent.CopyOnWriteArrayList) list).remove(0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addProcessStatusList %s", e17.getMessage());
                }
            }
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(fVar);
    }

    public void c(java.util.List list) {
        java.util.List list2 = this.f327896f;
        if (((java.util.concurrent.CopyOnWriteArrayList) list2).size() > 30000) {
            for (int i17 = 0; i17 < list.size() + 100; i17++) {
                try {
                    ((java.util.concurrent.CopyOnWriteArrayList) list2).remove(0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addReceiveInterProcessList %s", e17.getMessage());
                }
            }
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list2).addAll(list);
    }

    public void d(java.util.List list) {
        java.util.List list2 = this.f327895e;
        if (((java.util.concurrent.CopyOnWriteArrayList) list2).size() > 30000) {
            for (int i17 = 0; i17 < list.size() + 100; i17++) {
                try {
                    ((java.util.concurrent.CopyOnWriteArrayList) list2).remove(0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addSendInterProcessList %s", e17.getMessage());
                }
            }
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list2).addAll(list);
    }
}
