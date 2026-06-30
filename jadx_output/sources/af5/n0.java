package af5;

/* loaded from: classes11.dex */
public final class n0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f4615d;

    public n0(com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView) {
        this.f4615d = markdownNativeMvvmView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = this.f4615d;
        markdownNativeMvvmView.f204647h.f232210c.c();
        com.tencent.mm.view.SmoothLinearLayout smoothLinearLayout = markdownNativeMvvmView.f204653q;
        if (smoothLinearLayout != null) {
            smoothLinearLayout.setAnimEnabled(false);
        } else {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
    }
}
