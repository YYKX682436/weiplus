package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class j6 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f102285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f102286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f102287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102288g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102289h;

    public j6(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, androidx.appcompat.app.AppCompatActivity appCompatActivity, kotlin.jvm.internal.f0 f0Var, r45.qt2 qt2Var, yz5.l lVar) {
        this.f102285d = finderItem;
        this.f102286e = appCompatActivity;
        this.f102287f = f0Var;
        this.f102288g = qt2Var;
        this.f102289h = lVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        androidx.appcompat.app.AppCompatActivity activity = this.f102286e;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f102285d;
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            arrayList = stringArrayListExtra;
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share finderObject " + finderItem.getId() + " to " + arrayList);
            if (!arrayList.isEmpty()) {
                kotlin.jvm.internal.o.g(activity, "activity");
                java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
                if (e27 != null) {
                    e27.a(new ec2.a(1, finderItem.getId(), finderItem.getDupFlag()));
                }
            }
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().h(arrayList);
            if (!com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
                com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "EnterChattingAfterTrans config disabled, toUsers size:" + arrayList.size() + ", show normal toast");
                com.tencent.mm.ui.widget.snackbar.j.c(((com.tencent.mm.ui.MMFragmentActivity) activity).getResources().getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
            }
        } else {
            kotlin.jvm.internal.o.g(activity, "activity");
            java.lang.Object a18 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            ec2.d e28 = zy2.ra.e2((zy2.ra) a18, 0, 1, null);
            if (e28 != null) {
                e28.a(new ec2.a(3, finderItem.getId(), finderItem.getDupFlag()));
            }
        }
        long j17 = i18 == -1 ? 1L : 2L;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        long id6 = finderItem.getId();
        java.lang.String dupFlag = finderItem.getDupFlag();
        int i19 = this.f102287f.f310116d;
        java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ";");
        kotlin.jvm.internal.o.f(c18, "listToString(...)");
        com.tencent.mm.plugin.finder.report.o3.Vj(o3Var, id6, dupFlag, i19, j17, c18, this.f102288g, arrayList.size(), null, null, 384, null);
        yz5.l lVar = this.f102289h;
        if (lVar != null) {
            lVar.invoke(arrayList);
        }
    }
}
