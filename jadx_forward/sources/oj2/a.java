package oj2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj2.c f427288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.v0 f427289e;

    public a(oj2.c cVar, lj2.v0 v0Var) {
        this.f427288d = cVar;
        this.f427289e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomAnchorWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean w17 = zl2.r4.f555483a.w1();
        oj2.c cVar = this.f427288d;
        if (w17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.m145853xb5886c64(), "click rect area but i am anchor, skipped");
        } else {
            java.lang.String s17 = this.f427289e.a0().s();
            km2.q m145849x949ba2a5 = cVar.m145849x949ba2a5();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(s17, m145849x949ba2a5 != null ? m145849x949ba2a5.f390703a : null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.m145853xb5886c64(), "click rect area but is myself, skipped");
            } else {
                cVar.X();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomAnchorWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
