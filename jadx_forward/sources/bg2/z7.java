package bg2;

/* loaded from: classes2.dex */
public final class z7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f102246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f102247g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(java.lang.String str, android.content.Context context, bg2.l8 l8Var, boolean z17) {
        super(0);
        this.f102244d = str;
        this.f102245e = context;
        this.f102246f = l8Var;
        this.f102247g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5680xf556494c c5680xf556494c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5680xf556494c(new bg2.y7(this.f102244d, this.f102245e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f102246f.f498674d.f498681h;
        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
        am.wi wiVar = c5680xf556494c.f136006g;
        wiVar.f89819a = mo2128x1ed62e84;
        wiVar.f89820b = this.f102247g;
        c5680xf556494c.e();
        return jz5.f0.f384359a;
    }
}
