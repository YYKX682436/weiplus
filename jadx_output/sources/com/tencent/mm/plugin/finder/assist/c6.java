package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class c6 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f102060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f102061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f102062c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102064e;

    public c6(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, androidx.appcompat.app.AppCompatActivity appCompatActivity, int i17, r45.qt2 qt2Var, yz5.l lVar) {
        this.f102060a = finderItem;
        this.f102061b = appCompatActivity;
        this.f102062c = i17;
        this.f102063d = qt2Var;
        this.f102064e = lVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        androidx.appcompat.app.AppCompatActivity activity = this.f102061b;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f102060a;
        if (i17 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            arrayList = stringArrayListExtra;
            com.tencent.mars.xlog.Log.i("FinderCommonService", "share finderObject " + finderItem.getId() + " to " + arrayList);
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().h(arrayList);
            if (!arrayList.isEmpty()) {
                kotlin.jvm.internal.o.g(activity, "activity");
                java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
                if (e27 != null) {
                    e27.a(new ec2.a(1, finderItem.getId(), finderItem.getDupFlag()));
                }
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
        long j17 = i17 == -1 ? 1L : 2L;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        long id6 = finderItem.getId();
        java.lang.String dupFlag = finderItem.getDupFlag();
        int i18 = this.f102062c;
        java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ";");
        kotlin.jvm.internal.o.f(c18, "listToString(...)");
        com.tencent.mm.plugin.finder.report.o3.Vj(o3Var, id6, dupFlag, i18, j17, c18, this.f102063d, arrayList.size(), null, null, 384, null);
        yz5.l lVar = this.f102064e;
        if (lVar != null) {
            lVar.invoke(arrayList);
        }
    }
}
