package al5;

/* loaded from: classes10.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.TouchMediaPreviewLayout f5922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout) {
        super(1);
        this.f5922d = touchMediaPreviewLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = this.f5922d;
        touchMediaPreviewLayout.A = false;
        touchMediaPreviewLayout.setInScaleAnimation(false);
        if (touchMediaPreviewLayout.f211464n) {
            al5.z3 doubleTapListener = touchMediaPreviewLayout.getDoubleTapListener();
            if (doubleTapListener != null) {
                doubleTapListener.a();
            }
            touchMediaPreviewLayout.f211464n = false;
        }
        return jz5.f0.f302826a;
    }
}
