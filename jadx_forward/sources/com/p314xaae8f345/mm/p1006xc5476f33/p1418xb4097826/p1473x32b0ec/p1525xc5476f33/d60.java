package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class d60 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f193767d;

    public d60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var) {
        this.f193767d = r60Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        jz5.f0 f0Var;
        df2.pv pvVar;
        cm2.t I2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 C1;
        byte[] bArr = (byte[]) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f193767d;
        if (bArr == null || (I2 = zl2.r4.f555483a.I2(bArr)) == null || (C1 = r60Var.C1(I2)) == null) {
            f0Var = null;
        } else {
            C1.l(I2);
            r60Var.F1(null);
            r60Var.y1(C1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = r60Var.f195634v;
            if (ep0Var != null) {
                ep0Var.l0();
            }
            android.view.ViewGroup viewGroup = r60Var.f195638z;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("localBubbleContainer");
                throw null;
            }
            viewGroup.removeAllViews();
            viewGroup.addView(C1.mo56902xfb86a31b());
            viewGroup.setVisibility(0);
            android.widget.ScrollView scrollView = r60Var.f195636x;
            if (scrollView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainerScrollView");
                throw null;
            }
            scrollView.setVisibility(8);
            df2.pv pvVar2 = (df2.pv) r60Var.U0(df2.pv.class);
            if (pvVar2 != null) {
                pvVar2.d7(r60Var);
            }
            r60Var.f195634v = C1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(r60Var, null, r60Var.f195631s, false, 4, null);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            android.view.ViewGroup viewGroup2 = r60Var.f195638z;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("localBubbleContainer");
                throw null;
            }
            viewGroup2.removeAllViews();
            android.view.ViewGroup viewGroup3 = r60Var.f195638z;
            if (viewGroup3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("localBubbleContainer");
                throw null;
            }
            viewGroup3.setVisibility(8);
            android.widget.ScrollView scrollView2 = r60Var.f195636x;
            if (scrollView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainerScrollView");
                throw null;
            }
            scrollView2.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var2 = r60Var.f195634v;
            if (ep0Var2 != null) {
                ep0Var2.l0();
            }
            if (r60Var.f195633u == null && (pvVar = (df2.pv) r60Var.U0(df2.pv.class)) != null) {
                pvVar.b7(r60Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(r60Var, null, r60Var.f195631s, false, 4, null);
        }
    }
}
