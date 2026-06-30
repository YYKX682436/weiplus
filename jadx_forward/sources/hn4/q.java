package hn4;

/* loaded from: classes15.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f364128d;

    public q(hn4.z zVar) {
        this.f364128d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hn4.z zVar = this.f364128d;
        zVar.getClass();
        zVar.D = java.util.UUID.randomUUID().toString();
        hn4.c0 c0Var = zVar.G;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c0Var.F;
        if (b4Var != null) {
            b4Var.d();
            c0Var.F.c(2000L, 2000L);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).H.f346010d = 2;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.i(zVar.m133835x24b16ea2(), zVar.E, zVar.D, zVar.f346061z.u());
        zVar.i();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
