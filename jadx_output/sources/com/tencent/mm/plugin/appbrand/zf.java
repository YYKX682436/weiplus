package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class zf extends xi1.b {

    /* renamed from: l, reason: collision with root package name */
    public final xi1.g f92459l;

    /* renamed from: m, reason: collision with root package name */
    public android.app.Activity f92460m;

    /* renamed from: n, reason: collision with root package name */
    public xi1.o f92461n;

    /* renamed from: o, reason: collision with root package name */
    public int f92462o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f92463p;

    /* renamed from: q, reason: collision with root package name */
    public xi1.o f92464q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(xi1.g windowAndroid, xi1.k kVar, android.app.Activity activity) {
        super(windowAndroid, kVar);
        kotlin.jvm.internal.o.g(windowAndroid, "windowAndroid");
        this.f92459l = windowAndroid;
        this.f92460m = activity;
        this.f92461n = xi1.o.PORTRAIT;
        this.f92462o = 1;
    }

    @Override // xi1.m
    public xi1.o a() {
        return this.f92464q;
    }

    @Override // xi1.b, xi1.m
    public void e(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        super.e(view, i17);
        h(i17);
        java.util.Iterator it = this.f454695i.iterator();
        while (it.hasNext()) {
            ((xi1.c) it.next()).o();
        }
        this.f92463p = true;
    }

    @Override // xi1.b, xi1.m
    public boolean g() {
        boolean z17 = this.f454697k;
        boolean z18 = false;
        if (z17) {
            this.f92463p = false;
        }
        if (super.g()) {
            boolean b17 = xi1.o.b(this.f92461n);
            xi1.g gVar = this.f92459l;
            if (b17) {
                gVar.setSoftOrientation("landscape");
            } else {
                gVar.setSoftOrientation("portrait");
            }
            android.app.Activity activity = this.f92460m;
            if (activity != null) {
                kotlin.jvm.internal.o.d(activity);
                activity.setRequestedOrientation(this.f92462o);
            }
            i();
            z18 = true;
        } else if (z17) {
            this.f454697k = false;
            i();
            return true;
        }
        this.f92464q = null;
        return z18;
    }

    @Override // xi1.m
    public void h(int i17) {
        this.f454697k = true;
        java.lang.String str = (i17 == -90 || i17 == 90) ? "landscape" : "portrait";
        this.f92464q = xi1.o.d(str);
        xi1.g gVar = this.f92459l;
        xi1.o a17 = gVar.getOrientationHandler().a();
        kotlin.jvm.internal.o.f(a17, "getCurrentOrientation(...)");
        this.f92461n = a17;
        gVar.setSoftOrientation(str);
        if (this.f92460m == null || !kotlin.jvm.internal.o.b(str, "landscape")) {
            return;
        }
        android.app.Activity activity = this.f92460m;
        kotlin.jvm.internal.o.d(activity);
        if (xi1.o.b(xi1.o.e(activity.getRequestedOrientation()))) {
            return;
        }
        android.app.Activity activity2 = this.f92460m;
        kotlin.jvm.internal.o.d(activity2);
        this.f92462o = activity2.getRequestedOrientation();
        android.app.Activity activity3 = this.f92460m;
        kotlin.jvm.internal.o.d(activity3);
        activity3.setRequestedOrientation(6);
    }

    @Override // xi1.b, xi1.m
    public void release() {
        super.release();
        this.f92460m = null;
    }
}
