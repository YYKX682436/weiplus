package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/scanner/view/ScanTranslationMaskView;", "Lcom/tencent/mm/plugin/scanner/view/BaseScanMaskView;", "Lcom/tencent/mm/plugin/scanner/api/BaseScanRequest;", "Landroid/hardware/Camera$PreviewCallback;", "", "bottomHeight", "Ljz5/f0;", "setBottomExtraHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scan-translation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.scanner.view.ScanTranslationMaskView */
/* loaded from: classes13.dex */
public final class C17348x2dc83ba5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf<com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17264x215089a1> implements android.hardware.Camera.PreviewCallback {
    public long A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.l2 B;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f241450x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f241451y;

    /* renamed from: z, reason: collision with root package name */
    public final long[] f241452z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17348x2dc83ba5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.b
    public void g(android.animation.Animator.AnimatorListener animatorListener) {
        synchronized (java.lang.Boolean.valueOf(this.f241451y)) {
            this.f241451y = true;
        }
        e04.i3.a(this, 1.0f, 0.0f, 200L, animatorListener);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    public void k(int i17) {
        super.k(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationMaskView", "onNetworkChange state: %d, currentNetworkAvailable: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(getCurrentNetworkAvailable()));
        v();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    public void m(boolean z17) {
        super.m(z17);
        android.view.View view = this.f241450x;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureBtn");
            throw null;
        }
        view.setEnabled(true);
        this.f241452z[0] = java.lang.System.currentTimeMillis();
        setVisibility(0);
        if (getCurrentNetworkAvailable()) {
            e04.i3.a(this, 0.0f, 1.0f, 200L, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationMaskView", "onResume");
        this.f241452z[0] = java.lang.System.currentTimeMillis();
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationMaskView", "onPreviewFrame data size: %d", objArr);
        if (bArr == null) {
            return;
        }
        if (!(true ^ (bArr.length == 0)) || getScanCamera() == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("key_translate_yuv_byte_array", bArr);
        xy3.a scanCamera = getScanCamera();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scanCamera);
        bundle.putParcelable("key_translate_camera_resolution", scanCamera.f448195g);
        xy3.a scanCamera2 = getScanCamera();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(scanCamera2);
        bundle.putInt("key_translate_camera_rotation", scanCamera2.f448200l);
        bundle.putLong("key_translate_capture_time", this.A);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.l2 l2Var = this.B;
        if (l2Var != null) {
            l2Var.b(java.lang.System.currentTimeMillis(), bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    public void s() {
        super.s();
        synchronized (java.lang.Boolean.valueOf(this.f241451y)) {
            this.f241451y = false;
        }
        v();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf
    /* renamed from: setBottomExtraHeight */
    public void mo68770x40a2edea(int i17) {
        super.mo68770x40a2edea(i17);
        android.view.View view = this.f241450x;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureBtn");
            throw null;
        }
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureBtn");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i65.a.b(getContext(), 24) + getMBottomExtraHeight();
        }
        view.setLayoutParams(layoutParams);
    }

    public final void v() {
        if (getCurrentNetworkAvailable()) {
            android.view.View view = this.f241450x;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureBtn");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f241450x;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17348x2dc83ba5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f241452z = new long[2];
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.boz, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.m_b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f241450x = findViewById;
        findViewById.setEnabled(false);
        android.view.View view = this.f241450x;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.x0(this));
            this.B = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.l2(context);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureBtn");
            throw null;
        }
    }
}
