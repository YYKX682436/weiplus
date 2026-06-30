package cw2;

/* loaded from: classes10.dex */
public final class x4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 f305638d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 c15186x26928e14) {
        super(1);
        this.f305638d = c15186x26928e14;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList it = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Float n07 = kz5.n0.n0(it);
        float floatValue = n07 != null ? n07.floatValue() : 0.0f;
        float f17 = 100;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 c15186x26928e14 = this.f305638d;
        c15186x26928e14.F = (floatValue / f17) * ((float) c15186x26928e14.E);
        c15186x26928e14.f212168u.getClass();
        java.lang.Float n08 = kz5.n0.n0(it);
        float floatValue2 = n08 != null ? n08.floatValue() : 0.0f;
        c15186x26928e14.f212159i.f547161f.setTag(com.p314xaae8f345.mm.R.id.e7e, java.lang.Integer.valueOf((int) (((floatValue2 / f17) * r7.f547165m) / 1000)));
        return jz5.f0.f384359a;
    }
}
