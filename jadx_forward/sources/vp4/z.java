package vp4;

/* loaded from: classes10.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp4.b0 f520617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f520619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(vp4.b0 b0Var, java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(2);
        this.f520617d = b0Var;
        this.f520618e = str;
        this.f520619f = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String msg = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoForegroundRemuxChain", "remuxImpl >> code: " + intValue + ", msg: " + msg);
        vp4.b0 b0Var = this.f520617d;
        p3325xe03a0797.p3326xc267989b.q qVar = b0Var.f520546m;
        if (qVar == null || !((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoForegroundRemuxChain", "when finish the job is cancel");
            b0Var.f520546m = null;
        } else {
            p3325xe03a0797.p3326xc267989b.q qVar2 = this.f520619f;
            if (intValue == 0) {
                vp4.s sVar = vp4.s.f520607a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = b0Var.f520537d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
                ct0.b bVar = b0Var.f520536c;
                java.lang.String outPath = this.f520618e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(outPath, "$outPath");
                st3.r encode = b0Var.f520535b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encode, "encode");
                boolean z17 = c16993xacc19624.f237220y;
                java.lang.String thumbPath = c16993xacc19624.C;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbPath, "thumbPath");
                int i17 = c16993xacc19624.f237209n.f152737t;
                java.lang.String inputVideoPath = c16993xacc19624.A;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputVideoPath, "inputVideoPath");
                boolean b17 = vp4.s.b(sVar, z17, thumbPath, i17, inputVideoPath, outPath, c16993xacc19624.f237221z, bVar != null ? bVar.f303739c : false, encode.f494115j, bVar, false, 512, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoForegroundRemuxChain", "remuxImpl >> dealAfterRemuxSuccess result: " + b17);
                if (!b17) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    ((p3325xe03a0797.p3326xc267989b.r) qVar2).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372(og3.h.f426697d, 1012, "save thumb error", null, 8, null)));
                    b0Var.f520546m = null;
                }
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            nu3.m mVar = nu3.m.f421762a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setMuxEndTimeStamp >> " + elapsedRealtime);
            nu3.m.f421763b.Q = elapsedRealtime;
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar2).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372(intValue == 0 ? og3.h.f426698e : og3.h.f426697d, intValue, msg, null, 8, null)));
            b0Var.f520546m = null;
        }
        return jz5.f0.f384359a;
    }
}
