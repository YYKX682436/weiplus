package es2;

/* loaded from: classes2.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f337870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.util.LinkedList linkedList, es2.h0 h0Var) {
        super(0);
        this.f337870d = linkedList;
        this.f337871e = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        es2.h0 h0Var = this.f337871e;
        java.util.Collection values = h0Var.f337904d.values();
        java.util.LinkedList linkedList = this.f337870d;
        linkedList.addAll(values);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            h0Var.a(((cs2.p) it.next()).f303625i2, true, "onClearAll");
        }
        java.util.LinkedList linkedList2 = h0Var.f337905e;
        linkedList.addAll(linkedList2);
        h0Var.f337904d.clear();
        linkedList2.clear();
        return jz5.f0.f384359a;
    }
}
