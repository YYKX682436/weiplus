package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class n0 extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d, xq4.d {

    /* renamed from: d, reason: collision with root package name */
    public int f177484d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f177485e;

    /* renamed from: f, reason: collision with root package name */
    public int f177486f;

    /* renamed from: g, reason: collision with root package name */
    public int f177487g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r f177488h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2350xae79c325.p2351x34a233.C18926x6d210aeb f177489i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 f177490m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034 f177491n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f177492o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f177493p;

    /* renamed from: q, reason: collision with root package name */
    public int f177494q;

    /* renamed from: r, reason: collision with root package name */
    public int f177495r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c f177496s;

    public n0(android.content.Context context, fw1.d dVar, int i17, int i18) {
        super(context);
        this.f177484d = 0;
        this.f177485e = "";
        this.f177486f = -1;
        this.f177487g = 0;
        this.f177488h = null;
        this.f177493p = false;
        this.f177494q = 0;
        this.f177495r = 0;
        this.f177496s = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "anlin OpenVoiceOpenGlView: mWidth: " + i17 + ", height: " + i18);
        this.f177488h = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r(i17, i18);
        this.f177486f = dVar.f348602a;
        this.f177485e = dVar.f348603b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034 c18925x76a15034 = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034(context);
        this.f177491n = c18925x76a15034;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65 = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65(c18925x76a15034, null, 0);
        this.f177490m = c18924x4c862f65;
        this.f177492o = true;
        c18925x76a15034.m72910x5913df45(c18924x4c862f65);
        c18925x76a15034.m72901x638e3a5b(0);
        addView(c18925x76a15034);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2350xae79c325.p2351x34a233.C18926x6d210aeb c18926x6d210aeb = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2350xae79c325.p2351x34a233.C18926x6d210aeb(context);
        this.f177489i = c18926x6d210aeb;
        addView(c18926x6d210aeb, new android.widget.RelativeLayout.LayoutParams(1, 1));
        c18926x6d210aeb.setVisibility(0);
        c18926x6d210aeb.setAlpha(0.0f);
    }

    public float[] a(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("position"));
            float h17 = ik1.w.h(jSONObject2, "left", 0.0f);
            float h18 = ik1.w.h(jSONObject2, "top", 0.0f);
            float h19 = ik1.w.h(jSONObject2, "width", 0.0f);
            float h27 = ik1.w.h(jSONObject2, "height", 0.0f);
            int optInt = jSONObject.optInt("zIndex", 0);
            try {
                this.f177494q = (int) jSONObject2.optDouble("width", 0.0d);
                this.f177495r = (int) jSONObject2.optDouble("height", 0.0d);
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "w:%f, h:%f, logicWidth:%d, logicHeight:%d", java.lang.Float.valueOf(h19), java.lang.Float.valueOf(h27), java.lang.Integer.valueOf(this.f177494q), java.lang.Integer.valueOf(this.f177495r));
            return new float[]{h17, h18, h19, h27, optInt};
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "enter full screen to direction %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c cVar = this.f177496s;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "enter full screen: full screen delegate is null");
        } else {
            cVar.d(i17);
        }
    }

    @Override // xq4.d
    public void e(int i17) {
        if (android.provider.Settings.System.getInt(getContext().getContentResolver(), "accelerometer_rotation", 0) != 0) {
            fw1.i.a(i17, this.f177488h.f546093d);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: exitFullScreen */
    public void mo54515xd02faf99() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "exit full screen");
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c cVar = this.f177496s;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "exit full screen: full screen delegate is null");
        } else {
            cVar.mo54529xd02faf99();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void f(int i17) {
        if (i17 == this.f177486f) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "updateMemberId, viewId:" + this.f177484d + ", openId:" + this.f177485e + ", memberId:[" + this.f177486f + "->" + i17 + "]");
        this.f177486f = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getLogicHeight */
    public int mo54516xceb434ef() {
        int i17 = this.f177495r;
        return i17 > 0 ? i17 : ik1.w.d(getHeight());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getLogicWidth */
    public int mo54517x72daf0fe() {
        int i17 = this.f177494q;
        return i17 > 0 ? i17 : ik1.w.d(getWidth());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getMemberId */
    public int mo54518x552492cb() {
        return this.f177486f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getOpenId */
    public java.lang.String mo54519x28dae7fb() {
        return this.f177485e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: getViewId */
    public int mo54526x346a5196() {
        return this.f177484d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "uint, viewId:" + this.f177484d + ", openId:" + this.f177485e + ", memberId:" + this.f177486f);
        this.f177488h.i();
        this.f177488h.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65 = this.f177490m;
        java.lang.ref.WeakReference weakReference = c18924x4c862f65.f258590e;
        if (weakReference != null && weakReference.get() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034 c18925x76a15034 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034) c18924x4c862f65.f258590e.get();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("OpenGlRender", "releaseSurfaceTexture:%s", c18925x76a15034);
            c18925x76a15034.b(new wq4.s(c18924x4c862f65));
            java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.D;
            synchronized (obj) {
                try {
                    obj.wait(100L);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "releaseSurfaceTexture wait finish");
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("OpenGlRender", e17, "", new java.lang.Object[0]);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f652 = this.f177490m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "%s onStop, renderMode: %s", java.lang.Integer.valueOf(c18924x4c862f652.hashCode()), java.lang.Integer.valueOf(c18924x4c862f652.f258591f));
        c18924x4c862f652.f258587b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[Catch: JSONException -> 0x00b6, TryCatch #1 {JSONException -> 0x00b6, blocks: (B:3:0x003a, B:5:0x0040, B:6:0x004f, B:8:0x0058, B:11:0x0076, B:13:0x007a, B:15:0x0087, B:20:0x008c, B:22:0x0090, B:26:0x0095, B:28:0x009e, B:30:0x00a6, B:32:0x00ae), top: B:2:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(org.json.JSONObject r9) {
        /*
            r8 = this;
            java.lang.String r0 = "back"
            java.lang.String r1 = "camera:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "update, viewId:"
            r2.<init>(r3)
            int r3 = r8.f177484d
            r2.append(r3)
            java.lang.String r3 = ", openId:"
            r2.append(r3)
            java.lang.String r3 = r8.f177485e
            r2.append(r3)
            java.lang.String r3 = ", memberId:"
            r2.append(r3)
            int r3 = r8.f177486f
            r2.append(r3)
            java.lang.String r3 = ", data:"
            r2.append(r3)
            java.lang.String r3 = r9.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.OpenVoice.OpenVoiceOpenGlView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            float[] r2 = r8.a(r9)     // Catch: org.json.JSONException -> Lb6
            if (r2 == 0) goto L4f
            com.tencent.mm.plugin.voip.video.OpenGlView r4 = r8.f177491n     // Catch: org.json.JSONException -> Lb6
            android.graphics.SurfaceTexture r5 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258360n2     // Catch: org.json.JSONException -> Lb6
            r6 = 2
            r6 = r2[r6]     // Catch: org.json.JSONException -> Lb6
            int r6 = (int) r6     // Catch: org.json.JSONException -> Lb6
            r7 = 3
            r2 = r2[r7]     // Catch: org.json.JSONException -> Lb6
            int r2 = (int) r2     // Catch: org.json.JSONException -> Lb6
            r4.onSurfaceTextureSizeChanged(r5, r6, r2)     // Catch: org.json.JSONException -> Lb6
        L4f:
            java.lang.String r2 = "config"
            org.json.JSONObject r9 = r9.optJSONObject(r2)     // Catch: org.json.JSONException -> Lb6
            r2 = 1
            if (r9 == 0) goto L75
            java.lang.String r4 = "camera"
            java.lang.String r9 = r9.optString(r4, r0)     // Catch: org.json.JSONException -> Lb6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lb6
            r4.<init>(r1)     // Catch: org.json.JSONException -> Lb6
            r4.append(r9)     // Catch: org.json.JSONException -> Lb6
            java.lang.String r1 = r4.toString()     // Catch: org.json.JSONException -> Lb6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)     // Catch: org.json.JSONException -> Lb6
            boolean r9 = r9.equals(r0)     // Catch: org.json.JSONException -> Lb6
            if (r9 == 0) goto L75
            r9 = 0
            goto L76
        L75:
            r9 = r2
        L76:
            boolean r0 = r8.f177493p     // Catch: org.json.JSONException -> Lb6
            if (r9 == r0) goto Lc1
            r8.f177493p = r9     // Catch: org.json.JSONException -> Lb6
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r r9 = r8.f177488h     // Catch: org.json.JSONException -> Lb6
            r9.a()     // Catch: org.json.JSONException -> Lb6
            com.tencent.mm.plugin.voip.video.OpenGlRender r9 = r8.f177490m     // Catch: org.json.JSONException -> Lb6
            boolean r0 = r9.f258602q     // Catch: org.json.JSONException -> Lb6
            if (r0 == 0) goto Lc1
            p05.l4 r0 = r9.f258598m     // Catch: org.json.JSONException -> Lb6
            if (r0 != 0) goto L8c
            goto Lc1
        L8c:
            int r0 = r9.f258600o     // Catch: org.json.JSONException -> Lb6
            if (r0 == 0) goto Lc1
            int r0 = r9.f258601p     // Catch: org.json.JSONException -> Lb6
            if (r0 != 0) goto L95
            goto Lc1
        L95:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch: org.json.JSONException -> Lb6
            r0.<init>(r2)     // Catch: org.json.JSONException -> Lb6
            java.lang.ref.WeakReference r1 = r9.f258590e     // Catch: org.json.JSONException -> Lb6
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r1.get()     // Catch: org.json.JSONException -> Lb6
            com.tencent.mm.plugin.voip.video.OpenGlView r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034) r1     // Catch: org.json.JSONException -> Lb6
            if (r1 == 0) goto Lae
            wq4.t r2 = new wq4.t     // Catch: org.json.JSONException -> Lb6
            r2.<init>(r9, r0)     // Catch: org.json.JSONException -> Lb6
            r1.b(r2)     // Catch: org.json.JSONException -> Lb6
        Lae:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: org.json.JSONException -> Lb6 java.lang.InterruptedException -> Lc1
            r1 = 2
            r0.await(r1, r9)     // Catch: org.json.JSONException -> Lb6 java.lang.InterruptedException -> Lc1
            goto Lc1
        Lb6:
            r9 = move-exception
            java.lang.String r0 = "parse position error. Exception :%s"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0, r9)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.n0.i(org.json.JSONObject):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void k(org.json.JSONObject jSONObject) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        this.f177484d = jSONObject.optInt("viewId");
        this.f177493p = true;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("camera", "back");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "camera:" + optString);
            if (optString.equals("back")) {
                this.f177493p = false;
            }
        }
        boolean z17 = this.f177493p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r rVar = this.f177488h;
        rVar.d(this, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2350xae79c325.p2351x34a233.C18926x6d210aeb c18926x6d210aeb = this.f177489i;
        if (c18926x6d210aeb != null) {
            rVar.f546102p = c18926x6d210aeb;
            c18926x6d210aeb.m72363x31bff2e0(rVar);
            rVar.f546101o = true;
        }
        rVar.h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "init, viewId:" + this.f177484d + ", openId:" + this.f177485e + ", memberId:" + this.f177486f + ", data:" + jSONObject.toString());
        br4.e.b().f105254d = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.m0(this);
        try {
            float[] a17 = a(jSONObject);
            if (a17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034 c18925x76a15034 = this.f177491n;
                float f17 = a17[2];
                int i17 = (int) a17[3];
                c18925x76a15034.getClass();
                if (com.p314xaae8f345.mm.ui.bk.w()) {
                    layoutParams = new android.widget.RelativeLayout.LayoutParams((i17 * 9) / 16, i17);
                    layoutParams.addRule(13);
                } else {
                    layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                }
                c18925x76a15034.setLayoutParams(layoutParams);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "parse position error. Exception :%s", e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65 = this.f177490m;
        c18924x4c862f65.f258587b = true;
        c18924x4c862f65.g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean n(int i17, int i18) {
        return this.f177488h.n(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    /* renamed from: setFullScreenDelegate */
    public void mo54527xda608282(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c cVar) {
        this.f177496s = cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean t() {
        return false;
    }

    @Override // xq4.d
    public void v(byte[] bArr, long j17, int i17, int i18, int i19, int i27, double d17) {
        boolean z17;
        int i28;
        int i29;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034 c18925x76a15034;
        int i37 = this.f177487g;
        this.f177487g = i37 + 1;
        if (i37 % 50 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "onFrameDataReady, w:" + i17 + ",h:" + i18 + ",format:" + i19 + ",len:" + bArr.length + ",size:" + j17 + ",rotate:" + i27 + ",time:" + d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.y2 y2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.f177552h;
        synchronized (y2Var) {
            z17 = y2Var.f177675c;
        }
        if (z17) {
            int i38 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65 = this.f177490m;
            if (c18924x4c862f65.f258602q && c18924x4c862f65.f258598m != null && bArr.length >= i17 * i18) {
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                c18924x4c862f65.f258599n = bArr;
                java.lang.ref.WeakReference weakReference = c18924x4c862f65.f258590e;
                if (weakReference != null && (c18925x76a15034 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034) weakReference.get()) != null) {
                    c18925x76a15034.b(new wq4.u(c18924x4c862f65, i17, i18, 0, countDownLatch));
                }
                try {
                    countDownLatch.await(2L, java.util.concurrent.TimeUnit.SECONDS);
                } catch (java.lang.InterruptedException unused) {
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
            p0Var.getClass();
            p0Var.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.y1(p0Var, i19 + i27, i17, i18, bArr));
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r rVar = this.f177488h;
            if (rVar.f546093d) {
                int i39 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
                i28 = 16;
            } else {
                i28 = 0;
            }
            if (rVar.f546094e) {
                int i47 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
                i29 = 12;
            } else {
                int i48 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
                i29 = 4;
            }
            int i49 = i28 + 3 + i29;
            if (c18924x4c862f65.f258586a && c18924x4c862f65.f258592g == null) {
                c18924x4c862f65.f258593h = i17;
                c18924x4c862f65.f258594i = i18;
                c18924x4c862f65.f258595j = i49;
                c18924x4c862f65.f258592g = bArr;
                c18924x4c862f65.f258605t = true;
                c18924x4c862f65.f258606u = 3;
                c18924x4c862f65.g();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean x() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean z() {
        return false;
    }
}
