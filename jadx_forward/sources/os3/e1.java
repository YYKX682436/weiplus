package os3;

/* loaded from: classes11.dex */
public class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.j1 f429596d;

    public e1(os3.j1 j1Var) {
        this.f429596d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os3.j1 j1Var = this.f429596d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j1Var.d())) {
            j1Var.e(false, null);
            j1Var.f();
        } else {
            android.content.Context context = j1Var.f429645d;
            j1Var.f429651m = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, false, null);
            gm0.j1.d().g(new ks3.g0());
        }
    }
}
