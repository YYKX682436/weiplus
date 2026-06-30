package c61;

/* loaded from: classes2.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f120522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f120523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f120524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c61.p2 f120526h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(android.text.Spannable spannable, long j17, long j18, android.content.Context context, c61.p2 p2Var) {
        super(3);
        this.f120522d = spannable;
        this.f120523e = j17;
        this.f120524f = j18;
        this.f120525g = context;
        this.f120526h = p2Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String nickname = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        this.f120522d.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(nickname, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560654qk), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), false, false, new c61.f2(this.f120523e, this.f120524f, this.f120525g, this.f120526h), 16, null), intValue, intValue2, 17);
        return jz5.f0.f384359a;
    }
}
