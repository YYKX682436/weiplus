package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class q7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lo1 f110446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorSettingUI f110447e;

    public q7(r45.lo1 lo1Var, com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorSettingUI finderLiveAnchorSettingUI) {
        this.f110446d = lo1Var;
        this.f110447e = finderLiveAnchorSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSettingUI$buildSettingLayout$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.lo1 lo1Var = this.f110446d;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) lo1Var.getCustom(0);
        if (finderJumpInfo != null) {
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorSettingUI finderLiveAnchorSettingUI = this.f110447e;
            androidx.appcompat.app.AppCompatActivity context = finderLiveAnchorSettingUI.getContext();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
            if (mMFinderUI == null || (str = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) {
                str = "";
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            ml2.u1 u1Var = ml2.u1.f328040e;
            a4Var.b(str, b17, "person_page_ext_entrance", "{\"entrance_id\":\"" + lo1Var.getInteger(2) + "\"}");
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            androidx.appcompat.app.AppCompatActivity context2 = finderLiveAnchorSettingUI.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context2, p0Var, 0, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSettingUI$buildSettingLayout$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
