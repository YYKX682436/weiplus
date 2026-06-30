package sx2;

/* loaded from: classes15.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e f495060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f495061b;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e c15417x7e33cd1e, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f495060a = c15417x7e33cd1e;
        this.f495061b = c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.u2
    public boolean a(int i17, int i18) {
        sx2.a aVar;
        sx2.a aVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e c15417x7e33cd1e = this.f495060a;
        if (c15417x7e33cd1e.f214182n) {
            int ordinal = c15417x7e33cd1e.f214175d.ordinal();
            boolean z17 = false;
            if (ordinal == 0 || ordinal == 1) {
                c15417x7e33cd1e.getClass();
                if (i17 > 0) {
                    aVar = sx2.a.f495054f;
                } else {
                    c15417x7e33cd1e.getClass();
                    aVar = i17 < 0 ? sx2.a.f495053e : sx2.a.f495052d;
                }
                c15417x7e33cd1e.f214185q = aVar;
                int m8037x755bd410 = c15417x7e33cd1e.m8037x755bd410() * (c15417x7e33cd1e.m8020x7e414b06() - 1);
                int i19 = c15417x7e33cd1e.f214177f;
                if (1 <= i19 && i19 < m8037x755bd410) {
                    z17 = true;
                }
                if (z17) {
                    c15417x7e33cd1e.f214183o = true;
                }
            } else {
                c15417x7e33cd1e.getClass();
                if (i18 > 0) {
                    aVar2 = sx2.a.f495056h;
                } else {
                    c15417x7e33cd1e.getClass();
                    aVar2 = i18 < 0 ? sx2.a.f495055g : sx2.a.f495052d;
                }
                c15417x7e33cd1e.f214185q = aVar2;
                int m8037x755bd4102 = c15417x7e33cd1e.m8037x755bd410() * (c15417x7e33cd1e.m8020x7e414b06() - 1);
                int i27 = c15417x7e33cd1e.f214177f;
                if (1 <= i27 && i27 < m8037x755bd4102) {
                    z17 = true;
                }
                if (z17) {
                    c15417x7e33cd1e.f214183o = true;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.ad.C15417x7e33cd1e.m(c15417x7e33cd1e, this.f495061b);
        }
        return c15417x7e33cd1e.f214182n;
    }
}
