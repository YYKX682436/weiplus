package wr;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f530283a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f530284b;

    /* renamed from: c, reason: collision with root package name */
    public wr.c f530285c;

    public static final void a(wr.j jVar) {
        if (jVar.f530284b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "mgr is busy.");
            return;
        }
        java.util.ArrayList arrayList = jVar.f530283a;
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "all task finished.");
            return;
        }
        boolean z17 = false;
        java.lang.Object obj = arrayList.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        wr.c cVar = (wr.c) obj;
        arrayList.remove(0);
        jVar.f530284b = true;
        jVar.f530285c = cVar;
        java.lang.String str = cVar.f530266a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = cVar.f530267b;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, interfaceC4987x84e327cb.mo42933xb5885648())) {
                java.lang.String d17 = jVar.d(interfaceC4987x84e327cb);
                if (d17 != null) {
                    if (d17.length() > 0) {
                        pm0.v.X(new wr.e(jVar, d17));
                        return;
                    }
                }
                wr.k e17 = jVar.e(interfaceC4987x84e327cb);
                if (!(e17.f530286a.length() > 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "no thumb url available. start download origin emoticon. md5: " + str);
                    jVar.c(interfaceC4987x84e327cb);
                    return;
                }
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6 t6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class);
                java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
                java.lang.String Ui = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) t6Var).Ui(mo42933xb5885648, e17.f530286a);
                if (com.p314xaae8f345.mm.vfs.w6.j(Ui)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "get existing external downloaded thumb path. md5: " + interfaceC4987x84e327cb.mo42933xb5885648());
                    pm0.v.X(new wr.e(jVar, Ui));
                    return;
                }
                wr.b bVar = new wr.b(cVar.f530266a, e17.f530286a, e17.f530287b, Ui, new wr.i(cVar, jVar, Ui, e17));
                java.lang.String str2 = bVar.f530262b;
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
                java.lang.String str3 = bVar.f530264d;
                if (!K0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    z17 = true;
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EmoticonThumbImageCdnDownloader", "invalid download task. md5: " + bVar.f530261a);
                    bVar.a();
                    return;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
                c2CDownloadRequest.f17821x8c50294f = 60;
                c2CDownloadRequest.f17841x86986d5f = 60;
                c2CDownloadRequest.f17840xf3a4da4a = currentTimeMillis;
                c2CDownloadRequest.f17792xcd096f43 = bVar.b();
                c2CDownloadRequest.url = str2;
                c2CDownloadRequest.m37861xfb0731c4(str3);
                com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
                if ((c4446x11b6e6e0 != null ? c4446x11b6e6e0.m37788x8bc93551(c2CDownloadRequest, new wr.a(bVar)) : com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.f29003x43b77590) != 0) {
                    bVar.a();
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmoticonThumbImageMgr", "try get thumb for empty or invalid md5");
        jVar.b();
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(96L, 61L, 1L, false);
        pm0.v.X(new wr.d(this));
    }

    public final void c(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        boolean z17 = true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4987x84e327cb.l0()) && ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4987x84e327cb.J1()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4987x84e327cb.mo42927x1061ea06())) && ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4987x84e327cb.Z()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4987x84e327cb.mo42927x1061ea06())) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4987x84e327cb.x0()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4987x84e327cb.mo42928x1743c361()))))) {
            z17 = false;
        }
        if (z17) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class))).Ni(interfaceC4987x84e327cb, new wr.g(interfaceC4987x84e327cb, this));
        } else {
            java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
            if (mo42933xb5885648 == null) {
                mo42933xb5885648 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmoticonThumbImageMgr", "emojiInfo can not cdn download. return for safety. md5:".concat(mo42933xb5885648));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(96L, 60L, 1L, false);
            b();
        }
    }

    public final java.lang.String d(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        java.lang.String h07 = interfaceC4987x84e327cb.h0();
        if (com.p314xaae8f345.mm.vfs.w6.j(h07)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "get existing cover path. md5: " + interfaceC4987x84e327cb.mo42933xb5885648());
            return h07;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6 t6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class);
        java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
        java.lang.String Ri = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) t6Var).Ri(mo42933xb5885648);
        if (com.p314xaae8f345.mm.vfs.w6.j(Ri)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "get existing external generated thumb path. md5: " + interfaceC4987x84e327cb.mo42933xb5885648());
            return Ri;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6 t6Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class);
        java.lang.String mo42933xb58856482 = interfaceC4987x84e327cb.mo42933xb5885648();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb58856482, "getMd5(...)");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) t6Var2).getClass();
        java.lang.String str = n22.m.g() + mo42933xb58856482 + "_thumb";
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "get existing external generated thumb path. md5: " + interfaceC4987x84e327cb.mo42933xb5885648());
        return str;
    }

    public final wr.k e(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        wr.k kVar = new wr.k();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4987x84e327cb.l())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "get store thumb url. md5: " + interfaceC4987x84e327cb.mo42933xb5885648());
            java.lang.String l17 = interfaceC4987x84e327cb.l();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getThumbUrl(...)");
            kVar.f530286a = l17;
            return kVar;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(interfaceC4987x84e327cb.G1())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "get generated thumb url. md5: " + interfaceC4987x84e327cb.mo42933xb5885648());
            java.lang.String G1 = interfaceC4987x84e327cb.G1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(G1, "getGeneratedBusinessThumbUrl(...)");
            kVar.f530286a = G1;
            java.lang.String mo42927x1061ea06 = interfaceC4987x84e327cb.mo42927x1061ea06();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42927x1061ea06, "getAesKey(...)");
            kVar.f530287b = mo42927x1061ea06;
        }
        return kVar;
    }
}
