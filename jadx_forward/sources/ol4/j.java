package ol4;

/* loaded from: classes14.dex */
public final class j implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f427692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f427693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f427694g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f427695h;

    public j(ol4.q qVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, long j17, float f17, long j18) {
        this.f427691d = qVar;
        this.f427692e = c0Var;
        this.f427693f = j17;
        this.f427694g = f17;
        this.f427695h = j18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public final void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        ol4.q qVar = this.f427691d;
        boolean z17 = true;
        qVar.f427723l = true;
        kk4.c cVar = qVar.f427713b;
        int mo100929x8d5c7601 = ((kk4.f0) cVar).mo100929x8d5c7601();
        int mo100928x463504c = ((kk4.f0) cVar).mo100928x463504c();
        long mo100917x37a7fa50 = ((kk4.f0) cVar).mo100917x37a7fa50();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Ting-Trace-Time-Native, onPrepared! isPreload:");
        sb6.append(qVar.f427727p);
        sb6.append(", onlyPrepareWhenPlay:");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f427692e;
        sb6.append(c0Var.f391645d);
        sb6.append(", hasCallStop:");
        sb6.append(qVar.f427721j);
        sb6.append(", hasCallPause:");
        sb6.append(qVar.f427722k);
        sb6.append(", videoWidth:");
        sb6.append(mo100929x8d5c7601);
        sb6.append(", videoHeight:");
        sb6.append(mo100928x463504c);
        sb6.append(", duration:");
        sb6.append(mo100917x37a7fa50);
        sb6.append(", hasCallPlay:");
        sb6.append(qVar.f427724m);
        sb6.append(", internalOnPreparedCallback:");
        sb6.append(qVar.f427731t != null);
        sb6.append(", hasCallInitSeek:");
        sb6.append(qVar.f427718g);
        sb6.append(", startTime:");
        long j17 = this.f427693f;
        sb6.append(j17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = qVar.f427730s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (qVar.f427721j || qVar.f427722k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "has call stop " + qVar.f427721j + ", has call pause " + qVar.f427722k);
            return;
        }
        if (!qVar.f427718g) {
            if (j17 > 0 && j17 < ((kk4.f0) cVar).mo100917x37a7fa50()) {
                qVar.mo145972x35ce78(j17);
            }
            qVar.c(this.f427694g);
            qVar.f427718g = true;
        }
        int mo100924x2d67b867 = (int) ((kk4.f0) cVar).mo100924x2d67b867(103);
        int mo100924x2d67b8672 = (int) ((kk4.f0) cVar).mo100924x2d67b867(105);
        if (qVar.t()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (qVar.u()) {
                ll4.b bVar = qVar.f427737z;
                if (bVar != null) {
                    bw5.y1 y1Var = new bw5.y1();
                    y1Var.f116838e = mo100924x2d67b8672;
                    boolean[] zArr = y1Var.f116841h;
                    zArr[2] = true;
                    y1Var.f116839f = mo100924x2d67b867;
                    zArr[3] = true;
                    y1Var.f116837d = bw5.x1.PCMFormatS16LE;
                    zArr[1] = true;
                    y1Var.f116840g = true;
                    zArr[4] = true;
                    bw5.lp0 lp0Var = qVar.f427716e;
                    if (lp0Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                        throw null;
                    }
                    boolean z18 = lp0Var.d().f115722e == 2;
                    bw5.b2 b2Var = new bw5.b2();
                    b2Var.f107017d = y1Var;
                    boolean[] zArr2 = b2Var.f107027q;
                    zArr2[1] = true;
                    bw5.lp0 lp0Var2 = qVar.f427716e;
                    if (lp0Var2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                        throw null;
                    }
                    b2Var.f107018e = lp0Var2.c().f109002x;
                    zArr2[2] = true;
                    bw5.lp0 lp0Var3 = qVar.f427716e;
                    if (lp0Var3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                        throw null;
                    }
                    b2Var.f107019f = lp0Var3.c().f108998t;
                    zArr2[3] = true;
                    bw5.lp0 lp0Var4 = qVar.f427716e;
                    if (lp0Var4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                        throw null;
                    }
                    b2Var.f107020g = lp0Var4.c().f108999u;
                    zArr2[4] = true;
                    b2Var.f107021h = qVar.s() && ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
                    zArr2[5] = true;
                    b2Var.f107022i = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
                    zArr2[6] = true;
                    b2Var.f107024n = z18 ? 2 : 3;
                    zArr2[8] = true;
                    b2Var.f107023m = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
                    zArr2[7] = true;
                    b2Var.f107025o = false;
                    zArr2[9] = true;
                    bw5.lp0 lp0Var5 = qVar.f427716e;
                    if (lp0Var5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                        throw null;
                    }
                    java.lang.String m13170xcc16feb8 = lp0Var5.d().m13170xcc16feb8();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m13170xcc16feb8, "getListenId(...)");
                    jm4.m0 m0Var = (jm4.m0) ((kl4.q) bVar).f390492a.f390410q.m106052x32c52b();
                    if (m0Var != null) {
                        byte[] mo14344x5f01b1f6 = b2Var.mo14344x5f01b1f6();
                        long m105978x2737f10 = ((jm4.n0) m0Var).m105978x2737f10();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
                        p3380x6a61f93.p3381xf512d0a5.C30408x21b14ed4.m168639x21b406ec(m105978x2737f10, mo14344x5f01b1f6, m13170xcc16feb8);
                    }
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18723x96879d03 c18723x96879d03 = qVar.f427733v;
                boolean booleanValue = c18723x96879d03 != null ? java.lang.Boolean.valueOf(c18723x96879d03.m72144x121035f0(mo100924x2d67b867, mo100924x2d67b8672)).booleanValue() : false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18721x9ae6bd22 c18721x9ae6bd22 = qVar.f427735x;
                z17 = c18721x9ae6bd22 != null ? java.lang.Boolean.valueOf(c18721x9ae6bd22.m72127x121035f0(mo100924x2d67b867, mo100924x2d67b8672)).booleanValue() : booleanValue;
                com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18725xc88c8712 c18725xc88c8712 = qVar.f427734w;
                if (c18725xc88c8712 != null) {
                    z17 = java.lang.Boolean.valueOf(c18725xc88c8712.m72205x121035f0(mo100924x2d67b867, mo100924x2d67b8672)).booleanValue();
                }
            }
            if (z17 || qVar.f427736y != null) {
                ((kk4.f0) cVar).mo100950xbd4f3f08(qVar.B);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initPostProcess ret: " + z17 + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", isEnableAudioPostProcessPlugin: " + qVar.u());
        }
        yz5.l lVar = qVar.f427731t;
        if (lVar != null) {
            lVar.mo146xb9724478(qVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Ting-Trace-Time-Native, onPrepared callback isPreload " + qVar.f427727p + ", onlyPrepareWhenPlay " + c0Var.f391645d + ", hasCallPlay " + qVar.f427724m + ", duration " + qVar.k() + ", cost: " + (java.lang.System.currentTimeMillis() - this.f427695h));
        if ((qVar.f427727p || c0Var.f391645d) && !qVar.f427724m) {
            return;
        }
        ((kk4.f0) cVar).mo100975x68ac462();
    }
}
