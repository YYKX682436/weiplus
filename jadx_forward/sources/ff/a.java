package ff;

/* loaded from: classes15.dex */
public class a implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ff.e f343105a;

    public a(ff.e eVar) {
        this.f343105a = eVar;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: clipboardHasStrings */
    public boolean mo129461x6f89cbe() {
        android.content.ClipDescription primaryClipDescription;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) this.f343105a.f343112a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: getClipboardData */
    public java.lang.CharSequence mo129462xcb2742aa(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.ClipboardContentFormat clipboardContentFormat) {
        android.app.Activity activity = this.f343105a.f343112a;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) activity.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip()) {
            try {
                android.content.ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (clipboardContentFormat != null && clipboardContentFormat != io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.ClipboardContentFormat.PLAIN_TEXT) {
                    return null;
                }
                android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt.getUri() != null) {
                    activity.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
                }
                return itemAt.coerceToText(activity);
            } catch (java.io.FileNotFoundException unused) {
                return null;
            } catch (java.lang.SecurityException e17) {
                io.p3284xd2ae381c.Log.w("SkylinePlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e17);
                return null;
            }
        }
        return null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: playSystemSound */
    public void mo129463xa36a404c(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SoundType soundType) {
        ff.e eVar = this.f343105a;
        eVar.getClass();
        if (soundType == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SoundType.CLICK) {
            eVar.f343112a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: popSystemNavigator */
    public void mo129464x946ed657() {
        ff.e eVar = this.f343105a;
        ff.d dVar = eVar.f343114c;
        android.app.Activity activity = eVar.f343112a;
        if (!(activity instanceof p012xc85e97e9.p013x9d4bf30f.k)) {
            activity.finish();
        } else {
            try {
                ((p012xc85e97e9.p013x9d4bf30f.k) activity).mo2510x96a7816d().c();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: restoreSystemUiOverlays */
    public void mo129465xe719bf14() {
        this.f343105a.getClass();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: setApplicationSwitcherDescription */
    public void mo129466xaa98fed(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.AppSwitcherDescription description) {
        ff.e eVar = this.f343105a;
        if (eVar.f343114c != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.app.Activity activity = eVar.f343112a;
        if (i17 < 28) {
            activity.setTaskDescription(new android.app.ActivityManager.TaskDescription(description.f71334x61f7ef4, (android.graphics.Bitmap) null, description.f71333x5a72f63));
        }
        if (i17 >= 28) {
            activity.setTaskDescription(new android.app.ActivityManager.TaskDescription(description.f71334x61f7ef4, 0, description.f71333x5a72f63));
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: setClipboardData */
    public void mo129467x5dfda91e(java.lang.String str) {
        ((android.content.ClipboardManager) this.f343105a.f343112a.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", str));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: setFrameworkHandlesBack */
    public void mo129468xb9d44976(boolean z17) {
        this.f343105a.f343114c.getClass();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: setPreferredOrientations */
    public void mo129469x3268f082(int i17) {
        this.f343105a.f343112a.setRequestedOrientation(i17);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: setSystemUiChangeListener */
    public void mo129470xe725df89() {
        ff.e eVar = this.f343105a;
        android.view.View decorView = eVar.f343112a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new ff.b(eVar, decorView));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: setSystemUiOverlayStyle */
    public void mo129471x73636b86(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemChromeStyle systemChromeStyle) {
        this.f343105a.getClass();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: share */
    public void mo129472x6854fdf(java.lang.String str) {
        ff.e eVar = this.f343105a;
        eVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        android.app.Activity activity = eVar.f343112a;
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(createChooser);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/luggage/skyline/plugin/SkylinePlatformPlugin", ya.a.f77453x4b357bf, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/luggage/skyline/plugin/SkylinePlatformPlugin", ya.a.f77453x4b357bf, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: showSystemOverlays */
    public void mo129473x2e98a5cf(java.util.List list) {
        this.f343105a.getClass();
        list.size();
        for (int i17 = 0; i17 < list.size(); i17++) {
            int i18 = ff.c.f343111b[((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiOverlay) list.get(i17)).ordinal()];
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: showSystemUiMode */
    public void mo129474x8743ad03(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode systemUiMode) {
        this.f343105a.getClass();
        if (systemUiMode == io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.LEAN_BACK) {
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode systemUiMode2 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.SystemUiMode.LEAN_BACK;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.PlatformMessageHandler
    /* renamed from: vibrateHapticFeedback */
    public void mo129475x8a7eee8b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28662x49db8cf0.HapticFeedbackType hapticFeedbackType) {
        android.view.View decorView = this.f343105a.f343112a.getWindow().getDecorView();
        int i17 = ff.c.f343110a[hapticFeedbackType.ordinal()];
        if (i17 == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i17 == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i17 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i17 == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i17 != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }
}
