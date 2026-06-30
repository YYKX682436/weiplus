package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI */
/* loaded from: classes8.dex */
public class ActivityC18541xa7500d36 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0, jk5.b, jk5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f253960d;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f253964h;

    /* renamed from: e, reason: collision with root package name */
    public int f253961e = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f253962f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f253963g = null;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f253965i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f253966m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.EditText f253967n = null;

    /* renamed from: o, reason: collision with root package name */
    public final jk5.j f253968o = new jk5.j();

    /* renamed from: p, reason: collision with root package name */
    public boolean f253969p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f253970q = false;

    @Override // jk5.b
    public void I4(jk5.c cVar) {
        android.app.ProgressDialog progressDialog = this.f253963g;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            db5.e1.n(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574944k25, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new gg4.g0(this), new gg4.h0(this));
        } else {
            if (ordinal != 1) {
                return;
            }
            db5.e1.n(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574943k24, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new gg4.g0(this), new gg4.h0(this));
        }
    }

    @Override // jk5.a
    public void V2(jk5.c cVar) {
    }

    public final void V6(int i17) {
        w11.j0 j0Var = new w11.j0(i17);
        this.f253962f = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new gg4.e0(this, j0Var));
        c01.d9.e().g(j0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap W6() {
        /*
            r9 = this;
            java.lang.String r0 = c01.z1.r()
            java.lang.String r1 = g83.a.a()
            java.lang.String r2 = g83.a.b()
            java.lang.String r3 = "qr_"
            byte[] r0 = r0.getBytes()
            java.lang.String r4 = kk.k.g(r0)
            java.lang.String r5 = ".png"
            r6 = 1
            r7 = 1
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.h1.a(r1, r2, r3, r4, r5, r6, r7)
            r1 = 0
            r2 = 0
            java.io.RandomAccessFile r0 = com.p314xaae8f345.mm.vfs.w6.B(r0, r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            long r3 = r0.length()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.read(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r0.close()     // Catch: java.lang.Exception -> L4a
            goto L4a
        L33:
            r1 = move-exception
            goto L52
        L35:
            r3 = move-exception
            goto L3b
        L37:
            r0 = move-exception
            goto L55
        L39:
            r3 = move-exception
            r0 = r1
        L3b:
            java.lang.String r4 = "MicroMsg.InviteFriendsBy3rdUI"
            java.lang.String r5 = ""
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L33
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r3, r5, r2)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L49
            r0.close()     // Catch: java.lang.Exception -> L49
        L49:
            r3 = r1
        L4a:
            if (r3 != 0) goto L4d
            return r1
        L4d:
            android.graphics.Bitmap r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(r3)
            return r0
        L52:
            r8 = r1
            r1 = r0
            r0 = r8
        L55:
            if (r1 == 0) goto L5a
            r1.close()     // Catch: java.lang.Exception -> L5a
        L5a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18541xa7500d36.W6():android.graphics.Bitmap");
    }

    public final void X6(int i17, java.lang.String str, java.lang.String str2) {
        android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570206a02, null);
        this.f253964h = inflate;
        this.f253967n = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_l);
        this.f253965i = (android.widget.ImageView) this.f253964h.findViewById(com.p314xaae8f345.mm.R.id.c_i);
        this.f253966m = (android.widget.ProgressBar) this.f253964h.findViewById(com.p314xaae8f345.mm.R.id.imb);
        android.view.View view = (android.view.View) this.f253965i.getParent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI", "showConfirmDialog", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/subapp/ui/pluginapp/InviteFriendsBy3rdUI", "showConfirmDialog", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f253967n.setText(str);
        android.graphics.Bitmap W6 = W6();
        if (W6 == null) {
            c01.d9.e().g(new g21.a(c01.z1.r(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) c01.d9.b().p().l(66561, null)), 0));
            ((android.widget.ProgressBar) this.f253964h.findViewById(com.p314xaae8f345.mm.R.id.imb)).setVisibility(0);
        } else {
            android.widget.ImageView imageView = this.f253965i;
            if (imageView != null) {
                imageView.setImageBitmap(W6);
            }
        }
        r35.j1.i(this.f39322x2305be9, str2, this.f253964h, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new gg4.x(this, str, i17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576429aw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (r0 != false) goto L19;
     */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r7 = 2131761443(0x7f101923, float:1.9153935E38)
            r6.mo56582xbf7c1df6(r7)
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = "Invite_friends"
            r1 = 4
            int r7 = r7.getIntExtra(r0, r1)
            r6.f253960d = r7
            java.lang.Class<c25.e> r7 = c25.e.class
            lm0.a r7 = gm0.j1.s(r7)
            c25.e r7 = (c25.e) r7
            com.tencent.mm.plugin.zero.a r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) r7
            ip.j r7 = r7.b()
            java.lang.String r0 = "InviteFriendsInviteFlags"
            java.lang.String r7 = r7.d(r0)
            r0 = 0
            int r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r7, r0)
            com.tencent.mm.ui.base.preference.r r1 = r6.m79336x8b97809d()
            r2 = r7 & 2
            if (r2 > 0) goto L40
            java.lang.String r2 = "invite_friends_by_message"
            r3 = r1
            com.tencent.mm.ui.base.preference.h0 r3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) r3
            r3.w(r2)
        L40:
            r2 = r7 & 1
            if (r2 > 0) goto L4d
            java.lang.String r2 = "invite_friends_by_mail"
            r3 = r1
            com.tencent.mm.ui.base.preference.h0 r3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) r3
            r3.w(r2)
        L4d:
            com.tencent.mm.sdk.platformtools.f9 r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.Global3rdSrv
            boolean r3 = r2.h()
            if (r3 != 0) goto L72
            r3 = r7 & 4
            if (r3 <= 0) goto L72
            androidx.appcompat.app.AppCompatActivity r3 = r6.mo55332x76847179()
            java.lang.String r4 = "com.whatsapp"
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r5 == 0) goto L66
            goto L70
        L66:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L70
            r5 = 8192(0x2000, float:1.148E-41)
            r3.getApplicationInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L70
            r0 = 1
        L70:
            if (r0 != 0) goto L7b
        L72:
            java.lang.String r0 = "invite_friends_by_whatsapp"
            r3 = r1
            com.tencent.mm.ui.base.preference.h0 r3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) r3
            r3.w(r0)
        L7b:
            boolean r0 = r2.h()
            java.lang.String r3 = "invite_friends_by_facebook"
            if (r0 != 0) goto L8e
            r0 = r7 & 8
            if (r0 <= 0) goto L8e
            boolean r0 = c01.z1.C()
            if (r0 != 0) goto L94
        L8e:
            r0 = r1
            com.tencent.mm.ui.base.preference.h0 r0 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) r0
            r0.w(r3)
        L94:
            com.tencent.mm.ui.base.preference.h0 r1 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) r1
            r1.w(r3)
            boolean r0 = r2.h()
            if (r0 != 0) goto La3
            r7 = r7 & 16
            if (r7 > 0) goto La9
        La3:
            java.lang.String r7 = "invite_friends_by_twitter"
            r1.w(r7)
        La9:
            r1.notifyDataSetChanged()
            com.tencent.mm.modelbase.r1 r7 = c01.d9.e()
            r0 = 1803(0x70b, float:2.527E-42)
            r7.a(r0, r6)
            com.tencent.mm.modelbase.r1 r7 = c01.d9.e()
            r0 = 1804(0x70c, float:2.528E-42)
            r7.a(r0, r6)
            com.tencent.mm.modelbase.r1 r7 = c01.d9.e()
            r0 = 168(0xa8, float:2.35E-43)
            r7.a(r0, r6)
            gg4.y r7 = new gg4.y
            r7.<init>(r6)
            r6.mo54448x9c8c0d33(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18541xa7500d36.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(1803, this);
        c01.d9.e().q(1804, this);
        c01.d9.e().q(be1.r0.f4232x366c91de, this);
        int i17 = this.f253961e;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14035, java.lang.Integer.valueOf(i17), 0, java.lang.Integer.valueOf(this.f253960d));
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if ("invite_friends_by_message".equals(c21560x1fce98fb.f279313q)) {
            this.f253961e = 2;
            V6(2);
            return true;
        }
        if ("invite_friends_by_mail".equals(c21560x1fce98fb.f279313q)) {
            this.f253961e = 1;
            V6(1);
            return true;
        }
        if ("invite_friends_by_whatsapp".equals(c21560x1fce98fb.f279313q)) {
            this.f253961e = 3;
            V6(4);
            return true;
        }
        if ("invite_friends_by_facebook".equals(c21560x1fce98fb.f279313q)) {
            this.f253961e = 4;
            if (c01.z1.u()) {
                this.f253970q = true;
                V6(8);
            } else {
                db5.e1.n(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.iqx, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new gg4.z(this), new gg4.a0(this));
            }
            return true;
        }
        if (!"invite_friends_by_twitter".equals(c21560x1fce98fb.f279313q)) {
            return false;
        }
        this.f253961e = 5;
        if (this.f253968o.f381702b != null) {
            this.f253969p = true;
            V6(16);
        } else {
            db5.e1.n(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.j0_, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new gg4.c0(this), new gg4.d0(this));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0359  */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r26, int r27, java.lang.String r28, com.p314xaae8f345.mm.p944x882e457a.m1 r29) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18541xa7500d36.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
