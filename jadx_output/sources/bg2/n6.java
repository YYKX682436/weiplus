package bg2;

/* loaded from: classes2.dex */
public final class n6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(bg2.q6 q6Var, android.content.Context context) {
        super(1);
        this.f20337d = q6Var;
        this.f20338e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList it = (java.util.LinkedList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bg2.q6 q6Var = this.f20337d;
        kotlinx.coroutines.y0 y0Var = q6Var.f417141d.f417147g;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new bg2.m6(it, q6Var, this.f20338e, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
