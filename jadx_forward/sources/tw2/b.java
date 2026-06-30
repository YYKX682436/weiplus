package tw2;

/* loaded from: classes2.dex */
public final class b extends tw2.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f503991m;

    /* renamed from: n, reason: collision with root package name */
    public tw2.a f503992n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f503993o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f503994p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe viewPager, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d manager, java.util.List pageFragments) {
        super(manager);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewPager, "viewPager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageFragments, "pageFragments");
        this.f503991m = pageFragments;
        this.f503993o = new java.util.ArrayList();
        this.f503994p = new java.util.ArrayList();
    }

    public final void a(tw2.a action, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f503992n = action;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyItemChange actionType:");
        int i17 = action.f503989a;
        sb6.append(i17);
        sb6.append(" position ");
        int i18 = action.f503990b;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", sb6.toString());
        java.util.List list = this.f503991m;
        if (i17 == 0) {
            if (obj != null) {
                if (i18 < 0 || i18 > list.size()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.DynamicAdapter", "notifyAddItem index out of range");
                    return;
                }
                if (!(!list.contains(obj))) {
                    list = null;
                }
                if (list != null) {
                    list.add(i18, obj);
                }
                mo8343xced61ae5();
                return;
            }
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            if (i18 < 0 || i18 >= list.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.DynamicAdapter", "notifyRemoveItem index out of range");
                return;
            } else {
                list.remove(i18);
                mo8343xced61ae5();
                return;
            }
        }
        if (obj != null) {
            if (i18 < 0 || i18 > list.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.DynamicAdapter", "notifyAddItem index out of range");
            } else {
                list.set(i18, obj);
                mo8343xced61ae5();
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: finishUpdate */
    public void mo7742xa949b73c(android.view.ViewGroup container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p012xc85e97e9.p087x9da2e250.app.i2 i2Var = this.f504008f;
        if (i2Var != null) {
            i2Var.g();
            this.f504008f = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", "finishUpdate");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f503991m.size();
    }

    @Override // tw2.i
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo167111xfb80e389(int i17) {
        java.lang.Object obj = this.f503991m.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj;
        if (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getItem ");
            sb6.append(i17);
            sb6.append(" fragment:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) componentCallbacksC1101xa17d4670;
            sb6.append(abstractC15124x7bae6180.f210796n);
            sb6.append(" tabType:");
            sb6.append(abstractC15124x7bae6180.f210798p);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", sb6.toString());
        }
        return componentCallbacksC1101xa17d4670;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object object) {
        tw2.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        int mo8339xb2fa47d2 = super.mo8339xb2fa47d2(object);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", "getItemPosition : position " + mo8339xb2fa47d2);
        if (!(object instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) || (aVar = this.f503992n) == null) {
            return mo8339xb2fa47d2;
        }
        int indexOf = this.f503991m.indexOf(object);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getItemPosition : newPosition ");
        sb6.append(indexOf);
        sb6.append(" changePosition :");
        int i17 = aVar.f503990b;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", sb6.toString());
        if (indexOf == -1) {
            indexOf = -2;
        } else {
            if (indexOf < i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", "unchanged");
                return -1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", "use new " + indexOf);
        }
        return indexOf;
    }

    @Override // tw2.i, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState savedState;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", "instantiateItem " + i17 + " action:" + this.f503992n);
        tw2.a aVar = this.f503992n;
        if (aVar == null || aVar.f503989a != 0) {
            return super.mo7744x8d1aed1d(container, i17);
        }
        java.util.ArrayList arrayList = this.f504010h;
        if (i17 == arrayList.size()) {
            return super.mo7744x8d1aed1d(container, i17);
        }
        if (i17 < arrayList.size()) {
            if (this.f504008f == null) {
                this.f504008f = this.f504006d.m7630xb2c12e75();
            }
            componentCallbacksC1101xa17d4670 = mo167111xfb80e389(i17);
            java.util.ArrayList arrayList2 = this.f504009g;
            if (arrayList2.size() > i17 && (savedState = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.SavedState) arrayList2.get(i17)) != null) {
                componentCallbacksC1101xa17d4670.m7570xc4f4e46c(savedState);
            }
            componentCallbacksC1101xa17d4670.m7571x41119ed3(false);
            componentCallbacksC1101xa17d4670.mo7583x951b248c(false);
            arrayList.add(i17, componentCallbacksC1101xa17d4670);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("instantiateItemInner: title:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) componentCallbacksC1101xa17d4670;
            sb6.append(abstractC15124x7bae6180.f210796n);
            sb6.append(" tabType:");
            sb6.append(abstractC15124x7bae6180.f210798p);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", sb6.toString());
            p012xc85e97e9.p087x9da2e250.app.i2 i2Var = this.f504008f;
            if (i2Var != null) {
                i2Var.h(container.getId(), componentCallbacksC1101xa17d4670, null, 1);
            }
        } else {
            componentCallbacksC1101xa17d4670 = null;
        }
        return componentCallbacksC1101xa17d4670 == null ? super.mo7744x8d1aed1d(container, i17) : componentCallbacksC1101xa17d4670;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: notifyDataSetChanged */
    public void mo8343xced61ae5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", "notifyDataSetChanged");
        super.mo8343xced61ae5();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: setPrimaryItem */
    public void mo7748x3c80e673(android.view.ViewGroup container, int i17, java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPrimaryItem ");
        sb6.append(i17);
        sb6.append("  changePosition ");
        tw2.a aVar = this.f503992n;
        sb6.append(aVar != null ? java.lang.Integer.valueOf(aVar.f503990b) : null);
        sb6.append(", obj:");
        sb6.append(object);
        sb6.append(" title:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) object;
        sb6.append(abstractC15124x7bae6180.f210796n);
        sb6.append(" tabType:");
        sb6.append(abstractC15124x7bae6180.f210798p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", sb6.toString());
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) object;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = this.f504011i;
        if (componentCallbacksC1101xa17d4670 != componentCallbacksC1101xa17d46702) {
            if (componentCallbacksC1101xa17d46702 != null) {
                componentCallbacksC1101xa17d46702.m7571x41119ed3(false);
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46703 = this.f504011i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(componentCallbacksC1101xa17d46703);
                componentCallbacksC1101xa17d46703.mo7583x951b248c(false);
            }
            componentCallbacksC1101xa17d4670.m7571x41119ed3(true);
            componentCallbacksC1101xa17d4670.mo7583x951b248c(true);
            this.f504011i = componentCallbacksC1101xa17d4670;
        }
        tw2.a aVar2 = this.f503992n;
        if (aVar2 == null || aVar2.f503990b != i17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", "setPrimaryItem action null");
        this.f503992n = null;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: startUpdate */
    public void mo7749x93ef97cb(android.view.ViewGroup container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        if (container.getId() != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicAdapter", "startUpdate");
            return;
        }
        throw new java.lang.IllegalStateException(("ViewPager with adapter " + this + " requires a view id").toString());
    }
}
