package af5;

/* loaded from: classes11.dex */
public final class o0 extends yn.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView f4622d;

    public o0(com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView) {
        this.f4622d = markdownNativeMvvmView;
    }

    @Override // yn.a, yn.l
    public void K() {
        yn.j jVar;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = this.f4622d;
        markdownNativeMvvmView.getSelectableLayout$app_release().d(jf5.o0.f299493h);
        yb5.d dVar = markdownNativeMvvmView.f204649m;
        if (dVar != null && (jVar = (yn.j) dVar.f460708c.a(yn.j.class)) != null) {
            ((com.tencent.mm.ui.chatting.component.y4) jVar).c(this);
        }
        if (markdownNativeMvvmView.f204648i == this) {
            markdownNativeMvvmView.f204648i = null;
            markdownNativeMvvmView.f204649m = null;
        }
    }
}
