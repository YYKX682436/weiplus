package xc2;

/* loaded from: classes4.dex */
public final class s1 implements ya2.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai f534827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f534829c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f534830d;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai aiVar, android.content.Context context, xc2.p0 p0Var, in5.s0 s0Var) {
        this.f534827a = aiVar;
        this.f534828b = context;
        this.f534829c = p0Var;
        this.f534830d = s0Var;
    }

    public int a() {
        int i17;
        android.content.Context context = this.f534828b;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        return (int) (i17 * kx2.a.f394811a.a(context));
    }

    public void b(yz5.a listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        xc2.r1 r1Var = new xc2.r1(listener);
        gx2.q qVar = this.f534827a.f215310d;
        if (qVar == null) {
            return;
        }
        qVar.m132481xfadc8465(r1Var);
    }
}
