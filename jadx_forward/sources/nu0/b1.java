package nu0;

/* loaded from: classes5.dex */
public final class b1 extends du0.o {

    /* renamed from: y, reason: collision with root package name */
    public boolean f421403y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f421404z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f421404z = jz5.h.b(new nu0.x0(this));
    }

    @Override // dv0.a
    public void F5(au0.b boxItem) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        if (this.f421403y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageHandleBoxUIC", "[onEnd] updateCurrentSnapshot");
            nu0.q0 q76 = q7();
            int a76 = q76.a7();
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef82 = q76.f421608r;
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e = (!(a76 >= 0 && a76 < ((c4063x855a1ef82 == null || (m33150x5a8a256c2 = c4063x855a1ef82.m33150x5a8a256c()) == null) ? 0 : m33150x5a8a256c2.length)) || (c4063x855a1ef8 = q76.f421608r) == null || (m33150x5a8a256c = c4063x855a1ef8.m33150x5a8a256c()) == null) ? null : m33150x5a8a256c[a76];
            if (c4060x7aac656e != null) {
                q76.g7(a76, c4060x7aac656e, new nu0.p0(a76, q76));
            }
            this.f421403y = false;
        }
    }

    @Override // dv0.a
    public boolean H4(au0.b selectedBoxItem, com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner corner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedBoxItem, "selectedBoxItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(corner, "corner");
        cv0.m a17 = cv0.h.a(selectedBoxItem.b(), corner);
        if (a17 == cv0.m.f304076e) {
            return false;
        }
        W6().H7(selectedBoxItem.c(), selectedBoxItem.b(), a17, zw0.b.f558085f);
        return true;
    }

    @Override // dv0.a
    public com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner M5(android.graphics.PointF location, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        nu0.q0 q76 = q7();
        q76.getClass();
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = q76.f421608r;
        com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner f17 = c4063x855a1ef8 != null ? c4063x855a1ef8.f(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(location.x, location.y), rect) : null;
        return f17 == null ? com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerInvalid : f17;
    }

    @Override // dv0.a
    public boolean P4(au0.b boxItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        return true;
    }

    @Override // du0.o
    public cv0.c V6() {
        return new lu0.b(new cv0.d(), this);
    }

    @Override // dv0.a
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 W0(android.graphics.PointF pointF) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointF, "pointF");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(pointF.x, pointF.y);
        nu0.q0 q76 = q7();
        q76.getClass();
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = q76.f421608r;
        java.lang.String h17 = c4063x855a1ef8 != null ? c4063x855a1ef8.h(c3974x289f3e) : null;
        if (h17 == null || h17.length() == 0) {
            return null;
        }
        return com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78.of(h17);
    }

    @Override // dv0.a
    public void a4(au0.b boxItem, float f17, float f18, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae renderViewRect2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderViewRect2, "renderViewRect2");
        java.lang.Object obj = boxItem.f95586a;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33050x3eeeade4 = ((com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233) obj).m33050x3eeeade4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33050x3eeeade4, "getLayerPosition(...)");
        ((com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233) obj).a(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(m33050x3eeeade4.f129332x + f17, m33050x3eeeade4.f129333y - f18));
        nu0.q0.Y6(q7(), false, null, 2, null);
        this.f421403y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // dv0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d5(boolean r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nu0.y0
            if (r0 == 0) goto L13
            r0 = r6
            nu0.y0 r0 = (nu0.y0) r0
            int r1 = r0.f421680f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f421680f = r1
            goto L18
        L13:
            nu0.y0 r0 = new nu0.y0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f421678d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f421680f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r0.f421680f = r3
            java.lang.Object r5 = r4.r7(r5, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b1.d5(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // du0.o
    public hw0.n g7() {
        return (hw0.n) T6(nu0.p.class);
    }

    @Override // du0.o
    public ow0.a0 h7() {
        return (ow0.a0) T6(nu0.s.class);
    }

    @Override // du0.o
    public gx0.w i7() {
        return (gx0.w) T6(nu0.u0.class);
    }

    @Override // du0.o
    public yt0.c k7() {
        return (yt0.c) T6(nu0.b4.class);
    }

    @Override // dv0.a
    public boolean l0(android.graphics.PointF location, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        nu0.q0 q76 = q7();
        q76.getClass();
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = q76.f421608r;
        if (c4063x855a1ef8 != null) {
            return c4063x855a1ef8.g(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(location.x, location.y), rect);
        }
        return false;
    }

    @Override // du0.o
    public void m7(au0.b boxItem, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        if (boxItem.mo9048xdac2174d()) {
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new nu0.z0(boxItem, this, null), 3, null);
        }
    }

    @Override // dv0.a
    public au0.b o6(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 b76 = q7().b7(mjID.m32425x6ac9171());
        if (b76 == null) {
            return null;
        }
        return new lu0.a(b76);
    }

    @Override // dv0.a
    public boolean q() {
        nu0.q0 q76 = q7();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isHandleBoxEnabled] ");
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = q76.f421608r;
        sb6.append(c4063x855a1ef8 != null ? java.lang.Boolean.valueOf(c4063x855a1ef8.m33151x88661088()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageControlUIC", sb6.toString());
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef82 = q76.f421608r;
        if (c4063x855a1ef82 != null) {
            return c4063x855a1ef82.m33151x88661088();
        }
        return false;
    }

    public final nu0.q0 q7() {
        return (nu0.q0) ((jz5.n) this.f421404z).mo141623x754a37bb();
    }

    @Override // dv0.a
    public void r2(au0.b boxItem, float f17, float f18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        java.lang.String m32425x6ac9171 = boxItem.c().m32425x6ac9171();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m32425x6ac9171, "value(...)");
        float m33052xeab6a66f = ((com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233) boxItem.f95586a).m33052xeab6a66f();
        yw0.k Y6 = Y6();
        float a17 = ou0.c0.a(m33052xeab6a66f * f17, 1.0f, f17, 0.1f, Y6.f548098g, new yw0.j(Y6));
        if (!(m33052xeab6a66f == a17)) {
            float f19 = a17 * m33052xeab6a66f;
            if (f19 < 0.3f) {
                f19 = 0.3f;
            }
            if (f19 > 5.0f) {
                f19 = 5.0f;
            }
            nu0.q0 q76 = q7();
            q76.getClass();
            com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 b76 = q76.b7(m32425x6ac9171);
            if (b76 != null) {
                b76.c(f19);
                nu0.q0.Y6(q76, false, null, 2, null);
            }
            this.f421403y = true;
        }
        float d17 = boxItem.d();
        float h17 = Y6().h(boxItem, f18);
        if (d17 == h17) {
            return;
        }
        nu0.q0 q77 = q7();
        q77.getClass();
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 b77 = q77.b7(m32425x6ac9171);
        if (b77 != null) {
            b77.b(h17);
            nu0.q0.Y6(q77, false, null, 2, null);
        }
        this.f421403y = true;
    }

    @Override // dv0.a
    public void r6(com.p314xaae8f345.p457x3304c6.p479x4179489f.x onChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onChange, "onChange");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r7(boolean r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof nu0.a1
            if (r5 == 0) goto L13
            r5 = r6
            nu0.a1 r5 = (nu0.a1) r5
            int r0 = r5.f421396g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f421396g = r0
            goto L18
        L13:
            nu0.a1 r5 = new nu0.a1
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.f421394e
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f421396g
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            java.lang.Object r5 = r5.f421393d
            nu0.b1 r5 = (nu0.b1) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r5.f421393d = r4
            r5.f421396g = r3
            yw0.k r5 = r4.Y6()
            r5.e()
            if (r2 != r0) goto L46
            return r0
        L46:
            r5 = r4
        L47:
            nu0.q0 r5 = r5.q7()
            com.tencent.maas.imagestudio.MJImageSession r6 = r5.f421608r
            if (r6 == 0) goto L52
            r6.k()
        L52:
            com.tencent.maas.imagestudio.MJImageSession r6 = r5.f421608r
            if (r6 == 0) goto L59
            r6.d()
        L59:
            java.lang.String r6 = "ImageControlUIC"
            java.lang.String r0 = "[removeBoxItem] disableHandleBox"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r0)
            r6 = 2
            r0 = 0
            r1 = 0
            nu0.q0.Y6(r5, r1, r0, r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b1.r7(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
