package gx0;

/* loaded from: classes5.dex */
public final class kc extends gx0.hf {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f358163i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f358164m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f358165n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358163i = jz5.h.b(new gx0.jc(this));
        this.f358164m = jz5.h.b(new gx0.hc(this));
        this.f358165n = jz5.h.b(new gx0.fc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object i7(gx0.kc kcVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        kcVar.getClass();
        if ((c4190xd8dd3713 instanceof ug.d) && !((ug.d) c4190xd8dd3713).l() && c4190xd8dd3713.x()) {
            ((ug.d) c4190xd8dd3713).a();
        }
        java.lang.Object d76 = gx0.bf.d7(kcVar.k7(), null, c4128x879fba0a, false, interfaceC29045xdcb5ca57, 5, null);
        return d76 == pz5.a.f440719d ? d76 : jz5.f0.f384359a;
    }

    @Override // gx0.hf
    public void U6(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 b76 = l7().b7(mjID);
        if (b76 == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.cc(this, b76, aVar, null), 3, null);
    }

    @Override // gx0.hf
    public void W6(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 timeRange, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeRange, "timeRange");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 b76 = l7().b7(mjID);
        if (b76 == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.dc(this, b76, timeRange, aVar, mjID, null), 3, null);
    }

    @Override // gx0.hf
    public void X6(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a previewTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewTime, "previewTime");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb l76 = l7().l7();
        if (l76 == null) {
            return;
        }
        pf5.e.m158344xbe96bc24(this, null, null, new gx0.ec(this, l76, previewTime, null), 3, null);
    }

    @Override // gx0.hf
    public void a7(zw0.d dVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a previewTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewTime, "previewTime");
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.gc(dVar, this, previewTime, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r10 == pz5.a.f440719d) goto L13;
     */
    @Override // gx0.hf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c7(boolean r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r9 = this;
            gx0.kh r0 = r9.l7()
            com.tencent.maas.moviecomposing.segments.MovieTitleSegment r0 = r0.l7()
            jz5.f0 r1 = jz5.f0.f384359a
            if (r0 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r9.Z6(r0)
            if (r0 == 0) goto L2f
            if (r10 != 0) goto L16
            goto L2f
        L16:
            gx0.bf r2 = r9.k7()
            r3 = 0
            com.tencent.maas.model.time.MJTime r4 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            java.lang.String r10 = "InvalidTime"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r10)
            r5 = 0
            r7 = 5
            r8 = 0
            r6 = r11
            java.lang.Object r10 = gx0.bf.d7(r2, r3, r4, r5, r6, r7, r8)
            pz5.a r11 = pz5.a.f440719d
            if (r10 != r11) goto L2f
            goto L30
        L2f:
            r10 = r1
        L30:
            pz5.a r11 = pz5.a.f440719d
            if (r10 != r11) goto L35
            return r10
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.kc.c7(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // gx0.hf
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a e7() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i76 = k7().i7();
        return !i76.m33983x7b953cf2() ? super.e7() : i76;
    }

    @Override // gx0.hf
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f7() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f76 = super.f7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a l76 = k7().l7();
        if (!l76.m33983x7b953cf2()) {
            return f76;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub = l76.sub(e7());
        return sub.m33986x9f3f7b48(f76) ? sub : f76;
    }

    @Override // gx0.hf
    public boolean g7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        ex0.a0 a0Var = l7().f358175r;
        if (a0Var == null) {
            return false;
        }
        boolean G = a0Var.G(mjID, true, ax0.e.f96508d);
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.ic(this, G, z17, z18, null), 3, null);
        return G;
    }

    public final gx0.bf k7() {
        return (gx0.bf) ((jz5.n) this.f358164m).mo141623x754a37bb();
    }

    public final gx0.kh l7() {
        return (gx0.kh) ((jz5.n) this.f358163i).mo141623x754a37bb();
    }
}
