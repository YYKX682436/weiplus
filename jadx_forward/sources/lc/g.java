package lc;

/* loaded from: classes14.dex */
public final class g extends lc.i {
    public final com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde B;

    /* renamed from: e, reason: collision with root package name */
    public oc.a f399340e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f399341f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f399342g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f399343h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f399344i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f399345m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2935x453a187d f399346n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 f399347o;

    /* renamed from: t, reason: collision with root package name */
    public pc.o f399352t;

    /* renamed from: u, reason: collision with root package name */
    public volatile com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151 f399353u;

    /* renamed from: v, reason: collision with root package name */
    public android.hardware.Camera.Size f399354v;

    /* renamed from: w, reason: collision with root package name */
    public qc.b f399355w;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f399348p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f399349q = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f399350r = false;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f399351s = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f399356x = false;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f399357y = false;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f399358z = false;
    public int A = 0;

    public g() {
        int i17 = ic.d.f371814k;
        ic.d dVar = ic.c.f371813a;
        this.B = dVar.e();
        dVar.getClass();
    }

    public final void c(int i17, int i18) {
        if (!this.f399353u.m21564xbd067eae(i17, i18)) {
            mc.p.f407064a.e("AuthingFragment", "failed to set resolution.");
        }
        mc.p.f407064a.b("AuthingFragment", ">>>start camera preview(get light data ok)");
        a(new java.lang.Runnable() { // from class: lc.g$$j
            @Override // java.lang.Runnable
            public final void run() {
                android.view.SurfaceHolder surfaceHolder;
                lc.g gVar = lc.g.this;
                java.lang.Object obj = gVar.f399340e;
                if (obj != null && (obj instanceof android.view.View)) {
                    android.view.View view = (android.view.View) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/cloud/huiyan/fragments/f", "g", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/cloud/huiyan/fragments/f", "g", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.p314xaae8f345.p318x5a5de35.p337x3c29f010.p338xcc985031.p339x373aa5.SurfaceHolderCallbackC2937x5b120033 surfaceHolderCallbackC2937x5b120033 = (com.p314xaae8f345.p318x5a5de35.p337x3c29f010.p338xcc985031.p339x373aa5.SurfaceHolderCallbackC2937x5b120033) gVar.f399340e;
                    com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151 c2888xbf192151 = surfaceHolderCallbackC2937x5b120033.f127466m;
                    if (c2888xbf192151 != null && (surfaceHolder = surfaceHolderCallbackC2937x5b120033.f127465i) != null) {
                        c2888xbf192151.m21565xe5056506(surfaceHolder);
                    }
                    try {
                        java.lang.Class<?> cls = java.lang.Class.forName("com.tencent.turingcam.view.TuringPreviewDisplay");
                        if (cls.isInstance(gVar.f399340e)) {
                            android.view.TextureView textureView = (android.view.TextureView) cls.getMethod("getChildAt", java.lang.Integer.TYPE).invoke(cls.cast(gVar.f399340e), 0);
                            if (textureView != null) {
                                int i19 = ic.d.f371814k;
                                ic.c.f371813a.getClass();
                                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21753xdc255729(textureView);
                            } else {
                                mc.p.f407064a.b("AuthingFragment", "currentTexture view is null.");
                            }
                        } else {
                            mc.q qVar = mc.p.f407064a;
                            oc.a aVar = gVar.f399340e;
                            qVar.e("AuthingFragment", "cameraDateGatherView is not instance of TuringPreviewDisplay: ".concat(aVar != null ? aVar.getClass().getName() : "null"));
                        }
                    } catch (java.lang.ClassNotFoundException e17) {
                        mc.p.f407064a.e("AuthingFragment", "TuringPreviewDisplay not found: " + e17.getLocalizedMessage());
                    } catch (java.lang.Exception e18) {
                        mc.p.f407064a.e("AuthingFragment", "Error accessing TuringPreviewDisplay methods: " + e18.getLocalizedMessage());
                    }
                }
                gVar.f399350r = true;
            }
        });
    }

