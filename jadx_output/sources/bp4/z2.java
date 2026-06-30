package bp4;

/* loaded from: classes5.dex */
public final class z2 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.ui.widget.PagInputView f23436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(android.view.ViewGroup layout, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mm.plugin.vlog.ui.widget.PagInputView pagInputView = (com.tencent.mm.plugin.vlog.ui.widget.PagInputView) layout.findViewById(com.tencent.mm.R.id.d8p);
        this.f23436f = pagInputView;
        pagInputView.setTextChangeCallback(new bp4.y2(this, status));
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.vlog.ui.widget.PagInputView pagInputView = this.f23436f;
        if (!(pagInputView.getVisibility() == 0)) {
            return false;
        }
        pagInputView.setShow(false);
        ju3.d0.k(this.f465332d, ju3.c0.W, null, 2, null);
        return true;
    }
}
