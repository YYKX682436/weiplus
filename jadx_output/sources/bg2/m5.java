package bg2;

/* loaded from: classes2.dex */
public final class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.o5 f20307d;

    public m5(bg2.o5 o5Var) {
        this.f20307d = o5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveIndependentExpController$onBind$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("LiveConvertPoiController", "poi clicked");
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            bg2.o5 o5Var = this.f20307d;
            uc2.g gVar = (uc2.g) o5Var.O6(uc2.g.class);
            r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
            com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
            ml2.t1 t1Var = ml2.t1.E2;
            jz5.l[] lVarArr = new jz5.l[1];
            tc2.g gVar2 = o5Var.f417141d;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar2.f417148h;
            if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("liveid", str);
            v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar2.f417148h;
            if (baseFinderFeed2 != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 88);
                jSONObject.put("feedActionSubType", com.tencent.mm.plugin.appbrand.jsapi.sensor.q.CTRL_INDEX);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, baseFinderFeed2, jSONObject2);
            }
            android.view.View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                childAt.performClick();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveIndependentExpController$onBind$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
