package vp4;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f520518d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f520519e;

    /* renamed from: f, reason: collision with root package name */
    public int f520520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vp4.b0 f520521g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ og3.d f520522h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(vp4.b0 b0Var, og3.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f520521g = b0Var;
        this.f520522h = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vp4.a0(this.f520521g, this.f520522h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vp4.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ?? r66;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f520520f;
        vp4.b0 b0Var = this.f520521g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoForegroundRemuxChain", "come in remux foreground chain");
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            vp4.u uVar = new vp4.u(b0Var, null);
            this.f520520f = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, uVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return obj;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f520518d = b0Var;
        og3.d dVar = this.f520522h;
        this.f520519e = dVar;
        this.f520520f = 2;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoForegroundRemuxChain", "come in VideoForegroundRemux");
        b0Var.f520546m = rVar;
        rVar.m(new vp4.v(b0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = b0Var.f520537d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
        java.lang.String str3 = c16993xacc19624.B;
        if (android.text.TextUtils.isEmpty(str3)) {
            nu3.m.f421762a.n(1003);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoForegroundRemuxChain", "reMux outPath is empty");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372(og3.h.f426697d, 1003, "Foreground remux output path is null", null, 8, null)));
            b0Var.f520546m = null;
        } else {
            android.os.Bundle bundle = dVar.f426693b;
            rp4.a aVar2 = b0Var.f520538e;
            vp4.s sVar = vp4.s.f520607a;
            if (aVar2 == null) {
                r66 = 0;
                str = "KEY_EXPORT_HEVC_HARD";
                str2 = "KEY_EXPORT_HEVC_SOFT";
                rp4.a a17 = sVar.a(c16993xacc19624, b0Var.f520542i, b0Var.f520535b, b0Var.f520536c, bundle != 0 ? bundle.getBoolean("KEY_EXPORT_HEVC_HARD", false) : false, bundle != 0 ? bundle.getBoolean("KEY_EXPORT_HEVC_SOFT", false) : false);
                b0Var.f520538e = a17;
                qz5.b.d(a17.b());
            } else {
                r66 = 0;
                str = "KEY_EXPORT_HEVC_HARD";
                str2 = "KEY_EXPORT_HEVC_SOFT";
            }
            rp4.a aVar3 = b0Var.f520538e;
            if (aVar3 != null) {
                aVar3.a(c16993xacc19624.f237209n);
            }
            vp4.z zVar = new vp4.z(b0Var, str3, rVar);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            nu3.m mVar = nu3.m.f421762a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setMuxStartTimeStamp >> " + elapsedRealtime);
            nu3.m.f421763b.P = elapsedRealtime;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = b0Var.f520542i.f494121b;
            if (c16997xb0aa383a != null) {
                wt3.c1.f530920b.c(c16997xb0aa383a, new vp4.x(rVar, b0Var, bundle, zVar));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoForegroundRemuxChain", "remuxImpl no audio info");
                int i18 = bundle != 0 ? bundle.getInt("KEY_EXPORT_TARGET_VIDEO_BITRATE", r66) : r66;
                r45.h70 f17 = sVar.f(c16993xacc19624, b0Var.f520542i, b0Var.f520541h, bundle != 0 ? bundle.getBoolean(str2, r66) : r66, bundle != 0 ? bundle.getBoolean(str, r66) : r66, null, i18);
                if (f17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoForegroundRemuxChain", "composition info is null");
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372(og3.h.f426697d, 1009, "ERROR_TARGET_BITRATE_ERROR remux error", null, 8, null)));
                    b0Var.f520546m = null;
                } else {
                    java.util.LinkedList<r45.ho6> tracks = f17.f457430d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tracks, "tracks");
                    for (r45.ho6 ho6Var : tracks) {
                        rp4.x xVar = b0Var.f520541h;
                        if (xVar != null) {
                            r45.vl5 cropRect = ho6Var.f457877r.f460060e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cropRect, "cropRect");
                            android.graphics.Rect rect = xVar.f480237i;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.g(rect, cropRect);
                            r45.vl5 contentRect = ho6Var.f457877r.f460062g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentRect, "contentRect");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.g(rect, contentRect);
                        }
                    }
                    st3.r rVar2 = b0Var.f520535b;
                    rp4.a aVar4 = b0Var.f520538e;
                    int i19 = aVar4 != null ? aVar4.f480142l : r66;
                    android.os.Bundle bundle2 = c16993xacc19624.M;
                    b0Var.f520545l = vp4.s.d(sVar, f17, c16993xacc19624, bundle2 != 0 ? bundle2.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", r66) : r66, rVar2, i19, i18, zVar, null, new vp4.y(b0Var), 128, null);
                }
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar5 = pz5.a.f440719d;
        return j17 == aVar ? aVar : j17;
    }
}
