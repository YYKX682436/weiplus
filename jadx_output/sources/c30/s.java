package c30;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final c30.e f38158a;

    /* renamed from: b, reason: collision with root package name */
    public c30.l f38159b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f38160c;

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f38161d;

    public s(c30.e db6) {
        kotlin.jvm.internal.o.g(db6, "db");
        this.f38158a = db6;
        this.f38160c = new java.util.LinkedHashMap();
    }

    public final java.util.List a() {
        java.util.Collection values = ((java.util.LinkedHashMap) this.f38160c).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            if (((c30.k) obj).f38142c == c30.j.f38134d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void b() {
        java.util.List a17 = a();
        java.util.ArrayList arrayList = (java.util.ArrayList) a17;
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c30.k) it.next()).f38140a);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        c(c30.j.f38135e, a17);
        bw5.w6 w6Var = new bw5.w6();
        w6Var.f34593d = new java.util.LinkedList(arrayList2);
        w6Var.f34594e[2] = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = w6Var;
        lVar.f70665b = new bw5.x6();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_getusershopinfo";
        lVar.f70667d = 28957;
        com.tencent.mars.xlog.Log.i("EcsWeShopInfoUpdater", "EcsGetUserShopInfoReq shopAppIds count: " + arrayList2.size());
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new c30.p(this, a17));
    }

    public final void c(c30.j newStatus, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            c30.k kVar = (c30.k) it.next();
            kVar.getClass();
            kotlin.jvm.internal.o.g(newStatus, "newStatus");
            kVar.f38142c = newStatus;
            kVar.f38141b = android.os.SystemClock.elapsedRealtime();
        }
    }
}
