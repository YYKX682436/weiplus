package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f256606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f256607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256608f;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar, int i17, int i18) {
        this.f256608f = jVar;
        this.f256606d = i17;
        this.f256607e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f256606d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f256607e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "showNavBarShadow %s, %s", valueOf, java.lang.Integer.valueOf(i18));
        int i19 = i17 + (i18 * com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256608f;
        jVar.f256529p.setBackgroundColor(i19);
        android.view.View view = jVar.f256529p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jVar.f256537v = true;
        jVar.f256529p.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.q(this));
    }
}
