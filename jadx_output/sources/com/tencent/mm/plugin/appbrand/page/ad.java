package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class ad implements ni1.j, ni1.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f86412a;

    /* renamed from: b, reason: collision with root package name */
    public final pi1.e f86413b;

    public ad(com.tencent.mm.plugin.appbrand.page.v5 page) {
        pi1.e aVar;
        kotlin.jvm.internal.o.g(page, "page");
        if (page.getWindowAndroid().getStatusBar() == null) {
            aVar = (pi1.e) java.lang.reflect.Proxy.newProxyInstance(pi1.e.class.getClassLoader(), new java.lang.Class[]{pi1.e.class}, new pi1.c());
        } else {
            ((ne.a) page.b(ne.a.class)).getClass();
            aVar = new pi1.a(page);
        }
        kotlin.jvm.internal.o.f(aVar, "createHelper(...)");
        this.f86412a = page;
        this.f86413b = aVar;
    }

    @Override // ni1.j
    public void a() {
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            this.f86413b.a();
            return;
        }
        android.view.View contentView = this.f86412a.getContentView();
        if (contentView != null) {
            contentView.post(new com.tencent.mm.plugin.appbrand.page.xc(this));
        }
    }

    @Override // ni1.c
    public void b() {
        pi1.e eVar = this.f86413b;
        eVar.c();
        pi1.a aVar = eVar instanceof pi1.a ? (pi1.a) eVar : null;
        if (aVar != null) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86412a;
            xi1.g windowAndroid = v5Var.getWindowAndroid();
            kotlin.jvm.internal.o.d(windowAndroid);
            aVar.e(windowAndroid.shouldInLargeScreenCompatMode(), v5Var.getContext().getResources().getConfiguration().orientation);
        }
    }

    @Override // ni1.c
    public void c() {
        this.f86413b.b();
    }

    @Override // ni1.j
    public void d() {
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            this.f86413b.d();
            return;
        }
        android.view.View contentView = this.f86412a.getContentView();
        if (contentView != null) {
            contentView.post(new com.tencent.mm.plugin.appbrand.page.zc(this));
        }
    }

    @Override // ni1.j
    public boolean e() {
        return this.f86413b.getCurrentState() == pi1.d.HIDDEN;
    }

    @Override // ni1.c
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        pi1.e eVar = this.f86413b;
        pi1.a aVar = eVar instanceof pi1.a ? (pi1.a) eVar : null;
        if (aVar != null) {
            this.f86412a.P0(new com.tencent.mm.plugin.appbrand.page.yc(aVar, this, newConfig));
        }
    }

    @Override // ni1.c
    public void onDestroy() {
    }
}
