package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes.dex */
public abstract class h4 {
    public static final void a(android.content.Context context, yz5.a onAccepted, yz5.a onRejected) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onAccepted, "onAccepted");
        kotlin.jvm.internal.o.g(onRejected, "onRejected");
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 0, 0, false);
        z2Var.i(com.tencent.mm.R.layout.a4_);
        z2Var.f212058g.findViewById(com.tencent.mm.R.id.lss).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.f4(c17, z2Var, onRejected));
        z2Var.f212058g.findViewById(com.tencent.mm.R.id.f482336bq).setOnClickListener(new com.tencent.mm.plugin.emoji.ui.g4(c17, z2Var, onAccepted));
        android.widget.TextView textView = (android.widget.TextView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.l5i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (kotlin.jvm.internal.o.b("zh_CN", com.tencent.mm.sdk.platformtools.m2.f(context))) {
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.iob);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            arrayList.add(string);
        } else {
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.ioa);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            arrayList.add(string2);
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).sj(context, arrayList, textView.getText().toString(), kz5.c0.k(textView.getText().toString()), textView);
        z2Var.C();
    }
}
