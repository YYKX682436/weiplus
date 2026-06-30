package j20;

/* loaded from: classes.dex */
public final class c implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378753a;

    public c(yz5.l lVar) {
        this.f378753a = lVar;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 == 157) {
            boolean z17 = false;
            if (iArr != null && iArr[0] == 0) {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPoiPermission", "granted:" + z17);
            yz5.l lVar = this.f378753a;
            if (z17) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            } else {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
    }
}
