package ut2;

/* loaded from: classes3.dex */
public final class m4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f512537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f512538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(android.graphics.Bitmap bitmap, ut2.j5 j5Var) {
        super(0);
        this.f512537d = bitmap;
        this.f512538e = j5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        ut2.j5 j5Var = this.f512538e;
        android.graphics.Bitmap bitmap = this.f512537d;
        if (bitmap != null) {
            j5Var.q().setImageBitmap(bitmap);
            d92.f.f309003a.k(j5Var.q(), (bitmap.getWidth() * 16.0f) / bitmap.getHeight(), 16.0f);
            j5Var.q().setVisibility(0);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            j5Var.q().setVisibility(8);
        }
        return f0Var2;
    }
}
