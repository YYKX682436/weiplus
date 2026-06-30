package ay;

/* loaded from: classes14.dex */
public final class l extends ay.i {

    /* renamed from: n, reason: collision with root package name */
    public final xx.y f15160n;

    /* renamed from: o, reason: collision with root package name */
    public int f15161o;

    /* renamed from: p, reason: collision with root package name */
    public int f15162p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.lifecycle.j0 f15163q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.lifecycle.j0 f15164r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.j0 f15165s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f15166t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15167u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f15168v;

    /* renamed from: w, reason: collision with root package name */
    public int f15169w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15170x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jy.m screenInfo, xx.y dataReporter) {
        super(screenInfo);
        kotlin.jvm.internal.o.g(screenInfo, "screenInfo");
        kotlin.jvm.internal.o.g(dataReporter, "dataReporter");
        this.f15160n = dataReporter;
        this.f15163q = new androidx.lifecycle.j0();
        this.f15164r = new androidx.lifecycle.j0();
        this.f15165s = new androidx.lifecycle.j0();
        this.f15166t = com.tencent.mm.sdk.platformtools.o4.L();
        this.f15169w = -1;
        java.util.Collections.synchronizedSet(new java.util.HashSet());
    }

    @Override // wx.g1
    public void J6(com.tencent.wechat.aff.chatbot.j jVar) {
        this.f15164r.postValue(java.lang.Boolean.TRUE);
        this.f15160n.d();
    }

    public final void P6(boolean z17) {
        this.f15170x = z17;
        jz5.g gVar = this.f15151f;
        if (z17) {
            ((gy.c) ((jz5.n) gVar).getValue()).f();
        } else {
            ((gy.c) ((jz5.n) gVar).getValue()).e();
        }
    }

    public final void Q6(boolean z17, boolean z18) {
        long parseLong;
        com.tencent.mars.xlog.Log.i(this.f15150e, " startPullQueryList");
        com.tencent.wechat.aff.chatbot.v1 b17 = this.f15149d.f302473d.b();
        if (b17 != null) {
            try {
                java.lang.String str = b17.f216494i[5] ? b17.f216493h : "";
                kotlin.jvm.internal.o.f(str, "getStringBizuin(...)");
                byte[] decode = android.util.Base64.decode(str, 0);
                if (decode != null) {
                    str = new java.lang.String(decode, r26.c.f368865a);
                }
                parseLong = java.lang.Long.parseLong(r26.n0.u0(str).toString());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("ChatBotBrandDataReporter", e17.getMessage(), e17);
            }
            com.tencent.wechat.aff.chatbot.w0 w0Var = com.tencent.wechat.aff.chatbot.w0.f216518b;
            com.tencent.wechat.aff.chatbot.k kVar = new com.tencent.wechat.aff.chatbot.k();
            kVar.f216314e = 0L;
            boolean[] zArr = kVar.f216316g;
            zArr[2] = true;
            kVar.f216313d = parseLong;
            zArr[1] = true;
            kVar.f216315f = false;
            zArr[3] = true;
            w0Var.e(kVar, new ay.k(this, z18));
        }
        parseLong = 0;
        com.tencent.wechat.aff.chatbot.w0 w0Var2 = com.tencent.wechat.aff.chatbot.w0.f216518b;
        com.tencent.wechat.aff.chatbot.k kVar2 = new com.tencent.wechat.aff.chatbot.k();
        kVar2.f216314e = 0L;
        boolean[] zArr2 = kVar2.f216316g;
        zArr2[2] = true;
        kVar2.f216313d = parseLong;
        zArr2[1] = true;
        kVar2.f216315f = false;
        zArr2[3] = true;
        w0Var2.e(kVar2, new ay.k(this, z18));
    }

    @Override // wx.g1
    public void Qc(int i17) {
        com.tencent.mars.xlog.Log.i(this.f15150e, "onRoomMemberChange memberCount:" + i17);
        this.f15161o = i17 + (-1);
        R6();
    }

    public final void R6() {
        java.lang.String str;
        int i17 = this.f15161o;
        if (i17 <= 0) {
            str = "";
        } else if (this.f15162p > 0) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n77, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f15162p));
            kotlin.jvm.internal.o.d(str);
        } else {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n78, java.lang.Integer.valueOf(i17));
            kotlin.jvm.internal.o.d(str);
        }
        this.f15163q.postValue(str);
        xx.z zVar = this.f15160n.f457840m;
        zVar.f457845c = this.f15161o;
        int i18 = this.f15162p;
        zVar.f457846d = i18;
        zVar.f457844b = java.lang.Math.abs(i18 - this.f15169w);
    }

    @Override // wx.g1
    public void X8() {
        com.tencent.mars.xlog.Log.i(this.f15150e, "onTalkSucc");
        this.f15160n.i(0L);
    }

    @Override // wx.g1
    public void Yb(com.tencent.wechat.aff.chatbot.j jVar) {
        this.f15164r.postValue(java.lang.Boolean.FALSE);
        this.f15160n.e(xx.e.f457784e);
    }

    @Override // ay.i, androidx.lifecycle.c1
    public void onCleared() {
        java.lang.String str;
        super.onCleared();
        if (kotlin.jvm.internal.o.b(this.f15164r.getValue(), java.lang.Boolean.TRUE)) {
            xx.e eVar = xx.e.f457786g;
            boolean z17 = this.f15167u;
            ay.w wVar = (ay.w) this.f15165s.getValue();
            if (wVar == null || (str = wVar.f15192a) == null) {
                str = "";
            }
            this.f15160n.f(eVar, z17, str);
        }
    }
}
