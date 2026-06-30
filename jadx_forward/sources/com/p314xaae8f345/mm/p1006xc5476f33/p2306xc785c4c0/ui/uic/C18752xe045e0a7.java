package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.uic;

/* renamed from: com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC */
/* loaded from: classes8.dex */
public final class C18752xe045e0a7 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f256655d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.uic.C18754xd4b7fc71 f256656e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.uic.C18753x63b8c505 f256657f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f256658g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC$searchIconVisibilityListener$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC$homePageSearchResultChangedListener$1] */
    public C18752xe045e0a7(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f256655d = jz5.h.b(new en4.i(activity));
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f256656e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6204x6dae693e>(this, a0Var) { // from class: com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC$searchIconVisibilityListener$1
            {
                this.f39173x3fe91575 = -855851730;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6204x6dae693e c6204x6dae693e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6204x6dae693e event = c6204x6dae693e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                event.f136456g.getClass();
                throw null;
            }
        };
        this.f256657f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5642x2df33319>(this, a0Var) { // from class: com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC$homePageSearchResultChangedListener$1
            {
                this.f39173x3fe91575 = -1200661207;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5642x2df33319 c5642x2df33319) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5642x2df33319 event = c5642x2df33319;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                event.f135970g.getClass();
                throw null;
            }
        };
    }

    public final void T6(boolean z17) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j) ((jz5.n) this.f256655d).mo141623x754a37bb()).h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349();
        if (this.f256658g) {
            this.f256658g = false;
        }
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ogi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        mo144222x4ff8c0f0.setContentDescription(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cvh));
        mo144222x4ff8c0f0.setOnClickListener(new en4.g(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/uic/TopStorySearchUIC", "handleSearchButtonVisibility", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/topstory/ui/uic/TopStorySearchUIC", "handleSearchButtonVisibility", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        mo48813x58998cd();
        mo48813x58998cd();
        R6(new en4.h(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        mo48814x2efc64();
        mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }
}
