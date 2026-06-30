package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class t0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 f183482a;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var) {
        this.f183482a = c1Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton view, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var = this.f183482a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c1Var.f183376e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameEdit");
            throw null;
        }
        android.text.Editable text = c22621x7603e017.getText();
        int length = text != null ? text.length() : 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c1Var.f183377f;
        if (c22621x7603e0172 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdit");
            throw null;
        }
        android.text.Editable text2 = c22621x7603e0172.getText();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1.Q6(c1Var, length, text2 != null ? text2.length() : 0);
    }
}
