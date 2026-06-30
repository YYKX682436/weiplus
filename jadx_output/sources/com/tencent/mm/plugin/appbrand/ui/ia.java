package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes13.dex */
public class ia extends android.view.ContextThemeWrapper {

    /* renamed from: a, reason: collision with root package name */
    public android.content.res.Resources f89782a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.LayoutInflater f89783b;

    public ia(android.content.Context context) {
        attachBaseContext(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.content.res.Resources e17;
        android.app.Activity a17 = q75.a.a(context);
        if (a17 instanceof com.tencent.mm.ui.MMFragmentActivity) {
            e17 = ((com.tencent.mm.ui.MMFragmentActivity) a17).getOriginalResources();
            if (e17.getConfiguration().orientation != 1 && !com.tencent.mm.ui.bk.Q()) {
                android.content.res.Resources resources = new android.content.res.Resources(e17.getAssets(), e17.getDisplayMetrics(), e17.getConfiguration());
                android.graphics.Point h17 = com.tencent.mm.ui.bk.h(a17);
                int min = java.lang.Math.min(h17.x, h17.y);
                if (min >= resources.getDisplayMetrics().heightPixels) {
                    resources.getDisplayMetrics().heightPixels = min;
                }
                e17 = resources;
            }
        } else if (!(context instanceof android.app.Application) && context.getApplicationContext() != null) {
            e17 = context instanceof android.content.ContextWrapper ? ((android.content.ContextWrapper) context).getBaseContext().getResources() : context.getResources();
        } else if (context.getResources() instanceof j65.j) {
            j65.j jVar = (j65.j) context.getResources();
            e17 = new j65.j(jVar.f297959c, jVar.f297957a, jVar.f297958b);
        } else {
            e17 = j65.j.e(context.getResources(), context, true);
        }
        this.f89782a = new com.tencent.mm.plugin.appbrand.ui.ha(e17, j65.f.d());
        getTheme().getResources().getDisplayMetrics().setTo(this.f89782a.getDisplayMetrics());
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources;
        return (getAssets() == null || (resources = this.f89782a) == null) ? super.getResources() : resources;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        android.view.LayoutInflater layoutInflater = this.f89783b;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        android.view.LayoutInflater c17 = com.tencent.mm.ui.id.c((android.view.LayoutInflater) super.getSystemService("layout_inflater"));
        this.f89783b = c17;
        return c17;
    }

    public ia(android.content.Context context, int i17) {
        super(context, i17);
        a(context);
    }
}
