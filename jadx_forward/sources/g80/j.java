package g80;

/* loaded from: classes12.dex */
public final class j implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s70.g f351002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s70.d f351003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j15.d f351004c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s70.d f351005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f351006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s70.d f351007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f351008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f351009h;

    public j(s70.g gVar, s70.d dVar, j15.d dVar2, s70.d dVar3, java.util.List list, s70.d dVar4, boolean z17, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f351002a = gVar;
        this.f351003b = dVar;
        this.f351004c = dVar2;
        this.f351005d = dVar3;
        this.f351006e = list;
        this.f351007f = dVar4;
        this.f351008g = z17;
        this.f351009h = qVar;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parallelUploadImg[");
        s70.g gVar = this.f351002a;
        sb6.append(gVar.f485477a);
        sb6.append("] onUploadFailure errCode:");
        sb6.append(i17);
        sb6.append(" parallelUploadID:");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", sb6.toString());
        gVar.f485484h.put("up_parallel_task_ret", java.lang.Integer.valueOf(i17));
        try {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f351009h;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new s70.h(s70.i.f485499i, this.f351004c, gVar)));
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // z25.e
    public void b(float f17, long j17) {
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        j15.c t17;
        java.lang.String str6;
        int i17;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parallelUploadImg[");
        s70.g gVar = this.f351002a;
        sb6.append(gVar.f485477a);
        sb6.append("] onUploadSuccess fileMd5:");
        sb6.append(jVar != null ? jVar.f551358c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", sb6.toString());
        s70.d dVar = this.f351003b;
        dVar.f485461e = 0;
        j15.d dVar2 = this.f351004c;
        j15.a o17 = dVar2.o();
        if (jVar == null || (str = jVar.f551358c) == null) {
            str = "";
        }
        o17.f0(str);
        j15.a o18 = dVar2.o();
        if (jVar == null || (str2 = jVar.f551357b) == null) {
            str2 = "";
        }
        o18.T(str2);
        j15.a o19 = dVar2.o();
        if (jVar == null || (str3 = jVar.f551356a) == null) {
            str3 = "";
        }
        o19.W(str3);
        dVar2.o().V(com.p314xaae8f345.mm.vfs.w6.k(this.f351005d.f485463g));
        j15.a o27 = dVar2.o();
        if (jVar == null || (str4 = jVar.f551357b) == null) {
            str4 = "";
        }
        o27.L(str4);
        int i18 = gVar.f485482f;
        s70.d dVar3 = this.f351007f;
        if (i18 == 1) {
            for (s70.d dVar4 : this.f351006e) {
                if (dVar4.f485458b == s70.c.f485453h) {
                    j15.a o28 = dVar2.o();
                    if (jVar == null || (str7 = jVar.f551356a) == null) {
                        str7 = "";
                    }
                    o28.R(str7);
                    dVar2.o().e0(com.p314xaae8f345.mm.vfs.w6.k(dVar3.f485463g));
                    j15.a o29 = dVar2.o();
                    if (jVar == null || (str8 = jVar.f551356a) == null) {
                        str8 = "";
                    }
                    o29.N(str8);
                    dVar2.o().a0(com.p314xaae8f345.mm.vfs.w6.k(dVar4.f485463g));
                    dVar.f485462f = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ai(dVar4.f485463g);
                    if (xs.l1.a(dVar2)) {
                        j15.c t18 = dVar2.o().t();
                        if (t18 != null) {
                            if (jVar == null || (str10 = jVar.f551356a) == null) {
                                str10 = "";
                            }
                            t18.s(str10);
                        }
                        j15.c t19 = dVar2.o().t();
                        if (t19 != null) {
                            if (jVar == null || (str9 = jVar.f551356a) == null) {
                                str9 = "";
                            }
                            t19.r(str9);
                        }
                    }
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        }
        j15.a o37 = dVar2.o();
        if (jVar == null || (str5 = jVar.f551356a) == null) {
            str5 = "";
        }
        o37.R(str5);
        dVar2.o().e0(com.p314xaae8f345.mm.vfs.w6.k(dVar3.f485463g));
        dVar2.o().N("");
        dVar2.o().a0(0L);
        dVar.f485462f = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ai(dVar3.f485463g);
        if (xs.l1.a(dVar2) && (t17 = dVar2.o().t()) != null) {
            if (jVar == null || (str6 = jVar.f551356a) == null) {
                str6 = "";
            }
            t17.r(str6);
        }
        if (this.f351008g) {
            dVar2.o().b0(com.p314xaae8f345.mm.vfs.w6.k(dVar3.f485464h));
        } else {
            dVar2.o().b0(0L);
        }
        dVar2.y(null);
        if (dVar.f485457a) {
            dVar2.o().Y(dVar2.o().I());
            dVar2.o().S(dVar2.o().K());
            dVar2.o().U(dVar2.o().F());
            dVar2.o().Q(dVar2.o().B());
            if (gVar.f485482f == 1) {
                dVar2.o().P(dVar2.o().K());
                dVar2.o().O(dVar2.o().B());
                i17 = 0;
            } else {
                i17 = 0;
                dVar2.o().P(0);
                dVar2.o().O(0);
            }
            dVar2.o().r0(i17);
            dVar2.o().u0(i17);
            dVar2.o().o0(i17);
            dVar2.o().l0(i17);
            dVar2.o().i0("");
            dVar2.o().n0("");
            dVar2.o().q0("");
            dVar2.o().t0("");
            dVar2.o().k0("");
            dVar2.o().p0(0L);
            dVar2.o().m0(0L);
            dVar2.o().j0(0L);
        }
        try {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f351009h;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new s70.h(s70.i.f485494d, dVar2, gVar)));
        } catch (java.lang.Throwable unused) {
        }
    }
}
