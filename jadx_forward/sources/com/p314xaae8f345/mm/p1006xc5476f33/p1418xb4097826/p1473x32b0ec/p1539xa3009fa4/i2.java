package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class i2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2 f198670d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2 k2Var) {
        this.f198670d = k2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2 k2Var = this.f198670d;
        int i17 = k2Var.f198710e - 1;
        k2Var.f198710e = i17;
        android.widget.Button button = k2Var.f198714i;
        if (button != null) {
            button.setText(i17 <= 0 ? k2Var.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5q) : k2Var.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5p, java.lang.Integer.valueOf(k2Var.f198710e)));
        }
        if (k2Var.f198710e > 0) {
            return true;
        }
        android.widget.Button button2 = k2Var.f198714i;
        if (button2 == null) {
            return false;
        }
        button2.setEnabled(true);
        return false;
    }
}
