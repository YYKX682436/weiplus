package hf2;

/* loaded from: classes10.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.l2 f362600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f362601e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(hf2.l2 l2Var, android.graphics.Bitmap bitmap) {
        super(0);
        this.f362600d = l2Var;
        this.f362601e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        hf2.l2 l2Var = this.f362600d;
        hf2.b2 h76 = l2Var.f362637a.h7();
        hf2.x xVar = l2Var.f362637a;
        r45.ei0 ei0Var = xVar.f362718q;
        float f17 = (ei0Var == null || (linkedList = ei0Var.f455062d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? 1.0f : ji0Var.f459360i;
        android.graphics.Bitmap bitmap = this.f362601e;
        h76.d("select_editor", bitmap, f17);
        xVar.f7().c("select_editor", bitmap);
        return jz5.f0.f384359a;
    }
}
