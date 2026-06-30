package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class a7 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f102008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f102009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f102010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f102011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f102012h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102013i;

    public a7(boolean z17, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, yz5.p pVar, int i17, r45.qt2 qt2Var) {
        this.f102008d = z17;
        this.f102009e = mMFragmentActivity;
        this.f102010f = finderItem;
        this.f102011g = pVar;
        this.f102012h = i17;
        this.f102013i = qt2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17 = i18 == -1;
        java.lang.Boolean bool = null;
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("sns_upload_desc") : null;
        com.tencent.mm.ui.MMFragmentActivity activity = this.f102009e;
        com.tencent.mm.plugin.finder.storage.FinderItem feedItem = this.f102010f;
        if (z17) {
            if (this.f102008d) {
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                e4Var.f211776c = activity.getString(com.tencent.mm.R.string.f490560yi);
                e4Var.c();
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share feed to sns desc = " + stringExtra);
                kotlin.jvm.internal.o.g(activity, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar = (com.tencent.mm.plugin.finder.viewmodel.component.qf) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.qf.class);
                if (qfVar != null) {
                    kotlin.jvm.internal.o.g(feedItem, "feedItem");
                    com.tencent.mm.protocal.protobuf.FinderObject feedObject = feedItem.getFeedObject();
                    jz5.g gVar = hc2.o0.f280336a;
                    boolean z18 = ((feedObject != null ? feedObject.getPermissionFlag() : 0) & 67108864) == 0;
                    int e17 = com.tencent.mm.ui.tools.v4.e(stringExtra, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enable=");
                    boolean z19 = qfVar.f135700m;
                    sb6.append(z19);
                    sb6.append(" hasPermission:");
                    sb6.append(z18);
                    sb6.append(" maxLen=");
                    jz5.g gVar2 = qfVar.f135701n;
                    sb6.append(((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue());
                    sb6.append(" desc=");
                    sb6.append(stringExtra);
                    sb6.append(" len:");
                    sb6.append(stringExtra != null ? java.lang.Integer.valueOf(stringExtra.length()) : null);
                    sb6.append(" count:");
                    sb6.append(e17);
                    com.tencent.mars.xlog.Log.i("FinderFeedShareDescToCommentUIC", sb6.toString());
                    if (z19) {
                        if (!(stringExtra == null || stringExtra.length() == 0) && e17 <= ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue() && z18) {
                            qfVar.f135696f = feedItem;
                            qfVar.f135697g = stringExtra;
                            qfVar.f135694d = true;
                            if (qfVar.f135695e) {
                                qfVar.f135694d = true;
                            } else {
                                android.view.View rootView = qfVar.getRootView();
                                jz5.n nVar = (jz5.n) qfVar.f135703p;
                                rootView.removeCallbacks((java.lang.Runnable) nVar.getValue());
                                qfVar.getRootView().postDelayed((java.lang.Runnable) nVar.getValue(), 500L);
                            }
                        }
                    }
                }
            }
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
        if (e27 != null) {
            feedItem.getExpectId();
            if (z17) {
                e27.a(new ec2.a(2, feedItem.getExpectId(), feedItem.getDupFlag()));
            } else {
                e27.a(new ec2.a(4, feedItem.getExpectId(), feedItem.getDupFlag()));
            }
        }
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("sns_upload_session_id") : null;
        yz5.p pVar = this.f102011g;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.valueOf(z17), stringExtra2);
        }
        long j17 = z17 ? 1L : 2L;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        long id6 = feedItem.getId();
        java.lang.String dupFlag = feedItem.getDupFlag();
        int i19 = this.f102012h;
        r45.qt2 qt2Var = this.f102013i;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f102010f;
        if (stringExtra != null) {
            bool = java.lang.Boolean.valueOf(stringExtra.length() > 0);
        }
        com.tencent.mm.plugin.finder.report.o3.Vj(o3Var, id6, dupFlag, i19, j17, "", qt2Var, 0L, finderItem, bool, 64, null);
    }
}
