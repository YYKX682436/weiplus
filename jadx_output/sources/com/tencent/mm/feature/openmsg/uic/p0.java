package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class p0 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        hb0.a aVar;
        j75.f Q6 = Q6();
        if (Q6 == null || (aVar = (hb0.a) Q6.getState()) == null) {
            return;
        }
        if (!aVar.f280013f) {
            j75.f Q62 = Q6();
            if (Q62 != null) {
                eb0.c cVar = new eb0.c();
                cVar.f250705b = pt0.f0.f358209b1.n(aVar.f280016i, aVar.f280014g);
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgInitUIC", "OpenMsgInitAction msgId:" + aVar.f280014g + " talker:" + aVar.f280016i + " msgInfo:" + cVar.f250705b);
                Q62.B3(cVar);
                return;
            }
            return;
        }
        j75.f Q63 = Q6();
        if (Q63 != null) {
            eb0.d dVar = new eb0.d();
            dVar.f250706b = new java.util.ArrayList();
            java.util.List list = aVar.f280015h;
            if (list == null) {
                list = new java.util.ArrayList();
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(aVar.f280016i, ((java.lang.Number) it.next()).longValue());
                java.util.ArrayList arrayList = dVar.f250706b;
                if (arrayList != null) {
                    arrayList.add(n17);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OpenMsgInitAction is multi select, talker:");
            sb6.append(aVar.f280016i);
            sb6.append(" msgInfo:");
            java.util.ArrayList arrayList2 = dVar.f250706b;
            sb6.append(arrayList2 != null ? java.lang.Integer.valueOf(arrayList2.size()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgInitUIC", sb6.toString());
            Q63.B3(dVar);
        }
    }
}
