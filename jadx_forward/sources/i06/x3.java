package i06;

/* loaded from: classes15.dex */
public final class x3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.y3 f368324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(i06.y3 y3Var) {
        super(0);
        this.f368324d = y3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List mo150356xa5be00c1 = this.f368324d.f368335d.mo150356xa5be00c1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo150356xa5be00c1, "getUpperBounds(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mo150356xa5be00c1, 10));
        java.util.Iterator it = mo150356xa5be00c1.iterator();
        while (it.hasNext()) {
            arrayList.add(new i06.w3((f26.o0) it.next(), null, 2, null));
        }
        return arrayList;
    }
}
