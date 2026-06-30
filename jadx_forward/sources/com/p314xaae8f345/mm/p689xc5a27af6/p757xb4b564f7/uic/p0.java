package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class p0 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        hb0.a aVar;
        j75.f Q6 = Q6();
        if (Q6 == null || (aVar = (hb0.a) Q6.mo140437x75286adb()) == null) {
            return;
        }
        if (!aVar.f361546f) {
            j75.f Q62 = Q6();
            if (Q62 != null) {
                eb0.c cVar = new eb0.c();
                cVar.f332238b = pt0.f0.f439742b1.n(aVar.f361549i, aVar.f361547g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgInitUIC", "OpenMsgInitAction msgId:" + aVar.f361547g + " talker:" + aVar.f361549i + " msgInfo:" + cVar.f332238b);
                Q62.B3(cVar);
                return;
            }
            return;
        }
        j75.f Q63 = Q6();
        if (Q63 != null) {
            eb0.d dVar = new eb0.d();
            dVar.f332239b = new java.util.ArrayList();
            java.util.List list = aVar.f361548h;
            if (list == null) {
                list = new java.util.ArrayList();
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(aVar.f361549i, ((java.lang.Number) it.next()).longValue());
                java.util.ArrayList arrayList = dVar.f332239b;
                if (arrayList != null) {
                    arrayList.add(n17);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OpenMsgInitAction is multi select, talker:");
            sb6.append(aVar.f361549i);
            sb6.append(" msgInfo:");
            java.util.ArrayList arrayList2 = dVar.f332239b;
            sb6.append(arrayList2 != null ? java.lang.Integer.valueOf(arrayList2.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgInitUIC", sb6.toString());
            Q63.B3(dVar);
        }
    }
}
