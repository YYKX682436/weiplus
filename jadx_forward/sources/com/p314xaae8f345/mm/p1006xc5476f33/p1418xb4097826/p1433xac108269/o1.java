package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class o1 {
    public o1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.aeh, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
        android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f566413ft3);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(str2);
        android.widget.TextView textView2 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.g4e);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView2.setText(str);
        }
        android.widget.Button button = (android.widget.Button) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.khs);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            button.setText(str3);
        }
        android.widget.Button button2 = (android.widget.Button) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            button2.setText(str4);
        }
        c22646x1e9ca55.b(com.p314xaae8f345.mm.ui.zk.a(context, 12), com.p314xaae8f345.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k1(k0Var, onClickListener));
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l1(k0Var, onClickListener2));
        k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m1(onDismissListener);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n1(k0Var, c22646x1e9ca55);
        k0Var.e(true);
        k0Var.v();
        return k0Var;
    }
}
