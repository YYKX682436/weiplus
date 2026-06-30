package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes5.dex */
public final class e7 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f102125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f102126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f102127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ht0 f102128g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102129h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102130i;

    public e7(com.tencent.mm.ui.MMActivity mMActivity, int i17, long j17, r45.ht0 ht0Var, java.lang.String str, int i18) {
        this.f102125d = mMActivity;
        this.f102126e = i17;
        this.f102127f = j17;
        this.f102128g = ht0Var;
        this.f102129h = str;
        this.f102130i = i18;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.MMActivity activity = this.f102125d;
        if (i18 == -1) {
            db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.f490560yi));
        }
        if (this.f102126e == 7) {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            boolean z17 = i18 == -1;
            long j17 = this.f102127f;
            r45.ht0 ht0Var = this.f102128g;
            java.lang.String string = ht0Var != null ? ht0Var.getString(0) : null;
            kotlin.jvm.internal.o.g(activity, "activity");
            o3Var.Nj(2, z17, "", j17, string, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
            return;
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        boolean z18 = i18 == -1;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = this.f102129h;
        if (str == null) {
            str = "";
        }
        o3Var2.Xj(2, z18, str, this.f102126e, this.f102127f, "", this.f102130i);
    }
}
