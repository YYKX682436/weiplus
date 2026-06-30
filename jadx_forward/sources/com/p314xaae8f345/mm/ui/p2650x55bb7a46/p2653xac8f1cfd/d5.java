package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 f280457d;

    public d5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var) {
        this.f280457d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = this.f280457d;
        sb5.z zVar = (sb5.z) b5Var.f280113d.f542241c.a(sb5.z.class);
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) view.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
        if (kVar.W0(c16564xb55e1d5)) {
            int L0 = kVar.L0();
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) b5Var.f280113d.f542241c.a(sb5.u1.class))).p0();
            b5Var.f280228f.b();
            b5Var.f280227e.setVisibility(0);
            b5Var.f280227e.c(L0);
        }
        b5Var.f280113d.f542243e.U(c16564xb55e1d5.f231013d, c16564xb55e1d5.a());
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
