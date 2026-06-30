package bg2;

/* loaded from: classes2.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d0 f102144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f102145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(bg2.d0 d0Var, java.util.List list) {
        super(0);
        this.f102144d = d0Var;
        this.f102145e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bg2.d0 d0Var = this.f102144d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z6 = d0Var.Z6();
        if (Z6 != null) {
            Z6.setVisibility(0);
        }
        ag2.d dVar = d0Var.f101533g;
        if (dVar != null) {
            java.util.List list = this.f102145e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "new");
            java.util.LinkedList linkedList = dVar.f86228n;
            int size = linkedList.size();
            linkedList.addAll(list);
            dVar.m8153xd399a4d9(size, list.size());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z62 = d0Var.Z6();
        if (Z62 != null) {
            Z62.post(new bg2.w(d0Var));
        }
        d0Var.a7();
        return jz5.f0.f384359a;
    }
}
