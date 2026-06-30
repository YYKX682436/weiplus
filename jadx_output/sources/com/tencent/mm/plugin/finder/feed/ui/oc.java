package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class oc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI f110372d;

    public oc(com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI finderLiveRemindConsumeWecoinUI) {
        this.f110372d = finderLiveRemindConsumeWecoinUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI finderLiveRemindConsumeWecoinUI = this.f110372d;
        long j17 = 0;
        int i17 = 0;
        for (java.lang.Object obj : finderLiveRemindConsumeWecoinUI.f109409v) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.finder.feed.ui.lc lcVar = (com.tencent.mm.plugin.finder.feed.ui.lc) obj;
            if (lcVar.f110268b) {
                j17 = lcVar.f110267a;
            }
            i17 = i18;
        }
        finderLiveRemindConsumeWecoinUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_SELECT_MOUNT", j17);
        finderLiveRemindConsumeWecoinUI.setResult(1, intent);
        finderLiveRemindConsumeWecoinUI.finish();
        return true;
    }
}
