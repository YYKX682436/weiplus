package s65;

/* loaded from: classes11.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b f484972d;

    public d(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b activityC20971xf3908b5b) {
        this.f484972d = activityC20971xf3908b5b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b activityC20971xf3908b5b = this.f484972d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC20971xf3908b5b.f273843e;
        if (j0Var != null && j0Var.isShowing()) {
            activityC20971xf3908b5b.f273843e.dismiss();
        }
        s65.w0.f485058a.l(2, true);
        if (activityC20971xf3908b5b.f273847i == 2) {
            s65.o0.g(activityC20971xf3908b5b, 4, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 74L, 1L, true);
        s65.o0.e();
        activityC20971xf3908b5b.finish();
    }
}
