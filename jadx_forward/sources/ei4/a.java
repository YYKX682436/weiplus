package ei4;

/* loaded from: classes11.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f334734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.h f334735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f334736f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l75.w0 w0Var, ei4.h hVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f334734d = w0Var;
        this.f334735e = hVar;
        this.f334736f = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConversationStorageChange] eventData.eventId = ");
        l75.w0 w0Var = this.f334734d;
        sb6.append(w0Var.f398507b);
        sb6.append(',');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusConversationAdapter", sb6.toString());
        int i17 = w0Var.f398507b;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f334736f;
        ei4.h hVar = this.f334735e;
        if (i17 == 1 || i17 == 2) {
            ei4.h.B(hVar, (hi4.a) h0Var.f391656d);
        } else if (i17 == 5) {
            hi4.a aVar = (hi4.a) h0Var.f391656d;
            java.util.HashMap hashMap = hVar.f334749f;
            hi4.a aVar2 = (hi4.a) hashMap.get(aVar.f76582xbed8694c);
            java.util.LinkedList linkedList = hVar.f334748e;
            int c07 = kz5.n0.c0(linkedList, aVar2);
            aVar.t0();
            if (c07 >= 0 && c07 < linkedList.size()) {
                linkedList.set(c07, aVar);
                java.lang.String field_sessionId = aVar.f76582xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, aVar);
                if (c07 >= 0 && c07 < linkedList.size()) {
                    hVar.m8147xed6e4d18(c07);
                }
            }
        } else if (i17 == 6) {
            hi4.a aVar3 = (hi4.a) h0Var.f391656d;
            java.util.HashMap hashMap2 = hVar.f334749f;
            hi4.a aVar4 = (hi4.a) hashMap2.get(aVar3.f76582xbed8694c);
            java.util.LinkedList linkedList2 = hVar.f334748e;
            int c08 = kz5.n0.c0(linkedList2, aVar4);
            if (c08 >= 0 && c08 < linkedList2.size()) {
                linkedList2.remove(c08);
                hashMap2.remove(aVar3.f76582xbed8694c);
                hVar.m8155x27702c4(c08);
            }
        } else if (i17 == 7) {
            ei4.h.B(hVar, (hi4.a) h0Var.f391656d);
        }
        return jz5.f0.f384359a;
    }
}
