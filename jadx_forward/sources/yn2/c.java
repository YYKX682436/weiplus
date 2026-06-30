package yn2;

/* loaded from: classes2.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f545496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn2.m f545497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f545498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f545499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f545500h;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, yn2.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, int i17) {
        this.f545496d = c15196x85976f5f;
        this.f545497e = mVar;
        this.f545498f = abstractC14490x69736cb5;
        this.f545499g = s0Var;
        this.f545500h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$convertMedia$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f545496d.isSelectedToPlay;
        yn2.m mVar = this.f545497e;
        mVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setOnClickListener onMediaClick  ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f545498f;
        sb6.append(abstractC14490x69736cb5);
        sb6.append(", isViewSelected=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoCardConvert", sb6.toString());
        java.lang.String str = abstractC14490x69736cb5 instanceof zn2.a ? ((zn2.a) abstractC14490x69736cb5).f556021i : "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar = mVar.f545527e;
        if (eVar != null) {
            ((xn2.p0) eVar).m(this.f545499g, this.f545500h, str, mVar.f545533n);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            mVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.MegaVideoCardConvert", "video container click but action callback is null!");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$convertMedia$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
