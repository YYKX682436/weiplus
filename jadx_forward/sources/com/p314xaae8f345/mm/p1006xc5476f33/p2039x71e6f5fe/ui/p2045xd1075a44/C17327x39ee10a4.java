package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B#\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\"J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0006\u0010\u001a\u001a\u00020\u0006¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView;", "Lcom/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView;", "Luy3/s;", "Luy3/u;", "Landroid/graphics/Point;", "getPreviewImageSize", "", "getLayoutId", "Ld04/j;", "getScanProductView", "Ld04/h;", "scanProductCallBack", "Ljz5/f0;", "setScanProductCallBack", "Ld04/i;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setScanProductOnItemClickListener", "bottomHeight", "setBottomExtraHeight", "", "translationY", "setBackgroundTransY", "getBackgroundTransY", "setMarkViewTransY", "getMarkViewTransY", "getMarkViewHeight", "getQrCodeButtonHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "d04/f0", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView */
/* loaded from: classes13.dex */
public final class C17327x39ee10a4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb implements uy3.s, uy3.u {

    /* renamed from: a2, reason: collision with root package name */
    public static final /* synthetic */ int f241231a2 = 0;
    public android.view.View I1;
    public android.widget.ImageView J1;
    public android.widget.ImageView K1;
    public android.widget.ImageView L1;
    public android.widget.ImageView M1;
    public d04.j N1;
    public android.view.View O1;
    public final android.view.animation.LinearInterpolator P1;
    public final android.view.animation.DecelerateInterpolator Q1;
    public boolean R1;
    public boolean S1;
    public boolean T1;
    public android.graphics.Bitmap U1;
    public android.graphics.Bitmap V1;
    public boolean W1;
    public int X1;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Y1;
    public android.os.Vibrator Z1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17327x39ee10a4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getPreviewImageSize */
    private final android.graphics.Point m68781x1f993c8a() {
        android.graphics.Bitmap bitmap = this.V1;
        if (bitmap != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            if (!bitmap.isRecycled()) {
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.V1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.V1);
                    float width = (r0.getWidth() * 1.0f) / r3.getHeight();
                    if (width < (getMeasuredWidth() * 1.0f) / getMeasuredHeight()) {
                        int measuredHeight = getMeasuredHeight();
                        return new android.graphics.Point((int) (width * measuredHeight), measuredHeight);
                    }
                    int measuredWidth = getMeasuredWidth();
                    return new android.graphics.Point(measuredWidth, (int) (measuredWidth / width));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCodeProductMergeMaskView", e17, "getPreviewImageSize exception", new java.lang.Object[0]);
                    return new android.graphics.Point(0, 0);
                }
            }
        }
        return new android.graphics.Point(0, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb
    public boolean A() {
        return getMScanSource() == 4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb
    public int B() {
        return getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb
    public void D() {
        super.D();
        java.lang.Object obj = this.N1;
        if (obj == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
            throw null;
        }
        android.view.View view = (android.view.View) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onGalleryImageProcessStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onGalleryImageProcessStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb
    public void J(android.graphics.Bitmap bitmap) {
        this.S1 = true;
        this.T1 = false;
        L(bitmap);
    }

    public final void L(android.graphics.Bitmap bitmap) {
        M();
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeProductMergeMaskView", "updatePreview bitmap width: %d, height: %d, showPreviewImage: %b, animateShowPreviewImage: %b", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Boolean.valueOf(this.S1), java.lang.Boolean.valueOf(this.T1));
            this.V1 = bitmap;
            android.widget.ImageView imageView = this.K1;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                throw null;
            }
            imageView.setImageBitmap(bitmap);
            if (this.S1) {
                android.widget.ImageView imageView2 = this.K1;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                    throw null;
                }
                imageView2.setVisibility(0);
                if (this.T1) {
                    android.widget.ImageView imageView3 = this.K1;
                    if (imageView3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                        throw null;
                    }
                    imageView3.setAlpha(0.0f);
                } else {
                    android.widget.ImageView imageView4 = this.K1;
                    if (imageView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                        throw null;
                    }
                    imageView4.setAlpha(1.0f);
                }
            } else {
                android.widget.ImageView imageView5 = this.K1;
                if (imageView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                    throw null;
                }
                imageView5.setVisibility(8);
            }
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeProductMergeMaskView", "setPreviewBitmap width: %d, height: %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
        new d04.k0(this, bitmap, false).mo152xb9724478();
    }

    public final void M() {
        android.graphics.Bitmap bitmap = this.U1;
        if (bitmap != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            if (bitmap.isRecycled()) {
                return;
            }
            android.graphics.Bitmap bitmap2 = this.U1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap2);
            bitmap2.recycle();
            this.U1 = null;
        }
    }

    @Override // uy3.u
    public void a(int i17, float f17, float f18) {
    }

    @Override // uy3.u
    public void b() {
    }

    @Override // uy3.u
    public void c() {
    }

    @Override // uy3.u
    public void d(int i17, float f17, float f18) {
        boolean z17;
        if (this.X1 == 1) {
            return;
        }
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f18));
        if (i17 == 1 || i17 == 2) {
            android.view.animation.DecelerateInterpolator decelerateInterpolator = this.Q1;
            if (max >= 0.5f && i17 == 1) {
                z17 = this.R1;
                float f19 = (max - 0.5f) / 0.5f;
                android.widget.ImageView imageView = this.L1;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                    throw null;
                }
                imageView.setAlpha(decelerateInterpolator.getInterpolation(f19));
                android.widget.ImageView imageView2 = this.M1;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("successMarkView");
                    throw null;
                }
                imageView2.setAlpha(1.0f - f19);
                android.widget.ImageView imageView3 = this.K1;
                if (imageView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                    throw null;
                }
                android.widget.ImageView imageView4 = this.L1;
                if (imageView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                    throw null;
                }
                imageView3.setAlpha(1.0f - imageView4.getAlpha());
            } else if (i17 == 2) {
                z17 = this.R1;
                android.widget.ImageView imageView5 = this.L1;
                if (imageView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                    throw null;
                }
                imageView5.setAlpha(decelerateInterpolator.getInterpolation(max));
                android.widget.ImageView imageView6 = this.M1;
                if (imageView6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("successMarkView");
                    throw null;
                }
                imageView6.setAlpha(1.0f - max);
                android.widget.ImageView imageView7 = this.K1;
                if (imageView7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                    throw null;
                }
                android.widget.ImageView imageView8 = this.L1;
                if (imageView8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                    throw null;
                }
                imageView7.setAlpha(1.0f - imageView8.getAlpha());
            } else {
                android.widget.ImageView imageView9 = this.M1;
                if (imageView9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("successMarkView");
                    throw null;
                }
                imageView9.setAlpha(1.0f);
                android.widget.ImageView imageView10 = this.K1;
                if (imageView10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                    throw null;
                }
                imageView10.setAlpha(1.0f);
                z17 = false;
            }
            android.view.View view = this.I1;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maskView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.5f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view2 = this.I1;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maskView");
                throw null;
            }
            float max2 = java.lang.Math.max(0.0f, java.lang.Math.min(0.5f, 1.0f - max));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(max2));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (this.S1) {
                if (this.T1) {
                    float max3 = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, (f18 - 0.5f) / 0.5f));
                    android.widget.ImageView imageView11 = this.K1;
                    if (imageView11 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                        throw null;
                    }
                    imageView11.setAlpha(1.0f - max3);
                    android.widget.ImageView imageView12 = this.K1;
                    if (imageView12 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                        throw null;
                    }
                    imageView12.getAlpha();
                } else {
                    android.widget.ImageView imageView13 = this.K1;
                    if (imageView13 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                        throw null;
                    }
                    imageView13.setAlpha(1.0f);
                }
            }
            z17 = false;
        }
        android.widget.ImageView imageView14 = this.L1;
        if (imageView14 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
            throw null;
        }
        imageView14.setVisibility(z17 ? 0 : 8);
        android.view.View view3 = this.I1;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maskView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView15 = this.L1;
        if (imageView15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
            throw null;
        }
        imageView15.getAlpha();
        android.view.View view4 = this.I1;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maskView");
            throw null;
        }
        view4.getAlpha();
        android.widget.ImageView imageView16 = this.K1;
        if (imageView16 != null) {
            imageView16.getAlpha();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
            throw null;
        }
    }

    @Override // uy3.u
    public void e() {
    }

    @Override // uy3.u
    public void f() {
    }

    @Override // uy3.s
    /* renamed from: getBackgroundTransY */
    public float mo68744xf46f0f5() {
        android.view.View view = this.O1;
        if (view != null) {
            return view.getTranslationY();
        }
        return 0.0f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb
    /* renamed from: getLayoutId */
    public int mo68762x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eia;
    }

    @Override // uy3.s
    /* renamed from: getMarkViewHeight */
    public float mo68745x1695bbcf() {
        return getSuccessMarkViewSize();
    }

    @Override // uy3.s
    /* renamed from: getMarkViewTransY */
    public float mo68746x2bc38d59() {
        android.widget.ImageView imageView = this.M1;
        if (imageView != null) {
            return imageView.getTranslationY();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("successMarkView");
        throw null;
    }

    /* renamed from: getQrCodeButtonHeight */
    public final int m68782x45d3cfbd() {
        try {
            return m68763xb5f85d42().getHeight();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCodeProductMergeMaskView", e17, "getQrCodeButtonHeight", new java.lang.Object[0]);
            return 0;
        }
    }

    /* renamed from: getScanProductView */
    public final d04.j m68783x53341f41() {
        d04.j jVar = this.N1;
        if (jVar != null) {
            return jVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
        throw null;
    }

    @Override // uy3.u
    public void h() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    public void i(android.view.View view) {
        this.O1 = view;
        getMScanSource();
        if (view instanceof android.view.TextureView) {
            if (getMScanSource() == 3) {
                ((ku5.t0) ku5.t0.f394148d).g(new d04.v0(this, (android.view.TextureView) view));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012c  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(boolean r19) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4.m(boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    public void n() {
        super.n();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    public void o(java.lang.Object data, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0 w0Var) {
        android.graphics.PointF pointF;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!(data instanceof d04.f0)) {
            java.lang.Object obj = this.N1;
            if (obj == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
                throw null;
            }
            if (((android.view.View) obj).getVisibility() == 0) {
                java.lang.Object obj2 = this.N1;
                if (obj2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
                    throw null;
                }
                e04.i3.a((android.view.View) obj2, 1.0f, 0.0f, 200L, null);
            }
            super.o(data, w0Var);
            return;
        }
        d04.f0 f0Var = (d04.f0) data;
        sz3.w0 w0Var2 = f0Var.f306945a;
        boolean z17 = f0Var.f306946b;
        if (!(this.X1 == 1)) {
            java.lang.Object obj3 = this.N1;
            if (obj3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
                throw null;
            }
            F(200L, new d04.n0(((android.view.View) obj3).getAlpha() == 1.0f, this));
        }
        if (!z17) {
            if (w0Var != null) {
                w0Var.c();
            }
            if (w0Var != null) {
                w0Var.b(false);
                return;
            }
            return;
        }
        m68777x47868117(w0Var);
        android.graphics.RectF rectF = w0Var2.f495673k;
        if (rectF != null) {
            float f17 = (rectF.left + rectF.right) / 2.0f;
            float f18 = (rectF.top + rectF.bottom) / 2.0f;
            if (getMScanSource() == 3) {
                pointF = new android.graphics.PointF(f17 * getMeasuredWidth(), f18 * getMeasuredHeight());
            } else {
                android.graphics.Point m68781x1f993c8a = m68781x1f993c8a();
                pointF = new android.graphics.PointF(((getMeasuredWidth() - m68781x1f993c8a.x) / 2) + (m68781x1f993c8a.x * f17), ((getMeasuredHeight() - m68781x1f993c8a.y) / 2) + (m68781x1f993c8a.y * f18));
            }
            android.widget.ImageView imageView = this.M1;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("successMarkView");
                throw null;
            }
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80992x47bd9715);
            imageView.setVisibility(0);
            imageView.setPivotX(getSuccessMarkViewSize() / 2.0f);
            imageView.setPivotY(getSuccessMarkViewSize() / 2.0f);
            imageView.setTranslationX(pointF.x - (getSuccessMarkViewSize() / 2));
            imageView.setTranslationY(pointF.y - (getSuccessMarkViewSize() / 2));
            imageView.setScaleX(0.0f);
            imageView.setScaleY(0.0f);
            android.widget.ImageView imageView2 = this.M1;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("successMarkView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageView2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanAnimationHelper", "animateDefaultSuccessView", "(Landroid/view/View;Lcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            imageView2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(imageView2, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanAnimationHelper", "animateDefaultSuccessView", "(Landroid/view/View;Lcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            imageView2.setScaleX(0.0f);
            imageView2.setScaleY(0.0f);
            imageView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setListener(new c04.h(null)).setInterpolator(new android.view.animation.LinearInterpolator()).start();
            android.view.View view = this.I1;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maskView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "showSuccessView", "(FFLcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "showSuccessView", "(FFLcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "showSuccessView", "(FFLcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "showSuccessView", "(FFLcom/tencent/mm/plugin/scanner/view/ScanResultAnimationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView3 = this.L1;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                throw null;
            }
            imageView3.setVisibility(8);
            u(false);
            android.widget.TextView scanTips = getScanTips();
            if (scanTips != null) {
                scanTips.setAlpha(1.0f);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).g(new d04.o0(this));
        postDelayed(new d04.p0(this), 100L);
    }

    @Override // uy3.s
    /* renamed from: setBackgroundTransY */
    public void mo68748xb3438601(float f17) {
        android.view.View view = this.O1;
        if (view != null) {
            view.setTranslationY(f17);
        }
        android.widget.ImageView imageView = this.L1;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
            throw null;
        }
        imageView.setTranslationY(f17);
        android.widget.ImageView imageView2 = this.K1;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
            throw null;
        }
        imageView2.setTranslationY(f17);
        android.widget.ImageView imageView3 = this.J1;
        if (imageView3 != null) {
            imageView3.setTranslationY(f17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    /* renamed from: setBottomExtraHeight */
    public void mo68770x40a2edea(int i17) {
        super.mo68770x40a2edea(i17);
        post(new d04.q0(this));
    }

    @Override // uy3.s
    /* renamed from: setMarkViewTransY */
    public void mo68749xf3b9f565(float f17) {
        android.widget.ImageView imageView = this.M1;
        if (imageView != null) {
            imageView.setTranslationY(f17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("successMarkView");
            throw null;
        }
    }

    /* renamed from: setScanProductCallBack */
    public final void m68784x4e738a75(d04.h scanProductCallBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanProductCallBack, "scanProductCallBack");
        d04.j jVar = this.N1;
        if (jVar != null) {
            jVar.mo68822x4e738a75(new d04.r0(scanProductCallBack, this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
            throw null;
        }
    }

    /* renamed from: setScanProductOnItemClickListener */
    public final void m68785x1558ddda(d04.i listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        d04.j jVar = this.N1;
        if (jVar != null) {
            jVar.mo68823x1558ddda(listener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    public void t(boolean z17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.Y1;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.Y1 = db5.e1.Q(getContext(), "", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_q), false, true, onCancelListener);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.Y1;
        if (u3Var2 != null) {
            u3Var2.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb
    public void z(android.view.View view) {
        java.lang.Object systemService;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.z(view);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.l3s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.J1 = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.l3r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.L1 = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.jcb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.I1 = findViewById3;
        android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.f567940l44);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.K1 = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.f568266ma3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.M1 = (android.widget.ImageView) findViewById5;
        android.view.KeyEvent.Callback findViewById6 = view.findViewById(com.p314xaae8f345.mm.R.id.m_v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.N1 = (d04.j) findViewById6;
        if (this.Z1 == null && (systemService = getContext().getSystemService("vibrator")) != null) {
            this.Z1 = (android.os.Vibrator) systemService;
        }
        java.lang.Object obj = this.N1;
        if (obj == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
            throw null;
        }
        android.view.View view2 = (android.view.View) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "initScanProductListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "initScanProductListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object obj2 = this.N1;
        if (obj2 != null) {
            ((android.view.View) obj2).getViewTreeObserver().addOnGlobalLayoutListener(new d04.l0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17327x39ee10a4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.P1 = new android.view.animation.LinearInterpolator();
        this.Q1 = new android.view.animation.DecelerateInterpolator();
    }
}
