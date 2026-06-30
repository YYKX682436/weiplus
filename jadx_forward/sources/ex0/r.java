package ex0;

/* loaded from: classes5.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 f338700a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f338701b;

    /* renamed from: c, reason: collision with root package name */
    public final ug.m f338702c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f338703d;

    /* renamed from: e, reason: collision with root package name */
    public ax0.b f338704e;

    public r(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        this.f338700a = segment;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = segment.f130065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
        this.f338701b = c3971x241f78;
        ug.m C = segment.C();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "getSegmentType(...)");
        this.f338702c = C;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = segment.D();
        if (D != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713.o(segment, D);
        }
        this.f338703d = segment.x();
        this.f338704e = ax0.b.f96497d;
    }

    /* renamed from: equals */
    public boolean m128273xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex0.r)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338700a, ((ex0.r) obj).f338700a);
    }

    public void g() {
    }

    public void h() {
    }

    /* renamed from: hashCode */
    public int m128274x8cdac1b() {
        return this.f338700a.hashCode();
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a w17 = this.f338700a.w();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w17, "getDuration(...)");
        return w17;
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a j() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a z17 = this.f338700a.z();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "getPresentationDuration(...)");
        return z17;
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a A = this.f338700a.A();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A, "getPresentationStartTime(...)");
        return A;
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 l() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = this.f338700a.B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
        return B;
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = this.f338700a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
        if (c4181x2248e1a3 != null) {
            return c4181x2248e1a3.x1();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "time"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            ug.m r0 = r6.f338702c
            int r0 = r0.ordinal()
            r1 = 0
            switch(r0) {
                case 2: goto L10;
                case 3: goto L10;
                case 4: goto L10;
                case 5: goto L4d;
                case 6: goto Lf;
                case 7: goto L4d;
                case 8: goto L4d;
                case 9: goto L4d;
                case 10: goto L4d;
                case 11: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L4d
        L10:
            com.tencent.maas.moviecomposing.segments.Segment r0 = r6.f338700a
            boolean r2 = r0 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7
            if (r2 == 0) goto L19
            com.tencent.maas.moviecomposing.segments.ElementSegment r0 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7) r0
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L4d
            com.tencent.maas.model.time.MJTime r2 = r0.A()
            com.tencent.maas.model.time.MJTime r2 = r7.sub(r2)
            com.tencent.maas.model.time.MJTime r3 = r0.f130057c
            int r2 = r2.m33972x38a73ce5(r3)
            r4 = 1
            if (r2 < 0) goto L49
            com.tencent.maas.model.time.MJTimeRange r2 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16110x95b7fc88
            com.tencent.maas.moviecomposing.Timeline r5 = r0.D()
            if (r5 == 0) goto L39
            com.tencent.maas.model.time.MJTimeRange r2 = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.V(r0, r5)
        L39:
            com.tencent.maas.model.time.MJTime r0 = r2.m34007xde00a612()
            com.tencent.maas.model.time.MJTime r7 = r0.sub(r7)
            int r7 = r7.m33972x38a73ce5(r3)
            if (r7 < 0) goto L49
            r7 = r4
            goto L4a
        L49:
            r7 = r1
        L4a:
            if (r7 != r4) goto L4d
            r1 = r4
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.r.n(com.tencent.maas.model.time.MJTime):boolean");
    }

    public boolean o() {
        return ou0.b0.a(this.f338700a);
    }

    public boolean p() {
        switch (this.f338702c.ordinal()) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return true;
            case 6:
            default:
                return false;
        }
    }

    public void q(cx0.b mutationEntry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mutationEntry, "mutationEntry");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = this.f338700a;
        c4190xd8dd3713.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4190xd8dd3713.D();
        if (D != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713.o(c4190xd8dd3713, D);
        }
    }

    /* renamed from: toString */
    public java.lang.String m128275x9616526c() {
        return "<SegmentViewModel " + this.f338700a + ' ' + this.f338704e.name() + '>';
    }
}
