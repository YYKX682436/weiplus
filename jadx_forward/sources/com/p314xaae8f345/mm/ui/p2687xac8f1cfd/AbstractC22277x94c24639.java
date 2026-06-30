package com.p314xaae8f345.mm.ui.p2687xac8f1cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/component/UIComponentFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "weui-native-android-uic_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.component.UIComponentFragment */
/* loaded from: classes14.dex */
public abstract class AbstractC22277x94c24639 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f287829m = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f287830d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 f287832f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.l1 f287833g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f287834h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f287831e = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f287835i = new java.util.LinkedList();

    private final void m0(p012xc85e97e9.p093xedfae76a.l1 l1Var, p012xc85e97e9.p093xedfae76a.l1 l1Var2, yz5.l lVar) {
        if (l1Var == null) {
            return;
        }
        java.lang.reflect.Field declaredField = p012xc85e97e9.p093xedfae76a.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(l1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
        java.lang.Object obj2 = declaredField.get(l1Var2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
        java.util.HashMap hashMap = (java.util.HashMap) obj2;
        for (java.util.Map.Entry entry : ((java.util.HashMap) obj).entrySet()) {
            if (((java.lang.Boolean) lVar.mo146xb9724478(entry.getValue())).booleanValue()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 = this.f287832f;
        if (abstractC22275x3ce1d8c9 != null) {
            return abstractC22275x3ce1d8c9.mo569x2ee31f5b();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        p012xc85e97e9.p093xedfae76a.l1 l1Var = this.f287833g;
        if (l1Var != null) {
            return l1Var;
        }
        pf5.v0 v0Var = new pf5.v0(false, 1, null);
        this.f287833g = v0Var;
        return v0Var;
    }

    public p012xc85e97e9.p093xedfae76a.c1 j0(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.b(this).a(modelClass);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return a17;
    }

    public abstract java.util.Set l0();

    public final void n0() {
        if (mo273xed6858b4().b().compareTo(p012xc85e97e9.p093xedfae76a.n.INITIALIZED) > 0) {
            p012xc85e97e9.p093xedfae76a.l1 l1Var = this.f287833g;
            p012xc85e97e9.p093xedfae76a.l1 viewModel = super.getViewModel();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewModel, "getViewModelStore(...)");
            m0(l1Var, viewModel, pf5.n0.f435459d);
        }
    }

    public void o0() {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (this.f287830d != 1) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: pf5.l0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639.f287829m;
                    com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 this$0 = com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                    java.lang.String str = "[onViewFocused] " + this$0.getClass().getSimpleName() + '@' + this$0.m7479x8cdac1b() + " focusState=" + this$0.f287830d;
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    if (pf5.t.f435466a != null) {
                        java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
                    }
                    java.util.Iterator it = this$0.f287831e.iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo58275xd317978f();
                    }
                }
            };
            if (m7491x1edc854d()) {
                runnable.run();
            } else {
                java.lang.Object[] objArr = new java.lang.Object[0];
                if (pf5.t.f435466a != null) {
                    java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, 0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UIComponentFragment", "[onUserVisibleFocused] wait to fragment resume.", obj);
                }
                this.f287835i.add(runnable);
            }
            this.f287830d = 1;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        java.lang.String str = "[onActivityCreated] " + getClass().getSimpleName() + '@' + m7479x8cdac1b();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.HashSet hashSet = this.f287831e;
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
        java.lang.String str = "[onAttach] " + getClass().getSimpleName() + '@' + m7479x8cdac1b();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        java.lang.String str = "[onConfigurationChanged] " + getClass().getSimpleName() + '@' + m7479x8cdac1b();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f287831e.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2276x50e1c15d(newConfig);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCreate] ");
        sb6.append(getClass().getSimpleName());
        sb6.append('@');
        sb6.append(m7479x8cdac1b());
        sb6.append(" uiComponents=");
        java.util.HashSet uiComponents = this.f287831e;
        sb6.append(uiComponents);
        java.lang.String sb7 = sb6.toString();
        boolean z17 = false;
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", sb7, obj);
        }
        m0(super.getViewModel(), getViewModel(), pf5.m0.f435458d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponents, "uiComponents");
        java.util.HashSet hashSet = new java.util.HashSet();
        q0(hashSet);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 = (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) j0((java.lang.Class) it.next());
            uiComponents.add(abstractC22275x3ce1d8c9);
            if (abstractC22275x3ce1d8c9.mo569x2ee31f5b() != 0) {
                this.f287832f = abstractC22275x3ce1d8c9;
                if (z17) {
                    throw new java.lang.RuntimeException("already layout uic[" + this.f287832f + "], no more than one layout uic.");
                }
                z17 = true;
            }
        }
        java.util.Iterator it6 = uiComponents.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it6.next()).m80383xe26dab14(m7436x8619eaa0());
        }
        super.mo7398x3e5a77bb(bundle);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = android.view.LayoutInflater.from(mo7438x76847179()).inflate(mo48065x2ee31f5b(), viewGroup, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCreateView] ");
        sb6.append(getClass().getSimpleName());
        sb6.append('@');
        sb6.append(m7479x8cdac1b());
        sb6.append(" uiComponents=");
        java.util.HashSet<com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9> hashSet = this.f287831e;
        sb6.append(hashSet);
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", sb7, obj);
        }
        for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 : hashSet) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            abstractC22275x3ce1d8c9.m80384x6ca18d29(inflate);
        }
        this.f287834h = inflate;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2277xb2f1ab1a(bundle);
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        java.util.HashSet hashSet = this.f287831e;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo47482x6fa9d635();
        }
        super.mo7399xa6664a60();
        java.lang.String str = "[onDestroyView] " + getClass().getSimpleName() + '@' + m7479x8cdac1b();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
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
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        java.lang.String str = "[onPause] " + getClass().getSimpleName() + '@' + m7479x8cdac1b();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f287831e.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2281xb01dfb57();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        java.lang.String str = "[onResume] " + getClass().getSimpleName() + '@' + m7479x8cdac1b();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f287831e.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2284x57429eec();
        }
        java.util.LinkedList linkedList = this.f287835i;
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
        java.util.Iterator it = this.f287831e.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2285xa71a2260(outState);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        java.lang.String str = "[onStart] " + getClass().getSimpleName() + '@' + m7479x8cdac1b();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f287831e.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2286xb05099c3();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        java.lang.String str = "[onStop] " + getClass().getSimpleName() + '@' + m7479x8cdac1b();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f287831e.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2287xc39f8281();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        java.lang.String str = "[onViewCreated] " + getClass().getSimpleName() + '@' + m7479x8cdac1b();
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (pf5.t.f435466a != null) {
            java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
        }
        java.util.Iterator it = this.f287831e.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo47092x594b1124(view);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewStateRestored */
    public void mo7407xed07c83(android.os.Bundle bundle) {
        super.mo7407xed07c83(bundle);
        java.util.Iterator it = this.f287831e.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo2283xb949e58d(bundle);
        }
    }

    public void p0() {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (this.f287830d != 2) {
            java.lang.String str = "[onViewUnFocused] " + getClass().getSimpleName() + '@' + m7479x8cdac1b();
            java.lang.Object[] objArr = new java.lang.Object[0];
            if (pf5.t.f435466a != null) {
                java.lang.Object[] obj = java.util.Arrays.copyOf(objArr, objArr.length);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", str, obj);
            }
            java.util.Iterator it = this.f287831e.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo58437xaa858cb6();
            }
            this.f287830d = 2;
        }
    }

    public void q0(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        java.util.Set l07 = l0();
        if (l07 != null) {
            set.addAll(kz5.n0.Q0(l07));
        }
    }
}
