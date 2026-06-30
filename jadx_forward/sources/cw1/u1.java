package cw1;

/* loaded from: classes7.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13110x50e4df39 f304878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f304880f;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13110x50e4df39 activityC13110x50e4df39, java.util.List list, boolean[] zArr) {
        this.f304878d = activityC13110x50e4df39;
        this.f304879e = list;
        this.f304880f = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13110x50e4df39 activityC13110x50e4df39 = this.f304878d;
        cw1.s1 s1Var = activityC13110x50e4df39.f177218e;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        java.util.List dataList = this.f304879e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dataList, "$dataList");
        boolean[] checkList = this.f304880f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkList, "checkList");
        s1Var.f304835d = dataList;
        s1Var.f304836e = checkList;
        s1Var.m8146xced61ae5();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC13110x50e4df39.f177217d;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        c1163xf1deaba4.setVisibility(0);
        android.view.View view = activityC13110x50e4df39.f177219f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI$loadAppBrandList$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI$loadAppBrandList$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
