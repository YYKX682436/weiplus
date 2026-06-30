package bg2;

/* loaded from: classes2.dex */
public final class l4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.o4 f20268d;

    public l4(bg2.o4 o4Var) {
        this.f20268d = o4Var;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertTemplateInfoController$onBind$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_DO_ACTION", 12);
        bg2.o4 o4Var = this.f20268d;
        uc2.i iVar = (uc2.i) o4Var.O6(uc2.i.class);
        if (iVar != null) {
            kotlin.jvm.internal.o.d(view);
            ((sb2.o) iVar).Y6(view, intent);
        }
        uc2.g gVar = (uc2.g) o4Var.O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        ml2.t1 t1Var = ml2.t1.J2;
        jz5.l[] lVarArr = new jz5.l[2];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = o4Var.f417141d.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        lVarArr[1] = new jz5.l("lottery_id", java.lang.String.valueOf(o4Var.f20357n));
        v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertTemplateInfoController$onBind$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
