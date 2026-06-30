package n11;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static n11.a f415580d;

    /* renamed from: a, reason: collision with root package name */
    public n11.b f415581a;

    /* renamed from: b, reason: collision with root package name */
    public o11.d f415582b;

    /* renamed from: c, reason: collision with root package name */
    public final p11.k f415583c = new com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.i();

    public a(android.content.Context context) {
        int i17 = o11.d.f423595o;
        f(new o11.c(context).a());
    }

    public static synchronized n11.a b() {
        n11.a aVar;
        synchronized (n11.a.class) {
            if (f415580d == null) {
                f415580d = new n11.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
            aVar = f415580d;
        }
        return aVar;
    }

    public void a(java.lang.String str, android.widget.ImageView imageView) {
        this.f415581a.b(new n11.c(imageView, str));
    }

    public void c() {
        o11.d dVar;
        n11.b bVar = this.f415581a;
        if (bVar == null || (dVar = bVar.f415584a) == null) {
            return;
        }
        dVar.f423601f.mo48128x5a5b64d();
        ((com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.a) dVar.f423602g).getClass();
        t11.b.a();
    }

    public void d(java.lang.String str, o11.g gVar, p11.d dVar) {
        this.f415581a.f415585b.execute(new s11.a(str, gVar, this.f415581a, dVar));
    }

    public android.graphics.Bitmap e(java.lang.String str) {
        o11.d dVar;
        n11.b bVar = this.f415581a;
        if (bVar == null || (dVar = bVar.f415584a) == null) {
            return null;
        }
        return dVar.f423601f.get(str);
    }

    public final synchronized void f(o11.d dVar) {
        if (dVar == null) {
            throw new java.lang.IllegalArgumentException("[cpan] image loader configuration is null.");
        }
        if (this.f415582b == null) {
            this.f415581a = new n11.b(dVar);
            this.f415582b = dVar;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.imageloader.ImageLoader", "[cpan] image loader had init.");
        }
    }

    public void g(java.lang.String str, android.widget.ImageView imageView) {
        l(str, imageView, null, null, null, null, null, null, null);
    }

    public void h(java.lang.String str, android.widget.ImageView imageView, o11.g gVar) {
        l(str, imageView, gVar, null, null, null, null, null, null);
    }

    public void i(java.lang.String str, android.widget.ImageView imageView, o11.g gVar, p11.h hVar) {
        l(str, imageView, gVar, null, null, hVar, null, null, null);
    }

    public void j(java.lang.String str, android.widget.ImageView imageView, o11.g gVar, p11.k kVar) {
        l(str, imageView, gVar, kVar, null, null, null, null, null);
    }

    public void k(java.lang.String str, android.widget.ImageView imageView, o11.g gVar, p11.k kVar, p11.h hVar) {
        l(str, imageView, gVar, kVar, null, hVar, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(java.lang.String r20, android.widget.ImageView r21, o11.g r22, p11.k r23, p11.l r24, p11.h r25, p11.f r26, p11.e r27, p11.n r28) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n11.a.l(java.lang.String, android.widget.ImageView, o11.g, p11.k, p11.l, p11.h, p11.f, p11.e, p11.n):void");
    }

    public void m(java.lang.String str, android.widget.ImageView imageView, p11.h hVar) {
        l(str, imageView, null, null, null, hVar, null, null, null);
    }

    public void n(int i17) {
        if (i17 == 0 || i17 == 1) {
            this.f415581a.f415585b.mo54793xc84dc82d();
        } else {
            this.f415581a.f415585b.mo54791x65825f6();
        }
    }

    public void o(java.lang.String str, android.graphics.Bitmap bitmap) {
        o11.d dVar;
        n11.b bVar = this.f415581a;
        if (bVar == null || (dVar = bVar.f415584a) == null) {
            return;
        }
        dVar.f423601f.a(str, bitmap);
    }

    public void p(java.lang.String str) {
        o11.d dVar;
        n11.b bVar = this.f415581a;
        if (bVar == null || (dVar = bVar.f415584a) == null) {
            return;
        }
        dVar.f423601f.mo48129xc84af884(str);
    }

    public final void q(android.widget.ImageView imageView, o11.g gVar) {
        if (imageView == null || gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.imageloader.ImageLoader", "[cpan] should show default image view or options is null.");
            return;
        }
        android.graphics.drawable.Drawable drawable = gVar.f423652q;
        int i17 = gVar.f423651p;
        if (!(i17 > 0 || drawable != null)) {
            if (gVar.f423656u) {
                imageView.setImageDrawable(null);
            }
        } else {
            if (i17 != 0) {
                imageView.setImageResource(i17);
                return;
            }
            android.content.res.Resources resources = this.f415582b.f423597b;
            if (i17 != 0) {
                drawable = resources.getDrawable(i17);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public a(o11.d dVar) {
        f(dVar);
    }
}
