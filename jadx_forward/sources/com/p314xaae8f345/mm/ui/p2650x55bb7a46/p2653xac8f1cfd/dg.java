package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class dg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f280470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf f280471e;

    public dg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar, int i17) {
        this.f280471e = rfVar;
        this.f280470d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = this.f280471e;
        rfVar.f281365h = 2;
        rfVar.f281372r = false;
        sb5.t0 t0Var = (sb5.t0) rfVar.f280113d.f542241c.a(sb5.t0.class);
        rfVar.f280113d.x();
        t0Var.getClass();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf.n0(rfVar, this.f280470d);
        rfVar.B0();
        rfVar.x0();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
