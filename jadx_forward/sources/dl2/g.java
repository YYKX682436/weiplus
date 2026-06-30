package dl2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f316753a;

    /* renamed from: b, reason: collision with root package name */
    public long f316754b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f316755c;

    public g(int i17, long j17, java.util.LinkedList productList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productList, "productList");
        this.f316753a = i17;
        this.f316754b = j17;
        this.f316755c = productList;
    }

    /* renamed from: toString */
    public java.lang.String m124753x9616526c() {
        java.lang.String str = "FinderLiveGiftPkgChooseResult: level=" + this.f316753a + ", coin=" + this.f316754b + " \n";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f316755c.iterator();
        while (it.hasNext()) {
            sb6.append(((dl2.f) it.next()).m124752x9616526c());
            sb6.append("\n");
        }
        return str + ((java.lang.Object) sb6);
    }
}
