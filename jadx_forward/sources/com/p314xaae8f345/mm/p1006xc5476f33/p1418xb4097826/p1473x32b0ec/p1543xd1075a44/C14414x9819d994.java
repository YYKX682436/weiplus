package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/NextLiveCardView;", "Lcom/tencent/mm/plugin/finder/live/view/EasySimpleLivingCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.NextLiveCardView */
/* loaded from: classes2.dex */
public final class C14414x9819d994 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14414x9819d994(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "report nextLive clicked");
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        so2.v2 v2Var = ((im2.i6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.i6.class)).f373926e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("liveid", pm0.v.u(v2Var.f492192n.m75942xfb822ef2(0)));
        jSONObject.put("exposeType", 1);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ml2.x1 x1Var = ml2.x1.f409740n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "abel end page log, 21053, action=7, extra=".concat(jSONObject2));
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        long m59287xa52af937 = item.m59287xa52af937();
        r45.nw1 m59258xd0557130 = item.m59258xd0557130();
        long m75942xfb822ef2 = m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : -1L;
        java.lang.String m59299x6bf53a6c = item.m59299x6bf53a6c();
        long m75939xb282bd08 = item.m59258xd0557130() != null ? r4.m75939xb282bd08(1) : -1L;
        ml2.q1 q1Var = ml2.q1.f409345e;
        j0Var.pj(m59287xa52af937, m75942xfb822ef2, null, m59299x6bf53a6c, -1L, m75939xb282bd08, x1Var, "temp_30", jSONObject2, 1, item.getFeedObject());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "report nextLive exposed");
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        so2.v2 v2Var = ((im2.i6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.i6.class)).f373926e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("liveid", pm0.v.u(v2Var.f492192n.m75942xfb822ef2(0)));
        jSONObject.put("exposeType", 1);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ml2.x1 x1Var = ml2.x1.f409735f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "abel end page log, 21053, action=2, extra=".concat(jSONObject2));
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String m59299x6bf53a6c = item.m59299x6bf53a6c();
        java.lang.String valueOf = java.lang.String.valueOf(item.m59287xa52af937());
        long m59287xa52af937 = item.m59287xa52af937();
        r45.nw1 m59258xd0557130 = item.m59258xd0557130();
        long m75942xfb822ef2 = m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L;
        ml2.q1 q1Var = ml2.q1.f409345e;
        r45.nw1 m59258xd05571302 = item.m59258xd0557130();
        int m75939xb282bd08 = m59258xd05571302 != null ? m59258xd05571302.m75939xb282bd08(1) : -1;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = item.getFeedObject();
        if (feedObject == null || (str = feedObject.m76801x8010e5e4()) == null) {
            str = "";
        }
        ((b92.d1) zbVar).wi(new ml2.f0(null, m59299x6bf53a6c, i17, valueOf, m59287xa52af937, m75942xfb822ef2, x1Var, "temp_30", m75939xb282bd08, str, ml2.e0.f408904f, false, false, 0, null, null, jSONObject2, null, 1L, null, 0, 0L, 0, null, null, null, 66777088, null));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item, java.lang.String contextId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String u17 = pm0.v.u(((im2.i6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.i6.class)).f373926e.f492192n.m75942xfb822ef2(0));
        android.content.Intent intent = new android.content.Intent();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.q1 q1Var = ml2.q1.f409345e;
        jSONObject.put("enter_immerse_type", "temp_30");
        jSONObject.put("liveid", u17);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        intent.putExtra("key_chnl_extra", r26.i0.t(jSONObject2, ",", ";", false));
        intent.putExtra("KEY_FEED_END_PAGE_EXPOSE_TYPE", 1);
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        if (nVar != null) {
            nVar.b(intent);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(item.getFeedObject());
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, contextId);
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(5, item.getFeedObject());
        wk0Var.set(6, y74Var);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        ((vd2.f1) e0Var).Ni(context2, intent, arrayList, 0, wk0Var, null);
    }
}
