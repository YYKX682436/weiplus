package mi5;

/* loaded from: classes9.dex */
public final class e0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.b1 f408354a;

    /* renamed from: b, reason: collision with root package name */
    public em.v0 f408355b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f408356c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f408357d = pd5.l.f435113b.a(com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2523x6c8cc133.C20106xfa5a3ca3.class, true);

    /* renamed from: e, reason: collision with root package name */
    public gd5.a f408358e;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f408357d) {
            em.v0 v0Var = this.f408355b;
            android.view.View view2 = v0Var != null ? v0Var.f336392a : null;
            if (view2 != null) {
                return view2;
            }
            em.v0 a17 = em.v0.a(context);
            this.f408355b = a17;
            h(null, this.f408358e);
            android.view.View view3 = a17.f336392a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view3, "getInflateRootView(...)");
            return view3;
        }
        em.b1 b1Var = this.f408354a;
        if (b1Var == null || (view = b1Var.f335645a) == null) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehu, (android.view.ViewGroup) null);
            this.f408354a = new em.b1(inflate);
            h(null, this.f408358e);
            view = inflate;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        view.setScaleX(0.7f);
        view.setScaleY(0.7f);
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        gd5.a aVar = (gd5.a) pVar;
        gd5.a aVar2 = this.f408358e;
        this.f408358e = aVar;
        h(aVar2, aVar);
    }

    public final void c(android.content.Context context, l15.c cVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.TextView textView, yz5.a aVar) {
        z05.d p17;
        l15.b j17;
        java.lang.String f17 = f(cVar);
        if (f17 == null) {
            return;
        }
        int a17 = com.p314xaae8f345.mm.p2621x8fb0427b.m2.a((cVar == null || (j17 = cVar.j()) == null) ? null : j17.m144874x52c258a2());
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m i17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(f17, a17);
        java.lang.String e17 = e(i17, cVar);
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).ij(e17)) {
            aVar.mo152xb9724478();
            textView.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(context, i17, e17));
            textView.setVisibility(0);
            textView.setCompoundDrawables(null, null, null, null);
            c22699x3dcdb352.setVisibility(8);
            if ((cVar == null || (p17 = cVar.p()) == null) ? false : p17.k()) {
                return;
            }
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(f17, 2, i65.a.g(context));
            if (Di == null || Di.isRecycled()) {
                android.content.res.Resources resources = context.getResources();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bku));
                arrayList.add(resources);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/msgviewfactory/view/ChattingLiteAppView", "fillSourceIcon", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.e(obj, decodeResource, "com/tencent/mm/ui/msgviewfactory/view/ChattingLiteAppView", "fillSourceIcon", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                Di = decodeResource;
            }
            c22699x3dcdb352.setVisibility(0);
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(Di);
            int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
            bitmapDrawable.setBounds(0, 0, dimension, dimension);
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            c22699x3dcdb352.setImageDrawable(bitmapDrawable);
            c22699x3dcdb352.setImageBitmap(Di);
        }
    }

    public final void d(android.content.Context context, l15.c cVar, android.widget.ImageView imageView, android.widget.TextView textView, yz5.a aVar) {
        v05.b k17;
        if (cVar == null || (k17 = cVar.k()) == null) {
            return;
        }
        int i17 = k17.f449898d;
        if ((k17.m75939xb282bd08(i17 + 6) == 5 || k17.m75939xb282bd08(i17 + 6) == 68) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sg.b(k17)) {
            aVar.mo152xb9724478();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sg.f287056a.a(context, k17.m75945x2fec8307(k17.f513848e + 11), imageView, textView);
        }
    }

    public final java.lang.String e(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, l15.c cVar) {
        l15.b j17;
        java.lang.String m144873xe77ac16;
        java.lang.String str = mVar != null ? mVar.f67372x453d1e07 : null;
        if (str == null || r26.n0.N(str)) {
            return (cVar == null || (j17 = cVar.j()) == null || (m144873xe77ac16 = j17.m144873xe77ac16()) == null) ? "" : m144873xe77ac16;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar);
        java.lang.String str2 = mVar.f67372x453d1e07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        return str2;
    }

    public final java.lang.String f(l15.c cVar) {
        v05.b k17;
        z05.d p17;
        java.lang.String q17 = (cVar == null || (p17 = cVar.p()) == null) ? null : p17.q();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q17)) {
            q17 = (cVar == null || (k17 = cVar.k()) == null) ? null : k17.m75945x2fec8307(k17.f449898d + 0);
        }
        if (q17 == null) {
            return null;
        }
        if (q17.length() > 0) {
            return q17;
        }
        return null;
    }

    public final void g(java.lang.String str, l15.c cVar, android.widget.ImageView imageView) {
        v05.a aVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            v05.b k17 = cVar.k();
            str = (k17 == null || (aVar = (v05.a) k17.m75936x14adae67(k17.f513848e + 8)) == null) ? null : aVar.A();
        }
        n11.a b17 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78435x7b83bce4;
        fVar.f423634y = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.k();
        fVar.f423612c = true;
        fVar.f423616g = tv.a.a();
        fVar.A = new r35.n0(0);
        fVar.B = new r35.w(0);
        int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
        int b19 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
        fVar.f423619j = b18;
        fVar.f423620k = b19;
        fVar.f423610a = true;
        fVar.f423629t = true;
        fVar.f423630u = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1);
        b17.h(str, imageView, fVar.a());
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408358e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).ij(e(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(r2, r3), r8)) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (r4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        r11.f550686o = new mi5.c0(r23, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        r11.f550682h = new mi5.d0(r23, r10, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        if (r23.f408356c != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        r2 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, "getService(...)");
        r2 = ((q31.t) ((q31.r) r2)).Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r10);
        r23.f408356c = ((bf5.a) r2).k(r10);
        r1.b().addView(r23.f408356c, -1, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010b, code lost:
    
        r1 = r23.f408356c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010d, code lost:
    
        if (r1 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0110, code lost:
    
        r1.m48330xfcfee142(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
    
        r9.setOnClickListener(new mi5.z(r23, r10, r0, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c6, code lost:
    
        if ((r2 != null && r2.m75939xb282bd08(r2.f449898d + 6) == 68) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sg.b(r2) != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(gd5.a r24, gd5.a r25) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi5.e0.h(gd5.a, gd5.a):void");
    }

    public final android.graphics.Bitmap i(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.a(f9Var, f9Var != null ? f9Var.z0() : null)) {
            return null;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        return m11.b1.Di().m0(f9Var, f9Var != null ? f9Var.z0() : null, i65.a.g(context), false);
    }
}
