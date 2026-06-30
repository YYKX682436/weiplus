package nu0;

/* loaded from: classes5.dex */
public final class p extends hw0.n {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f421591u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f421592v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f421591u = jz5.h.b(new nu0.n(this));
        this.f421592v = jz5.h.b(new nu0.k(this));
    }

    @Override // hw0.n
    public lw0.l l7() {
        return (lw0.l) T6(nu0.o4.class);
    }

    @Override // hw0.n
    public java.lang.Object n7(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, com.p314xaae8f345.mm.vfs.r6 file, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        nu0.q0 q76 = q7();
        q76.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "file");
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z6 = q76.Z6();
        if (Z6 != null) {
            java.lang.String o17 = file.o();
            com.p314xaae8f345.mm.vfs.r6 r6Var = by0.g.f117864a;
            str = Z6.a(o17, (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(file.o()) ? com.p314xaae8f345.p457x3304c6.p479x4179489f.b.WxAM : com.p314xaae8f345.p457x3304c6.p479x4179489f.b.Platform).f129996d, 0);
        } else {
            str = null;
        }
        nu0.q0.Y6(q76, false, null, 3, null);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (str == null) {
            return f0Var;
        }
        nu0.q0.Y6(q7(), false, new nu0.j(new nu0.l(u3Var), this, str), 1, null);
        return f0Var;
    }

    @Override // hw0.n
    public void o7(kw0.a stickerData) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 b76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerData, "stickerData");
        nu0.q0 q76 = q7();
        java.lang.String str = stickerData.f394321a.f129757b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
        q76.getClass();
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z6 = q76.Z6();
        java.lang.String c17 = Z6 != null ? Z6.c(str) : null;
        nu0.q0.Y6(q76, false, null, 3, null);
        if (c17 == null || (b76 = q7().b7(c17)) == null) {
            return;
        }
        if (b76.m33060xc1a3f665()) {
            b76.f(q7().e7());
            nu0.q0.Y6(q7(), false, new nu0.j(null, this, c17), 1, null);
            r7(c17);
        } else if (b76.m33061xc818667f()) {
            du0.i0 P6 = P6();
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e Z62 = q7().Z6();
            P6.O6(Z62 != null ? Z62.m33107xed29dd2b() : null, new nu0.m(this, c17, b76));
        }
    }

    public final nu0.q0 q7() {
        return (nu0.q0) ((jz5.n) this.f421592v).mo141623x754a37bb();
    }

    public final void r7(java.lang.String str) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 of6 = com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78.of(str);
        nu0.i4 i4Var = (nu0.i4) ((jz5.n) this.f421591u).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(of6);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 ZeroTimeRange = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16110x95b7fc88;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTimeRange, "ZeroTimeRange");
        i4Var.W6(of6, ZeroTimeRange, new nu0.o(this, of6));
    }
}
