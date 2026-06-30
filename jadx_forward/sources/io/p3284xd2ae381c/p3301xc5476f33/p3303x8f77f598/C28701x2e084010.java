package io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598;

/* renamed from: io.flutter.plugin.editing.TextInputPlugin */
/* loaded from: classes15.dex */
public class C28701x2e084010 implements io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher {
    private static final java.lang.String TAG = "TextInputPlugin";
    private final android.view.autofill.AutofillManager afm;

    /* renamed from: autofillConfiguration */
    private android.util.SparseArray<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration> f71705x8cd85264;

    /* renamed from: configuration */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration f71706x733374f6;

    /* renamed from: imeSyncCallback */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921 f71707x466c2661;

    /* renamed from: inputTarget */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget f71708xee6c35fb = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.NO_TARGET, 0);

    /* renamed from: isInputConnectionLocked */
    private boolean f71709x4f174868;

    /* renamed from: lastClientRect */
    private android.graphics.Rect f71710x4e2b8f85;

    /* renamed from: lastInputConnection */
    private android.view.inputmethod.InputConnection f71711xfc27e4d2;

    /* renamed from: mEditable */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a f71712x848095f1;

    /* renamed from: mImm */
    private final android.view.inputmethod.InputMethodManager f71713x32ac1c;

    /* renamed from: mLastKnownFrameworkTextEditingState */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState f71714xf9376944;

    /* renamed from: mRestartInputPending */
    private boolean f71715x509db46f;

    /* renamed from: mView */
    private final android.view.View f71716x628b0b2;

    /* renamed from: mWxInputConfiguration */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration f71717xefffb61a;

    /* renamed from: mWxKeyboardAction */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e f71718x827e9ccb;

    /* renamed from: platformViewsController */
    private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 f71719x15cba3b7;

    /* renamed from: platformViewsController2 */
    private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b f71720xa3a8d35b;

    /* renamed from: scribeChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679 f71721xebd32699;

    /* renamed from: textInputChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6 f71722xda083a6;

    /* renamed from: io.flutter.plugin.editing.TextInputPlugin$InputTarget */
    /* loaded from: classes15.dex */
    public static class InputTarget {

        /* renamed from: id, reason: collision with root package name */
        int f374768id;

        /* renamed from: type */
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type f71728x368f3a;

        /* renamed from: io.flutter.plugin.editing.TextInputPlugin$InputTarget$Type */
        /* loaded from: classes15.dex */
        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type type, int i17) {
            this.f71728x368f3a = type;
            this.f374768id = i17;
        }
    }

    /* renamed from: io.flutter.plugin.editing.TextInputPlugin$MinMax */
    /* loaded from: classes15.dex */
    public interface MinMax {
        /* renamed from: inspect */
        void mo138563x74ac6214(double d17, double d18);
    }

    public C28701x2e084010(android.view.View view, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6 c28675xdb64c7c6, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679 c28668x1b725679, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b c28730x2376f77b) {
        this.f71716x628b0b2 = view;
        this.f71712x848095f1 = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a(null, view);
        this.f71713x32ac1c = (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method");
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 26) {
            this.afm = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        } else {
            this.afm = null;
        }
        if (i17 >= 30) {
            io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921 c28695x56760921 = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921(view);
            this.f71707x466c2661 = c28695x56760921;
            c28695x56760921.m138482x74ae259b();
        }
        this.f71722xda083a6 = c28675xdb64c7c6;
        c28675xdb64c7c6.m138365x45ee28e(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: clearClient */
            public void mo44272x85bce878() {
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.m138547x2b0abb();
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: finishAutofillContext */
            public void mo44273xda74508a(boolean z17) {
                if (android.os.Build.VERSION.SDK_INT < 26 || io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.afm == null) {
                    return;
                }
                if (z17) {
                    io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.afm.commit();
                } else {
                    io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.afm.cancel();
                }
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: hide */
            public void mo44274x30dd42() {
                if (io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.f71708xee6c35fb.f71728x368f3a == io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                    io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.m138541x7012796b();
                } else if (io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.f71718x827e9ccb == null || !io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.f71718x827e9ccb.mo65918x3f895349()) {
                    io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this;
                    c28701x2e084010.m138535xcfc8637b(c28701x2e084010.f71716x628b0b2);
                }
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: requestAutofill */
            public void mo44275xf01abb61() {
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.m138540x81c0a009();
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: sendAppPrivateCommand */
            public void mo44276x9a2d9221(java.lang.String str, android.os.Bundle bundle) {
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.m138557x8d320954(str, bundle);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: setClient */
            public void mo44277x75f4acd(int i18, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration) {
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.m138558x6e797806(i18, configuration);
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.f71717xefffb61a = configuration.f71528x8719fa0d;
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: setEditableSizeAndTransform */
            public void mo44278x3608b2fc(double d17, double d18, double[] dArr) {
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.m138542xbcd5d717(d17, d18, dArr);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: setEditingState */
            public void mo44279x359d2b5b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState) {
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this;
                c28701x2e084010.m138559xa0e4c9d4(c28701x2e084010.f71716x628b0b2, textEditState);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: setPlatformViewClient */
            public void mo44280x9713fa5(int i18, boolean z17) {
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.m138543x4d51762e(i18, z17);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: setTextSelectionState */
            public void mo44281x484e5cf4(java.util.Map<java.lang.String, java.lang.Integer> map) {
                io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.f71712x848095f1.m138507x69131359(map);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputMethodHandler
            /* renamed from: show */
            public void mo44282x35dafd() {
                if (io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.f71718x827e9ccb == null || !io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.f71718x827e9ccb.mo65919xeb3e6604(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.f71716x628b0b2, io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this.f71717xefffb61a)) {
                    io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.this;
                    c28701x2e084010.m138561x9ab5a820(c28701x2e084010.f71716x628b0b2);
                }
            }
        });
        c28675xdb64c7c6.m138362x951f73c1();
        this.f71721xebd32699 = c28668x1b725679;
        this.f71719x15cba3b7 = c28724xcf987b97;
        c28724xcf987b97.mo138624x6ac05f2b(this);
        this.f71720xa3a8d35b = c28730x2376f77b;
        c28730x2376f77b.m138780x6ac05f2b(this);
    }

    /* renamed from: composingChanged */
    private static boolean m138534x3174b1e5(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState2) {
        int i17 = textEditState.f71542xf18c188c - textEditState.f71543xbfb02bd3;
        if (i17 != textEditState2.f71542xf18c188c - textEditState2.f71543xbfb02bd3) {
            return true;
        }
        for (int i18 = 0; i18 < i17; i18++) {
            if (textEditState.f71546x36452d.charAt(textEditState.f71543xbfb02bd3 + i18) != textEditState2.f71546x36452d.charAt(textEditState2.f71543xbfb02bd3 + i18)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideTextInput */
    public void m138535xcfc8637b(android.view.View view) {
        m138541x7012796b();
        this.f71713x32ac1c.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    /* renamed from: inputTypeFromTextInputType */
    private static int m138536x1b578629(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.InputType inputType, boolean z17, boolean z18, boolean z19, boolean z27, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextCapitalization textCapitalization) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType textInputType = inputType.f71535x368f3a;
        if (textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.DATETIME) {
            return 4;
        }
        if (textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.NUMBER) {
            int i17 = inputType.f71534xf26260e6 ? 4098 : 2;
            return inputType.f71533x395e5ac7 ? i17 | 8192 : i17;
        }
        if (textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.PHONE) {
            return 3;
        }
        if (textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.NONE) {
            return 0;
        }
        int i18 = textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.MULTILINE ? 131073 : (textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.EMAIL_ADDRESS || textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.TWITTER) ? 33 : (textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.URL || textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.WEB_SEARCH) ? 17 : textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.VISIBLE_PASSWORD ? 145 : textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.NAME ? 97 : textInputType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.POSTAL_ADDRESS ? 113 : 1;
        if (z17) {
            i18 = i18 | 524288 | 128;
        } else {
            if (z18) {
                i18 |= 32768;
            }
            if (!z19) {
                i18 = i18 | 524288 | 144;
            }
        }
        return textCapitalization == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextCapitalization.CHARACTERS ? i18 | 4096 : textCapitalization == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextCapitalization.WORDS ? i18 | 8192 : textCapitalization == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextCapitalization.SENTENCES ? i18 | 16384 : i18;
    }

    /* renamed from: isRestartAlwaysRequired */
    private boolean m138537x6d57c7b3() {
        if (this.f71713x32ac1c.getCurrentInputMethodSubtype() == null || !android.os.Build.MANUFACTURER.equals("samsung")) {
            return false;
        }
        android.content.ContentResolver contentResolver = this.f71716x628b0b2.getContext().getContentResolver();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("default_input_method");
        arrayList.add(contentResolver);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        java.lang.String str = (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "io/flutter/plugin/editing/TextInputPlugin", "isRestartAlwaysRequired", "()Z", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        if (str == null) {
            return false;
        }
        return str.contains("Samsung");
    }

    /* renamed from: needsAutofill */
    private boolean m138538xa4af656f() {
        return this.f71705x8cd85264 != null;
    }

    /* renamed from: notifyValueChanged */
    private void m138539x996c5dec(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 26 || this.afm == null || !m138538xa4af656f()) {
            return;
        }
        this.afm.notifyValueChanged(this.f71716x628b0b2, this.f71706x733374f6.f71517x55c963b2.f71532xf885435a.hashCode(), android.view.autofill.AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyViewEntered */
    public void m138540x81c0a009() {
        if (android.os.Build.VERSION.SDK_INT < 26 || this.afm == null || !m138538xa4af656f()) {
            return;
        }
        java.lang.String str = this.f71706x733374f6.f71517x55c963b2.f71532xf885435a;
        int[] iArr = new int[2];
        this.f71716x628b0b2.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect(this.f71710x4e2b8f85);
        rect.offset(iArr[0], iArr[1]);
        this.afm.notifyViewEntered(this.f71716x628b0b2, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyViewExited */
    public void m138541x7012796b() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration;
        if (android.os.Build.VERSION.SDK_INT < 26 || this.afm == null || (configuration = this.f71706x733374f6) == null || configuration.f71517x55c963b2 == null || !m138538xa4af656f()) {
            return;
        }
        this.afm.notifyViewExited(this.f71716x628b0b2, this.f71706x733374f6.f71517x55c963b2.f71532xf885435a.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveEditableSizeAndTransform */
    public void m138542xbcd5d717(double d17, double d18, final double[] dArr) {
        final double[] dArr2 = new double[4];
        final boolean z17 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d19 = dArr[12];
        double d27 = dArr[15];
        double d28 = d19 / d27;
        dArr2[1] = d28;
        dArr2[0] = d28;
        double d29 = dArr[13] / d27;
        dArr2[3] = d29;
        dArr2[2] = d29;
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.MinMax minMax = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.MinMax
            /* renamed from: inspect */
            public void mo138563x74ac6214(double d37, double d38) {
                double d39 = 1.0d;
                if (!z17) {
                    double[] dArr3 = dArr;
                    d39 = 1.0d / (((dArr3[3] * d37) + (dArr3[7] * d38)) + dArr3[15]);
                }
                double[] dArr4 = dArr;
                double d47 = ((dArr4[0] * d37) + (dArr4[4] * d38) + dArr4[12]) * d39;
                double d48 = ((dArr4[1] * d37) + (dArr4[5] * d38) + dArr4[13]) * d39;
                double[] dArr5 = dArr2;
                if (d47 < dArr5[0]) {
                    dArr5[0] = d47;
                } else if (d47 > dArr5[1]) {
                    dArr5[1] = d47;
                }
                if (d48 < dArr5[2]) {
                    dArr5[2] = d48;
                } else if (d48 > dArr5[3]) {
                    dArr5[3] = d48;
                }
            }
        };
        minMax.mo138563x74ac6214(d17, 0.0d);
        minMax.mo138563x74ac6214(d17, d18);
        minMax.mo138563x74ac6214(0.0d, d18);
        java.lang.Float valueOf = java.lang.Float.valueOf(this.f71716x628b0b2.getContext().getResources().getDisplayMetrics().density);
        this.f71710x4e2b8f85 = new android.graphics.Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) java.lang.Math.ceil(dArr2[1] * valueOf.floatValue()), (int) java.lang.Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlatformViewTextInputClient */
    public void m138543x4d51762e(int i17, boolean z17) {
        if (!z17) {
            this.f71708xee6c35fb = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i17);
            this.f71711xfc27e4d2 = null;
        } else {
            this.f71716x628b0b2.requestFocus();
            this.f71708xee6c35fb = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i17);
            this.f71713x32ac1c.restartInput(this.f71716x628b0b2);
            this.f71715x509db46f = false;
        }
    }

    /* renamed from: updateAutofillConfigurationIfNeeded */
    private void m138544x5e0cc16d(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (configuration == null || configuration.f71517x55c963b2 == null) {
            this.f71705x8cd85264 = null;
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration[] configurationArr = configuration.f71522xb4057eb9;
        android.util.SparseArray<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration> sparseArray = new android.util.SparseArray<>();
        this.f71705x8cd85264 = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.f71517x55c963b2.f71532xf885435a.hashCode(), configuration);
            return;
        }
        for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration2 : configurationArr) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill autofill = configuration2.f71517x55c963b2;
            if (autofill != null) {
                this.f71705x8cd85264.put(autofill.f71532xf885435a.hashCode(), configuration2);
                this.afm.notifyValueChanged(this.f71716x628b0b2, autofill.f71532xf885435a.hashCode(), android.view.autofill.AutofillValue.forText(autofill.f71529x901d9ca7.f71546x36452d));
            }
        }
    }

    /* renamed from: autofill */
    public void m138545x55c963b2(android.util.SparseArray<android.view.autofill.AutofillValue> sparseArray) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill autofill;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill autofill2;
        if (android.os.Build.VERSION.SDK_INT < 26 || (configuration = this.f71706x733374f6) == null || this.f71705x8cd85264 == null || (autofill = configuration.f71517x55c963b2) == null) {
            return;
        }
        java.util.HashMap<java.lang.String, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState> hashMap = new java.util.HashMap<>();
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration2 = this.f71705x8cd85264.get(sparseArray.keyAt(i17));
            if (configuration2 != null && (autofill2 = configuration2.f71517x55c963b2) != null) {
                java.lang.String charSequence = sparseArray.valueAt(i17).getTextValue().toString();
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (autofill2.f71532xf885435a.equals(autofill.f71532xf885435a)) {
                    this.f71712x848095f1.m138506x359d2b5b(textEditState);
                } else {
                    hashMap.put(autofill2.f71532xf885435a, textEditState);
                }
            }
        }
        this.f71722xda083a6.m138369x7e8add52(this.f71708xee6c35fb.f374768id, hashMap);
    }

    /* renamed from: clearPlatformViewClient */
    public void m138546x90d0b4d0(int i17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget inputTarget = this.f71708xee6c35fb;
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type type = inputTarget.f71728x368f3a;
        if ((type == io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.f374768id == i17) {
            this.f71708xee6c35fb = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.NO_TARGET, 0);
            m138541x7012796b();
            this.f71713x32ac1c.hideSoftInputFromWindow(this.f71716x628b0b2.getApplicationWindowToken(), 0);
            this.f71713x32ac1c.restartInput(this.f71716x628b0b2);
            this.f71715x509db46f = false;
        }
    }

    /* renamed from: clearTextInputClient */
    public void m138547x2b0abb() {
        if (this.f71708xee6c35fb.f71728x368f3a == io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f71712x848095f1.m138504x1f50a051(this);
        m138541x7012796b();
        this.f71706x733374f6 = null;
        m138544x5e0cc16d(null);
        this.f71708xee6c35fb = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.NO_TARGET, 0);
        this.f71710x4e2b8f85 = null;
        this.f71713x32ac1c.restartInput(this.f71716x628b0b2);
    }

    /* renamed from: createInputConnection */
    public android.view.inputmethod.InputConnection m138548x7ad57dac(android.view.View view, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6 c28564x6c2609a6, android.view.inputmethod.EditorInfo editorInfo) {
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget inputTarget = this.f71708xee6c35fb;
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type type = inputTarget.f71728x368f3a;
        if (type == io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.NO_TARGET) {
            this.f71711xfc27e4d2 = null;
            return null;
        }
        if (type == io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (type == io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f71709x4f174868) {
                return this.f71711xfc27e4d2;
            }
            android.view.inputmethod.InputConnection onCreateInputConnection = this.f71719x15cba3b7.mo138639xbd854120(inputTarget.f374768id).onCreateInputConnection(editorInfo);
            this.f71711xfc27e4d2 = onCreateInputConnection;
            return onCreateInputConnection;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration = this.f71706x733374f6;
        int m138536x1b578629 = m138536x1b578629(configuration.f71525x65be6624, configuration.f71526xcf9191f2, configuration.f71516x82cbd7db, configuration.f71521xf398796c, configuration.f71520x1cfb2b6c, configuration.f71527x7f811c89);
        editorInfo.inputType = m138536x1b578629;
        editorInfo.imeOptions = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432;
        if (android.os.Build.VERSION.SDK_INT >= 26 && !this.f71706x733374f6.f71520x1cfb2b6c) {
            editorInfo.imeOptions = 33554432 | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb;
        }
        java.lang.Integer num = this.f71706x733374f6.f71524xce1d42a0;
        int intValue = num == null ? (m138536x1b578629 & 131072) != 0 ? 1 : 6 : num.intValue();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration2 = this.f71706x733374f6;
        java.lang.String str = configuration2.f71515x5d51825e;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (configuration2.f71523xeddc60d2 != null) {
            editorInfo.hintLocales = new android.os.LocaleList(this.f71706x733374f6.f71523xeddc60d2);
        }
        java.lang.String[] strArr = this.f71706x733374f6.f71518x17af0b75;
        if (strArr != null) {
            q3.a.a(editorInfo, strArr);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d c28696x8a22c93d = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d(view, this.f71708xee6c35fb.f374768id, this.f71722xda083a6, this.f71721xebd32699, c28564x6c2609a6, this.f71712x848095f1, editorInfo);
        editorInfo.initialSelStart = this.f71712x848095f1.m138503x6f2c472c();
        editorInfo.initialSelEnd = this.f71712x848095f1.m138502xffd93625();
        this.f71711xfc27e4d2 = c28696x8a22c93d;
        return c28696x8a22c93d;
    }

    /* renamed from: destroy */
    public void m138549x5cd39ffa() {
        this.f71719x15cba3b7.mo138636xfe0fb01d();
        this.f71720xa3a8d35b.m138789xfe0fb01d();
        this.f71722xda083a6.m138365x45ee28e(null);
        m138541x7012796b();
        this.f71712x848095f1.m138504x1f50a051(this);
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921 c28695x56760921 = this.f71707x466c2661;
        if (c28695x56760921 != null) {
            c28695x56760921.m138483xc84af884();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r7 == r1.f71542xf18c188c) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a.EditingStateWatcher
    /* renamed from: didChangeEditingState */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo138491x3186bc88(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.f71712x848095f1
            java.lang.String r9 = r9.toString()
            r8.m138539x996c5dec(r9)
        Lb:
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.f71712x848095f1
            int r9 = r9.m138503x6f2c472c()
            io.flutter.plugin.editing.ListenableEditingState r10 = r8.f71712x848095f1
            int r10 = r10.m138502xffd93625()
            io.flutter.plugin.editing.ListenableEditingState r11 = r8.f71712x848095f1
            int r11 = r11.m138501xae47f8c9()
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.f71712x848095f1
            int r7 = r0.m138500x527eab02()
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.f71712x848095f1
            java.util.ArrayList r0 = r0.m138499x21fccd0d()
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r1 = r8.f71714xf9376944
            if (r1 == 0) goto L52
            io.flutter.plugin.editing.ListenableEditingState r1 = r8.f71712x848095f1
            java.lang.String r1 = r1.toString()
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r2 = r8.f71714xf9376944
            java.lang.String r2 = r2.f71546x36452d
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r1 = r8.f71714xf9376944
            int r2 = r1.f71545x80947a36
            if (r9 != r2) goto L50
            int r2 = r1.f71544x9ee6a3af
            if (r10 != r2) goto L50
            int r2 = r1.f71543xbfb02bd3
            if (r11 != r2) goto L50
            int r1 = r1.f71542xf18c188c
            if (r7 != r1) goto L50
            goto L52
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            if (r1 != 0) goto La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "send EditingState to flutter: "
            r1.<init>(r2)
            io.flutter.plugin.editing.ListenableEditingState r2 = r8.f71712x848095f1
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            io.p3284xd2ae381c.Log.v(r2, r1)
            io.flutter.embedding.engine.systemchannels.TextInputChannel$Configuration r1 = r8.f71706x733374f6
            boolean r1 = r1.f71519x52fd1c34
            if (r1 == 0) goto L83
            io.flutter.embedding.engine.systemchannels.TextInputChannel r1 = r8.f71722xda083a6
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r2 = r8.f71708xee6c35fb
            int r2 = r2.f374768id
            r1.m138368xc6c02303(r2, r0)
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.f71712x848095f1
            r0.m138497x526f9b08()
            goto L96
        L83:
            io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = r8.f71722xda083a6
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r1 = r8.f71708xee6c35fb
            int r1 = r1.f374768id
            io.flutter.plugin.editing.ListenableEditingState r2 = r8.f71712x848095f1
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.m138367x64794542(r1, r2, r3, r4, r5, r6)
        L96:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r6 = new io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.f71712x848095f1
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f71714xf9376944 = r6
            goto Lae
        La9:
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.f71712x848095f1
            r9.m138497x526f9b08()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.mo138491x3186bc88(boolean, boolean, boolean):void");
    }

    /* renamed from: getEditable */
    public android.text.Editable m138550xdb5d2bda() {
        return this.f71712x848095f1;
    }

    /* renamed from: getImeSyncCallback */
    public io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28695x56760921 m138551x2acdf82b() {
        return this.f71707x466c2661;
    }

    /* renamed from: getInputMethodManager */
    public android.view.inputmethod.InputMethodManager m138552x6460f9d8() {
        return this.f71713x32ac1c;
    }

    /* renamed from: getLastInputConnection */
    public android.view.inputmethod.InputConnection m138553x5457c19c() {
        return this.f71711xfc27e4d2;
    }

    /* renamed from: handleKeyEvent */
    public boolean m138554x47b131c3(android.view.KeyEvent keyEvent) {
        android.view.inputmethod.InputConnection inputConnection;
        if (!m138552x6460f9d8().isAcceptingText() || (inputConnection = this.f71711xfc27e4d2) == null) {
            return false;
        }
        return inputConnection instanceof io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d ? ((io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d) inputConnection).m138492x47b131c3(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    /* renamed from: lockPlatformViewInputConnection */
    public void m138555x859f2945() {
        if (this.f71708xee6c35fb.f71728x368f3a == io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f71709x4f174868 = true;
        }
    }

    /* renamed from: onProvideAutofillVirtualStructure */
    public void m138556xe9ac3c5c(android.view.ViewStructure viewStructure, int i17) {
        android.graphics.Rect rect;
        if (android.os.Build.VERSION.SDK_INT < 26 || !m138538xa4af656f()) {
            return;
        }
        java.lang.String str = this.f71706x733374f6.f71517x55c963b2.f71532xf885435a;
        android.view.autofill.AutofillId autofillId = viewStructure.getAutofillId();
        for (int i18 = 0; i18 < this.f71705x8cd85264.size(); i18++) {
            int keyAt = this.f71705x8cd85264.keyAt(i18);
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill autofill = this.f71705x8cd85264.valueAt(i18).f71517x55c963b2;
            if (autofill != null) {
                viewStructure.addChildCount(1);
                android.view.ViewStructure newChild = viewStructure.newChild(i18);
                newChild.setAutofillId(autofillId, keyAt);
                java.lang.String[] strArr = autofill.f71531x5eaf2cc;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                java.lang.String str2 = autofill.f71530xa827fc54;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.f71710x4e2b8f85) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(android.view.autofill.AutofillValue.forText(autofill.f71529x901d9ca7.f71546x36452d));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f71710x4e2b8f85.height());
                    newChild.setAutofillValue(android.view.autofill.AutofillValue.forText(this.f71712x848095f1));
                }
            }
        }
    }

    /* renamed from: sendTextInputAppPrivateCommand */
    public void m138557x8d320954(java.lang.String str, android.os.Bundle bundle) {
        this.f71713x32ac1c.sendAppPrivateCommand(this.f71716x628b0b2, str, bundle);
    }

    /* renamed from: setTextInputClient */
    public void m138558x6e797806(int i17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration) {
        m138541x7012796b();
        this.f71706x733374f6 = configuration;
        this.f71708xee6c35fb = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.FRAMEWORK_CLIENT, i17);
        this.f71712x848095f1.m138504x1f50a051(this);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration.Autofill autofill = configuration.f71517x55c963b2;
        this.f71712x848095f1 = new io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28697x79969c3a(autofill != null ? autofill.f71529x901d9ca7 : null, this.f71716x628b0b2);
        m138544x5e0cc16d(configuration);
        this.f71715x509db46f = true;
        m138562x8df3878c();
        this.f71710x4e2b8f85 = null;
        this.f71712x848095f1.m138495x481aefee(this);
    }

    /* renamed from: setTextInputEditingState */
    public void m138559xa0e4c9d4(android.view.View view, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextEditState textEditState2;
        if (!this.f71715x509db46f && (textEditState2 = this.f71714xf9376944) != null && textEditState2.m138382x6bd44c55()) {
            boolean m138534x3174b1e5 = m138534x3174b1e5(this.f71714xf9376944, textEditState);
            this.f71715x509db46f = m138534x3174b1e5;
            if (m138534x3174b1e5) {
                io.p3284xd2ae381c.Log.i(TAG, "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f71714xf9376944 = textEditState;
        this.f71712x848095f1.m138506x359d2b5b(textEditState);
        if (this.f71715x509db46f) {
            this.f71713x32ac1c.restartInput(view);
            this.f71715x509db46f = false;
        }
    }

    /* renamed from: setWxKeyboardAction */
    public void m138560xa83bcec0(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e interfaceC28702x2a2b165e) {
        this.f71718x827e9ccb = interfaceC28702x2a2b165e;
    }

    /* renamed from: showTextInput */
    public void m138561x9ab5a820(android.view.View view) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.InputType inputType;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.Configuration configuration = this.f71706x733374f6;
        if (configuration != null && (inputType = configuration.f71525x65be6624) != null && inputType.f71535x368f3a == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.TextInputType.NONE) {
            m138535xcfc8637b(view);
        } else {
            view.requestFocus();
            this.f71713x32ac1c.showSoftInput(view, 0);
        }
    }

    /* renamed from: unlockPlatformViewInputConnection */
    public void m138562x8df3878c() {
        if (this.f71708xee6c35fb.f71728x368f3a == io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010.InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f71709x4f174868 = false;
        }
    }
}
