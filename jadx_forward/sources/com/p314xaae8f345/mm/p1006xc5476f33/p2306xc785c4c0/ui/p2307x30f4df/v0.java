package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class v0 implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256623a;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar) {
        this.f256623a = jVar;
    }

    @Override // q80.s
    public void a(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "[TopStoryLiteApp]start video lite app view success");
        boolean z17 = view instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256623a;
        if (z17) {
            jVar.F = ((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view).mo28563xe7b2546();
        }
        jVar.C = true;
        jVar.D = false;
        android.view.View view2 = jVar.B;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$6", ya.b.f77504xbb80cbe3, "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$6", ya.b.f77504xbb80cbe3, "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // q80.s
    /* renamed from: fail */
    public void mo9542x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "[TopStoryLiteApp]start video lite app view fail");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256623a;
        jVar.C = false;
        jVar.D = false;
    }
}
