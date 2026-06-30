package or1;

/* loaded from: classes9.dex */
public class r0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f429096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ or1.s0 f429097f;

    public r0(or1.s0 s0Var, java.lang.String str, android.content.Context context) {
        this.f429097f = s0Var;
        this.f429095d = str;
        this.f429096e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        er3.f fVar = new er3.f(this.f429095d, true);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        or1.s0 s0Var = this.f429097f;
        d17.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.q0.f34310x366c91de, s0Var);
        gm0.j1.d().g(fVar);
        android.content.Context context = this.f429096e;
        s0Var.f429102f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f429096e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new or1.q0(this, fVar));
    }
}
