package hf2;

/* loaded from: classes10.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.l2 f362591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f362592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(hf2.l2 l2Var, android.graphics.Bitmap bitmap) {
        super(0);
        this.f362591d = l2Var;
        this.f362592e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hf2.l2 l2Var = this.f362591d;
        hf2.b2 h76 = l2Var.f362637a.h7();
        android.graphics.Bitmap bitmap = this.f362592e;
        h76.d("select_maas", bitmap, 1.0f);
        l2Var.f362637a.f7().c("select_maas", bitmap);
        return jz5.f0.f384359a;
    }
}
