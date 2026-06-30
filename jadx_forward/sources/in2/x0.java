package in2;

/* loaded from: classes8.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f374463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.a1 f374464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f374465f;

    public x0(dk2.yg ygVar, in2.a1 a1Var, int i17) {
        this.f374463d = ygVar;
        this.f374464e = a1Var;
        this.f374465f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.yg songItem = this.f374463d;
        int i17 = songItem.f315928c;
        int i18 = this.f374465f;
        in2.a1 a1Var = this.f374464e;
        if (i17 == 4) {
            a1Var.z(i18, songItem);
        } else {
            a1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songItem, "songItem");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f374329f, songItem.f315926a + ", MUSIC_PLAY}");
            yz5.p pVar = a1Var.f374332i;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), songItem);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
