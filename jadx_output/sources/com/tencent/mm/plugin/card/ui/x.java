package com.tencent.mm.plugin.card.ui;

/* loaded from: classes3.dex */
public class x implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.a0 f95433d;

    public x(com.tencent.mm.plugin.card.ui.a0 a0Var) {
        this.f95433d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.card.ui.a0 a0Var = this.f95433d;
        return ((android.widget.TextView) a0Var.findViewById(com.tencent.mm.R.id.a1o)).getText().toString() + ' ' + ((android.widget.TextView) a0Var.findViewById(com.tencent.mm.R.id.bcg)).getText().toString() + ' ' + ((android.widget.TextView) a0Var.findViewById(com.tencent.mm.R.id.c0u)).getText().toString();
    }
}
