package b31;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f99129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f99132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b31.d f99133h;

    public c(b31.d dVar, java.util.List list, java.lang.String str, java.lang.String str2, int i17) {
        this.f99133h = dVar;
        this.f99129d = list;
        this.f99130e = str;
        this.f99131f = str2;
        this.f99132g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : this.f99129d) {
            r45.du5 du5Var = new r45.du5();
            du5Var.f454289d = str;
            du5Var.f454290e = true;
            linkedList.add(du5Var);
        }
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f454289d = this.f99130e;
        du5Var2.f454290e = true;
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f454289d = this.f99131f;
        du5Var3.f454290e = true;
        gm0.j1.d().a(228, this.f99133h);
        b31.a aVar = new b31.a(linkedList.size(), linkedList, du5Var2, du5Var3);
        r45.zq5 zq5Var = aVar.f99124f;
        if (zq5Var != null) {
            zq5Var.f473843h = this.f99132g;
        }
        gm0.j1.d().g(aVar);
    }
}
