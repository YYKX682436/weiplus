package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class eg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f280502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf f280503e;

    public eg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5) {
        this.f280503e = rfVar;
        this.f280502d = c16564xb55e1d5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = this.f280503e;
        rfVar.f281365h = 2;
        rfVar.f281372r = false;
        sb5.t0 t0Var = (sb5.t0) rfVar.f280113d.f542241c.a(sb5.t0.class);
        rfVar.f280113d.x();
        t0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = this.f280502d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf.o0(rfVar, c16564xb55e1d5);
        if (rfVar.f281374t.contains(c16564xb55e1d5)) {
            rfVar.f281374t.remove(c16564xb55e1d5);
            rfVar.s0(true, false);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
