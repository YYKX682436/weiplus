package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class gm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f280648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.im f280649e;

    public gm(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.im imVar, java.lang.Boolean bool) {
        this.f280649e = imVar;
        this.f280648d = bool;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/TipsBubbleComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean booleanValue = this.f280648d.booleanValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.im imVar = this.f280649e;
        if (booleanValue) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            imVar.m0(bool, bool);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) imVar.f280113d.f542241c.a(sb5.s0.class))).f280796e.v(null);
        } else {
            imVar.m0(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) imVar.f280113d.f542241c.a(sb5.s0.class))).f280796e.m75502x764d6925(2);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/TipsBubbleComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
