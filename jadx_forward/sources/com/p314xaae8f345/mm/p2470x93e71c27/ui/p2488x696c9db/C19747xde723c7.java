package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSightView */
/* loaded from: classes15.dex */
public class C19747xde723c7 extends com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 {
    public boolean R;
    public java.lang.String S;
    public int T;
    public boolean U;
    public boolean V;

    public C19747xde723c7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.T = 0;
        this.U = true;
        this.V = false;
        t();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void a(double d17, boolean z17) {
        b(d17);
    }

    public void b(double d17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.M;
        if (sVar != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.e(sVar, d17);
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(eVar, 0L);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public boolean c(android.content.Context context, boolean z17) {
        if (this.S == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoSightView", "start::use path is null!");
            return false;
        }
        java.lang.String str = wo.v1.f529366m.D;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!str.equals("other") && com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s.b(this.S)) {
            super.d(this.S, false, 0);
            q(!this.V);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSightView", "start::use other player, path %s, has called %B", this.S, java.lang.Boolean.valueOf(this.R));
        if (this.R && !z17) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(context, intent, new com.p314xaae8f345.mm.vfs.r6(this.S), "video/*", false);
        try {
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572130zj));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/VideoSightView", "start", "(Landroid/content/Context;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/tools/VideoSightView", "start", "(Landroid/content/Context;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoSightView", "startActivity fail, activity not found");
            db5.e1.T(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7_));
        }
        this.R = true;
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a
    public void d(java.lang.String str, boolean z17, int i17) {
        this.S = str;
        super.d(str, z17, i17);
    }

    /* renamed from: getCurrentPosition */
    public int mo69307x9746038c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getDuration */
    public int mo69286x51e8b0a() {
        return super.mo69286x51e8b0a();
    }

    /* renamed from: getLastProgresstime */
    public double mo69308x9c2553a6() {
        if (m69285x143f1b92() == null) {
            return 0.0d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s m69285x143f1b92 = m69285x143f1b92();
        double d17 = m69285x143f1b92.B;
        return d17 != -1.0d ? d17 : m69285x143f1b92.A;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getLastSurfaceUpdateTime */
    public long mo69309x53bc4617() {
        return 0L;
    }

    /* renamed from: isPlaying */
    public boolean mo69311xc00617a4() {
        return this.M.h();
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.U) {
            mo69274xd5e29286(getResources().getDisplayMetrics().widthPixels);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: onDetach */
    public void mo69312x3f5eee52() {
        this.M.f().mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        super.onLayout(z17, i17, i18, i19, i27);
        if (!this.N || (i28 = i19 - i17) <= 0) {
            return;
        }
        mo69274xd5e29286(i28);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22638x8e581d4f, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    /* renamed from: pause */
    public void mo69313x65825f6() {
        super.d(this.S, true, 0);
    }

    /* renamed from: setEnableConfigChanged */
    public void m75836x6d699c8d(boolean z17) {
        this.U = z17;
    }

    /* renamed from: setForceScaleFullScreen */
    public void m75837x772f3ddc(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setLoop */
    public void mo69317x764cf626(boolean z17) {
        m69294xc619afc6(z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setMute */
    public void mo69318x764d819b(boolean z17) {
        this.V = z17;
        q(!z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnInfoCallback */
    public void mo69319xe6781b94(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnSeekCompleteCallback */
    public void mo69320x87223eb7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 c4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnSurfaceCallback */
    public void mo69321x146557f1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4 d4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOneTimeVideoTextureUpdateCallback */
    public void mo69322xfae314df(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 e4Var) {
    }

    /* renamed from: setPlayProgressCallback */
    public void mo69323xc2339c68(boolean z17) {
        if (z17) {
            m69297x8a3eafb7(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x7(this));
        } else {
            m69297x8a3eafb7(null);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setThumb */
    public void mo69325x53bf7294(android.graphics.Bitmap bitmap) {
        s(bitmap);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoCallback */
    public void mo69326x360a109e(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var) {
        this.L = a4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoPath */
    public void mo69327xab3268fe(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(this.L == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSightView", "set sight path %s, callback null ? %B", objArr);
        this.T = 0;
        this.S = str;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.L;
        if (a4Var != null) {
            a4Var.mo9757x58d5b73c();
        }
    }

    /* renamed from: start */
    public boolean mo69330x68ac462() {
        return c(getContext(), false);
    }

    public void t() {
        java.lang.String str = wo.v1.f529366m.D;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals("other")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSightView", "init::use other player");
        } else {
            q(true);
        }
        m69296xa4560c71(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w7(this));
    }

    public C19747xde723c7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = 0;
        this.U = true;
        this.V = false;
        t();
    }

    public C19747xde723c7(android.content.Context context) {
        super(context, null, 0);
        this.T = 0;
        this.U = true;
        this.V = false;
        t();
    }
}
