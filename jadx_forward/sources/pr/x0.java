package pr;

/* loaded from: classes15.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.a1 f439329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f439330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f439331f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(pr.a1 a1Var, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, int i17) {
        super(0);
        this.f439329d = a1Var;
        this.f439330e = interfaceC4987x84e327cb;
        this.f439331f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pr.v0 v0Var;
        pr.u0 u0Var = (pr.u0) this.f439329d.f439223b.remove(this.f439330e.mo42933xb5885648());
        if (u0Var != null && (v0Var = this.f439329d.f439224c) != null) {
            int i17 = this.f439331f;
            pr.k0 k0Var = ((pr.h0) v0Var).f439248a;
            synchronized (k0Var.f439276p) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = u0Var.f439325a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f439263c, "onLoaderFin: " + c21053xdbf1e5f4.mo42933xb5885648() + ' ' + i17 + ", " + u0Var.f439326b);
                k0Var.f439270j.remove(c21053xdbf1e5f4.mo42933xb5885648());
                if (k0Var.f439270j.size() <= 0) {
                    k0Var.f439268h = false;
                }
                k0Var.f439273m++;
                int i18 = u0Var.f439326b;
                k0Var.f439262b.getClass();
                if ((i18 % 5 == 3) || !k0Var.f439268h) {
                    int i19 = i18 + 1;
                    if (k0Var.f439265e < i19) {
                        k0Var.f439265e = i19;
                    }
                    int i27 = k0Var.f439264d;
                    int i28 = k0Var.f439273m + i27;
                    k0Var.f439264d = i28;
                    int i29 = k0Var.f439266f;
                    if (i28 == i29 && i29 == k0Var.f439267g) {
                        k0Var.f439269i = true;
                    }
                    if (!k0Var.f439268h) {
                        k0Var.f439265e = i29;
                    }
                    java.util.Iterator it = k0Var.f439271k.iterator();
                    while (it.hasNext()) {
                        ((pr.e0) it.next()).a(k0Var.f439264d - i27);
                    }
                    k0Var.f439273m = 0;
                }
            }
        }
        pr.a1 a1Var = this.f439329d;
        a1Var.getClass();
        pm0.v.X(new pr.w0(a1Var));
        return jz5.f0.f384359a;
    }
}
