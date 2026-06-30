package hn4;

/* loaded from: classes15.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f364120d;

    public m(hn4.z zVar) {
        this.f364120d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hn4.z zVar = this.f364120d;
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.f346109e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "no video play now");
        } else {
            if (zVar.G.mo69281xdf1112ec() - zVar.G.m69282xd98b9220() < 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "cannot change play status in last 2 seconds");
                yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).H.d(zVar.E);
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.d()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.h();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = zVar.G.F;
                if (b4Var != null) {
                    b4Var.d();
                }
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.k();
                hn4.c0 c0Var = zVar.G;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = c0Var.F;
                if (b4Var2 != null) {
                    b4Var2.d();
                    c0Var.F.c(2000L, 2000L);
                }
            }
            zVar.i();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
