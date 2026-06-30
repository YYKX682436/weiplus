package at2;

/* loaded from: classes3.dex */
public final class b extends com.tencent.mm.plugin.finder.live.plugin.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        if (((ct2.j) P0(ct2.j.class)).f222280x) {
            K0(8);
        } else {
            zl2.r4.f473950a.e(this, false);
            root.post(new at2.a(this, root));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(int i17) {
        if (((ct2.j) P0(ct2.j.class)).f222280x) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i17 + com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        viewGroup.setLayoutParams(layoutParams2);
        viewGroup.setVisibility(0);
    }
}
