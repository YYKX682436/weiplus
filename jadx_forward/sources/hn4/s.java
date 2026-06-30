package hn4;

/* loaded from: classes15.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f364132d;

    public s(hn4.z zVar) {
        this.f364132d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.un6 un6Var = new r45.un6();
        hn4.z zVar = this.f364132d;
        un6Var.f469039i = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256668o.f469039i;
        un6Var.f469045r = java.util.UUID.randomUUID().toString();
        un6Var.f469036f = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256668o.f469040m;
        un6Var.f469037g = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256668o.f469037g;
        un6Var.f469034d = zVar.E.V.f471792h;
        un6Var.f469035e = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256668o.f469035e;
        un6Var.f469042o = zVar.E.V;
        un6Var.f469041n = "topstory";
        un6Var.f469040m = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256668o.f469040m;
        r45.xn6 xn6Var = zVar.E;
        un6Var.f469038h = xn6Var.f471804v;
        un6Var.f469042o.L = xn6Var.L;
        un6Var.f469044q.addAll(xn6Var.V.W);
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2();
        abstractActivityC18755xab3fd75e.getClass();
        su4.r2.r(abstractActivityC18755xab3fd75e, un6Var);
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
