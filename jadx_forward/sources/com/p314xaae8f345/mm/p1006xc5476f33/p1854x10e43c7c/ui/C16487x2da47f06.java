package com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui;

/* renamed from: com.tencent.mm.plugin.masssend.ui.MassSendLayout */
/* loaded from: classes5.dex */
public class C16487x2da47f06 extends com.p314xaae8f345.mm.ui.AbstractC21349xd8ee3415 {

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f230069n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f230070o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.j5 f230071p;

    public C16487x2da47f06(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f230071p = new kf3.c1(this);
        ((android.app.Activity) context).getWindow().setSoftInputMode(32);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractC21349xd8ee3415
    /* renamed from: getPanelView */
    public java.util.List<android.view.View> mo66217xa7118813() {
        return new java.util.ArrayList();
    }

    /* renamed from: setChatFooter */
    public void m66587xa3015915(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f230070o = c19666xfd6e2f33;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.j5 j5Var = this.f230071p;
        if (j5Var == null) {
            c19666xfd6e2f33.getClass();
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) c19666xfd6e2f33.J1;
        if (linkedList.contains(j5Var)) {
            return;
        }
        linkedList.add(j5Var);
    }

    /* renamed from: setPanel */
    public void m66588x5383cac2(android.view.View view) {
        this.f230069n = view;
    }

    public C16487x2da47f06(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230071p = new kf3.c1(this);
        ((android.app.Activity) context).getWindow().setSoftInputMode(32);
    }
}
