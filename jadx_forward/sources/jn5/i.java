package jn5;

/* loaded from: classes3.dex */
public final class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.z {
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 A;

    /* renamed from: t, reason: collision with root package name */
    public final yz5.p f382390t;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f382393w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Integer f382395y;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.animation.AccelerateDecelerateInterpolator f382391u = new android.view.animation.AccelerateDecelerateInterpolator();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f382392v = new java.util.ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f382394x = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f382396z = new java.util.ArrayList();

    public i(yz5.p pVar) {
        this.f382390t = pVar;
    }

    public final boolean I(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return (k3Var == null || k3Var.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.txo) == null) ? false : true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void s() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f382392v;
        arrayList.size();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f382396z;
        arrayList2.size();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f382394x;
        arrayList3.size();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            yz5.l lVar = (yz5.l) it.next();
            java.lang.Integer num = this.f382393w;
            if (num != null) {
                r5 = num.intValue();
            }
            lVar.mo146xb9724478(java.lang.Integer.valueOf(r5));
        }
        arrayList.clear();
        this.f382393w = null;
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            ((java.lang.Runnable) it6.next()).run();
        }
        arrayList2.clear();
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            yz5.l lVar2 = (yz5.l) it7.next();
            java.lang.Integer num2 = this.f382395y;
            lVar2.mo146xb9724478(java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
        }
        arrayList3.clear();
        this.f382395y = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.A;
        if ((k3Var != null ? 1 : 0) != 0 && k3Var != null) {
            android.view.View view = k3Var.f3639x46306858;
            jn5.h hVar = new jn5.h(this);
            long j17 = this.f93703e;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.n(view, hVar, j17);
        }
        super.s();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean t(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.View view;
        android.view.View view2;
        if (k3Var != null) {
            j(k3Var);
        }
        android.view.View view3 = k3Var != null ? k3Var.f3639x46306858 : null;
        int top = (k3Var == null || (view2 = k3Var.f3639x46306858) == null) ? 0 : view2.getTop();
        if (k3Var != null && (view = k3Var.f3639x46306858) != null) {
            view.getHeight();
        }
        java.util.Objects.toString(k3Var);
        java.lang.Integer num = this.f382395y;
        this.f382395y = num == null ? java.lang.Integer.valueOf(top) : java.lang.Integer.valueOf(java.lang.Math.min(top, num.intValue()));
        ((java.util.ArrayList) this.f382394x).add(new jn5.b(view3, top, this, k3Var));
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean u(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, int i17, int i18, int i19, int i27) {
        I(k3Var);
        I(k3Var2);
        java.util.Objects.toString(k3Var);
        java.util.Objects.toString(k3Var2);
        return super.u(k3Var, k3Var2, i17, i18, i19, i27);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean v(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18, int i19, int i27) {
        if (k3Var != null) {
            j(k3Var);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var);
        int translationX = i19 - (i17 + ((int) k3Var.f3639x46306858.getTranslationX()));
        int translationY = i27 - (i18 + ((int) k3Var.f3639x46306858.getTranslationY()));
        android.view.View view = k3Var.f3639x46306858;
        if (translationX == 0 && translationY == 0) {
            x(k3Var);
            return false;
        }
        if (view != null) {
            view.getTop();
        }
        if (translationX != 0 && view != null) {
            view.setTranslationX(-translationX);
        }
        if (translationY != 0 && view != null) {
            view.setTranslationY(-translationY);
        }
        boolean I = I(k3Var);
        k3Var.m8211x9616526c();
        if (I) {
            this.A = k3Var;
        }
        ((java.util.ArrayList) this.f382396z).add(new jn5.e(view, translationX, translationY, this, k3Var));
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean w(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.View view;
        android.view.View view2;
        if (k3Var != null) {
            j(k3Var);
        }
        android.view.View view3 = k3Var != null ? k3Var.f3639x46306858 : null;
        int top = (k3Var == null || (view2 = k3Var.f3639x46306858) == null) ? 0 : view2.getTop();
        if (k3Var != null && (view = k3Var.f3639x46306858) != null) {
            view.getHeight();
        }
        java.util.Objects.toString(k3Var);
        java.lang.Integer num = this.f382393w;
        this.f382393w = num == null ? java.lang.Integer.valueOf(top) : java.lang.Integer.valueOf(java.lang.Math.min(top, num.intValue()));
        ((java.util.ArrayList) this.f382392v).add(new jn5.g(top, view3, this, k3Var));
        return true;
    }
}
