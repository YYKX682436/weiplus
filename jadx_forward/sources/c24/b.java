package c24;

/* loaded from: classes.dex */
public final class b extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f119601d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f119602e;

    public b(java.util.List list, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f119601d = list;
        this.f119602e = activity;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        int i17 = 0;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(1, 0, null, 6, null);
        ym3.d dVar = new ym3.d(request);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.Object obj : this.f119601d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            linkedList.add(new c24.c(i17, (wd0.x1) obj, this.f119602e));
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SearchDataSource", "get data, size : " + linkedList.size());
        dVar.f544682c.addAll(linkedList);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) b17).e(dVar);
        return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b17);
    }
}
