package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f172670a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f172671b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.ViewTreeObserver f172672c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f172673d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f172670a = runtime;
        this.f172673d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d(this);
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z zVar = this.f172670a.D1;
        if (zVar == null) {
            return;
        }
        android.view.View o17 = zVar.o(1);
        android.view.View o18 = this.f172670a.D1.o(2);
        if (!k01.j.f384572a.b(null, this.f172670a.f156336n)) {
            if (o17 == null || o18 == null || o18.getTop() == o17.getMeasuredHeight()) {
                return;
            }
            o18.setY(o17.getMeasuredHeight());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandExternalCoverWidgetManager", "set widgetContainer setY[" + o18.getTop() + ']');
            return;
        }
        if (o18 != null) {
            mi1.v vVar = this.f172670a.f156354z;
            vVar.getClass();
            android.graphics.Rect rect = new android.graphics.Rect();
            mi1.i iVar = vVar.f408237c;
            if (iVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
                throw null;
            }
            iVar.getHitRect(rect);
            o18.setTop(rect.top);
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        android.app.Activity r07 = this.f172670a.r0();
        if (r07 == null) {
            return;
        }
        try {
            if (android.text.TextUtils.isEmpty(c11809xbc286be4.C2)) {
                this.f172670a.D1.C();
                c();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0) java.lang.Class.forName(c11809xbc286be4.C2).newInstance();
            java.lang.String coverWidgetBuildData = c11809xbc286be4.D2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(coverWidgetBuildData, "coverWidgetBuildData");
            android.view.View d17 = d0Var.d(r07, coverWidgetBuildData);
            if (k01.j.f384572a.b(null, this.f172670a.f156336n)) {
                ((oa1.d) d0Var).e(this.f172670a);
            }
            d17.setLayoutParams(d0Var.c());
            this.f172670a.D1.C();
            this.f172670a.D1.z(d17, d0Var.a());
            a();
            e();
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandExternalCoverWidgetManager", e17, "", "");
        } catch (java.lang.IllegalAccessException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandExternalCoverWidgetManager", e18, "", "");
        } catch (java.lang.InstantiationException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandExternalCoverWidgetManager", e19, "", "");
        }
    }

    public final void c() {
        if (this.f172671b) {
            android.view.View o17 = this.f172670a.D1.o(1);
            d();
            o17.getViewTreeObserver().removeOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f(this.f172673d));
            this.f172671b = false;
        }
    }

    public final void d() {
        android.view.ViewTreeObserver viewTreeObserver = this.f172672c;
        boolean z17 = false;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            z17 = true;
        }
        if (z17) {
            android.view.ViewTreeObserver viewTreeObserver2 = this.f172672c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver2);
            viewTreeObserver2.removeOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f(this.f172673d));
        }
        this.f172672c = null;
    }

    public final void e() {
        if (this.f172671b) {
            return;
        }
        android.view.View o17 = this.f172670a.D1.o(1);
        d();
        android.view.ViewTreeObserver viewTreeObserver = o17.getViewTreeObserver();
        this.f172672c = viewTreeObserver;
        viewTreeObserver.addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f(this.f172673d));
        o17.addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.g(o17, this));
        this.f172671b = true;
    }
}
