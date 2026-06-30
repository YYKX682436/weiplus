package c24;

/* loaded from: classes.dex */
public final class e extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f38074d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f38075e;

    public e(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f38074d = list;
        this.f38075e = new java.util.LinkedList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        u26.k0 k0Var = new u26.k0();
        ym3.d dVar = new ym3.d(request);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingDataSource", "get data, size : " + this.f38075e.size());
        dVar.f463149c.addAll(this.f38075e);
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @Override // ym3.f
    public void onCreate() {
        this.f38075e = new java.util.LinkedList();
        int i17 = 0;
        for (java.lang.Object obj : this.f38074d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            a24.i iVar = (a24.i) obj;
            if (iVar.getF161948p()) {
                this.f38075e.add(new c24.f(i17, iVar));
            }
            i17 = i18;
        }
    }
}
