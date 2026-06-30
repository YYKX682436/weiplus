package t85;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t85.j f498005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t85.j jVar) {
        super(2);
        this.f498005d = jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String type = (java.lang.String) obj;
        java.lang.String path = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        t85.f fVar = new t85.f();
        t85.j jVar = this.f498005d;
        java.lang.String str = jVar.f498007a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        fVar.f497998a = str;
        fVar.f497999b = jVar.f498008b;
        fVar.f498000c = type;
        fVar.f498001d = path;
        return fVar;
    }
}
