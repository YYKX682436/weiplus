package bg2;

/* loaded from: classes2.dex */
public final class f6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f101623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f101624g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(java.lang.String str, android.content.Context context, bg2.q6 q6Var, boolean z17) {
        super(0);
        this.f101621d = str;
        this.f101622e = context;
        this.f101623f = q6Var;
        this.f101624g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5680xf556494c c5680xf556494c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5680xf556494c(new bg2.e6(this.f101621d, this.f101622e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f101623f.f498674d.f498681h;
        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
        am.wi wiVar = c5680xf556494c.f136006g;
        wiVar.f89819a = mo2128x1ed62e84;
        wiVar.f89820b = this.f101624g;
        c5680xf556494c.e();
        return jz5.f0.f384359a;
    }
}
