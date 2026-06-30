package mh2;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 f408020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.v0 f408021e;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39, lj2.v0 v0Var) {
        this.f408020d = c14229xb3dcfb39;
        this.f408021e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupTuningBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39.a(this.f408020d, mh2.o.f407959e);
        lj2.v0 v0Var = this.f408021e;
        lf2.a aVar = (lf2.a) v0Var.o(lf2.a.class);
        if (aVar != null) {
            aVar.a7(2);
        }
        lf2.a aVar2 = (lf2.a) v0Var.o(lf2.a.class);
        if (aVar2 != null) {
            aVar2.Z6(2, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupTuningBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
