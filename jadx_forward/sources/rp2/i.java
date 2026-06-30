package rp2;

/* loaded from: classes8.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f480117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f480118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962) {
        super(0);
        this.f480117d = z17;
        this.f480118e = c14522x8ffd8962;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        so2.h1 h1Var;
        float f17 = this.f480117d ? 1.0f : 0.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = this.f480118e;
        if (!(c14522x8ffd8962.getAlpha() == f17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set alpha:");
            sb6.append(f17);
            sb6.append(" feedId: ");
            gp2.a aVar = c14522x8ffd8962.f203062m;
            sb6.append((aVar == null || (h1Var = aVar.f355729c) == null) ? null : java.lang.Long.valueOf(h1Var.mo2128x1ed62e84()));
            c14522x8ffd8962.r(sb6.toString());
            c14522x8ffd8962.setAlpha(f17);
        }
        return jz5.f0.f384359a;
    }
}
