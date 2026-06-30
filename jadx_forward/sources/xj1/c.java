package xj1;

/* loaded from: classes7.dex */
public final class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 f536315d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 c12708x81c12732) {
        this.f536315d = c12708x81c12732;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 c12708x81c12732 = this.f536315d;
        if (c12708x81c12732.mo7430x19263085() == null) {
            return true;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.ActivityC12710xf93fa716.f171181d;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c12708x81c12732.mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x19263085);
        xj1.b0 b0Var = c12708x81c12732.f171173i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
        int intValue = ((java.lang.Number) ((jz5.n) c12708x81c12732.f171177p).mo141623x754a37bb()).intValue();
        java.lang.String operateReportSceneId = (java.lang.String) ((jz5.n) c12708x81c12732.f171178q).mo141623x754a37bb();
        java.util.ArrayList dataList = b0Var.f536313d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operateReportSceneId, "operateReportSceneId");
        android.content.Intent intent = new android.content.Intent(mo7430x19263085, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.ActivityC12710xf93fa716.class);
        intent.putExtra("KEY_SORT_DATA_LIST", dataList);
        intent.putExtra("KEY_OPERATE_REPORT_SCENE", intValue);
        intent.putExtra("KEY_OPERATE_REPORT_SCENE_ID", operateReportSceneId);
        intent.addFlags(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo7430x19263085, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionSortUI$Companion", "startSortList", "(Landroid/content/Context;Ljava/util/ArrayList;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo7430x19263085.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mo7430x19263085, "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionSortUI$Companion", "startSortList", "(Landroid/content/Context;Ljava/util/ArrayList;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo7430x19263085.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559256k, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        c12708x81c12732.f171174m = true;
        return true;
    }
}
