package cw2;

/* loaded from: classes10.dex */
public final class oa extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f305436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 f305437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190) {
        super(0);
        this.f305436d = z17;
        this.f305437e = c15201xe049f190;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        float f17 = this.f305436d ? 1.0f : 0.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190 = this.f305437e;
        if (!(c15201xe049f190.getAlpha() == f17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set alpha:");
            sb6.append(f17);
            sb6.append(" feedId: ");
            cw2.wa waVar = c15201xe049f190.f212289y;
            sb6.append((waVar == null || (c14989xf862ae88 = waVar.f305632f) == null) ? null : java.lang.Long.valueOf(c14989xf862ae88.getFeedId()));
            c15201xe049f190.Z(sb6.toString());
            c15201xe049f190.setAlpha(f17);
        }
        return jz5.f0.f384359a;
    }
}
