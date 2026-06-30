package dl4;

/* loaded from: classes3.dex */
public final class f0 implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f316929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.x f316930d;

    public f0(android.view.View view, java.lang.String str, dl4.m0 m0Var, ff0.x xVar) {
        this.f316927a = view;
        this.f316928b = str;
        this.f316929c = m0Var;
        this.f316930d = xVar;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        android.view.View view = this.f316927a;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view != null ? view.getTag(com.p314xaae8f345.mm.R.id.o9n) : null, this.f316928b);
        ff0.x xVar = this.f316930d;
        if (!b17) {
            if (xVar != null) {
                xVar.a(null);
            }
        } else {
            dl4.m0 m0Var = this.f316929c;
            m0Var.getClass();
            pm0.v.X(new dl4.k0(zVar, view, m0Var));
            if (xVar != null) {
                xVar.a(zVar);
            }
        }
    }
}
