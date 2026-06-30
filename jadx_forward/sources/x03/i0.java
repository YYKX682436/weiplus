package x03;

/* loaded from: classes15.dex */
public final class i0 implements x03.r1 {

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.Boolean f532576p = java.lang.Boolean.FALSE;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f532577a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f532578b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f532579c;

    /* renamed from: d, reason: collision with root package name */
    public x03.s1 f532580d;

    /* renamed from: e, reason: collision with root package name */
    public long f532581e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f532582f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f532583g;

    /* renamed from: h, reason: collision with root package name */
    public int f532584h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f532585i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f532586j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f532587k;

    /* renamed from: l, reason: collision with root package name */
    public x03.s f532588l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f532589m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f532590n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f532591o;

    public i0(android.content.Context _context, java.lang.String _url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_context, "_context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_url, "_url");
        this.f532577a = "MicroMsg.FlutterVideoHLSPlayer";
        this.f532582f = _url;
        this.f532583g = "";
        this.f532586j = "";
        this.f532587k = "";
        this.f532591o = p3325xe03a0797.p3326xc267989b.z0.b();
        ((ku5.t0) ku5.t0.f394148d).B(new x03.o(this));
        ((ku5.t0) ku5.t0.f394148d).B(new x03.q(this));
        java.lang.Boolean bool = f532576p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (!bool.booleanValue()) {
            f532576p = java.lang.Boolean.TRUE;
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101112x7421050a(_context, "60303", 1);
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101129xd5038bcf(true);
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101132x4f6110c3(100);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101082x5f9ba979 = com.p314xaae8f345.p3006xb8ff1437.api.C26184x9df96dcd.m101082x5f9ba979(_context);
        this.f532578b = m101082x5f9ba979;
        if (m101082x5f9ba979 != null) {
            m101082x5f9ba979.mo100957x5dd7c812(new x03.t(this));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532578b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100954x6954c27b(new x03.u(this));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532578b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100951xa4560c71(new x03.v(this));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc63 = this.f532578b;
        if (interfaceC26164x73fc6bc63 != null) {
            interfaceC26164x73fc6bc63.mo100958xe1a2e326(new x03.w(this));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc64 = this.f532578b;
        if (interfaceC26164x73fc6bc64 != null) {
            interfaceC26164x73fc6bc64.mo100956xa23b7bf3(new x03.x(this));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc65 = this.f532578b;
        if (interfaceC26164x73fc6bc65 != null) {
            interfaceC26164x73fc6bc65.mo100955x40f8c003(new x03.y(this));
        }
    }

    @Override // ph3.c
    public void a(int i17) {
        java.lang.String str = "video_status seek " + this.f532578b + ", state: " + this.f532584h + " mSec: " + i17;
        java.lang.String str2 = this.f532577a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (this.f532584h < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "video_status wrong seek");
            return;
        }
        x03.s sVar = this.f532588l;
        if (sVar != null) {
            java.util.Objects.toString(sVar.f532656s.f532578b);
            x03.v0 v0Var = x03.x0.f532694d;
            x03.i iVar = v0Var.a().f532697b;
            iVar.getClass();
            java.lang.String mainMediaId = sVar.f532644d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainMediaId, "mainMediaId");
            java.util.Map map = iVar.f532574g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                x03.f fVar = (x03.f) entry.getValue();
                if (!fVar.f532550f) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    if (r26.i0.y(str3, mainMediaId.concat("@"), false) && fVar.f532551g) {
                        v0Var.a().f532698c.b(str3);
                        fVar.f532551g = false;
                    }
                }
            }
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f532591o, null, null, new x03.b0(this, i17, null), 3, null);
    }

    @Override // x03.r1
    public void b(boolean z17) {
        p3325xe03a0797.p3326xc267989b.l.d(this.f532591o, null, null, new x03.c0(this, z17, null), 3, null);
    }

    @Override // ph3.c
    public void c(float f17) {
        p3325xe03a0797.p3326xc267989b.l.d(this.f532591o, null, null, new x03.e0(this, f17, null), 3, null);
    }

    @Override // x03.r1
    public void d(java.lang.String str) {
    }

    @Override // x03.r1
    public void e(double d17) {
        p3325xe03a0797.p3326xc267989b.l.d(this.f532591o, null, null, new x03.f0(this, d17, null), 3, null);
    }

    @Override // x03.r1
    public void f(x03.s1 s1Var) {
        this.f532580d = s1Var;
    }

