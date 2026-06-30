package sc2;

/* loaded from: classes2.dex */
public final class z7 implements j45.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.a8 f487956a;

    public z7(sc2.a8 a8Var) {
        this.f487956a = a8Var;
    }

    @Override // j45.j
    public final boolean a(android.content.Context context, android.app.Activity activity, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        in5.s0 s0Var;
        android.content.ComponentName component;
        sc2.a8 a8Var = this.f487956a;
        a8Var.D = true;
        java.lang.String className = (intent == null || (component = intent.getComponent()) == null) ? null : component.getClassName();
        if (className == null || (s0Var = a8Var.B) == null) {
            return false;
        }
        a8Var.T6(s0Var, new sc2.x7(className));
        return false;
    }
}
