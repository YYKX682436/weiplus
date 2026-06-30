package ov2;

/* loaded from: classes10.dex */
public final class d implements pv2.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f430707a;

    public d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f430707a = arrayList;
        arrayList.add(new vv2.a());
        arrayList.add(new vv2.b());
    }

    @Override // pv2.j
    public void a(java.lang.String taskId, pv2.g from, pv2.g to6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostStageMonitor", "PostLog transfer from:" + pv2.i.a(from) + ", to:" + pv2.i.a(to6));
        java.util.Iterator it = this.f430707a.iterator();
        while (it.hasNext()) {
            ((pv2.j) it.next()).a(taskId, from, to6);
        }
    }

    @Override // pv2.j
    public void b(java.lang.String taskId, pv2.g endStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endStage, "endStage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostStageMonitor", "PostLog end:" + pv2.i.a(endStage));
        java.util.Iterator it = this.f430707a.iterator();
        while (it.hasNext()) {
            ((pv2.j) it.next()).b(taskId, endStage);
        }
    }

    @Override // pv2.j
    public void c(java.lang.String taskId, pv2.g beginStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beginStage, "beginStage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostStageMonitor", "PostLog begin:" + pv2.i.a(beginStage));
        java.util.Iterator it = this.f430707a.iterator();
        while (it.hasNext()) {
            ((pv2.j) it.next()).c(taskId, beginStage);
        }
    }
}
