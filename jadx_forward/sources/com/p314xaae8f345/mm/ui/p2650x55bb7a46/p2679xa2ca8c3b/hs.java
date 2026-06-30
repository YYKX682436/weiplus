package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes16.dex */
public final class hs implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gs f285677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285679g;

    public hs(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.gs gsVar, java.lang.String str, java.lang.String str2) {
        this.f285676d = f9Var;
        this.f285677e = gsVar;
        this.f285678f = str;
        this.f285679g = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemEcsKfProductCard$filling$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("whole card click, msgSvrId=");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg = this.f285676d;
        sb6.append(msg.I0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemEcsKfProductCard", sb6.toString());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ms msVar = this.f285677e.I0;
        if (msVar != null) {
            java.lang.String base64Str = this.f285678f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base64Str, "base64Str");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            java.lang.String talker = this.f285679g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", msg, "ecs_kf_card_template_body");
            msVar.b(base64Str, talker);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemEcsKfProductCard$filling$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
