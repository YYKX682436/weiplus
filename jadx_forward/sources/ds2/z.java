package ds2;

/* loaded from: classes2.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f324446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f324447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.util.LinkedList linkedList, ds2.b0 b0Var) {
        super(0);
        this.f324446d = linkedList;
        this.f324447e = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ds2.b0 b0Var = this.f324447e;
        java.util.Collection values = b0Var.f324388c.values();
        java.util.LinkedList linkedList = this.f324446d;
        linkedList.addAll(values);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            b0Var.a(((cs2.p) it.next()).f303625i2, true, "onClearAll");
        }
        java.util.LinkedList linkedList2 = b0Var.f324389d;
        linkedList.addAll(linkedList2);
        b0Var.f324388c.clear();
        linkedList2.clear();
        return jz5.f0.f384359a;
    }
}
