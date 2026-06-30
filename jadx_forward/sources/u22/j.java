package u22;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.k f505527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f505528e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u22.k kVar, java.util.List list) {
        super(0);
        this.f505527d = kVar;
        this.f505528e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        u22.k kVar = this.f505527d;
        java.util.LinkedList linkedList = kVar.f505531c;
        java.util.List newList = this.f505528e;
        synchronized (linkedList) {
            java.util.LinkedList oldList = kVar.f505531c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldList, "oldList");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
            h0Var.f391656d = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new t85.c(oldList, newList), false);
            kVar.f505531c.clear();
            kVar.f505531c.addAll(newList);
        }
        pm0.v.X(new u22.i(this.f505527d, this.f505528e, h0Var));
        return jz5.f0.f384359a;
    }
}
