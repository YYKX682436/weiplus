package p61;

/* loaded from: classes8.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e f433864d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e) {
        this.f433864d = activityC11358x5a6f125e;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e activityC11358x5a6f125e = this.f433864d;
        activityC11358x5a6f125e.f154471p = true;
        if (activityC11358x5a6f125e.f154470o != null) {
            gm0.j1.d().d(activityC11358x5a6f125e.f154470o);
        }
    }
}
