package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class k extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f251126d;

    /* renamed from: e, reason: collision with root package name */
    public final ca4.j f251127e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f251128f;

    /* renamed from: g, reason: collision with root package name */
    public int f251129g = 0;

    public k(android.content.Context context, ca4.j jVar) {
        this.f251127e = null;
        this.f251128f = null;
        this.f251126d = context;
        this.f251127e = jVar;
        this.f251128f = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        int i17 = this.f251129g;
        ca4.j jVar = this.f251127e;
        if (i17 == 1) {
            int size = jVar.f121485a.f121473b.f38084x2725a301.a().size();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
            return size;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l lVar = jVar.f121485a.f121472a.f38173x6320bd96;
        int size2 = (lVar != null ? ((java.util.LinkedList) lVar.f247572a).size() : 0) + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return size2;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        java.lang.Object obj = this.f251127e.f121485a.f121473b.f38084x2725a301.a().get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        long j17 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return j17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        android.content.Context context = this.f251126d;
        android.view.View inflate = view == null ? android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569513d5, null) : view;
        ca4.j jVar = this.f251127e;
        inflate.setTag(jVar);
        int i18 = this.f251129g;
        java.lang.String str2 = this.f251128f;
        if (i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) getItem(i17);
            str = "zh_CN".equals(str2) ? cVar.f247475a : ("zh_TW".equals(str2) || "zh_HK".equals(str2)) ? cVar.f247476b : cVar.f247477c;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = cVar.f247477c;
            }
        } else if (i17 == 0) {
            if (jVar != null) {
                ca4.i iVar = jVar.f121485a;
                if (iVar.f121472a != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = iVar.f121473b;
                    java.lang.String str3 = "zh_CN".equals(str2) ? c17902x72cc1771.f38073xa3c0d722 : ("zh_TW".equals(str2) || "zh_HK".equals(str2)) ? c17902x72cc1771.f38075xa3c0d93a : c17902x72cc1771.f38074xa3c0d760;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8p);
                    }
                    str = str3;
                }
            }
            str = "";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l lVar = jVar.f121485a.f121472a.f38173x6320bd96;
            if (lVar != null) {
                java.util.List list = lVar.f247572a;
                if (i17 <= ((java.util.LinkedList) list).size()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m mVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m) ((java.util.LinkedList) list).get(i17 - 1);
                    str = "zh_CN".equals(str2) ? mVar.f247590a : ("zh_TW".equals(str2) || "zh_HK".equals(str2)) ? mVar.f247592c : mVar.f247591b;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        str = mVar.f247591b;
                    }
                }
            }
            str = "";
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564212l1);
        if (jVar.f121485a.f121473b.f38094x6a99a254) {
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        } else {
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5));
        }
        textView.setText(str);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564211l0);
        int i19 = i17 == getCount() - 1 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AdUnLikeReasonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/AdUnLikeReasonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return inflate;
    }
}
