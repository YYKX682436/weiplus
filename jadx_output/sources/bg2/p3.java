package bg2;

/* loaded from: classes2.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f20381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f20383f;

    public p3(r45.y23 y23Var, bg2.z3 z3Var, android.view.View view) {
        this.f20381d = y23Var;
        this.f20382e = z3Var;
        this.f20383f = view;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController$renderExp2Layout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_DO_ACTION", 10);
        intent.putExtra("KEY_PARAMS_AUTO_OPEN_PRODUCT_INFO", this.f20381d.toByteArray());
        bg2.z3 z3Var = this.f20382e;
        uc2.i iVar = (uc2.i) z3Var.O6(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(this.f20383f, intent);
        }
        uc2.g gVar = (uc2.g) z3Var.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        ml2.t1 t1Var = ml2.t1.H2;
        jz5.l[] lVarArr = new jz5.l[3];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z3Var.f417141d.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        java.lang.String str2 = z3Var.f20698s;
        lVarArr[1] = new jz5.l("productid", str2 != null ? str2 : "");
        lVarArr[2] = new jz5.l("click_type", "1");
        v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = z3Var.f417141d.f417148h;
        if (baseFinderFeed2 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 88);
            jSONObject.put("feedActionSubType", 3);
            jSONObject.put("value", 1);
            jSONObject.put("strValue", z3Var.f20698s);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            v3Var.a(c76, baseFinderFeed2, jSONObject2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController$renderExp2Layout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
