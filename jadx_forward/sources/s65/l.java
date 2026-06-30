package s65;

/* loaded from: classes11.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c f485022d;

    public l(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c) {
        this.f485022d = activityC20972xfb8eac1c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20972xfb8eac1c activityC20972xfb8eac1c = this.f485022d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC20972xfb8eac1c.f273850e;
        if (j0Var == null || j0Var.isShowing()) {
            return;
        }
        activityC20972xfb8eac1c.f273850e.show();
    }
}
