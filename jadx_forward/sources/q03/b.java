package q03;

/* loaded from: classes8.dex */
public final class b implements com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener, f50.b0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f440897d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.C24759xf854b319 f440898e;

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getDisplayUsername */
    public java.lang.String mo91696x8d4ef582() {
        java.lang.String c17 = c01.z1.c();
        java.lang.String r17 = c01.z1.r();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            return c17;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.y3(r17)) {
            return null;
        }
        return r17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getDistrict */
    public java.lang.String mo91697x8d137104() {
        c01.fb a17 = c01.fb.a();
        java.lang.String d17 = a17.d();
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String c17 = a17.c();
        return ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(d17) + ' ' + (c17 != null ? c17 : "");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getNickname */
    public java.lang.String mo91698x8010e5e4() {
        java.lang.Object l17 = gm0.j1.u().c().l(4, null);
        if (l17 instanceof java.lang.String) {
            return (java.lang.String) l17;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getPatTail */
    public java.lang.String mo91699xe978b5d() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, null);
        if (m17 instanceof java.lang.String) {
            return (java.lang.String) m17;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getSendMsgInKeybaord */
    public boolean mo91700xff68028b() {
        java.lang.Object l17 = gm0.j1.u().c().l(66832, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
        return ((java.lang.Boolean) l17).booleanValue();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getSex */
    public java.lang.Long mo91701xb5886d30() {
        return java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1(gm0.j1.u().c().l(12290, null) instanceof java.lang.Integer ? (java.lang.Integer) r0 : null, 0));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getSignature */
    public java.lang.String mo91702x3f6b0a02() {
        java.lang.Object l17 = gm0.j1.u().c().l(12291, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!(str.length() == 0)) {
            return str;
        }
        android.content.Context context = this.f440897d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        }
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iy8);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getUsername */
    public java.lang.String mo91703x6c03c64c() {
        return c01.z1.r();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getVoicePlayMode */
    public boolean mo91704x80d22e93() {
        java.lang.Object l17 = gm0.j1.u().c().l(26, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
        return ((java.lang.Boolean) l17).booleanValue();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getVoipRingtone */
    public java.lang.String mo91705x4633e3d8() {
        ((dd0.q0) ((ed0.w0) i95.n0.c(ed0.w0.class))).getClass();
        vx3.i i17 = mx3.i0.i("");
        if (i17 == null) {
            return "";
        }
        java.lang.String str = i17.f522825i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: getWeCoin */
    public java.lang.String mo91706x35d73d75() {
        f50.d0 d0Var = (f50.d0) i95.n0.c(f50.d0.class);
        android.content.Context context = this.f440897d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        }
        ((vd0.q3) d0Var).getClass();
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        long longValue = java.lang.Long.valueOf(os4.h.i()).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHelperService", "updateWeCoinEntry balance catch: %s", java.lang.Long.valueOf(longValue));
        if (longValue <= 0) {
            return "";
        }
        return longValue + " " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j1_);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ABOUT_INVOICE_ENTRANCE_BOOLEAN, false))) == false) goto L6;
     */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: isInvoiceEnable */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo91707x8789d606() {
        /*
            r4 = this;
            com.tencent.mm.sdk.platformtools.f9 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeAvatarInvoiceTitle
            boolean r0 = r0.h()
            r1 = 1
            if (r0 != 0) goto L22
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ABOUT_INVOICE_ENTRANCE_BOOLEAN
            r3 = 0
            boolean r0 = r0.o(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(r0)
            if (r0 != 0) goto L23
        L22:
            r3 = r1
        L23:
            r0 = r3 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.b.mo91707x8789d606():boolean");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: isLandscapeMode */
    public boolean mo91708x8ac21f4() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d().getBoolean("settings_landscape_mode", false);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: isMultipleUser */
    public boolean mo91709xe1de7045() {
        return android.os.Process.myUid() / 100000 != 0;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: isMyAddressEnable */
    public boolean mo91710x1e4711c1() {
        android.content.Context context = this.f440897d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        }
        return !(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(context) || com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeAvatarAddress.h());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: isPatEnable */
    public boolean mo91711xf4ccbdfc() {
        ((vd0.q3) ((f50.d0) i95.n0.c(f50.d0.class))).getClass();
        return ((lp3.r) i95.n0.c(lp3.r.class)).Di();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: isWeCoinEnable */
    public boolean mo91712x2f95032c() {
        return !((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        if (i17 != 2 && i17 != 4) {
            return false;
        }
        f50.d0 d0Var = (f50.d0) i95.n0.c(f50.d0.class);
        android.app.Activity activity = this.f440897d;
        ((vd0.q3) d0Var).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingChangeAvatarHelp", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 3 || i17 == 2 || i17 == 4) {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new m14.c());
            }
        } else if (i17 != 2) {
            if (i17 == 3) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.String a17 = g83.a.a();
                ((ub0.r) oVar).getClass();
                java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(context, intent, a17);
                if (b17 != null) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("CropImageMode", 1);
                    intent2.putExtra("CropImage_OutputPath", b17);
                    intent2.putExtra("CropImage_ImgPath", b17);
                    intent2.putExtra("CropImage_from_scene", 3);
                    ((com.p314xaae8f345.mm.app.y7) f14.g.b()).p(activity, intent2, 4);
                }
            } else if (i17 == 4) {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new m14.d());
                if (intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                    java.lang.String r17 = c01.z1.r();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    android.graphics.Bitmap m18 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().m(r17);
                    if (stringExtra == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingChangeAvatarHelp", "crop picture failed");
                    } else {
                        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(stringExtra);
                        java.lang.String str = a18.f294812f;
                        if (str != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                            if (!str.equals(l17)) {
                                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingChangeAvatarHelp", "onActivityResult(CONTEXT_MENU_CROP_PICTURE)  file:%s, size:%d", stringExtra, java.lang.Long.valueOf((m19.a() && (m17 = m19.f294799a.m(m19.f294800b)) != null) ? m17.f294766c : 0L));
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.k0) ((kv.l0) i95.n0.c(kv.l0.class))).getClass();
                        new com.p314xaae8f345.mm.p943x351df9c2.y0(activity, stringExtra, false).b(1, new m14.e(m18), true);
                    }
                }
            }
        } else if (intent != null) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CropImageMode", 1);
            intent3.putExtra("CropImage_Filter", true);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent3.putExtra("CropImage_OutputPath", com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(c01.z1.r() + ".crop", true, false));
            intent3.putExtra("CropImage_ImgPath", (java.lang.String) null);
            intent3.putExtra("CropImage_from_scene", 3);
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).q(activity, intent, intent3, g83.a.a(), 4, null);
        }
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f440897d = binding.mo137508x19263085();
        binding.mo137502xbf77c2e1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6.Companion.m91719x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f440898e = new com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.C24759xf854b319(m137983x3b5b91dc2, null, 2, 0 == true ? 1 : 0);
        p03.e eVar = (p03.e) ((f50.c0) i95.n0.c(f50.c0.class));
        eVar.getClass();
        eVar.f431960d.add(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f440897d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f440897d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6.Companion.m91719x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f440898e = new com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.C24759xf854b319(m137983x3b5b91dc2, null, 2, 0 == true ? 1 : 0);
        p03.e eVar = (p03.e) ((f50.c0) i95.n0.c(f50.c0.class));
        eVar.getClass();
        eVar.f431960d.remove(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f440897d = binding.mo137508x19263085();
        binding.mo137517xa002e684(this);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: resetChatRecord */
    public void mo91713xd71eec78() {
        f50.d0 d0Var = (f50.d0) i95.n0.c(f50.d0.class);
        android.app.Activity activity = this.f440897d;
        ((vd0.q3) d0Var).getClass();
        m14.f fVar = new m14.f(activity);
        android.content.Context context = fVar.f404402a;
        db5.e1.B(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ixr), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new m14.j(fVar), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: saveUserInfo */
    public void mo91714xec423fb6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSettingsPlugin", "saveUserInfo: ");
        c01.fb a17 = c01.fb.a();
        long longValue = mo91701xb5886d30().longValue();
        if (longValue != -1) {
            a17.f118721b = (int) longValue;
        }
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(1, c01.fb.e(a17)));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: sendMsgInKeyboard */
    public void mo91715xac39a3e5(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSettingsPlugin", "sendMsgInKeyboard: " + z17);
        gm0.j1.u().c().w(66832, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: setSex */
    public void mo91716xca0294a4(long j17) {
        c01.fb a17 = c01.fb.a();
        if (j17 != -1) {
            a17.f118721b = (int) j17;
        }
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(1, c01.fb.e(a17)));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(4, 4);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2878x5582bc23.InterfaceC24735x82a572c6
    /* renamed from: voicePlayMode */
    public void mo91717xc3727249(boolean z17) {
        java.lang.Object l17 = gm0.j1.u().c().l(26, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSettingsPlugin", "set voice mode from %B to %B", java.lang.Boolean.valueOf(((java.lang.Boolean) l17).booleanValue()), java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().w(26, java.lang.Boolean.valueOf(z17));
    }
}
