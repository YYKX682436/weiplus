package lx;

/* loaded from: classes11.dex */
public final class t5 implements com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f403487d;

    /* renamed from: e, reason: collision with root package name */
    public rv.f3 f403488e;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403487d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3.Companion.m85610x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3
    /* renamed from: onCancelCreateTextCover */
    public void mo85605x975aa675() {
        rv.f3 f3Var = this.f403488e;
        if (f3Var != null) {
            f3Var.mo50711x3d6f0539();
        }
        android.app.Activity activity = this.f403487d;
        if (activity != null) {
            activity.setResult(-1);
        }
        android.app.Activity activity2 = this.f403487d;
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3
    /* renamed from: onConfirmCreateTextCover */
    public void mo85606xf2c1ecd(com.p314xaae8f345.p2845xc516c4b6.biz.C23250x5c48e425 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (this.f403487d == null) {
            return;
        }
        java.lang.String m85649x66e287ae = info.m85649x66e287ae();
        if (m85649x66e287ae == null || m85649x66e287ae.length() == 0) {
            return;
        }
        rv.f3 f3Var = this.f403488e;
        if (f3Var != null) {
            f3Var.a(info.m85649x66e287ae(), info.m85648x76ee86fc(), info.m85651x2ab07c5a(), 2L, info.m85653x3bfa572b(), info.m85650x93d23a33(), info.m85652x7528c3fb());
        }
        android.app.Activity activity = this.f403487d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        android.content.Intent intent = activity.getIntent();
        intent.putExtra("BizTextCoverEditorUI_kEditorResultPath", info.m85649x66e287ae());
        intent.putExtra("BizTextCoverEditorUI_kEditorResultPicId", info.m85648x76ee86fc());
        intent.putExtra("BizTextCoverEditorUI_kEditorResultPrompt", info.m85651x2ab07c5a());
        intent.putExtra("BizTextCoverEditorUI_kEditorResultSource", 2L);
        intent.putExtra("BizTextCoverEditorUI_kEditorResultTemplateId", info.m85653x3bfa572b());
        intent.putExtra("BizTextCoverEditorUI_kEditorResultDataBuf", info.m85650x93d23a33());
        intent.putExtra("BizTextCoverEditorUI_kEditorResultStyle", info.m85652x7528c3fb());
        android.app.Activity activity2 = this.f403487d;
        if (activity2 != null) {
            activity2.setResult(0, intent);
        }
        android.app.Activity activity3 = this.f403487d;
        if (activity3 != null) {
            activity3.finish();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403487d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403487d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3.Companion.m85610x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3
    /* renamed from: onEmoticonBoardVisibilityChanged */
    public void mo85607x706804e1(boolean z17) {
        rv.f3 f3Var = this.f403488e;
        if (f3Var != null) {
            f3Var.b(!z17);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403487d = binding.mo137508x19263085();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23242x5dd0afc3
    /* renamed from: showAgreeTermsDialog */
    public void mo85608x34c84880(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.f403487d == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this.f403487d);
        j0Var.f293378z.setVisibility(0);
        j0Var.f293366n.setVisibility(0);
        j0Var.f293366n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ng6);
        j0Var.z(com.p314xaae8f345.mm.R.C30867xcad56011.ng7, new lx.r5(callback));
        j0Var.u(com.p314xaae8f345.mm.R.C30867xcad56011.ng8, new lx.s5(callback));
        j0Var.show();
    }
}
