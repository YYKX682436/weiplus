package ze5;

/* loaded from: classes9.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f553448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.m f553449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f553450g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ot0.q f553451h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553452i;

    public f2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, z01.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, ot0.q qVar, yb5.d dVar2) {
        this.f553447d = f9Var;
        this.f553448e = dVar;
        this.f553449f = mVar;
        this.f553450g = f0Var;
        this.f553451h = qVar;
        this.f553452i = dVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgFileMvvm", "progressPB(msgId:" + this.f553447d.m124847x74d37ac6() + ") click, status:" + this.f553448e.f68112x10a0fed7 + ", progressPB:" + this.f553449f.f550639t);
        if (!this.f553449f.f550639t) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f553450g.f391649d = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(this.f553447d, this.f553448e);
        int i17 = this.f553450g.f391649d;
        if (i17 != 100) {
            if (i17 != 101) {
                long j17 = this.f553448e.f68112x10a0fed7;
                if (j17 == 105) {
                    if (c01.id.a() - this.f553448e.f68096xac3be4e < 432000000) {
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.A(this.f553447d, this.f553451h.f430187f);
                        d35.i iVar = d35.i.f307880a;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553447d;
                        ot0.q qVar = this.f553451h;
                        if (f9Var != null) {
                            ((ku5.t0) ku5.t0.f394148d).g(new ze5.a2(qVar, f9Var, 4));
                        }
                    } else {
                        yb5.d dVar = this.f553452i;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f553447d;
                        final ot0.q qVar2 = this.f553451h;
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.P(dVar, f9Var2, com.p314xaae8f345.mm.R.C30867xcad56011.f572020wg, com.p314xaae8f345.mm.R.C30867xcad56011.f572017wd, new java.util.function.Consumer() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$n
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                ot0.q qVar3 = ot0.q.this;
                                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
                                if (f9Var3 == null) {
                                    return;
                                }
                                ((ku5.t0) ku5.t0.f394148d).g(new ze5.a2(qVar3, f9Var3, 5));
                            }
                        });
                    }
                } else if (j17 == 102) {
                    ze5.g2.b(this.f553447d, this.f553451h.f430227p);
                } else if (sc5.i.f488114a.a(this.f553447d)) {
                    ze5.g2.d(this.f553447d, this.f553451h);
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.x(this.f553447d.m124847x74d37ac6(), this.f553447d.Q0(), this.f553451h.f430187f);
                    d35.i.f307880a.d(this.f553447d);
                    ot0.q qVar3 = this.f553451h;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = this.f553447d;
                    if (f9Var3 != null) {
                        ((ku5.t0) ku5.t0.f394148d).g(new ze5.a2(qVar3, f9Var3, 2));
                    }
                }
            }
        } else if (c01.id.a() - this.f553448e.f68096xac3be4e < 432000000) {
            pt0.e0 e0Var = pt0.f0.f439742b1;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(this.f553447d.Q0(), this.f553447d.m124847x74d37ac6());
            if (k17 != null) {
                i95.m c17 = i95.n0.c(pt.g0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                pt.g0.Xb((pt.g0) c17, k17, null, 0, false, 8, null);
                e0Var.s(k17.Q0(), k17.m124847x74d37ac6(), k17);
                java.lang.String str = this.f553451h.f430187f;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(k17.m124847x74d37ac6(), k17.Q0());
                if (J0 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str);
                } else if (J0.f68112x10a0fed7 != 198) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " get status failed: " + str + " status:" + J0.f68112x10a0fed7);
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.m(true);
                    J0.f68112x10a0fed7 = 101;
                    J0.f68103x4a777c2 = c01.id.e();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(J0, new java.lang.String[0]);
                    dk5.w.f316499a.b(k17, "file_resend_attach_from_fail");
                }
                d35.i iVar2 = d35.i.f307880a;
                ((ku5.t0) ku5.t0.f394148d).g(new ze5.a2(this.f553451h, k17, 4));
            }
        } else {
            yb5.d dVar2 = this.f553452i;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var4 = this.f553447d;
            final ot0.q qVar4 = this.f553451h;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.P(dVar2, f9Var4, com.p314xaae8f345.mm.R.C30867xcad56011.f572019wf, com.p314xaae8f345.mm.R.C30867xcad56011.f572017wd, new java.util.function.Consumer() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$n
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    ot0.q qVar32 = ot0.q.this;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var32 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
                    if (f9Var32 == null) {
                        return;
                    }
                    ((ku5.t0) ku5.t0.f394148d).g(new ze5.a2(qVar32, f9Var32, 5));
                }
            });
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
