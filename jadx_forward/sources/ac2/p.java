package ac2;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ac2.t f84580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f84581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d f84582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ac2.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d) {
        super(1);
        this.f84580d = tVar;
        this.f84581e = abstractC14490x69736cb5;
        this.f84582f = c15272xcb1f133d;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        ac2.t tVar = this.f84580d;
        java.lang.String str = tVar.B;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishCapsule(");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f84581e;
        sb6.append(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        abstractC14490x69736cb5.y1(true);
        this.f84582f.m61970xf664cfe7(null);
        tVar.D = null;
        tVar.E0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d = tVar.L;
        if (c15272xcb1f133d != null) {
            c15272xcb1f133d.m61973x5416327a(true);
        }
        return jz5.f0.f384359a;
    }
}
