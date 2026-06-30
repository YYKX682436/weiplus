package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class k9 implements n55.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 f251146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251147b;

    public k9(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 o9Var, java.lang.String str) {
        this.f251146a = o9Var;
        this.f251147b = str;
    }

    @Override // n55.e
    public void a(o55.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$getRemuxVideoWork$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getRemuxVideoWork >> workType: ");
        sb6.append(aVar != null ? java.lang.Integer.valueOf(aVar.f424695a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 o9Var = this.f251146a;
        java.lang.String str = this.f251147b;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "workType is error");
            o9Var.d(3, aVar, str);
        } else {
            int i17 = aVar.f424695a;
            if (i17 == 4007) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is done " + str);
                o9Var.d(1, aVar, str);
            } else if (i17 == 4008) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is done error");
                o9Var.d(3, aVar, str);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is no done");
                o9Var.d(2, aVar, str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$getRemuxVideoWork$1");
    }
}
