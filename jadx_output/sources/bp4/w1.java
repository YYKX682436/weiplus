package bp4;

/* loaded from: classes10.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.c2 f23401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(bp4.c2 c2Var) {
        super(2);
        this.f23401d = c2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        bp4.c2 c2Var = this.f23401d;
        ((android.widget.ImageView) ((jz5.n) c2Var.f23127s).getValue()).setImageBitmap(bitmap);
        ((android.widget.ImageView) ((jz5.n) c2Var.f23128t).getValue()).setImageBitmap(bitmap);
        return jz5.f0.f302826a;
    }
}
