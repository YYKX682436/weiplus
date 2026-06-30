package s65;

/* loaded from: classes11.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c f485019d;

    public k(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c) {
        this.f485019d = activityC20972xfb8eac1c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = this.f485019d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC20972xfb8eac1c.f273850e;
        if (j0Var != null && j0Var.isShowing()) {
            activityC20972xfb8eac1c.f273850e.dismiss();
        }
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c.Q6(activityC20972xfb8eac1c, 6);
        if (activityC20972xfb8eac1c.f273852g.f485080u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 59L, 1L, true);
        }
        activityC20972xfb8eac1c.f273852g.k();
        activityC20972xfb8eac1c.f273852g.l(2, true);
        activityC20972xfb8eac1c.R6();
    }
}
