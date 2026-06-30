package y80;

/* loaded from: classes10.dex */
public final class h0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80.k0 f541387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f541388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f541389c;

    public h0(y80.k0 k0Var, long j17, yz5.l lVar) {
        this.f541387a = k0Var;
        this.f541388b = j17;
        this.f541389c = lVar;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iArr);
        boolean z17 = ((iArr.length == 0) ^ true) && iArr[0] == 0;
        y80.k0 k0Var = this.f541387a;
        yz5.l lVar = this.f541389c;
        if (z17) {
            k0Var.wi(this.f541388b, lVar);
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f541405d, "systemPermissionReqCallback: success=" + z17 + ", " + strArr.length + ", ");
    }
}
