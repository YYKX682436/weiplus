package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class h implements com.tencent.mm.plugin.appbrand.widget.m {

    /* renamed from: a, reason: collision with root package name */
    public int f87464a;

    /* renamed from: b, reason: collision with root package name */
    public int f87465b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Point f87466c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.i f87467d;

    public h(com.tencent.mm.plugin.appbrand.pip.i iVar, com.tencent.mm.plugin.appbrand.pip.e eVar) {
        this.f87467d = iVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.m
    public void a(int i17, int i18) {
        int i19;
        int i27;
        com.tencent.mm.plugin.appbrand.pip.i iVar = this.f87467d;
        java.lang.String str = iVar.f87471a;
        if (iVar.f87479i) {
            com.tencent.mars.xlog.Log.i(this.f87467d.f87471a, "onStablePositionChange, onVideoPositionGot, released");
            return;
        }
        int videoWidth = this.f87467d.f87476f.getVideoWidth();
        if (videoWidth == 0) {
            videoWidth = -1;
        }
        int videoHeight = this.f87467d.f87476f.getVideoHeight();
        if (videoHeight == 0) {
            videoHeight = -1;
        }
        int i28 = this.f87467d.f87475e.i();
        int k17 = this.f87467d.f87475e.k();
        if (this.f87466c == null) {
            this.f87466c = this.f87467d.b();
        }
        android.graphics.Point point = this.f87466c;
        if (point == null) {
            com.tencent.mars.xlog.Log.w(this.f87467d.f87471a, "MyOnStablePositionChangeListener, null == mWebView2PipContainerParentOffset");
            return;
        }
        int i29 = this.f87464a;
        int i37 = this.f87465b + point.y;
        com.tencent.mars.xlog.Log.i(this.f87467d.f87471a, "MyOnStablePositionChangeListener, originVideoPosX: %d, originVideoPosY: %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
        com.tencent.mm.plugin.appbrand.pip.i iVar2 = this.f87467d;
        iVar2.getClass();
        boolean z17 = true;
        boolean z18 = (-1 == videoWidth || -1 == videoHeight) ? false : true;
        if (!z18 ? i28 < k17 : videoWidth < videoHeight) {
            z17 = false;
        }
        if (z17) {
            iVar2.f87495y = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.K;
            iVar2.f87496z = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.L;
            i19 = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.M;
            i27 = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.N;
        } else {
            iVar2.f87495y = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.P;
            iVar2.f87496z = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.Q;
            i19 = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.R;
            i27 = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.S;
        }
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = iVar2.f87473c;
        int stablePosX = appBrandPipContainerView.getStablePosX();
        int stablePosY = appBrandPipContainerView.getStablePosY();
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(stablePosX), java.lang.Integer.valueOf(stablePosY)};
        java.lang.String str2 = iVar2.f87471a;
        com.tencent.mars.xlog.Log.i(str2, "calculateStablePipContainerSizeAndPosition, stablePosX: %d, stablePosY: %d", objArr);
        iVar2.A = java.lang.Math.min(java.lang.Math.max(0, stablePosX), iVar2.f87480j - iVar2.f87495y);
        iVar2.B = java.lang.Math.min(java.lang.Math.max(0, stablePosY), iVar2.f87481k - iVar2.f87496z);
        com.tencent.mars.xlog.Log.i(str2, "calculateStablePipContainerSizeAndPosition, mEndPipContainerPosX: %d, mEndPipContainerPosY: %d", java.lang.Integer.valueOf(iVar2.A), java.lang.Integer.valueOf(iVar2.B));
        if (!z18) {
            videoWidth = i28;
            videoHeight = k17;
        }
        if ((i19 + 0.0f) / videoWidth >= (i27 + 0.0f) / videoHeight) {
            iVar2.C = i19;
            iVar2.D = (int) java.lang.Math.ceil(r0 * r3);
        } else {
            iVar2.C = (int) java.lang.Math.ceil(r12 * r1);
            iVar2.D = i27;
        }
        iVar2.f87487q = i28;
        iVar2.f87488r = k17;
        float f17 = iVar2.f87496z;
        int i38 = (int) (((f17 + 0.0f) / iVar2.D) * k17);
        iVar2.f87484n = i38;
        float f18 = iVar2.f87495y;
        int i39 = (int) (((f18 + 0.0f) / iVar2.C) * i28);
        iVar2.f87483m = i39;
        iVar2.C = i19;
        iVar2.D = i27;
        float f19 = (i39 + 0.0f) / f18;
        float f27 = (i38 + 0.0f) / f17;
        int min = java.lang.Math.min(java.lang.Math.max(i29, -i39), iVar2.f87480j);
        int min2 = java.lang.Math.min(java.lang.Math.max(i37, -iVar2.f87484n), iVar2.f87481k);
        if (z18) {
            iVar2.f87485o = min - ((int) ((f19 * (iVar2.f87495y - i19)) / 2.0f));
            iVar2.f87486p = min2 - ((int) (((iVar2.f87496z - i27) * f27) / 2.0f));
        } else {
            int i47 = iVar2.f87487q;
            iVar2.f87485o = (min + ((i28 - i47) / 2)) - ((iVar2.f87483m - i47) / 2);
            int i48 = iVar2.f87488r;
            iVar2.f87486p = (min2 + ((k17 - i48) / 2)) - ((iVar2.f87484n - i48) / 2);
        }
        iVar2.f87489s = (int) java.lang.Math.ceil((iVar2.f87483m - iVar2.f87487q) * 0.5f);
        iVar2.f87490t = (int) java.lang.Math.ceil((iVar2.f87484n - iVar2.f87488r) * 0.4f);
        iVar2.f87491u = (int) java.lang.Math.ceil((iVar2.f87484n - iVar2.f87488r) * 0.6f);
        iVar2.f87492v = (int) (iVar2.H * f27);
        iVar2.f87493w = (int) (iVar2.I * f27);
        iVar2.f87494x = (int) (f27 * iVar2.f87470J);
    }
}
