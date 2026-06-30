package b31;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f99125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b31.d f99128g;

    public b(b31.d dVar, java.util.List list, java.lang.String str, java.lang.String str2) {
        this.f99128g = dVar;
        this.f99125d = list;
        this.f99126e = str;
        this.f99127f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : this.f99125d) {
            r45.du5 du5Var = new r45.du5();
            du5Var.f454289d = str;
            du5Var.f454290e = true;
            linkedList.add(du5Var);
        }
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f454289d = this.f99126e;
        du5Var2.f454290e = true;
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f454289d = this.f99127f;
        du5Var3.f454290e = true;
        gm0.j1.d().a(228, this.f99128g);
        gm0.j1.d().g(new b31.a(linkedList.size(), linkedList, du5Var2, du5Var3));
    }
}
