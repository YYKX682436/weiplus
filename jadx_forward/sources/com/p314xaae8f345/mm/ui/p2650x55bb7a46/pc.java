package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes14.dex */
public final class pc extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f283624d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f283625e;

    /* renamed from: f, reason: collision with root package name */
    public final int f283626f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f283627g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f283628h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.zg f283629i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f283630m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(android.content.Context context, java.lang.String filePath, java.lang.String fileExt, int i17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileExt, "fileExt");
        this.f283624d = filePath;
        this.f283625e = fileExt;
        this.f283626f = i17;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ci_, this);
        this.f283627g = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.mb_);
        this.f283628h = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.mbc);
        this.f283629i = new com.p314xaae8f345.mm.ui.zg(context, this.f283624d, this.f283625e, i17, null, 16, null);
        a();
        b();
    }

    public final void a() {
        android.widget.RelativeLayout relativeLayout = this.f283628h;
        if (relativeLayout != null) {
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            sj3.n3 n3Var = sj3.o3.f490199e;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (n3Var.a(context) != 90) {
                android.content.Context context2 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                if (n3Var.a(context2) != 270) {
                    com.p314xaae8f345.mm.ui.zg zgVar = this.f283629i;
                    if (zgVar != null) {
                        android.content.Context context3 = zgVar.f294154a;
                        zgVar.f294158e = android.view.LayoutInflater.from(context3).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cib, relativeLayout);
                        zgVar.a(context3);
                        return;
                    }
                    return;
                }
            }
            com.p314xaae8f345.mm.ui.zg zgVar2 = this.f283629i;
            if (zgVar2 != null) {
                android.content.Context context4 = zgVar2.f294154a;
                zgVar2.f294158e = android.view.LayoutInflater.from(context4).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cic, relativeLayout);
                zgVar2.a(context4);
            }
        }
    }

    public final void b() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.widget.RelativeLayout relativeLayout = this.f283627g;
        if (relativeLayout == null || (layoutParams = relativeLayout.getLayoutParams()) == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        sj3.n3 n3Var = sj3.o3.f490199e;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (n3Var.a(context) != 90) {
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            if (n3Var.a(context2) != 270) {
                layoutParams2.bottomMargin = sj3.i1.f490106r;
                layoutParams2.setMarginEnd(0);
                return;
            }
        }
        layoutParams2.bottomMargin = 0;
        layoutParams2.setMarginEnd(sj3.i1.f490106r);
    }

    public final void c() {
        com.p314xaae8f345.mm.ui.zg zgVar = this.f283629i;
        if (zgVar != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = zgVar.f294164k;
            if (f4Var != null) {
                f4Var.cancel();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = zgVar.f294165l;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            p012xc85e97e9.p093xedfae76a.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231716x1;
            if (j0Var != null) {
                j0Var.mo522xb5bdeb7a(zgVar.f294166m);
            }
            p012xc85e97e9.p093xedfae76a.j0 j0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231716x1;
            if (j0Var2 != null) {
                android.content.Context context = zgVar.f294154a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                j0Var2.m7809x1ff8439((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
            }
        }
    }

    public final void d() {
        java.lang.String str = this.f283624d;
        java.lang.String str2 = this.f283625e;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m() && r6Var.A()) {
            com.p314xaae8f345.p3210x3857dc.q1 q1Var = com.p314xaae8f345.p3210x3857dc.q1.ReaderView;
            int i17 = this.f283626f;
            if (i17 != 3 && i17 == 4) {
                q1Var = com.p314xaae8f345.p3210x3857dc.q1.ListView;
            }
            com.p314xaae8f345.p3210x3857dc.q1 q1Var2 = q1Var;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("extra_param_disable_scale", "false");
            hashMap.put("extra_param_bg_color", java.lang.String.valueOf(android.graphics.Color.parseColor("#ededed")));
            hashMap.put("extra_param_disable_finish_activity", "true");
            hashMap.put("extra_param_set_max_scale", "3");
            hashMap.put("extra_param_disable_password", "true");
            hashMap.put("extra_param_download_text_color", "-16777216");
            hashMap.put("extra_param_can_download_when_plugin_error", "true");
            hashMap.put("extra_param_open_file_scene", "13");
            sj3.n3 n3Var = sj3.o3.f490199e;
            java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getFileMD5String(...)");
            n3Var.b(p17, null);
            java.lang.String valueOf = java.lang.String.valueOf(hashCode() + java.lang.System.currentTimeMillis());
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.widget.RelativeLayout relativeLayout = this.f283627g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(relativeLayout, "null cannot be cast to non-null type android.view.ViewGroup");
            com.p314xaae8f345.p3210x3857dc.r1.d(str, str2, valueOf, true, hashMap, q1Var2, (android.app.Activity) context, relativeLayout, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.nc(this), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.oc(this));
        }
    }

    /* renamed from: getFileExt */
    public final java.lang.String m79801xad696cf() {
        return this.f283625e;
    }

    /* renamed from: getFilePath */
    public final java.lang.String m79802x5000ed37() {
        return this.f283624d;
    }

    /* renamed from: getPluginControlLayout */
    public final android.widget.RelativeLayout m79803x1f3e3b3e() {
        return this.f283628h;
    }

    /* renamed from: getProfilePluginUi */
    public final com.p314xaae8f345.mm.ui.zg m79804x79877fba() {
        return this.f283629i;
    }

    /* renamed from: getReaderContentLayout */
    public final android.widget.RelativeLayout m79805x407b65ca() {
        return this.f283627g;
    }

    /* renamed from: setFileExt */
    public final void m79806x7e47e443(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f283625e = str;
    }

    /* renamed from: setFilePath */
    public final void m79807x4ab94e43(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f283624d = str;
    }

    /* renamed from: setPluginControlLayout */
    public final void m79808x6d82fab2(android.widget.RelativeLayout relativeLayout) {
        this.f283628h = relativeLayout;
    }

    /* renamed from: setProfilePluginUi */
    public final void m79809xb05e192e(com.p314xaae8f345.mm.ui.zg zgVar) {
        this.f283629i = zgVar;
    }

    /* renamed from: setReaderContentLayout */
    public final void m79810x8ec0253e(android.widget.RelativeLayout relativeLayout) {
        this.f283627g = relativeLayout;
    }
}
