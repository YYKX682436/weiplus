package yn2;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn2.m f545517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f545518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f545519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zn2.a f545520g;

    public i(yn2.m mVar, in5.s0 s0Var, int i17, zn2.a aVar) {
        this.f545517d = mVar;
        this.f545518e = s0Var;
        this.f545519f = i17;
        this.f545520g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yn2.m mVar = this.f545517d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar = mVar.f545527e;
        if (eVar != null) {
            ((xn2.p0) eVar).m(this.f545518e, this.f545519f, this.f545520g.f556021i, mVar.f545533n);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            mVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.MegaVideoCardConvert", "blur_cover_image click but action callback is null!");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
