package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes4.dex */
public final class m2 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 {
    public final android.content.Context L;
    public boolean M;
    public java.lang.String N;
    public int P;
    public java.lang.String Q;
    public java.lang.String R;
    public yz5.a S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(android.content.Context context, int i17, int i18, boolean z17) {
        super(context, i17, i18, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.L = context;
        this.N = "";
    }

    public final java.lang.String D() {
        java.lang.String str = this.Q;
        if (str != null) {
            if (str.length() > 0) {
                return str;
            }
        }
        int i17 = this.P;
        android.content.Context context = this.L;
        if (i17 == 1) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.msq);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (i17 == 2) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.msp);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 != 3) {
            return "";
        }
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mso);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        return string3;
    }
}
