package he2;

/* loaded from: classes3.dex */
public final class f extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f362424d;

    /* renamed from: e, reason: collision with root package name */
    public int f362425e;

    public f(java.util.ArrayList plugins, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugins, "plugins");
        this.f362424d = plugins;
        this.f362425e = i17;
    }

    public final void a() {
        for (ee2.a aVar : this.f362424d) {
            if (aVar.f333116g instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) {
                aVar.W();
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveViewPagerPluginAdap", "destroyItem pos:" + i17);
        container.removeView((android.view.View) object);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f362424d.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getItemPosition */
    public int mo8339xb2fa47d2(java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        return -2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveViewPagerPluginAdap", "instantiateItem pos:" + i17 + " maxHeight: " + this.f362425e);
        java.util.ArrayList arrayList = this.f362424d;
        android.view.View W = ((ee2.a) arrayList.get(i17)).W();
        if (W.getParent() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveViewPagerPluginAdap", "instantiateItem removeView " + W.getClass().getCanonicalName());
            android.view.ViewParent parent = W.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(W);
            }
        }
        ((ee2.a) arrayList.get(i17)).w(this.f362425e);
        if (W instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14177xbed2eba0) {
            container.addView(W);
            return W;
        }
        android.content.Context context = container.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14177xbed2eba0 c14177xbed2eba0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14177xbed2eba0(context);
        c14177xbed2eba0.setTag("LiveViewPagerPluginAdap");
        android.view.ViewParent parent2 = W.getParent();
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(W);
        }
        c14177xbed2eba0.addView(W, new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -1));
        if (W.getId() == -1) {
            W.setId(android.view.View.generateViewId());
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
        cVar.d(c14177xbed2eba0);
        cVar.e(W.getId(), 1, 0, 1);
        cVar.e(W.getId(), 2, 0, 2);
        cVar.e(W.getId(), 4, 0, 4);
        cVar.b(c14177xbed2eba0);
        c14177xbed2eba0.m7179xd020a803(null);
        container.addView(c14177xbed2eba0);
        android.view.ViewParent parent3 = W.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
        return (android.view.ViewGroup) parent3;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, object);
    }
}
