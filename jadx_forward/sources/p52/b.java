package p52;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f433527a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f433528b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f433529c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f433530d;

    /* renamed from: e, reason: collision with root package name */
    public final o52.e f433531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f433532f;

    /* renamed from: field_activity */
    private java.lang.reflect.Field f76390xbb0efcb4;

    /* renamed from: field_fragments */
    private java.lang.reflect.Field f76391xb157931e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f433533g;

    /* renamed from: i, reason: collision with root package name */
    public int f433535i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f433536j;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashMap f433538l;

    /* renamed from: m, reason: collision with root package name */
    public final p52.a f433539m;

    /* renamed from: h, reason: collision with root package name */
    public int f433534h = -1;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Object f433537k = new java.lang.Object();

    public b() {
        this.f433530d = true;
        this.f433535i = -1;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f433538l = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new android.util.Pair("onUserVisibleFragmentChange", "(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V"));
        arrayList.add(new android.util.Pair("onFragmentChange", "(IIII)V"));
        hashMap.put("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$", new android.util.Pair("com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", arrayList));
        try {
            java.lang.reflect.Field declaredField = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc.class.getDeclaredField(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            this.f76390xbb0efcb4 = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            java.lang.reflect.Field declaredField2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc.class.getDeclaredField("fragments");
            this.f76391xb157931e = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FinderFragmentCallback", e17, "FinderFragmentCallback reflect crash: " + e17.getMessage(), new java.lang.Object[0]);
        }
        this.f433535i = -1;
        this.f433527a = null;
        this.f433528b = null;
        this.f433529c = false;
        this.f433530d = true;
        this.f433531e = new o52.e();
        this.f433539m = new p52.a(this);
    }

    public static final com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8 a(p52.b bVar, java.lang.Object obj) {
        bVar.getClass();
        try {
            java.lang.reflect.Field field = bVar.f76390xbb0efcb4;
            java.lang.Object obj2 = field != null ? field.get(obj) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentActivity");
            return (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8) obj2;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 b(java.lang.Object obj, int i17) {
        if (obj != null && i17 >= 0) {
            try {
                return c(obj, i17);
            } catch (java.lang.Exception unused) {
                java.lang.ref.WeakReference weakReference = this.f433533g;
                return weakReference != null ? (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639) weakReference.get() : null;
            }
        }
        java.lang.ref.WeakReference weakReference2 = this.f433533g;
        if (weakReference2 != null) {
            return (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639) weakReference2.get();
        }
        return null;
    }

    public final com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 c(java.lang.Object obj, int i17) {
        if (i17 < 0) {
            return null;
        }
        try {
            java.lang.reflect.Field field = this.f76391xb157931e;
            java.lang.Object obj2 = field != null ? field.get(obj) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            java.lang.Object obj3 = ((java.util.List) obj2).get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentFragment");
            return (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639) obj3;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FinderFragmentCallback", e17, "getFragment exception: " + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3.f441698b, r5) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f r9, long r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p52.b.d(androidx.fragment.app.FragmentActivity, long):void");
    }

    public final void e(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activity, long j17) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 c17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        o52.e eVar = this.f433531e;
        if (eVar != null) {
            q52.e eVar2 = new q52.e(null, null, 0L, 0L, 0L, null, null, 0, false, null, null, null, false, 0, false, 0, 0, null, 262143, null);
            eVar.f424635d = eVar2;
            eVar2.f441697a = w52.g.wi().Ri();
            q52.e eVar3 = eVar.f424635d;
            if (eVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("statyTimeStaticHome");
                throw null;
            }
            eVar3.f441698b = b52.b.g(activity.getClass().getName());
            q52.e eVar4 = eVar.f424635d;
            if (eVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("statyTimeStaticHome");
                throw null;
            }
            eVar4.f441700d = j17;
            eVar4.f441703g = "143";
            p52.d[] dVarArr = p52.d.f433540d;
            eVar4.f441704h = 0;
            android.content.Intent intent = activity.getIntent();
            if (intent == null || (str = intent.getStringExtra("key_extra_info")) == null) {
                str = "";
            }
            eVar4.f441706j = str;
            q52.e eVar5 = eVar.f424635d;
            if (eVar5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("statyTimeStaticHome");
                throw null;
            }
            java.lang.String str2 = eVar5.f441706j;
            r30.m.f450479a = str2 != null ? str2 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FinderHomeMonitor", "onFinderHomeUIResume...");
        }
        if (this.f433528b != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activity.getClass().getName(), this.f433528b) && !this.f433529c) {
            this.f433529c = false;
            this.f433528b = null;
            this.f433527a = null;
            if (eVar != null) {
                eVar.e(activity, j17, true);
                return;
            }
            return;
        }
        if (this.f433529c) {
            this.f433529c = false;
            this.f433528b = null;
            this.f433527a = null;
        } else {
            if (eVar == null || (c17 = eVar.c(activity)) == null) {
                return;
            }
            eVar.b(activity, c17, j17, 2);
        }
    }
}
