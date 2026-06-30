package gr2;

/* loaded from: classes10.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 f356299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f356301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393, java.lang.String str, int i17) {
        super(0);
        this.f356299d = c14572x50388393;
        this.f356300e = str;
        this.f356301f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393 = this.f356299d;
        java.util.LinkedHashMap linkedHashMap = c14572x50388393.f203677f;
        java.lang.String str = this.f356300e;
        km2.q qVar = (km2.q) linkedHashMap.get(str);
        if (qVar != null) {
            int i17 = qVar.f390724v;
            int i18 = this.f356301f;
            if (i17 != i18) {
                qVar.f390724v = i18;
                c14572x50388393.w();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393.l(c14572x50388393, str, i18);
            }
        }
        return jz5.f0.f384359a;
    }
}
