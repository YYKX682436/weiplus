package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class qd implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td f251871a;

    public qd(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td tdVar) {
        this.f251871a = tdVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1
    /* renamed from: onCancel */
    public void mo71188x3d6f0539() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td tdVar = this.f251871a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.b(tdVar) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.b(tdVar).setBackground(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        android.os.Handler handler = tdVar.f252045f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        handler.removeCallbacksAndMessages(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdPressGestureCtrl", "onCancel, isCalledOnFinish=" + tdVar.f252051l);
        if (tdVar.f252051l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdPressGestureCtrl", "onCancel, isCalledOnFinish==true");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.a(tdVar) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdPressGestureCtrl", "onCancel, mGestureInfo == null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 b1Var = tdVar.f252053n;
        if (b1Var != null) {
            b1Var.mo71188x3d6f0539();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.c(tdVar);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - tdVar.f252049j);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.f(c17, 1, currentTimeMillis, tdVar.f252044e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCancel", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1
    /* renamed from: onClick */
    public void mo71189xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdPressGestureCtrl", "onClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 b1Var = this.f251871a.f252053n;
        if (b1Var != null) {
            b1Var.mo71189xaf6b9ae9(view);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1
    /* renamed from: onFinish */
    public void mo71190x42fe6352() {
        int m71253x37b632de;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish, isCalledOnFinish=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td tdVar = this.f251871a;
        sb6.append(tdVar.f252051l);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdPressGestureCtrl", sb6.toString());
        if (tdVar.f252051l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdPressGestureCtrl", "onFinish, secondTimes");
        } else {
            tdVar.f252051l = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            android.os.Handler handler = tdVar.f252045f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            handler.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pd(this), 100L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 b1Var = tdVar.f252053n;
            if (b1Var != null) {
                b1Var.mo71190x42fe6352();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18407xdfdc90f6 c18407xdfdc90f6 = tdVar.f252042c;
            if (c18407xdfdc90f6 == null) {
                m71253x37b632de = 0;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
                m71253x37b632de = c18407xdfdc90f6.m71253x37b632de();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.c(tdVar);
            int currentTimeMillis = (int) ((m71253x37b632de + java.lang.System.currentTimeMillis()) - tdVar.f252049j);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.f(c17, 2, currentTimeMillis, tdVar.f252044e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1
    /* renamed from: onStart */
    public void mo71191xb05099c3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td tdVar = this.f251871a;
        tdVar.f252049j = currentTimeMillis;
        tdVar.f252051l = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        android.os.Handler handler = tdVar.f252045f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        handler.removeCallbacksAndMessages(null);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.a(tdVar) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdPressGestureCtrl", "onStart, mGestureInfo == null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdPressGestureCtrl", "onStart, isCalledOnFinish=" + tdVar.f252051l);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 b1Var = tdVar.f252053n;
        if (b1Var != null) {
            b1Var.mo71191xb05099c3();
        }
        ca4.z0.I0(new long[]{0, 60});
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.b(tdVar) != null) {
            android.view.View b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.b(tdVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdPressGestureCtrl$2", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/sns/ui/SnsAdPressGestureCtrl$2", "onStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View b18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.b(tdVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            android.graphics.drawable.Drawable drawable = tdVar.f252048i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
            b18.setBackground(drawable);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$2");
    }
}
