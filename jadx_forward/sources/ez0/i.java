package ez0;

@j95.b
/* loaded from: classes5.dex */
public final class i extends i95.w implements p012xc85e97e9.p093xedfae76a.m1, uy0.h {

    /* renamed from: d, reason: collision with root package name */
    public pz0.r f339339d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f339340e = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: f, reason: collision with root package name */
    public final pf5.q f339341f = new pf5.q();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f339342g = new java.util.concurrent.CopyOnWriteArrayList();

    public void Ai(boolean z17) {
        az0.i5.s(az0.i5.f97090a, false, null, z17, 3, null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 getViewModel() {
        return this.f339341f.f435463f;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            oz0.c.f431734g.e();
            oz0.c.f431735h.e();
        }
        cz0.y yVar = cz0.y.f306502a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "init: SdkCompatVersion:" + cz0.y.f306503b);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MaasSdkResMgr", "check res only arm64");
            return;
        }
        java.util.List Ai = ((yy.a) ((zy.r) ((jz5.n) cz0.y.f306508g).mo141623x754a37bb())).Ai(103);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init: resList ");
        sb6.append(Ai != null ? kz5.n0.g0(Ai, null, null, null, 0, null, cz0.v.f306499d, 31, null) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", sb6.toString());
        if (Ai != null) {
            java.util.Iterator it = Ai.iterator();
            while (it.hasNext()) {
                int i17 = ((dm.v9) it.next()).f68796x5334f55;
                if (!com.p314xaae8f345.mm.vfs.w6.j(cz0.m.f306489b + '/' + i17)) {
                    cz0.y yVar2 = cz0.y.f306502a;
                    java.lang.String Bi = ((yy.a) ((zy.r) ((jz5.n) cz0.y.f306508g).mo141623x754a37bb())).Bi(103, i17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "init: get cached file " + i17 + ", " + Bi);
                    if (Bi != null) {
                        yVar2.j(i17, Bi, 1);
                    }
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).k(cz0.w.f306500d, 5000L);
        pm0.v.K(null, cz0.q.f306495d);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.c0.clicfg_maas_clean_legacy_res, bm5.h0.RepairerConfig_Maas_CleanLegacyRes_Int, 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "isEnableCleanLegacyRes: " + z17);
        if (z17) {
            pm0.v.K(null, cz0.r.f306496d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasSdkResMgr", "init: end");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f339341f.c();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f339341f.b("PluginMaasTemplate");
    }

    public void wi(android.content.Context context, android.content.Intent originIntent, com.p314xaae8f345.mm.p916x4268f0dc.api.C11011xd00752eb params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originIntent, "originIntent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginMJTemplate", "enterMultiTemplatePreviewUI");
        originIntent.setClass(context, com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.ActivityC11005x7656952.class);
        originIntent.putExtra("request_params", params);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(originIntent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/mj_template/plugin/PluginMaasTemplate", "enterMultiTemplatePreviewUI", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/mj_template/api/MaasAlbumMultiTemplateRequestParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/mj_template/plugin/PluginMaasTemplate", "enterMultiTemplatePreviewUI", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/mj_template/api/MaasAlbumMultiTemplateRequestParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
