package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes.dex */
public abstract class h4 {
    public static final void a(android.content.Context context, yz5.a onAccepted, yz5.a onRejected) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAccepted, "onAccepted");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onRejected, "onRejected");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 0, 0, false);
        z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.a4_);
        z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.lss).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.f4(c17, z2Var, onRejected));
        z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f563869bq).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g4(c17, z2Var, onAccepted));
        android.widget.TextView textView = (android.widget.TextView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.l5i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("zh_CN", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(context))) {
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iob);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            arrayList.add(string);
        } else {
            java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ioa);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            arrayList.add(string2);
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).sj(context, arrayList, textView.getText().toString(), kz5.c0.k(textView.getText().toString()), textView);
        z2Var.C();
    }
}
