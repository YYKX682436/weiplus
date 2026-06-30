package ir1;

/* loaded from: classes11.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f375607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir1.e0 f375608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr1.e f375609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l75.w0 w0Var, ir1.e0 e0Var, hr1.e eVar) {
        super(0);
        this.f375607d = w0Var;
        this.f375608e = e0Var;
        this.f375609f = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConversationStorageChange] eventData.eventId = ");
        l75.w0 w0Var = this.f375607d;
        sb6.append(w0Var.f398507b);
        sb6.append(',');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansConversationAdapter", sb6.toString());
        int i17 = w0Var.f398507b;
        hr1.e eVar = this.f375609f;
        ir1.e0 e0Var = this.f375608e;
        if (i17 == 1 || i17 == 2) {
            ir1.e0.B(e0Var, eVar);
        } else if (i17 == 5) {
            java.util.HashMap hashMap = e0Var.f375495i;
            hr1.e eVar2 = (hr1.e) hashMap.get(eVar.f66326xbed8694c);
            java.util.ArrayList arrayList = e0Var.f375494h;
            int c07 = kz5.n0.c0(arrayList, eVar2);
            eVar.u0();
            if (c07 >= 0 && c07 < arrayList.size()) {
                arrayList.set(c07, eVar);
                java.lang.String field_sessionId = eVar.f66326xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, eVar);
                if (c07 >= 0 && c07 < arrayList.size()) {
                    e0Var.m8147xed6e4d18(c07);
                }
            }
        } else if (i17 == 6) {
            if (e0Var.f375493g == 1) {
                ((java.util.concurrent.ConcurrentHashMap.KeySetView) e0Var.f375496m).remove(eVar.f66326xbed8694c);
            }
            java.lang.String field_sessionId2 = eVar.f66326xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId2, "field_sessionId");
            e0Var.E(field_sessionId2);
        } else if (i17 == 7) {
            ir1.e0.B(e0Var, eVar);
        } else if (i17 == 8) {
            java.util.Iterator it = e0Var.f375494h.iterator();
            while (it.hasNext()) {
                hr1.e eVar3 = (hr1.e) it.next();
                eVar3.u0();
                eVar3.f66330xa35b5abb = 0;
                eVar3.f66324x9b4f418d = 1;
                java.util.HashMap hashMap2 = e0Var.f375495i;
                java.lang.String field_sessionId3 = eVar3.f66326xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId3, "field_sessionId");
                hashMap2.put(field_sessionId3, eVar3);
            }
            e0Var.m8146xced61ae5();
        }
        return jz5.f0.f384359a;
    }
}
