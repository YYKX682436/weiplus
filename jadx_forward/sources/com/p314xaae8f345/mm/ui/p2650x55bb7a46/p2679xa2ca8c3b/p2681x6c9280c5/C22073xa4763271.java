package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAskShareMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/g;", "Landroid/widget/ImageView;", "thumbIv", "Ljz5/f0;", "setFailImage", "", "h", "Ljz5/g;", "getCropLongerLenThreshold", "()I", "cropLongerLenThreshold", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView */
/* loaded from: classes9.dex */
public final class C22073xa4763271 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.g> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f286146i = 0;

    /* renamed from: f, reason: collision with root package name */
    public em.h f286147f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f286148g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cropLongerLenThreshold;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22073xa4763271(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271, android.graphics.Bitmap bitmap, int i17, int i18, yz5.l lVar) {
        lVar.mo146xb9724478(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.R(bitmap, i17, i18, c22073xa4763271.m80078x4af8d645()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCropLongerLenThreshold */
    public final int m80078x4af8d645() {
        return ((java.lang.Number) ((jz5.n) this.cropLongerLenThreshold).mo141623x754a37bb()).intValue();
    }

    public static final java.lang.Object i(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271 c22073xa4763271, z01.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        c22073xa4763271.getClass();
        java.lang.Object obj = null;
        android.graphics.Bitmap bitmap = gVar != null ? gVar.f550559t : null;
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a1 a1Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a1.f270333a;
        if (gVar == null || (str = gVar.f550556q) == null) {
            str = "1:1";
        }
        int[] c17 = a1Var.c(str);
        java.lang.String str2 = gVar != null ? gVar.f550550h : null;
        int i17 = c17[0];
        boolean z17 = true;
        int i18 = c17[1];
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromUrl] thumburl is null, so bitmap is null");
        } else if (r26.i0.y(str2, "http", false)) {
            obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new af5.o(str2, i17, i18, c22073xa4763271, null), interfaceC29045xdcb5ca57);
        } else {
            android.graphics.Bitmap c18 = com.p314xaae8f345.mm.p786x600aa8b.e.c(str2);
            if (c18 != null && !c18.isRecycled()) {
                obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.R(c18, i17, i18, c22073xa4763271.m80078x4af8d645());
            } else if (c18 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromFile] raw is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromFile] raw is recycled");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setFailImage */
    public final void m80079x3a48d69b(android.widget.ImageView imageView) {
        imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r(com.p314xaae8f345.mm.R.raw.f80862x137353c3, imageView.getWidth(), imageView.getHeight(), imageView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836), imageView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77627xb498cd1c), 0.625f));
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!te5.f.f500167a.a()) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e0p, (android.view.ViewGroup) this, false);
            this.f286147f = new em.h(inflate);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
            return inflate;
        }
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 u17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).u(context);
        this.f286148g = u17;
        return u17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x03c3, code lost:
    
        if (r2 != 2) goto L215;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(q31.p r18, q31.p r19) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22073xa4763271.e(q31.p, q31.p):void");
    }

    public final void k(android.graphics.Bitmap bitmap) {
        z01.g m48328xa0ab20ce = m48328xa0ab20ce();
        z01.f fVar = m48328xa0ab20ce != null ? m48328xa0ab20ce.f550546d : null;
        int i17 = fVar == null ? -1 : af5.i.f86114a[fVar.ordinal()];
        if (i17 == 1 || i17 == 2) {
            if (bitmap == null || bitmap.isRecycled()) {
                z01.g m48328xa0ab20ce2 = m48328xa0ab20ce();
                em.h hVar = this.f286147f;
                if (hVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                    throw null;
                }
                android.widget.ImageView b17 = hVar.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getPictureAreaIv(...)");
                em.h hVar2 = this.f286147f;
                if (hVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                    throw null;
                }
                if (hVar2.f335899g == null) {
                    hVar2.f335899g = (android.widget.ImageView) hVar2.f335893a.findViewById(com.p314xaae8f345.mm.R.id.uqf);
                }
                android.widget.ImageView imageView = hVar2.f335899g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getPicturePlaceholder(...)");
                l(m48328xa0ab20ce2, b17, imageView);
                return;
            }
            em.h hVar3 = this.f286147f;
            if (hVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            hVar3.b().setVisibility(0);
            em.h hVar4 = this.f286147f;
            if (hVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            hVar4.b().setImageBitmap(bitmap);
            em.h hVar5 = this.f286147f;
            if (hVar5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (hVar5.f335899g == null) {
                hVar5.f335899g = (android.widget.ImageView) hVar5.f335893a.findViewById(com.p314xaae8f345.mm.R.id.uqf);
            }
            hVar5.f335899g.setVisibility(8);
            return;
        }
        if (i17 != 3) {
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            z01.g m48328xa0ab20ce3 = m48328xa0ab20ce();
            em.h hVar6 = this.f286147f;
            if (hVar6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            android.widget.ImageView e17 = hVar6.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getVideoCoverIv(...)");
            em.h hVar7 = this.f286147f;
            if (hVar7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (hVar7.f335903k == null) {
                hVar7.f335903k = (android.widget.ImageView) hVar7.f335893a.findViewById(com.p314xaae8f345.mm.R.id.vm6);
            }
            android.widget.ImageView imageView2 = hVar7.f335903k;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView2, "getVideoCoverPlaceholder(...)");
            l(m48328xa0ab20ce3, e17, imageView2);
            return;
        }
        em.h hVar8 = this.f286147f;
        if (hVar8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        hVar8.e().setVisibility(0);
        em.h hVar9 = this.f286147f;
        if (hVar9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        hVar9.e().setImageBitmap(bitmap);
        em.h hVar10 = this.f286147f;
        if (hVar10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (hVar10.f335903k == null) {
            hVar10.f335903k = (android.widget.ImageView) hVar10.f335893a.findViewById(com.p314xaae8f345.mm.R.id.vm6);
        }
        hVar10.f335903k.setVisibility(8);
    }

    public final void l(z01.g gVar, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromUrl] viewModel is null, return.");
            return;
        }
        java.lang.String str = gVar.f550550h;
        int[] c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a1.f270333a.c(gVar.f550556q);
        if (r26.i0.A(str, "http", false, 2, null)) {
            int i17 = c17[0];
            int i18 = c17[1];
            gk0.h hVar = new gk0.h(str);
            gk0.k kVar = new gk0.k(0, 0);
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(this), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new af5.n(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Bi(hVar, kVar), kVar, hVar, this, i17, i18, imageView, imageView2, null), 2, null);
            return;
        }
        if (!(str.length() > 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromUrl] thumburl is null, so bitmap is null");
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            return;
        }
        int i19 = c17[0];
        int i27 = c17[1];
        android.graphics.Bitmap c18 = com.p314xaae8f345.mm.p786x600aa8b.e.c(str);
        if (c18 != null && !c18.isRecycled()) {
            m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.R(c18, i19, i27, m80078x4af8d645()), imageView, imageView2);
            return;
        }
        if (c18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromFile] raw is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromFile] raw is recycled");
        }
        imageView.setVisibility(8);
        imageView2.setVisibility(0);
    }

    public final void m(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        if (bitmap != null && !bitmap.isRecycled()) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
            imageView2.setVisibility(8);
        } else {
            if (bitmap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[setImageBitmap] bitmap is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAskShareMvvmView", "[setImageBitmap] bitmap is recycled");
            }
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
        }
    }

    public /* synthetic */ C22073xa4763271(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22073xa4763271(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.cropLongerLenThreshold = jz5.h.b(af5.j.f86117d);
    }
}
