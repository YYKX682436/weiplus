package hm3;

/* loaded from: classes.dex */
public abstract class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f363754h = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f363755d;

    /* renamed from: e, reason: collision with root package name */
    public final long f363756e;

    /* renamed from: f, reason: collision with root package name */
    public long f363757f;

    /* renamed from: g, reason: collision with root package name */
    public long f363758g;

    public a(int i17) {
        this.f363755d = i17;
        this.f363756e = c01.id.c();
        this.f363757f = c01.id.c();
        this.f363758g = c01.id.c();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: dispatch */
    public int mo9409x10f9447a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, com.p314xaae8f345.mm.p971x6de15a2e.l0 l0Var) {
        this.f363757f = c01.id.c();
        return super.mo9409x10f9447a(sVar, v0Var, l0Var);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f363758g = c01.id.c();
        f363754h.put(java.lang.Integer.valueOf(mo808xfb85f7b0()), new hm3.b(mo808xfb85f7b0(), this.f363756e, this.f363757f, this.f363758g));
    }

    public /* synthetic */ a(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
