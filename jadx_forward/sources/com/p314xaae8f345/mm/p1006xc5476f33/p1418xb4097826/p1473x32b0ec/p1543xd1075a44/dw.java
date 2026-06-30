package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class dw implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f199699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw f199700b;

    public dw(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw nwVar) {
        this.f199699a = list;
        this.f199700b = nwVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSwitchRoleDialog", "Add role resultCode " + i17 + " data " + intent);
        if (i17 == -1) {
            r45.of1 of1Var = new r45.of1();
            java.lang.String str3 = "";
            if (intent == null || (str = intent.getStringExtra("KEY_ALIAS_VISITOR_NICKNAME")) == null) {
                str = "";
            }
            of1Var.set(0, str);
            if (intent == null || (str2 = intent.getStringExtra("KEY_ALIAS_VISITOR_AVATAR")) == null) {
                str2 = "";
            }
            of1Var.set(1, str2);
            if (intent != null && (stringExtra = intent.getStringExtra("KEY_ALIAS_VISITOR_USERNAME")) != null) {
                str3 = stringExtra;
            }
            of1Var.set(3, str3);
            of1Var.set(2, 2);
            java.util.List list = this.f199699a;
            if (list.size() > 0) {
                list.add(1, of1Var);
            } else {
                list.add(of1Var);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new cm2.e((r45.of1) it.next()));
            }
            arrayList.addAll(arrayList2);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f199700b.f200745m;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("roleListView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.E0(arrayList);
                c22848x6ddd90cf.m8146xced61ae5();
            }
            java.util.LinkedList linkedList = new java.util.LinkedList(list);
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            if (c1Var != null) {
                c1Var.V3 = linkedList;
            }
            zl2.r4.f555483a.U2(linkedList);
        }
    }
}
