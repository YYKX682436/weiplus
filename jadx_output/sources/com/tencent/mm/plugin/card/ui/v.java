package com.tencent.mm.plugin.card.ui;

/* loaded from: classes3.dex */
public class v implements yz5.l {
    public v(com.tencent.mm.plugin.card.ui.a0 a0Var) {
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        return ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mg9)).getText().toString() + ' ' + ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mg6)).getText().toString();
    }
}
