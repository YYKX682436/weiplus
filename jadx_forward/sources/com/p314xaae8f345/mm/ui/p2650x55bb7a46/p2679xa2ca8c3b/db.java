package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class db implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya f285315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab f285318g;

    public db(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f285318g = abVar;
        this.f285315d = yaVar;
        this.f285316e = dVar;
        this.f285317f = f9Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = this.f285315d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            long longValue = ((java.lang.Long) yaVar.f287584b.getTag(com.p314xaae8f345.mm.R.id.bon)).longValue();
            java.lang.String str = (java.lang.String) yaVar.f287584b.getTag(com.p314xaae8f345.mm.R.id.rfh);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV long click msgId:%s", java.lang.Long.valueOf(longValue));
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bj) ((sb5.o1) this.f285316e.f542241c.a(sb5.o1.class))).n0(view, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cb(this, view, longValue, str, (com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e) yaVar.f287585c.getTag()));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV long click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
