package i21;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f369451a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f369452b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369453c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f369454d;

    public s(java.lang.String str, java.util.LinkedList imgPathList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPathList, "imgPathList");
        this.f369451a = str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f369452b = linkedList;
        this.f369454d = gm0.j1.b().h() + "" + java.lang.System.currentTimeMillis();
        linkedList.clear();
        linkedList.addAll(imgPathList);
        this.f369453c = linkedList.size();
    }
}
