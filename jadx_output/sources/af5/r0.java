package af5;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.q0 f4635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f4636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.ui.chatting.viewitems.q0 q0Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView) {
        super(0);
        this.f4635d = q0Var;
        this.f4636e = markdownNativeMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f4635d.onLongClick(this.f4636e);
        return java.lang.Boolean.TRUE;
    }
}
