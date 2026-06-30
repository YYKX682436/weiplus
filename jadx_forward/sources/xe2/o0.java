package xe2;

/* loaded from: classes3.dex */
public final class o0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535425c = "LiveHighLightCheerAppMsgInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        gk2.e eVar = this.f526800a;
        ((mm2.x4) eVar.a(mm2.x4.class)).f411065m.clear();
        ((mm2.x4) eVar.a(mm2.x4.class)).f411065m.addAll(msgList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535425c, "handleHighLightCheerMsg roomData.business(LiveCommonSlice::class.java).highLightCheerList:" + ((mm2.x4) eVar.a(mm2.x4.class)).f411065m.size());
    }

    @Override // we2.z
    public boolean e() {
        return true;
    }

    @Override // we2.z
    public boolean f(r45.ch1 appMsg) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsg, "appMsg");
        zl2.r4 r4Var = zl2.r4.f555483a;
        r45.xn1 xn1Var = (r45.xn1) appMsg.m75936x14adae67(13);
        return !r4Var.c2((xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c());
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20006};
    }
}
