package zf0;

/* loaded from: classes12.dex */
public final class x extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f554110d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f554111e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f554112f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f554113g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f554114h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f554115i;

    /* renamed from: m, reason: collision with root package name */
    public int f554116m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f554117n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vf0.g f554118o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f554119p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f554120q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ oi3.h f554121r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(zf0.v0 v0Var, vf0.g gVar, t21.v2 v2Var, java.util.Map map, oi3.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f554117n = v0Var;
        this.f554118o = gVar;
        this.f554119p = v2Var;
        this.f554120q = map;
        this.f554121r = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zf0.x(this.f554117n, this.f554118o, this.f554119p, this.f554120q, this.f554121r, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((zf0.x) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        zf0.v0 v0Var;
        java.lang.String str;
        vf0.g gVar;
        java.lang.String a17;
        java.lang.Object u17;
        zf0.v0 v0Var2;
        java.util.Map map;
        t21.v2 v2Var;
        vf0.g gVar2;
        oi3.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f554116m;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f554117n.f554096i.getClass();
            v0Var = this.f554117n;
            vf0.g gVar3 = this.f554118o;
            t21.v2 v2Var2 = this.f554119p;
            java.util.Map map2 = this.f554120q;
            oi3.h hVar2 = this.f554121r;
            java.lang.Integer d17 = v0Var.d(false);
            if (d17 != null) {
                gVar3.f517696a = d17.intValue();
                return f0Var;
            }
            vf0.u2 u2Var = v0Var.f554096i.f517708b;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u2Var.f517812a)) {
                str = v2Var2.f();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            } else {
                str = u2Var.f517812a;
            }
            gVar3.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            gVar3.f517697b = str;
            c01.f7 k17 = v0Var.f554096i.f517712f.k();
            if (k17 == null || com.p314xaae8f345.mm.vfs.w6.k(gVar3.f517697b) >= k17.r()) {
                gVar = gVar3;
                if (!v0Var.f554096i.a() && !com.p314xaae8f345.mm.vfs.w6.j(gVar.f517697b)) {
                    gVar.f517696a = -540002;
                }
                return f0Var;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " start to downloadFav Video");
            java.lang.Integer d18 = v0Var.d(true);
            if (d18 != null) {
                gVar3.f517696a = d18.intValue();
                return f0Var;
            }
            a17 = zf0.v0.f554095x.a(k17.k(), bm5.f0.f104103r);
            if (a17 == null) {
                if (map2 != null) {
                    map2.put("e_download_fav_video_failed", "emptyFavCdnUrl");
                }
                gVar3.f517696a = -520009;
                return f0Var;
            }
            vf0.o2 o2Var = vf0.o2.f517775d;
            qi3.f0 f0Var2 = v0Var.f554096i.f517714h;
            java.util.Map map3 = f0Var2 != null ? f0Var2.f445234b : null;
            this.f554110d = v0Var;
            this.f554111e = gVar3;
            this.f554112f = v2Var2;
            this.f554113g = map2;
            this.f554114h = hVar2;
            this.f554115i = a17;
            this.f554116m = 1;
            u17 = zf0.v0.u(v0Var, a17, k17, o2Var, map3, this);
            if (u17 == aVar) {
                return aVar;
            }
            v0Var2 = v0Var;
            map = map2;
            v2Var = v2Var2;
            gVar2 = gVar3;
            hVar = hVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str2 = (java.lang.String) this.f554115i;
            hVar = (oi3.h) this.f554114h;
            map = (java.util.Map) this.f554113g;
            v2Var = (t21.v2) this.f554112f;
            gVar2 = (vf0.g) this.f554111e;
            v0Var2 = (zf0.v0) this.f554110d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = str2;
            u17 = obj;
        }
        int intValue = ((java.lang.Number) u17).intValue();
        if (intValue != 0) {
            if (map != null) {
                map.put("e_download_fav_video_failed", "error[" + intValue + ']');
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsg.SendVideoTask", v0Var2.id() + " download Fav Video failed:{" + intValue + '}');
            com.p314xaae8f345.mm.vfs.w6.h(a17);
            gVar2.f517696a = intValue;
            return f0Var;
        }
        v0Var2.f554096i.f517712f.p(null);
        v0Var2.f554100p = true;
        vf0.m3.l(v2Var, new zf0.w(v0Var2));
        hVar.set(hVar.f427150d + 13, v0Var2.f554096i.f517712f.m126747x696739c());
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k18 = e0Var.k(hVar.m75945x2fec8307(hVar.f427150d + 3), hVar.m75942xfb822ef2(hVar.f427150d + 0));
        if (k18 != null) {
            k18.d1(v0Var2.f554096i.f517712f.m126747x696739c());
            qz5.b.d(e0Var.s(k18.Q0(), k18.m124847x74d37ac6(), k18));
        }
        gVar2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<set-?>");
        gVar2.f517697b = a17;
        v0Var2.f554096i.f517721o.f517673a = true;
        java.lang.String sj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).sj(hVar, bm5.f0.f104105t, hVar.j(), true);
        if (!com.p314xaae8f345.mm.vfs.w6.j(sj6) && com.p314xaae8f345.mm.vfs.w6.j(a17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var2.id() + " fav thumb not exists, regenerate from video: " + a17);
            gp.a N = v0Var2.N(a17, "fav_thumb_fallback", map);
            v0Var2.f554096i.f517713g = N;
            vf0.m3.c(N, a17, sj6, true, map);
        }
        v0Var = v0Var2;
        gVar = gVar2;
        if (!v0Var.f554096i.a()) {
            gVar.f517696a = -540002;
        }
        return f0Var;
    }
}
