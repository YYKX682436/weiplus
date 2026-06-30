package dg5;

/* loaded from: classes9.dex */
public class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.u f313926d;

    public q(dg5.u uVar) {
        this.f313926d = uVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f313926d.f313937g = true;
    }
}
