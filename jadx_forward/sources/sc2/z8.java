package sc2;

/* loaded from: classes2.dex */
public final class z8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.a9 f487957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f487958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(sc2.a9 a9Var, android.content.Context context) {
        super(0);
        this.f487957d = a9Var;
        this.f487958e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        sc2.a9 a9Var = this.f487957d;
        boolean z17 = a9Var.f487304d;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (z17) {
            android.app.Dialog dialog = a9Var.f487303c;
            if (dialog != null) {
                dialog.show();
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                android.content.Context context = this.f487958e;
                a9Var.f487303c = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, sc2.y8.f487930d);
            }
        }
        return f0Var2;
    }
}
