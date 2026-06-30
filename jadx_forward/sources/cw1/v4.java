package cw1;

/* loaded from: classes12.dex */
public class v4 implements bw1.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f304905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.b3 f304906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f304907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f304908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354 f304909h;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354 activityC13116xef072354, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, cw1.b3 b3Var, long j17, long j18) {
        this.f304909h = activityC13116xef072354;
        this.f304905d = c26987xeef691ab;
        this.f304906e = b3Var;
        this.f304907f = j17;
        this.f304908g = j18;
    }

    @Override // bw1.k
    public void K2(final int i17, final int i18) {
        yv1.h1.f(2, this.f304905d);
        ku5.u0 u0Var = ku5.t0.f394148d;
        final cw1.b3 b3Var = this.f304906e;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: cw1.v4$$a
            @Override // java.lang.Runnable
            public final void run() {
                ((cw1.a3) cw1.b3.this).b(i17, i18);
            }
        });
    }

    @Override // bw1.k
    public void Y4() {
        yv1.h1.f(1, this.f304905d);
    }

    @Override // bw1.k
    public void j6(final boolean z17, final long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingDetailUI", "onDeleteEnd [%d] ", java.lang.Long.valueOf(j17));
        ku5.u0 u0Var = ku5.t0.f394148d;
        final cw1.b3 b3Var = this.f304906e;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: cw1.v4$$b
            @Override // java.lang.Runnable
            public final void run() {
                cw1.v4 v4Var = cw1.v4.this;
                v4Var.getClass();
                cw1.a3 a3Var = (cw1.a3) b3Var;
                boolean z18 = z17;
                long a17 = a3Var.a(z18, j17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354 activityC13116xef072354 = v4Var.f304909h;
                activityC13116xef072354.V += a17;
                activityC13116xef072354.W.getClass();
                java.util.Iterator it = cw1.q4.f304797t.values().iterator();
                while (it.hasNext()) {
                    ((cw1.e4) it.next()).a(true);
                }
                if (z18) {
                    activityC13116xef072354.X6();
                    activityC13116xef072354.W.I(activityC13116xef072354.N, activityC13116xef072354.Q, activityC13116xef072354.R, activityC13116xef072354.S, activityC13116xef072354.f177250y, activityC13116xef072354.f177251z, activityC13116xef072354.A, activityC13116xef072354.P, false, activityC13116xef072354.B, activityC13116xef072354.X, null);
                } else {
                    cw1.q4 q4Var = activityC13116xef072354.W;
                    q4Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList(q4Var.f304799e.size());
                    int size = q4Var.f304799e.size();
                    int i17 = -1;
                    while (true) {
                        i17 = q4Var.f304802h.nextClearBit(i17 + 1);
                        if (i17 >= size) {
                            break;
                        } else {
                            arrayList.add((bw1.l) q4Var.f304799e.get(i17));
                        }
                    }
                    java.util.List a18 = q4Var.f304800f.isEmpty() ? q4Var.f304800f : cw1.r4.a(arrayList);
                    q4Var.f304799e = arrayList;
                    q4Var.f304800f = a18;
                    q4Var.f304802h = new java.util.BitSet();
                    q4Var.m8146xced61ae5();
                    q4Var.f304803i = 0L;
                    q4Var.f304804m = 0;
                    q4Var.f304798d.h7(0L, q4Var.f304799e.size(), q4Var.f304804m);
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("u", activityC13116xef072354.N);
                intent.putExtra("ds", activityC13116xef072354.T);
                intent.putExtra("dc", activityC13116xef072354.U);
                intent.putExtra("tds", activityC13116xef072354.V);
                activityC13116xef072354.setResult(-1, intent);
                java.lang.Runnable runnable = activityC13116xef072354.F;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.b0.f412734k = true;
        if (!z17) {
            mt1.b0.s(this.f304909h.N == null ? 26 : 9, java.lang.System.currentTimeMillis() - this.f304907f, java.lang.Long.valueOf(j17));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
        hashMap.put("storage_manage_sessionid", this.f304909h.f177246u.f547576b);
        hashMap.put("chat_history_remove_scene", java.lang.Integer.valueOf(this.f304909h.N == null ? 1 : 3));
        hashMap.put("storage_enter_scene", java.lang.Integer.valueOf(this.f304909h.f177233e));
        hashMap.put("chat_history_media_remove_size", java.lang.Long.valueOf(this.f304908g));
        hashMap.put("chat_history_media_removed_size", java.lang.Long.valueOf(j17));
        hashMap.put("chat_history_remove_end_type", java.lang.Integer.valueOf(z17 ? 1 : 2));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_history_remove_end", hashMap, 32903);
    }
}
