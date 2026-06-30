package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class o1 {
    public o1(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.ui.widget.dialog.k0 a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2, android.content.DialogInterface.OnDismissListener onDismissListener) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.aeh, null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
        android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484880ft3);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(str2);
        android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.g4e);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView2.setText(str);
        }
        android.widget.Button button = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            button.setText(str3);
        }
        android.widget.Button button2 = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            button2.setText(str4);
        }
        roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(context, 12), com.tencent.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
        button.setOnClickListener(new com.tencent.mm.plugin.finder.assist.k1(k0Var, onClickListener));
        button2.setOnClickListener(new com.tencent.mm.plugin.finder.assist.l1(k0Var, onClickListener2));
        k0Var.f211854d = new com.tencent.mm.plugin.finder.assist.m1(onDismissListener);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.assist.n1(k0Var, roundedCornerFrameLayout);
        k0Var.e(true);
        k0Var.v();
        return k0Var;
    }
}
