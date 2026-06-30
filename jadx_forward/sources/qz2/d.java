package qz2;

/* loaded from: classes9.dex */
public class d implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a f449383d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a) {
        this.f449383d = activityC15523xe4f09a5a;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a.f218527s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a = this.f449383d;
        activityC15523xe4f09a5a.c7();
        activityC15523xe4f09a5a.finish();
    }
}
