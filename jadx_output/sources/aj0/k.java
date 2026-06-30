package aj0;

/* loaded from: classes11.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj0.l f5255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5256e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(aj0.l lVar, long j17) {
        super(0);
        this.f5255d = lVar;
        this.f5256e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        aj0.l lVar = this.f5255d;
        boolean A = ((kotlinx.coroutines.c3) lVar.f5267k).A();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!A) {
            io.flutter.Log.i(lVar.f5261e, "pre render next frame displayed, cost:" + (java.lang.System.currentTimeMillis() - this.f5256e));
            ((kotlinx.coroutines.u2) lVar.f5267k).U(f0Var);
            yz5.a aVar = lVar.f5268l;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return f0Var;
    }
}
