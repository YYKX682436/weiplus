package u22;

/* loaded from: classes10.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.r f505538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u22.r rVar) {
        super(0);
        this.f505538d = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processRecommend: ");
        u22.r rVar = this.f505538d;
        sb6.append(rVar.f505557l.size());
        sb6.append(", ");
        sb6.append(rVar.f505553h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerPanelData", sb6.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = rVar.f505557l;
        int i17 = 0;
        if (linkedList2.size() > 0) {
            linkedList.add(u22.r.f505540q);
            linkedList.addAll(linkedList2);
            for (r45.p64 p64Var : rVar.f505558m) {
                java.util.Iterator it = linkedList2.iterator();
                int i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i18 = -1;
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.p64) it.next()).f464325d, p64Var.f464325d)) {
                        break;
                    }
                    i18++;
                }
                if (i18 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerPanelData", "processRecommend: append");
                    linkedList.add(p64Var);
                }
            }
            if (rVar.f505553h || rVar.f505550e) {
                linkedList.add(u22.r.f505541r);
            } else {
                linkedList.add(u22.r.f505542s);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (java.lang.Object obj : linkedList) {
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new t85.d((r45.p64) obj, i17, 1));
            i17 = i19;
        }
        u22.k kVar = (u22.k) rVar.f505547b;
        kVar.getClass();
        pm0.v.L("StickerPanelCallbackWrapper_onRecommend", true, new u22.j(kVar, arrayList));
        return jz5.f0.f384359a;
    }
}
