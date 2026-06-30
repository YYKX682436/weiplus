package af5;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ af5.d1 f4550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(af5.d1 d1Var) {
        super(1);
        this.f4550d = d1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        v11.t markdownVM = (v11.t) obj;
        kotlin.jvm.internal.o.g(markdownVM, "markdownVM");
        af5.d1 d1Var = this.f4550d;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = d1Var.f4564g;
        if (markdownNativeMvvmView == null) {
            kotlin.jvm.internal.o.o("thinkingMarkdownView");
            throw null;
        }
        markdownNativeMvvmView.setViewModel(markdownVM);
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView2 = d1Var.f4564g;
        if (markdownNativeMvvmView2 != null) {
            markdownNativeMvvmView2.setVisibility(0);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("thinkingMarkdownView");
        throw null;
    }
}
