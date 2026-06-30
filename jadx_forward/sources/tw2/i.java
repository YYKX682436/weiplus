package tw2;

/* loaded from: classes2.dex */
public abstract class i extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f504006d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f504007e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.i2 f504008f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f504009g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f504010h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f504011i;

    public i(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d fm6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fm6, "fm");
        this.f504006d = fm6;
        this.f504009g = new java.util.ArrayList();
        this.f504010h = new java.util.ArrayList();
        this.f504007e = fm6;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object object) {
        java.util.ArrayList arrayList;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState savedState;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) object;
        p012xc85e97e9.p087x9da2e250.app.i2 i2Var = this.f504008f;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f504007e;
        if (i2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC1104xc1ad431d);
            this.f504008f = abstractC1104xc1ad431d.m7630xb2c12e75();
        }
        while (true) {
            arrayList = this.f504009g;
            if (arrayList.size() > i17) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        if (componentCallbacksC1101xa17d4670.m7481x7a6e8df6()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC1104xc1ad431d);
            savedState = abstractC1104xc1ad431d.m7720xe844b30f(componentCallbacksC1101xa17d4670);
        } else {
            savedState = null;
        }
        arrayList.set(i17, savedState);
        this.f504010h.set(i17, null);
        p012xc85e97e9.p087x9da2e250.app.i2 i2Var2 = this.f504008f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i2Var2);
        i2Var2.j(componentCallbacksC1101xa17d4670);
    }

    /* renamed from: getItem */
    public abstract p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo167111xfb80e389(int i17);

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState savedState;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        java.util.ArrayList arrayList = this.f504010h;
        if (arrayList.size() > i17 && (componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) arrayList.get(i17)) != null) {
            return componentCallbacksC1101xa17d4670;
        }
        if (this.f504008f == null) {
            p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f504007e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC1104xc1ad431d);
            this.f504008f = abstractC1104xc1ad431d.m7630xb2c12e75();
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo167111xfb80e389 = mo167111xfb80e389(i17);
        java.util.ArrayList arrayList2 = this.f504009g;
        if (arrayList2.size() > i17 && (savedState = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState) arrayList2.get(i17)) != null) {
            mo167111xfb80e389.m7570xc4f4e46c(savedState);
        }
        while (arrayList.size() <= i17) {
            arrayList.add(null);
        }
        mo167111xfb80e389.m7571x41119ed3(false);
        mo167111xfb80e389.mo7583x951b248c(false);
        arrayList.set(i17, mo167111xfb80e389);
        p012xc85e97e9.p087x9da2e250.app.i2 i2Var = this.f504008f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i2Var);
        i2Var.h(container.getId(), mo167111xfb80e389, null, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("instantiateItem: title:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) mo167111xfb80e389;
        sb6.append(abstractC15124x7bae6180.f210796n);
        sb6.append(" tabType:");
        sb6.append(abstractC15124x7bae6180.f210798p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", sb6.toString());
        return mo167111xfb80e389;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        return ((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) object).m7474xfb86a31b() == view;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: restoreState */
    public void mo7746x61a06aa3(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
        if (parcelable != null) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            java.util.ArrayList arrayList = this.f504009g;
            arrayList.clear();
            java.util.ArrayList arrayList2 = this.f504010h;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (android.os.Parcelable parcelable2 : parcelableArray) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parcelable2, "null cannot be cast to non-null type androidx.fragment.app.Fragment.SavedState");
                    arrayList.add((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState) parcelable2);
                }
            }
            java.util.Set<java.lang.String> keySet = bundle.keySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "keySet(...)");
            for (java.lang.Object obj : keySet) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str = (java.lang.String) obj;
                if (r26.i0.y(str, "f", false)) {
                    java.lang.String substring = str.substring(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    int parseInt = java.lang.Integer.parseInt(substring);
                    p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f504007e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC1104xc1ad431d);
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7672x197d1fc6 = abstractC1104xc1ad431d.m7672x197d1fc6(bundle, str);
                    if (m7672x197d1fc6 != null) {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add(null);
                        }
                        m7672x197d1fc6.m7571x41119ed3(false);
                        arrayList2.set(parseInt, m7672x197d1fc6);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: saveState */
    public android.os.Parcelable mo7747xa507914() {
        android.os.Bundle bundle;
        java.util.ArrayList arrayList = this.f504009g;
        if (arrayList.size() > 0) {
            bundle = new android.os.Bundle();
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState[] savedStateArr = new p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        java.util.ArrayList arrayList2 = this.f504010h;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) arrayList2.get(i17);
            if (componentCallbacksC1101xa17d4670 != null && componentCallbacksC1101xa17d4670.m7481x7a6e8df6()) {
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f504007e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC1104xc1ad431d);
                abstractC1104xc1ad431d.m7709x9a1e7a7f(bundle, "f" + i17, componentCallbacksC1101xa17d4670);
            }
        }
        return bundle;
    }
}
