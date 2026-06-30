package yr2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final yr2.d f546196a = new yr2.d();

    public final dn.o a(int i17, long j17, java.lang.String originMediaId, java.lang.String mediaId, java.lang.String url, java.lang.String path, int i18, java.lang.String fileFormat, java.lang.String urlToken, java.lang.String str, boolean z17, dn.n videoCallback, int i19, java.lang.String tag, yr2.f fVar, byte[] bArr) {
        r45.vf2 vf2Var;
        r45.vq2 vq2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originMediaId, "originMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlToken, "urlToken");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCallback, "videoCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        boolean X2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.X2();
        cs2.l lVar = new cs2.l(j17, i17);
        lVar.f323335u = pm0.v.u(j17);
        lVar.f323318d = "task_FinderUtil";
        lVar.f69601xaca5bdda = mediaId;
        lVar.M1 = url.concat(urlToken);
        lVar.A = 60;
        lVar.B = 60;
        lVar.H1 = 1;
        lVar.Z = 8;
        lVar.X = 0L;
        if (X2) {
            lVar.f69610x4f5245a8 = i18;
            lVar.X1 = fileFormat;
        } else {
            lVar.f69610x4f5245a8 = i18 <= 0 ? ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(1, path) : i18;
        }
        lVar.f69595x6d25b0d9 = path;
        lVar.f323342y0 = zy2.u.f559114a;
        lVar.f323339x0 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546224h;
        lVar.Y1 = str;
        lVar.f323331q = z17;
        lVar.f323348c2 = videoCallback;
        lVar.T1 = java.lang.String.valueOf(i19);
        lVar.T = 24;
        lVar.B = 86400;
        r45.tq2 tq2Var = (r45.tq2) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546232p.get(originMediaId);
        boolean z18 = false;
        java.lang.Integer valueOf = (tq2Var == null || (vq2Var = (r45.vq2) tq2Var.m75936x14adae67(2)) == null) ? null : java.lang.Integer.valueOf(vq2Var.m75939xb282bd08(0));
        if (valueOf != null && valueOf.intValue() == 1) {
            z18 = true;
        }
        lVar.U = z18;
        yr2.f fVar2 = fVar;
        if (fVar2 != null) {
            if (!fVar2.f546204c) {
                fVar2 = null;
            }
            if (fVar2 != null) {
                lVar.f69575xf11df5f5 = fVar2.f546202a;
                lVar.f323321g = fVar2.f546203b;
                lVar.f323332r = fVar2.f546204c;
            }
        }
        jz5.o oVar = (jz5.o) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546234r.get(originMediaId);
        if (oVar != null && (vf2Var = (r45.vf2) oVar.f384374d) != null) {
            java.lang.String m75945x2fec8307 = vf2Var.m75945x2fec8307(15);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            lVar.f323334t = m75945x2fec8307;
        }
        lVar.V = bArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "createOnlineTask, isHot=" + z17 + " reqFormat=" + i18 + " fileFormat=" + fileFormat + ", isOpenMultiBitRateDownload=" + X2 + ", decodeKey=" + str + ' ' + urlToken + " ediaId=" + mediaId + " url=" + lVar.M1 + " originMediaId:" + originMediaId + " cdn_sharding_download_info:" + valueOf + " reportDetailPacketTransInfo:" + lVar.U + " finderMediaCdnInfo:" + lVar.V);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5450xd3fbf9ce c5450xd3fbf9ce = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5450xd3fbf9ce();
        am.na naVar = c5450xd3fbf9ce.f135790g;
        naVar.f88947a = 1;
        naVar.f88948b = lVar;
        c5450xd3fbf9ce.e();
        return lVar;
    }

    public final cs2.p b(yr2.h detail, long j17, int i17, int i18, dn.k taskCallback, dn.l preloadCallback, java.lang.String tag) {
        r45.vf2 vf2Var;
        r45.vq2 vq2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detail, "detail");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskCallback, "taskCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadCallback, "preloadCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(detail.f546209e, "h265");
        ek4.b a17 = ek4.b.a(detail.f546205a, 0, 0, 0, 0, 0L, null, 0, 127, null);
        mn2.g4 g4Var = detail.f546210f;
        cs2.p pVar = new cs2.p(a17, g4Var);
        cs2.n nVar = detail.f546213i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<set-?>");
        pVar.f303628l2 = nVar;
        pVar.f303627k2 = i18;
        pVar.f303622f2 = j17;
        pVar.f323318d = "task_VideoPreloadWorker";
        pVar.f323335u = pm0.v.u(j17);
        pVar.f69601xaca5bdda = g4Var.n();
        pVar.M1 = g4Var.mo148084xb5887639().concat(g4Var.i());
        pVar.f69595x6d25b0d9 = g4Var.mo148083xfb83cc9b();
        pVar.Y1 = g4Var.h();
        r45.mb4 mb4Var = g4Var.f411535e;
        boolean z17 = false;
        pVar.f323331q = mb4Var.m75939xb282bd08(39) == 1;
        pVar.Y = 2;
        pVar.H1 = 2;
        pVar.Z = 8;
        int i19 = detail.f546206b;
        pVar.V1 = i19;
        pVar.f69608x6ac8fea7 = i19;
        pVar.X = 0L;
        pVar.f323342y0 = zy2.u.f559114a;
        pVar.f323339x0 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546223g;
        pVar.f323320f = taskCallback;
        pVar.f323329p0 = preloadCallback;
        pVar.f69592xf1ebe47b = 20302;
        long j18 = detail.f546207c;
        pVar.f323338x = j18;
        pVar.f69610x4f5245a8 = 0;
        java.lang.String value = detail.f546208d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        pVar.X1 = value;
        pVar.T1 = java.lang.String.valueOf(i17);
        pVar.T = 24;
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(9);
        r45.tq2 tq2Var = (r45.tq2) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546232p.get(m75945x2fec8307);
        java.lang.Integer valueOf = (tq2Var == null || (vq2Var = (r45.vq2) tq2Var.m75936x14adae67(2)) == null) ? null : java.lang.Integer.valueOf(vq2Var.m75939xb282bd08(0));
        if (valueOf != null && valueOf.intValue() == 1) {
            z17 = true;
        }
        pVar.U = z17;
        if (detail.f546212h) {
            pVar.f323332r = true;
            pVar.f69575xf11df5f5 = mb4Var.m75945x2fec8307(54);
            pVar.f323321g = mb4Var.m75945x2fec8307(55);
        }
        jz5.o oVar = (jz5.o) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546234r.get(m75945x2fec8307);
        if (oVar != null && (vf2Var = (r45.vf2) oVar.f384374d) != null) {
            java.lang.String m75945x2fec83072 = vf2Var.m75945x2fec8307(15);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            pVar.f323334t = m75945x2fec83072;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = mb4Var.m75934xbce7f2f(66);
        pVar.V = m75934xbce7f2f != null ? m75934xbce7f2f.f273689a : null;
        so2.i3 c17 = cu2.x.c(cu2.x.f303982a, g4Var.n(), false, false, false, 14, null);
        if (nVar == cs2.n.f303613e) {
            c17.f68977x19959117 = j18;
        } else if (nVar == cs2.n.f303614f) {
            c17.f68990x40360b93 = i19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "[createPreloadCDNTask] isHot=" + pVar.f323331q + " mediaId=" + g4Var.n() + " feedId:" + pm0.v.u(pVar.f303622f2) + pVar);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5450xd3fbf9ce c5450xd3fbf9ce = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5450xd3fbf9ce();
        am.na naVar = c5450xd3fbf9ce.f135790g;
        naVar.f88947a = 1;
        naVar.f88948b = pVar;
        c5450xd3fbf9ce.e();
        return pVar;
    }
}
