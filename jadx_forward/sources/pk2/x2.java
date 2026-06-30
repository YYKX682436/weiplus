package pk2;

/* loaded from: classes3.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.b3 f437884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437885e;

    public x2(pk2.b3 b3Var, pk2.o9 o9Var) {
        this.f437884d = b3Var;
        this.f437885e = o9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14333x5924cb6c c14333x5924cb6c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorPoiOption$addItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f437884d.x(2);
        mf2.b0 b0Var = (if2.b) this.f437885e.e(yf2.z0.class);
        if (b0Var != null && (b0Var instanceof jm2.c) && (c14333x5924cb6c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14333x5924cb6c) ((yf2.z0) ((jm2.c) b0Var)).S6(com.p314xaae8f345.mm.R.id.l0q)) != null) {
            c14333x5924cb6c.h();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorPoiOption$addItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
