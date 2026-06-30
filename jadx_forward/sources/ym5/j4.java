package ym5;

/* loaded from: classes10.dex */
public final class j4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f544940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f544941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(ym5.s3 s3Var, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        super(0);
        this.f544940d = s3Var;
        this.f544941e = c22801x87cbdc00;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFinishLoadMore2] reason=");
        ym5.s3 s3Var = this.f544940d;
        sb6.append(s3Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RLMoreLayout", sb6.toString());
        this.f544941e.m82698x62664cef(false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f544941e;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.r(c22801x87cbdc00, false, null, new ym5.i4(c22801x87cbdc00, s3Var), 3, null);
        return jz5.f0.f384359a;
    }
}
