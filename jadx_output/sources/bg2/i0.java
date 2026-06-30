package bg2;

/* loaded from: classes2.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j0 f20151d;

    public i0(bg2.j0 j0Var) {
        this.f20151d = j0Var;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentUIController$renderTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bg2.j0 j0Var = this.f20151d;
        bg2.j0.Y6(j0Var);
        uc2.g gVar = (uc2.g) j0Var.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        ml2.t1 t1Var = ml2.t1.I2;
        jz5.l[] lVarArr = new jz5.l[2];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j0Var.f417141d.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("comment_msg_cnt", java.lang.String.valueOf(j0Var.f20187o));
        v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = j0Var.f417141d.f417148h;
        if (baseFinderFeed2 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 88);
            jSONObject.put("feedActionSubType", 101);
            jSONObject.put("value", 1);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            v3Var.a(c76, baseFinderFeed2, jSONObject2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentUIController$renderTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
