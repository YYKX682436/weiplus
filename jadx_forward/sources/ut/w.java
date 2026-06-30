package ut;

/* loaded from: classes12.dex */
public final class w implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f512294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oi3.g f512295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f512296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v05.b f512298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f512299f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p25.e f512300g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f512301h;

    public w(ut.q0 q0Var, oi3.g gVar, p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str, v05.b bVar, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, p25.e eVar, long j17) {
        this.f512294a = q0Var;
        this.f512295b = gVar;
        this.f512296c = qVar;
        this.f512297d = str;
        this.f512298e = bVar;
        this.f512299f = dVar;
        this.f512300g = eVar;
        this.f512301h = j17;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ut.q0 q0Var = this.f512294a;
        sb6.append(q0Var.id());
        sb6.append(" parallelUploadFile cgi onUploadFailure errCode:");
        sb6.append(i17);
        sb6.append(" parallelUploadID:");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", sb6.toString());
        try {
            q0Var.f512245o.f512259j.put("send_parallel_upload_ret", java.lang.Integer.valueOf(i17));
            p3325xe03a0797.p3326xc267989b.q qVar = this.f512296c;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(-520022));
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // z25.e
    public void b(float f17, long j17) {
        ut.q0 q0Var = this.f512294a;
        java.lang.Integer e17 = qi3.c.e(q0Var, false, 1, null);
        if (e17 == null) {
            if (q0Var.f445210f == qi3.g0.f445242h) {
                q0Var.d0(((((float) j17) / ((float) this.f512301h)) * 50.0f) + 40.0f, true);
                return;
            }
            return;
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f512296c;
        e17.intValue();
        z25.d dVar = (z25.d) this.f512300g;
        z25.a aVar = dVar.f551309a;
        if (aVar != null ? aVar.f551284t : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", q0Var.id() + " onUploadProgress cancel and stop upload");
            dVar.f();
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(-510001));
            } catch (java.lang.Throwable unused) {
            }
        }
        e17.intValue();
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ut.q0 q0Var = this.f512294a;
        sb6.append(q0Var.id());
        sb6.append(" parallelUploadFile cgi onUploadSuccess fileMd5:");
        sb6.append(jVar != null ? jVar.f551358c : null);
        sb6.append(" msgId:");
        oi3.g gVar = this.f512295b;
        sb6.append(gVar.m75942xfb822ef2(gVar.f427150d + 0));
        sb6.append(" talker:");
        sb6.append(gVar.m75945x2fec8307(gVar.f427150d + 3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendFileTask", sb6.toString());
        if (jVar != null) {
            dn.h hVar = new dn.h();
            hVar.f69502xf11df5f5 = jVar.f551357b;
            hVar.f69522xf9dbbe9c = jVar.f551356a;
            hVar.f69526x419c9c3d = jVar.f551358c;
            hVar.f69523x17c343e7 = jVar.f551359d;
            hVar.f69525x419c7893 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ai(this.f512297d);
            i17 = q0Var.c0(hVar, this.f512298e, this.f512299f);
        } else {
            i17 = -520009;
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f512296c;
        try {
            if (i17 != 0) {
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(i17)));
            } else {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(0));
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
