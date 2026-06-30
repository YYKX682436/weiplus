package com.p314xaae8f345.mm.ui.vas.p2743x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/vas/fragment/VASBaseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.vas.fragment.VASBaseFragment */
/* loaded from: classes14.dex */
public abstract class AbstractC22586x21703f69 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: e, reason: collision with root package name */
    public int f292666e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 f292668g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.l1 f292669h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f292670i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f292671m;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292665d = "MicroMsg.VAS.VASBaseFragment@" + m7479x8cdac1b();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f292667f = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f292672n = new java.util.LinkedList();

    public void c(int i17, int i18) {
        getF292665d();
    }

    /* renamed from: getLayoutId */
    public int mo81244x2ee31f5b() {
        com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 = this.f292668g;
        if (abstractC22275x3ce1d8c9 != null) {
            return abstractC22275x3ce1d8c9.mo569x2ee31f5b();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        p012xc85e97e9.p093xedfae76a.l1 l1Var = this.f292669h;
        if (l1Var != null) {
            return l1Var;
        }
        pf5.v0 v0Var = new pf5.v0(false, 1, null);
        this.f292669h = v0Var;
        return v0Var;
    }

    public p012xc85e97e9.p093xedfae76a.c1 j0(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(this).a(modelClass);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return a17;
    }

    /* renamed from: l0, reason: from getter */
    public java.lang.String getF292665d() {
        return this.f292665d;
    }

    public abstract java.util.Set m0();

    public void n0(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        java.util.Set m07 = m0();
        if (m07 != null) {
            set.addAll(kz5.n0.Q0(m07));
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "[onActivityCreated] " + getClass().getSimpleName() + '@' + m7479x8cdac1b());
        if (this.f292671m) {
            return;
        }
        this.f292671m = true;
        java.util.HashSet hashSet = this.f292667f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo450x3e5a77bb(bundle);
        }
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it6.next()).mo739xfd763ae1(bundle);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo7397x3b13c504(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "[onAttach] " + getClass().getSimpleName() + '@' + m7479x8cdac1b());
        p012xc85e97e9.p093xedfae76a.l1 viewModel = super.getViewModel();
        p012xc85e97e9.p093xedfae76a.l1 viewModel2 = getViewModel();
        if (viewModel != null) {
            java.lang.reflect.Field declaredField = p012xc85e97e9.p093xedfae76a.l1.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(viewModel);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
            java.lang.Object obj2 = declaredField.get(viewModel2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
            java.util.HashMap hashMap = (java.util.HashMap) obj2;
            for (java.util.Map.Entry entry : ((java.util.HashMap) obj).entrySet()) {
                java.lang.Object it = entry.getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
                if (java.lang.Boolean.TRUE.booleanValue()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        java.util.HashSet uiComponents = this.f292667f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponents, "uiComponents");
        java.util.HashSet hashSet = new java.util.HashSet();
        n0(hashSet);
        java.util.Iterator it6 = hashSet.iterator();
        boolean z17 = false;
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 = (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) j0((java.lang.Class) it6.next());
            uiComponents.add(abstractC22275x3ce1d8c9);
            if (abstractC22275x3ce1d8c9.mo569x2ee31f5b() != 0) {
                this.f292668g = abstractC22275x3ce1d8c9;
                if (z17) {
                    throw new java.lang.RuntimeException("already layout uic[" + this.f292668g + "], no more than one layout uic.");
                }
                z17 = true;
            }
        }
        java.util.Iterator it7 = uiComponents.iterator();
        while (it7.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it7.next()).m80383xe26dab14(m7436x8619eaa0());
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "[onConfigurationChanged] " + getClass().getSimpleName() + '@' + m7479x8cdac1b());
        java.util.Iterator it = this.f292667f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2276x50e1c15d(newConfig);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = android.view.LayoutInflater.from(mo7438x76847179()).inflate(mo81244x2ee31f5b(), viewGroup, false);
        java.lang.String f292665d = getF292665d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCreateView] ");
        sb6.append(getClass().getSimpleName());
        sb6.append('@');
        sb6.append(m7479x8cdac1b());
        sb6.append(" uiComponents=");
        java.util.HashSet<com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9> hashSet = this.f292667f;
        sb6.append(hashSet);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f292665d, sb6.toString());
        for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 : hashSet) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            abstractC22275x3ce1d8c9.m80384x6ca18d29(inflate);
        }
        this.f292670i = inflate;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2277xb2f1ab1a(bundle);
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        if (this.f292670i == null) {
            getF292665d();
            m7479x8cdac1b();
            super.mo7504xac79a11b();
            return;
        }
        java.util.HashSet hashSet = this.f292667f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo47482x6fa9d635();
        }
        super.mo7504xac79a11b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "[onDestroy] " + getClass().getSimpleName() + '@' + m7479x8cdac1b());
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it6.next()).mo451xac79a11b();
        }
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it7.next()).mo47481x6449b5ba();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "[onPause] " + getClass().getSimpleName() + '@' + m7479x8cdac1b());
        java.util.Iterator it = this.f292667f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2281xb01dfb57();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "[onResume] " + getClass().getSimpleName() + '@' + m7479x8cdac1b());
        java.util.Iterator it = this.f292667f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2284x57429eec();
        }
        java.util.LinkedList linkedList = this.f292672n;
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((java.lang.Runnable) it6.next()).run();
        }
        linkedList.clear();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        super.mo7404xa71a2260(outState);
        java.util.Iterator it = this.f292667f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2285xa71a2260(outState);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "[onStart] " + getClass().getSimpleName() + '@' + m7479x8cdac1b());
        java.util.Iterator it = this.f292667f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2286xb05099c3();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "[onStop] " + getClass().getSimpleName() + '@' + m7479x8cdac1b());
        java.util.Iterator it = this.f292667f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2287xc39f8281();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF292665d(), "[onViewCreated] " + getClass().getSimpleName() + '@' + m7479x8cdac1b());
        java.util.Iterator it = this.f292667f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo47092x594b1124(view);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewStateRestored */
    public void mo7407xed07c83(android.os.Bundle bundle) {
        super.mo7407xed07c83(bundle);
        java.util.Iterator it = this.f292667f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2283xb949e58d(bundle);
        }
    }
}
