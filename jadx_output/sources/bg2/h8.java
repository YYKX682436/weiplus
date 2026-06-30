package bg2;

/* loaded from: classes2.dex */
public final class h8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20149f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(bg2.l8 l8Var, int i17, android.content.Context context) {
        super(1);
        this.f20147d = l8Var;
        this.f20148e = i17;
        this.f20149f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList it = (java.util.LinkedList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bg2.l8 l8Var = this.f20147d;
        kotlinx.coroutines.y0 y0Var = l8Var.f417141d.f417147g;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new bg2.g8(it, l8Var, this.f20148e, this.f20149f, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
