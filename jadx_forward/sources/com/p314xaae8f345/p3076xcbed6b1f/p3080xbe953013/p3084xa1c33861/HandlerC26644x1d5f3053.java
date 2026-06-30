package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861;

/* renamed from: com.tencent.tinker.loader.shareutil.TinkerLogInlineFence */
/* loaded from: classes13.dex */
final class HandlerC26644x1d5f3053 extends android.os.Handler {
    private static final java.lang.String TAG = "Tinker.TinkerLogInlineFence";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f297084a = 0;

    /* renamed from: mainThreadHandler */
    private static final android.os.Handler f55939x1945e0a7 = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: pendingLogs */
    private static final java.util.List<java.lang.Object[]> f55940x42581fe6 = new java.util.ArrayList();

    /* renamed from: dummyThrowExceptionMethod */
    private static void m104775xdfaad312() {
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.HandlerC26644x1d5f3053.class.isPrimitive()) {
            throw new java.lang.RuntimeException();
        }
    }

    /* renamed from: handleMessageImpl */
    private void m104776xebe8cb7f(android.os.Message message) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp m104764xbfc5eacb = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104764xbfc5eacb();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp m104765xfb80ca96 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104765xfb80ca96();
        int i17 = message.what;
        if (i17 == 2) {
            java.lang.Object[] objArr = (java.lang.Object[]) message.obj;
            if (m104765xfb80ca96 != null) {
                m104765xfb80ca96.v((java.lang.String) objArr[2], (java.lang.String) objArr[3], (java.lang.Object[]) objArr[4]);
            }
            if (m104765xfb80ca96 == null || m104765xfb80ca96 == m104764xbfc5eacb) {
                java.util.List<java.lang.Object[]> list = f55940x42581fe6;
                synchronized (list) {
                    list.add(objArr);
                }
                return;
            }
            return;
        }
        if (i17 == 3) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) message.obj;
            if (m104765xfb80ca96 != null) {
                m104765xfb80ca96.d((java.lang.String) objArr2[2], (java.lang.String) objArr2[3], (java.lang.Object[]) objArr2[4]);
            }
            if (m104765xfb80ca96 == null || m104765xfb80ca96 == m104764xbfc5eacb) {
                java.util.List<java.lang.Object[]> list2 = f55940x42581fe6;
                synchronized (list2) {
                    list2.add(objArr2);
                }
                return;
            }
            return;
        }
        if (i17 == 4) {
            java.lang.Object[] objArr3 = (java.lang.Object[]) message.obj;
            if (m104765xfb80ca96 != null) {
                m104765xfb80ca96.i((java.lang.String) objArr3[2], (java.lang.String) objArr3[3], (java.lang.Object[]) objArr3[4]);
            }
            if (m104765xfb80ca96 == null || m104765xfb80ca96 == m104764xbfc5eacb) {
                java.util.List<java.lang.Object[]> list3 = f55940x42581fe6;
                synchronized (list3) {
                    list3.add(objArr3);
                }
                return;
            }
            return;
        }
        if (i17 == 5) {
            java.lang.Object[] objArr4 = (java.lang.Object[]) message.obj;
            if (m104765xfb80ca96 != null) {
                m104765xfb80ca96.w((java.lang.String) objArr4[2], (java.lang.String) objArr4[3], (java.lang.Object[]) objArr4[4]);
            }
            if (m104765xfb80ca96 == null || m104765xfb80ca96 == m104764xbfc5eacb) {
                java.util.List<java.lang.Object[]> list4 = f55940x42581fe6;
                synchronized (list4) {
                    list4.add(objArr4);
                }
                return;
            }
            return;
        }
        if (i17 == 6) {
            java.lang.Object[] objArr5 = (java.lang.Object[]) message.obj;
            if (m104765xfb80ca96 != null) {
                m104765xfb80ca96.e((java.lang.String) objArr5[2], (java.lang.String) objArr5[3], (java.lang.Object[]) objArr5[4]);
            }
            if (m104765xfb80ca96 == null || m104765xfb80ca96 == m104764xbfc5eacb) {
                java.util.List<java.lang.Object[]> list5 = f55940x42581fe6;
                synchronized (list5) {
                    list5.add(objArr5);
                }
                return;
            }
            return;
        }
        if (i17 != 4001) {
            if (i17 == 4002) {
                m104778xf60b96f9(m104765xfb80ca96);
                return;
            }
            m104765xfb80ca96.e(TAG, "[-] Bad msg id: " + message.what, new java.lang.Object[0]);
            return;
        }
        java.lang.Object[] objArr6 = (java.lang.Object[]) message.obj;
        if (m104765xfb80ca96 != null) {
            m104765xfb80ca96.mo2152x58ef3d35((java.lang.String) objArr6[2], (java.lang.Throwable) objArr6[3], (java.lang.String) objArr6[4], (java.lang.Object[]) objArr6[5]);
        }
        if (m104765xfb80ca96 == null || m104765xfb80ca96 == m104764xbfc5eacb) {
            java.util.List<java.lang.Object[]> list6 = f55940x42581fe6;
            synchronized (list6) {
                list6.add(objArr6);
            }
        }
    }

    /* renamed from: handleMessage_$noinline$ */
    private void m104777x1c798ba6(android.os.Message message) {
        try {
            m104775xdfaad312();
        } finally {
            m104776xebe8cb7f(message);
        }
    }

    /* renamed from: printPendingLogs */
    private static void m104778xf60b96f9(final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp tinkerLogImp) {
        java.util.List<java.lang.Object[]> list = f55940x42581fe6;
        synchronized (list) {
            if (tinkerLogImp != null) {
                if (!list.isEmpty()) {
                    new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.1
                        @Override // java.lang.Runnable
                        public void run() {
                            final java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.ENGLISH);
                            synchronized (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.HandlerC26644x1d5f3053.f55940x42581fe6) {
                                for (final java.lang.Object[] objArr : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.HandlerC26644x1d5f3053.f55940x42581fe6) {
                                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.HandlerC26644x1d5f3053.f55939x1945e0a7.post(new java.lang.Runnable() { // from class: com.tencent.tinker.loader.shareutil.TinkerLogInlineFence.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            java.lang.String str = "[PendingLog @ " + simpleDateFormat.format(new java.util.Date(((java.lang.Long) objArr[1]).longValue())) + "] ";
                                            int intValue = ((java.lang.Integer) objArr[0]).intValue();
                                            if (intValue == 2) {
                                                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp.this.v((java.lang.String) objArr[2], str + ((java.lang.String) objArr[3]), (java.lang.Object[]) objArr[4]);
                                                return;
                                            }
                                            if (intValue == 3) {
                                                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp.this.d((java.lang.String) objArr[2], str + ((java.lang.String) objArr[3]), (java.lang.Object[]) objArr[4]);
                                                return;
                                            }
                                            if (intValue == 4) {
                                                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp.this.i((java.lang.String) objArr[2], str + ((java.lang.String) objArr[3]), (java.lang.Object[]) objArr[4]);
                                                return;
                                            }
                                            if (intValue == 5) {
                                                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp.this.w((java.lang.String) objArr[2], str + ((java.lang.String) objArr[3]), (java.lang.Object[]) objArr[4]);
                                                return;
                                            }
                                            if (intValue == 6) {
                                                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp.this.e((java.lang.String) objArr[2], str + ((java.lang.String) objArr[3]), (java.lang.Object[]) objArr[4]);
                                                return;
                                            }
                                            if (intValue != 4001) {
                                                return;
                                            }
                                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp tinkerLogImp2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.TinkerLogImp.this;
                                            java.lang.Object[] objArr2 = objArr;
                                            tinkerLogImp2.mo2152x58ef3d35((java.lang.String) objArr2[2], (java.lang.Throwable) objArr2[3], str + ((java.lang.String) objArr[4]), (java.lang.Object[]) objArr[5]);
                                        }
                                    });
                                }
                                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.HandlerC26644x1d5f3053.f55940x42581fe6.clear();
                            }
                        }
                    }, "tinker_log_printer").start();
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        m104777x1c798ba6(message);
    }
}
