package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256612d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar) {
        this.f256612d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long c17 = c01.id.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256612d;
        if (c17 - jVar.f256536u < 300) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d = jVar.f256524i;
                if (c19226x5a0e667d != null && c19226x5a0e667d.mo120158xfb86a31b() != null) {
                    jVar.f256524i.mo120158xfb86a31b().scrollTo(jVar.f256524i.mo120158xfb86a31b().getScrollX(), 0);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        jVar.f256536u = c17;
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
