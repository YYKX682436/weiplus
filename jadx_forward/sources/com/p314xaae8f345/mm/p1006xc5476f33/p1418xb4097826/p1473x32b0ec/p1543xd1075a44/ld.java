package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ld implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 f200459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f200460e;

    public ld(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f2, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        this.f200459d = c14396x9309a8f2;
        this.f200460e = c22621x7603e017;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f2 = this.f200459d;
        int i17 = c14396x9309a8f2.f199142i ? 200 : 120;
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(valueOf, t4Var) > i17) {
            java.lang.String h17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.h(valueOf, i17);
            if (editable != null) {
                try {
                    editable.replace(h17.length(), valueOf.length(), "");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveDescEditView", "etDesc replace: " + e17.getMessage());
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 this_apply = this.f200460e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this_apply, "$this_apply");
        android.widget.TextView liveDescTextCountTipsTv = c14396x9309a8f2.f199141h.f343788i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveDescTextCountTipsTv, "liveDescTextCountTipsTv");
        ck5.f b17 = ck5.f.b(this_apply);
        b17.f124094f = 0;
        b17.f124093e = i17;
        b17.f124095g = t4Var;
        b17.f124089a = true;
        b17.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jd(liveDescTextCountTipsTv, i17));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
