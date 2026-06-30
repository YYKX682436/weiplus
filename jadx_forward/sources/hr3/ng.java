package hr3;

/* loaded from: classes11.dex */
public class ng implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 f365375d;

    public ng(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9) {
        this.f365375d = activityC16871x34c232c9;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = this.f365375d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = activityC16871x34c232c9.J1;
        if (j0Var != null) {
            j0Var.dismiss();
            activityC16871x34c232c9.J1 = null;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new hr3.mg(this), false).c(500L, 500L);
    }
}
