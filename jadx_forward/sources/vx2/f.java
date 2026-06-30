package vx2;

/* loaded from: classes2.dex */
public final class f implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vx2.k f522775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f522776b;

    public f(vx2.k kVar, int i17) {
        this.f522775a = kVar;
        this.f522776b = i17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        java.util.HashMap hashMap = new java.util.HashMap();
        vx2.k kVar = this.f522775a;
        android.content.Context context = kVar.f522782a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        hashMap.put("comment_scene", java.lang.String.valueOf(nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().m75939xb282bd08(5)) : null));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = kVar.f522787f;
        hashMap.put("feed_id", pm0.v.u((abstractC14490x69736cb5 == null || (feedObject3 = abstractC14490x69736cb5.getFeedObject()) == null) ? 0L : feedObject3.m59251x5db1b11()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = kVar.f522787f;
        hashMap.put("session_buffer", java.lang.String.valueOf((abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? null : feedObject2.m76829x97edf6c0()));
        android.content.Context context2 = kVar.f522782a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        hashMap.put("finder_tab_context_id", java.lang.String.valueOf(nyVar2 != null ? nyVar2.V6().m75945x2fec8307(2) : null));
        hashMap.put("expose_playpercent", java.lang.String.valueOf(vx2.k.c(kVar)));
        hashMap.put("feed_play_back_interval", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0);
        hashMap.put("screen_type", java.lang.String.valueOf(this.f522776b));
        hashMap.put("feed_play_forward_back_button_show_position", "2");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_clk")) {
            hashMap.put("before_click_playpercent", java.lang.String.valueOf(vx2.k.c(kVar)));
            hashMap.put("after_click_playpercent", java.lang.String.valueOf(vx2.k.a(kVar, false)));
        }
        return kz5.c1.s(hashMap);
    }
}
