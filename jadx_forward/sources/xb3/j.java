package xb3;

/* loaded from: classes9.dex */
public class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c f534438d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c) {
        this.f534438d = activityC16335x1879211c;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c = this.f534438d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16335x1879211c.f226680u;
        if (u3Var != null && u3Var.isShowing()) {
            activityC16335x1879211c.f226680u.dismiss();
        }
        activityC16335x1879211c.A.j();
        activityC16335x1879211c.finish();
    }
}
