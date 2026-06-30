package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* renamed from: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout */
/* loaded from: classes14.dex */
public class TextureViewSurfaceTextureListenerC15532xe9ad4809 extends android.widget.RelativeLayout implements com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener, android.view.TextureView.SurfaceTextureListener, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTBaseFunctionListener, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: l1, reason: collision with root package name */
    public static final int f218596l1 = rz2.g.a();
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final boolean F;
    public wu5.c G;
    public wu5.c H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public float f218597J;
    public long K;
    public boolean L;
    public int M;
    public long N;
    public boolean P;
    public long Q;
    public java.lang.String R;
    public java.lang.String S;
    public java.lang.String T;
    public float U;
    public java.lang.String V;
    public float W;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.SurfaceTexture f218598d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15542xf394888c f218599e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f218600f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f218601g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f218602h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 f218603i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f218604m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ProgressBar f218605n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15540x683732f0 f218606o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f218607p;

    /* renamed from: p0, reason: collision with root package name */
    public tz2.l f218608p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f218609q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 f218610r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd f218611s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.r f218612t;

    /* renamed from: u, reason: collision with root package name */
    public final android.content.Context f218613u;

    /* renamed from: v, reason: collision with root package name */
    public tz2.u f218614v;

    /* renamed from: w, reason: collision with root package name */
    public final tz2.j f218615w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode f218616x;

    /* renamed from: x0, reason: collision with root package name */
    public wu5.b f218617x0;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.animation.Animation f218618y;

    /* renamed from: y0, reason: collision with root package name */
    public final android.os.CountDownTimer f218619y0;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.animation.Animation f218620z;

    public TextureViewSurfaceTextureListenerC15532xe9ad4809(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFaceCheckResultSerialId */
    public java.lang.String m63476x6dcfd6c1() {
        tz2.u uVar = this.f218614v;
        return uVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s0) uVar).Y : "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:91|92)|(3:94|95|(3:96|97|(2:99|100)))|(5:102|103|104|105|(1:107))|109|110|111|(2:114|115)|(2:120|121)|125|126|127|128) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:91|92|94|95|96|97|(2:99|100)|(5:102|103|104|105|(1:107))|109|110|111|(2:114|115)|(2:120|121)|125|126|127|128) */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04ac, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04ad, code lost:
    
        r2 = new java.lang.StringBuilder("release camera2 failed : ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0484, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0485, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FaceUtilNew", "release previewTexture failed : " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0434, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0435, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FaceUtilNew", "stop camera preview failed : " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0338, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FaceUtilNew", "openCamera found front Camera ");
        r0 = new java.util.ArrayList();
        r14 = zj0.c.f554818a;
        r0.add(java.lang.Integer.valueOf(r13));
        r16 = new java.lang.Object();
        java.util.Collections.reverse(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0369, code lost:
    
        r13 = (android.hardware.Camera) yj0.a.k(r16, r0.toArray(), "com/tencent/mm/plugin/flash/utils/FaceUtilNew", "checkCam", "(Z)V", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;");
        r14 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x044a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0467 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0428 A[Catch: all -> 0x04b4, TRY_LEAVE, TryCatch #10 {all -> 0x04b4, blocks: (B:105:0x038e, B:107:0x03aa, B:149:0x03c2, B:151:0x03de, B:145:0x03e6, B:147:0x0402, B:141:0x040a, B:143:0x0428), top: B:96:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0402 A[Catch: all -> 0x04b4, TryCatch #10 {all -> 0x04b4, blocks: (B:105:0x038e, B:107:0x03aa, B:149:0x03c2, B:151:0x03de, B:145:0x03e6, B:147:0x0402, B:141:0x040a, B:143:0x0428), top: B:96:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03de A[Catch: all -> 0x04b4, TryCatch #10 {all -> 0x04b4, blocks: (B:105:0x038e, B:107:0x03aa, B:149:0x03c2, B:151:0x03de, B:145:0x03e6, B:147:0x0402, B:141:0x040a, B:143:0x0428), top: B:96:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0644  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.ThreadLocal] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v9, types: [int] */
    /* JADX WARN: Type inference failed for: r15v11, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r9v17, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r25) {
        /*
            Method dump skipped, instructions count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809.b(int):void");
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTBaseFunctionListener
    /* renamed from: base64Encode */
    public java.lang.String mo63468xbce55045(byte[] bArr, int i17) {
        return null;
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var;
        if (this.f218598d != null && (d0Var = this.f218610r) != null) {
            android.graphics.Point c17 = d0Var.c();
            android.graphics.SurfaceTexture surfaceTexture = this.f218598d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.b(this, c17);
            if (d0Var.f(surfaceTexture, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.c(this))) {
                d0Var.f218734d.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.w(d0Var, bVar));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "resetWithoutPreview");
        vz2.b.b(this.f218616x);
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15542xf394888c c15542xf394888c = this.f218599e;
        c15542xf394888c.getClass();
        c15542xf394888c.mo63489x83f16419(new android.graphics.ColorMatrixColorFilter(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        int d17 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd viewOnClickListenerC15534xde6dcfdd = this.f218611s;
        viewOnClickListenerC15534xde6dcfdd.Z6(d17);
        this.f218602h.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        this.f218601g.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        this.f218600f.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
        this.A = false;
        this.B = false;
        this.K = 0L;
        this.E = 0;
        this.f218599e.m63499x3ae760af(0.0f);
        this.f218605n.setVisibility(8);
        this.f218606o.a();
        this.f218606o.removeAllViews();
        android.view.View view = this.f218607p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f218615w.c();
        if (this.P) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0.class);
            if (j0Var.f218682e) {
                tz2.q qVar = j0Var.f218681d;
                if (qVar.f504850a && qVar.f504853d != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "resetRecord");
                    if (qVar.f504850a) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "releaseRecord");
                        h72.s.e().d();
                    }
                    qVar.d(qVar.f504853d);
                }
                qVar.e();
                j0Var.f218683f = "";
            }
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0 j0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0.class);
            if (j0Var2.f218682e) {
                j0Var2.f218681d.e();
            }
            this.f218608p0 = tz2.l.f504836e;
        }
        this.f218614v.mo167283x6761d4f();
        this.f218612t.getClass();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120769x6761d4f();
        viewOnClickListenerC15534xde6dcfdd.Z6(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
        f(i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f81499x6786c610));
    }

    public final java.lang.String d(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, i17);
            jSONObject.put("err_code", i17);
            jSONObject.put("err_msg", str);
            android.content.Intent intent = ((android.app.Activity) getContext()).getIntent();
            if (intent != null) {
                jSONObject.put("otherVerifyTitle", intent.getStringExtra("otherVerifyTitle"));
            }
            jSONObject.put("err_retry", 0);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "packageErrorResult error:%s", e17.getMessage());
        }
        return jSONObject.toString();
    }

    public final void e() {
        if (this.f218599e.m63496x6c781953() <= 0.0f) {
            this.f218599e.m63497x6c4ebec7(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.t(this));
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f218604m.getLayoutParams();
        marginLayoutParams.topMargin = (int) (this.f218599e.m63496x6c781953() - (this.f218604m.getHeight() / 2));
        this.f218604m.setLayoutParams(marginLayoutParams);
    }

    public final void f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "resetTranslateAnimation prepareVerifying:%s", java.lang.Boolean.valueOf(this.A));
        wu5.c cVar = this.G;
        if (cVar != null) {
            cVar.cancel(false);
            this.G = null;
        }
        wu5.c cVar2 = this.H;
        if (cVar2 != null) {
            cVar2.cancel(false);
            this.H = null;
        }
        g(this.f218601g, str);
        this.f218601g.setTextColor(android.graphics.Color.parseColor("#000000"));
        this.f218602h.setTextColor(android.graphics.Color.parseColor("#000000"));
        this.f218620z.setAnimationListener(null);
        this.f218618y.setAnimationListener(null);
        this.f218601g.clearAnimation();
        this.f218602h.clearAnimation();
        this.f218601g.setVisibility(0);
        this.f218602h.setVisibility(4);
        this.f218606o.setVisibility(4);
    }

    public final void g(android.widget.TextView textView, java.lang.String str) {
        textView.setText(str);
        tz2.e eVar = (tz2.e) this.f218614v;
        eVar.getClass();
        eVar.f504807s = java.lang.System.currentTimeMillis();
    }

    /* renamed from: getCircleY */
    public float m63477x6c781953() {
        return this.f218599e.m63496x6c781953();
    }

    /* renamed from: getFaceOtherVerifyTitle */
    public java.lang.String m63478x4845a922() {
        android.content.Intent intent = ((android.app.Activity) getContext()).getIntent();
        return intent != null ? intent.getStringExtra("otherVerifyTitle") : "";
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTBaseFunctionListener
    /* renamed from: getVoiceData */
    public byte[] mo63469xc2a8cd46() {
        h();
        return com.p314xaae8f345.mm.vfs.w6.N(((tz2.i) this.f218614v).F.f331426c, -1, -1);
    }

    public final void h() {
        tz2.u uVar;
        tz2.j jVar = this.f218615w;
        if (jVar == null || (uVar = this.f218614v) == null) {
            return;
        }
        jVar.f(((tz2.e) uVar).f504798g);
    }

    public final void i(tz2.l cdnUploadType) {
        if (this.P) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0.class);
            j0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnUploadType, "cdnUploadType");
            if (j0Var.f218682e) {
                tz2.q qVar = j0Var.f218681d;
                qVar.getClass();
                if (qVar.f504850a && h72.s.e().h()) {
                    h72.s.e().l(new tz2.o(qVar, cdnUploadType));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener
    /* renamed from: onFrameworkEvent */
    public void mo63470x53c0c6fb(java.util.HashMap hashMap) {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.a0(this, hashMap));
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener
    /* renamed from: onGetAppBrightness */
    public float mo63471xee427d9b() {
        return 1.0f;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener
    /* renamed from: onNetworkRequestEvent */
    public void mo63472x2ed2023a(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        this.f218614v.mo63480x2ed2023a(str, str2, hashMap, iYtSDKKitNetResponseParser);
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener
    /* renamed from: onReflectEvent */
    public void mo63473xbd8fe55c(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onReflectEvent change color :%s isVerifying:%s", colorMatrixColorFilter, java.lang.Boolean.valueOf(this.B));
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.d(this, colorMatrixColorFilter));
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener
    /* renamed from: onReflectStart */
    public void mo63474xbe543724(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onReflectStart duration:%s", java.lang.Long.valueOf(j17));
        if (j17 > 0) {
            vz2.c.j("reflect");
            this.f218597J = (float) j17;
            this.K = java.lang.System.currentTimeMillis();
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.e(this));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", " onSceneEnd errType：%s errCode：%s errMsg：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof j72.b) {
            r45.kf3 kf3Var = ((j72.b) m1Var).f379573f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd viewOnClickListenerC15534xde6dcfdd = this.f218611s;
            if (i17 != 0 || i18 != 0) {
                this.f218600f.setVisibility(8);
                viewOnClickListenerC15534xde6dcfdd.a7(d(90037, i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7q)));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", " response.ret_code：%s response.ret_msg：%s", java.lang.Integer.valueOf(kf3Var.f460178d), kf3Var.f460179e);
            if (kf3Var.f460178d != 0) {
                this.f218600f.setVisibility(8);
                viewOnClickListenerC15534xde6dcfdd.a7(d(kf3Var.f460178d, kf3Var.f460179e));
                return;
            }
            boolean z17 = kf3Var.f460181g;
            this.P = z17;
            this.f218609q = kf3Var.f460184m;
            tz2.t.f504858a = kf3Var.f460185n;
            int i19 = kf3Var.f460182h;
            if (i19 > 0) {
                this.Q = i19;
            }
            r45.il6 il6Var = kf3Var.f460183i;
            this.R = il6Var.f458671f;
            this.T = il6Var.f458670e;
            this.S = il6Var.f458669d;
            this.U = il6Var.f458672g;
            this.V = il6Var.f458674i;
            this.W = il6Var.f458673h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "NetSceneGetFaceCheckLiveType response shouldRecordExtraVideo: %s, response extra_video_max_size: %s, extraVideoMaxSize: ", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(kf3Var.f460182h), java.lang.Long.valueOf(this.Q));
            b(kf3Var.f460180f);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onSurfaceTextureAvailable width:%s,height:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        e();
        this.f218598d = surfaceTexture;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var = this.f218610r;
        if (d0Var.f218741k || this.B || getVisibility() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "jump start preview again. isPreviewing:%s isVerifying:%s", java.lang.Boolean.valueOf(d0Var.f218741k), java.lang.Boolean.valueOf(this.B));
            return;
        }
        this.N = java.lang.System.currentTimeMillis();
        this.f218599e.setVisibility(0);
        d0Var.d(this.f218603i, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s(this, surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onSurfaceTextureDestroyed");
        this.f218598d = null;
        this.f218610r.g();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onSurfaceTextureSizeChanged width:%s,height:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC15532xe9ad4809(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f218610r = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0(getContext());
        this.f218611s = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd) getContext();
        this.f218612t = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.r();
        android.content.Context context2 = getContext();
        this.f218613u = context2;
        this.f218615w = new tz2.j();
        this.f218616x = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE;
        this.f218618y = new android.view.animation.TranslateAnimation(0.0f, -i65.a.B(getContext()), 0.0f, 0.0f);
        this.f218620z = new android.view.animation.TranslateAnimation(i65.a.B(getContext()), 0.0f, 0.0f, 0.0f);
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.F = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_action_new_ui_copy_data, true);
        this.I = 2;
        this.f218597J = 0.0f;
        this.K = 0L;
        this.L = false;
        this.M = 1;
        this.P = false;
        this.Q = 8388608L;
        this.R = "";
        this.S = "";
        this.T = "";
        this.U = 0.0f;
        this.V = "";
        this.W = 0.0f;
        this.f218608p0 = tz2.l.f504836e;
        this.f218619y0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.m(this, 25000L, 50000L);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570282aa4, (android.view.ViewGroup) this, true);
        this.f218599e = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15542xf394888c) findViewById(com.p314xaae8f345.mm.R.id.f566542g82);
        this.f218601g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g89);
        this.f218602h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g88);
        this.f218604m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dme);
        this.f218605n = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.dnv);
        this.f218606o = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15540x683732f0) findViewById(com.p314xaae8f345.mm.R.id.g7x);
        this.f218607p = findViewById(com.p314xaae8f345.mm.R.id.g7u);
        this.f218600f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g8_);
        android.content.Intent intent = ((android.app.Activity) getContext()).getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "intent == null");
            db5.e1.y(context2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7q) : "", "", context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7p), new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.f(this, 90013, "init data failed"));
            return;
        }
        int intExtra = intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        java.lang.String stringExtra = intent.getStringExtra("package");
        java.lang.String stringExtra2 = intent.getStringExtra("packageSign");
        java.lang.String stringExtra3 = intent.getStringExtra("faceVerifyTitle");
        boolean booleanExtra = intent.getBooleanExtra("useHttp", false);
        tz2.t.f504858a = false;
        tz2.t.f504859b = false;
        tz2.t.f504860c = "";
        tz2.t.f504861d = null;
        tz2.t.f504862e = null;
        if (booleanExtra) {
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
            cronetRequestParams.f18181xe78dee5f = 1;
            cronetRequestParams.url = "https://payapp.wechatpay.cn/faceplat/getfacechecklivetype";
            cronetRequestParams.f18174xbfc5d0e1 = "POST";
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("user-agent", ik1.l0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "", (ik1.k0) nd.f.a(ik1.k0.class)));
            hashMap.put("Accept-Encoding", "gzip,compress,br,deflate");
            hashMap.put("charset", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            cronetRequestParams.m37968xeb7416ae(hashMap);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(intExtra));
            hashMap2.put("package", stringExtra);
            cronetRequestParams.f18159x6574fc6c = new org.json.JSONObject(hashMap2).toString().getBytes();
            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37962x5ffa1e0c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.h(this));
            this.f218617x0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j(this, m37962x5ffa1e0c);
            if (m37962x5ffa1e0c != null) {
                if (m37962x5ffa1e0c.f18157x23aa2e05 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http request, CronetLogic startCronetHttpTask fail!");
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.k(this);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(kVar, 1000L, false);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http request, CronetLogic startCronetHttpTask success!");
                ((ku5.t0) ku5.t0.f394148d).k(this.f218617x0, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http request, CronetHttpsCreateResult is null!");
            ku5.u0 u0Var2 = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.l(this);
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.z(lVar, 1000L, false);
            return;
        }
        j72.b bVar = new j72.b(intExtra, stringExtra, stringExtra2, stringExtra3);
        gm0.j1.d().a(5965, this);
        gm0.j1.d().g(bVar);
    }
}
