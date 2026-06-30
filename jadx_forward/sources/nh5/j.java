package nh5;

/* loaded from: classes10.dex */
public final class j implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI f418686d;

    public j(com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI) {
        this.f418686d = matrixBaseLeakResultUI;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI = this.f418686d;
        sb6.append(matrixBaseLeakResultUI.d);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI2 = this.f418686d;
        if (matrixBaseLeakResultUI2.d <= 0) {
            sb7 = "";
        }
        matrixBaseLeakResultUI2.m78494xd9193382(1, matrixBaseLeakResultUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) + sb7, new nh5.i(matrixBaseLeakResultUI), null, matrixBaseLeakResultUI.d <= 0 ? com.p314xaae8f345.mm.ui.fb.GREEN : com.p314xaae8f345.mm.ui.fb.NORMAL);
        int i17 = matrixBaseLeakResultUI.d - 1;
        matrixBaseLeakResultUI.d = i17;
        return i17 >= 0;
    }
}
