package iy2;

/* loaded from: classes11.dex */
public final class x implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a f377445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f377446b;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var) {
        this.f377445a = c15489x5c3b8a7a;
        this.f377446b = u1Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup group, int i17) {
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(group, "group");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = this.f377445a;
        c15489x5c3b8a7a.A = i17;
        android.widget.TextView textView = c15489x5c3b8a7a.f218301i;
        if (textView != null) {
            java.lang.String str = (java.lang.String) kz5.n0.a0(c15489x5c3b8a7a.B, i17);
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        if (c15489x5c3b8a7a.f218297e != null && (num = (java.lang.Integer) kz5.n0.a0(c15489x5c3b8a7a.C, c15489x5c3b8a7a.A)) != null) {
            int intValue = num.intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974 = c15489x5c3b8a7a.f218297e;
            if (c15487x24678974 != null) {
                c15487x24678974.m63301x16568cca(intValue);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f377446b.f293531c;
        if (j0Var != null) {
            j0Var.dismiss();
        }
    }
}
