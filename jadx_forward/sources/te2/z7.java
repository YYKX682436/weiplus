package te2;

/* loaded from: classes3.dex */
public final class z7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f500099d;

    public z7(p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        this.f500099d = r2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeUIC", "REQUEST_CODE_CROP_IMAGE user cancel upload");
        p3325xe03a0797.p3326xc267989b.p2.a(this.f500099d, null, 1, null);
    }
}
