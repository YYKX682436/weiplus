package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes5.dex */
public final class g6 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.g f102194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f102196f;

    public g6(zy2.g gVar, android.content.Context context, r45.ev2 ev2Var) {
        this.f102194d = gVar;
        this.f102195e = context;
        this.f102196f = ev2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (i18 == -1) {
            arrayList = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>(0);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share collection " + this.f102194d.f477383b + " to " + arrayList);
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().h(arrayList);
        }
        long j17 = i18 == -1 ? 1L : 2L;
        androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) this.f102195e;
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        r45.ev2 ev2Var = this.f102196f;
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ";");
        kotlin.jvm.internal.o.f(c17, "listToString(...)");
        o3Var.Pj(ev2Var, j17, c17, arrayList.size(), V6);
    }
}
