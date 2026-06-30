package u22;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.k f505521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f505522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u22.k kVar, java.util.List list) {
        super(0);
        this.f505521d = kVar;
        this.f505522e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        u22.k kVar = this.f505521d;
        java.util.LinkedList linkedList = kVar.f505532d;
        java.util.List newList = this.f505522e;
        synchronized (linkedList) {
            java.util.LinkedList oldList = kVar.f505532d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldList, "oldList");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
            h0Var.f391656d = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new t85.c(oldList, newList), false);
            kVar.f505532d.clear();
            kVar.f505532d.addAll(newList);
        }
        pm0.v.X(new u22.f(this.f505521d, this.f505522e, h0Var));
        return jz5.f0.f384359a;
    }
}
