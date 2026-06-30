package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

/* loaded from: classes4.dex */
public final class t implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f267731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267732b;

    public t(java.util.List list, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f267731a = list;
        this.f267732b = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList session_info_list = ((v53.g) ((com.p314xaae8f345.mm.p944x882e457a.f) obj).f152151d).f514870d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(session_info_list, "session_info_list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = session_info_list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((v53.o) next).f514890m == 1) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((v53.o) it6.next()).f514884d);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : this.f267731a) {
            if (arrayList2.contains(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19466x3fbac4fb) obj2).f267669d)) {
                arrayList3.add(obj2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19469xc5d71a31 c19469xc5d71a31 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19469xc5d71a31(arrayList3, "get conversationList", true);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267732b;
        if (rVar == null) {
            return null;
        }
        rVar.a(c19469xc5d71a31);
        return jz5.f0.f384359a;
    }
}
