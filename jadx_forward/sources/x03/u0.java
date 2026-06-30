package x03;

/* loaded from: classes15.dex */
public final class u0 implements x03.r1 {

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.Boolean f532665n = java.lang.Boolean.FALSE;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f532666a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f532667b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f532668c;

    /* renamed from: d, reason: collision with root package name */
    public x03.s1 f532669d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f532670e;

    /* renamed from: f, reason: collision with root package name */
    public long f532671f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f532672g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f532673h;

    /* renamed from: i, reason: collision with root package name */
    public int f532674i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f532675j;

    /* renamed from: k, reason: collision with root package name */
    public long f532676k;

    /* renamed from: l, reason: collision with root package name */
    public long f532677l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f532678m;

    public u0(android.content.Context _context, java.lang.String _path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_context, "_context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_path, "_path");
        this.f532666a = "MicroMsg.FlutterVideoPlayer";
        this.f532670e = "";
        this.f532672g = _path;
        ((ku5.t0) ku5.t0.f394148d).B(new x03.l0(this));
        java.lang.Boolean bool = f532665n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (!bool.booleanValue()) {
            f532665n = java.lang.Boolean.TRUE;
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101112x7421050a(_context, "60303", 1);
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101129xd5038bcf(true);
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101132x4f6110c3(100);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101082x5f9ba979 = com.p314xaae8f345.p3006xb8ff1437.api.C26184x9df96dcd.m101082x5f9ba979(_context);
        this.f532667b = m101082x5f9ba979;
        if (m101082x5f9ba979 != null) {
            m101082x5f9ba979.mo100957x5dd7c812(new x03.o0(this));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100954x6954c27b(new x03.p0(this));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532667b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100951xa4560c71(new x03.q0(this));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc63 = this.f532667b;
        if (interfaceC26164x73fc6bc63 != null) {
            interfaceC26164x73fc6bc63.mo100958xe1a2e326(new x03.r0(this));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc64 = this.f532667b;
        if (interfaceC26164x73fc6bc64 != null) {
            interfaceC26164x73fc6bc64.mo100956xa23b7bf3(new x03.s0(this));
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc65 = this.f532667b;
        if (interfaceC26164x73fc6bc65 != null) {
            interfaceC26164x73fc6bc65.mo100955x40f8c003(new x03.t0(this));
        }
    }

    @Override // ph3.c
    public void a(int i17) {
        java.lang.String str = "video_status seek " + this.f532667b + ", state: " + this.f532674i;
        java.lang.String str2 = this.f532666a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (this.f532674i < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "video_status wrong seek");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100935xb0277d5();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532667b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100937xc9fc1b13(i17, 3);
        }
    }

    @Override // x03.r1
    public void b(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100947xfd27780d(z17);
        }
    }

    @Override // ph3.c
    public void c(float f17) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100967xd079f5a(f17);
        }
    }

    @Override // x03.r1
    public void d(java.lang.String str) {
        if (str != null) {
            this.f532670e = str;
        }
    }

    @Override // x03.r1
    public void e(double d17) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100940x3aa51598((float) d17);
        }
    }

    @Override // x03.r1
    public void f(x03.s1 s1Var) {
        this.f532669d = s1Var;
    }

    @Override // x03.r1
    public double g() {
        x03.f b17 = x03.x0.f532694d.a().f532697b.b(this.f532673h);
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
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        long mo100915xddd35a52 = interfaceC26164x73fc6bc6 != null ? interfaceC26164x73fc6bc6.mo100915xddd35a52() : 0L;
        if (((int) mo100915xddd35a52) != 0) {
            return mo100915xddd35a52;
        }
        long j17 = this.f532671f;
        this.f532671f = 500 + j17;
        return j17;
    }

    @Override // ph3.c
    /* renamed from: getDurationMs */
    public long mo158540x37a7fa50() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100917x37a7fa50();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532667b;
        if (interfaceC26164x73fc6bc62 != null) {
            return interfaceC26164x73fc6bc62.mo100917x37a7fa50();
        }
        return 0L;
    }

    @Override // x03.r1
    /* renamed from: getHeight */
    public int mo174784x1c4fb41d() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            return interfaceC26164x73fc6bc6.mo100928x463504c();
        }
        return 0;
    }

    @Override // x03.r1
    /* renamed from: getVideoPath */
    public java.lang.String mo174785x4edea88a() {
        return this.f532668c;
    }

    @Override // x03.r1
    /* renamed from: getWidth */
    public int mo174786x755bd410() {
        java.util.Objects.toString(this.f532667b);
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100929x8d5c7601();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532667b;
        if (interfaceC26164x73fc6bc62 != null) {
            return interfaceC26164x73fc6bc62.mo100929x8d5c7601();
        }
        return 0;
    }

    @Override // ph3.c
    public void h(java.lang.String str) {
        byte[] bArr;
        this.f532668c = str;
        if (str != null) {
            bArr = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        this.f532673h = kk.k.g(bArr);
    }

    @Override // x03.r1
    public void i() {
    }

    @Override // ph3.c
    /* renamed from: pause */
    public void mo158541x65825f6() {
        java.util.Objects.toString(this.f532667b);
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100930x65825f6();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532667b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100931xe51afc9e();
        }
    }

    @Override // ph3.c
    /* renamed from: prepare */
    public boolean mo158542xed060d07() {
        java.lang.String str = this.f532673h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.lang.String str2 = this.f532672g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        x03.n0 n0Var = new x03.n0(this, str, str2);
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100906x969bf12(n0Var);
        }
        if (this.f532674i >= 3) {
            return true;
        }
        x03.x0 a17 = x03.x0.f532694d.a();
        x03.f b17 = a17.f532697b.b(this.f532673h);
        com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder builder = new com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder();
        builder.m101226xb4088fb7(this.f532673h);
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532667b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100974xab2f6987(builder.m101222x59bc66e());
        }
        if (b17.f532548d) {
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc63 = this.f532667b;
            if (interfaceC26164x73fc6bc63 != null) {
                interfaceC26164x73fc6bc63.mo100945x683d6267(b17.f532549e);
            }
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("referer", this.f532670e);
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc64 = this.f532667b;
            if (interfaceC26164x73fc6bc64 != null) {
                interfaceC26164x73fc6bc64.mo100946x683d6267(this.f532668c, hashMap);
            }
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc65 = this.f532667b;
        if (interfaceC26164x73fc6bc65 == null) {
            return true;
        }
        interfaceC26164x73fc6bc65.mo100932x857611b5();
        return true;
    }

    @Override // ph3.c
    /* renamed from: release */
    public void mo158543x41012807() {
        java.util.Objects.toString(this.f532667b);
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100970x42c875eb(null);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532667b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100933x41012807();
        }
    }

    @Override // ph3.c
    /* renamed from: setMute */
    public void mo158544x764d819b(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100965xd0747cbc(z17);
        }
    }

    @Override // ph3.c
    /* renamed from: setSurface */
    public void mo158545x42c875eb(android.view.Surface surface) {
        if (surface != null) {
            surface.hashCode();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100970x42c875eb(surface);
        }
    }

    @Override // ph3.c
    /* renamed from: start */
    public void mo158546x68ac462() {
        java.util.Objects.toString(this.f532667b);
        if (this.f532674i == 5) {
            java.util.Objects.toString(this.f532667b);
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100935xb0277d5();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = this.f532667b;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100975x68ac462();
        }
    }

    @Override // ph3.c
    /* renamed from: stop */
    public void mo158547x360802() {
        java.util.Objects.toString(this.f532667b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f532678m;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f532667b;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100976x360802();
        }
    }
}
