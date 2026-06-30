package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity */
/* loaded from: classes9.dex */
public class ActivityC12946xbb486840 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f175218y = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f175219d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f175220e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f175221f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5 f175222g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h5 f175224i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f175226n;

    /* renamed from: o, reason: collision with root package name */
    public int f175227o;

    /* renamed from: p, reason: collision with root package name */
    public int f175228p;

    /* renamed from: q, reason: collision with root package name */
    public android.net.Uri f175229q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f175230r;

    /* renamed from: s, reason: collision with root package name */
    public android.app.ProgressDialog f175231s;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f175233u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f175235w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f175236x;

    /* renamed from: h, reason: collision with root package name */
    public boolean f175223h = false;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g5 f175225m = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g5();

    /* renamed from: t, reason: collision with root package name */
    public int f175232t = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.ref.WeakReference f175234v = new java.lang.ref.WeakReference(this);

    /* renamed from: com.tencent.mm.plugin.base.stub.WXEntryActivity$EntryReceiver */
    /* loaded from: classes8.dex */
    public static class EntryReceiver extends android.content.BroadcastReceiver {

        /* renamed from: f, reason: collision with root package name */
        public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f175237f;

        /* renamed from: a, reason: collision with root package name */
        public android.content.Context f175238a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f175239b;

        /* renamed from: c, reason: collision with root package name */
        public int f175240c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f175241d;

        /* renamed from: e, reason: collision with root package name */
        public long f175242e;

        public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.EntryReceiver entryReceiver, android.content.Context context, android.content.Intent intent) {
            entryReceiver.f175238a = context;
            java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32807x6382c059);
            entryReceiver.f175242e = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.i(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32761xae2888fe, 0L);
            int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, 0);
            entryReceiver.f175240c = g17;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.f175218y;
            if (!(g17 >= 553713665)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "sdk version is not supported, sdkVersion = " + entryReceiver.f175240c);
                return;
            }
            java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
            entryReceiver.f175241d = l18;
            if (l18 == null || l18.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "unknown package, ignore");
                return;
            }
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.a7(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.d(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32762xbdedaa54), com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.e7(l17, entryReceiver.f175240c, entryReceiver.f175241d))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "checksum fail");
                return;
            }
            if (l17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "check appid failed, null content");
                return;
            }
            android.net.Uri parse = android.net.Uri.parse(l17);
            java.lang.String authority = parse.getAuthority();
            try {
                entryReceiver.f175239b = parse.getQueryParameter("appid");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "onReceive, appId = " + entryReceiver.f175239b);
                java.lang.String str = entryReceiver.f175239b;
                if (str == null || str.length() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "invalid appid, ignore");
                    return;
                }
                if (!gm0.j1.a() || gm0.m.r()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXEntryActivity", "not login, just save the appid : %s", entryReceiver.f175239b);
                    ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).Ri(entryReceiver.f175239b);
                    return;
                }
                if (!gm0.j1.b().f354787q) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXEntryActivity", "not login accInitializing, just save the appid : %s", entryReceiver.f175239b);
                    ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).Ri(entryReceiver.f175239b);
                    return;
                }
                if ("registerapp".equals(authority)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "handle app registeration: " + entryReceiver.f175241d + ", sdkver=" + entryReceiver.f175240c);
                    if (!gm0.j1.a()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "no available account");
                        return;
                    }
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str2 = entryReceiver.f175239b;
                    ((kt.c) i0Var).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str2);
                    if (h17 == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(entryReceiver.f175241d, h17.f67386xa1e9e82c)) {
                        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ri(entryReceiver.f175239b, entryReceiver.f175241d, new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.f1(entryReceiver, h17));
                        return;
                    } else {
                        entryReceiver.b(h17);
                        return;
                    }
                }
                if ("unregisterapp".equals(authority)) {
                    if (!gm0.j1.a()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "no available account");
                        return;
                    }
                    lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str3 = entryReceiver.f175239b;
                    ((kt.c) i0Var2).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str3, false, false);
                    lt.m0 m0Var = (lt.m0) i95.n0.c(lt.m0.class);
                    android.content.Context context2 = entryReceiver.f175238a;
                    java.lang.String str4 = entryReceiver.f175241d;
                    ((kt.e) m0Var).getClass();
                    if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i1.a(context2, j17, str4)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "unreg fail, check app fail");
                    } else {
                        if (j17 == null || j17.f67391x10a0fed7 == 5) {
                            return;
                        }
                        j17.f67391x10a0fed7 = 4;
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo9952xce0038c9(j17, new java.lang.String[0]);
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n0.c(entryReceiver.f175239b);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "init: %s", e17.toString());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
        
            if (r6 == false) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m r12) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.EntryReceiver.b(com.tencent.mm.pluginsdk.model.app.m):void");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (context == null || intent == null) {
                return;
            }
            if (f175237f == null) {
                f175237f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("WXEntryReceiver");
            }
            if (gm0.j1.i().f354741a.f354832d) {
                f175237f.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e1(this, context, intent));
            } else {
                gm0.j1.i().m(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.d1(this, context, intent));
            }
        }
    }

    public static boolean a7(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "checkSumConsistent fail, invalid arguments");
            return false;
        }
        if (bArr.length != bArr2.length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "checkSumConsistent fail, length is different");
            return false;
        }
        for (int i17 = 0; i17 < bArr.length; i17++) {
            if (bArr[i17] != bArr2[i17]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] e7(java.lang.String str, int i17, java.lang.String str2) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i17);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        return kk.k.g(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x01e4, code lost:
    
        if (r10.startsWith("content") != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0207, code lost:
    
        if (r10.startsWith("content") != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0221, code lost:
    
        if (r10.startsWith("content") != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0239, code lost:
    
        if (r10.startsWith("content") != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0271, code lost:
    
        if (r10.startsWith("content") == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c1, code lost:
    
        if (r10.startsWith("content") != false) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cc  */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p r17, android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 2615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.X6(com.tencent.mm.pluginsdk.ui.p, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        if (!g7(intent, "preLogin")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "Init failed");
            finish();
            return false;
        }
        if (!gm0.j1.a() || gm0.m.r()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXEntryActivity", "preLogin not login, save the appid : %s", this.f175219d);
            ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).Ri(this.f175219d);
        }
        if (!(this.f175227o >= 553713665)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "sdk version is not supported, sdkVersion = " + this.f175227o);
            finish();
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "preLogin, appId = %s, pkg = %s, uri = %s", this.f175219d, this.f175220e, this.f175229q);
        if (this.f175229q == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "check appid failed, null content");
            finish();
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f175219d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "invalid appid, ignore");
            finish();
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f175220e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "unknown package, ignore");
            finish();
            return false;
        }
        if (a7(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.d(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32762xbdedaa54), e7(this.f175230r, this.f175227o, this.f175220e))) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "preLogin, checksum fail, appId = %s, pkg = %s, uri = %s", this.f175219d, this.f175220e, this.f175229q);
        finish();
        return false;
    }

    public final void b7(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, android.os.Bundle bundle) {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXEntryActivity", "accHasReady not ready, do nothing");
            finish();
            return;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f175219d;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        if (h17 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f175220e, h17.f67386xa1e9e82c)) {
            c7(m1Var, h17, bundle);
            finish();
        } else {
            this.f175231s = db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.x0(this));
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ri(this.f175219d, this.f175220e, new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.y0(this, h17, m1Var, bundle));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0537, code lost:
    
        if (r5.f33049x38eb0007.m48467xfb85f7b0() != 4) goto L223;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ee A[Catch: Exception -> 0x0310, TRY_LEAVE, TryCatch #0 {Exception -> 0x0310, blocks: (B:181:0x02e8, B:183:0x02ee), top: B:180:0x02e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x036b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x044a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c7(com.p314xaae8f345.mm.p944x882e457a.m1 r29, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 1718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.c7(com.tencent.mm.modelbase.m1, com.tencent.mm.pluginsdk.model.app.m, android.os.Bundle):boolean");
    }

    public final void d7() {
        android.app.ProgressDialog progressDialog = this.f175231s;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f175231s.dismiss();
    }

    public final void f7() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mcx);
        if (findViewById == null) {
            j7();
        } else if (findViewById.getVisibility() == 8) {
            j7();
        } else {
            i7();
        }
    }

    public final boolean g7(android.content.Intent intent, java.lang.String str) {
        this.f175227o = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, 0);
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32807x6382c059);
        this.f175230r = l17;
        if (l17 != null) {
            android.net.Uri parse = android.net.Uri.parse(l17);
            this.f175229q = parse;
            this.f175226n = parse.getAuthority();
            try {
                this.f175219d = this.f175229q.getQueryParameter("appid");
                this.f175228p = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(getIntent().getExtras(), "_wxapi_command_type", 0);
                this.f175220e = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
                this.f175221f = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32809x4c4c1d9);
                if (this.f175222g == null) {
                    this.f175222g = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).Di(this.f175221f);
                }
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5 i5Var = this.f175222g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "init(%s) tokenData.token: %s, tokenData: %s, intent.packageName: %s, intent.openSDKVersion: %s", str, i5Var.f270467a, i5Var, this.f175220e, java.lang.Integer.valueOf(this.f175227o));
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "init: %s", e17.toString());
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cim;
    }

    public final void h7(int i17, int i18, java.lang.String str) {
        if (com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, null, 4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "mm error processor process this errcode");
            finish();
        } else if (!gm0.m.r()) {
            l7(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WXEntryActivity", "account is hold, do finish");
            finish();
        }
    }

    public final void i7() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(this, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(getIntent()), -6), true, false);
        finish();
    }

    public final void j7() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.b(this, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(getIntent()), -2));
        finish();
    }

    public final void k7() {
        try {
            if (bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Target30_AuthenticationToast_Int, 0) == 1) {
                db5.t7.m(this, this.f175222g.f270468b + "-" + this.f175225m.f270446a);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WXEntryActivity", e17, "", new java.lang.Object[0]);
        }
    }

    public final void l7(java.lang.String str) {
        m7(str, "");
    }

    public final void m7(java.lang.String str, java.lang.String str2) {
        java.util.Map d17;
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560994zy);
        if (mo78514x143f1b92() != null) {
            mo78514x143f1b92().G0(color);
        }
        d7();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mcx);
        if (findViewById == null) {
            dp.a.m125853x26a183b(getApplicationContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574661j45, 0).show();
            finish();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/WXEntryActivity", "showSpamView", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/base/stub/WXEntryActivity", "showSpamView", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574661j45);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mtl);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mtk);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (str.startsWith("autoauth_errmsg_")) {
                str = str.substring(16);
            }
            if (str.startsWith("<e>") && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) d17.get(".e.Content"))) {
                str = (java.lang.String) d17.get(".e.Content");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                textView.setText(str);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str2);
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.aag);
        java.lang.String Zi = gm0.j1.a() ? ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(this, this.f175219d) : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j3y);
        } else {
            button.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3y) + Zi);
        }
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.c1(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "showSpamView errMsg:%s, descMsg:%s, appId:%s, appName:%s", str, str2, this.f175219d, Zi);
    }

    public final java.lang.String n7(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXEntryActivity", "urlEncode fail, str = %s, ex = %s", str, e17.getMessage());
            return str;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.m(getIntent(), "key_auto_login_wizard_exit", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "onCreate");
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.u0(this));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(1200, this);
        d7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "onDestroy");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0 || keyEvent.getKeyCode() != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "user click back button");
        f7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "onResume");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0206  */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r12, int r13, java.lang.String r14, com.p314xaae8f345.mm.p944x882e457a.m1 r15) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
