package j35;

/* loaded from: classes13.dex */
public class m implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f379047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j35.b0 f379048b;

    public m(android.app.Activity activity, j35.b0 b0Var) {
        this.f379047a = activity;
        this.f379048b = b0Var;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f379047a.onRequestPermissionsResult(i17, strArr, iArr);
        j35.b0 b0Var = this.f379048b;
        if (b0Var != null) {
            b0Var.mo2413x953457f1(i17, strArr, iArr);
        }
    }
}
