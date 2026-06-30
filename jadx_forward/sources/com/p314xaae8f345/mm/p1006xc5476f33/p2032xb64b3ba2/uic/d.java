package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f239910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f239911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.f f239912f;

    public d(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.f fVar) {
        this.f239910d = y1Var;
        this.f239911e = arrayList;
        this.f239912f = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        t45.o0 o0Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC$addRingtoneToTingList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7173x53cdb0a3 c7173x53cdb0a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7173x53cdb0a3();
        c7173x53cdb0a3.f144716g = 16L;
        c7173x53cdb0a3.f144731v = c7173x53cdb0a3.b("extrainfo", "", true);
        c7173x53cdb0a3.k();
        this.f239910d.q();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (ox3.g gVar2 : this.f239911e) {
            java.lang.String m12396xcc16feb8 = (!gVar2.f431286h || (o0Var = gVar2.f431282d.f497155n) == null || (gVar = o0Var.f497158d) == null) ? null : new bw5.lb0().mo11468x92b714fd(gVar.f273689a).m12396xcc16feb8();
            if (m12396xcc16feb8 != null) {
                arrayList2.add(m12396xcc16feb8);
            }
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.f fVar = this.f239912f;
        ((rk4.k8) aj6).j(fVar.m158354x19263085(), qk.x9.f445901d, arrayList2, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c(arrayList2, fVar), bw5.ar0.TingScene_BellHistory);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneAddTingUIC$addRingtoneToTingList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
