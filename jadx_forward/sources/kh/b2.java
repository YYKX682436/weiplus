package kh;

/* loaded from: classes12.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.d2 f389291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f389293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(kh.d2 d2Var, java.lang.String str, long j17) {
        super(0);
        this.f389291d = d2Var;
        this.f389292e = str;
        this.f389293f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kh.m1 m1Var = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4625xbe665255.f19866x233c02ec;
        kh.d2 d2Var = this.f389291d;
        java.util.Map<java.lang.String, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af> m40762x2b761f3a = d2Var.b().m40762x2b761f3a();
        m1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m40762x2b761f3a, "<this>");
        java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(m40762x2b761f3a);
        java.lang.String str = this.f389292e;
        java.lang.Object obj = c17.get(str);
        if (obj == null) {
            obj = new com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af(0, 0L, 3, null);
            c17.put(str, obj);
        }
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af c4626xf3e017af = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4626xf3e017af) obj;
        c4626xf3e017af.f134081d++;
        c4626xf3e017af.f134082e += this.f389293f;
        if (d2Var.b().getAccBeginTime() <= 0) {
            d2Var.b().m40767xc5e2f917(java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f384359a;
    }
}
