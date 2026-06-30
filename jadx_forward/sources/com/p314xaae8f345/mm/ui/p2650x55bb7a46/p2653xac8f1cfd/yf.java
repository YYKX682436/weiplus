package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class yf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf f281847d;

    public yf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar) {
        this.f281847d = rfVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = this.f281847d;
        rfVar.f281365h = 2;
        rfVar.f281373s = false;
        sc5.a.f488094a.a(rfVar.f280113d.x(), rfVar.D, rfVar.f281380z.f334375b);
        rfVar.f281380z.e(rfVar.D.l());
        if (rfVar.D.k() == 0) {
            rfVar.f281378x = -1;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf.n0(rfVar, rfVar.A);
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf.o0(rfVar, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(rfVar.D.l(), rfVar.f280113d.x()));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
