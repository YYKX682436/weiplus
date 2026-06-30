package bi2;

/* loaded from: classes10.dex */
public final class d extends bi2.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // bi2.a, gi2.e
    public android.view.View f(xh2.a data, int i17) {
        android.view.View dVar;
        kotlin.jvm.internal.o.g(data, "data");
        lj2.x0 x0Var = this.f272271e;
        lj2.v0 v0Var = this.f272270d;
        android.content.Context context = this.f272269c;
        if (i17 == 1) {
            dVar = new di2.d(context, v0Var, x0Var, true);
        } else if (i17 == 2) {
            dVar = new di2.j(context, v0Var, x0Var, true);
        } else {
            if (i17 != 3) {
                return new android.view.View(context);
            }
            dVar = new di2.e(context, v0Var, x0Var, true);
        }
        return dVar;
    }
}
