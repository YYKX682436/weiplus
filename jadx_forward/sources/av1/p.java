package av1;

/* loaded from: classes3.dex */
public final class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a f95722d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1316x2e7b3f.ui.ActivityC13090x679cb21a activityC13090x679cb21a) {
        this.f95722d = activityC13090x679cb21a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f95722d.finish();
    }
}
