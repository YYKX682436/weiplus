package al5;

/* loaded from: classes10.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f5874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f5875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.TouchMediaPreviewLayout f5876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(float f17, float f18, com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout) {
        super(1);
        this.f5874d = f17;
        this.f5875e = f18;
        this.f5876f = touchMediaPreviewLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Matrix it = (android.graphics.Matrix) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.postTranslate(this.f5874d, this.f5875e);
        this.f5876f.G = true;
        return java.lang.Boolean.TRUE;
    }
}
