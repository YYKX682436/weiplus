package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class pb implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya f286779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286781f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb f286782g;

    public pb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb lbVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f286782g = lbVar;
        this.f286779d = yaVar;
        this.f286780e = dVar;
        this.f286781f = f9Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        long longValue;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = this.f286779d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            longValue = ((java.lang.Long) yaVar.f287584b.getTag(com.p314xaae8f345.mm.R.id.bon)).longValue();
            str = (java.lang.String) yaVar.f287584b.getTag(com.p314xaae8f345.mm.R.id.rfh);
            c16565x9bc03d4e = (com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e) yaVar.f287585c.getTag();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV long click msgId:%s  referfromscene:%s", java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(c16565x9bc03d4e.f231023o));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV long click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        if (c16565x9bc03d4e.f231023o == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV msgQuoteItem.referfromscene == 1, long click disable:%s", java.lang.Long.valueOf(longValue));
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bj) ((sb5.o1) this.f286780e.f542241c.a(sb5.o1.class))).n0(view, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ob(this, view, longValue, str, c16565x9bc03d4e));
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
