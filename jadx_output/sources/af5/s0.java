package af5;

/* loaded from: classes11.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f4639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView) {
        super(0);
        this.f4639d = markdownNativeMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = this.f4639d;
        markdownNativeMvvmView.f204654r = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownNativeMvvmView", "[PREVIEW_TAP] markPreviewTapConsumed=true");
        yz5.a aVar = markdownNativeMvvmView.onPreviewInteractionConsumed;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
