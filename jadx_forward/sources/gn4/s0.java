package gn4;

/* loaded from: classes9.dex */
public class s0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 f355186d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.fs.ActivityC18757xb5c40a02 activityC18757xb5c40a02) {
        this.f355186d = activityC18757xb5c40a02;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f355186d.finish();
    }
}
