package j35;

/* loaded from: classes13.dex */
public class l implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f379045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j35.b0 f379046b;

    public l(android.app.Activity activity, j35.b0 b0Var) {
        this.f379045a = activity;
        this.f379046b = b0Var;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f379045a.onRequestPermissionsResult(i17, strArr, iArr);
        j35.b0 b0Var = this.f379046b;
        if (b0Var != null) {
            b0Var.mo2413x953457f1(i17, strArr, iArr);
        }
    }
}
