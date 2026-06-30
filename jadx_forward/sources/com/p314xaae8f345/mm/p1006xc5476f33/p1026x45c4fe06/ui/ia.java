package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes13.dex */
public class ia extends android.view.ContextThemeWrapper {

    /* renamed from: a, reason: collision with root package name */
    public android.content.res.Resources f171315a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.LayoutInflater f171316b;

    public ia(android.content.Context context) {
        attachBaseContext(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.content.res.Resources e17;
        android.app.Activity a17 = q75.a.a(context);
        if (a17 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            e17 = ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) a17).m78734x1800569e();
            if (e17.getConfiguration().orientation != 1 && !com.p314xaae8f345.mm.ui.bk.Q()) {
                android.content.res.Resources resources = new android.content.res.Resources(e17.getAssets(), e17.getDisplayMetrics(), e17.getConfiguration());
                android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(a17);
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
            e17 = new j65.j(jVar.f379492c, jVar.f379490a, jVar.f379491b);
        } else {
            e17 = j65.j.e(context.getResources(), context, true);
        }
        this.f171315a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ha(e17, j65.f.d());
        getTheme().getResources().getDisplayMetrics().setTo(this.f171315a.getDisplayMetrics());
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources;
        return (getAssets() == null || (resources = this.f171315a) == null) ? super.getResources() : resources;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        android.view.LayoutInflater layoutInflater = this.f171316b;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        android.view.LayoutInflater c17 = com.p314xaae8f345.mm.ui.id.c((android.view.LayoutInflater) super.getSystemService("layout_inflater"));
        this.f171316b = c17;
        return c17;
    }

    public ia(android.content.Context context, int i17) {
        super(context, i17);
        a(context);
    }
}
