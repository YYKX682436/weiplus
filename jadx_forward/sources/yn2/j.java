package yn2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn2.m f545521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f545522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f545523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zn2.a f545524g;

    public j(yn2.m mVar, in5.s0 s0Var, int i17, zn2.a aVar) {
        this.f545521d = mVar;
        this.f545522e = s0Var;
        this.f545523f = i17;
        this.f545524g = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar = this.f545521d.f545527e;
        if (eVar != null) {
            ((xn2.p0) eVar).m(this.f545522e, this.f545523f, this.f545524g.f556021i, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
