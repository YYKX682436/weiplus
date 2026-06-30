package yf;

/* loaded from: classes7.dex */
public class p0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f542963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f542964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542965f;

    public p0(yf.i0 i0Var, android.app.Activity activity, sf.f fVar) {
        this.f542965f = i0Var;
        this.f542963d = activity;
        this.f542964e = fVar;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        yf.i0 i0Var = this.f542965f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "onRequestPermissionsResult callback, requestCode:%d", java.lang.Integer.valueOf(i17));
        sf.f fVar = this.f542964e;
        if (i17 == 118) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "onRequestPermissionsResult callback, microphone permission not grant");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
                fVar.a(jc1.g.f380475n);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new yf.o0(this), 50L);
            }
        }
        si1.e1.b(fVar.mo50271x74292566(), this);
    }
}
