package vx5;

/* loaded from: classes13.dex */
public class b0 extends com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vx5.i0 f522863a;

    public b0(vx5.i0 i0Var) {
        this.f522863a = i0Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: getVideoLoadingProgressView */
    public android.view.View mo120290xc5a092c9() {
        vx5.i0 i0Var = this.f522863a;
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        return s0Var != null ? s0Var.a() : android.view.LayoutInflater.from(i0Var.f522886d.getContext()).inflate(com.p314xaae8f345.p3222x9cba06de.R.C27875xbddafb2a.f61380xb21f9c34, (android.view.ViewGroup) null);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onConsoleMessage */
    public boolean mo120293x3424fa6f(android.webkit.ConsoleMessage consoleMessage) {
        android.webkit.ConsoleMessage.MessageLevel messageLevel = android.webkit.ConsoleMessage.MessageLevel.ERROR;
        android.webkit.ConsoleMessage.MessageLevel messageLevel2 = consoleMessage.messageLevel();
        vx5.i0 i0Var = this.f522863a;
        if (messageLevel == messageLevel2) {
            i0Var.getClass();
        }
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        return s0Var != null ? s0Var.b(consoleMessage) : super.mo120293x3424fa6f(consoleMessage);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onCreateWindow */
    public boolean mo120294xd703478b(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, boolean z17, boolean z18, android.os.Message message) {
        vx5.i0 i0Var = this.f522863a;
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        if (s0Var == null) {
            return super.mo120294xd703478b(c27847xac2547f9, z17, z18, message);
        }
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = i0Var.f522886d;
        s0Var.getClass();
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onExitFullscreenVideo */
    public void mo120295x846efc23(android.graphics.Bitmap bitmap) {
        by5.c4.f("PinusWebView", "onExitFullscreenVideo");
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = this.f522863a.f522891i;
        if (s0Var != null) {
            s0Var.e(bitmap);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onGeolocationPermissionsHidePrompt */
    public void mo120296xfdd89c83() {
        by5.c4.f("PinusWebView", "onGeolocationPermissionsHidePrompt");
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = this.f522863a.f522891i;
        if (s0Var != null) {
            s0Var.f();
        } else {
            super.mo120296xfdd89c83();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onGeolocationPermissionsShowPrompt */
    public void mo120297x179921fe(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        by5.c4.f("PinusWebView", "onGeolocationPermissionsShowPrompt");
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = this.f522863a.f522891i;
        if (s0Var != null) {
            s0Var.g(str, callback);
        } else {
            super.mo120297x179921fe(str, callback);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onGetSampleString */
    public void mo120298x12933cf2(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.util.Map map) {
        com.p314xaae8f345.p3210x3857dc.d3 d3Var = this.f522863a.f522901v;
        d3Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(map);
        by5.c4.b("XWebTranslateLogic", "translate: OnGetSampleString orgHashMap size = " + map.size() + " resultHashMap size = " + hashMap.size());
        bundle.putSerializable("sample_hashmap", hashMap);
        com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 c27839xa92bc749 = ((vx5.i0) d3Var.f301778a).f522898s;
        if (c27839xa92bc749 != null) {
            c27839xa92bc749.mo52190xdaaffcf0("onGetSampleString", bundle);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onGetTranslateString */
    public void mo120299xbf700d08(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.util.Map map) {
        com.p314xaae8f345.p3210x3857dc.d3 d3Var = this.f522863a.f522901v;
        d3Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(map);
        by5.c4.b("XWebTranslateLogic", "translate: onGetTranslateString orgHashMap size = " + map.size() + " resultHashMap size = " + hashMap.size());
        hashMap.size();
        bundle.putSerializable("translate_hashmap", hashMap);
        com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 c27839xa92bc749 = ((vx5.i0) d3Var.f301778a).f522898s;
        if (c27839xa92bc749 != null) {
            c27839xa92bc749.mo52190xdaaffcf0("onGetTranslateString", bundle);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onHideCustomView */
    public void mo120300x9cd05057() {
        by5.c4.f("PinusWebView", "onHideCustomView");
        vx5.i0 i0Var = this.f522863a;
        i0Var.f522902w = null;
        if (i0Var.f522903x) {
            i0Var.f522903x = false;
            by5.c4.f("PinusWebView", "onHideCustomView, mIsMediaPlaybackRequiresUserGesture:" + i0Var.f522904y + ", mIsVideoPlaybackRequiresUserGesture:" + i0Var.f522905z);
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.v) i0Var.f522888f.m120353xd15cf999()).a(i0Var.f522904y);
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.v) i0Var.f522888f.m120353xd15cf999()).b(i0Var.f522905z);
        }
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        if (s0Var != null ? s0Var.d() : false) {
            by5.c4.f("PinusWebView", "onHideCustomView isHandled:true");
            return;
        }
        i0Var.f522889g.setVisibility(0);
        sx5.a aVar = i0Var.f522900u;
        if (aVar != null) {
            aVar.e();
            return;
        }
        com.p314xaae8f345.p3210x3857dc.s0 s0Var2 = i0Var.f522891i;
        if (s0Var2 != null) {
            s0Var2.h();
        } else {
            super.mo120300x9cd05057();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onJsAlert */
    public boolean mo120301xfefe72b4(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.i iVar) {
        by5.c4.f("PinusWebView", "onJsAlert, message:" + str2);
        vx5.i0 i0Var = this.f522863a;
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        return s0Var != null ? s0Var.i(i0Var.f522886d, str, str2, new vx5.r(iVar)) : super.mo120301xfefe72b4(c27847xac2547f9, str, str2, iVar);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onJsAlertInner */
    public boolean mo120302x6f997c02(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return mo120301xfefe72b4(c27847xac2547f9, str, str2, new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.j(obj));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onJsConfirm */
    public boolean mo120305xa890da18(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.i iVar) {
        by5.c4.f("PinusWebView", "onJsConfirm, message:" + str2);
        vx5.i0 i0Var = this.f522863a;
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        return s0Var != null ? s0Var.j(i0Var.f522886d, str, str2, new vx5.r(iVar)) : super.mo120305xa890da18(c27847xac2547f9, str, str2, iVar);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onJsConfirmInner */
    public boolean mo120306x5f14131e(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return mo120305xa890da18(c27847xac2547f9, str, str2, new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.j(obj));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onJsPrompt */
    public boolean mo120307xfac19b0c(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.i iVar) {
        by5.c4.f("PinusWebView", "onJsPrompt, message:" + str2);
        vx5.i0 i0Var = this.f522863a;
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        return s0Var != null ? s0Var.k(i0Var.f522886d, str, str2, str3, new vx5.q(iVar)) : super.mo120307xfac19b0c(c27847xac2547f9, str, str2, str3, iVar);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onJsPromptInner */
    public boolean mo120308x2db9caaa(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        return mo120307xfac19b0c(c27847xac2547f9, str, str2, str3, new com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.j(obj));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onPermissionRequest */
    public void mo120309xf4b139a1(android.webkit.PermissionRequest permissionRequest) {
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = this.f522863a.f522891i;
        if (s0Var != null) {
            s0Var.l(permissionRequest);
        } else {
            super.mo120309xf4b139a1(permissionRequest);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onPermissionRequestCanceled */
    public void mo120310x2bf4f15a(android.webkit.PermissionRequest permissionRequest) {
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = this.f522863a.f522891i;
        if (s0Var != null) {
            s0Var.m(permissionRequest);
        } else {
            super.mo120310x2bf4f15a(permissionRequest);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onProgressChanged */
    public void mo120311x95ed2be8(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, int i17) {
        vx5.i0 i0Var = this.f522863a;
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        if (s0Var != null) {
            s0Var.n(i0Var.f522886d, i17);
        } else {
            super.mo120311x95ed2be8(c27847xac2547f9, i17);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onReceivedTitle */
    public void mo120313xa8103158(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, java.lang.String str) {
        by5.c4.f("PinusWebView", "onReceivedTitle: " + str);
        vx5.i0 i0Var = this.f522863a;
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        if (s0Var != null) {
            s0Var.o(i0Var.f522886d, str);
        } else {
            super.mo120313xa8103158(c27847xac2547f9, str);
        }
        sx5.a aVar = i0Var.f522900u;
        if (aVar != null) {
            aVar.g(true, i0Var.f522886d.mo120146xc46191fe() == com.p314xaae8f345.p3210x3857dc.c1.HOOK_EVALUTE_JS);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onRequestFocus */
    public void mo120315xc18e3f08(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9) {
        vx5.i0 i0Var = this.f522863a;
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        if (s0Var == null) {
            super.mo120315xc18e3f08(c27847xac2547f9);
        } else {
            com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = i0Var.f522886d;
            s0Var.getClass();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onShowCustomView */
    public void mo120316x2f8ba052(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        boolean z17;
        boolean z18;
        by5.i0 i0Var;
        by5.i0 i0Var2;
        by5.c4.f("PinusWebView", "onShowCustomView");
        vx5.i0 i0Var3 = this.f522863a;
        i0Var3.f522902w = customViewCallback;
        if (!i0Var3.f522903x) {
            i0Var3.f522903x = true;
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.v vVar = (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.v) i0Var3.f522888f.m120353xd15cf999();
            vVar.getClass();
            try {
                synchronized (vVar) {
                    i0Var2 = vVar.f302008d;
                    if (i0Var2 == null) {
                        i0Var2 = new by5.i0(vVar.f302005a, "getMediaPlaybackRequiresUserGesture", new java.lang.Class[0]);
                        vVar.f302008d = i0Var2;
                    }
                }
                z17 = ((java.lang.Boolean) i0Var2.b(new java.lang.Object[0])).booleanValue();
            } catch (java.lang.UnsupportedOperationException unused) {
                z17 = false;
            }
            i0Var3.f522904y = z17;
            vx5.i0 i0Var4 = this.f522863a;
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.v vVar2 = (com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.v) i0Var4.f522888f.m120353xd15cf999();
            vVar2.getClass();
            try {
                synchronized (vVar2) {
                    i0Var = vVar2.R;
                    if (i0Var == null) {
                        i0Var = new by5.i0(vVar2.f302005a, "getVideoPlaybackRequiresUserGesture", new java.lang.Class[0]);
                        vVar2.R = i0Var;
                    }
                }
                z18 = ((java.lang.Boolean) i0Var.b(new java.lang.Object[0])).booleanValue();
            } catch (java.lang.UnsupportedOperationException unused2) {
                z18 = false;
            }
            i0Var4.f522905z = z18;
            by5.c4.f("PinusWebView", "onShowCustomView, mIsMediaPlaybackRequiresUserGesture:" + this.f522863a.f522904y + ", mIsVideoPlaybackRequiresUserGesture:" + this.f522863a.f522905z);
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.v) this.f522863a.f522888f.m120353xd15cf999()).a(false);
            ((com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.v) this.f522863a.f522888f.m120353xd15cf999()).b(false);
        }
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = this.f522863a.f522891i;
        boolean c17 = s0Var != null ? s0Var.c(view, customViewCallback) : false;
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null) {
            n1Var.b(577L, 52L, 1L);
            by5.s0.f118128c.b(1749L, 4L, 1L);
        }
        if (c17) {
            by5.c4.f("PinusWebView", "onShowCustomView isHandled:true");
            return;
        }
        this.f522863a.f522889g.setVisibility(4);
        vx5.i0 i0Var5 = this.f522863a;
        sx5.a aVar = i0Var5.f522900u;
        if (aVar != null) {
            by5.s0.r(com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS, aVar instanceof sx5.a1, i0Var5.mo120156xb5887639());
            this.f522863a.f522900u.b(view, customViewCallback);
            return;
        }
        com.p314xaae8f345.p3210x3857dc.s0 s0Var2 = i0Var5.f522891i;
        if (s0Var2 != null) {
            s0Var2.p(view, customViewCallback);
        } else {
            super.mo120316x2f8ba052(view, customViewCallback);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27846x192ee839
    /* renamed from: onShowFileChooser */
    public boolean mo120317xca5d5903(com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27847xac2547f9 c27847xac2547f9, android.webkit.ValueCallback valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        by5.c4.f("PinusWebView", "onShowFileChooser last method");
        vx5.i0 i0Var = this.f522863a;
        com.p314xaae8f345.p3210x3857dc.s0 s0Var = i0Var.f522891i;
        return s0Var != null ? s0Var.q(i0Var.f522886d, valueCallback, new vx5.o(fileChooserParams)) : super.mo120317xca5d5903(c27847xac2547f9, valueCallback, fileChooserParams);
    }
}
