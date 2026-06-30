package g10;

@j95.b
/* loaded from: classes7.dex */
public final class v extends i95.w implements c00.i4 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f349085d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f349086e;

    public v() {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        this.f349085d = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f349086e = jz5.h.b(g10.r.f349079d);
    }

    public static final java.lang.Object wi(g10.v vVar, bw5.s7 s7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        vVar.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        if (s7Var != null) {
            java.lang.String b17 = s7Var.b();
            if (!(b17 == null || b17.length() == 0)) {
                java.lang.String b18 = s7Var.b();
                com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
                qVar.c("ilinkres_4274070d");
                java.util.LinkedList linkedList = qVar.f299081e;
                if (linkedList != null) {
                    linkedList.add(b18);
                }
                java.util.LinkedList linkedList2 = qVar.f299082f;
                if (linkedList2 != null) {
                    ea5.l wi6 = ((com.p314xaae8f345.mm.udr.e1) ((com.p314xaae8f345.mm.udr.c0) i95.n0.c(com.p314xaae8f345.mm.udr.c0.class))).wi("ilinkres_4274070d");
                    java.util.RandomAccess mo14972x73ec24f3 = wi6 != null ? wi6.mo14972x73ec24f3() : null;
                    if (mo14972x73ec24f3 == null) {
                        mo14972x73ec24f3 = kz5.p0.f395529d;
                    }
                    linkedList2.addAll(mo14972x73ec24f3);
                }
                ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Di(qVar, new g10.s(vVar, s7Var, nVar));
                java.lang.Object a17 = nVar.a();
                pz5.a aVar = pz5.a.f440719d;
                return a17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicEcsNirvanaFeatureService", "updateLatestBizUdrPkg, jumpInfo is invalid");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        java.lang.Object a172 = nVar.a();
        pz5.a aVar2 = pz5.a.f440719d;
        return a172;
    }

    public void Ai(bw5.x7 x7Var) {
        if (x7Var != null && x7Var.e() != null) {
            java.lang.String b17 = x7Var.e().b();
            if (!(b17 == null || b17.length() == 0)) {
                java.lang.String b18 = x7Var.e().b();
                int i17 = x7Var.e().f114369r;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload, bizName = " + b18 + ", bizPreloadType = " + i17);
                if (i17 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload, bizPreloadType is None");
                    return;
                } else {
                    pm0.v.X(new g10.m(b18, x7Var, i17));
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload, jumpInfo is invalid");
    }

    public final n10.o Bi(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "MagicEcsNirvanaGift")) {
            return new l10.a();
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "MagicEcsShopHome")) {
            return new j10.a();
        }
        if (jc3.u0.f380529a.a(str)) {
            return new n10.o(str);
        }
        return null;
    }

    public java.util.List Di(java.lang.String str) {
        n10.o Bi = Bi(str);
        kz5.p0 p0Var = kz5.p0.f395529d;
        return Bi != null ? kz5.n0.t0(kz5.c0.i(new rd3.k(), new rd3.j(), new sd3.c(), new rd3.e(), new sd3.b(), new vd3.f(), new vd3.d(), new ce3.a(Bi.f415579a), new n10.a(), new md3.l(), new n10.m(), new n10.i(), new md3.t(), new n10.b(), new n10.c(), new n10.n(), new n10.e(), new n10.f(), new n10.j()), p0Var) : p0Var;
    }

    public final boolean Ni(bw5.s7 s7Var) {
        java.lang.Object obj;
        if (s7Var != null) {
            java.lang.String b17 = s7Var.b();
            if (!(b17 == null || b17.length() == 0)) {
                java.lang.String b18 = s7Var.b();
                if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsCloseMbFeatureListCheck", 0) == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "isLatestUdrPkg, close feature list check");
                    return true;
                }
                com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
                com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_4274070d", b18);
                if (Ui == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicEcsNirvanaFeatureService", "isLatestUdrPkg, resource is null");
                    return false;
                }
                java.util.LinkedList linkedList = Ui.f299139x;
                java.lang.String str = null;
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p3133xd0ce8b26.aff.udr.u) obj).m117632xb5884f29(), "mbapp_ecs_ext")) {
                            break;
                        }
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.aff.udr.u uVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.u) obj;
                    if (uVar != null) {
                        str = uVar.m117633x754a37bb();
                    }
                }
                if (str == null || str.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "isLatestUdrPkg, udr not include feature list info, return false");
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "isLatestUdrPkg, featureListValue: " + str);
                java.util.Map a17 = d00.b.f306785a.a(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s7Var.f114367p, "getFeatureList(...)");
                return !new d00.a(r9).a(a17).booleanValue();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicEcsNirvanaFeatureService", "isLatestUdrPkg, jumpInfo is invalid");
        return false;
    }

    public void Ri(java.lang.String url) {
        java.lang.Integer h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: local url debug use: ".concat(url));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        g10.u uVar = new g10.u(this);
        try {
            android.net.Uri parse = android.net.Uri.parse(url);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parse, "parse(...)");
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parse.getScheme(), "nirvana")) {
                uVar.a("不支持的二维码格式: ".concat(url));
                return;
            }
            java.lang.String host = parse.getHost();
            if (host != null) {
                int hashCode = host.hashCode();
                if (hashCode != -703657114) {
                    if (hashCode == 2015743394 && host.equals("fast-debug")) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parse.getQueryParameter("command"), "cancel")) {
                            java.lang.String bizName = parse.getQueryParameter("biz");
                            if (bizName == null || bizName.length() == 0) {
                                uVar.a("二维码缺少 biz 参数");
                                return;
                            }
                            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(context.getCacheDir(), "nirvana_local_preview"), bizName + ".wspkg").o();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                            if (com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                                com.p314xaae8f345.mm.vfs.w6.h(o17);
                            }
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: on clear debug pkg for bizName: ".concat(bizName));
                            ((ku5.t0) ku5.t0.f394148d).g(new g10.p(bizName));
                            return;
                        }
                        java.lang.String queryParameter = parse.getQueryParameter(dm.i4.f66865x76d1ec5a);
                        java.lang.String queryParameter2 = parse.getQueryParameter("server");
                        if (!(queryParameter == null || queryParameter.length() == 0)) {
                            if (!(queryParameter2 == null || queryParameter2.length() == 0)) {
                                java.lang.String decode = android.net.Uri.decode(queryParameter2);
                                ((ku5.t0) ku5.t0.f394148d).g(new k10.b(decode + "/meta/" + queryParameter, uVar, context, decode + "/download/" + queryParameter));
                                return;
                            }
                        }
                        uVar.a("二维码缺少必要参数 (id/server)");
                        return;
                    }
                } else if (host.equals("local-preview")) {
                    java.lang.String queryParameter3 = parse.getQueryParameter("host");
                    java.lang.String queryParameter4 = parse.getQueryParameter("port");
                    int intValue = (queryParameter4 == null || (h17 = r26.h0.h(queryParameter4)) == null) ? 8964 : h17.intValue();
                    if (queryParameter3 == null || queryParameter3.length() == 0) {
                        uVar.a("二维码缺少 host 参数");
                        return;
                    }
                    ((ku5.t0) ku5.t0.f394148d).g(new k10.c("http://" + queryParameter3 + ':' + intValue, uVar, context));
                    return;
                }
            }
            uVar.a("不支持的二维码类型: " + parse.getHost());
        } catch (java.lang.Exception e17) {
            uVar.a("二维码内容解析失败: " + e17.getMessage());
        }
    }
}
