package nu0;

/* loaded from: classes5.dex */
public final class s extends ow0.a0 {
    public final jz5.g D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.D = jz5.h.b(new nu0.r(this));
    }

    @Override // ow0.a0
    public gx0.gg A7() {
        return (gx0.gg) T6(nu0.j4.class);
    }

    @Override // ow0.a0
    public void k7(kw0.a stickerData) {
        java.lang.String b17;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 b76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerData, "stickerData");
        nu0.q0 q0Var = (nu0.q0) ((jz5.n) this.D).mo141623x754a37bb();
        java.lang.String str = stickerData.f394321a.f129757b;
        java.lang.String str2 = null;
        if (str == null) {
            q0Var.getClass();
        } else {
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z6 = q0Var.Z6();
            if (Z6 != null && (b17 = Z6.b(str)) != null && (b76 = q0Var.b7(b17)) != null) {
                q0Var.f421607q.put(b17, new mu0.a(b76));
                nu0.q0.Y6(q0Var, false, null, 3, null);
                str2 = b17;
            }
        }
        if (str2 == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 of6 = com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78.of(str2);
        gx0.hf p76 = p7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(of6);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 ZeroTimeRange = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16110x95b7fc88;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTimeRange, "ZeroTimeRange");
        p76.W6(of6, ZeroTimeRange, new nu0.q(this, of6));
    }

    @Override // ow0.a0
    public java.util.List l7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new sw0.n(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mbz), sw0.f.f494964f, new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10947x71306f3b(m158354x19263085(), null, 0, 6, null)));
        return arrayList;
    }

    @Override // ow0.a0
    public uw0.o t7() {
        return (uw0.o) T6(nu0.f.class);
    }

    @Override // ow0.a0
    public uw0.t0 u7() {
        return (uw0.t0) T6(nu0.g.class);
    }

    @Override // ow0.a0
    public jv0.g w7() {
        return (jv0.g) T6(nu0.r0.class);
    }

    @Override // ow0.a0
    public hw0.z x7() {
        return (hw0.z) T6(nu0.w0.class);
    }

    @Override // ow0.a0
    public du0.o y7() {
        return (du0.o) T6(nu0.b1.class);
    }

    @Override // ow0.a0
    public gx0.hf z7() {
        return (gx0.hf) T6(nu0.i4.class);
    }
}
