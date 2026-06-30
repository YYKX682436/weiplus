package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class f6 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f102163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m21.a f102164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102165f;

    public f6(com.tencent.mm.ui.MMActivity mMActivity, m21.a aVar, r45.qt2 qt2Var) {
        this.f102163d = mMActivity;
        this.f102164e = aVar;
        this.f102165f = qt2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        m21.a aVar = this.f102164e;
        if (i18 != -1) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Oj(pm0.v.Z(((m21.f) aVar).f322986a.getString(0)), 2, 2L, "", 0L, this.f102165f);
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(stringArrayListExtra, ";");
        com.tencent.mm.ui.MMActivity mMActivity = this.f102163d;
        db5.e1.T(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490560yi));
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        long Z = pm0.v.Z(((m21.f) aVar).f322986a.getString(0));
        kotlin.jvm.internal.o.d(c17);
        o3Var.Oj(Z, 2, 1L, c17, stringArrayListExtra.size(), this.f102165f);
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "[shareAlbumToSnsTimeLine] " + ((m21.f) aVar).f322986a.getString(1) + " to " + stringArrayListExtra);
    }
}
