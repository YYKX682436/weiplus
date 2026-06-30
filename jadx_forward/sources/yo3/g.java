package yo3;

/* loaded from: classes9.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f545681d;

    public g(android.app.Activity activity) {
        this.f545681d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yo3.m.a();
        android.app.Activity activity = this.f545681d;
        yo3.m.b(activity, -1);
        activity.finish();
    }
}
