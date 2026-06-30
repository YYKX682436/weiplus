package s74;

/* loaded from: classes4.dex */
public final class o3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f485999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f486000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f486001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f486002g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f486003h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s74.j3 f486004i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(s74.f3 f3Var, org.json.JSONObject jSONObject, boolean z17, android.content.Context context, boolean z18, s74.j3 j3Var) {
        super(1);
        this.f485999d = f3Var;
        this.f486000e = jSONObject;
        this.f486001f = z17;
        this.f486002g = context;
        this.f486003h = z18;
        this.f486004i = j3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createFlexViewInternal$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createFlexViewInternal$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        s74.f3 f3Var = this.f485999d;
        f3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getObj2ParentMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        java.util.Map map = f3Var.f485816q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getObj2ParentMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        org.json.JSONObject jSONObject = this.f486000e;
        map.put(it, jSONObject);
        f3Var.l(jSONObject);
        f3Var.l(it);
        boolean z17 = this.f486001f || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.optString(dm.i4.f66865x76d1ec5a), "mainElementContainer");
        s74.u3 u3Var = s74.u3.f486095a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$createFlexViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        s74.j3 f17 = u3Var.f(f3Var, it, this.f486002g, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$createFlexViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        if (f17 != null) {
            if (this.f486003h && !z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOtherAlphaAnimViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                java.util.List list = f3Var.f485820u;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOtherAlphaAnimViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                ((java.util.ArrayList) list).add(f17.c());
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.optString("position"), "absolute")) {
                s74.j3 j3Var = this.f486004i;
                android.view.View c17 = j3Var.c();
                android.view.ViewGroup viewGroup = c17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) c17 : null;
                if (viewGroup == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Factory", "parentView is null!  " + j3Var.b());
                }
                s74.g3 b17 = f17.b();
                b17.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toFlexBoxLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$LayoutParamsInfo");
                com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams layoutParams = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc.LayoutParams(b17.f485841k, b17.f485842l);
                layoutParams.f125722d = b17.f485843m;
                layoutParams.f125723e = b17.f485844n;
                layoutParams.f125724f = b17.f485845o;
                layoutParams.f125725g = -1;
                layoutParams.f125726h = b17.f485846p;
                layoutParams.f125728m = b17.f485848r;
                layoutParams.f125727i = b17.f485847q;
                layoutParams.f125730o = b17.f485850t;
                layoutParams.f125729n = b17.f485849s;
                layoutParams.f125731p = false;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = b17.f485834d;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin = b17.f485833c;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = b17.f485832b;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = b17.f485831a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toFlexBoxLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$LayoutParamsInfo");
                if (viewGroup != null) {
                    viewGroup.addView(f17.c(), layoutParams);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createFlexViewInternal$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createFlexViewInternal$1");
        return f0Var;
    }
}
