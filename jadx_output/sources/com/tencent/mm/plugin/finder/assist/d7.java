package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes5.dex */
public final class d7 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f102087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f102088f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ht0 f102089g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f102090h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102091i;

    public d7(java.lang.String str, int i17, long j17, r45.ht0 ht0Var, com.tencent.mm.ui.MMActivity mMActivity, int i18) {
        this.f102086d = str;
        this.f102087e = i17;
        this.f102088f = j17;
        this.f102089g = ht0Var;
        this.f102090h = mMActivity;
        this.f102091i = i18;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.lang.String str = this.f102086d;
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            arrayList = stringArrayListExtra;
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share topic " + str + " to " + arrayList);
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().h(arrayList);
        }
        if (this.f102087e == 7) {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            boolean z17 = i18 == -1;
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
            kotlin.jvm.internal.o.f(c17, "listToString(...)");
            long j17 = this.f102088f;
            r45.ht0 ht0Var = this.f102089g;
            java.lang.String string = ht0Var != null ? ht0Var.getString(0) : null;
            com.tencent.mm.ui.MMActivity activity = this.f102090h;
            kotlin.jvm.internal.o.g(activity, "activity");
            o3Var.Nj(1, z17, c17, j17, string, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
            return;
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        boolean z18 = i18 == -1;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        int i19 = this.f102087e;
        long j18 = this.f102088f;
        java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
        kotlin.jvm.internal.o.f(c18, "listToString(...)");
        o3Var2.Xj(1, z18, str2, i19, j18, c18, this.f102091i);
    }
}
