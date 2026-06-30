package af5;

/* loaded from: classes11.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f4643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView) {
        super(1);
        this.f4643d = markdownNativeMvvmView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        v11.e button = (v11.e) obj;
        kotlin.jvm.internal.o.g(button, "button");
        yz5.l onInteractButtonClickListener = this.f4643d.getOnInteractButtonClickListener();
        if (onInteractButtonClickListener != null) {
            onInteractButtonClickListener.invoke(button);
        }
        return jz5.f0.f302826a;
    }
}
