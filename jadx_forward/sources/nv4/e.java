package nv4;

/* loaded from: classes12.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f422254d;

    /* renamed from: e, reason: collision with root package name */
    public final nv4.f f422255e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f422256f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f422257g;

    public e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, nv4.f ctx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        this.f422254d = recyclerView;
        this.f422255e = ctx;
        this.f422256f = true;
        this.f422257g = new java.util.LinkedHashMap();
        recyclerView.i(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.mo8163xed962dec(new nv4.c(this));
        }
        recyclerView.post(new nv4.b(this));
    }

    public final void a() {
        int i17;
        int i18;
        java.lang.String str;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager;
        int i19;
        java.util.Map map;
        java.lang.String str2;
        java.util.LinkedHashMap linkedHashMap;
        java.lang.Boolean bool;
        java.lang.String v17;
        nv4.e eVar = this;
        if (!eVar.f422256f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSExposeChecker", "doTrace: not visible");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = eVar.f422254d.mo7951xfd37656d();
        if (mo7951xfd37656d == null) {
            return;
        }
        boolean z17 = false;
        if (mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d;
            i17 = c1162x665295de.w();
            i18 = c1162x665295de.y();
        } else if (mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) mo7951xfd37656d;
            int i27 = c1164x587b7ff1.f93453d;
            int[] iArr = new int[i27];
            int[] iArr2 = new int[i27];
            c1164x587b7ff1.u(iArr);
            c1164x587b7ff1.v(iArr2);
            int i28 = iArr[0];
            int i29 = iArr2[0];
            for (int i37 = 1; i37 < i27; i37++) {
                int i38 = iArr[i37];
                if (i28 > i38) {
                    i28 = i38;
                }
            }
            for (int i39 = 1; i39 < i27; i39++) {
                int i47 = iArr2[i39];
                if (i29 < i47) {
                    i29 = i47;
                }
            }
            i17 = i28;
            i18 = i29;
        } else {
            i17 = -1;
            i18 = -1;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        if (intValue > intValue2) {
            return;
        }
        while (true) {
            java.util.Map map2 = eVar.f422257g;
            nv4.f fVar = eVar.f422255e;
            jv4.n nVar = (jv4.n) kz5.n0.a0(((nv4.a) fVar).f422250a.a(), intValue);
            if (nVar == null || (str = nVar.v()) == null) {
                str = "";
            }
            java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) map2;
            java.lang.Object obj = linkedHashMap2.get(str);
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, bool2)) {
                layoutManager = mo7951xfd37656d;
            } else {
                android.view.View mo7935xa188593e = mo7951xfd37656d.mo7935xa188593e(intValue);
                fVar.getClass();
                if (mo7935xa188593e == null) {
                    layoutManager = mo7951xfd37656d;
                    i19 = intValue;
                    map = map2;
                    str2 = "";
                    linkedHashMap = linkedHashMap2;
                    bool = bool2;
                } else {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    if (mo7935xa188593e.getLocalVisibleRect(rect)) {
                        double height = mo7935xa188593e.getHeight();
                        double width = mo7935xa188593e.getWidth();
                        layoutManager = mo7951xfd37656d;
                        double d17 = rect.left;
                        str2 = "";
                        double d18 = rect.top;
                        linkedHashMap = linkedHashMap2;
                        bool = bool2;
                        double d19 = rect.right;
                        i19 = intValue;
                        map = map2;
                        double d27 = rect.bottom;
                        if ((d17 == 0.0d ? d19 == width ? d18 == 0.0d ? !((d27 > height ? 1 : (d27 == height ? 0 : -1)) == 0) ? d27 / height : 1.0d : (height - d18) / height : d19 / width : (width - d17) / width) * 100 >= 50) {
                            z17 = true;
                        }
                    } else {
                        layoutManager = mo7951xfd37656d;
                        i19 = intValue;
                        map = map2;
                        str2 = "";
                        linkedHashMap = linkedHashMap2;
                        bool = bool2;
                    }
                    z17 = false;
                }
                if (z17) {
                    nv4.a aVar = (nv4.a) fVar;
                    intValue = i19;
                    jv4.n nVar2 = (jv4.n) kz5.n0.a0(aVar.f422250a.a(), intValue);
                    java.lang.String str3 = (nVar2 == null || (v17 = nVar2.v()) == null) ? str2 : v17;
                    java.lang.Boolean bool3 = bool;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(linkedHashMap.get(str3), bool3)) {
                        map.put(str3, bool3);
                        jv4.n nVar3 = (jv4.n) kz5.n0.a0(aVar.f422250a.a(), intValue);
                        if (nVar3 != null) {
                            nVar3.w();
                        }
                    }
                } else {
                    intValue = i19;
                }
            }
            if (intValue == intValue2) {
                return;
            }
            intValue++;
            eVar = this;
            mo7951xfd37656d = layoutManager;
            z17 = false;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/report/FTSExposeChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/report/FTSExposeChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/report/FTSExposeChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        a();
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/report/FTSExposeChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
