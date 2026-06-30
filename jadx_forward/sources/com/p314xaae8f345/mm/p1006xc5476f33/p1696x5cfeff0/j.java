package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f218755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f f218756e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f, java.util.HashMap hashMap) {
        this.f218756e = textureViewSurfaceTextureListenerC15528xde21bc5f;
        this.f218755d = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f218755d.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603)) {
            java.lang.String str = (java.lang.String) this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603);
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f = this.f218756e;
            android.widget.TextView textView = textureViewSurfaceTextureListenerC15528xde21bc5f.f218554f;
            if (textView != null && textView.getVisibility() == 4 && textureViewSurfaceTextureListenerC15528xde21bc5f.K.contains(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "showTopBusinessTips match tips: %s", str);
                textureViewSurfaceTextureListenerC15528xde21bc5f.f218554f.setVisibility(0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent tips:%s isVerifying:%s,prepareVerifying:%s", str, java.lang.Boolean.valueOf(this.f218756e.f218570y), java.lang.Boolean.valueOf(this.f218756e.f218569x));
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f2 = this.f218756e;
            if (textureViewSurfaceTextureListenerC15528xde21bc5f2.f218568w == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE || (!textureViewSurfaceTextureListenerC15528xde21bc5f2.f218570y && !textureViewSurfaceTextureListenerC15528xde21bc5f2.f218569x)) {
                textureViewSurfaceTextureListenerC15528xde21bc5f2.f218565t.a(textureViewSurfaceTextureListenerC15528xde21bc5f2.f218553e, str);
            }
        }
        if (this.f218755d.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent actions:" + this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641));
            if (java.util.Objects.equals(this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61527x98b092bc)) {
                vz2.c.d().f137704m = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f3 = this.f218756e;
                textureViewSurfaceTextureListenerC15528xde21bc5f3.G = 0L;
                textureViewSurfaceTextureListenerC15528xde21bc5f3.f218552d.m63490x3ae760af(0.0f);
                this.f218756e.g();
                this.f218756e.f218563r.a();
                this.f218756e.f218558m.setVisibility(4);
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f4 = this.f218756e;
                textureViewSurfaceTextureListenerC15528xde21bc5f4.f(textureViewSurfaceTextureListenerC15528xde21bc5f4.f218553e, i65.a.r(textureViewSurfaceTextureListenerC15528xde21bc5f4.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f81518x8f35ca0c));
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f218756e.f218557i.getLayoutParams();
                layoutParams.topMargin = (int) (this.f218756e.f218552d.m63486x6c781953() - (i65.a.h(this.f218756e.f218564s, com.p314xaae8f345.mm.R.C30860x5b28f31.f561928wq) / 2));
                this.f218756e.f218557i.setLayoutParams(layoutParams);
                this.f218756e.f218557i.setVisibility(0);
                this.f218756e.f218560o.setBackgroundColor(android.graphics.Color.parseColor("#80000000"));
                android.view.View view = this.f218756e.f218560o;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (java.util.Objects.equals(this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61536x95f0ace3)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f5 = this.f218756e;
                int i17 = textureViewSurfaceTextureListenerC15528xde21bc5f5.C + 1;
                textureViewSurfaceTextureListenerC15528xde21bc5f5.C = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "STAGE_NOTPASS %s", java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f6 = this.f218756e;
                if (textureViewSurfaceTextureListenerC15528xde21bc5f6.C > 10) {
                    if (textureViewSurfaceTextureListenerC15528xde21bc5f6.f218569x && textureViewSurfaceTextureListenerC15528xde21bc5f6.A) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "prepareVerifying and out rect time:%s", java.lang.Integer.valueOf(textureViewSurfaceTextureListenerC15528xde21bc5f6.B));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f7 = this.f218756e;
                        int i18 = textureViewSurfaceTextureListenerC15528xde21bc5f7.B + 1;
                        textureViewSurfaceTextureListenerC15528xde21bc5f7.B = i18;
                        if (i18 >= 4) {
                            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120763xed82fe04(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, null);
                            this.f218756e.g();
                            this.f218756e.f218563r.a();
                            vz2.c.b().B = 6;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f8 = this.f218756e;
                            textureViewSurfaceTextureListenerC15528xde21bc5f8.f218562q.a7(((tz2.e) textureViewSurfaceTextureListenerC15528xde21bc5f8.f218565t).f(i65.a.r(textureViewSurfaceTextureListenerC15528xde21bc5f8.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572699c71), 90031).toString());
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f9 = this.f218756e;
                    if (!textureViewSurfaceTextureListenerC15528xde21bc5f9.f218570y && textureViewSurfaceTextureListenerC15528xde21bc5f9.A) {
                        textureViewSurfaceTextureListenerC15528xde21bc5f9.f218559n.setVisibility(4);
                        android.view.View view2 = this.f218756e.f218560o;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(4);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f218756e.setOnClickListener(null);
                        this.f218756e.e(wz2.a.c(this.f218756e.f218564s, (java.lang.String) this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603)));
                        this.f218756e.f218569x = false;
                    }
                    this.f218756e.A = false;
                }
            } else if (java.util.Objects.equals(this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2)) {
                vz2.c.l("faceRecognized");
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f10 = this.f218756e;
                textureViewSurfaceTextureListenerC15528xde21bc5f10.C = 0;
                textureViewSurfaceTextureListenerC15528xde21bc5f10.A = true;
                if (!textureViewSurfaceTextureListenerC15528xde21bc5f10.f218569x) {
                    textureViewSurfaceTextureListenerC15528xde21bc5f10.f218569x = true;
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = textureViewSurfaceTextureListenerC15528xde21bc5f10.f218568w;
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE;
                    if (ytSDKKitFrameworkWorkMode == ytSDKKitFrameworkWorkMode2 && textureViewSurfaceTextureListenerC15528xde21bc5f10.f218558m.getChildCount() == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f11 = this.f218756e;
                        textureViewSurfaceTextureListenerC15528xde21bc5f11.f218558m.m63492x3a011788(((tz2.i) textureViewSurfaceTextureListenerC15528xde21bc5f11.f218565t).G);
                        this.f218756e.f218558m.measure(0, 0);
                        int m63486x6c781953 = ((int) this.f218756e.f218552d.m63486x6c781953()) - (this.f218756e.f218558m.getMeasuredHeight() / 2);
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f218756e.f218558m.getLayoutParams();
                        layoutParams2.width = ((int) ((this.f218756e.getWidth() * com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15539x128d01d6.f218789q) * 2.0f)) - i65.a.h(this.f218756e.f218564s, com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
                        layoutParams2.topMargin = m63486x6c781953;
                        this.f218756e.f218558m.setLayoutParams(layoutParams2);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f12 = this.f218756e;
                    textureViewSurfaceTextureListenerC15528xde21bc5f12.f(textureViewSurfaceTextureListenerC15528xde21bc5f12.f218553e, i65.a.r(textureViewSurfaceTextureListenerC15528xde21bc5f12.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f81499x6786c610));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f13 = this.f218756e;
                    textureViewSurfaceTextureListenerC15528xde21bc5f13.f218565t.b(textureViewSurfaceTextureListenerC15528xde21bc5f13.f218553e);
                    if (textureViewSurfaceTextureListenerC15528xde21bc5f13.f218568w == ytSDKKitFrameworkWorkMode2) {
                        textureViewSurfaceTextureListenerC15528xde21bc5f13.f218560o.setBackgroundColor(android.graphics.Color.parseColor("#99000000"));
                        android.view.View view3 = textureViewSurfaceTextureListenerC15528xde21bc5f13.f218560o;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "dealFaceStatePass", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "dealFaceStatePass", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textureViewSurfaceTextureListenerC15528xde21bc5f13.f218559n.setVisibility(0);
                        vz2.c.m(6);
                        textureViewSurfaceTextureListenerC15528xde21bc5f13.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.i(textureViewSurfaceTextureListenerC15528xde21bc5f13));
                    }
                    if (textureViewSurfaceTextureListenerC15528xde21bc5f13.f218569x) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "start face verity.");
                        vz2.c.m(3);
                        vz2.c.j("sdkVerify");
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode3 = textureViewSurfaceTextureListenerC15528xde21bc5f13.f218568w;
                        if (ytSDKKitFrameworkWorkMode3 != ytSDKKitFrameworkWorkMode2) {
                            if (ytSDKKitFrameworkWorkMode3 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                                vz2.c.m(7);
                            } else if (ytSDKKitFrameworkWorkMode3 == com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE) {
                                vz2.c.m(5);
                            }
                            vz2.c.b().f137728t = java.lang.System.currentTimeMillis();
                            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120763xed82fe04(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS, null);
                            textureViewSurfaceTextureListenerC15528xde21bc5f13.f218570y = true;
                            textureViewSurfaceTextureListenerC15528xde21bc5f13.f218566u.e();
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "prepareVerifying = false ,face not in rect.");
                    }
                }
            }
        }
        if (this.f218755d.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d) && this.f218756e.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:" + this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d));
            this.f218756e.N.cancel();
            this.f218756e.g();
            this.f218756e.f218570y = false;
            if (!java.util.Objects.equals(this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22)) {
                if (!java.util.Objects.equals(this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:UNKNOWN ,param:%s", this.f218755d);
                    this.f218756e.f218562q.a7((java.lang.String) this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7));
                    return;
                }
                java.util.HashMap hashMap = this.f218755d;
                vz2.c.k("sdkResult", java.lang.Integer.valueOf(hashMap.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4) ? ((java.lang.Integer) hashMap.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4)).intValue() : -1));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:FAILED ,param:%s", this.f218755d);
                if (wz2.a.g(this.f218755d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61524x21f021e4)) {
                    wz2.a.i(this.f218755d, i65.a.r(this.f218756e.f218564s, com.p314xaae8f345.mm.R.C30867xcad56011.f572706c81));
                } else if (wz2.a.g(this.f218755d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61513xf74540ee)) {
                    wz2.a.i(this.f218755d, i65.a.r(this.f218756e.f218564s, com.p314xaae8f345.mm.R.C30867xcad56011.f81517x9a9e6cc4));
                } else if (wz2.a.g(this.f218755d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, 4194304) && this.f218755d.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7).toString());
                        if ((jSONObject.optString("errormsg").equals(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61574x745f7a2) || jSONObject.optString("errormsg").equals(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61572x9f190f25)) && !this.f218756e.H) {
                            vz2.c.b().f137720l++;
                            this.f218756e.f218563r.f218773a.getClass();
                            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120769x6761d4f();
                            this.f218756e.a();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f14 = this.f218756e;
                            textureViewSurfaceTextureListenerC15528xde21bc5f14.f(textureViewSurfaceTextureListenerC15528xde21bc5f14.f218553e, i65.a.r(textureViewSurfaceTextureListenerC15528xde21bc5f14.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f81501xf4eda2fd));
                            return;
                        }
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerError", "get message error,message:%s", this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7));
                    }
                }
                wz2.a.h(this.f218756e.getContext(), this.f218755d);
                this.f218756e.f218562q.a7((java.lang.String) this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7));
                return;
            }
            vz2.c.j("sdkResult");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onFrameworkEvent result:SUCCEED ,param:%s", this.f218755d);
            final tz2.j jVar = this.f218756e.f218566u;
            synchronized (jVar) {
                try {
                    if (jVar.f504818b) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerRecorder", "sendRequestUploadVideoAfterStop wait for stop finish");
                        jVar.f504825i = new java.lang.Runnable() { // from class: tz2.j$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                tz2.j jVar2 = tz2.j.this;
                                jVar2.f504827k.m77784x795fa299(new tz2.RunnableC30261x30bb38(jVar2, "sendRequestUploadVideoAfterStop runnable exec"));
                            }
                        };
                    } else {
                        jVar.f504827k.m77784x795fa299(new tz2.RunnableC30261x30bb38(jVar, "sendRequestUploadVideoAfterStop directly"));
                    }
                } finally {
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f15 = this.f218756e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547 viewOnClickListenerC15531xcd76b547 = textureViewSurfaceTextureListenerC15528xde21bc5f15.f218562q;
            java.lang.String str2 = (java.lang.String) this.f218755d.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "[%s]FaceFlashActivity showSuccessLayout", java.lang.Integer.valueOf(viewOnClickListenerC15531xcd76b547.hashCode()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f16 = viewOnClickListenerC15531xcd76b547.f218584d;
            if (textureViewSurfaceTextureListenerC15528xde21bc5f16.f218567v.isShowing()) {
                textureViewSurfaceTextureListenerC15528xde21bc5f16.f218567v.dismiss();
            }
            viewOnClickListenerC15531xcd76b547.f218589i = str2;
            vz2.c.g(str2);
            viewOnClickListenerC15531xcd76b547.Z6(i65.a.d(viewOnClickListenerC15531xcd76b547.mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                if (jSONObject2.optBoolean("selfHandle", false)) {
                    try {
                        viewOnClickListenerC15531xcd76b547.V6(new org.json.JSONObject(str2));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManager", e17, "", new java.lang.Object[0]);
                    }
                } else {
                    viewOnClickListenerC15531xcd76b547.f218584d.setVisibility(8);
                    viewOnClickListenerC15531xcd76b547.f218584d.b();
                    viewOnClickListenerC15531xcd76b547.f218585e.setVisibility(0);
                    viewOnClickListenerC15531xcd76b547.f218585e.a();
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.u(viewOnClickListenerC15531xcd76b547, jSONObject2);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(uVar, 1000L, false);
                }
                r2 = true;
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e18, "parse face success result error.%s", str2);
            }
            textureViewSurfaceTextureListenerC15528xde21bc5f15.f218571z = r2;
        }
    }
}
