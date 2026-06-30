package fn4;

/* loaded from: classes15.dex */
public class w0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f346149d;

    public w0(boolean[] zArr) {
        this.f346149d = zArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f346149d[0] = true;
    }
}
