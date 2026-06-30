package o25;

/* loaded from: classes5.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f424087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f424088e;

    public l1(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, android.view.View view) {
        this.f424087d = activityC21401x6ce6f73f;
        this.f424088e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f424087d;
        activityC21401x6ce6f73f.getWindow().getDecorView().setSystemUiVisibility(activityC21401x6ce6f73f.getWindow().getDecorView().getSystemUiVisibility() | 256);
        int c17 = fp.a.c(activityC21401x6ce6f73f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to contentView, height: %s", java.lang.Integer.valueOf(c17));
        android.view.View view = this.f424088e;
        if (view != null) {
            view.setPadding(0, c17, 0, 0);
        }
    }
}
