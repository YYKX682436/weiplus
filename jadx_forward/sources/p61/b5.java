package p61;

/* loaded from: classes14.dex */
public class b5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.f5 f433756d;

    public b5(p61.f5 f5Var) {
        this.f433756d = f5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        p61.f5 f5Var = this.f433756d;
        com.p314xaae8f345.mm.p957x53236a1b.l1 l1Var = new com.p314xaae8f345.mm.p957x53236a1b.l1(5, f5Var.f433788h, f5Var.f433787g.m78856x8dcccb06(), f5Var.f433787g.m78854x2bc566b5(), f5Var.f433787g.m78855x1761a082(), true, 1);
        gm0.j1.d().a(384, f5Var);
        gm0.j1.d().g(l1Var);
        android.content.Context context = f5Var.f433784d;
        f5Var.f433786f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gic), true, true, new p61.a5(this, l1Var));
    }
}
