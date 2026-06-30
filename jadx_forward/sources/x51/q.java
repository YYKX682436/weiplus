package x51;

/* loaded from: classes11.dex */
public class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f533607d;

    public q(x51.r rVar, android.app.Activity activity) {
        this.f533607d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f533607d.finish();
    }
}
