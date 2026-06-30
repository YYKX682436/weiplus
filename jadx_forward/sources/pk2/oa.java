package pk2;

/* loaded from: classes3.dex */
public final class oa implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.pa f437658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f437659c;

    public oa(pk2.o9 o9Var, pk2.pa paVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8) {
        this.f437657a = o9Var;
        this.f437658b = paVar;
        this.f437659c = viewOnClickListenerC22631x1cc07cc8;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        pk2.o9 o9Var = this.f437657a;
        long m75942xfb822ef2 = ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_LIVE_MMKV");
            if (M != null) {
                M.putLong("VISITOR_GIFT_EFFECT_OFF_LIVE_ID", 0L);
            }
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_LIVE_MMKV");
            if (M2 != null) {
                M2.putLong("VISITOR_GIFT_EFFECT_OFF_LIVE_ID", m75942xfb822ef2);
            }
            o9Var.j(qo0.b.X1, null);
        }
        pk2.pa.w(o9Var, this.f437659c, z17);
        ((mm2.c1) o9Var.c(mm2.c1.class)).f410427u5 = !z17;
        qk2.f.f(this.f437658b, false, 1, null);
    }
}
