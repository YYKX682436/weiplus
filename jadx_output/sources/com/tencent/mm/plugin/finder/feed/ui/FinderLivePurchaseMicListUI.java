package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePurchaseMicListUI;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLivePurchaseMicListUI extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo f109408t;

    public FinderLivePurchaseMicListUI(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f109408t = finderJumpInfo;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.viewmodel.component.jo.class);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        super.onActivityCreated(bundle);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo = this.f109408t;
        if (jumpInfo != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.jo joVar = (com.tencent.mm.plugin.finder.viewmodel.component.jo) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.jo.class);
            joVar.getClass();
            kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
            android.os.SystemClock.elapsedRealtime();
            new java.util.ArrayList();
            new java.util.HashMap();
            new java.util.HashMap();
            new java.util.HashMap();
            new java.util.HashMap();
            new java.util.ArrayList();
            new java.util.ArrayList();
            new java.util.ArrayList();
            r45.k74 lite_app_info = jumpInfo.getLite_app_info();
            java.lang.String string2 = lite_app_info != null ? lite_app_info.getString(0) : null;
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.lang.String str3 = "";
            if (lite_app_info == null || (str = lite_app_info.getString(1)) == null) {
                str = "";
            }
            if (lite_app_info == null || (str2 = lite_app_info.getString(2)) == null) {
                str2 = "";
            }
            if (lite_app_info != null && (string = lite_app_info.getString(10)) != null) {
                str3 = string;
            }
            bundle2.putString("appId", string2);
            bundle2.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str);
            bundle2.putString("query", str2);
            bundle2.putString("minVersion", str3);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).qk(joVar.f134875f, bundle2, true, false, new com.tencent.mm.plugin.finder.viewmodel.component.io(joVar));
        }
    }
}
