package ef0;

@j95.b
/* loaded from: classes8.dex */
public final class d4 extends i95.w implements qk.h9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f333729d;

    /* renamed from: e, reason: collision with root package name */
    public long f333730e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qb0 f333731f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f333732g = jz5.h.b(ef0.c4.f333718d);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bw5.qb0 Ai(com.p314xaae8f345.mm.p2495xc50a8b8b.g r8) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ef0.d4.Ai(com.tencent.mm.protobuf.g):bw5.qb0");
    }

    public final void Bi(java.lang.Long l17) {
        if (l17 == null) {
            this.f333730e = 0L;
            gm4.a.f355090a.f("key_sync_recommend");
            return;
        }
        this.f333730e = l17.longValue();
        gm4.a aVar = gm4.a.f355090a;
        long longValue = l17.longValue();
        if (!gm4.a.f355092c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingLocalStorage", "not init");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = gm4.a.f355091b;
        if (o4Var != null) {
            o4Var.putLong("key_sync_recommend", longValue);
        }
    }

    public void Di(bw5.lp0 lp0Var) {
        if (lp0Var == null) {
            gm4.a.f355090a.f("key_task_bar_play_item");
        } else {
            gm4.a.f355090a.h("key_task_bar_play_item", lp0Var.mo14344x5f01b1f6());
        }
    }

    public void Ni(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
        if (!ip1.e.f375117a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingTaskBarRecommendService", "syncTaskBarRecommendData style not recommend, ignore");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new ef0.b4(this, source), "TingSyncRecommend");
    }

    public final java.lang.String wi(android.content.Context context) {
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mc_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
