package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class il implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d f250153d;

    public il(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        this.f250153d = activityC18078x319f375d;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$11");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d = this.f250153d;
        if (i17 < activityC18078x319f375d.f248800d.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsMsgUI", "on header view long click, ignore");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$11");
            return true;
        }
        rl5.r rVar = new rl5.r(activityC18078x319f375d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d2 = this.f250153d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        db5.t4 t4Var = activityC18078x319f375d2.K;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        rVar.g(view, i17, j17, activityC18078x319f375d2, t4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.U6(activityC18078x319f375d)[0], com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.U6(activityC18078x319f375d)[1]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$11");
        return true;
    }
}
