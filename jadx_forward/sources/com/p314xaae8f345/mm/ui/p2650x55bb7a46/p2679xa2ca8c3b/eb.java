package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class eb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya f285397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab f285399f;

    public eb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ab abVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar, yb5.d dVar) {
        this.f285399f = abVar;
        this.f285397d = yaVar;
        this.f285398e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar = this.f285397d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            long longValue = ((java.lang.Long) yaVar.f287584b.getTag(com.p314xaae8f345.mm.R.id.bon)).longValue();
            java.lang.String str = (java.lang.String) yaVar.f287584b.getTag(com.p314xaae8f345.mm.R.id.rfh);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV click msgId:%s", java.lang.Long.valueOf(longValue));
            com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e = (com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e) yaVar.f287585c.getTag();
            if (yaVar.f287588f.getVisibility() == 0) {
                view = yaVar.f287588f;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.d(this.f285398e, this.f285397d, this.f285399f, view, longValue, str, c16565x9bc03d4e);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgMsgQuoteFrom", "sourceTV click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
