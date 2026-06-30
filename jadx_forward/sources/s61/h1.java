package s61;

/* loaded from: classes5.dex */
public class h1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s61.m1 f484889d;

    public h1(s61.m1 m1Var) {
        this.f484889d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f484889d.f484904e = true;
    }
}
