package b31;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b31.d f17595g;

    public b(b31.d dVar, java.util.List list, java.lang.String str, java.lang.String str2) {
        this.f17595g = dVar;
        this.f17592d = list;
        this.f17593e = str;
        this.f17594f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : this.f17592d) {
            r45.du5 du5Var = new r45.du5();
            du5Var.f372756d = str;
            du5Var.f372757e = true;
            linkedList.add(du5Var);
        }
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = this.f17593e;
        du5Var2.f372757e = true;
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f372756d = this.f17594f;
        du5Var3.f372757e = true;
        gm0.j1.d().a(228, this.f17595g);
        gm0.j1.d().g(new b31.a(linkedList.size(), linkedList, du5Var2, du5Var3));
    }
}
