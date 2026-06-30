package kf3;

/* loaded from: classes5.dex */
public class z1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kf3.a2 f389002e;

    public z1(kf3.a2 a2Var, java.lang.String str) {
        this.f389002e = a2Var;
        this.f389001d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImage_OutputPath", this.f389001d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679 activityC16488xbf7e6679 = this.f389002e.f388851d;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16488xbf7e6679.f230072v;
        activityC16488xbf7e6679.V6(intent);
    }
}
