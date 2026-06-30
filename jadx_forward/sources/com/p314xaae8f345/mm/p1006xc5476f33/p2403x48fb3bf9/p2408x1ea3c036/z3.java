package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public final class z3 extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f264255q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Intent f264256r;

    /* renamed from: s, reason: collision with root package name */
    public android.app.Activity f264257s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "page"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            android.content.Context r0 = r4.f488143d
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            r3.<init>(r2)
            r3.f264255q = r4
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r3.f264256r = r2
            android.os.Bundle r4 = r4.f488190n
            r2.putExtras(r4)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            android.app.Activity r0 = (android.app.Activity) r0
            r3.f264257s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.z3.<init>(com.tencent.mm.plugin.webview.luggage.e0):void");
    }

    @Override // ak3.i, ak3.c
    public android.view.ViewGroup a() {
        android.view.Window window;
        if (!u()) {
            android.view.ViewParent parent = this.f264255q.f488187h.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            return (android.view.ViewGroup) parent;
        }
        android.app.Activity activity = this.f264257s;
        android.view.View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        return (android.view.ViewGroup) decorView;
    }

    @Override // ak3.i, ak3.c
    public int b() {
        return u() ? -1 : 0;
    }

    @Override // ak3.i, ak3.c
    public void f(ak3.b bVar) {
        if (u()) {
            super.f(bVar);
        } else if (bVar != null) {
            bVar.mo2156x815f5438(true);
        }
    }

    @Override // ak3.i, ak3.c
    public boolean g() {
        return mo2159xc2a54588() != null;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getActivity */
    public android.app.Activity mo2157x19263085() {
        return this.f264257s;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getContentView */
    public android.view.View mo2159xc2a54588() {
        if (u()) {
            android.app.Activity activity = this.f264257s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            return ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).m78735x28280f95();
        }
        android.view.View view = this.f264255q.f488187h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type me.imid.swipebacklayout.lib.SwipeBackLayout");
        return (me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab) view;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getIntent */
    public android.content.Intent mo2160x1e885992() {
        return this.f264256r;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getMaskView */
    public android.view.View mo2161x8c409d27() {
        if (u()) {
            android.app.Activity activity = this.f264257s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            return ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).m78735x28280f95().m81444x1eccc7b7();
        }
        android.view.View view = this.f264255q.f488187h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type me.imid.swipebacklayout.lib.SwipeBackLayout");
        return ((me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab) view).m147195xb42a7cc();
    }

    @Override // ak3.i, ak3.c
    public void h(ak3.a aVar) {
        this.f87119h = aVar;
        if (!u()) {
            android.view.View view = this.f264255q.f488187h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type me.imid.swipebacklayout.lib.SwipeBackLayout");
            ((me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab) view).c(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y3(aVar));
            return;
        }
        android.app.Activity activity = this.f264257s;
        if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).m78735x28280f95() != null) {
                android.app.Activity activity2 = this.f264257s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity2).m78735x28280f95().m81456x372c76d3(this.f87118g);
            }
        }
    }

    @Override // ak3.i, ak3.c
    public void i(boolean z17) {
    }

    @Override // ak3.i, ak3.c
    public void j(boolean z17, jk3.e helper) {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        if (((sd.u) this.f264255q.f488145f).f488186a.f(false)) {
            return;
        }
        if (z17) {
            android.app.Activity activity = this.f264257s;
            if (activity != null && (intent4 = activity.getIntent()) != null) {
                intent4.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
            }
            android.app.Activity activity2 = this.f264257s;
            if (activity2 != null && (intent3 = activity2.getIntent()) != null) {
                intent3.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            }
        } else {
            android.app.Activity activity3 = this.f264257s;
            if (activity3 != null && (intent2 = activity3.getIntent()) != null) {
                intent2.putExtra("MMActivity.OverrideExitAnimation", 0);
            }
            android.app.Activity activity4 = this.f264257s;
            if (activity4 != null && (intent = activity4.getIntent()) != null) {
                intent.putExtra("MMActivity.OverrideEnterAnimation", 0);
            }
        }
        android.app.Activity activity5 = this.f264257s;
        if (activity5 != null) {
            activity5.finish();
        }
    }

    @Override // ak3.i
    public void r(android.app.Activity activity) {
        this.f264257s = activity;
    }

    public final boolean u() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useActivityEnv: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f264255q;
        sb6.append(((sd.u) e0Var.f488145f).f488186a.f488196d.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewMultiTaskPageAdapter", sb6.toString());
        return ((sd.u) e0Var.f488145f).f488186a.f488196d.size() <= 1;
    }
}
