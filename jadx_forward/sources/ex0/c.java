package ex0;

/* loaded from: classes5.dex */
public abstract class c extends ex0.f {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f338652p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 clipSegment) {
        super(clipSegment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipSegment, "clipSegment");
        this.f338652p = clipSegment;
    }

    public final long A() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f338652p;
        c4181x2248e1a3.getClass();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a g17 = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.g1(c4181x2248e1a3, D) : c4128x879fba0a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getCreationTime(...)");
        if (!g17.m33983x7b953cf2()) {
            c4181x2248e1a3.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4181x2248e1a3.D();
            if (D2 != null) {
                c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.M0(c4181x2248e1a3, D2);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4128x879fba0a, "getModificationTime(...)");
            g17 = c4128x879fba0a;
        }
        return !g17.m33983x7b953cf2() ? java.lang.System.currentTimeMillis() : (long) g17.m33987xd22e7c2d();
    }

    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34009x8082fb99 = l().m34009x8082fb99();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f338652p;
        c4181x2248e1a3.getClass();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a Q = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.Q(c4181x2248e1a3, D) : c4128x879fba0a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q, "getTransInDuration(...)");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub = m34009x8082fb99.sub(Q);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = l().m34007xde00a612();
        c4181x2248e1a3.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4181x2248e1a3.D();
        if (D2 != null) {
            c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.b0(c4181x2248e1a3, D2);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4128x879fba0a, "getTransOutDuration(...)");
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33999xbdf18ae3 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.m33999xbdf18ae3(sub, m34007xde00a612.add(c4128x879fba0a));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33999xbdf18ae3, "fromStartEnd(...)");
        return m33999xbdf18ae3;
    }

    public final float C() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f338652p;
        c4181x2248e1a3.getClass();
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
        if (D != null) {
            valueOf = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.A0(c4181x2248e1a3, D);
        }
        return valueOf.floatValue() / 2.0f;
    }

    public final boolean D() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f338652p;
        c4181x2248e1a3.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
        if (D != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.d1(c4181x2248e1a3, D);
        }
        return bool.booleanValue();
    }

    public final void E(float f17) {
        float f18 = f17 * 2.0f;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f338652p;
        c4181x2248e1a3.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
        if (D != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.m1(c4181x2248e1a3, f18, D);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(double r8) {
        /*
            r7 = this;
            com.tencent.maas.moviecomposing.segments.ClipSegment r0 = r7.f338652p
            com.tencent.maas.moviecomposing.Timeline r1 = r0.D()
            r2 = 0
            if (r1 == 0) goto L77
            com.tencent.maas.model.time.MJTime r1 = r1.f129949c
            if (r1 != 0) goto Le
            goto L77
        Le:
            ug.m r3 = r0.C()
            ug.m r4 = ug.m.ImageClip
            if (r3 != r4) goto L28
            com.tencent.maas.model.time.MJTimeRange r3 = r7.B()
            com.tencent.maas.model.time.MJTime r3 = r3.m34005x51e8b0a()
            double r3 = r3.m33988x124aa384()
            double r3 = r3 / r8
            com.tencent.maas.model.time.MJTime r3 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(r3)
            goto L39
        L28:
            com.tencent.maas.model.time.MJTimeRange r3 = r0.x1()
            com.tencent.maas.model.time.MJTime r3 = r3.m34005x51e8b0a()
            double r3 = r3.m33988x124aa384()
            double r3 = r3 / r8
            com.tencent.maas.model.time.MJTime r3 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(r3)
        L39:
            r0.getClass()
            com.tencent.maas.model.time.MJTime r4 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5
            com.tencent.maas.moviecomposing.Timeline r5 = r0.D()
            if (r5 == 0) goto L49
            com.tencent.maas.model.time.MJTime r5 = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.Q(r0, r5)
            goto L4a
        L49:
            r5 = r4
        L4a:
            java.lang.String r6 = "getTransInDuration(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r6)
            com.tencent.maas.model.time.MJTime r3 = r3.sub(r5)
            r0.getClass()
            com.tencent.maas.moviecomposing.Timeline r5 = r0.D()
            if (r5 == 0) goto L60
            com.tencent.maas.model.time.MJTime r4 = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.b0(r0, r5)
        L60:
            java.lang.String r5 = "getTransOutDuration(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            com.tencent.maas.model.time.MJTime r3 = r3.sub(r4)
            boolean r4 = r3.m33971xf922bec1(r1)
            if (r4 != 0) goto L75
            boolean r1 = r3.m33975x22a7969a(r1)
            if (r1 == 0) goto L77
        L75:
            r1 = 1
            goto L78
        L77:
            r1 = r2
        L78:
            if (r1 != 0) goto L7b
            return r2
        L7b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            com.tencent.maas.moviecomposing.Timeline r2 = r0.D()
            if (r2 == 0) goto L87
            java.lang.Boolean r1 = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.D0(r0, r8, r2)
        L87:
            boolean r8 = r1.booleanValue()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.c.F(double):boolean");
    }
}
