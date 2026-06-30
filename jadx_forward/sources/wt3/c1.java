package wt3;

/* loaded from: classes10.dex */
public final class c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final wt3.c1 f530920b = new wt3.c1();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f530921a = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public static final /* synthetic */ java.lang.String a(wt3.c1 c1Var) {
        c1Var.getClass();
        return "MicroMsg.StoryAudioManager";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cacheAudio: ");
        sb6.append(context);
        sb6.append(", ");
        sb6.append(pVar == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", sb6.toString());
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            e((im5.b) context, info, pVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StoryAudioManager", "context is not LifeCycle: " + context);
        e(null, info, pVar);
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        e(null, info, pVar);
    }

    public final void d(dk4.a mediaInfo, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        java.lang.String str = "ringtone_" + mediaInfo.f316015s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "start cacheAudio, mediaId mapping:" + mediaInfo.f316015s + " => " + str + ", videoFlag:" + mediaInfo.f316014r);
        ck4.c cVar = ck4.c.f124081a;
        wt3.z0 z0Var = new wt3.z0(this, pVar, mediaInfo);
        java.lang.String str2 = str == null ? mediaInfo.f316015s : str;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = mediaInfo.f316017u;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.String str6 = mediaInfo.f316016t;
        java.lang.String str7 = str6 == null ? "" : str6;
        int i17 = mediaInfo.f315997a;
        java.lang.String str8 = mediaInfo.f315998b;
        if (str8 == null) {
            str8 = "xV2";
        }
        java.lang.String str9 = str8;
        java.lang.String str10 = mediaInfo.f315999c;
        java.lang.String str11 = str10 == null ? "" : str10;
        java.lang.String str12 = mediaInfo.f316000d;
        java.lang.String str13 = str12 == null ? "" : str12;
        java.lang.String str14 = mediaInfo.f316014r;
        ck4.b b17 = cVar.b(str3, str5, str7, i17, str9, str11, str13, str14 == null ? "" : str14, z0Var, "MicroMsg.StoryAudioManager");
        b17.Y = 0;
        b17.H1 = 0;
        ((cf0.z) i95.n0.c(cf0.z.class)).Di().h(str, new wt3.x0(b17), new wt3.y0(this, str, mediaInfo, pVar));
    }

    public final void e(im5.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "cache audio " + info.f237244e);
        if (!(info.f237257u.length() == 0)) {
            if (com.p314xaae8f345.mm.vfs.w6.j(info.f237248i) && com.p314xaae8f345.mm.vfs.w6.k(info.f237248i) > 0 && info.f237249m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "info is cached, directly invoke callback success");
                if (pVar != null) {
                    pVar.mo149xb9724478(java.lang.Boolean.TRUE, info.f237248i);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "info is not cached, start download");
            java.lang.String str = info.f237245f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.lang.String valueOf = java.lang.String.valueOf(info.f237244e);
            java.lang.String str2 = info.f237248i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            dk4.a aVar = new dk4.a(valueOf, str2, str, 0, 0);
            aVar.f316000d = info.f237257u;
            if (info.f237262z) {
                aVar.f316014r = "A0";
            }
            d(aVar, pVar);
            return;
        }
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(info.f237244e);
        java.util.Map map = this.f530921a;
        wt3.j jVar = (wt3.j) map.get(valueOf2);
        if (jVar != null) {
            if (pVar != null) {
                jVar.f530965i.add(pVar);
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(info.f237248i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAudioManager", "cacheAudio is exist " + info.f237248i);
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Boolean.TRUE, info.f237248i);
                return;
            }
            return;
        }
        wt3.j jVar2 = new wt3.j(bVar, info);
        jVar2.f530965i.add(new wt3.b1(this, pVar, info));
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar2.f530963g)) {
            im5.b bVar2 = jVar2.f530960d;
            if (bVar2 != null) {
                bVar2.mo46316x322b85(jVar2);
            }
        } else {
            jVar2.a(false, null);
        }
        map.put(java.lang.Integer.valueOf(info.f237244e), jVar2);
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        if (c16997xb0aa383a != null) {
            wt3.j jVar = (wt3.j) this.f530921a.remove(java.lang.Integer.valueOf(c16997xb0aa383a.f237244e));
            if (jVar != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel ");
                java.lang.String str = jVar.f530964h;
                sb6.append(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f530962f, sb6.toString());
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
                jVar.f530965i.clear();
            }
        }
    }
}
