package yo3;

/* loaded from: classes4.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f545682d;

    public h(android.app.Activity activity) {
        this.f545682d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f545682d.finish();
    }
}
