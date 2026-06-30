package sb4;

/* loaded from: classes4.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f487030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb4.g0 f487031e;

    public f0(sb4.g0 g0Var, java.util.List list) {
        this.f487031e = g0Var;
        this.f487030d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1$1");
        sb4.g0 g0Var = this.f487031e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a activityC18144x3e20023a = g0Var.f487033d;
        activityC18144x3e20023a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showList", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        activityC18144x3e20023a.f249158e.setVisibility(8);
        activityC18144x3e20023a.f249157d.setVisibility(0);
        android.widget.ListView listView = activityC18144x3e20023a.f249157d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uv uvVar = activityC18144x3e20023a.B;
        uvVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAutoPlayWithDelay", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listView, "listView");
        listView.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tv(uvVar, listView), 15L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAutoPlayWithDelay", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showList", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        sb4.h0 h0Var = g0Var.f487034e;
        h0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        java.util.ArrayList arrayList = (java.util.ArrayList) h0Var.f487047e;
        arrayList.clear();
        arrayList.addAll(this.f487030d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        h0Var.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1$1");
    }
}
