package cj5;

/* loaded from: classes.dex */
public class n1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123732d = jz5.h.b(new cj5.m1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList arrayList;
        int i19;
        j75.f Q6;
        java.util.ArrayList arrayList2;
        int i27;
        java.util.ArrayList arrayList3;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent == null || i17 != 7) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        jz5.g gVar = this.f123732d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) gVar).mo141623x754a37bb()).k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 == null || (arrayList3 = a17.f233598o) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(((ri5.j) it.next()).f477644f);
            }
            arrayList = arrayList4;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k18 = ((em.l2) ((jz5.n) gVar).mo141623x754a37bb()).k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a18 = xm3.u0.a(k18);
        if (a18 == null || (arrayList2 = a18.f233598o) == null) {
            i19 = 0;
        } else {
            if (arrayList2.isEmpty()) {
                i27 = 0;
            } else {
                java.util.Iterator it6 = arrayList2.iterator();
                i27 = 0;
                while (it6.hasNext()) {
                    if (((ri5.j) it6.next()).f477659w && (i27 = i27 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            i19 = i27;
        }
        java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.B3(new wi5.z0(i19 - f07.size()));
        }
        if (arrayList != null) {
            for (java.lang.String str : kz5.n0.G0(arrayList, kz5.n0.X0(r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null)))) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c17 = ((em.l2) ((jz5.n) gVar).mo141623x754a37bb()).c();
                if (str != null) {
                    c17.g(str, false, false);
                } else {
                    c17.getClass();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectContactHalfScreenListUIC", "onActivityResult:usernames:" + stringExtra + ' ');
        j75.f Q63 = Q6();
        if (Q63 != null) {
            Q63.B3(new wi5.m0(r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null), -1));
        }
        if (intent.getIntExtra("INTENT_KEY_ACTION", 0) != 1 || (Q6 = Q6()) == null) {
            return;
        }
        Q6.B3(new wi5.c());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new cj5.l1(this));
    }
}
