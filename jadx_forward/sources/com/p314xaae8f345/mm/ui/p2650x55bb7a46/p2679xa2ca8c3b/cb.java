package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class cb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f285244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f285245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e f285247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.db f285248h;

    public cb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.db dbVar, android.view.View view, long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        this.f285248h = dbVar;
        this.f285244d = view;
        this.f285245e = j17;
        this.f285246f = str;
        this.f285247g = c16565x9bc03d4e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.db dbVar = this.f285248h;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.e(dbVar.f285316e, dbVar.f285318g, dbVar.f285317f, this.f285244d, this.f285245e, this.f285246f, this.f285247g, ty.q0.f504282d);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
