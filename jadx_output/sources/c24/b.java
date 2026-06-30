package c24;

/* loaded from: classes.dex */
public final class b extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f38068d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f38069e;

    public b(java.util.List list, androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f38068d = list;
        this.f38069e = activity;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        int i17 = 0;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(1, 0, null, 6, null);
        ym3.d dVar = new ym3.d(request);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.Object obj : this.f38068d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            linkedList.add(new c24.c(i17, (wd0.x1) obj, this.f38069e));
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SearchDataSource", "get data, size : " + linkedList.size());
        dVar.f463149c.addAll(linkedList);
        ((kotlinx.coroutines.flow.q2) b17).e(dVar);
        return kotlinx.coroutines.flow.l.a(b17);
    }
}
