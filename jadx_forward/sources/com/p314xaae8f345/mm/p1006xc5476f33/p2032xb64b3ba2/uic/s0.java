package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 f240016d;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var) {
        this.f240016d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$refreshAddUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "on click add ui link to add new ringtone");
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var = this.f240016d;
        v0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288314b & (-65));
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", v0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.iqu));
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 6);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) mx3.i0.g()).iterator();
        while (it.hasNext()) {
            java.lang.String str = ((vx3.a) it.next()).f522795e;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        arrayList2.add(c01.z1.r());
        intent.putExtra("block_contact", kz5.n0.g0(arrayList2, ",", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.n0.f239982d, 30, null));
        j45.l.v(v0Var.m158354x19263085(), ".ui.contact.SelectContactUI", intent, 8);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/uic/RingtoneExclusiveMainUIC$refreshAddUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
