package b31;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b31.d f17600h;

    public c(b31.d dVar, java.util.List list, java.lang.String str, java.lang.String str2, int i17) {
        this.f17600h = dVar;
        this.f17596d = list;
        this.f17597e = str;
        this.f17598f = str2;
        this.f17599g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : this.f17596d) {
            r45.du5 du5Var = new r45.du5();
            du5Var.f372756d = str;
            du5Var.f372757e = true;
            linkedList.add(du5Var);
        }
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = this.f17597e;
        du5Var2.f372757e = true;
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f372756d = this.f17598f;
        du5Var3.f372757e = true;
        gm0.j1.d().a(228, this.f17600h);
        b31.a aVar = new b31.a(linkedList.size(), linkedList, du5Var2, du5Var3);
        r45.zq5 zq5Var = aVar.f17591f;
        if (zq5Var != null) {
            zq5Var.f392310h = this.f17599g;
        }
        gm0.j1.d().g(aVar);
    }
}
