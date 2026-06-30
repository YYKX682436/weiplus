package zs4;

/* loaded from: classes9.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f556829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f556830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f556831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f556832g;

    public k(boolean z17, android.app.Activity activity, int i17, int i18) {
        this.f556829d = z17;
        this.f556830e = activity;
        this.f556831f = i17;
        this.f556832g = i18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (this.f556829d) {
            this.f556830e.finish();
        }
        dialogInterface.dismiss();
        int i18 = this.f556831f;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(i18 == 1 ? 8 : i18 == 2 ? 11 : 0, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), this.f556832g);
    }
}
