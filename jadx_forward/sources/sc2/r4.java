package sc2;

/* loaded from: classes2.dex */
public final class r4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f487725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd f487726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487727g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487729i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(xc2.p0 p0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd c15287xabbcfcd, in5.s0 s0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(0);
        this.f487724d = p0Var;
        this.f487725e = h0Var;
        this.f487726f = c15287xabbcfcd;
        this.f487727g = s0Var;
        this.f487728h = str;
        this.f487729i = abstractC14490x69736cb5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f487724d.f534777f;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (str = feedObject.m59299x6bf53a6c()) == null) {
            str = "";
        }
        java.lang.String m75945x2fec8307 = ((r45.h32) this.f487725e.f391656d).m75945x2fec8307(4);
        r45.h32 bj6 = ((b92.d1) zbVar).bj(str, m75945x2fec8307 != null ? m75945x2fec8307 : "");
        if (bj6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd c15287xabbcfcd = this.f487726f;
            java.lang.String str2 = this.f487728h;
            android.content.Context context = this.f487727g.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f487729i;
            c15287xabbcfcd.b(context, bj6, str2, true, abstractC14490x69736cb52 != null ? java.lang.Long.valueOf(abstractC14490x69736cb52.mo2128x1ed62e84()) : null, abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.w() : null);
        }
        return jz5.f0.f384359a;
    }
}
