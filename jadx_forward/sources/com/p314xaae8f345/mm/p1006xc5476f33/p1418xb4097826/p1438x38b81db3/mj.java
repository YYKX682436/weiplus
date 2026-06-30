package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class mj implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f185539d;

    public mj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar) {
        this.f185539d = ojVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f185539d;
        int i17 = ojVar.f185723o;
        if (i17 <= 0) {
            return false;
        }
        int i18 = i17 - 1;
        ojVar.f185723o = i18;
        android.widget.TextView textView = ojVar.f185724p;
        if (textView != null) {
            textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572816cm1, java.lang.Integer.valueOf(i18)));
        }
        if (ojVar.f185723o == 0) {
            yz5.l lVar = ojVar.f185716e;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Integer.valueOf(ojVar.f185729u));
            }
            ojVar.C();
        }
        return true;
    }
}
