package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f281680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2 f281681e;

    public w2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2 y2Var, android.view.View view) {
        this.f281681e = y2Var;
        this.f281680d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingBizHalfScreenComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f281681e.f281812s = 3;
        yb5.d dVar = this.f281681e.f280113d;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) dVar.f542251m).C0().mo75765xb3928276(this.f281680d);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) this.f281681e.f280113d.f542250l).B.m79088x648e109b(false);
        this.f281681e.f280113d.f542250l.y0(true, 0);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingBizHalfScreenComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
