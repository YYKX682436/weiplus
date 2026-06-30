package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class zf extends xi1.b {

    /* renamed from: l, reason: collision with root package name */
    public final xi1.g f173992l;

    /* renamed from: m, reason: collision with root package name */
    public android.app.Activity f173993m;

    /* renamed from: n, reason: collision with root package name */
    public xi1.o f173994n;

    /* renamed from: o, reason: collision with root package name */
    public int f173995o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f173996p;

    /* renamed from: q, reason: collision with root package name */
    public xi1.o f173997q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(xi1.g windowAndroid, xi1.k kVar, android.app.Activity activity) {
        super(windowAndroid, kVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowAndroid, "windowAndroid");
        this.f173992l = windowAndroid;
        this.f173993m = activity;
        this.f173994n = xi1.o.PORTRAIT;
        this.f173995o = 1;
    }

    @Override // xi1.m
    public xi1.o a() {
        return this.f173997q;
    }

    @Override // xi1.b, xi1.m
    public void e(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.e(view, i17);
        h(i17);
        java.util.Iterator it = this.f536228i.iterator();
        while (it.hasNext()) {
            ((xi1.c) it.next()).o();
        }
        this.f173996p = true;
    }

    @Override // xi1.b, xi1.m
    public boolean g() {
        boolean z17 = this.f536230k;
        boolean z18 = false;
        if (z17) {
            this.f173996p = false;
        }
        if (super.g()) {
            boolean b17 = xi1.o.b(this.f173994n);
            xi1.g gVar = this.f173992l;
            if (b17) {
                gVar.mo51619xfa43b684("landscape");
            } else {
                gVar.mo51619xfa43b684("portrait");
            }
            android.app.Activity activity = this.f173993m;
            if (activity != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
                activity.setRequestedOrientation(this.f173995o);
            }
            i();
            z18 = true;
        } else if (z17) {
            this.f536230k = false;
            i();
            return true;
        }
        this.f173997q = null;
        return z18;
    }

    @Override // xi1.m
    public void h(int i17) {
        this.f536230k = true;
        java.lang.String str = (i17 == -90 || i17 == 90) ? "landscape" : "portrait";
        this.f173997q = xi1.o.d(str);
        xi1.g gVar = this.f173992l;
        xi1.o a17 = gVar.mo51612x60543150().a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getCurrentOrientation(...)");
        this.f173994n = a17;
        gVar.mo51619xfa43b684(str);
        if (this.f173993m == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "landscape")) {
            return;
        }
        android.app.Activity activity = this.f173993m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        if (xi1.o.b(xi1.o.e(activity.getRequestedOrientation()))) {
            return;
        }
        android.app.Activity activity2 = this.f173993m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity2);
        this.f173995o = activity2.getRequestedOrientation();
        android.app.Activity activity3 = this.f173993m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity3);
        activity3.setRequestedOrientation(6);
    }

    @Override // xi1.b, xi1.m
    /* renamed from: release */
    public void mo53823x41012807() {
        super.mo53823x41012807();
        this.f173993m = null;
    }
}
