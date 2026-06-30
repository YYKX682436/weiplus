package ka2;

/* loaded from: classes10.dex */
public final class q implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.TextWatcher f387576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f387577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 f387578f;

    public q(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4) {
        this.f387577e = view;
        this.f387578f = activityC13659x4f0951e4;
        if (!android.text.TextWatcher.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(android.text.TextWatcher.class.getClassLoader(), new java.lang.Class[]{android.text.TextWatcher.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.text.TextWatcher");
        }
        this.f387576d = (android.text.TextWatcher) newProxyInstance;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f387576d.afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f387576d.beforeTextChanged(charSequence, i17, i18, i19);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.lang.String obj = charSequence != null ? charSequence.toString() : null;
        boolean z17 = true;
        boolean z18 = obj == null || obj.length() == 0;
        android.view.View view = this.f387577e;
        if (z18) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$3", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$3", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$3", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initSearchView$3", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z19 = !(obj == null || obj.length() == 0);
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.P;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[requestSearch] keyWord:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4 = this.f387578f;
        sb6.append(activityC13659x4f0951e4.f183332z);
        sb6.append(" input:");
        sb6.append(obj);
        sb6.append(" isSearching:");
        sb6.append(z19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPoiNormalLbsListUI", sb6.toString());
        activityC13659x4f0951e4.f183326t = z19;
        if (obj != null && obj.length() != 0) {
            z17 = false;
        }
        ka2.d dVar = activityC13659x4f0951e4.L;
        if (!z17) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, activityC13659x4f0951e4.f183332z)) {
                return;
            }
            activityC13659x4f0951e4.f183332z = obj;
            ka2.c cVar = z19 ? dVar.f387552d : dVar.f387551c;
            cVar.f387547a = null;
            cVar.f387548b = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.n7(activityC13659x4f0951e4, obj, z19, false, false, activityC13659x4f0951e4.j7(), 0, 44, null);
            return;
        }
        activityC13659x4f0951e4.f183332z = "";
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = activityC13659x4f0951e4.f183330x;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(dVar.f387553e);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = activityC13659x4f0951e4.f183330x;
        if (c22849x81a93d252 == null || (mo7946xf939df19 = c22849x81a93d252.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }
}
