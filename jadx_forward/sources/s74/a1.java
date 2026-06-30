package s74;

/* loaded from: classes4.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f485730a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f485731b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f485732c;

    /* renamed from: d, reason: collision with root package name */
    public final s74.f3 f485733d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f485734e;

    public a1(android.view.View view, org.json.JSONObject animObj, org.json.JSONObject viewInfoObj, s74.f3 dynamicViewContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animObj, "animObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewInfoObj, "viewInfoObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamicViewContext, "dynamicViewContext");
        this.f485730a = view;
        this.f485731b = animObj;
        this.f485732c = viewInfoObj;
        this.f485733d = dynamicViewContext;
        this.f485734e = new java.util.ArrayList();
    }

    public final org.json.JSONObject a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        return this.f485731b;
    }

    public final java.util.List b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentAttachedAnims", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        java.util.List list = this.f485734e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentAttachedAnims", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        return list;
    }

    public final android.view.View c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        return this.f485730a;
    }

    public final org.json.JSONObject d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        return this.f485732c;
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.AnimationInfo", "reset");
        android.view.View view = this.f485730a;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        org.json.JSONObject jSONObject = this.f485732c;
        boolean has = jSONObject.has("translate-x");
        s74.f3 f3Var = this.f485733d;
        if (has) {
            view.setTranslationX(s74.u3.f486095a.q(jSONObject, "translate-x", 0.0f, f3Var));
        } else {
            view.setTranslationX(0.0f);
        }
        if (jSONObject.has("translate-y")) {
            view.setTranslationY(s74.u3.f486095a.q(jSONObject, "translate-y", 0.0f, f3Var));
        } else {
            view.setTranslationY(0.0f);
        }
        if (jSONObject.has("alpha")) {
            android.view.View view2 = this.f485730a;
            float optDouble = (float) jSONObject.optDouble("alpha");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(optDouble));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AnimationInfo", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AnimationInfo", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view3 = this.f485730a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AnimationInfo", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AnimationInfo", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (view instanceof android.widget.TextView) {
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            if (jSONObject.has("background-color")) {
                s74.q4.f486046a.m(jSONObject, stateListDrawable);
            }
            int y17 = s74.u3.f486095a.y(jSONObject, -1);
            android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(new int[][]{new int[0]}, new int[]{y17});
            if (jSONObject.has("color")) {
                colorStateList = s74.q4.f486046a.r(jSONObject, y17);
            }
            ((android.widget.TextView) view).setTextColor(colorStateList);
            ((android.widget.TextView) view).setBackground(stateListDrawable);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
    }
}
