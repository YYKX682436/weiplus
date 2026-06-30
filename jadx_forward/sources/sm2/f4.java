package sm2;

/* loaded from: classes3.dex */
public final class f4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f490987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f490988e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(boolean z17, km2.q qVar) {
        super(1);
        this.f490987d = z17;
        this.f490988e = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean D0;
        km2.q micUser = (km2.q) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUser, "micUser");
        boolean z17 = this.f490987d;
        km2.q qVar = this.f490988e;
        if (z17) {
            D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(micUser.f390708f, qVar.f390708f);
        } else {
            D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(micUser.f390703a, qVar.f390703a);
        }
        return java.lang.Boolean.valueOf(D0);
    }
}