    @Override // android.app.Fragment
    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        mc.p.f407064a.b("AuthingFragment", "on attach.");
    }

    @Override // lc.i, android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i17;
        boolean z17;
        mc.q qVar = mc.p.f407064a;
        qVar.e("AuthingFragment", "onCreateView!");
        if (this.f399377d == null) {
            int i18 = ic.d.f371814k;
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = ic.c.f371813a.f371823i;
            if (c2920x9dce3f52 == null || !c2920x9dce3f52.m21848x704df978()) {
                i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.eq8;
                z17 = false;
            } else {
                i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.eq9;
                z17 = true;
            }
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde = this.B;
            if (c2919x968bacde != null && !z17 && c2919x968bacde.m21779x38fe9bd3() != -1) {
                i17 = this.B.m21779x38fe9bd3();
            }
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde2 = this.B;
            if (c2919x968bacde2 != null && z17 && c2919x968bacde2.m21784x767f5968() != -1) {
                i17 = this.B.m21784x767f5968();
            }
            android.view.View inflate = layoutInflater.inflate(i17, viewGroup, false);
            this.f399377d = inflate;
            this.f399340e = (oc.a) inflate.findViewById(com.p314xaae8f345.mm.R.id.vjr);
            this.f399377d.findViewById(com.p314xaae8f345.mm.R.id.vjt).setOnClickListener(new android.view.View.OnClickListener() { // from class: lc.g$$e
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lc.g gVar = lc.g.this;
                    gVar.getClass();
                    mc.p.f407064a.b("AuthingFragment", "user cancel the auth check.");
                    java.lang.String string = gVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.piu);
                    int i19 = ic.d.f371814k;
                    ic.c.f371813a.getClass();
                    pc.l.f434744a.f434745a.name();
                    mc.k.f407058a.a();
                    pc.o oVar = gVar.f399352t;
                    if (oVar != null) {
                        oVar.a();
                    }
                    mc.d.f407048a.f407031b = null;
                    pc.f.c(212, string);
                }
            });
            this.f399341f = (android.widget.ImageView) this.f399377d.findViewById(com.p314xaae8f345.mm.R.id.vjs);
            this.f399342g = (android.widget.TextView) this.f399377d.findViewById(com.p314xaae8f345.mm.R.id.vjo);
            this.f399343h = (android.widget.TextView) this.f399377d.findViewById(com.p314xaae8f345.mm.R.id.vjn);
            this.f399347o = (com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39) this.f399377d.findViewById(com.p314xaae8f345.mm.R.id.vjq);
            this.f399344i = (android.widget.TextView) this.f399377d.findViewById(com.p314xaae8f345.mm.R.id.vjv);
            this.f399345m = (android.widget.TextView) this.f399377d.findViewById(com.p314xaae8f345.mm.R.id.vjt);
            pc.o oVar = new pc.o();
            this.f399352t = oVar;
            android.widget.TextView textView = this.f399343h;
            oVar.f434751e.clear();
            oVar.f434749c = textView;
            if (oVar.f434747a == null) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("showTips");
                oVar.f434747a = handlerThread;
                handlerThread.start();
                oVar.f434748b = new pc.n(oVar, oVar.f434747a.getLooper());
                if (oVar.f434748b != null) {
                    try {
                        android.os.Message obtainMessage = oVar.f434748b.obtainMessage();
                        obtainMessage.what = 1;
                        oVar.f434748b.sendMessageDelayed(obtainMessage, 1000L);
                    } catch (java.lang.Exception e17) {
                        mc.p.f407064a.e("ShowTipsHelper", "failed to send wait extra tips event" + e17.getLocalizedMessage());
                    }
                }
            }
            this.f399342g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.piz);
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2934x94cfb39f c2934x94cfb39f = (com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2934x94cfb39f) this.f399377d.findViewById(com.p314xaae8f345.mm.R.id.vjl);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c2934x94cfb39f, arrayList.toArray(), "com/tencent/cloud/huiyan/fragments/f", "d", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c2934x94cfb39f.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c2934x94cfb39f, "com/tencent/cloud/huiyan/fragments/f", "d", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f399356x = false;
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2935x453a187d c2935x453a187d = (com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2935x453a187d) this.f399377d.findViewById(com.p314xaae8f345.mm.R.id.vjp);
            this.f399346n = c2935x453a187d;
            c2935x453a187d.setBackgroundColor(b().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ane));
            if (this.f399340e instanceof android.view.View) {
                if (this.f399350r) {
                    if (this.f399341f != null) {
                        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde3 = this.B;
                        if (c2919x968bacde3 == null || !c2919x968bacde3.m21790xfd0be3b6()) {
                            this.f399341f.setScaleX(0.935f);
                            this.f399341f.setScaleY(0.935f);
                            this.f399341f.setVisibility(0);
                            this.f399341f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_6);
                        } else {
                            this.f399341f.setVisibility(8);
                        }
                    }
                    android.view.View view = (android.view.View) this.f399340e;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/cloud/huiyan/fragments/f", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/cloud/huiyan/fragments/f", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    this.f399341f.setVisibility(0);
                    android.view.View view2 = (android.view.View) this.f399340e;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/cloud/huiyan/fragments/f", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/cloud/huiyan/fragments/f", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            mc.d.f407048a.f407031b = new lc.e(this);
            oc.h hVar = oc.g.f425634a;
            if (!hVar.f425640f || hVar.f425638d == null) {
                qVar.e("TuringSdkHelper", "init turing sdk logic, turing is not create!");
            } else {
                hVar.f425635a = false;
                oc.e eVar = new oc.e();
                if (!hVar.f425640f || hVar.f425638d == null) {
                    qVar.e("TuringSdkHelper", "set event listener, turing is not create!");
                } else {
                    hVar.f425638d.f425633a = eVar;
                }
                hVar.f425639e = new mc.r();
            }
            pc.c.f434735a.f434736a = new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2908x217bf10e(20, "FrameCreatePool");
            pc.a.f434733a.f434734a = new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2908x217bf10e(10, "ChangeBytePool");
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde4 = this.B;
            if (c2919x968bacde4 != null) {
                if (this.f399346n != null && c2919x968bacde4.m21778xa639fa16() != 0) {
                    this.f399346n.setBackgroundColor(this.B.m21778xa639fa16());
                }
                if (this.f399342g != null && this.B.m21783xc651390e() != 0) {
                    this.f399342g.setTextColor(this.B.m21783xc651390e());
                }
                if (this.f399343h != null && this.B.m21782xaa77865d() != 0) {
                    this.f399343h.setTextColor(this.B.m21782xaa77865d());
                }
                if (this.B.m21797xb1647dd9()) {
                    android.widget.TextView textView2 = this.f399345m;
                    if (textView2 != null) {
                        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) textView2.getLayoutParams();
                        layoutParams.topMargin = java.lang.Math.round(this.f399345m.getResources().getDisplayMetrics().density * this.B.m21788xc07ce43d()) + layoutParams.topMargin;
                        this.f399345m.setLayoutParams(layoutParams);
                    }
                    android.widget.TextView textView3 = this.f399344i;
                    if (textView3 != null) {
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) textView3.getLayoutParams();
                        layoutParams2.topMargin = java.lang.Math.round(this.f399344i.getResources().getDisplayMetrics().density * this.B.m21788xc07ce43d()) + layoutParams2.topMargin;
                        this.f399344i.setLayoutParams(layoutParams2);
                    }
                }
            }
            android.app.Activity activity = getActivity();
            if (activity == null) {
                qVar.e("AuthingFragment", "activity is null!");
            } else {
                nc.c cVar = nc.b.f417624a;
                java.lang.String[] strArr = pc.k.f434743a;
                lc.a aVar = new lc.a(this);
                cVar.f417625a = aVar;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                if (activity.checkSelfPermission(strArr[0]) != 0) {
                    arrayList4.add(strArr[0]);
                }
                java.lang.String[] strArr2 = (java.lang.String[]) arrayList4.toArray(new java.lang.String[arrayList4.size()]);
                if (strArr2.length > 0) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(119);
                    arrayList5.add(strArr2);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(activity, arrayList5.toArray(), "com/tencent/cloud/huiyan/permission/b", "a", "(Landroid/app/Activity;[Ljava/lang/String;Lcom/tencent/cloud/huiyan/fragments/a;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                    activity.requestPermissions((java.lang.String[]) arrayList5.get(0), ((java.lang.Integer) arrayList5.get(1)).intValue());
                    yj0.a.f(activity, "com/tencent/cloud/huiyan/permission/b", "a", "(Landroid/app/Activity;[Ljava/lang/String;Lcom/tencent/cloud/huiyan/fragments/a;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                } else {
                    aVar.a();
                }
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // lc.i, android.app.Fragment
    public final void onDestroy() {
        int i17;
        super.onDestroy();
        mc.q qVar = mc.p.f407064a;
        qVar.b("AuthingFragment", "on destroy.");
        this.f399356x = false;
        qc.b bVar = this.f399355w;
        if (bVar != null) {
            bVar.dismiss();
            this.f399355w = null;
        }
        if (this.f399340e != null) {
            this.f399340e = null;
        }
        if (this.f399347o != null) {
            this.f399347o = null;
        }
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = ic.c.f371813a.f371823i;
        if (c2920x9dce3f52 != null && c2920x9dce3f52.m21840xe1b11df6() && (i17 = this.f399349q) != -1) {
            a(new lc.RunnableC29079x2f5e1a(this, i17));
        }
        com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.C2888xbf192151 c2888xbf192151 = this.f399353u;
        oc.h hVar = oc.g.f425634a;
        if (c2888xbf192151 != null) {
            this.f399353u.m21559x41012807();
            hVar.a();
        }
        mc.k.f407058a.a();
        mc.c cVar = mc.d.f407048a;
        cVar.getClass();
        qVar.b("AuthStateManager", "doReleaseListenerAndCacheObj");
        if (cVar.f407031b != null) {
            cVar.f407031b = null;
        }
        if (cVar.f407030a != null) {
            cVar.f407030a = null;
        }
        if (cVar.f407036g != null) {
            cVar.f407036g = null;
        }
        cVar.f407032c = false;
        cVar.f407045p = false;
        cVar.f407039j = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p334x5c30b92.EnumC2925x4120adb0.NONE;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed39 = this.f399347o;
        if (c2936x4a02ed39 != null) {
            c2936x4a02ed39.c(true);
        }
        pc.o oVar = this.f399352t;
        if (oVar != null) {
            oVar.a();
        }
        mc.r rVar = hVar.f425639e;
        if (rVar != null) {
            qVar.b("VideoRecorderManager", "freeAndRelease!");
            while (rVar.f407073a.size() > 0) {
                pc.c.f434735a.a((byte[]) rVar.f407073a.poll());
            }
            rVar.f407082j = true;
            rVar.f407083k = true;
            rVar.f407088p = false;
            rVar.f407089q = true;
        }
        hVar.f425636b = false;
        hVar.f425635a = false;
        hVar.a();
        this.f399341f = null;
        this.f399342g = null;
        this.f399343h = null;
        this.f399344i = null;
        this.f399345m = null;
        this.f399346n = null;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f399340e instanceof android.view.View) {
            if (!this.f399350r) {
                this.f399341f.setVisibility(0);
                android.view.View view = (android.view.View) this.f399340e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/cloud/huiyan/fragments/f", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/cloud/huiyan/fragments/f", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (this.f399341f != null) {
                com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde = this.B;
                if (c2919x968bacde == null || !c2919x968bacde.m21790xfd0be3b6()) {
                    this.f399341f.setScaleX(0.935f);
                    this.f399341f.setScaleY(0.935f);
                    this.f399341f.setVisibility(0);
                    this.f399341f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d_6);
                } else {
                    this.f399341f.setVisibility(8);
                }
            }
            android.view.View view2 = (android.view.View) this.f399340e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/cloud/huiyan/fragments/f", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/cloud/huiyan/fragments/f", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        int i17 = ic.d.f371814k;
        ic.d dVar = ic.c.f371813a;
        android.content.Context a17 = dVar.a();
        boolean z17 = false;
        if (a17 != null) {
            java.lang.String[] strArr = pc.k.f434743a;
            android.content.pm.PackageManager packageManager = a17.getPackageManager();
            if (packageManager == null) {
                com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2903x3c4dddc.m21637x5c4d208("PermissionUtils", "checkPermissions packageManager is null");
            } else {
                if (packageManager.checkPermission(strArr[0], a17.getPackageName()) == 0) {
                    z17 = true;
                }
            }
        }
        if (!z17) {
            super.onStop();
            return;
        }
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = dVar.f371823i;
        if (c2920x9dce3f52 == null || !c2920x9dce3f52.m21841x3275c6e2()) {
            super.onStop();
            return;
        }
        if (dVar.f371818d) {
            super.onStop();
            return;
        }
        if (!this.f399351s) {
            super.onStop();
            return;
        }
        if (this.f399353u != null) {
            this.f399353u.m21559x41012807();
        }
        if (getContext() != null) {
            pc.l.f434744a.f434745a.name();
            java.lang.String string = b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.piy);
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde = this.B;
            boolean m21796x50cd83a9 = c2919x968bacde != null ? c2919x968bacde.m21796x50cd83a9() : true;
            int i18 = 214;
            if (m21796x50cd83a9) {
                a(new lc.RunnableC29084x2f5e1f(this, i18, string));
            } else {
                pc.f.c(214, string);
            }
        }
        super.onStop();
    }
}
