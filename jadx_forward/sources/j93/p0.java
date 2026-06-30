package j93;

/* loaded from: classes.dex */
public final class p0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f380006a;

    public p0(j93.r0 r0Var) {
        this.f380006a = r0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        int i18;
        j75.f m67437x4bd5310;
        java.lang.String stringExtra;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        j75.f m67437x4bd53102;
        wi5.n0 n0Var;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        j93.r0 r0Var = this.f380006a;
        if (intent == null || (stringExtra = intent.getStringExtra("KSelectUserList")) == null) {
            i18 = 0;
        } else {
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) r0Var.f380021d).mo141623x754a37bb()).k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (a17 == null || (arrayList4 = a17.f233598o) == null) {
                arrayList = new java.util.ArrayList();
            } else {
                arrayList = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
                java.util.Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ri5.j) it.next()).f477644f);
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k18 = ((em.l2) ((jz5.n) r0Var.f380021d).mo141623x754a37bb()).k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a18 = xm3.u0.a(k18);
            if (a18 == null || (arrayList3 = a18.f233598o) == null) {
                arrayList2 = new java.util.ArrayList();
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    if (((ri5.j) next).f477659w) {
                        arrayList5.add(next);
                    }
                }
                arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList5, 10));
                java.util.Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    arrayList2.add(((ri5.j) it7.next()).f477644f);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = r0Var.P6();
            java.util.Set set = (P6 == null || (m67437x4bd53102 = P6.m67437x4bd5310()) == null || (n0Var = (wi5.n0) m67437x4bd53102.mo140437x75286adb()) == null) ? kz5.r0.f395535d : n0Var.Q;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (java.lang.Object obj : f07) {
                if (true ^ arrayList2.contains((java.lang.String) obj)) {
                    arrayList6.add(obj);
                }
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList6.iterator();
            while (it8.hasNext()) {
                java.lang.Object next2 = it8.next();
                if (arrayList.contains((java.lang.String) next2)) {
                    arrayList7.add(next2);
                }
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.util.Iterator it9 = arrayList7.iterator();
            while (it9.hasNext()) {
                java.lang.Object next3 = it9.next();
                java.lang.String userName = (java.lang.String) next3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
                if ((n17 != null && n17.r2() && !n17.o2()) && !set.contains(userName)) {
                    arrayList8.add(next3);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusMenuLabelUIC", "startForResult:userNameList:" + f07.size() + " contactList:" + arrayList8.size() + " excludeSize:" + set.size());
            j93.r0.T6(r0Var, arrayList8);
            i18 = arrayList8.size();
        }
        if (intent != null) {
            int intExtra = intent.getIntExtra("INTENT_KEY_SIZE", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusMenuLabelUIC", "onImportContactFromLabelClick: count:" + intExtra);
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = r0Var.P6();
            if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
                return;
            }
            m67437x4bd5310.B3(new wi5.r0(intExtra, i18));
        }
    }
}
