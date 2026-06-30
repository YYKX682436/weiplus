package df;

/* loaded from: classes7.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.w1 f311085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f311086e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(df.w1 w1Var, yz5.a aVar) {
        super(0);
        this.f311085d = w1Var;
        this.f311086e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        df.w1 w1Var = this.f311085d;
        sb6.append(w1Var.f311113d);
        sb6.append(" updateSkylineRuntimeInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", sb6.toString(), new java.lang.Object[0]);
        com.p314xaae8f345.p2936x80def495.jni.C25606xb28c2cf1 c25606xb28c2cf1 = (com.p314xaae8f345.p2936x80def495.jni.C25606xb28c2cf1) this.f311086e.mo152xb9724478();
        if (c25606xb28c2cf1 != null) {
            com.p314xaae8f345.p2936x80def495.C25587x226dda3 c25587x226dda3 = w1Var.f311115f;
            if (c25587x226dda3 != null) {
                c25587x226dda3.m95867xe90a441d(w1Var.f311113d, c25606xb28c2cf1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineView", "updateSkylineRuntimeInfo finished", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
