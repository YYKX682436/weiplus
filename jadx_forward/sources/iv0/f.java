package iv0;

/* loaded from: classes5.dex */
public final class f extends tv0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f376598a = new android.graphics.Rect();

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae f376599b = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f), new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f));

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iv0.w f376600c;

    public f(iv0.w wVar) {
        this.f376600c = wVar;
    }

    @Override // bv0.a
    public void a(float f17, float f18) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 k76;
        java.lang.String str;
        android.graphics.PointF pointF;
        if (d()) {
            iv0.w wVar = this.f376600c;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db k77 = wVar.n7().k7();
            if (k77 == null || (k76 = iv0.w.k7(wVar)) == null) {
                return;
            }
            android.graphics.PointF m34134xb175183b = k77.m34134xb175183b(k76.m0());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34134xb175183b, "calcPoint(...)");
            jz5.g gVar = wVar.f376634y;
            float scaleX = (-f17) / ((android.widget.FrameLayout) ((jz5.n) gVar).mo141623x754a37bb()).getScaleX();
            float scaleY = (-f18) / ((android.widget.FrameLayout) ((jz5.n) gVar).mo141623x754a37bb()).getScaleY();
            iv0.w.l7(wVar).getHitRect(this.f376598a);
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae = this.f376599b;
            c3972x4b2f2ae.m32427xfb854877().set(r7.width(), r7.height());
            yw0.g gVar2 = wVar.f376635z;
            if (gVar2 != null) {
                android.graphics.PointF l07 = k76.l0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l07, "getLayerNormalizedPosition(...)");
                float f19 = c3972x4b2f2ae.m32427xfb854877().f129332x * 0.5f;
                float f27 = c3972x4b2f2ae.m32427xfb854877().f129333y * 0.5f;
                float f28 = l07.x * c3972x4b2f2ae.m32427xfb854877().f129332x;
                float f29 = c3972x4b2f2ae.m32427xfb854877().f129333y * l07.y;
                float a17 = ou0.c0.a(f28, f19, scaleX, 30.0f, gVar2.f548085m, new yw0.e(gVar2));
                str = "getLayerNormalizedPosition(...)";
                float a18 = ou0.c0.a(f29, f27, scaleY, 30.0f, gVar2.f548086n, new yw0.f(gVar2));
                pointF = gVar2.f548084l;
                pointF.set(m34134xb175183b.x + a17, m34134xb175183b.y + a18);
                ((yw0.l) gVar2.f548120a).a();
            } else {
                str = "getLayerNormalizedPosition(...)";
                pointF = new android.graphics.PointF();
            }
            android.graphics.PointF m34135xeeb76d6a = k77.m34135xeeb76d6a(pointF);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34135xeeb76d6a, "calcRenderCoord(...)");
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = k76.D();
            if (D != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.Z(k76, m34135xeeb76d6a, D);
            }
            java.util.Objects.toString(k76.m0());
            java.util.Objects.toString(k76.l0());
            wVar.n7().c7();
            yw0.g gVar3 = wVar.f376635z;
            if (gVar3 != null) {
                android.graphics.PointF l08 = k76.l0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l08, str);
                gVar3.e(l08);
            }
            wVar.f376625p = true;
        }
    }

    @Override // bv0.a
    public void b() {
        if (d()) {
            iv0.w wVar = this.f376600c;
            yw0.g gVar = wVar.f376635z;
            if (gVar != null) {
                gVar.f548088p = yw0.c.f548069e;
                ((yw0.l) gVar.f548120a).a();
            }
            yw0.g gVar2 = wVar.f376635z;
            if (gVar2 != null) {
                gVar2.f548087o.d();
                gVar2.f548086n.d();
                gVar2.f548085m.d();
                ((yw0.l) gVar2.f548120a).a();
            }
        }
    }

    @Override // bv0.a
    public void c(float f17, float f18, boolean z17) {
        iv0.w wVar;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 k76;
        float f19;
        if (d() && (k76 = iv0.w.k7((wVar = this.f376600c))) != null) {
            float f27 = k76.o0().x;
            yw0.g gVar = wVar.f376635z;
            if (gVar != null) {
                float f28 = k76.o0().x * f17;
                ((yw0.l) gVar.f548120a).a();
                f19 = ou0.c0.a(f28, 1.0f, f17, 0.1f, gVar.f548087o, new yw0.d(gVar));
            } else {
                f19 = 1.0f;
            }
            float f29 = f27 * f19;
            k76.t0(new android.graphics.PointF(f29, f29));
            wVar.n7().c7();
            yw0.g gVar2 = wVar.f376635z;
            if (gVar2 != null) {
                android.graphics.PointF o07 = k76.o0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o07, "getLayerScale(...)");
                gVar2.f(o07);
            }
            wVar.f376625p = true;
        }
    }

    public final boolean d() {
        iv0.w wVar = this.f376600c;
        return wVar.n7().m7() && wVar.X6();
    }

    @Override // bv0.a
    /* renamed from: onDown */
    public boolean mo9046xc3989f21(float f17, float f18) {
        yw0.g gVar;
        boolean d17 = d();
        if (d17 && (gVar = this.f376600c.f376635z) != null) {
            gVar.f548088p = yw0.c.f548068d;
            ((yw0.l) gVar.f548120a).a();
        }
        return d17;
    }
}
