package li2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li2.g f400292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.v0 f400293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj2.x0 f400294f;

    public c(li2.g gVar, lj2.v0 v0Var, lj2.x0 x0Var) {
        this.f400292d = gVar;
        this.f400293e = v0Var;
        this.f400294f = x0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveKTVRoomAnchorWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        li2.g gVar = this.f400292d;
        if (gVar.G()) {
            lj2.v0 v0Var = this.f400293e;
            lj2.t0 a07 = v0Var.a0();
            km2.q m145849x949ba2a5 = gVar.m145849x949ba2a5();
            if (m145849x949ba2a5 == null || (str = m145849x949ba2a5.f390703a) == null) {
                str = "";
            }
            if (a07.j(str)) {
                zh2.b m17 = this.f400294f.m();
                if (m17 != null) {
                    ((ch2.o2) m17).z7(4);
                }
                lf2.a aVar = (lf2.a) v0Var.o(lf2.a.class);
                if (aVar != null) {
                    aVar.Z6(2, 4);
                }
            }
        } else {
            gVar.X();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveKTVRoomAnchorWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
