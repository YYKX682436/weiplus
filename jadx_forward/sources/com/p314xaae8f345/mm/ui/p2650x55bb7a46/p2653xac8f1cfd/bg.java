package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class bg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g15.a f280268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf f280269e;

    public bg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar, g15.a aVar) {
        this.f280269e = rfVar;
        this.f280268d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf rfVar = this.f280269e;
        rfVar.f281365h = 2;
        int i17 = rfVar.A;
        if (i17 >= 0) {
            rfVar.f281378x = -1;
            rfVar.f281373s = false;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.rf.n0(rfVar, i17);
            sc5.a aVar = sc5.a.f488094a;
            java.lang.String x17 = rfVar.f280113d.x();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = rfVar.f281380z.f334375b;
            g15.a aVar2 = this.f280268d;
            aVar.a(x17, aVar2, f9Var);
            rfVar.f281380z.e(aVar2.l());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HistoryMsgTongueComponent", "error unreadTopPos: %s", java.lang.Integer.valueOf(i17));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
