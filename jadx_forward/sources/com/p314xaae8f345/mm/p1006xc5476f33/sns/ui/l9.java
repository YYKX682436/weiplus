package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class l9 implements n55.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9 f251267b;

    public l9(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9 n9Var) {
        this.f251266a = str;
        this.f251267b = n9Var;
    }

    @Override // n55.e
    public void a(o55.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9 n9Var = this.f251267b;
        java.lang.String workTagId = this.f251266a;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightWidgetBackgroundVideoHandler", "result is null, workTagId: " + workTagId);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9.a(n9Var);
            if (a17 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(workTagId, "$workTagId");
                a17.d(3, null, workTagId);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is find " + workTagId);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 a18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n9.a(n9Var);
            if (a18 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(workTagId, "$workTagId");
                a18.d(1, aVar, workTagId);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1$1");
    }
}
