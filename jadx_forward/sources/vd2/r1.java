package vd2;

/* loaded from: classes3.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.s1 f517407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f517408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f517409f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(vd2.s1 s1Var, boolean z17, android.content.Context context) {
        super(0);
        this.f517407d = s1Var;
        this.f517408e = z17;
        this.f517409f = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vd2.s1 s1Var = this.f517407d;
        if (((java.util.ArrayList) s1Var.f517441n).size() >= 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f517440m, "checkProduceVisitorView: do not need to produce, view size = " + ((java.util.ArrayList) s1Var.f517441n).size());
        } else {
            boolean z17 = this.f517408e;
            android.content.Context context = this.f517409f;
            if (z17) {
                pm0.v.V(0L, new vd2.q1(s1Var, context));
            } else {
                vd2.s1.x(s1Var, context);
            }
        }
        return jz5.f0.f384359a;
    }
}
