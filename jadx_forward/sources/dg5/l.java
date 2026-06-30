package dg5;

/* loaded from: classes11.dex */
public class l implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.n f313911d;

    public l(dg5.n nVar) {
        this.f313911d = nVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f313911d.f313913d.finish();
    }
}
