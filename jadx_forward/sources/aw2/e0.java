package aw2;

/* loaded from: classes2.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.j0 f96277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f96278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f96279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(aw2.j0 j0Var, long j17, int i17) {
        super(1);
        this.f96277d = j0Var;
        this.f96278e = j17;
        this.f96279f = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = this.f96277d.f96295i;
        int i17 = it.length() == 0 ? -1 : 0;
        if (sVar != null) {
            sVar.c(this.f96278e, this.f96279f, "{\"errCode\": " + i17 + ",\"audioUrl\": \"" + it + "\"}");
        }
        return jz5.f0.f384359a;
    }
}
