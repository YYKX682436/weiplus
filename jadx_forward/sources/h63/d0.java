package h63;

/* loaded from: classes7.dex */
public final class d0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.n1 f360756d;

    public d0(h63.n1 n1Var) {
        this.f360756d = n1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Parcelable parcelable = ((com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57) obj).f148644g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveMemberInfoListPayload");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16056x72b57895> list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16055x610e3697) parcelable).f223557d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(list, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveMemberInfoPayload>");
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16056x72b57895 c16056x72b57895 : list) {
            arrayList.add(kz5.c1.k(new jz5.l("nickname", c16056x72b57895.f223558d), new jz5.l("rewardAmountInHeat", java.lang.Integer.valueOf(c16056x72b57895.f223559e))));
        }
        mc1.e eVar = (mc1.e) this.f360756d;
        eVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("memberList", arrayList);
        eVar.f407119a.a(eVar.f407120b, eVar.f407121c.p("ok", hashMap));
    }
}
