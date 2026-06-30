package b00;

/* loaded from: classes9.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.e0 f98197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f98198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b00.r f98199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f98200g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e00.e0 e0Var, java.util.List list, b00.r rVar, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(1);
        this.f98197d = e0Var;
        this.f98198e = list;
        this.f98199f = rVar;
        this.f98200g = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        e00.e0 e0Var = this.f98197d;
        e0Var.f327292d = null;
        java.util.List list2 = this.f98198e;
        boolean z17 = list != null && list.size() == list2.size();
        b00.r rVar = this.f98199f;
        if (z17) {
            int size = list2.size();
            for (int i17 = 0; i17 < size; i17++) {
                bw5.se0 reqInfo = (bw5.se0) list2.get(i17);
                bw5.ue0 shopCard = (bw5.ue0) list.get(i17);
                e00.e eVar = (e00.e) rVar.f98291e;
                eVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shopCard, "shopCard");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
                java.lang.String b17 = shopCard.b();
                e00.d dVar = new e00.d(shopCard, java.lang.System.currentTimeMillis() / 1000);
                eVar.f327287b.put(b17, dVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "update shopCard cache for key" + b17 + " when:" + dVar.f327284b);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("batchRequestShopCardInfo done for key:");
        sb6.append(e0Var.mo126544xb5884f29());
        sb6.append(", pending size: ");
        java.util.List list3 = (java.util.List) rVar.f98293g.get(e0Var.mo126544xb5884f29());
        sb6.append(list3 != null ? java.lang.Integer.valueOf(list3.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", sb6.toString());
        b00.r.wi(rVar, e0Var);
        ((p3325xe03a0797.p3326xc267989b.r) this.f98200g).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(list));
        return jz5.f0.f384359a;
    }
}
