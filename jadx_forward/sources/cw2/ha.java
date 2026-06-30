package cw2;

/* loaded from: classes10.dex */
public final class ha extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 f305290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190) {
        super(1);
        this.f305290d = c15201xe049f190;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.s7 it = (r45.s7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190 = this.f305290d;
        mn0.b0 player = c15201xe049f190.getPlayer();
        if (player != null) {
            android.content.Context context = c15201xe049f190.getContext();
            if (!java.lang.Boolean.valueOf(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112).booleanValue()) {
                context = null;
            }
            if (context == null) {
                context = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
            }
            ((mn0.y) player).r(c15201xe049f190.T(context), c15201xe049f190.G, it.m75939xb282bd08(0), it.m75939xb282bd08(1));
        }
        return jz5.f0.f384359a;
    }
}
