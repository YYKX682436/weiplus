package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl */
/* loaded from: classes9.dex */
public class C3348x2f9a2ba0 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300 {
    private static final java.lang.String TAG = "MMKProgressDialogImpl";

    /* renamed from: kindaCacheService */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0 f13105x6a1098c0 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0();

    /* renamed from: mDialogImpl */
    private android.app.Dialog f13106x899ee7d5;

    /* renamed from: mLoadingImpl */
    private android.app.Dialog f13107x9c35cacf;

    /* renamed from: mPayProcessImpl */
    private android.app.Dialog f13108x49cead34;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finishUIPageFragmentActivity */
    public void m27044x575f4b35() {
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

    /* renamed from: runInMainThread */
    private void m27045x79e02653(java.lang.Runnable runnable) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            runnable.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setKindaDismissDialog */
    public void m27046xa4e9ee27() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0 c3229xb79a5ee0 = this.f13105x6a1098c0;
        if (c3229xb79a5ee0 != null) {
            c3229xb79a5ee0.mo25859x76486a6c("kindaShowingDialog", false, 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "setKindaDismissDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setKindaShowingDialog */
    public void m27047x4c00a322() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0 c3229xb79a5ee0 = this.f13105x6a1098c0;
        if (c3229xb79a5ee0 != null) {
            c3229xb79a5ee0.mo25859x76486a6c("kindaShowingDialog", true, 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "setKindaShowingDialog");
        }
    }

    /* renamed from: showProgressLoadingWithTitle */
    private void m27048x814f13c0(final java.lang.String str, final boolean z17, final int i17) {
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showProgressLoadingWithTitle() KindaContext.get() return null! case 1");
        } else {
            m27045x79e02653(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.9
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.f(context, str, z17, i17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.9.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5 = null;
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).mo53058xe5d1a549(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5);
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: dismiss */
    public void mo27049x63a3b28a() {
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5 != null && com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5.isShowing()) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5.dismiss();
                }
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13108x49cead34 != null && com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13108x49cead34.isShowing()) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13108x49cead34.dismiss();
                }
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf == null || !com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf.isShowing()) {
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf.dismiss();
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showCustomLoading */
    public void mo27050x5421348e(final java.lang.String str, final boolean z17) {
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            m27045x79e02653(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.8
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.c(context, str, !z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.8.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf != null) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf.dismiss();
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf = null;
                            }
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).mo53058xe5d1a549(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf);
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showGoToWPHKProgressLoading */
    public void mo27051x1e176af3(boolean z17) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showGoToWPHKProgressLoading() KindaContext.get() return null! case 1");
        } else {
            m27048x814f13c0(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pcr), z17, 12);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showImpl */
    public void mo27052xebc8eabd(java.lang.String str, final boolean z17, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            m27045x79e02653(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(context, z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.1.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            abstractC3623x3b485619.mo25801x2e7a5e();
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5 = null;
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).mo53058xe5d1a549(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5);
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showNormalGlobalLoading */
    public void mo27053x3f8e1435(final boolean z17) {
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            final java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvr);
            m27045x79e02653(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.c(context, string, !z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.6.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf != null) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf.dismiss();
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf = null;
                            }
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).mo53058xe5d1a549(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf);
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showNormalLoading */
    public void mo27054x9f129258(final boolean z17) {
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            final java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvr);
            m27045x79e02653(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.c(context, string, !z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.5.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf != null) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf.dismiss();
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf = null;
                            }
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).mo53058xe5d1a549(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf);
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showPayGlobalLoading */
    public void mo27055x9174fd6e(final boolean z17) {
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showImpl() KindaContext.get() return null! case 1");
        } else {
            m27045x79e02653(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(context, !z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.7.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5 = null;
                        }
                    });
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.7.2
                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(android.content.DialogInterface dialogInterface) {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.m27046xa4e9ee27();
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.m27044x575f4b35();
                        }
                    });
                    if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.m27047x4c00a322();
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo53058xe5d1a549(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5);
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showPayProcessImpl */
    public void mo27056xad2acbc4(final boolean z17, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        final android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showPayProcessImpl() KindaContext.get() return null! case 2");
        } else {
            m27045x79e02653(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13108x49cead34 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(m27313x7608d9c4, z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.2.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            abstractC3623x3b485619.mo25801x2e7a5e();
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13108x49cead34 = null;
                        }
                    });
                    android.content.Context context = m27313x7608d9c4;
                    if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo53058xe5d1a549(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13108x49cead34);
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showToast */
    public void mo27057x8df0212a(java.lang.String str) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showToast() KindaContext.get() return null! case 3");
        } else {
            db5.e1.T(context, str);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showTopLoading */
    public void mo27058x43c45d04(java.lang.String str, final boolean z17) {
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl can't startLoading because the context is null!");
        } else {
            final java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq);
            m27045x79e02653(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.c(context, string, !z17, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.4.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf != null) {
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf.dismiss();
                                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf = null;
                            }
                        }
                    });
                    android.content.Context context2 = context;
                    if (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).mo53058xe5d1a549(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13107x9c35cacf);
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showWPHKPayGlobalLoading */
    public void mo27059xac4c408a(final boolean z17) {
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showWPHKPayGlobalLoading() KindaContext.get() return null! case 1");
        } else {
            final java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oop);
            m27045x79e02653(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.10
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.f(context, string, !z17, 12, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.10.1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(android.content.DialogInterface dialogInterface) {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5 = null;
                        }
                    });
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.kinda.framework.widget.base.MMKProgressDialogImpl.10.2
                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(android.content.DialogInterface dialogInterface) {
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.m27046xa4e9ee27();
                            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.m27044x575f4b35();
                        }
                    });
                    if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.m27047x4c00a322();
                        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo53058xe5d1a549(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0.this.f13106x899ee7d5);
                    }
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3506x8c418300
    /* renamed from: showWPHKProgressLoading */
    public void mo27060xccc726f6(boolean z17) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "MMKProgressDialogImpl showWPHKProgressLoading() KindaContext.get() return null! case 1");
        } else {
            m27048x814f13c0(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oop), z17, 12);
        }
    }
}
