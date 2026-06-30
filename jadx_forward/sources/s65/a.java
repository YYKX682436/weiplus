package s65;

/* loaded from: classes11.dex */
public class a implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b f484963d;

    public a(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b activityC20971xf3908b5b) {
        this.f484963d = activityC20971xf3908b5b;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b activityC20971xf3908b5b = this.f484963d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC20971xf3908b5b.f273843e;
        if (j0Var != null && j0Var.isShowing()) {
            activityC20971xf3908b5b.f273843e.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = activityC20971xf3908b5b.f273844f;
        if (j0Var2 == null || !j0Var2.isShowing()) {
            activityC20971xf3908b5b.f273844f = db5.e1.k(activityC20971xf3908b5b, com.p314xaae8f345.mm.R.C30867xcad56011.aq_, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.R.C30867xcad56011.aqa, com.p314xaae8f345.mm.R.C30867xcad56011.bkw, false, new s65.d(activityC20971xf3908b5b), new s65.e(activityC20971xf3908b5b));
        }
    }
}
