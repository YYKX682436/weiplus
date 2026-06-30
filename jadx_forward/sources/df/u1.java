package df;

/* loaded from: classes7.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f311091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f311092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.w1 f311093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(float f17, float f18, df.w1 w1Var) {
        super(0);
        this.f311091d = f17;
        this.f311092e = f18;
        this.f311093f = w1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateViewport, waitForDone run view size[");
        float f17 = this.f311091d;
        sb6.append(f17);
        sb6.append(" x ");
        float f18 = this.f311092e;
        sb6.append(f18);
        sb6.append(']');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
        df.w1 w1Var = this.f311093f;
        com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = w1Var.f311115f;
        if (c25587x226dda3 != null) {
            c25587x226dda3.m95868xb22b9df(w1Var.f311113d, f17, f18);
        }
        return jz5.f0.f384359a;
    }
}
