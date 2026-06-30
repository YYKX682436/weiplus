package sf4;

/* loaded from: classes4.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502) {
        super(2);
        this.f489013d = c18497x85806502;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        float floatValue = ((java.lang.Number) obj2).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f489013d;
        c18497x85806502.f253637w = intValue + floatValue;
        int i17 = intValue + 1;
        float f17 = 1 - floatValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18494xf7976fba c18494xf7976fba = c18497x85806502.L;
        int b17 = c18494xf7976fba.f253597r == ze4.k.MultiUserGallery ? i65.a.b(c18494xf7976fba.getContext(), 52) : i65.a.b(c18494xf7976fba.getContext(), 32);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2240xbddafb2a.C18470xaa54982a c18470xaa54982a = c18494xf7976fba.f253599t;
        if (c18470xaa54982a != null) {
            int i18 = (int) (b17 * f17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c18470xaa54982a, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView", "setScrollOffset", "(IF)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c18470xaa54982a.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c18470xaa54982a, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView", "setScrollOffset", "(IF)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        return jz5.f0.f384359a;
    }
}
