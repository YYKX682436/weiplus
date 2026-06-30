package si0;

/* loaded from: classes4.dex */
public final class y0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24809x5025e10f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f489743d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f489744e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f489745f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f489746g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.C10703xdbfd94c7 f489747h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f489748i;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.flutter.plugin.SnsLanguageFlutterPlugin$translateResultListener$1] */
    public y0() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f489747h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4>(a0Var) { // from class: com.tencent.mm.flutter.plugin.SnsLanguageFlutterPlugin$translateResultListener$1
            {
                this.f39173x3fe91575 = -1739498572;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 c6178x705b8fc4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 event = c6178x705b8fc4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                si0.y0 y0Var = si0.y0.this;
                java.lang.String str = y0Var.f489746g;
                if (str == null) {
                    return false;
                }
                am.kz kzVar = event.f136438g;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kzVar.f88729d)) {
                    return false;
                }
                if (kzVar.f88726a == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kzVar.f88728c)) {
                    yz5.l lVar = y0Var.f489744e;
                    if (lVar != null) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kzVar.f88728c)));
                    }
                    y0Var.a();
                    return false;
                }
                yz5.l lVar2 = y0Var.f489744e;
                if (lVar2 != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    android.app.Activity activity = y0Var.f489743d;
                    lVar2.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception(activity != null ? activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6c) : null)))));
                }
                y0Var.a();
                return false;
            }
        };
        this.f489748i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364>(a0Var) { // from class: com.tencent.mm.flutter.plugin.SnsLanguageFlutterPlugin$languageChangeListener$1
            {
                this.f39173x3fe91575 = -348375692;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x14788364) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 event = c5234x14788364;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.String newLanguageCode = event.f135568g.f90036b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newLanguageCode, "newLanguageCode");
                boolean z17 = newLanguageCode.length() > 0;
                si0.y0 y0Var = si0.y0.this;
                if (z17) {
                    java.lang.String str = y0Var.f489745f;
                    if (str != null && y0Var.f489744e != null) {
                        y0Var.f489746g = "sns_partial_translate_" + java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21 c6175x4c627f21 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21();
                        java.lang.String str2 = y0Var.f489746g;
                        am.hz hzVar = c6175x4c627f21.f136435g;
                        hzVar.f88413c = str2;
                        hzVar.f88411a = str;
                        hzVar.f88412b = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        hzVar.f88414d = 0;
                        hzVar.f88415e = 0;
                        hzVar.f88416f = "sns_flutter";
                        c6175x4c627f21.e();
                    }
                } else {
                    y0Var.a();
                }
                return false;
            }
        };
    }

    public final void a() {
        this.f489745f = null;
        this.f489744e = null;
        this.f489748i.mo48814x2efc64();
        mo48814x2efc64();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f489743d = binding.mo137508x19263085();
        mo48813x58998cd();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24809x5025e10f.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24809x5025e10f.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24809x5025e10f.Companion.m91881x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f489743d = null;
        a();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f489743d = null;
        a();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24809x5025e10f.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24809x5025e10f.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24809x5025e10f.Companion.m91881x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        a();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f489743d = binding.mo137508x19263085();
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24809x5025e10f
    /* renamed from: partialTranslate */
    public void mo91877xbbca68cd(java.lang.String sourceText, final yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceText, "sourceText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21 c6175x4c627f21 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21();
        java.lang.String str = "sns_direct_translate_" + java.lang.System.currentTimeMillis();
        am.hz hzVar = c6175x4c627f21.f136435g;
        hzVar.f88413c = str;
        hzVar.f88411a = sourceText;
        hzVar.f88412b = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        hzVar.f88414d = 0;
        hzVar.f88415e = 0;
        hzVar.f88416f = "sns_flutter";
        c6175x4c627f21.e();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4>(a0Var) { // from class: com.tencent.mm.flutter.plugin.SnsLanguageFlutterPlugin$triggerDirectTranslation$tempListener$1
            {
                this.f39173x3fe91575 = -1739498572;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 c6178x705b8fc4) {
                java.lang.String str2;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6178x705b8fc4 event = c6178x705b8fc4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.kz kzVar = event.f136438g;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kzVar.f88729d, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21.this.f136435g.f88413c)) {
                    return true;
                }
                int i17 = kzVar.f88726a;
                yz5.l lVar = callback;
                if (i17 != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kzVar.f88728c)) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    android.app.Activity activity = this.f489743d;
                    if (activity == null || (str2 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6c)) == null) {
                        str2 = "error";
                    }
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception(str2)))));
                } else {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kzVar.f88728c)));
                }
                mo48814x2efc64();
                return true;
            }
        }.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24809x5025e10f
    /* renamed from: selectLanguage */
    public void mo91878xd8957074(java.lang.String sourceText, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceText, "sourceText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f489743d;
        if (activity == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception()))));
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
        c10687xa533b04c.f149354d = wd0.k2.MOMENTS_TIMELINE;
        c10687xa533b04c.f149355e = "sns_content_" + sourceText.hashCode();
        ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activity, c10687xa533b04c);
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("")));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24809x5025e10f
    /* renamed from: selectPartialTranslateLanguage */
    public void mo91879x69596861(java.lang.String sourceText, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceText, "sourceText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.app.Activity activity = this.f489743d;
        if (activity == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("Activity unAvailable")))));
            return;
        }
        this.f489745f = sourceText;
        this.f489744e = callback;
        this.f489748i.mo48813x58998cd();
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
        c10687xa533b04c.f149354d = wd0.k2.MOMENTS_TIMELINE;
        c10687xa533b04c.f149355e = "sns_content_" + sourceText.hashCode();
        ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activity, c10687xa533b04c);
    }
}
