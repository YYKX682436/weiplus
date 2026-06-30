package af5;

/* loaded from: classes11.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f4625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f4626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView, yb5.d dVar) {
        super(0);
        this.f4625d = markdownNativeMvvmView;
        this.f4626e = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView.f204644w;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = this.f4625d;
        markdownNativeMvvmView.g();
        af5.o0 o0Var = new af5.o0(markdownNativeMvvmView);
        markdownNativeMvvmView.f204648i = o0Var;
        yb5.d dVar = this.f4626e;
        markdownNativeMvvmView.f204649m = dVar;
        yn.j jVar = (yn.j) dVar.f460708c.a(yn.j.class);
        if (jVar != null) {
            ((com.tencent.mm.ui.chatting.component.y4) jVar).b(o0Var);
        }
        return jz5.f0.f302826a;
    }
}
