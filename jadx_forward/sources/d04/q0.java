package d04;

/* loaded from: classes13.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 f307023d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4) {
        this.f307023d = c17327x39ee10a4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4 = this.f307023d;
        d04.j jVar = c17327x39ee10a4.N1;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        if (jVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
            throw null;
        }
        jVar.c(c17327x39ee10a4.getMBottomExtraHeight());
        android.widget.ImageView imageView = c17327x39ee10a4.K1;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
            throw null;
        }
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 != null) {
            if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = c17327x39ee10a4.getMBottomExtraHeight();
            }
            layoutParams = layoutParams2;
        }
        imageView.setLayoutParams(layoutParams);
    }
}
