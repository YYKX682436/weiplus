package cr0;

/* loaded from: classes12.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.s0 f303183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f303184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(q01.s0 s0Var, long j17) {
        super(0);
        this.f303183d = s0Var;
        this.f303184e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cr0.b bVar = com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795.f29664x233c02ec;
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10872x28d91e0f c10872x28d91e0f = cr0.k3.f303201c;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f>> m46651x8894e5fa = c10872x28d91e0f.m46651x8894e5fa();
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m46651x8894e5fa, "<this>");
        java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(m46651x8894e5fa);
        q01.s0 s0Var = this.f303183d;
        java.lang.String valueOf = java.lang.String.valueOf(s0Var.f440865d);
        java.lang.Object obj = c17.get(valueOf);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            c17.put(valueOf, obj);
        }
        java.util.Map c18 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c((java.util.Map) obj);
        java.lang.String valueOf2 = java.lang.String.valueOf((java.lang.String) ((jz5.n) s0Var.f440866e).mo141623x754a37bb());
        java.lang.Object obj2 = c18.get(valueOf2);
        if (obj2 == null) {
            obj2 = new com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f(0, 0L, 3, null);
            c18.put(valueOf2, obj2);
        }
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f c10871xcc6f010f = (com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) obj2;
        c10871xcc6f010f.f150222d++;
        c10871xcc6f010f.f150223e += this.f303184e;
        if (c10872x28d91e0f.getAccBeginTime() <= 0) {
            c10872x28d91e0f.m46654xc5e2f917(java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f384359a;
    }
}
