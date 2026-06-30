package b71;

/* loaded from: classes.dex */
public final class i implements z61.h {
    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        z61.c data = (z61.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.f551857a == z61.b.f551854d) {
            int i17 = data.f551858b;
            java.lang.String customInfo = data.f551859c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customInfo, "customInfo");
            java.lang.String ticket = data.f551860d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
            java.lang.String policyList = data.f551861e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policyList, "policyList");
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
            if (c20976x6ba6452a != null) {
                v65.i.b(c20976x6ba6452a, null, new a71.c(i17, customInfo, ticket, policyList, "AgreeEvent", null), 1, null);
            }
            a71.d dVar = a71.e.f83448d;
            if (dVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Account.AccountComplianceReceiver", "currentObj: " + dVar.f83442c + ' ' + dVar.f83440a);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ticket, dVar.f83442c)) {
                    a71.e.f83448d = null;
                }
            }
        }
    }
}
