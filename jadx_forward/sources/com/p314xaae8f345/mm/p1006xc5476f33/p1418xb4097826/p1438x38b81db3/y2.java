package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes9.dex */
public final class y2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186517e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f186518f;

    public y2(java.lang.String finderUsername, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f186517e = finderUsername;
        this.f186518f = z17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570331dc3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.util.Map linkedHashMap;
        java.lang.String str;
        android.content.Intent intent;
        so2.o0 item = (so2.o0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        try {
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (intent = activity.getIntent()) == null || (str = intent.getStringExtra("key_biz_passthrough_info")) == null) {
                str = "{}";
            }
            linkedHashMap = d75.b.e(new org.json.JSONObject(str), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x2.f186454d);
        } catch (java.lang.Exception unused) {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        java.lang.Object obj = linkedHashMap.get("sdkRequestID");
        final java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str2 == null) {
            str2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        java.util.List list2 = item.f492049d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new so2.n0((r45.ri0) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) holder.p(com.p314xaae8f345.mm.R.id.lqa);
        c22849x81a93d25.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.convert.FinderEmojiSingleSummaryConvert$onBindViewHolder$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.y2 y2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.y2.this;
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u2(y2Var.f186517e, 56, str2, y2Var.f186518f);
            }
        }, arrayList2, true));
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 3));
        c22849x81a93d25.addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w2(item, arrayList2, c22849x81a93d25));
    }
}
