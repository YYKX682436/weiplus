package com.p314xaae8f345.p2841xd11c237d.smc;

/* renamed from: com.tencent.paymars.smc.SmcProtoBufUtil */
/* loaded from: classes15.dex */
public class C23037xd5ddedd6 {
    /* renamed from: fillStrategyTable */
    private static p45.o m84542xd00c5f58(java.util.LinkedList<r45.nf6> linkedList) {
        p45.o oVar = new p45.o();
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            r45.nf6 nf6Var = linkedList.get(i17);
            p45.m mVar = new p45.m();
            mVar.f433484d = nf6Var.f462897d;
            mVar.f433485e = nf6Var.f462898e;
            int i18 = 0;
            while (true) {
                java.util.LinkedList linkedList2 = nf6Var.f462899f;
                if (i18 < linkedList2.size()) {
                    r45.cw4 cw4Var = (r45.cw4) linkedList2.get(i18);
                    p45.n nVar = new p45.n();
                    nVar.f433487d = cw4Var.f453395d;
                    nVar.f433488e = cw4Var.f453398g;
                    nVar.f433489f = cw4Var.f453396e;
                    nVar.f433490g = cw4Var.f453397f;
                    nVar.f433491h = cw4Var.f453399h;
                    nVar.f433492i = cw4Var.f453400i;
                    nVar.f433493m = cw4Var.f453401m;
                    nVar.f433494n = cw4Var.f453402n;
                    mVar.f433486f.add(nVar);
                    i18++;
                }
            }
            oVar.f433495d.add(mVar);
        }
        return oVar;
    }

    /* renamed from: toMMGetStrategyReq */
    public static r45.ed3 m84543x2b1c8130() {
        r45.ed3 ed3Var = new r45.ed3();
        java.util.ArrayList<java.lang.Integer> m84519xce5bcaa4 = ((com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244) com.p314xaae8f345.p2841xd11c237d.C23005xa52e04fa.m84213x6f964b77(com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.class)).m84519xce5bcaa4();
        if (m84519xce5bcaa4.size() != 6) {
            return null;
        }
        ed3Var.f454836d = m84519xce5bcaa4.get(0).intValue();
        ed3Var.f454837e = m84519xce5bcaa4.get(1).intValue();
        ed3Var.f454838f = m84519xce5bcaa4.get(2).intValue();
        ed3Var.f454840h = m84519xce5bcaa4.get(3).intValue();
        ed3Var.f454841i = m84519xce5bcaa4.get(4).intValue();
        ed3Var.f454842m = m84519xce5bcaa4.get(5).intValue();
        return ed3Var;
    }

    /* renamed from: toMMReportIdkeyReq */
    public static r45.u30 m84544x48781a29(p45.g gVar) {
        r45.u30 u30Var = new r45.u30();
        u30Var.f468511d = gVar.f433447d;
        u30Var.f468512e = gVar.f433448e;
        u30Var.f468513f = 0;
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = gVar.f433449f;
            if (i17 >= linkedList.size()) {
                return u30Var;
            }
            p45.b bVar = (p45.b) linkedList.get(i17);
            r45.t30 t30Var = new r45.t30();
            t30Var.f467615d = bVar.f433412d;
            t30Var.f467617f = bVar.f433413e;
            t30Var.f467618g = bVar.f433415g;
            int i18 = 0;
            while (true) {
                java.util.LinkedList linkedList2 = bVar.f433414f;
                if (i18 < linkedList2.size()) {
                    p45.a aVar = (p45.a) linkedList2.get(i18);
                    r45.b44 b44Var = new r45.b44();
                    b44Var.f452046d = aVar.f433409d;
                    b44Var.f452049g = 0;
                    b44Var.f452048f = 0;
                    b44Var.f452050h = aVar.f433411f;
                    b44Var.f452047e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(java.lang.Integer.toString(aVar.f433410e).getBytes());
                    t30Var.f467619h.add(b44Var);
                    i18++;
                }
            }
            u30Var.f468514g.add(t30Var);
            i17++;
        }
    }

    /* renamed from: toMMReportKvReq */
    public static r45.u30 m84545x80c7e04(p45.i iVar) {
        r45.u30 u30Var = new r45.u30();
        u30Var.f468511d = iVar.f433459d;
        u30Var.f468512e = iVar.f433460e;
        u30Var.f468513f = iVar.f433461f;
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = iVar.f433462g;
            if (i17 >= linkedList.size()) {
                return u30Var;
            }
            p45.e eVar = (p45.e) linkedList.get(i17);
            r45.t30 t30Var = new r45.t30();
            t30Var.f467615d = eVar.f433428d;
            t30Var.f467617f = eVar.f433429e;
            t30Var.f467618g = eVar.f433430f;
            t30Var.f467616e = eVar.f433434m;
            t30Var.f467620i = eVar.f433432h;
            t30Var.f467621m = eVar.f433433i;
            t30Var.f467622n = eVar.f433435n;
            t30Var.f467623o = eVar.f433436o;
            t30Var.f467624p = eVar.f433437p;
            int i18 = 0;
            while (true) {
                java.util.LinkedList linkedList2 = eVar.f433431g;
                if (i18 < linkedList2.size()) {
                    p45.d dVar = (p45.d) linkedList2.get(i18);
                    r45.b44 b44Var = new r45.b44();
                    b44Var.f452046d = dVar.f433423d;
                    b44Var.f452047e = dVar.f433424e;
                    b44Var.f452048f = dVar.f433425f;
                    b44Var.f452049g = dVar.f433426g;
                    b44Var.f452050h = dVar.f433427h;
                    t30Var.f467619h.add(b44Var);
                    i18++;
                }
            }
            u30Var.f468514g.add(t30Var);
            i17++;
        }
    }

    /* renamed from: toMMSelfMonitor */
    public static r45.zx3 m84546xf90de413(p45.k kVar) {
        r45.zx3 zx3Var = new r45.zx3();
        zx3Var.f473986d = kVar.f433474d;
        int i17 = 0;
        while (true) {
            java.util.LinkedList linkedList = kVar.f433475e;
            if (i17 >= linkedList.size()) {
                return zx3Var;
            }
            r45.ay3 ay3Var = new r45.ay3();
            p45.l lVar = (p45.l) linkedList.get(i17);
            ay3Var.f451895d = lVar.f433476d;
            ay3Var.f451896e = lVar.f433477e;
            ay3Var.f451897f = lVar.f433478f;
            ay3Var.f451898g = lVar.f433479g;
            ay3Var.f451899h = lVar.f433480h;
            ay3Var.f451900i = lVar.f433481i;
            ay3Var.f451901m = lVar.f433482m;
            ay3Var.f451902n = lVar.f433483n;
            zx3Var.f473987e.add(ay3Var);
            i17++;
        }
    }

    /* renamed from: toSmcIdkeyStrategyResp */
    public static p45.c m84547x33356c39(r45.fd3 fd3Var) {
        p45.c cVar = new p45.c();
        cVar.f433416d = fd3Var.f455755d;
        cVar.f433417e = fd3Var.f455756e;
        cVar.f433418f = fd3Var.f455757f;
        cVar.f433421i = fd3Var.f455762n;
        cVar.f433422m = fd3Var.f455764p;
        cVar.f433419g = m84542xd00c5f58(fd3Var.f455759h);
        cVar.f433420h = m84542xd00c5f58(fd3Var.f455760i);
        return cVar;
    }

    /* renamed from: toSmcKVStrategyResp */
    public static p45.f m84548x3ec8f73c(r45.fd3 fd3Var) {
        p45.f fVar = new p45.f();
        fVar.f433438d = fd3Var.f455755d;
        fVar.f433439e = fd3Var.f455765q;
        fVar.f433440f = fd3Var.f455766r;
        fVar.f433441g = fd3Var.f455767s;
        fVar.f433445n = fd3Var.f455762n;
        fVar.f433446o = fd3Var.f455764p;
        fVar.f433442h = m84542xd00c5f58(fd3Var.f455768t);
        fVar.f433443i = m84542xd00c5f58(fd3Var.f455769u);
        fVar.f433444m = m84542xd00c5f58(fd3Var.f455770v);
        return fVar;
    }

    /* renamed from: toSmcReportIdkeyResp */
    public static p45.h m84549xaf5c7bd2(r45.v30 v30Var) {
        p45.h hVar = new p45.h();
        hVar.f433451d = v30Var.f469369d;
        hVar.f433452e = v30Var.f469370e;
        hVar.f433453f = v30Var.f469371f;
        hVar.f433456i = v30Var.f469376n;
        hVar.f433457m = v30Var.f469377o;
        hVar.f433458n = v30Var.f469378p;
        hVar.f433454g = m84542xd00c5f58(v30Var.f469373h);
        hVar.f433455h = m84542xd00c5f58(v30Var.f469374i);
        return hVar;
    }

    /* renamed from: toSmcReportKvResp */
    public static p45.j m84550x59eaa1d(r45.v30 v30Var) {
        p45.j jVar = new p45.j();
        jVar.f433464d = v30Var.f469369d;
        jVar.f433465e = v30Var.f469370e;
        jVar.f433466f = v30Var.f469371f;
        jVar.f433467g = v30Var.f469372g;
        jVar.f433471n = v30Var.f469376n;
        jVar.f433472o = v30Var.f469377o;
        jVar.f433473p = v30Var.f469378p;
        jVar.f433468h = m84542xd00c5f58(v30Var.f469373h);
        jVar.f433469i = m84542xd00c5f58(v30Var.f469374i);
        jVar.f433470m = m84542xd00c5f58(v30Var.f469375m);
        return jVar;
    }
}
