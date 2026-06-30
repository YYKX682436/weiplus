package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.q f206184e;

    public o(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.q qVar) {
        this.f206183d = str;
        this.f206184e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderActivityWidget$initActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kk.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r.get(this.f206183d);
        r45.e21 e21Var = l2Var != null ? l2Var.f205452h : null;
        if (e21Var != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_activity_id", e21Var.m75942xfb822ef2(0));
            intent.putExtra("key_activity_name", e21Var.m75945x2fec8307(2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileHeaderUIC", "eventTopicId :" + e21Var.m75942xfb822ef2(0) + " eventName:" + e21Var.m75945x2fec8307(2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.q qVar = this.f206184e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, qVar.f206207a, intent, 0L, null, 0, 0, false, 0, null, 384, null);
            intent.putExtra("key_activity_profile_src_type", "2");
            s92.g.f486539a.a(qVar.f206207a, intent, c01.id.c(), 2);
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).Bi(qVar.f206207a, intent, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderActivityWidget$initActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
