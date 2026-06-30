package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes15.dex */
public final class q2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f185840e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f185841f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f185842g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f185843h;

    public q2(android.app.Activity activity, java.lang.String finderUserName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        this.f185840e = activity;
        this.f185841f = finderUserName;
        this.f185842g = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s2, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.age;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s2, in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.m0 item, int i17, int i18, boolean z17, java.util.List list) {
        java.util.Map linkedHashMap;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.String str;
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        try {
            android.content.Context context = holder.f374654e;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (intent = activity.getIntent()) == null || (str = intent.getStringExtra("key_biz_passthrough_info")) == null) {
                str = "{}";
            }
            linkedHashMap = d75.b.e(new org.json.JSONObject(str), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p2.f185765d);
        } catch (java.lang.Exception unused) {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.sah);
        java.lang.Object obj = linkedHashMap.get("enterHasRedDot");
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Object obj2 = linkedHashMap.get("sdkRequestID");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        java.lang.String str3 = str2;
        java.lang.Object obj3 = linkedHashMap.get("emoticonEnterScene");
        java.lang.Integer num2 = obj3 instanceof java.lang.Integer ? (java.lang.Integer) obj3 : null;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        boolean z18 = this.f185842g;
        if (z18) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc c1625xd76db8dc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc) holder.p(com.p314xaae8f345.mm.R.id.f565723hq4);
        c1625xd76db8dc.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.o2(c1625xd76db8dc, item, holder, this, str3));
        if (!this.f185843h) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5 s5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class);
            android.app.Activity context2 = this.f185840e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) s5Var).bj(intValue2, 4, 56, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58743x6c03c64c());
            this.f185843h = true;
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ovq);
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = 0;
            marginLayoutParams = marginLayoutParams2;
        } else {
            marginLayoutParams = null;
        }
        p17.setLayoutParams(marginLayoutParams);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (!(str3.length() == 0)) {
            java.lang.String ProductID = item.f492011d.f113989d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ProductID, "ProductID");
            hashMap.put("pid", ProductID);
            hashMap.put("emoticon_type", 2);
            hashMap.put("emoticon_enter_scene", java.lang.Integer.valueOf(intValue2));
            hashMap.put("pos_id", java.lang.Integer.valueOf(i17));
            hashMap.put("emoticon_user_type", z18 ? "1" : "2");
            hashMap.put("enter_isred", java.lang.Integer.valueOf(intValue));
            hashMap.put("emoitcon_sessionid", str3);
            iy1.c cVar = iy1.c.MainUI;
            hashMap2.put("page_id", 50102);
            hashMap2.put("page_name", "FinderProfileMainTab");
            hashMap.put("cur_page", hashMap2);
        }
        if (str3.length() > 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "finder_profile_emoticon_cell");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(holder.f3639x46306858, 40, 10, false);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.f3639x46306858, hashMap);
        }
    }
}
