package rv0;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.d f481448d;

    public a(rv0.d dVar) {
        this.f481448d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/BgmVolumeAdjPanel$setupViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rv0.d dVar = this.f481448d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1 c10963x9da302b1 = dVar.L;
        if (c10963x9da302b1 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekBar");
            throw null;
        }
        if (c10963x9da302b1.m47230x754a37bb() > 0) {
            dVar.m163152x27f73e1c(0.0f);
        } else {
            dVar.m163152x27f73e1c(100.0f);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/BgmVolumeAdjPanel$setupViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
