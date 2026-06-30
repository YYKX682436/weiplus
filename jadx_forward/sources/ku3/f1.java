package ku3;

/* loaded from: classes.dex */
public final class f1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 f393760d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47) {
        this.f393760d = c17028xc20c4c47;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.content.Context context = this.f393760d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
    }
}
