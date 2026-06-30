package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.t6$$a */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC19751x67bbe5f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u6 f273454d;

    public /* synthetic */ RunnableC19751x67bbe5f(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u6 u6Var) {
        this.f273454d = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u6 u6Var = this.f273454d;
        try {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, null, js3.g.class, new com.p314xaae8f345.mm.p794xb0fa9b5e.r() { // from class: com.tencent.mm.pluginsdk.ui.tools.t6$$b
                @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
                public final void a(java.lang.Object obj) {
                    final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u6 u6Var2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u6.this;
                    final int i17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) obj).f149937d;
                    if (i17 < 0) {
                        ku5.u0 u0Var = ku5.t0.f394148d;
                        java.util.Objects.requireNonNull(u6Var2);
                        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.tools.t6$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u6.this.a();
                            }
                        });
                        return;
                    }
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_QQMAIL_UNREAD_COUNT_INT, java.lang.Integer.valueOf(i17));
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.tools.t6$$d
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u6.this.mo75881xe05b4124(i17);
                        }
                    });
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QQMailUnreadHelper", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQMailUnreadHelper", "getUnreadCountAsync exception");
        }
    }
}
