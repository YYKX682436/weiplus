package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class f0 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f199830d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 f199831e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 x0Var) {
        this.f199831e = x0Var;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        container.removeView((android.view.View) obj);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return ((fn2.s1) this.f199831e).H.length;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        return (java.lang.CharSequence) kz5.z.U(((fn2.s1) this.f199831e).H, i17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        java.util.Map map = this.f199830d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            fn2.s1 s1Var = (fn2.s1) this.f199831e;
            s1Var.getClass();
            fn2.v1 v1Var = i17 != 0 ? i17 != 1 ? fn2.v1.f345956f : fn2.v1.f345956f : fn2.v1.f345955e;
            fn2.v1 v1Var2 = fn2.v1.f345956f;
            fn2.t1 t1Var = s1Var.G;
            fn2.x1 x1Var = new fn2.x1(s1Var.f201787e, s1Var.F, t1Var.f345936a, t1Var.f345937b, v1Var, s1Var.C, v1Var == v1Var2 ? t1Var.f345939d : null);
            s1Var.I.put(java.lang.Integer.valueOf(i17), x1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUnifiedSongPanel", "Created tab content view for index: " + i17 + ", type: " + v1Var);
            linkedHashMap.put(valueOf, x1Var);
            obj = x1Var;
        }
        android.view.View view = (android.view.View) obj;
        container.addView(view);
        return view;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, obj);
    }
}
