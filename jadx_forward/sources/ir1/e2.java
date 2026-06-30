package ir1;

/* loaded from: classes11.dex */
public final class e2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 f375501d;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 activityC12973x51f8d2d1) {
        this.f375501d = activityC12973x51f8d2d1;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f375501d.finish();
    }
}
