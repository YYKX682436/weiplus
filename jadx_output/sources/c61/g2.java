package c61;

/* loaded from: classes2.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f38989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f38990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f38991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f38992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c61.p2 f38993h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(android.text.Spannable spannable, long j17, long j18, android.content.Context context, c61.p2 p2Var) {
        super(3);
        this.f38989d = spannable;
        this.f38990e = j17;
        this.f38991f = j18;
        this.f38992g = context;
        this.f38993h = p2Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String nickname = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        this.f38989d.setSpan(new com.tencent.mm.plugin.finder.view.yl(nickname, com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479121qk), com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_0_Alpha_0_2), false, false, new c61.f2(this.f38990e, this.f38991f, this.f38992g, this.f38993h), 16, null), intValue, intValue2, 17);
        return jz5.f0.f302826a;
    }
}
