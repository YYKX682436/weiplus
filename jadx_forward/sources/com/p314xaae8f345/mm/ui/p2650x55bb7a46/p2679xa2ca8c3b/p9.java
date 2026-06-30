package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class p9 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f286775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f286776g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.ad4 f286777h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(int i17, r35.m3 m3Var, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, java.lang.CharSequence charSequence, r45.ad4 ad4Var) {
        super(i17, m3Var);
        this.f286773d = dVar;
        this.f286774e = f9Var;
        this.f286775f = c22624x85d69039;
        this.f286776g = charSequence;
        this.f286777h = ad4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        yb5.d dVar = this.f286773d;
        if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pc) ((sb5.v0) dVar.f542241c.a(sb5.v0.class))).m0(this.f286774e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgGroupSolitatire", "not fold");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view != null) {
            view.setTag(com.p314xaae8f345.mm.R.id.bqt, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.SPANNABLE;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f286775f;
        c22624x85d69039.c(this.f286776g, bufferType, null);
        sb5.v0 v0Var = (sb5.v0) dVar.f542241c.a(sb5.v0.class);
        long longValue = ((java.lang.Long) c22624x85d69039.getTag(com.p314xaae8f345.mm.R.id.bon)).longValue();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pc) v0Var).f281215e;
        if (!arrayList2.contains(java.lang.Long.valueOf(longValue))) {
            arrayList2.add(java.lang.Long.valueOf(longValue));
        }
        x63.p Ai = ((t63.e) i95.n0.c(t63.e.class)).Ai();
        java.lang.String x17 = dVar.x();
        Ai.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6921x82d9e311 c6921x82d9e311 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6921x82d9e311();
        c6921x82d9e311.f142379d = c6921x82d9e311.b("ChatName", x17, true);
        r45.ad4 ad4Var = this.f286777h;
        c6921x82d9e311.f142380e = ad4Var.f451480i;
        c6921x82d9e311.f142381f = c6921x82d9e311.b("Identifier", ad4Var.f451481m, true);
        c6921x82d9e311.f142382g = ad4Var.f451476e.size();
        c6921x82d9e311.f142383h = ad4Var.f451479h;
        c6921x82d9e311.k();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
