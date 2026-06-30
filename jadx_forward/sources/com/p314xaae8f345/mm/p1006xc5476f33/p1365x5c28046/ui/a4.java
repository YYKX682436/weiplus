package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes12.dex */
public final class a4 extends m22.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13324xdbba4ef8 f179428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13324xdbba4ef8 viewOnClickListenerC13324xdbba4ef8, android.content.Context context, int i17, int i18) {
        super(context, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f179428d = viewOnClickListenerC13324xdbba4ef8;
    }

    @Override // m22.j, m22.y
    public void a(m22.i item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.a(item, i17);
        if (item instanceof m22.k) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("emo_album_index", java.lang.Integer.valueOf(i17));
            java.lang.String str = ((m22.k) item).f404587a.f68396x5bec8145;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getProductID(...)");
            hashMap.put("pid", str);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13324xdbba4ef8.f179401u;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13324xdbba4ef8 viewOnClickListenerC13324xdbba4ef8 = this.f179428d;
            viewOnClickListenerC13324xdbba4ef8.T6("emo_album_manage_page_remove_button", "view_clk", hashMap);
            viewOnClickListenerC13324xdbba4ef8.V6(true);
        }
    }
}
