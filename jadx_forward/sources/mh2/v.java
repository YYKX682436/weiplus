package mh2;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 f408011d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39) {
        this.f408011d = c14229xb3dcfb39;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ch2.o2 o2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupFinishSingingBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mh2.o oVar = mh2.o.f407962h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39 = this.f408011d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39.a(c14229xb3dcfb39, oVar);
        lj2.v0 v0Var = c14229xb3dcfb39.f193202m;
        if (v0Var != null && (o2Var = (ch2.o2) v0Var.o(ch2.o2.class)) != null) {
            o2Var.e7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$setupFinishSingingBtnEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
