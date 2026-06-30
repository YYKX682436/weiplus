package o25;

/* loaded from: classes.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f424090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f424091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f424092f;

    public m1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, int i17, android.view.View view) {
        this.f424090d = activityC0065xcd7aa112;
        this.f424091e = i17;
        this.f424092f = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f424090d;
        activityC0065xcd7aa112.getWindow().getDecorView().setSystemUiVisibility(activityC0065xcd7aa112.getWindow().getDecorView().getSystemUiVisibility() | 256);
        int i17 = this.f424091e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to contentView, height: %s", java.lang.Integer.valueOf(i17));
        android.view.View view = this.f424092f;
        if (view != null) {
            view.setPadding(0, i17, 0, 0);
        }
    }
}
