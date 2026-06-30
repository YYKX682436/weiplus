package cf;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f40822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f40823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yz5.l lVar, java.util.LinkedList linkedList) {
        super(1);
        this.f40822d = lVar;
        this.f40823e = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.Object invoke = this.f40822d.invoke(e17);
        if (invoke != null) {
            this.f40823e.add(invoke);
        }
        return jz5.f0.f302826a;
    }
}
