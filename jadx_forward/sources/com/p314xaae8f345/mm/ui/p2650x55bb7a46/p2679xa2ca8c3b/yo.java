package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class yo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp f287626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sb5.k2 f287628g;

    public yo(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dp dpVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar, yb5.d dVar, sb5.k2 k2Var) {
        this.f287625d = f9Var;
        this.f287626e = lpVar;
        this.f287627f = dVar;
        this.f287628g = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287625d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemVoice", "voice fast trans text click, msgId:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mp.d(this.f287626e.mo79416xf806b362(), this.f287627f, f9Var, this.f287628g, true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dp.e0(2, f9Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
