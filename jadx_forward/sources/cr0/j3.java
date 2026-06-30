package cr0;

/* loaded from: classes12.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.s0 f303190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f303191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(q01.s0 s0Var, long j17) {
        super(0);
        this.f303190d = s0Var;
        this.f303191e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cr0.b bVar = com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795.f29664x233c02ec;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> m46653xf6be947a = cr0.k3.f303201c.m46653xf6be947a();
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m46653xf6be947a, "<this>");
        java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(m46653xf6be947a);
        q01.s0 s0Var = this.f303190d;
        java.lang.String valueOf = java.lang.String.valueOf(s0Var.f440865d);
        java.lang.Object obj = c17.get(valueOf);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            c17.put(valueOf, obj);
        }
        java.util.Map c18 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c((java.util.Map) obj);
        jz5.g gVar = s0Var.f440866e;
        java.lang.String valueOf2 = java.lang.String.valueOf((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
        java.lang.Object obj2 = c18.get(java.lang.String.valueOf((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb()));
        if (obj2 == null) {
            obj2 = 0L;
        }
        c18.put(valueOf2, java.lang.Long.valueOf(((java.lang.Number) obj2).longValue() + this.f303191e));
        return jz5.f0.f384359a;
    }
}
