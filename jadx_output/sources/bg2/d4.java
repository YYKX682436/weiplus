package bg2;

/* loaded from: classes2.dex */
public final class d4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.h4 f20029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.px3 f20030e;

    public d4(bg2.h4 h4Var, r45.px3 px3Var) {
        this.f20029d = h4Var;
        this.f20030e = px3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingRecommendController$renderProducts$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_DO_ACTION", 17);
        bg2.h4 h4Var = this.f20029d;
        in5.s0 s0Var = h4Var.f417141d.f417149i;
        if (s0Var == null || (view2 = s0Var.itemView) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingRecommendController$renderProducts$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        uc2.i iVar = (uc2.i) h4Var.O6(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(view2, intent);
        }
        h4Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = h4Var.f417141d.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        hashMap.put("liveid", str);
        r45.px3 px3Var = this.f20030e;
        hashMap.put("guide_bar_type", java.lang.String.valueOf(px3Var.getInteger(3)));
        java.lang.String string = px3Var.getString(1);
        hashMap.put("guide_bar_txt", string != null ? string : "");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.S2, hashMap, null, null, null, null, false, 124, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingRecommendController$renderProducts$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
