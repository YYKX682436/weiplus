package mh2;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 f407997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f407998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f407999f;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39, zi2.w wVar, r45.yx1 yx1Var) {
        this.f407997d = c14229xb3dcfb39;
        this.f407998e = wVar;
        this.f407999f = yx1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$populatePauseResumeButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mh2.o oVar = mh2.o.f407961g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39 = this.f407997d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39.a(c14229xb3dcfb39, oVar);
        c14229xb3dcfb39.getClass();
        r45.yx1 yx1Var = this.f407999f;
        boolean z17 = yx1Var.f472998n;
        zi2.w wVar = this.f407998e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVInteractiveWidget", "resume song " + yx1Var.f472992e + ", name: " + yx1Var.f472999o.f452676d.f451884e);
            wVar.getClass();
            ch2.o2 o2Var = (ch2.o2) wVar.U0(ch2.o2.class);
            if (o2Var != null) {
                o2Var.Q0(yx1Var, new mh2.s(yx1Var, c14229xb3dcfb39));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVInteractiveWidget", "pause song " + yx1Var.f472992e + ", name: " + yx1Var.f472999o.f452676d.f451884e);
            wVar.getClass();
            ch2.o2 o2Var2 = (ch2.o2) wVar.U0(ch2.o2.class);
            if (o2Var2 != null) {
                o2Var2.R5(yx1Var, new mh2.t(yx1Var, c14229xb3dcfb39));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVInteractiveWidget$populatePauseResumeButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
