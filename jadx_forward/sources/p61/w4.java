package p61;

/* loaded from: classes14.dex */
public class w4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f433938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p61.f5 f433939e;

    public w4(p61.f5 f5Var, android.widget.EditText editText) {
        this.f433939e = f5Var;
        this.f433938d = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        p61.f5 f5Var = this.f433939e;
        f5Var.getClass();
        java.lang.String trim = this.f433938d.getText().toString().trim();
        gm0.j1.d().a(384, f5Var);
        f5Var.f433788h = trim;
        android.content.Context context = f5Var.f433784d;
        f5Var.f433786f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new p61.y4(f5Var));
        gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.l1(5, f5Var.f433788h, "", "", "", false, 1));
    }
}
