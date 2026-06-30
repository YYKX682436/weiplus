package l93;

/* loaded from: classes8.dex */
public final class r0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public r0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VoipEvent=");
        am.y00 y00Var = event.f136478g;
        sb6.append(y00Var.f89948b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalPushNewXmlConsumer", sb6.toString());
        if (y00Var.f89948b != 11) {
            return false;
        }
        zy2.s7 Sj = ((c61.l7) i95.n0.c(c61.l7.class)).Sj();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(Sj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderGlobalPushNewXmlConsumer");
        ((qb2.r1) Sj).c(500L, qb2.c1.f442716f);
        return false;
    }
}
