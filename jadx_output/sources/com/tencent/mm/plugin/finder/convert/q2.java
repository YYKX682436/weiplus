package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes15.dex */
public final class q2 extends com.tencent.mm.plugin.finder.convert.s2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f104307e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f104308f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f104309g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f104310h;

    public q2(android.app.Activity activity, java.lang.String finderUserName, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        this.f104307e = activity;
        this.f104308f = finderUserName;
        this.f104309g = z17;
    }

    @Override // com.tencent.mm.plugin.finder.convert.s2, in5.r
    public int e() {
        return com.tencent.mm.R.layout.age;
    }

    @Override // com.tencent.mm.plugin.finder.convert.s2, in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.m0 item, int i17, int i18, boolean z17, java.util.List list) {
        java.util.Map linkedHashMap;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.String str;
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        try {
            android.content.Context context = holder.f293121e;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (intent = activity.getIntent()) == null || (str = intent.getStringExtra("key_biz_passthrough_info")) == null) {
                str = "{}";
            }
            linkedHashMap = d75.b.e(new org.json.JSONObject(str), com.tencent.mm.plugin.finder.convert.p2.f104232d);
        } catch (java.lang.Exception unused) {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.sah);
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
        boolean z18 = this.f104309g;
        if (z18) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        com.google.android.flexbox.FlexboxLayout flexboxLayout = (com.google.android.flexbox.FlexboxLayout) holder.p(com.tencent.mm.R.id.f484190hq4);
        flexboxLayout.post(new com.tencent.mm.plugin.finder.convert.o2(flexboxLayout, item, holder, this, str3));
        if (!this.f104310h) {
            com.tencent.mm.feature.emoji.api.s5 s5Var = (com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class);
            android.app.Activity context2 = this.f104307e;
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.feature.emoji.b0) s5Var).bj(intValue2, 4, 56, ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername());
            this.f104310h = true;
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ovq);
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
            java.lang.String ProductID = item.f410478d.f32456d;
            kotlin.jvm.internal.o.f(ProductID, "ProductID");
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
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "finder_profile_emoticon_cell");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(holder.itemView, 40, 10, false);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.itemView, hashMap);
        }
    }
}
