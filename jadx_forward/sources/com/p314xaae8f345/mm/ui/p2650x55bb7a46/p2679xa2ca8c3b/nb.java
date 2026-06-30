package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class nb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya f286443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb f286445f;

    public nb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lb lbVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar, yb5.d dVar) {
        this.f286445f = lbVar;
        this.f286443d = yaVar;
        this.f286444e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = this.f286443d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            long longValue = ((java.lang.Long) yaVar.f287584b.getTag(com.p314xaae8f345.mm.R.id.bon)).longValue();
            java.lang.String str = (java.lang.String) yaVar.f287584b.getTag(com.p314xaae8f345.mm.R.id.rfh);
            com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e = (com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e) yaVar.f287585c.getTag();
            if (c16565x9bc03d4e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV click msgId:%s  referfromscene:%s", java.lang.Long.valueOf(longValue), java.lang.Integer.valueOf(c16565x9bc03d4e.f231023o));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV click msgId:%s  msgQuoteItem == null", java.lang.Long.valueOf(longValue));
            }
            if (yaVar.f287588f.getVisibility() == 0) {
                view = yaVar.f287588f;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.d(this.f286444e, this.f286443d, this.f286445f, view, longValue, str, c16565x9bc03d4e);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteTo", "sourceTV click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteTo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
