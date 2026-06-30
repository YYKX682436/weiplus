package yt3;

/* loaded from: classes10.dex */
public final class k4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.r4 f547047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st3.s f547048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ st3.r f547049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f547050g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f547051h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f547052i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(yt3.r4 r4Var, st3.s sVar, st3.r rVar, lt3.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, long j17) {
        super(4);
        this.f547047d = r4Var;
        this.f547048e = sVar;
        this.f547049f = rVar;
        this.f547050g = f0Var;
        this.f547051h = f0Var2;
        this.f547052i = j17;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String str;
        st3.s sVar;
        java.lang.String mixVideoPath = (java.lang.String) obj;
        java.lang.String mixThumbPath = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixVideoPath, "mixVideoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixThumbPath, "mixThumbPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "mixVideoPath: " + mixVideoPath + " ,mixThumbPath: " + mixThumbPath + " ,ret: " + booleanValue);
        yt3.r4 r4Var = this.f547047d;
        yz5.q qVar = r4Var.f547186n;
        if (qVar != null) {
            qVar.mo147xb9724478(mixVideoPath, mixThumbPath, java.lang.Boolean.valueOf(booleanValue));
        }
        lt3.v vVar = lt3.v.f402810a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoMixHandler", "VideoMixHandler resumeBgMix!");
        lt3.v.f402812c = false;
        lt3.v.f402815f = null;
        vVar.b();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_remux_fail_use_x264, true);
        android.content.Context context = r4Var.f547179d;
        st3.s sVar2 = this.f547048e;
        st3.r rVar = this.f547049f;
        if (booleanValue || !fj6) {
            if (android.text.TextUtils.isEmpty(mixVideoPath)) {
                nu3.m.f421762a.n(1003);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                android.app.Activity activity = (android.app.Activity) context;
                activity.setResult(1003);
                activity.finish();
            } else {
                dw3.d0 a17 = dw3.e0.f325735a.a(mixVideoPath);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "videoInfo : " + a17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = r4Var.f547182g;
                if (c16993xacc19624 != null && c16993xacc19624.F == 2) {
                    if (a17 != null) {
                        a17.f325731i = this.f547050g.f402763s;
                    }
                    long k17 = com.p314xaae8f345.mm.vfs.w6.k(mixVideoPath);
                    float f17 = 1024;
                    float f18 = ((((float) k17) * 1.0f) / f17) / f17;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileSize : ");
                    sb6.append(f18);
                    sb6.append(" M fileLength: ");
                    sb6.append(k17);
                    sb6.append(" Byte   duration:");
                    sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.f325725c) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", sb6.toString());
                    if (a17 != null) {
                        boolean z17 = wo.v1.f529362i.f529230k == 1;
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("MMSightCheckSendVideoBitrate"), 0) == 1;
                        float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("MMSightCheckSendVideoBitrateLimit"), 1.3f);
                        if (rVar != null && rVar.f494118m == 2) {
                            L = 2.0f;
                        }
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
                        java.lang.Float valueOf3 = java.lang.Float.valueOf(L);
                        int i17 = a17.f325727e;
                        str = mixThumbPath;
                        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i17);
                        sVar = sVar2;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = r4Var.f547182g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196242);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "deviceConfigCheckBitrate: %s, serverConfigCheckBitrate: %s, bitrateLimitRatio: %s, actualBR %s, targetBR: %s", valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(c16993xacc196242.f237209n.f152727g));
                        boolean z19 = z17 || z18;
                        int i18 = a17.f325731i;
                        if (i18 == 0) {
                            if (z19) {
                                float f19 = i17;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4Var.f547182g);
                                if (f19 >= r6.f237209n.f152727g * L) {
                                    r4Var.g(rVar);
                                }
                            }
                        } else if (i18 > 0 && z19) {
                            float f27 = i17;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4Var.f547182g);
                            if (f27 >= r6.f237209n.f152727g * 2.0f) {
                                r4Var.g(rVar);
                            }
                        }
                    } else {
                        str = mixThumbPath;
                        sVar = sVar2;
                    }
                    nu3.m.f421762a.s(0);
                } else {
                    str = mixThumbPath;
                    sVar = sVar2;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f547051h;
                if (f0Var.f391649d != 0) {
                    com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45860xe4c2f7(), f0Var.f391649d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "hardcoder summerPerformance stopPerformance %s", java.lang.Integer.valueOf(f0Var.f391649d));
                    f0Var.f391649d = 0;
                }
                r4Var.k(mixVideoPath);
                yt3.r4.b(r4Var);
                if (a17 != null) {
                    int i19 = rVar.f494118m;
                    int i27 = a17.f325727e;
                    if (i19 > 0) {
                        double d17 = i27;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4Var.f547182g);
                        if (d17 >= r4.f237209n.f152727g * 1.1d) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196243 = r4Var.f547182g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196243);
                            int i28 = c16993xacc196243.f237209n.f152727g;
                        }
                    }
                    java.lang.Integer valueOf5 = java.lang.Integer.valueOf(rVar.f494118m);
                    java.lang.Integer valueOf6 = java.lang.Integer.valueOf(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196244 = r4Var.f547182g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196244);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "steve: qpswitch:%d , actualBR : %d, targetBR: %d, tuneRatio:[%d]", valueOf5, valueOf6, java.lang.Integer.valueOf(c16993xacc196244.f237209n.f152727g), null);
                }
                dw3.c0 c0Var = dw3.c0.f325715a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196245 = r4Var.f547182g;
                ct0.b bVar = r4Var.f547181f;
                boolean z27 = bVar != null ? bVar.f303739c : false;
                boolean z28 = rVar.f494115j;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "configProvider : " + c16993xacc196245 + "  isCaptureMedia:" + z27 + "   change:" + z28);
                if (c16993xacc196245 != null) {
                    boolean z29 = c16993xacc196245.f237220y;
                    java.lang.String inputVideoPath = c16993xacc196245.A;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputVideoPath, "inputVideoPath");
                    java.lang.String outputVideoPath = c16993xacc196245.B;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(outputVideoPath, "outputVideoPath");
                    c0Var.v(z29, inputVideoPath, outputVideoPath, c16993xacc196245.f237221z, z27, z28);
                }
                int i29 = rVar.f494118m;
                if (i29 > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69156x769d784(mixVideoPath, null, 0, i29);
                }
                nu3.i iVar = nu3.i.f421751a;
                iVar.n("KEY_REMUX_VIDEO_COST_MS_INT", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f547052i));
                nu3.m mVar = nu3.m.f421762a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setMuxEndTimeStamp >> " + elapsedRealtime);
                nu3.m.f421763b.Q = elapsedRealtime;
                ct0.b bVar2 = r4Var.f547181f;
                if (bVar2 != null) {
                    ut3.f fVar = ut3.f.f512709c;
                    fVar.f512711b.putBoolean("key_is_capture_video", bVar2.f303739c);
                    java.util.ArrayList arrayList = bVar2.f303747k;
                    boolean z37 = arrayList == null || arrayList.isEmpty();
                    android.os.Bundle bundle = fVar.f512711b;
                    bundle.putBoolean("key_is_photo_video", !z37);
                    java.util.ArrayList arrayList2 = bVar2.f303747k;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                        arrayList3.add(bVar2.f303737a);
                        bundle.putStringArrayList("key_src_list", arrayList3);
                    } else {
                        bundle.putStringArrayList("key_src_list", bVar2.f303747k);
                    }
                }
                mVar.m(mixVideoPath);
                mVar.n(0);
                java.lang.Boolean valueOf7 = java.lang.Boolean.valueOf(booleanValue);
                st3.s sVar3 = sVar;
                r4Var.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(valueOf7, mixVideoPath, str, java.lang.Long.valueOf(sVar3.f494126g - sVar3.f494125f), java.lang.Boolean.FALSE, iVar.l()));
            }
        } else if (r4Var.f547189q >= 1 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("mediacodec_create_error", false)) {
            nu3.m.f421762a.n(1002);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity2 = (android.app.Activity) context;
            activity2.setResult(1002);
            activity2.finish();
        } else {
            r4Var.f547189q++;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(985L, 146L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxPlugin", "markReserveEncoder");
            r4Var.i(r4Var.e(sVar2, r4Var.f547185m), sVar2, rVar);
        }
        return jz5.f0.f384359a;
    }
}
