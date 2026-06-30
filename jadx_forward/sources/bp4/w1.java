package bp4;

/* loaded from: classes10.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.c2 f104934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(bp4.c2 c2Var) {
        super(2);
        this.f104934d = c2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        bp4.c2 c2Var = this.f104934d;
        ((android.widget.ImageView) ((jz5.n) c2Var.f104660s).mo141623x754a37bb()).setImageBitmap(bitmap);
        ((android.widget.ImageView) ((jz5.n) c2Var.f104661t).mo141623x754a37bb()).setImageBitmap(bitmap);
        return jz5.f0.f384359a;
    }
}
