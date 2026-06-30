package dk5;

/* loaded from: classes9.dex */
public class h1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3 f316180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 f316181e;

    public h1(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3 c3Var) {
        this.f316181e = activityC22567x42e895b8;
        this.f316180d = c3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3 c3Var = this.f316180d;
        c3Var.f270799t = true;
        c3Var.interrupt();
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8 = this.f316181e;
        activityC22567x42e895b8.C1 = true;
        activityC22567x42e895b8.finish();
    }
}
