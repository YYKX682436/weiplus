package yf;

/* loaded from: classes7.dex */
public class n0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f542956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f542957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542958f;

    public n0(yf.i0 i0Var, android.app.Activity activity, sf.f fVar) {
        this.f542958f = i0Var;
        this.f542956d = activity;
        this.f542957e = fVar;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        yf.i0 i0Var = this.f542958f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "onRequestPermissionsResult callback, requestCode:%d", java.lang.Integer.valueOf(i17));
        sf.f fVar = this.f542957e;
        if (i17 == 117) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "onRequestPermissionsResult callback, camera permission not grant");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
                fVar.a(jc1.g.f380475n);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new yf.m0(this), 50L);
            }
        }
        si1.e1.b(fVar.mo50271x74292566(), this);
    }
}
