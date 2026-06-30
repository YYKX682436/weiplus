package i53;

/* loaded from: classes8.dex */
public final class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15910x98b51341 f370123d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15910x98b51341 c15910x98b51341) {
        this.f370123d = c15910x98b51341;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p33.s sVar;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15910x98b51341 c15910x98b51341 = this.f370123d;
        p33.g0 g0Var = c15910x98b51341.f221595d.C;
        if (g0Var != null && (sVar = g0Var.f433111e) != null && (str = sVar.f433175d) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.n.b(c15910x98b51341.m7550xf0c4608a(), str, -1, false, "");
        }
        c15910x98b51341.j0(true, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameRecommendVideoFragment$onViewCreated$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
