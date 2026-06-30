package com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1856x5faa95b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/media/image/SwitchableImageContainer;", "Landroid/widget/FrameLayout;", "", "Lrf3/g;", "Landroid/view/View;", "getActiveView", "Landroid/graphics/PointF;", "getTranslationValues", "getTranslationScale", "Lcom/tencent/mm/ui/base/WxImageView;", "e", "Lcom/tencent/mm/ui/base/WxImageView;", "getSampleImageView", "()Lcom/tencent/mm/ui/base/WxImageView;", "setSampleImageView", "(Lcom/tencent/mm/ui/base/WxImageView;)V", "sampleImageView", "Lsf3/d;", "g", "Lsf3/d;", "getInnerLoader", "()Lsf3/d;", "setInnerLoader", "(Lsf3/d;)V", "innerLoader", "Lrf3/v;", "h", "Lrf3/v;", "getListener", "()Lrf3/v;", "setListener", "(Lrf3/v;)V", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.media.image.SwitchableImageContainer */
/* loaded from: classes12.dex */
public final class C16491xb6370bb4 extends android.widget.FrameLayout implements rf3.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f230094i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a f230095d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f sampleImageView;

    /* renamed from: f, reason: collision with root package name */
    public sf3.g f230097f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public sf3.d innerLoader;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public rf3.v listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16491xb6370bb4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // rf3.g
    public jz5.l a(float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f230095d;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (c21524xecd57b9a != null) {
            boolean z17 = false;
            if (c21524xecd57b9a != null && c21524xecd57b9a.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = this.f230095d;
                if (c21524xecd57b9a2 != null) {
                    c21524xecd57b9a2.c(f17, f18);
                }
                return new jz5.l(valueOf, valueOf);
            }
        }
        return new jz5.l(valueOf, valueOf);
    }

    @Override // rf3.g
    public void b() {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = this.sampleImageView;
        if (c21537x5f41189f == null || c21537x5f41189f.getVisibility() != 0 || (c1451x2b77465d = c21537x5f41189f.f149750f) == null) {
            return;
        }
        c1451x2b77465d.m15694x147aac0b(true);
        c21537x5f41189f.f149750f.invalidate();
    }

    @Override // rf3.g
    public void c(float f17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = this.sampleImageView;
        if (c21537x5f41189f == null || c21537x5f41189f.getVisibility() != 0 || (c1451x2b77465d = c21537x5f41189f.f149750f) == null) {
            return;
        }
        c1451x2b77465d.m15754x736b953e();
    }

    public final void d() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (this.f230095d == null) {
                android.view.View childAt = getChildAt(i17);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = childAt instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) childAt : null;
                if (c21524xecd57b9a != null) {
                    this.f230095d = c21524xecd57b9a;
                }
            }
            if (this.sampleImageView == null) {
                android.view.View childAt2 = getChildAt(i17);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = childAt2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) childAt2 : null;
                if (c21537x5f41189f != null) {
                    this.sampleImageView = c21537x5f41189f;
                    c21537x5f41189f.m45740x79fcb603(rj0.d.Tile);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f2 = this.sampleImageView;
                    if (c21537x5f41189f2 != null) {
                        c21537x5f41189f2.m79314xbc839517(true);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(sf3.g param) {
        java.lang.Object m143895xf1229813;
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 uri;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        if (this.f230095d == null) {
            return;
        }
        boolean a17 = param.f488925f.a(param);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load start, id: ");
        java.lang.String str = param.f488921b;
        sb6.append(str);
        sb6.append(" type: ");
        sb6.append(param.f488924e.name());
        sb6.append(" path: ");
        sb6.append(param.c());
        sb6.append(" opt: ");
        sb6.append(a17);
        i(sb6.toString(), new java.lang.Object[0]);
        java.lang.String c17 = param.c();
        sf3.g gVar = this.f230097f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, gVar != null ? gVar.c() : null)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("load abort, id: ");
            sb7.append(str);
            sb7.append(" type: ");
            sb7.append(param.f488924e.name());
            sb7.append(" oldPath: ");
            sf3.g gVar2 = this.f230097f;
            sb7.append(gVar2 != null ? gVar2.c() : null);
            sb7.append(" newPath: ");
            sb7.append(param.c());
            h(sb7.toString(), new java.lang.Object[0]);
            return;
        }
        if (this.sampleImageView == null || !a17) {
            i("loadDirectly " + str, new java.lang.Object[0]);
            this.f230097f = param;
            if (param.f488924e != sf3.m.f488935d) {
                if ((param.c().length() == 0) == false) {
                    java.lang.String c18 = param.c();
                    sf3.d dVar = this.innerLoader;
                    android.graphics.Bitmap a18 = dVar != null ? dVar.a(param) : null;
                    if (a18 != null && !a18.isRecycled() && this.f230095d != null) {
                        g("use cache, fillBitmap path : %s");
                        java.util.Arrays.copyOf(new java.lang.Object[]{c18}, 1);
                        j(false, true);
                        f(a18);
                        return;
                    }
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f230095d;
                    if (c21524xecd57b9a != null) {
                        c21524xecd57b9a.setImageBitmap(null);
                    }
                    j(false, true);
                    sf3.g a19 = param.a(sf3.m.f488939h);
                    sf3.d dVar2 = this.innerLoader;
                    if (dVar2 != null) {
                        dVar2.b(a19, new rf3.x(this));
                    }
                    sf3.d dVar3 = this.innerLoader;
                    if (dVar3 != null) {
                        dVar3.b(param, new rf3.x(this));
                        return;
                    }
                    return;
                }
            }
            h("load UNKNOWN param", new java.lang.Object[0]);
            return;
        }
        i("loadBigImage " + str, new java.lang.Object[0]);
        java.lang.String c19 = param.c();
        sf3.g gVar3 = this.f230097f;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19, gVar3 != null ? gVar3.c() : null);
        this.f230097f = param;
        if (param.f488924e != sf3.m.f488935d) {
            if ((param.c().length() == 0) == false) {
                sf3.g b18 = param.b(sf3.m.f488937f, sf3.m.f488936e);
                java.lang.String c27 = param.c();
                i("checkUseBigImageOpt, result: %b, path: %s", java.lang.Boolean.valueOf(param.f488925f.a(param)), param.c());
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = this.sampleImageView;
                if (c21537x5f41189f == null) {
                    return;
                }
                if (b17) {
                    j(true, false);
                }
                c21537x5f41189f.m45747xe60f5d4e(new rf3.w(this, c27, b18, param));
                java.lang.String imgPath = param.c();
                if (!com.p314xaae8f345.mm.vfs.w6.j(imgPath)) {
                    h("loadSampleInternal path not exits: " + imgPath, new java.lang.Object[0]);
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(imgPath, options);
                    if (d17 != null) {
                        d17.recycle();
                    }
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(options);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    m143895xf1229813 = null;
                }
                android.graphics.BitmapFactory.Options options2 = (android.graphics.BitmapFactory.Options) m143895xf1229813;
                if (options2 == null) {
                    h("options null", new java.lang.Object[0]);
                    return;
                }
                sf3.g b19 = param.b(sf3.m.f488940i, sf3.m.f488939h);
                java.lang.String c28 = b19.f488924e == sf3.m.f488935d ? "" : b19.c();
                if ((c28.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(c28)) {
                    uri = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536.uri(c28);
                } else {
                    uri = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536.uri(imgPath);
                    h("loadSampleInternal previewPath not exits, use raw : ".concat(c28), new java.lang.Object[0]);
                }
                h("loadSampleInternal loadFile: " + imgPath + " previewPath: " + c28, new java.lang.Object[0]);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f2 = this.sampleImageView;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f3 = c21537x5f41189f2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f ? c21537x5f41189f2 : null;
                if (c21537x5f41189f3 != null) {
                    c21537x5f41189f3.m79320x1a6eb00e(com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(imgPath));
                    int i17 = options2.outWidth;
                    int i18 = options2.outHeight;
                    c21537x5f41189f3.f149752h = i17;
                    c21537x5f41189f3.f149753i = i18;
                    rf3.v vVar = this.listener;
                    if (vVar != null) {
                        vVar.r(i17, i18);
                    }
                    c21537x5f41189f3.i();
                    c21537x5f41189f3.t(imgPath, uri);
                    return;
                }
                return;
            }
        }
        h("load UNKNOWN param", new java.lang.Object[0]);
    }

    public final void f(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f230095d;
        if (c21524xecd57b9a == null) {
            return;
        }
        c21524xecd57b9a.m79195x464b3146(false);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        c21524xecd57b9a.f279184o = width;
        c21524xecd57b9a.f279185p = height;
        rf3.v vVar = this.listener;
        if (vVar != null) {
            vVar.r(bitmap.getWidth(), bitmap.getHeight());
        }
        c21524xecd57b9a.setImageBitmap(null);
        c21524xecd57b9a.setImageBitmap(bitmap);
        c21524xecd57b9a.invalidate();
    }

    public final java.lang.String g(java.lang.String str) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
        sb6.append(hashCode());
        sb6.append('#');
        sf3.g gVar = this.f230097f;
        if (gVar == null || (str2 = gVar.f488921b) == null) {
            str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
        }
        sb6.append(str2);
        return str + sb6.toString();
    }

    /* renamed from: getActiveView */
    public final android.view.View m66589x6815f2c1() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = this.sampleImageView;
        if (c21537x5f41189f != null && c21537x5f41189f.getVisibility() == 0) {
            return this.sampleImageView;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f230095d;
        if (c21524xecd57b9a != null && c21524xecd57b9a.getVisibility() == 0) {
            return this.f230095d;
        }
        return null;
    }

    public final sf3.d getInnerLoader() {
        return this.innerLoader;
    }

    public final rf3.v getListener() {
        return this.listener;
    }

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f getSampleImageView() {
        return this.sampleImageView;
    }

    @Override // rf3.g
    /* renamed from: getTranslationScale */
    public android.graphics.PointF mo66593x42bf948f() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = this.sampleImageView;
        if (c21537x5f41189f != null && c21537x5f41189f.getVisibility() == 0) {
            return c21537x5f41189f.mo45728xfdb07fbf();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f230095d;
        if (c21524xecd57b9a == null || c21524xecd57b9a.getVisibility() != 0) {
            return null;
        }
        return c21524xecd57b9a.mo45728xfdb07fbf();
    }

    @Override // rf3.g
    /* renamed from: getTranslationValues */
    public android.graphics.PointF mo66594x1a3a7a7d() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = this.sampleImageView;
        if (c21537x5f41189f != null && c21537x5f41189f.getVisibility() == 0) {
            return c21537x5f41189f.mo45729x3ffd66();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = this.f230095d;
        if (c21524xecd57b9a2 == null || c21524xecd57b9a2.getVisibility() != 0 || (c21524xecd57b9a = this.f230095d) == null) {
            return null;
        }
        return c21524xecd57b9a.mo45729x3ffd66();
    }

    public final void h(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.SwitchableImageContainer", g(str), java.util.Arrays.copyOf(objArr, objArr.length));
    }

    public final void i(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.SwitchableImageContainer", g(str), java.util.Arrays.copyOf(objArr, objArr.length));
    }

    public final void j(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = this.sampleImageView;
        if (c21537x5f41189f != null) {
            c21537x5f41189f.setVisibility(z17 ? 0 : 8);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f2 = this.sampleImageView;
            if (c21537x5f41189f2 != null) {
                c21537x5f41189f2.m45737x3a5986f(z17);
            }
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f230095d;
        if (c21524xecd57b9a != null) {
            c21524xecd57b9a.setVisibility(z18 ? 0 : 8);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = this.f230095d;
            if (c21524xecd57b9a2 != null) {
                c21524xecd57b9a2.setImageBitmap(null);
            }
        }
        g("showImageView showWxImage:" + z17 + " showMultiTouchImage:" + z18);
        java.util.Arrays.copyOf(new java.lang.Object[0], 0);
    }

    /* renamed from: setInnerLoader */
    public final void m66595x41568c47(sf3.d dVar) {
        this.innerLoader = dVar;
    }

    /* renamed from: setListener */
    public final void m66596xc6cf6336(rf3.v vVar) {
        this.listener = vVar;
    }

    /* renamed from: setSampleImageView */
    public final void m66597x6de50754(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f) {
        this.sampleImageView = c21537x5f41189f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16491xb6370bb4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
