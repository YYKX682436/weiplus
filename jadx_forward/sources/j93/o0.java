package j93;

/* loaded from: classes.dex */
public final class o0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.r0 f380000a;

    public o0(j93.r0 r0Var) {
        this.f380000a = r0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        int i18;
        j75.f m67437x4bd5310;
        java.lang.String stringExtra;
        java.util.ArrayList arrayList;
        j75.f m67437x4bd53102;
        wi5.n0 n0Var;
        java.util.ArrayList arrayList2;
        j93.r0 r0Var = this.f380000a;
        if (intent == null || (stringExtra = intent.getStringExtra("KSelectUserList")) == null) {
            i18 = 0;
        } else {
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) r0Var.f380021d).mo141623x754a37bb()).k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (a17 == null || (arrayList2 = a17.f233598o) == null) {
                arrayList = new java.util.ArrayList();
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (((ri5.j) next).f477659w) {
                        arrayList3.add(next);
                    }
                }
                arrayList = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                java.util.Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    arrayList.add(((ri5.j) it6.next()).f477644f);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = r0Var.P6();
            java.util.Set set = (P6 == null || (m67437x4bd53102 = P6.m67437x4bd5310()) == null || (n0Var = (wi5.n0) m67437x4bd53102.mo140437x75286adb()) == null) ? kz5.r0.f395535d : n0Var.Q;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj : f07) {
                if (true ^ arrayList.contains((java.lang.String) obj)) {
                    arrayList4.add(obj);
                }
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                java.lang.Object next2 = it7.next();
                java.lang.String userName = (java.lang.String) next2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
                if ((n17 != null && n17.r2() && !n17.o2()) && !set.contains(userName)) {
                    arrayList5.add(next2);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusMenuLabelUIC", "startForResult:size:" + f07.size() + " contactList:" + arrayList5.size() + " newUserList:" + arrayList4.size() + " oldUserNameList:" + arrayList.size() + " excludeSize:" + set.size());
            j93.r0.T6(r0Var, arrayList5);
            i18 = arrayList5.size();
        }
        if (intent != null) {
            int intExtra = intent.getIntExtra("INTENT_KEY_SIZE", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusMenuLabelUIC", "onImportContactFromChatRoomClick: count:" + intExtra);
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = r0Var.P6();
            if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
                return;
            }
            m67437x4bd5310.B3(new wi5.b0(intExtra, i18));
        }
    }
}
