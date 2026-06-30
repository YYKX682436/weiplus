package wg2;

/* loaded from: classes3.dex */
public final class c extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f527256m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f527256m = jz5.h.b(new wg2.b(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveHandOffController", "onLiveDeactivate " + ((java.lang.Number) ((jz5.n) this.f527256m).mo141623x754a37bb()).longValue());
        wg2.a aVar = wg2.a.f527253a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 c17 = aVar.c(getStore().getLiveRoomData());
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHandOffUtil", "delHandOff " + c17);
            ((d73.i) i95.n0.c(d73.i.class)).A8(c17.getKey());
        }
        aVar.b(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveHandOffController", "onLiveStart " + ((java.lang.Number) ((jz5.n) this.f527256m).mo141623x754a37bb()).longValue());
        wg2.a aVar = wg2.a.f527253a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 c17 = aVar.c(getStore().getLiveRoomData());
        if (c17 != null) {
            aVar.b(c17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = wg2.a.f527254b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC16085x8c838260 != null ? abstractC16085x8c838260.getKey() : null, c17.getKey())) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHandOffUtil", "addOrUpdateHandOff " + c17);
            wg2.a.f527254b = c17;
            java.lang.String key = c17.getKey();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHandOffUtil", "save currentHandOffKey " + key);
            if (key != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("FinderLiveHandOffUtil_current", key);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().remove("FinderLiveHandOffUtil_current");
            }
            ((d73.i) i95.n0.c(d73.i.class)).Jc(c17);
        }
    }
}
