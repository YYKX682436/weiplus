package hn4;

/* loaded from: classes15.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn4.z f364135d;

    public u(hn4.z zVar) {
        this.f364135d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        hn4.z zVar = this.f364135d;
        u1Var.g(zVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0e, zVar.E.Y.f464776n.f463919h));
        u1Var.a(true);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571535i4);
        u1Var.b(new hn4.t(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
