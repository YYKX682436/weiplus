package ue;

/* loaded from: classes7.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 f508301d;

    /* renamed from: e, reason: collision with root package name */
    public final int f508302e;

    /* renamed from: f, reason: collision with root package name */
    public final long f508303f;

    /* renamed from: g, reason: collision with root package name */
    public final long f508304g;

    /* renamed from: h, reason: collision with root package name */
    public final long f508305h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f508306i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f508307m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f508308n;

    public e(com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 commonBinding, int i17, long j17, long j18, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commonBinding, "commonBinding");
        this.f508301d = commonBinding;
        this.f508302e = i17;
        this.f508303f = j17;
        this.f508304g = j18;
        this.f508305h = j19;
        this.f508306i = new java.util.ArrayList();
        this.f508307m = new java.util.ArrayList();
        this.f508308n = new java.util.ArrayList();
        final ue.a aVar = new ue.a(this);
        commonBinding.m43163x2e3aff5c(i17, new java.lang.Runnable(aVar) { // from class: ue.d

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f508300d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "function");
                this.f508300d = aVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f508300d.mo152xb9724478();
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d1 d1Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public void C(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public long G() {
        return this.f508304g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d1 H() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    public int K() {
        return this.f508301d.m43139xd6bc210(this.f508302e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public long L() {
        return this.f508303f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String script, android.webkit.ValueCallback valueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        this.f508301d.m43138x74b54fe7(script, this.f508302e, valueCallback);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public void Q(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String script, cl.j1 j1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        this.f508301d.m43138x74b54fe7(script, this.f508302e, new ue.c(j1Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void R(java.net.URL url, java.lang.String script, android.webkit.ValueCallback valueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        this.f508301d.m43138x74b54fe7(script, this.f508302e, valueCallback);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    public void U(int i17, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.f508301d.m43166x31193819(this.f508302e, i17, byteBuffer);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public java.lang.String a() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: addJavascriptInterface */
    public void mo14658x74041feb(java.lang.Object obj, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    /* renamed from: bufferStoreBindTo */
    public void mo51554x2418f779(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y
    public void d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
        this.f508308n.add(l17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: destroy */
    public void mo14659x5cd39ffa() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String script, android.webkit.ValueCallback valueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        this.f508301d.m43138x74b54fe7(script, this.f508302e, valueCallback);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y
    public void f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x xVar, boolean z17) {
        if (xVar == null) {
            return;
        }
        if (z17) {
            this.f508307m.add(xVar);
        } else {
            this.f508306i.add(xVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public boolean g() {
        return this.f508301d.m43145x54837abc(this.f508302e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public void h(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h0(java.lang.Class addon) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addon, "addon");
        if (addon.isInstance(this)) {
            return this;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    public java.nio.ByteBuffer j0(int i17, boolean z17) {
        return this.f508301d.m43141x5f7a9d14(this.f508302e, i17, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    public void k(java.lang.Runnable r17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        this.f508301d.m43165x37ccb431(this.f508302e, r17, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public void l0(java.util.ArrayList scripts, java.lang.String str, cl.j1 j1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scripts, "scripts");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        java.util.Iterator it = scripts.iterator();
        while (it.hasNext()) {
            com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e9 = (com.p159x477cd522.p160x333422.C1481x17e6a5e9) it.next();
            if (c1481x17e6a5e9.f4815xcdd276a5 == 3) {
                this.f508301d.m43138x74b54fe7(c1481x17e6a5e9.f4814xcdd22c98, this.f508302e, new ue.b(f0Var, scripts, j1Var));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    public boolean p() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0
    /* renamed from: post */
    public void mo51545x3498a0(java.lang.Runnable r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        this.f508301d.m43165x37ccb431(this.f508302e, r17, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x xVar) {
        f0(xVar, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    /* renamed from: releaseDirectByteBuffer */
    public void mo51547x3b42e258(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.f508301d.m43170xc6737330(byteBuffer);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: setJsExceptionHandler */
    public void mo14673x29497b66(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s sVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v
    /* renamed from: supportBufferStoreBindTo */
    public boolean mo51555xa0ce6f6a() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public void v() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0
    public long z() {
        return this.f508305h;
    }
}
