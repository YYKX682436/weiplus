package gr2;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 f356292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f356294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f356295g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f356296h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f356297i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393, java.lang.String str, int i17, org.json.JSONObject jSONObject, int i18, float f17) {
        super(0);
        this.f356292d = c14572x50388393;
        this.f356293e = str;
        this.f356294f = i17;
        this.f356295g = jSONObject;
        this.f356296h = i18;
        this.f356297i = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        r45.ma4 ma4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393 = this.f356292d;
        km2.q qVar = (km2.q) c14572x50388393.f203677f.get(this.f356293e);
        if (qVar != null) {
            qVar.f390724v = this.f356294f;
        }
        fj2.r rVar = fj2.r.f344715a;
        java.util.LinkedHashMap linkedHashMap = c14572x50388393.f203677f;
        vp2.i0 i0Var = c14572x50388393.f203680i;
        if (i0Var == null || (feedObject = i0Var.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (ma4Var = (r45.ma4) m59258xd0557130.m75936x14adae67(23)) == null || (str = ma4Var.f461834n) == null) {
            str = "";
        }
        java.util.LinkedList h17 = rVar.h(this.f356295g, (km2.q) linkedHashMap.get(str), new gr2.d0(c14572x50388393));
        c14572x50388393.w();
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str2 = ((km2.q) entry.getValue()).f390703a;
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393.l(c14572x50388393, str2, ((km2.q) entry.getValue()).f390724v);
        }
        c14572x50388393.f203686r = new xh2.d(h17, this.f356296h, this.f356297i);
        return jz5.f0.f384359a;
    }
}
