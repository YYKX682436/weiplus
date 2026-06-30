package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class z8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f205951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f205953f;

    public z8(bw5.o50 o50Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, bw5.ar0 ar0Var) {
        this.f205951d = o50Var;
        this.f205952e = obVar;
        this.f205953f = ar0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleRadioPlayBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
        eVar.f373639c = this.f205953f.f106955d;
        il4.f fVar = eVar.f373655s;
        java.util.Map map = fVar.f373665d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205952e;
        map.put("finderusername", obVar.m58741x6c03c64c());
        fVar.f373664c = il4.l.f373675a.h(obVar.m80379x76847179());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileHeaderUIC", "handleRadioPlayBtn play categoryId: " + this.f205951d.c() + ", userName: " + obVar.m58741x6c03c64c());
        if (obVar.m58704xd2e07a89()) {
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).rj(null, null, this.f205951d, null, eVar);
        } else {
            qk.f9.b(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), obVar.m80379x76847179(), true, null, eVar, this.f205951d, null, this.f205953f, null, 164, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleRadioPlayBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
