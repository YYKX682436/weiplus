package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class iq implements lo.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f110165a;

    public iq(com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI) {
        this.f110165a = selectLocalFileRouterUI;
    }

    @Override // lo.j
    public void a(int i17, java.lang.String str, java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resultCode:");
        sb6.append(i17);
        sb6.append(" filePaths:");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", sb6.toString());
        com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI = this.f110165a;
        if (i17 != -1) {
            com.tencent.mm.autogen.events.MusicPostSelectEvent musicPostSelectEvent = new com.tencent.mm.autogen.events.MusicPostSelectEvent();
            am.kk kkVar = musicPostSelectEvent.f54513g;
            kkVar.f7160a = "";
            kkVar.f7162c = true;
            musicPostSelectEvent.e();
            selectLocalFileRouterUI.finish();
            return;
        }
        if (arrayList == null || arrayList.size() <= 0) {
            int i18 = com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI.f109628p;
            selectLocalFileRouterUI.Y6(-100);
            return;
        }
        java.lang.String str2 = ((com.tencent.mm.choosemsgfile.compat.MsgFile) arrayList.get(0)).f64762e;
        if (com.tencent.mm.vfs.w6.j(str2)) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.hq(selectLocalFileRouterUI, str2));
            return;
        }
        int i19 = com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI.f109628p;
        selectLocalFileRouterUI.Y6(-201);
        com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", "chooseFromChat fail, file not exixt");
    }
}
