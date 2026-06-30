package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f82337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor f82338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f82339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f82340h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f82341i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f82342m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f82343n;

    public i(android.content.Context context, java.util.List list, com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor, boolean z17, boolean z18, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult, int i17, java.util.Map map) {
        this.f82336d = context;
        this.f82337e = list;
        this.f82338f = getSubscribeMsgListExecutor;
        this.f82339g = z17;
        this.f82340h = z18;
        this.f82341i = subscribeMsgRequestResult;
        this.f82342m = i17;
        this.f82343n = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f82338f;
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = this.f82341i;
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.h hVar = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.h(getSubscribeMsgListExecutor, subscribeMsgRequestResult);
        android.content.Context context = this.f82336d;
        if (context instanceof android.app.Application) {
            hVar.invoke(2, this.f82337e, java.lang.Boolean.FALSE);
            com.tencent.mars.xlog.Log.w("AppBrandSubscribeMsg.GetSubscribeMsgListExecutor", "a context which is Application to perform show dialog will case [UnsupportedOperationException] here");
            return;
        }
        java.util.List list = this.f82337e;
        boolean z17 = this.f82340h;
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.f(z17, hVar, getSubscribeMsgListExecutor, this.f82343n, list, subscribeMsgRequestResult, context);
        boolean z18 = this.f82339g;
        getSubscribeMsgListExecutor.getClass();
        getSubscribeMsgListExecutor.f82301m = new m31.p1(context, list, fVar, z18, z17, new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.j(getSubscribeMsgListExecutor));
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor2 = this.f82338f;
        m31.p1 c17 = getSubscribeMsgListExecutor2.c();
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult2 = this.f82341i;
        java.lang.String str2 = subscribeMsgRequestResult2.f71795u;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c17.T = str2;
        android.widget.TextView textView = c17.f323189p;
        textView.setText(str2);
        textView.setContentDescription(c17.T);
        m31.p1 c18 = getSubscribeMsgListExecutor2.c();
        java.lang.String str4 = subscribeMsgRequestResult2.f71796v;
        if (str4 == null) {
            str4 = "";
        }
        c18.k(str4);
        m31.p1 c19 = getSubscribeMsgListExecutor2.c();
        java.lang.String value = subscribeMsgRequestResult2.f71783f;
        kotlin.jvm.internal.o.g(value, "value");
        android.widget.TextView textView2 = c19.f323188o;
        textView2.setText(value);
        textView2.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView2.getPaint().setStrokeWidth(0.8f);
        m31.p1 c27 = getSubscribeMsgListExecutor2.c();
        com.tencent.mm.msgsubscription.WordingInfo wordingInfo = subscribeMsgRequestResult2.f71788n;
        if (wordingInfo != null && (str = wordingInfo.f71825h) != null) {
            str3 = str;
        }
        c27.N = str3;
        m31.p1 c28 = getSubscribeMsgListExecutor2.c();
        java.lang.String value2 = subscribeMsgRequestResult2.f71782e;
        kotlin.jvm.internal.o.g(value2, "value");
        c28.M = value2;
        m31.p1 c29 = getSubscribeMsgListExecutor2.c();
        kotlin.jvm.internal.o.d(wordingInfo);
        java.lang.String value3 = wordingInfo.f71821d;
        kotlin.jvm.internal.o.g(value3, "value");
        android.widget.TextView textView3 = c29.f323187n;
        textView3.setText(value3);
        textView3.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView3.getPaint().setStrokeWidth(0.8f);
        m31.p1 c37 = getSubscribeMsgListExecutor2.c();
        kotlin.jvm.internal.o.d(wordingInfo);
        java.lang.String value4 = wordingInfo.f71822e;
        kotlin.jvm.internal.o.g(value4, "value");
        c37.f323192s.setText(value4);
        m31.p1 c38 = getSubscribeMsgListExecutor2.c();
        kotlin.jvm.internal.o.d(wordingInfo);
        java.lang.String value5 = wordingInfo.f71823f;
        kotlin.jvm.internal.o.g(value5, "value");
        c38.f323191r.setText(value5);
        getSubscribeMsgListExecutor2.c().V = com.tencent.mm.R.drawable.cbh;
        if (this.f82342m == 2) {
            m31.p1 c39 = getSubscribeMsgListExecutor2.c();
            kotlin.jvm.internal.o.d(wordingInfo);
            c39.h(wordingInfo.f71824g);
            getSubscribeMsgListExecutor2.c().A.setChecked(subscribeMsgRequestResult2.f71781d);
        }
        m31.p1 c47 = getSubscribeMsgListExecutor2.c();
        c47.S = false;
        c47.f323198y.setVisibility(8);
        getSubscribeMsgListExecutor2.c().L = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.g(subscribeMsgRequestResult2, this.f82343n);
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.e eVar = getSubscribeMsgListExecutor2.f82300i;
        if (eVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q) eVar).b(getSubscribeMsgListExecutor2.c());
        }
    }
}
