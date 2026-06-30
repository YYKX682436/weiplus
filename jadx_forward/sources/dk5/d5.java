package dk5;

/* loaded from: classes9.dex */
public class d5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f316125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316126e;

    public d5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, java.lang.Object obj) {
        this.f316126e = activityC22573x19a79d99;
        this.f316125d = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3 c3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3) this.f316125d;
        c3Var.f270799t = true;
        c3Var.interrupt();
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316126e;
        activityC22573x19a79d99.setResult(-1);
        activityC22573x19a79d99.finish();
    }
}
