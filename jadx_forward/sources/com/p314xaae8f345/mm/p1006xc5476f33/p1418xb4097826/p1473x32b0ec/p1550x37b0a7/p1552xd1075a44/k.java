package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes10.dex */
public final class k implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.m f202255d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.m mVar) {
        this.f202255d = mVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractionWishContract.ViewCallback", "performanceName afterTextChanged called s:" + ((java.lang.Object) editable));
        int length = str.length();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.m mVar = this.f202255d;
        if (length <= 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i iVar = mVar.f202267g;
            iVar.getClass();
            iVar.f202243f = str;
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = mVar.f202269i;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("performanceNameEditText");
            throw null;
        }
        java.lang.String substring = str.substring(0, 4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        c22621x7603e017.setText(substring);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = mVar.f202269i;
        if (c22621x7603e0172 != null) {
            c22621x7603e0172.mo81549xf579a34a(4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("performanceNameEditText");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractionWishContract.ViewCallback", "performanceName beforeTextChanged called s:" + ((java.lang.Object) charSequence));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        android.widget.TextView textView = this.f202255d.f202273p;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("performanceNameInvalidDesc");
            throw null;
        }
    }
}
