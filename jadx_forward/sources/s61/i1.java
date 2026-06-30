package s61;

/* loaded from: classes5.dex */
public class i1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s61.m1 f484892d;

    public i1(s61.m1 m1Var) {
        this.f484892d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f484892d.f484904e = true;
    }
}
