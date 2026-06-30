package cw1;

/* loaded from: classes12.dex */
public class x4 implements bw1.k, c01.e8 {

    /* renamed from: d, reason: collision with root package name */
    public final long f305021d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f305022e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f305023f;

    /* renamed from: g, reason: collision with root package name */
    public final long f305024g = java.lang.System.currentTimeMillis();

    /* renamed from: h, reason: collision with root package name */
    public final cw1.b3 f305025h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f305026i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 f305027m;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 activityC13117x73c251e5, boolean z17, boolean z18, long j17, cw1.b3 b3Var, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        this.f305027m = activityC13117x73c251e5;
        this.f305022e = z17;
        this.f305023f = z18;
        this.f305021d = j17;
        this.f305025h = b3Var;
        this.f305026i = c26987xeef691ab;
    }

    @Override // bw1.k
    public void K2(int i17, int i18) {
        yv1.h1.f(2, this.f305026i);
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.RunnableC28182x6b333a5(this, i17, i18));
    }

    @Override // bw1.k
    public void Y4() {
        yv1.h1.f(1, this.f305026i);
    }

    public final void a(long j17, int i17, final boolean z17) {
        int i18;
        int i19;
        yv1.f1 f1Var = yv1.g1.f547573p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 activityC13117x73c251e5 = this.f305027m;
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.S;
        activityC13117x73c251e5.j7(null);
        final long d17 = j17 + (i17 > 0 ? i17 * aw1.v.d() : 0L);
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: cw1.x4$$b
            @Override // java.lang.Runnable
            public final void run() {
                cw1.x4 x4Var = cw1.x4.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 activityC13117x73c251e52 = x4Var.f305027m;
                java.lang.Runnable runnable = activityC13117x73c251e52.F;
                if (runnable != null) {
                    runnable.run();
                }
                activityC13117x73c251e52.R += ((cw1.a3) x4Var.f305025h).a(z17, d17);
                activityC13117x73c251e52.setResult(-1, new android.content.Intent().putExtra("tds", activityC13117x73c251e52.R));
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 activityC13117x73c251e52 = this.f305027m;
        long j18 = -1;
        if (activityC13117x73c251e52.D) {
            long j19 = activityC13117x73c251e52.f177248w;
            j18 = j19 == -2 ? 0L : j19 == -1 ? -2L : j19 / 86400000;
        }
        if (z17) {
            mt1.b0.s(13, java.lang.System.currentTimeMillis() - this.f305024g, java.lang.Long.valueOf(i17));
        } else {
            int i28 = this.f305022e ? 23 : 24;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f305024g;
            java.lang.Long[] lArr = new java.lang.Long[6];
            lArr[0] = java.lang.Long.valueOf(j17);
            lArr[1] = java.lang.Long.valueOf(this.f305023f ? 1L : 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 activityC13117x73c251e53 = this.f305027m;
            if (activityC13117x73c251e53.C) {
                i19 = activityC13117x73c251e53.f177247v;
                i18 = i28;
            } else {
                i18 = i28;
                i19 = -1;
            }
            lArr[2] = java.lang.Long.valueOf(i19);
            lArr[3] = java.lang.Long.valueOf(j18);
            lArr[4] = java.lang.Long.valueOf(this.f305027m.E ? r4.f177250y : -1);
            lArr[5] = java.lang.Long.valueOf(i17);
            mt1.b0.s(i18, currentTimeMillis, lArr);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
        hashMap.put("storage_manage_sessionid", this.f305027m.f177246u.f547576b);
        hashMap.put("chat_history_remove_scene", java.lang.Integer.valueOf(this.f305027m.a7()));
        hashMap.put("storage_enter_scene", java.lang.Integer.valueOf(this.f305027m.f177233e));
        if (this.f305022e) {
            hashMap.put("chat_history_media_remove_size", java.lang.Long.valueOf(this.f305021d));
            hashMap.put("chat_history_media_removed_size", java.lang.Long.valueOf(d17));
        } else {
            hashMap.put("chat_history_text_remove_size", java.lang.Long.valueOf(this.f305021d));
            hashMap.put("chat_history_text_removed_size", java.lang.Long.valueOf(d17));
        }
        hashMap.put("chat_history_remove_end_type", java.lang.Integer.valueOf(z17 ? 1 : 2));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_history_remove_end", hashMap, 32903);
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.b0.f412734k = true;
    }

    @Override // c01.e8
    public void b(int i17, int i18) {
        yv1.h1.f(2, this.f305026i);
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.RunnableC28182x6b333a5(this, i17, i18));
    }

    @Override // c01.e8
    public void c(boolean z17, long j17, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = z17 ? "cancelled" : ya.b.f77504xbb80cbe3;
        objArr[1] = java.lang.Long.valueOf(j17);
        objArr[2] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingUI", "onDeleteDone [%s, %d, %d] ", objArr);
        a(j17, i17, z17);
    }

    @Override // bw1.k
    public void j6(boolean z17, long j17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = z17 ? "cancelled" : ya.b.f77504xbb80cbe3;
        objArr[1] = java.lang.Long.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingUI", "onDeleteEnd [%s, %d] ", objArr);
        a(j17, 0, z17);
    }
}
