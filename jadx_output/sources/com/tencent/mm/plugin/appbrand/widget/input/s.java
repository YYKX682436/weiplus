package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.widget.input.s f91646b = new com.tencent.mm.plugin.appbrand.widget.input.s();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.r f91647a = new com.tencent.mm.plugin.appbrand.widget.input.r(null);

    public void a(com.tencent.mm.plugin.appbrand.page.fb fbVar) {
        if (fbVar == null) {
            return;
        }
        this.f91647a.f91640a.delete(fbVar.hashCode());
        try {
            fbVar.getWrapperView().setFocusable(true);
            fbVar.getWrapperView().setFocusableInTouchMode(true);
            fbVar.getContentView().setFocusable(true);
            fbVar.getContentView().setFocusableInTouchMode(true);
        } catch (java.lang.NullPointerException unused) {
        }
    }

    public void b(com.tencent.mm.plugin.appbrand.page.fb fbVar) {
        if (fbVar == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.r rVar = this.f91647a;
        rVar.f91640a.put(fbVar.hashCode(), rVar.f91640a.get(fbVar.hashCode(), 0) + 1);
        try {
            fbVar.getWrapperView().setFocusable(false);
            fbVar.getWrapperView().setFocusableInTouchMode(false);
            fbVar.getContentView().setFocusable(false);
            fbVar.getContentView().setFocusableInTouchMode(false);
            if (fbVar.getWrapperView() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) fbVar.getWrapperView()).setDescendantFocusability(393216);
            }
        } catch (java.lang.NullPointerException unused) {
        }
    }

    public void c(com.tencent.mm.plugin.appbrand.page.fb fbVar) {
        if (fbVar == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.r rVar = this.f91647a;
        int i17 = rVar.f91640a.get(fbVar.hashCode(), 0) - 1;
        if (i17 <= 0) {
            a(fbVar);
        } else {
            rVar.f91640a.put(fbVar.hashCode(), i17);
        }
    }
}
