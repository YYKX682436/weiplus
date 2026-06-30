package kh;

/* loaded from: classes12.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.d2 f389304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f389306f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(kh.d2 d2Var, java.lang.String str, long j17) {
        super(0);
        this.f389304d = d2Var;
        this.f389305e = str;
        this.f389306f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kh.m1 m1Var = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.C4625xbe665255.f19866x233c02ec;
        java.util.Map<java.lang.String, java.lang.Long> m40764x828240ba = this.f389304d.b().m40764x828240ba();
        m1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m40764x828240ba, "<this>");
        java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(m40764x828240ba);
        java.lang.String str = this.f389305e;
        java.lang.Object obj = c17.get(str);
        if (obj == null) {
            obj = 0L;
        }
        c17.put(str, java.lang.Long.valueOf(((java.lang.Number) obj).longValue() + this.f389306f));
        return jz5.f0.f384359a;
    }
}
