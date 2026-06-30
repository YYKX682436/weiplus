package ky;

/* loaded from: classes14.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky.a f394864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f394865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ky.a aVar, float f17) {
        super(1);
        this.f394864d = aVar;
        this.f394865e = f17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ky.d0 gestureState = (ky.d0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureState, "gestureState");
        boolean z17 = gestureState instanceof ky.y;
        float f17 = this.f394865e;
        ky.a aVar = this.f394864d;
        if (z17) {
            ((n0.q4) aVar.f394862b).mo148714x53d8522f(java.lang.Boolean.valueOf(((ky.y) gestureState).f394980b > ((float) i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, f17))));
        } else if (!(gestureState instanceof ky.z)) {
            if (gestureState instanceof ky.a0) {
                ky.m0 m0Var = ky.m0.f394926e;
                aVar.getClass();
                ((n0.q4) aVar.f394861a).mo148714x53d8522f(m0Var);
            } else if (gestureState instanceof ky.c0) {
                ((n0.q4) aVar.f394862b).mo148714x53d8522f(java.lang.Boolean.FALSE);
            } else if (gestureState instanceof ky.x) {
                ky.m0 m0Var2 = ((ky.x) gestureState).f394978b > ((float) i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, f17)) ? ky.m0.f394927f : ky.m0.f394925d;
                aVar.getClass();
                ((n0.q4) aVar.f394861a).mo148714x53d8522f(m0Var2);
            } else if (gestureState instanceof ky.b0) {
                ky.m0 m0Var3 = ky.m0.f394925d;
                aVar.getClass();
                ((n0.q4) aVar.f394861a).mo148714x53d8522f(m0Var3);
            }
        }
        return jz5.f0.f384359a;
    }
}
