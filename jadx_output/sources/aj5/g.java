package aj5;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f5428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.i f5429e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity appCompatActivity, aj5.i iVar) {
        super(0);
        this.f5428d = appCompatActivity;
        this.f5429e = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wi5.n0 n0Var;
        oi5.e eVar = new oi5.e(this.f5428d);
        j75.f Q6 = this.f5429e.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.getState()) != null) {
            java.util.HashSet hashSet = n0Var.f446320p;
            kotlin.jvm.internal.o.g(hashSet, "<set-?>");
            eVar.f345658g = hashSet;
        }
        return eVar;
    }
}
