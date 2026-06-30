package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class cg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g15.a f280422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf f280423e;

    public cg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar, g15.a aVar) {
        this.f280423e = rfVar;
        this.f280422d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = this.f280423e;
        rfVar.f281365h = 2;
        rfVar.f281373s = false;
        sc5.a aVar = sc5.a.f488094a;
        java.lang.String x17 = rfVar.f280113d.x();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = rfVar.f281380z.f334375b;
        g15.a aVar2 = this.f280422d;
        aVar.a(x17, aVar2, f9Var);
        rfVar.f281380z.e(aVar2.l());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf.o0(rfVar, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(aVar2.l(), rfVar.f280113d.x()));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
