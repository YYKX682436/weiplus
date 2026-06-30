package uo2;

/* loaded from: classes2.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14494xb6fdc062 f511145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f511146e;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14494xb6fdc062 c14494xb6fdc062, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        this.f511145d = c14494xb6fdc062;
        this.f511146e = c19792x256d2725;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uo2.j0 j0Var = this.f511145d.f202980i;
        if (j0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("topicFollowHelper");
            throw null;
        }
        j0Var.a(this.f511146e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$refreshView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
