package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class zq implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mr f202139d;

    public zq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mr mrVar) {
        this.f202139d = mrVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj;
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(valueOf, t4Var);
        java.lang.String str = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mr mrVar = this.f202139d;
        if (e17 > 32) {
            java.lang.String h17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.h(valueOf, 32);
            if (editable != null) {
                try {
                    editable.replace(h17.length(), valueOf.length(), "");
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mrVar.I, "etDesc replace: " + e18.getMessage());
                }
            }
        }
        if (editable != null && (obj = editable.toString()) != null) {
            str = obj;
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) mrVar.H.a(mm2.g1.class)).f410609q).k(str);
        mrVar.f200645x0 = str;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mrVar.N;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdt");
            throw null;
        }
        android.widget.TextView textView = mrVar.P;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdtTips");
            throw null;
        }
        mrVar.getClass();
        ck5.f b17 = ck5.f.b(c22621x7603e017);
        b17.f124094f = 0;
        b17.f124093e = 32;
        b17.f124095g = t4Var;
        b17.f124089a = true;
        b17.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xq(textView, 32));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(java.lang.String.valueOf(charSequence), com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2);
        boolean z17 = false;
        if (!(charSequence == null || charSequence.length() == 0) && e17 <= 32) {
            z17 = true;
        }
        this.f202139d.f0(z17);
    }
}
