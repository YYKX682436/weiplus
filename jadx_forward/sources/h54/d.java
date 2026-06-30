package h54;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final zg0.v2 f360616a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f360617b;

    /* renamed from: c, reason: collision with root package name */
    public final m54.l f360618c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f360619d;

    /* renamed from: e, reason: collision with root package name */
    public final h54.a f360620e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f360621f;

    public d(zg0.v2 jsApiHandler, java.lang.String jsCallbackId, m54.l lVar, java.lang.String url, android.content.Context context, h54.a formData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiHandler, "jsApiHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsCallbackId, "jsCallbackId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formData, "formData");
        this.f360616a = jsApiHandler;
        this.f360617b = jsCallbackId;
        this.f360618c = lVar;
        this.f360619d = url;
        this.f360620e = formData;
        this.f360621f = new java.lang.ref.WeakReference(context);
    }

    public final void a(java.lang.String msg, java.util.Map value) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callbackToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            f(msg, value);
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new h54.c(this, msg, value));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callbackToJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCallbackId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCallbackId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        return this.f360617b;
    }

    public final android.content.Context c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        android.content.Context context = (android.content.Context) this.f360621f.get();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        return context;
    }

    public final h54.a d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFormData", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFormData", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        return this.f360620e;
    }

    public final m54.l e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageParam", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageParam", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        return this.f360618c;
    }

    public final void f(java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((nw4.n) this.f360616a).O(this.f360617b, str, map, true);
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormJsApiContext");
    }
}
