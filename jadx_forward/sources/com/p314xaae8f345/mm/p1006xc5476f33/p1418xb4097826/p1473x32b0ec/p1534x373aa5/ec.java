package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class ec implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc f197814d;

    public ec(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar) {
        this.f197814d = mcVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.widget.TextView textView = (android.widget.TextView) this.f197814d.f198019d.findViewById(com.p314xaae8f345.mm.R.id.f565599cw1);
        if (textView != null) {
            java.lang.String string = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573305nu5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{no0.l.a(no0.m.f420263a, intValue, ":", false, false, false, 24, null)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            textView.setText(format);
        }
        return jz5.f0.f384359a;
    }
}
