package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class w9 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa f252273o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar, java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view) {
        super(str, yVar, view);
        this.f252273o = paVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void d(java.lang.Object obj, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "bindComponentDataOnExposeFirst() called with: snsInfo = [" + c17933xe8d1b226 + "]");
        if (c17933xe8d1b226 != null) {
            java.lang.String str = c17933xe8d1b226.m70354x74235b3e().f38160x3f8f2c45;
            java.lang.String str2 = c17933xe8d1b226.m70354x74235b3e().f38158x7de48304;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar = this.f252273o;
            android.widget.TextView textView = (android.widget.TextView) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar).findViewById(com.p314xaae8f345.mm.R.id.f564036gb);
            android.widget.TextView textView2 = (android.widget.TextView) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar).findViewById(com.p314xaae8f345.mm.R.id.f563997f8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar).findViewById(com.p314xaae8f345.mm.R.id.f564003fe);
            c22646x1e9ca55.m81437x205ac394(i65.a.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar), 4));
            android.widget.ImageView imageView = (android.widget.ImageView) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar).findViewById(com.p314xaae8f345.mm.R.id.f564002fd);
            if (c17933xe8d1b226.m70354x74235b3e().f38157x18416701 == null || android.text.TextUtils.isEmpty(c17933xe8d1b226.m70354x74235b3e().f38157x18416701.f38288x61ad9236)) {
                c22646x1e9ca55.setVisibility(8);
            } else {
                c22646x1e9ca55.setVisibility(0);
                a84.z.c(c17933xe8d1b226.m70354x74235b3e().f38157x18416701.f38288x61ad9236, imageView);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            paVar.t(str, str2, textView, textView2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            if (!android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
                textView.setTextSize(0, a84.d0.b(17));
            } else {
                textView.setTextSize(0, a84.d0.b(15));
            }
            android.view.View g17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(g17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View h17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.h(paVar);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(h17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.j(paVar, (android.widget.Button) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar).findViewById(com.p314xaae8f345.mm.R.id.f563978es));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.c(paVar, c17933xe8d1b226);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18410x906a0652 c18410x906a0652 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18410x906a0652) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar).findViewById(com.p314xaae8f345.mm.R.id.f563979et);
            c18410x906a0652.setVisibility(8);
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar) instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTagListView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                try {
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", e17.toString());
                }
                if (ca4.m0.Z(activity)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTagListView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                } else {
                    c18410x906a0652.m71258x734686de(activity);
                    if (!((java.util.ArrayList) c17933xe8d1b226.m70354x74235b3e().f38159x8a077e15.f247556a).equals(c18410x906a0652.getTag())) {
                        c18410x906a0652.removeAllViews();
                        if (((java.util.ArrayList) c17933xe8d1b226.m70354x74235b3e().f38159x8a077e15.f247556a).size() > 0) {
                            c18410x906a0652.setVisibility(0);
                            c18410x906a0652.m71261x4860900e(i65.a.b(activity, 8));
                            c18410x906a0652.a(c17933xe8d1b226.m70354x74235b3e().f38159x8a077e15.f247556a);
                        }
                        c18410x906a0652.setTag(c17933xe8d1b226.m70354x74235b3e().f38159x8a077e15.f247556a);
                    } else if (((java.util.ArrayList) c17933xe8d1b226.m70354x74235b3e().f38159x8a077e15.f247556a).size() > 0) {
                        c18410x906a0652.setVisibility(0);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTagListView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                }
            }
            if (android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && (c17933xe8d1b226.m70354x74235b3e().f38157x18416701 == null || android.text.TextUtils.isEmpty(c17933xe8d1b226.m70354x74235b3e().f38157x18416701.f38288x61ad9236))) {
                if (c18410x906a0652.getVisibility() == 0) {
                    if (c18410x906a0652.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
                        ((android.view.ViewGroup.MarginLayoutParams) c18410x906a0652.getLayoutParams()).topMargin = i65.a.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar), 8);
                        c18410x906a0652.requestLayout();
                    }
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(paVar) != null && (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(paVar).getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                    ((android.view.ViewGroup.MarginLayoutParams) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(paVar).getLayoutParams()).topMargin = i65.a.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar), 8);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(paVar).requestLayout();
                }
            }
            android.view.View findViewById = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.e(paVar).findViewById(com.p314xaae8f345.mm.R.id.b7k);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.e(paVar).findViewById(com.p314xaae8f345.mm.R.id.kmv);
            if (viewGroup != null) {
                viewGroup.setPadding(0, 0, 0, i65.a.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar), 16));
                if ((m70346x10413e67 != null && m70346x10413e67.m70106x7ba4fd89()) || l44.s4.i(c17933xe8d1b226.m70354x74235b3e(), m70346x10413e67)) {
                    viewGroup.setPadding(0, 0, 0, i65.a.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar), 12));
                }
                viewGroup.requestLayout();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public boolean n(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar = this.f252273o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0 v0Var = paVar.f251741z;
        boolean z17 = false;
        boolean O = v0Var != null ? v0Var.O(c17933xe8d1b226) : false;
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e().f38157x18416701 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        } else {
            if (c17933xe8d1b226.m70354x74235b3e().f38157x18416701.f38289x87031460 == 1 && !com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.w(c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar)) && !O) {
                z17 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        if (c17933xe8d1b226 == null || c17933xe8d1b2262 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
            z17 = false;
        } else {
            z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m(c17933xe8d1b226.m70367x7525eefd(), c17933xe8d1b2262.m70367x7525eefd());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "resetComponentState() called");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar = this.f252273o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.j(paVar, (android.widget.Button) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.h(paVar).findViewById(com.p314xaae8f345.mm.R.id.f563978es));
        android.view.View g17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(g17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View h17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.h(paVar);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(h17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar).findViewById(com.p314xaae8f345.mm.R.id.f564036gb);
        if (textView != null) {
            textView.setTextSize(0, a84.d0.b(17));
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.e(paVar).findViewById(com.p314xaae8f345.mm.R.id.kmv);
        if (viewGroup != null) {
            viewGroup.setPadding(0, 0, 0, i65.a.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar), 16));
        }
        android.widget.Button button = (android.widget.Button) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar).findViewById(com.p314xaae8f345.mm.R.id.f563978es);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18410x906a0652 c18410x906a0652 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18410x906a0652) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.g(paVar).findViewById(com.p314xaae8f345.mm.R.id.f563979et);
        if (c18410x906a0652 != null && (c18410x906a0652.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) c18410x906a0652.getLayoutParams()).topMargin = i65.a.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar), 12);
            c18410x906a0652.requestLayout();
        }
        if (button != null && (button.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) button.getLayoutParams()).topMargin = i65.a.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar), 12);
            button.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
    }
}
