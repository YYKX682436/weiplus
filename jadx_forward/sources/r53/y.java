package r53;

/* loaded from: classes8.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f474250e = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_MONTH) + "image/";

    /* renamed from: f, reason: collision with root package name */
    public static r53.y f474251f;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f474253b;

    /* renamed from: c, reason: collision with root package name */
    public final kk.j f474254c = new jt0.i(6, r53.y.class);

    /* renamed from: d, reason: collision with root package name */
    public final kk.j f474255d = new jt0.i(15, r53.y.class);

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f474252a = new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#EFEFF4"));

    public y() {
        try {
            android.graphics.Bitmap c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
            this.f474253b = c17;
            if (c17 != null && !c17.isRecycled()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(this.f474253b, false, r0.getWidth() * 0.5f);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameImageUtil", e17.getMessage());
        }
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        zo3.p.Ri().add(new r53.o(this));
    }

    public static r53.y a() {
        if (f474251f == null) {
            synchronized (r53.y.class) {
                if (f474251f == null) {
                    f474251f = new r53.y();
                }
            }
        }
        return f474251f;
    }

    public void b(android.widget.ImageView imageView, java.lang.String str, float f17) {
        android.graphics.Bitmap bitmap;
        if (imageView == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        kk.j jVar = this.f474254c;
        if (((lt0.f) jVar).k(str) && (bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).i(str)) != null && !bitmap.isRecycled()) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(str, 1, f17);
        if (Di != null && !Di.isRecycled()) {
            imageView.setImageBitmap(Di);
            ((jt0.i) jVar).put(str, Di);
        } else {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(imageView);
            ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
            zo3.p.Ri().add(new r53.u(this, str, f17, weakReference));
        }
    }

    public android.graphics.Bitmap c(android.widget.ImageView imageView, java.lang.String str) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str);
        if (a17 != null && !a17.isRecycled()) {
            if (imageView != null) {
                imageView.setImageBitmap(a17);
            }
            return a17;
        }
        android.graphics.Bitmap bitmap = this.f474253b;
        if (bitmap == null || bitmap.isRecycled()) {
            try {
                this.f474253b = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
            } catch (java.lang.Exception unused) {
            }
        }
        android.graphics.Bitmap bitmap2 = this.f474253b;
        if (bitmap2 != null && !bitmap2.isRecycled() && imageView != null) {
            imageView.setImageBitmap(this.f474253b);
        }
        return this.f474253b;
    }

    public final void d(android.widget.ImageView imageView, java.lang.String str, r53.w wVar, r53.x xVar) {
        o11.f fVar = new o11.f();
        wVar.getClass();
        fVar.f423610a = true;
        java.lang.String str2 = f474250e;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
        if (!r6Var.m()) {
            if (!r6Var.s().m()) {
                com.p314xaae8f345.mm.vfs.r6 s17 = r6Var.s();
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(s17.o() + java.lang.System.currentTimeMillis());
                if (r6Var2.J()) {
                    r6Var2.L(s17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameImageUtil", "mkdir error, %s", s17.o());
                }
            }
            if (!r6Var.J() || !r6Var.y()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameImageUtil", "mkdir error. %s", str2);
            }
        }
        java.lang.String str3 = str2 + kk.k.g(str.getBytes());
        fVar.f423611b = wVar.f474244b;
        fVar.f423615f = str3;
        fVar.f423629t = wVar.f474245c;
        fVar.f423628s = false;
        if (imageView != null && wVar.f474247e) {
            int i17 = wVar.f474248f;
            if (i17 == 0) {
                imageView.setImageDrawable(this.f474252a);
            } else {
                imageView.setImageResource(i17);
            }
        }
        n11.a.b().i(str, null, fVar.a(), new r53.q(this, xVar, wVar, imageView));
    }

    public void e(android.widget.ImageView imageView, java.lang.String str, r53.w wVar, r53.x xVar) {
        android.graphics.Bitmap bitmap;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (wVar == null) {
            wVar = new r53.v().a();
        }
        boolean z17 = false;
        if (wVar.f474243a) {
            kk.j jVar = this.f474255d;
            if (((lt0.f) jVar).k(str) && (bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).i(str)) != null && !bitmap.isRecycled()) {
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
                if (xVar != null) {
                    xVar.a(imageView, bitmap);
                }
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        d(imageView, str, wVar, xVar);
    }

    public void f(android.widget.ImageView imageView, java.lang.String str, int i17, int i18, int i19) {
        r53.s sVar = new r53.s(this, imageView, i18, i17, i19);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) this.f474255d).i(str);
        if (bitmap == null || bitmap.isRecycled()) {
            d(null, str, new r53.v().a(), new r53.t(this, sVar, i17, i18, 0, str));
        } else {
            sVar.a(null, bitmap);
        }
    }
}
