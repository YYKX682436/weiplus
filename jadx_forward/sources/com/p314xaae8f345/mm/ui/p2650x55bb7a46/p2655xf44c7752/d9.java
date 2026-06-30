package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class d9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f282403d;

    /* renamed from: e, reason: collision with root package name */
    public int f282404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja f282406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta f282407h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f282405f = f9Var;
        this.f282406g = jaVar;
        this.f282407h = taVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d9(this.f282405f, this.f282406g, this.f282407h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.widget.ImageView imageView;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f282404e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282407h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282405f;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.t(f9Var);
            boolean Zi = ((fo.e) ((le5.e) i95.n0.c(le5.e.class))).Zi(f9Var.G, null);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f282406g;
            if (Zi) {
                jaVar.x(taVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mdr));
                return f0Var;
            }
            if (tg3.s1.a(f9Var)) {
                jaVar.x(taVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572427n85));
                return f0Var;
            }
            jaVar.u(taVar);
            if (f9Var.M2()) {
                ot0.m1 r17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1.r(f9Var);
                if (r17 == null) {
                    return f0Var;
                }
                java.lang.String b17 = tv.a.b(r17.f454876h);
                n11.a b18 = n11.a.b();
                java.lang.String str = r17.f454876h;
                taVar.d();
                android.widget.ImageView imageView2 = taVar.f282969n;
                o11.f fVar = new o11.f();
                fVar.f423615f = b17;
                fVar.f423611b = true;
                b18.h(str, imageView2, fVar.a());
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.eb ebVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.eb.f282435a;
                java.lang.String c17 = r17.c(f9Var.z0());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getPlayKey(...)");
                r45.kq4 b19 = ebVar.b(c17);
                if (b19.f460436e == 1) {
                    jaVar.x(taVar, b19.f460437f);
                } else {
                    jaVar.u(taVar);
                }
                return f0Var;
            }
            taVar.d();
            android.widget.ImageView imageView3 = taVar.f282969n;
            int width = imageView3.getWidth();
            int height = imageView3.getHeight();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c9 c9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c9(this.f282407h, this.f282405f, width, height, null);
            this.f282403d = imageView3;
            this.f282404e = 1;
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p0Var, c9Var, this);
            if (g17 == aVar) {
                return aVar;
            }
            imageView = imageView3;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            imageView = (android.widget.ImageView) this.f282403d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        imageView.setImageBitmap(bitmap);
        taVar.d();
        taVar.f282971p.mo69325x53bf7294(bitmap);
        return f0Var;
    }
}
