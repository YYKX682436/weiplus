package bg2;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d0 f20611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f20612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(bg2.d0 d0Var, java.util.List list) {
        super(0);
        this.f20611d = d0Var;
        this.f20612e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bg2.d0 d0Var = this.f20611d;
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z6 = d0Var.Z6();
        if (Z6 != null) {
            Z6.setVisibility(0);
        }
        ag2.d dVar = d0Var.f20000g;
        if (dVar != null) {
            java.util.List list = this.f20612e;
            kotlin.jvm.internal.o.g(list, "new");
            java.util.LinkedList linkedList = dVar.f4695n;
            int size = linkedList.size();
            linkedList.addAll(list);
            dVar.notifyItemRangeInserted(size, list.size());
        }
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z62 = d0Var.Z6();
        if (Z62 != null) {
            Z62.post(new bg2.w(d0Var));
        }
        d0Var.a7();
        return jz5.f0.f302826a;
    }
}
