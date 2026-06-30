package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class n3 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e f198030a;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e c14304xa96e914e) {
        this.f198030a = c14304xa96e914e;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonView, "buttonView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e c14304xa96e914e = this.f198030a;
        c14304xa96e914e.f197361g = z17;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = c14304xa96e914e.f197360f;
            if (z2Var != null) {
                z2Var.x(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomDialog");
                throw null;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = c14304xa96e914e.f197360f;
        if (z2Var2 != null) {
            z2Var2.x(1);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomDialog");
            throw null;
        }
    }
}
