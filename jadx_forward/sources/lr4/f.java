package lr4;

/* loaded from: classes11.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f402261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr4.k f402262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kr4.g f402263f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.w0 w0Var, lr4.k kVar, kr4.g gVar) {
        super(0);
        this.f402261d = w0Var;
        this.f402262e = kVar;
        this.f402263f = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConversationStorageChange] eventData.eventId = ");
        l75.w0 w0Var = this.f402261d;
        sb6.append(w0Var.f398507b);
        sb6.append(',');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.W1wPersonalMsgConvAdapter", sb6.toString());
        int i17 = w0Var.f398507b;
        lr4.k kVar = this.f402262e;
        if (i17 == 1 || i17 == 2) {
            java.lang.Object obj = w0Var.f398509d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wConversation");
            lr4.k.B(kVar, (kr4.g) obj);
        } else if (i17 == 5) {
            java.lang.Object obj2 = w0Var.f398509d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wConversation");
            kr4.g gVar = (kr4.g) obj2;
            java.util.HashMap hashMap = kVar.f402277g;
            kr4.g gVar2 = (kr4.g) hashMap.get(gVar.f69048xbed8694c);
            java.util.ArrayList arrayList = kVar.f402276f;
            int c07 = kz5.n0.c0(arrayList, gVar2);
            gVar.t0();
            if (c07 >= 0 && c07 < arrayList.size()) {
                arrayList.set(c07, gVar);
                java.lang.String field_sessionId = gVar.f69048xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, gVar);
                if (c07 >= 0 && c07 < arrayList.size()) {
                    kVar.m8147xed6e4d18(c07);
                }
            }
        } else if (i17 == 6) {
            java.lang.Object obj3 = w0Var.f398509d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wConversation");
            kr4.g gVar3 = (kr4.g) obj3;
            java.util.HashMap hashMap2 = kVar.f402277g;
            kr4.g gVar4 = (kr4.g) hashMap2.get(gVar3.f69048xbed8694c);
            java.util.ArrayList arrayList2 = kVar.f402276f;
            int c08 = kz5.n0.c0(arrayList2, gVar4);
            if (c08 >= 0 && c08 < arrayList2.size()) {
                arrayList2.remove(c08);
                hashMap2.remove(gVar3.f69048xbed8694c);
                kVar.m8155x27702c4(c08);
            }
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = kVar.f402275e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(componentCallbacksC1101xa17d4670, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            kr4.g gVar5 = this.f402263f;
            sb7.append(gVar5.f69048xbed8694c);
            sb7.append(":message_window");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.C18980x270fd319) componentCallbacksC1101xa17d4670).K0(vu4.d.f521827g, mr4.a.a(sb7.toString()), mr4.a.b(), gVar5.f69048xbed8694c);
        } else if (i17 == 7) {
            java.lang.Object obj4 = w0Var.f398509d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wConversation");
            lr4.k.B(kVar, (kr4.g) obj4);
        } else if (i17 == 8) {
            java.util.Iterator it = kVar.f402276f.iterator();
            while (it.hasNext()) {
                kr4.g gVar6 = (kr4.g) it.next();
                gVar6.t0();
                gVar6.f69052xa35b5abb = 0;
                gVar6.f69046x9b4f418d = 1;
                java.util.HashMap hashMap3 = kVar.f402277g;
                java.lang.String field_sessionId2 = gVar6.f69048xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId2, "field_sessionId");
                hashMap3.put(field_sessionId2, gVar6);
            }
            kVar.m8146xced61ae5();
        }
        return jz5.f0.f384359a;
    }
}
