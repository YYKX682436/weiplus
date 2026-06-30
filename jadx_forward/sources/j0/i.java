package j0;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f377858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f377859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f377860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.l lVar, n0.v2 v2Var, n0.v2 v2Var2) {
        super(1);
        this.f377858d = lVar;
        this.f377859e = v2Var;
        this.f377860f = v2Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g2.e0 newTextFieldValueState = (g2.e0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newTextFieldValueState, "newTextFieldValueState");
        this.f377859e.mo148714x53d8522f(newTextFieldValueState);
        n0.v2 v2Var = this.f377860f;
        java.lang.String str = (java.lang.String) v2Var.mo128745x754a37bb();
        a2.d dVar = newTextFieldValueState.f349226a;
        boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, dVar.f82214d);
        java.lang.String str2 = dVar.f82214d;
        v2Var.mo148714x53d8522f(str2);
        if (z17) {
            this.f377858d.mo146xb9724478(str2);
        }
        return jz5.f0.f384359a;
    }
}
