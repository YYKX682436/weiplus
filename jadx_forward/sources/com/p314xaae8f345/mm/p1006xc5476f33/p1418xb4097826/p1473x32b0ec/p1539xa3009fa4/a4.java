package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class a4 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b4 f198429d;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b4 b4Var) {
        this.f198429d = b4Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b4 b4Var = this.f198429d;
        int i17 = b4Var.f198457h;
        if (i17 > 0) {
            b4Var.f198457h = i17 - 1;
            android.widget.TextView textView = b4Var.f198455f;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = b4Var.f198455f;
            if (textView2 != null) {
                textView2.setText(java.lang.String.valueOf(b4Var.f198457h));
            }
            return true;
        }
        yz5.l lVar = b4Var.f198453d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        az2.f fVar = b4Var.f198456g;
        if (fVar != null) {
            fVar.a();
        }
        android.widget.TextView textView3 = b4Var.f198455f;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        android.widget.Button button = b4Var.f198454e;
        if (button == null) {
            return false;
        }
        button.setVisibility(8);
        return false;
    }
}
