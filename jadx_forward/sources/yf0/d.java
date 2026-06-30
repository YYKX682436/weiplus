package yf0;

/* loaded from: classes12.dex */
public final class d implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf0.f f543049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f543050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f543051c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f543052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f543053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f543055g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p25.e f543056h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oi3.h f543057i;

    public d(yf0.f fVar, boolean z17, p3325xe03a0797.p3326xc267989b.q qVar, t21.v2 v2Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, java.util.Map map, p25.e eVar, oi3.h hVar) {
        this.f543049a = fVar;
        this.f543050b = z17;
        this.f543051c = qVar;
        this.f543052d = v2Var;
        this.f543053e = h0Var;
        this.f543054f = str;
        this.f543055g = map;
        this.f543056h = eVar;
        this.f543057i = hVar;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        java.util.Map map = this.f543055g;
        if (map != null) {
            map.put("cgiUploadErrorCode", java.lang.Integer.valueOf(i17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f543049a.d());
        sb6.append(this.f543050b ? ya.b.f77495x8b74a326 : "");
        sb6.append(" parallelUploadFile onUploadFailure errCode:");
        sb6.append(i17);
        sb6.append(" parallelUploadID:");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsg.VideoCGISendApi", sb6.toString());
        try {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f543051c;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(-520022));
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // z25.e
    public void b(float f17, long j17) {
        long j18;
        yf0.f fVar = this.f543049a;
        qi3.g0 g0Var = fVar.f543082a.f445210f;
        if (g0Var == qi3.g0.f445246o) {
            z25.a aVar = ((z25.d) this.f543056h).f551309a;
            if (aVar != null ? aVar.f551284t : false) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(this.f543049a.d());
                sb6.append(' ');
                sb6.append(this.f543050b ? ya.b.f77495x8b74a326 : "");
                sb6.append(" onUploadProgress cancel and stop upload");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoCGISendApi", sb6.toString());
                ((z25.d) this.f543056h).f();
                try {
                    p3325xe03a0797.p3326xc267989b.q qVar = this.f543051c;
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(-510001));
                    return;
                } catch (java.lang.Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (g0Var == qi3.g0.f445242h) {
            fVar.d();
            if (!this.f543050b) {
                vf0.m3.m(this.f543052d, j17);
                zf0.v0 v0Var = this.f543049a.f543082a;
                v0Var.getClass();
                j18 = f17 > 0.0f ? ((float) j17) / f17 : 0L;
                v0Var.f554103s = j17;
                v0Var.f554104t = j18;
                v0Var.J();
                return;
            }
            t21.v2 f18 = vf0.m3.f(this.f543057i);
            if (f18 != null) {
                vf0.m3.m(f18, j17);
            }
            zf0.v0 v0Var2 = this.f543049a.f543082a;
            v0Var2.getClass();
            j18 = f17 > 0.0f ? ((float) j17) / f17 : 0L;
            v0Var2.f554105u = j17;
            v0Var2.f554106v = j18;
            v0Var2.J();
        }
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        int i17;
        boolean z17 = this.f543050b;
        yf0.f fVar = this.f543049a;
        if (jVar != null) {
            java.lang.String h17 = this.f543052d.h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getUser(...)");
            java.lang.String str = (java.lang.String) this.f543053e.f391656d;
            java.lang.String sendVideoPath = this.f543054f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendVideoPath, "sendVideoPath");
            dn.h hVar = new dn.h();
            hVar.f69563x1209e7cb = h17;
            hVar.f69502xf11df5f5 = jVar.f551357b;
            hVar.f69522xf9dbbe9c = jVar.f551356a;
            hVar.f69526x419c9c3d = jVar.f551358c;
            hVar.f69523x17c343e7 = jVar.f551359d;
            if (str != null) {
                hVar.f69562x366b1958 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
            }
            hVar.f69525x419c7893 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ai(sendVideoPath);
            hVar.f69543x16680d46 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Di(sendVideoPath);
            vf0.m3.b(hVar, z17, fVar.f543082a.f554096i);
            i17 = 0;
        } else {
            i17 = -520009;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(fVar.d());
        sb6.append(' ');
        sb6.append(z17 ? ya.b.f77495x8b74a326 : "");
        sb6.append(" parallelUploadFile onUploadFinish ret:");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoCGISendApi", sb6.toString());
        java.lang.Integer e17 = qi3.c.e(fVar.f543082a, false, 1, null);
        if (e17 != null) {
            i17 = e17.intValue();
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f543051c;
        try {
            if (i17 != 0) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(i17)));
            } else {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(0));
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