    @Override // x03.r1
    public double g() {
        x03.f b17;
        x03.s sVar = this.f532588l;
        java.lang.String str = sVar != null ? sVar.f532649i : null;
        x03.v0 v0Var = x03.x0.f532694d;
        if (str != null) {
            x03.x0 a17 = v0Var.a();
            x03.s sVar2 = this.f532588l;
            b17 = a17.f532697b.b(sVar2 != null ? sVar2.f532649i : null);
        } else {
            b17 = v0Var.a().f532697b.b(this.f532583g);
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(b17.f532545a);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(b17.f532547c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        if (valueOf.longValue() > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf2);
            if (valueOf2.longValue() > 0) {
                return ((valueOf.longValue() * 100.0d) / valueOf2.longValue()) * 1.0d;
            }
        }
        return 0.0d;
    }

    @Override // x03.r1
    /* renamed from: getCurrentPosition */
    public long mo174783x9746038c() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532578b;
        long mo100915xddd35a52 = interfaceC26164x73fc6bc6 != null ? interfaceC26164x73fc6bc6.mo100915xddd35a52() : 0L;
        if (((int) mo100915xddd35a52) != 0) {
            return mo100915xddd35a52;
        }
        long j17 = this.f532581e;
        this.f532581e = 500 + j17;
        return j17;
    }

    @Override // ph3.c
    /* renamed from: getDurationMs */
    public long mo158540x37a7fa50() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532578b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100917x37a7fa50();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532578b;
        if (interfaceC26164x73fc6bc62 != null) {
            return interfaceC26164x73fc6bc62.mo100917x37a7fa50();
        }
        return 0L;
    }

    @Override // x03.r1
    /* renamed from: getHeight */
    public int mo174784x1c4fb41d() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532578b;
        if (interfaceC26164x73fc6bc6 != null) {
            return interfaceC26164x73fc6bc6.mo100928x463504c();
        }
        return 0;
    }

    @Override // x03.r1
    /* renamed from: getVideoPath */
    public java.lang.String mo174785x4edea88a() {
        return this.f532579c;
    }

    @Override // x03.r1
    /* renamed from: getWidth */
    public int mo174786x755bd410() {
        java.util.Objects.toString(this.f532578b);
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532578b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100929x8d5c7601();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532578b;
        if (interfaceC26164x73fc6bc62 != null) {
            return interfaceC26164x73fc6bc62.mo100929x8d5c7601();
        }
        return 0;
    }

    @Override // ph3.c
    public void h(java.lang.String str) {
        byte[] bArr;
        this.f532579c = str;
        if (str != null) {
            bArr = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        java.lang.String g17 = kk.k.g(bArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
        this.f532583g = g17;
    }

    @Override // x03.r1
    public void i() {
    }

    @Override // ph3.c
    /* renamed from: pause */
    public void mo158541x65825f6() {
        java.util.Objects.toString(this.f532578b);
        p3325xe03a0797.p3326xc267989b.l.d(this.f532591o, null, null, new x03.z(this, null), 3, null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f532590n;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // ph3.c
    /* renamed from: prepare */
    public boolean mo158542xed060d07() {
        if (this.f532588l == null) {
            this.f532588l = new x03.s(this, this.f532583g, this.f532582f);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532578b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100906x969bf12(this.f532588l);
        }
        if (!(this.f532583g.length() == 0)) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f532591o, null, null, new x03.a0(this, null), 3, null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f532577a, "video_status prepare failed, url: " + this.f532579c + ", media:" + this.f532583g);
        return false;
    }

    @Override // ph3.c
    /* renamed from: release */
    public void mo158543x41012807() {
        java.util.Objects.toString(this.f532578b);
        p3325xe03a0797.p3326xc267989b.z0.e(this.f532591o, null, 1, null);
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532578b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100970x42c875eb(null);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532578b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100933x41012807();
        }
    }

    @Override // ph3.c
    /* renamed from: setMute */
    public void mo158544x764d819b(boolean z17) {
        p3325xe03a0797.p3326xc267989b.l.d(this.f532591o, null, null, new x03.d0(this, z17, null), 3, null);
    }

    @Override // ph3.c
    /* renamed from: setSurface */
    public void mo158545x42c875eb(android.view.Surface surface) {
        if (surface != null) {
            surface.hashCode();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532578b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100970x42c875eb(surface);
        }
    }

    @Override // ph3.c
    /* renamed from: start */
    public void mo158546x68ac462() {
        java.util.Objects.toString(this.f532578b);
        if (this.f532584h == 5) {
            java.util.Objects.toString(this.f532578b);
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f532591o, null, null, new x03.g0(this, null), 3, null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f532590n;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f532590n;
        if (b4Var2 != null) {
            b4Var2.c(500L, 500L);
        }
    }

    @Override // ph3.c
    /* renamed from: stop */
    public void mo158547x360802() {
        java.util.Objects.toString(this.f532578b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f532589m;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f532590n;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f532591o, null, null, new x03.h0(this, null), 3, null);
    }
}
