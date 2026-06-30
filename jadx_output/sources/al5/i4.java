package al5;

/* loaded from: classes3.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.TouchMediaPreviewLayout f5928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout) {
        super(0);
        this.f5928d = touchMediaPreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = this.f5928d;
        return new android.view.GestureDetector(touchMediaPreviewLayout.getContext(), touchMediaPreviewLayout);
    }
}
