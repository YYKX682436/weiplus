package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.AlertDialogImpl */
/* loaded from: classes9.dex */
public class C3281x3cf409e4 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879 {

    /* renamed from: PATTERN_FILE */
    private static final java.lang.String f12507x800854eb = "file://";

    /* renamed from: PATTERN_HTTP */
    private static final java.lang.String f12508x800967f7 = "http://";

    /* renamed from: PATTERN_HTTPS */
    private static final java.lang.String f12509x8123973c = "https://";
    private static final java.lang.String TAG = "AlertDialogImpl";

    /* renamed from: _hellAccFlag_ */
    private byte f12510x7f11beae;

    /* renamed from: mDialog */
    private java.lang.ref.WeakReference<android.app.Dialog> f12512x62415 = null;

    /* renamed from: kindaCacheService */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0 f12511x6a1098c0 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0();

    /* renamed from: com.tencent.kinda.framework.widget.base.AlertDialogImpl$TipsImage */
    /* loaded from: classes9.dex */
    public class TipsImage extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3337xedd7f835 {
        public TipsImage() {
        }

        /* renamed from: updateView */
        public void m26040xee5d5b0e(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913) {
            this.f13218x373aa5 = c19659x677e0913;
        }
    }

    /* renamed from: finishUIPageFragmentActivity */
    private void m26017x575f4b35() {
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (!(m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "finishUIPageFragmentActivity, UIPageFragmentActivity no found!");
            return;
        }
        com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2 activityC10720x85cbbee2 = (com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) m27313x7608d9c4;
        if (activityC10720x85cbbee2.U6()) {
            activityC10720x85cbbee2.finish();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "finishUIPageFragmentActivity, UIPageFragmentActivity shouldn't finish!");
        }
    }

    /* renamed from: getDialog */
    private android.app.Dialog m26018x15b1203e() {
        java.lang.ref.WeakReference<android.app.Dialog> weakReference = this.f12512x62415;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: getDrawable */
    private android.graphics.drawable.Drawable m26019x4a96be14(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        if (str == null) {
            return null;
        }
        if (str.startsWith(f12507x800854eb)) {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str.replaceFirst(f12507x800854eb, ""));
        } else {
            int m27366xffdf924f = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.m27366xffdf924f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
            if (m27366xffdf924f == 0) {
                m27366xffdf924f = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.m27370x7513c025(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463);
            }
            android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(m27366xffdf924f));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/AlertDialogImpl", "getDrawable", "(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/kinda/framework/widget/base/AlertDialogImpl", "getDrawable", "(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            if (decodeResource == null) {
                try {
                    android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(m27366xffdf924f);
                    if (drawable != null) {
                        return drawable;
                    }
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
            }
            bitmap = decodeResource;
        }
        if (bitmap != null) {
            return new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), bitmap);
        }
        return null;
    }

    /* renamed from: setDialog */
    private void m26020x8e6544a(android.app.Dialog dialog) {
        this.f12512x62415 = new java.lang.ref.WeakReference<>(dialog);
    }

    /* renamed from: setKindaDismissDialog */
    private void m26021xa4e9ee27() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0 c3229xb79a5ee0 = this.f12511x6a1098c0;
        if (c3229xb79a5ee0 != null) {
            c3229xb79a5ee0.mo25859x76486a6c("kindaShowingDialog", false, 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "setKindaDismissDialog");
        }
    }

    /* renamed from: setKindaShowingDialog */
    private void m26022x4c00a322() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0 c3229xb79a5ee0 = this.f12511x6a1098c0;
        if (c3229xb79a5ee0 != null) {
            c3229xb79a5ee0.mo25859x76486a6c("kindaShowingDialog", true, 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "setKindaShowingDialog");
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: dismiss */
    public void mo26023x63a3b28a() {
        if (m26018x15b1203e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getDialog() == null");
            return;
        }
        m26018x15b1203e().dismiss();
        m26021xa4e9ee27();
        m26017x575f4b35();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: isShowing */
    public boolean mo26024x58a9c73b() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: setContentAlign */
    public void mo26025xc725e38e(com.p314xaae8f345.p347x615374d.gen.EnumC3607x37efb5b8 enumC3607x37efb5b8) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showImpl */
    public void mo26027xebc8eabd(java.lang.String str, java.lang.String str2, java.lang.String str3, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            m26020x8e6544a(db5.e1.E(context, str2, str, str3, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192 = abstractC3623x3b485619;
                    if (abstractC3623x3b4856192 != null) {
                        abstractC3623x3b4856192.mo25801x2e7a5e();
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
                }
            }));
            m26022x4c00a322();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showInputAlertImpl */
    public void mo26030xc61b654f(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, final com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "showInputAlertImpl");
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showInputAlertImpl() KindaContext.get() return null!");
        } else {
            m26020x8e6544a(gt4.l.b(context, str, str2, str3, false, i17, new db5.a1() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.19
                @Override // db5.a1
                /* renamed from: onFinish */
                public boolean mo26039x42fe6352(java.lang.CharSequence charSequence) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.TAG, "ok: %s", charSequence);
                    abstractC3635x710ca4a.mo28515x2e7a5e(((java.lang.Object) charSequence) + "");
                    return true;
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.20
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.TAG, "cancel: %s", abstractC3623x3b485619);
                    abstractC3623x3b485619.mo25801x2e7a5e();
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
                }
            }));
            m26022x4c00a322();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showTipsImpl */
    public void mo26033x5744bf95(java.lang.String str, java.lang.String str2, java.lang.String str3, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 4");
        } else {
            m26020x8e6544a(db5.e1.E(context, str2, str, str3, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.7
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192 = abstractC3623x3b485619;
                    if (abstractC3623x3b4856192 != null) {
                        abstractC3623x3b4856192.mo25801x2e7a5e();
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
                }
            }));
            m26022x4c00a322();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showTouchIdAuthViewImpl */
    public void mo26038x3abefbca(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showImpl */
    public void mo26028xebc8eabd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 2");
        } else {
            m26020x8e6544a(db5.e1.C(context, str2, str, str4, str3, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b4856192;
                    if (abstractC3623x3b4856193 != null) {
                        abstractC3623x3b4856193.mo25801x2e7a5e();
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b485619;
                    if (abstractC3623x3b4856193 != null) {
                        abstractC3623x3b4856193.mo25801x2e7a5e();
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
                }
            }));
            m26022x4c00a322();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showTipsImpl */
    public void mo26035x5744bf95(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 5");
        } else {
            m26020x8e6544a(db5.e1.C(context, str2, str, str4, str3, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.8
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b4856192;
                    if (abstractC3623x3b4856193 != null) {
                        abstractC3623x3b4856193.mo25801x2e7a5e();
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.9
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b485619;
                    if (abstractC3623x3b4856193 != null) {
                        abstractC3623x3b4856193.mo25801x2e7a5e();
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
                }
            }));
            m26022x4c00a322();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showImpl */
    public void mo26029xebc8eabd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 3");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 C = db5.e1.C(context, str2, str, str3, str4, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856194 = abstractC3623x3b485619;
                if (abstractC3623x3b4856194 != null) {
                    abstractC3623x3b4856194.mo25801x2e7a5e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856194 = abstractC3623x3b4856192;
                if (abstractC3623x3b4856194 != null) {
                    abstractC3623x3b4856194.mo25801x2e7a5e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        C.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.6
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856194 = abstractC3623x3b4856193;
                if (abstractC3623x3b4856194 != null) {
                    abstractC3623x3b4856194.mo25801x2e7a5e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        m26020x8e6544a(C);
        m26022x4c00a322();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showTipsImpl */
    public void mo26037x5744bf95(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 6");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        k2Var.setContentView(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3089xbddafb2a.f11648x49a8c7e);
        android.widget.TextView textView = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11570x60876c84);
        android.widget.TextView textView2 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11569xe300a3a5);
        android.widget.TextView textView3 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11566xfad30da9);
        android.widget.TextView textView4 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11567xfad30daa);
        android.widget.TextView textView5 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11568xfad30dab);
        if (!lj.f.f(str)) {
            textView.setVisibility(0);
            textView.setText(str);
        }
        if (!lj.f.f(str2)) {
            textView2.setVisibility(0);
            textView2.setText(str2);
        }
        textView3.setText(str3);
        textView4.setText(str4);
        textView5.setText(str5);
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.10
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856194 = abstractC3623x3b485619;
                if (abstractC3623x3b4856194 != null) {
                    abstractC3623x3b4856194.mo25801x2e7a5e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        textView4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.11
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856194 = abstractC3623x3b4856192;
                if (abstractC3623x3b4856194 != null) {
                    abstractC3623x3b4856194.mo25801x2e7a5e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        textView5.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.12
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856194 = abstractC3623x3b4856193;
                if (abstractC3623x3b4856194 != null) {
                    abstractC3623x3b4856194.mo25801x2e7a5e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        k2Var.setCancelable(false);
        k2Var.show();
        m26020x8e6544a(k2Var);
        m26022x4c00a322();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showImpl */
    public void mo26026xebc8eabd(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190, java.lang.String str2, java.lang.String str3, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 8");
            return;
        }
        if (interfaceC3545x4499190 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.B = true;
            aVar.A = false;
            aVar.L = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190).mo27110xfb86a31b();
            aVar.f293242a = str;
            aVar.f293266w = str2;
            aVar.F = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.21
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b485619;
                    if (abstractC3623x3b4856193 != null) {
                        abstractC3623x3b4856193.mo25801x2e7a5e();
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
                }
            };
            aVar.f293265v = str3;
            aVar.E = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.22
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b4856192;
                    if (abstractC3623x3b4856193 != null) {
                        abstractC3623x3b4856193.mo25801x2e7a5e();
                    }
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
                }
            };
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
            m26020x8e6544a(j0Var);
            m26022x4c00a322();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "show alert with contentView, contentView requires to be MMKView");
        mo26028xebc8eabd(str, "", str2, str3, abstractC3623x3b485619, abstractC3623x3b4856192);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showTipsImpl */
    public void mo26034x5744bf95(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 7");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        k2Var.setContentView(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3089xbddafb2a.f11644xc58380cb);
        android.widget.TextView textView = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11635xb214f6fa);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11499x694215);
        android.widget.TextView textView2 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11500xfc4c008);
        android.widget.TextView textView3 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11488x2e4d55);
        textView.setText(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (str2 != null) {
            c19659x677e0913.setVisibility(0);
            if (str2.startsWith(f12508x800967f7) || str2.startsWith(f12509x8123973c)) {
                c19659x677e0913.m75396xca029dad(str2);
            } else {
                android.graphics.drawable.Drawable m26019x4a96be14 = m26019x4a96be14(str2);
                if (m26019x4a96be14 != null) {
                    c19659x677e0913.setImageDrawable(m26019x4a96be14);
                }
            }
        } else {
            c19659x677e0913.setVisibility(8);
        }
        textView2.setText(str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        textView3.setText(str4);
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.13
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192 = abstractC3623x3b485619;
                if (abstractC3623x3b4856192 != null) {
                    abstractC3623x3b4856192.mo25801x2e7a5e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        k2Var.setCancelable(false);
        k2Var.show();
        m26020x8e6544a(k2Var);
        m26022x4c00a322();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showTipsImpl */
    public void mo26031x5744bf95(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 interfaceC3471x84332fd0, java.lang.String str2, java.lang.String str3, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 7");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        k2Var.setContentView(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3089xbddafb2a.f11644xc58380cb);
        android.widget.TextView textView = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11635xb214f6fa);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11499x694215);
        android.widget.TextView textView2 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11500xfc4c008);
        android.widget.TextView textView3 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11488x2e4d55);
        textView.setText(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        final com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.TipsImage tipsImage = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.TipsImage();
        if (interfaceC3471x84332fd0 != null) {
            c19659x677e0913.setVisibility(0);
            tipsImage.mo26263xd722a12e(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b(context));
            tipsImage.m27112x76516a27(c19659x677e0913);
            if (interfaceC3471x84332fd0 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 c3336xac2d8170 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) interfaceC3471x84332fd0;
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) tipsImage.mo27110xfb86a31b().getLayoutParams();
                if ((layoutParams instanceof android.widget.LinearLayout.LayoutParams) && (c3336xac2d8170.m26916x4071ec12() > 0.0f || c3336xac2d8170.m26915xb3fc9c5b() > 0.0f)) {
                    layoutParams.width = i65.a.a(context, c3336xac2d8170.m26916x4071ec12());
                    layoutParams.height = i65.a.a(context, c3336xac2d8170.m26915xb3fc9c5b());
                    tipsImage.mo27110xfb86a31b().setLayoutParams(layoutParams);
                }
            }
            tipsImage.mo26951x53266a19(interfaceC3471x84332fd0);
        } else {
            c19659x677e0913.setVisibility(8);
        }
        textView2.setText(str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                textView2.setTypeface(null, 1);
            }
        }
        textView3.setText(str3);
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.14
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192 = abstractC3623x3b485619;
                if (abstractC3623x3b4856192 != null) {
                    abstractC3623x3b4856192.mo25801x2e7a5e();
                }
                tipsImage.mo26334x279f85a2("");
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        k2Var.setCancelable(false);
        k2Var.show();
        m26020x8e6544a(k2Var);
        m26022x4c00a322();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showTipsImpl */
    public void mo26036x5744bf95(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 8");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        k2Var.setContentView(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3089xbddafb2a.f11645xddeb31b1);
        android.widget.TextView textView = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11635xb214f6fa);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11499x694215);
        android.widget.TextView textView2 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11500xfc4c008);
        android.widget.TextView textView3 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11571x6671f224);
        android.widget.TextView textView4 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11629xa27e01b9);
        textView.setText(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (str2 != null) {
            c19659x677e0913.setVisibility(0);
            if (str2.startsWith(f12508x800967f7) || str2.startsWith(f12509x8123973c)) {
                c19659x677e0913.m75396xca029dad(str2);
            } else {
                android.graphics.drawable.Drawable m26019x4a96be14 = m26019x4a96be14(str2);
                if (m26019x4a96be14 != null) {
                    c19659x677e0913.setImageDrawable(m26019x4a96be14);
                }
            }
        } else {
            c19659x677e0913.setVisibility(8);
        }
        textView2.setText(str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        textView3.setText(str4);
        textView4.setText(str5);
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.15
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b485619;
                if (abstractC3623x3b4856193 != null) {
                    abstractC3623x3b4856193.mo25801x2e7a5e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        textView4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.16
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b4856192;
                if (abstractC3623x3b4856193 != null) {
                    abstractC3623x3b4856193.mo25801x2e7a5e();
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        k2Var.setCancelable(false);
        k2Var.show();
        m26020x8e6544a(k2Var);
        m26022x4c00a322();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3422x51b01879
    /* renamed from: showTipsImpl */
    public void mo26032x5744bf95(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.InterfaceC3471x84332fd0 interfaceC3471x84332fd0, java.lang.String str2, java.lang.String str3, java.lang.String str4, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 8");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        k2Var.setContentView(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3089xbddafb2a.f11645xddeb31b1);
        android.widget.TextView textView = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11635xb214f6fa);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11499x694215);
        android.widget.TextView textView2 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11500xfc4c008);
        android.widget.TextView textView3 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11571x6671f224);
        android.widget.TextView textView4 = (android.widget.TextView) k2Var.findViewById(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11629xa27e01b9);
        textView.setText(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        final com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.TipsImage tipsImage = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.TipsImage();
        if (interfaceC3471x84332fd0 != null) {
            c19659x677e0913.setVisibility(0);
            tipsImage.mo26263xd722a12e(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3359x65bf7d3b(context));
            tipsImage.m27112x76516a27(c19659x677e0913);
            if (interfaceC3471x84332fd0 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170 c3336xac2d8170 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3336xac2d8170) interfaceC3471x84332fd0;
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) tipsImage.mo27110xfb86a31b().getLayoutParams();
                if ((layoutParams instanceof android.widget.LinearLayout.LayoutParams) && (c3336xac2d8170.m26916x4071ec12() > 0.0f || c3336xac2d8170.m26915xb3fc9c5b() > 0.0f)) {
                    layoutParams.width = i65.a.a(context, c3336xac2d8170.m26916x4071ec12());
                    layoutParams.height = i65.a.a(context, c3336xac2d8170.m26915xb3fc9c5b());
                    tipsImage.mo27110xfb86a31b().setLayoutParams(layoutParams);
                }
            }
            tipsImage.mo26951x53266a19(interfaceC3471x84332fd0);
        } else {
            c19659x677e0913.setVisibility(8);
        }
        textView2.setText(str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                textView2.setTypeface(null, 1);
            }
        }
        textView3.setText(str3);
        textView4.setText(str4);
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.17
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b485619;
                if (abstractC3623x3b4856193 != null) {
                    abstractC3623x3b4856193.mo25801x2e7a5e();
                }
                tipsImage.mo26334x279f85a2("");
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        textView4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.18
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856193 = abstractC3623x3b4856192;
                if (abstractC3623x3b4856193 != null) {
                    abstractC3623x3b4856193.mo25801x2e7a5e();
                }
                tipsImage.mo26334x279f85a2("");
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3281x3cf409e4.this.mo26023x63a3b28a();
            }
        });
        k2Var.setCancelable(false);
        k2Var.show();
        m26020x8e6544a(k2Var);
        m26022x4c00a322();
    }
}
