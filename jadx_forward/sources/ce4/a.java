package ce4;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final ce4.b f122323a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f122324b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f122325c;

    public a(ce4.b pcContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
        this.f122323a = pcContext;
        this.f122324b = d();
    }

    public final ce4.a a(java.lang.Class clazz) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("component", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        ce4.a k17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1) this.f122323a).k(clazz);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("component", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        return k17;
    }

    public java.util.ArrayList b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dependComponents", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dependComponents", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        return arrayList;
    }

    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1 n1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1) this.f122323a;
        n1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContext", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = n1Var.f251490c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC21394xb3d2c0cf, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContext", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        return abstractActivityC21394xb3d2c0cf;
    }

    public abstract java.lang.String d();

    public final void e(java.lang.String msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("logE", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f122324b, hashCode() + " >> " + msg);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("logE", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
    }

    public final void f(java.lang.String msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("logI", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f122324b, hashCode() + " >> " + msg);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("logI", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
    }

    public final void g(java.lang.String msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("logW", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f122324b, hashCode() + " >> " + msg);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("logW", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
    }

    public boolean h(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        if (this.f122325c) {
            g("isCreated");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
            return false;
        }
        this.f122325c = true;
        for (ce4.a aVar : b()) {
            if (!aVar.f122325c) {
                aVar.h(bundle);
            }
        }
        f("onCreate");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        return true;
    }

    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
        this.f122325c = false;
        f("onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.component.BasicWidgetComponent");
    }
}
