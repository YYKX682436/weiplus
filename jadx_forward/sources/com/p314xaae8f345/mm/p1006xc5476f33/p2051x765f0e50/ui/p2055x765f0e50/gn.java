package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class gn implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17464x86570215 f242614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f242615b;

    public gn(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17464x86570215 activityC17464x86570215, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f242614a = activityC17464x86570215;
        this.f242615b = c0Var;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$onCreate$2", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        int scrollY = view.getScrollY();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17464x86570215 activityC17464x86570215 = this.f242614a;
        int b17 = i65.a.b(activityC17464x86570215.mo55332x76847179(), 80);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f242615b;
        if (scrollY > b17) {
            if (c0Var.f391645d) {
                activityC17464x86570215.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574613ix4);
                activityC17464x86570215.mo64405x4dab7448(activityC17464x86570215.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
                activityC17464x86570215.m78605xc85f0ffa();
                c0Var.f391645d = false;
            }
        } else if (!c0Var.f391645d) {
            activityC17464x86570215.mo54450xbf7c1df6("");
            activityC17464x86570215.mo64405x4dab7448(activityC17464x86570215.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            activityC17464x86570215.m78554x41d7d42(activityC17464x86570215.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            activityC17464x86570215.m78605xc85f0ffa();
            c0Var.f391645d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI$onCreate$2", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
