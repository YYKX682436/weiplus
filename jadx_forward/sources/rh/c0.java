package rh;

/* loaded from: classes12.dex */
public class c0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o3 f476850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f476851b;

    public c0(rh.c1 c1Var, rh.o3 o3Var) {
        this.f476851b = c1Var;
        this.f476850a = o3Var;
    }

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.l3 l3Var;
        rh.c1 c1Var = this.f476851b;
        android.content.Context d17 = c1Var.f476862k.d();
        this.f476850a.getClass();
        wh.v1 b17 = wh.x1.b(d17);
        if (b17 == null) {
            l3Var = null;
        } else {
            rh.l3 l3Var2 = new rh.l3();
            l3Var2.f476979d = rh.x2.b(java.lang.Long.valueOf(b17.f527417a));
            l3Var2.f476980e = rh.x2.b(java.lang.Long.valueOf(b17.f527418b));
            l3Var2.f476981f = rh.x2.b(java.lang.Long.valueOf(b17.f527419c));
            l3Var2.f476982g = rh.x2.b(java.lang.Long.valueOf(b17.f527420d));
            l3Var = l3Var2;
        }
        if (l3Var != null) {
            rh.w0 w0Var = c1Var.f476867p;
            w0Var.f477066a++;
            w0Var.f477067b += ((java.lang.Long) l3Var.f476979d.f477085a).longValue();
            w0Var.f477068c += ((java.lang.Long) l3Var.f476980e.f477085a).longValue();
            w0Var.f477069d += ((java.lang.Long) l3Var.f476981f.f477085a).longValue();
            w0Var.f477070e += ((java.lang.Long) l3Var.f476982g.f477085a).longValue();
        }
        return 0;
    }
}
