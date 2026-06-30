package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class AlertDialogImpl implements com.tencent.kinda.gen.KAlertDialog {
    private static final java.lang.String PATTERN_FILE = "file://";
    private static final java.lang.String PATTERN_HTTP = "http://";
    private static final java.lang.String PATTERN_HTTPS = "https://";
    private static final java.lang.String TAG = "AlertDialogImpl";
    private byte _hellAccFlag_;
    private java.lang.ref.WeakReference<android.app.Dialog> mDialog = null;
    private com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl kindaCacheService = new com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl();

    /* loaded from: classes9.dex */
    public class TipsImage extends com.tencent.kinda.framework.widget.base.MMKImageView {
        public TipsImage() {
        }

        public void updateView(com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView) {
            this.view = cdnImageView;
        }
    }

    private void finishUIPageFragmentActivity() {
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (!(topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity)) {
            com.tencent.mars.xlog.Log.i(TAG, "finishUIPageFragmentActivity, UIPageFragmentActivity no found!");
            return;
        }
        com.tencent.mm.framework.app.UIPageFragmentActivity uIPageFragmentActivity = (com.tencent.mm.framework.app.UIPageFragmentActivity) topOrUIPageFragmentActivity;
        if (uIPageFragmentActivity.U6()) {
            uIPageFragmentActivity.finish();
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "finishUIPageFragmentActivity, UIPageFragmentActivity shouldn't finish!");
        }
    }

    private android.app.Dialog getDialog() {
        java.lang.ref.WeakReference<android.app.Dialog> weakReference = this.mDialog;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private android.graphics.drawable.Drawable getDrawable(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        if (str == null) {
            return null;
        }
        if (str.startsWith(PATTERN_FILE)) {
            bitmap = com.tencent.mm.sdk.platformtools.x.i0(str.replaceFirst(PATTERN_FILE, ""));
        } else {
            int drawableId = com.tencent.kinda.framework.widget.tools.ResourcesUtils.getDrawableId(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
            if (drawableId == 0) {
                drawableId = com.tencent.kinda.framework.widget.tools.ResourcesUtils.getResId(com.tencent.mm.sdk.platformtools.x2.f193071a, str, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW);
            }
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(drawableId));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/AlertDialogImpl", "getDrawable", "(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/kinda/framework/widget/base/AlertDialogImpl", "getDrawable", "(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            if (decodeResource == null) {
                try {
                    android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(drawableId);
                    if (drawable != null) {
                        return drawable;
                    }
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
            }
            bitmap = decodeResource;
        }
        if (bitmap != null) {
            return new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), bitmap);
        }
        return null;
    }

    private void setDialog(android.app.Dialog dialog) {
        this.mDialog = new java.lang.ref.WeakReference<>(dialog);
    }

    private void setKindaDismissDialog() {
        com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl kindaCacheServiceImpl = this.kindaCacheService;
        if (kindaCacheServiceImpl != null) {
            kindaCacheServiceImpl.setBool("kindaShowingDialog", false, 0L);
            com.tencent.mars.xlog.Log.i(TAG, "setKindaDismissDialog");
        }
    }

    private void setKindaShowingDialog() {
        com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl kindaCacheServiceImpl = this.kindaCacheService;
        if (kindaCacheServiceImpl != null) {
            kindaCacheServiceImpl.setBool("kindaShowingDialog", true, 0L);
            com.tencent.mars.xlog.Log.i(TAG, "setKindaShowingDialog");
        }
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void dismiss() {
        if (getDialog() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "getDialog() == null");
            return;
        }
        getDialog().dismiss();
        setKindaDismissDialog();
        finishUIPageFragmentActivity();
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public boolean isShowing() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void setContentAlign(com.tencent.kinda.gen.TextAlign textAlign) {
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            setDialog(db5.e1.E(context, str2, str, str3, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.kinda.gen.VoidCallback voidCallback2 = voidCallback;
                    if (voidCallback2 != null) {
                        voidCallback2.call();
                    }
                    com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
                }
            }));
            setKindaShowingDialog();
        }
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showInputAlertImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, final com.tencent.kinda.gen.VoidStringCallback voidStringCallback, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        com.tencent.mars.xlog.Log.i(TAG, "showInputAlertImpl");
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showInputAlertImpl() KindaContext.get() return null!");
        } else {
            setDialog(gt4.l.b(context, str, str2, str3, false, i17, new db5.a1() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.19
                @Override // db5.a1
                public boolean onFinish(java.lang.CharSequence charSequence) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.AlertDialogImpl.TAG, "ok: %s", charSequence);
                    voidStringCallback.call(((java.lang.Object) charSequence) + "");
                    return true;
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.20
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.AlertDialogImpl.TAG, "cancel: %s", voidCallback);
                    voidCallback.call();
                    com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
                }
            }));
            setKindaShowingDialog();
        }
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showTipsImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 4");
        } else {
            setDialog(db5.e1.E(context, str2, str, str3, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.7
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.kinda.gen.VoidCallback voidCallback2 = voidCallback;
                    if (voidCallback2 != null) {
                        voidCallback2.call();
                    }
                    com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
                }
            }));
            setKindaShowingDialog();
        }
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showTouchIdAuthViewImpl(java.lang.String str, com.tencent.kinda.gen.VoidStringCallback voidStringCallback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2, com.tencent.kinda.gen.VoidCallback voidCallback3) {
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 2");
        } else {
            setDialog(db5.e1.C(context, str2, str, str4, str3, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback2;
                    if (voidCallback3 != null) {
                        voidCallback3.call();
                    }
                    com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback;
                    if (voidCallback3 != null) {
                        voidCallback3.call();
                    }
                    com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
                }
            }));
            setKindaShowingDialog();
        }
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showTipsImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 5");
        } else {
            setDialog(db5.e1.C(context, str2, str, str4, str3, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.8
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback2;
                    if (voidCallback3 != null) {
                        voidCallback3.call();
                    }
                    com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.9
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback;
                    if (voidCallback3 != null) {
                        voidCallback3.call();
                    }
                    com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
                }
            }));
            setKindaShowingDialog();
        }
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2, final com.tencent.kinda.gen.VoidCallback voidCallback3) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showImpl() KindaContext.get() return null! case 3");
            return;
        }
        com.tencent.mm.ui.widget.dialog.j0 C = db5.e1.C(context, str2, str, str3, str4, false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.tencent.kinda.gen.VoidCallback voidCallback4 = voidCallback;
                if (voidCallback4 != null) {
                    voidCallback4.call();
                }
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                com.tencent.kinda.gen.VoidCallback voidCallback4 = voidCallback2;
                if (voidCallback4 != null) {
                    voidCallback4.call();
                }
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        C.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.6
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
                com.tencent.kinda.gen.VoidCallback voidCallback4 = voidCallback3;
                if (voidCallback4 != null) {
                    voidCallback4.call();
                }
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        setDialog(C);
        setKindaShowingDialog();
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showTipsImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2, final com.tencent.kinda.gen.VoidCallback voidCallback3) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 6");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(context, com.tencent.mm.R.style.f494791wd);
        k2Var.setContentView(com.tencent.kinda.framework.R.layout.kinda_three_btn_dialog);
        android.widget.TextView textView = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.ktbd_title);
        android.widget.TextView textView2 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.ktbd_content);
        android.widget.TextView textView3 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.ktbd_btn1);
        android.widget.TextView textView4 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.ktbd_btn2);
        android.widget.TextView textView5 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.ktbd_btn3);
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
                com.tencent.kinda.gen.VoidCallback voidCallback4 = voidCallback;
                if (voidCallback4 != null) {
                    voidCallback4.call();
                }
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        textView4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.11
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.kinda.gen.VoidCallback voidCallback4 = voidCallback2;
                if (voidCallback4 != null) {
                    voidCallback4.call();
                }
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        textView5.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.12
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.kinda.gen.VoidCallback voidCallback4 = voidCallback3;
                if (voidCallback4 != null) {
                    voidCallback4.call();
                }
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        k2Var.setCancelable(false);
        k2Var.show();
        setDialog(k2Var);
        setKindaShowingDialog();
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showImpl(java.lang.String str, com.tencent.kinda.gen.KView kView, java.lang.String str2, java.lang.String str3, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 8");
            return;
        }
        if (kView instanceof com.tencent.kinda.framework.widget.base.MMKView) {
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.B = true;
            aVar.A = false;
            aVar.L = ((com.tencent.kinda.framework.widget.base.MMKView) kView).getView();
            aVar.f211709a = str;
            aVar.f211733w = str2;
            aVar.F = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.21
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback;
                    if (voidCallback3 != null) {
                        voidCallback3.call();
                    }
                    com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
                }
            };
            aVar.f211732v = str3;
            aVar.E = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.22
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback2;
                    if (voidCallback3 != null) {
                        voidCallback3.call();
                    }
                    com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
                }
            };
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
            setDialog(j0Var);
            setKindaShowingDialog();
            return;
        }
        com.tencent.mars.xlog.Log.e(TAG, "show alert with contentView, contentView requires to be MMKView");
        showImpl(str, "", str2, str3, voidCallback, voidCallback2);
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showTipsImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 7");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(context, com.tencent.mm.R.style.f494791wd);
        k2Var.setContentView(com.tencent.kinda.framework.R.layout.kinda_image_dialog_with_one_btn);
        android.widget.TextView textView = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.titleTv);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) k2Var.findViewById(com.tencent.kinda.framework.R.id.content_image);
        android.widget.TextView textView2 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.content_tv);
        android.widget.TextView textView3 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.btn1);
        textView.setText(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (str2 != null) {
            cdnImageView.setVisibility(0);
            if (str2.startsWith(PATTERN_HTTP) || str2.startsWith(PATTERN_HTTPS)) {
                cdnImageView.setUrl(str2);
            } else {
                android.graphics.drawable.Drawable drawable = getDrawable(str2);
                if (drawable != null) {
                    cdnImageView.setImageDrawable(drawable);
                }
            }
        } else {
            cdnImageView.setVisibility(8);
        }
        textView2.setText(str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        textView3.setText(str4);
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.13
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.kinda.gen.VoidCallback voidCallback2 = voidCallback;
                if (voidCallback2 != null) {
                    voidCallback2.call();
                }
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        k2Var.setCancelable(false);
        k2Var.show();
        setDialog(k2Var);
        setKindaShowingDialog();
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showTipsImpl(java.lang.String str, com.tencent.kinda.gen.KImage kImage, java.lang.String str2, java.lang.String str3, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 7");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(context, com.tencent.mm.R.style.f494791wd);
        k2Var.setContentView(com.tencent.kinda.framework.R.layout.kinda_image_dialog_with_one_btn);
        android.widget.TextView textView = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.titleTv);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) k2Var.findViewById(com.tencent.kinda.framework.R.id.content_image);
        android.widget.TextView textView2 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.content_tv);
        android.widget.TextView textView3 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.btn1);
        textView.setText(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        final com.tencent.kinda.framework.widget.base.AlertDialogImpl.TipsImage tipsImage = new com.tencent.kinda.framework.widget.base.AlertDialogImpl.TipsImage();
        if (kImage != null) {
            cdnImageView.setVisibility(0);
            tipsImage.initWithPlatformDelegate(new com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl(context));
            tipsImage.setView(cdnImageView);
            if (kImage instanceof com.tencent.kinda.framework.widget.base.MMKImage) {
                com.tencent.kinda.framework.widget.base.MMKImage mMKImage = (com.tencent.kinda.framework.widget.base.MMKImage) kImage;
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) tipsImage.getView().getLayoutParams();
                if ((layoutParams instanceof android.widget.LinearLayout.LayoutParams) && (mMKImage.getInputWidth() > 0.0f || mMKImage.getInputHeight() > 0.0f)) {
                    layoutParams.width = i65.a.a(context, mMKImage.getInputWidth());
                    layoutParams.height = i65.a.a(context, mMKImage.getInputHeight());
                    tipsImage.getView().setLayoutParams(layoutParams);
                }
            }
            tipsImage.setImage(kImage);
        } else {
            cdnImageView.setVisibility(8);
        }
        textView2.setText(str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                textView2.setTypeface(null, 1);
            }
        }
        textView3.setText(str3);
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.14
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.kinda.gen.VoidCallback voidCallback2 = voidCallback;
                if (voidCallback2 != null) {
                    voidCallback2.call();
                }
                tipsImage.setViewId("");
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        k2Var.setCancelable(false);
        k2Var.show();
        setDialog(k2Var);
        setKindaShowingDialog();
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showTipsImpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 8");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(context, com.tencent.mm.R.style.f494791wd);
        k2Var.setContentView(com.tencent.kinda.framework.R.layout.kinda_image_dialog_with_two_btn);
        android.widget.TextView textView = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.titleTv);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) k2Var.findViewById(com.tencent.kinda.framework.R.id.content_image);
        android.widget.TextView textView2 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.content_tv);
        android.widget.TextView textView3 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.left_btn);
        android.widget.TextView textView4 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.right_btn);
        textView.setText(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (str2 != null) {
            cdnImageView.setVisibility(0);
            if (str2.startsWith(PATTERN_HTTP) || str2.startsWith(PATTERN_HTTPS)) {
                cdnImageView.setUrl(str2);
            } else {
                android.graphics.drawable.Drawable drawable = getDrawable(str2);
                if (drawable != null) {
                    cdnImageView.setImageDrawable(drawable);
                }
            }
        } else {
            cdnImageView.setVisibility(8);
        }
        textView2.setText(str3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        textView3.setText(str4);
        textView4.setText(str5);
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.15
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback;
                if (voidCallback3 != null) {
                    voidCallback3.call();
                }
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        textView4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.16
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback2;
                if (voidCallback3 != null) {
                    voidCallback3.call();
                }
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        k2Var.setCancelable(false);
        k2Var.show();
        setDialog(k2Var);
        setKindaShowingDialog();
    }

    @Override // com.tencent.kinda.gen.KAlertDialog
    public void showTipsImpl(java.lang.String str, com.tencent.kinda.gen.KImage kImage, java.lang.String str2, java.lang.String str3, java.lang.String str4, final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "AlertDialogImpl showTipsImpl() KindaContext.get() return null! case 8");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(context, com.tencent.mm.R.style.f494791wd);
        k2Var.setContentView(com.tencent.kinda.framework.R.layout.kinda_image_dialog_with_two_btn);
        android.widget.TextView textView = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.titleTv);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) k2Var.findViewById(com.tencent.kinda.framework.R.id.content_image);
        android.widget.TextView textView2 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.content_tv);
        android.widget.TextView textView3 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.left_btn);
        android.widget.TextView textView4 = (android.widget.TextView) k2Var.findViewById(com.tencent.kinda.framework.R.id.right_btn);
        textView.setText(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        final com.tencent.kinda.framework.widget.base.AlertDialogImpl.TipsImage tipsImage = new com.tencent.kinda.framework.widget.base.AlertDialogImpl.TipsImage();
        if (kImage != null) {
            cdnImageView.setVisibility(0);
            tipsImage.initWithPlatformDelegate(new com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl(context));
            tipsImage.setView(cdnImageView);
            if (kImage instanceof com.tencent.kinda.framework.widget.base.MMKImage) {
                com.tencent.kinda.framework.widget.base.MMKImage mMKImage = (com.tencent.kinda.framework.widget.base.MMKImage) kImage;
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) tipsImage.getView().getLayoutParams();
                if ((layoutParams instanceof android.widget.LinearLayout.LayoutParams) && (mMKImage.getInputWidth() > 0.0f || mMKImage.getInputHeight() > 0.0f)) {
                    layoutParams.width = i65.a.a(context, mMKImage.getInputWidth());
                    layoutParams.height = i65.a.a(context, mMKImage.getInputHeight());
                    tipsImage.getView().setLayoutParams(layoutParams);
                }
            }
            tipsImage.setImage(kImage);
        } else {
            cdnImageView.setVisibility(8);
        }
        textView2.setText(str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                textView2.setTypeface(null, 1);
            }
        }
        textView3.setText(str3);
        textView4.setText(str4);
        textView3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.17
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback;
                if (voidCallback3 != null) {
                    voidCallback3.call();
                }
                tipsImage.setViewId("");
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        textView4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.kinda.framework.widget.base.AlertDialogImpl.18
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.tencent.kinda.gen.VoidCallback voidCallback3 = voidCallback2;
                if (voidCallback3 != null) {
                    voidCallback3.call();
                }
                tipsImage.setViewId("");
                com.tencent.kinda.framework.widget.base.AlertDialogImpl.this.dismiss();
            }
        });
        k2Var.setCancelable(false);
        k2Var.show();
        setDialog(k2Var);
        setKindaShowingDialog();
    }
}
