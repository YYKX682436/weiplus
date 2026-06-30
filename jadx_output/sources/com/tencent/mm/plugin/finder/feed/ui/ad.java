package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ad implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f109672a;

    public ad(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        this.f109672a = kdVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        if (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("label_id")) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveVisibilityModeConfigPanel", "select labels result: " + kz5.n0.g0(stringArrayListExtra, "|", null, null, 0, null, null, 62, null) + " resultCode: " + i17);
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f109672a;
        java.util.LinkedList list = kdVar.L1.getList(4);
        if (list != null) {
            list.clear();
        }
        java.util.LinkedList list2 = kdVar.L1.getList(4);
        if (list2 != null) {
            list2.addAll(stringArrayListExtra);
        }
        kdVar.g0();
    }
}
