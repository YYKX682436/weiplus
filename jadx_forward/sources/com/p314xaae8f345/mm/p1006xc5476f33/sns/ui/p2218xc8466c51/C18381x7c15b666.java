package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2218xc8466c51;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout;", "", "getLayoutId", "Landroid/view/View;", "C", "Ljz5/g;", "getOpBtnArea", "()Landroid/view/View;", "opBtnArea", "Lcom/tencent/mm/media/camera/view/CameraKitView;", "D", "getCameraView", "()Lcom/tencent/mm/media/camera/view/CameraKitView;", "cameraView", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad, "getRecordButton", "recordButton", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout */
/* loaded from: classes10.dex */
public final class C18381x7c15b666 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e {

    /* renamed from: C, reason: from kotlin metadata */
    public final jz5.g opBtnArea;

    /* renamed from: D, reason: from kotlin metadata */
    public final jz5.g cameraView;

    /* renamed from: E, reason: from kotlin metadata */
    public final jz5.g recordButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18381x7c15b666(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.opBtnArea = jz5.h.b(new vd4.b(this));
        this.cameraView = jz5.h.b(new vd4.a(this));
        this.recordButton = jz5.h.b(new vd4.c(this));
        G();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e
    public boolean D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableRecordVideoFullScreen", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableRecordVideoFullScreen", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return false;
    }

    public final void G() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        na4.a aVar = na4.g.f417523b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        if (aVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "initViewWithResolutionRadioConfig: radioConfig=" + aVar);
            int h17 = com.p314xaae8f345.mm.ui.bl.h(getContext()) + i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWillShowBehindStatusBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWillShowBehindStatusBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            if (aVar.f417521b) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateOpButtonShowInsideCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396 m71193x76530f60 = m71193x76530f60();
                android.view.ViewGroup.LayoutParams layoutParams2 = m71193x76530f60 != null ? m71193x76530f60.getLayoutParams() : null;
                android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams3 != null) {
                    layoutParams3.removeRule(3);
                    layoutParams3.addRule(10);
                    com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396 m71193x76530f602 = m71193x76530f60();
                    if (m71193x76530f602 != null) {
                        m71193x76530f602.setLayoutParams(layoutParams3);
                    }
                }
                android.view.View m71194x2b180132 = m71194x2b180132();
                android.view.ViewGroup.LayoutParams layoutParams4 = m71194x2b180132 != null ? m71194x2b180132.getLayoutParams() : null;
                layoutParams = layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams != null) {
                    com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396 m71193x76530f603 = m71193x76530f60();
                    layoutParams.addRule(6, m71193x76530f603 != null ? m71193x76530f603.getId() : 0);
                    android.view.View m71194x2b1801322 = m71194x2b180132();
                    if (m71194x2b1801322 != null) {
                        m71194x2b1801322.setLayoutParams(layoutParams);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateOpButtonShowInsideCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                J(h17);
                H(true);
            } else {
                J(h17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateOpButtonShowAboveCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                android.view.View m71194x2b1801323 = m71194x2b180132();
                android.view.ViewGroup.LayoutParams layoutParams5 = m71194x2b1801323 != null ? m71194x2b1801323.getLayoutParams() : null;
                android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.removeRule(6);
                    android.view.View m71194x2b1801324 = m71194x2b180132();
                    if (m71194x2b1801324 != null) {
                        m71194x2b1801324.setLayoutParams(layoutParams6);
                    }
                }
                com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396 m71193x76530f604 = m71193x76530f60();
                android.view.ViewGroup.LayoutParams layoutParams7 = m71193x76530f604 != null ? m71193x76530f604.getLayoutParams() : null;
                layoutParams = layoutParams7 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams7 : null;
                if (layoutParams != null) {
                    layoutParams.removeRule(10);
                    android.view.View m71194x2b1801325 = m71194x2b180132();
                    layoutParams.addRule(3, m71194x2b1801325 != null ? m71194x2b1801325.getId() : 0);
                    com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396 m71193x76530f605 = m71193x76530f60();
                    if (m71193x76530f605 != null) {
                        m71193x76530f605.setLayoutParams(layoutParams);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateOpButtonShowAboveCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                H(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWillShowBehindNavigationBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWillShowBehindNavigationBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            if (aVar.f417520a) {
                I(true);
            } else {
                I(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    public final void H(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCameraMaskView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565072b55);
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCameraMaskView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    public final void I(boolean z17) {
        int h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCaptureLayout", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        android.view.View m71195xb1d7d159 = m71195xb1d7d159();
        android.view.ViewGroup.LayoutParams layoutParams = m71195xb1d7d159 != null ? m71195xb1d7d159.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            int i17 = na4.g.f417524c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd) + i17;
        } else {
            h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd);
        }
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = h17;
        }
        android.view.View m71195xb1d7d1592 = m71195xb1d7d159();
        if (m71195xb1d7d1592 != null) {
            m71195xb1d7d1592.setLayoutParams(layoutParams2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "updateCaptureLayout: willShowBehindNavigationBar:" + z17 + ", bottomMargin:" + h17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCaptureLayout", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    public final void J(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateOpButtonLayoutParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        android.view.View m71194x2b180132 = m71194x2b180132();
        android.view.ViewGroup.LayoutParams layoutParams = m71194x2b180132 != null ? m71194x2b180132.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = i17;
            android.view.View m71194x2b1801322 = m71194x2b180132();
            if (m71194x2b1801322 != null) {
                m71194x2b1801322.setLayoutParams(layoutParams2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateOpButtonLayoutParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    /* renamed from: getCameraView */
    public final com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396 m71193x76530f60() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCameraView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396 c10897xb8eb1396 = (com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396) ((jz5.n) this.cameraView).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCameraView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return c10897xb8eb1396;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e
    /* renamed from: getLayoutId */
    public int mo67947x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.crs;
    }

    /* renamed from: getOpBtnArea */
    public final android.view.View m71194x2b180132() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpBtnArea", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        android.view.View view = (android.view.View) ((jz5.n) this.opBtnArea).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpBtnArea", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return view;
    }

    /* renamed from: getRecordButton */
    public final android.view.View m71195xb1d7d159() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecordButton", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        android.view.View view = (android.view.View) ((jz5.n) this.recordButton).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecordButton", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17023x788598b, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void m(it3.y navigator, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLogic", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigator, "navigator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "initLogic: ");
        super.m(navigator, configProvider);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateRecordVideoParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = configProvider.f237209n;
        c11120x15dce88d.f152725e = (c11120x15dce88d.f152724d * 16) / 9;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "updateRecordVideoParams width:" + c11120x15dce88d.f152724d + " height:" + c11120x15dce88d.f152725e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateRecordVideoParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLogic", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        super.onConfigurationChanged(configuration);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged: orientation=");
        sb6.append(configuration != null ? java.lang.Integer.valueOf(configuration.orientation) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", sb6.toString());
        android.view.View m71195xb1d7d159 = m71195xb1d7d159();
        if (m71195xb1d7d159 != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.g3 a17 = n3.b1.a(m71195xb1d7d159);
            e3.d a18 = a17 != null ? a17.a(2) : null;
            if (a18 != null) {
                i17 = a18.f328580d;
                na4.g gVar = na4.g.f417522a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                na4.a a19 = gVar.a(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                na4.g.f417523b = a19;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                G();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
            }
        }
        i17 = -1;
        na4.g gVar2 = na4.g.f417522a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        na4.a a192 = gVar2.a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        na4.g.f417523b = a192;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        G();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17023x788598b, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "onResume: ");
        super.mo11001x57429eec();
        mo9066x6761d4f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }
}
