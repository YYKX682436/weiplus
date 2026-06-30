package hf2;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.x f362660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f362661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hf2.x xVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f362660d = xVar;
        this.f362661e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        hf2.x xVar = this.f362660d;
        hf2.b2 h76 = xVar.h7();
        r45.ei0 ei0Var = xVar.f362718q;
        float f17 = (ei0Var == null || (linkedList = ei0Var.f455062d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? 1.0f : ji0Var.f459360i;
        android.graphics.Bitmap bitmap = this.f362661e;
        h76.d("setTextBitmap", bitmap, f17);
        xVar.f7().c("setTextBitmap", bitmap);
        return jz5.f0.f384359a;
    }
}
