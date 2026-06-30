package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lir2/v1;", "Lso2/i;", "state", "Ljz5/f0;", "invoke", "(Lir2/v1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1 */
/* loaded from: classes10.dex */
public final class C14828xbb4f58d9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter f204715d;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1$2, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter f204716d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ir2.v1 f204717e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter, ir2.v1 v1Var) {
            super(0);
            this.f204716d = notifyPresenter;
            this.f204717e = v1Var;
        }

        @Override // yz5.a
        /* renamed from: invoke */
        public java.lang.Object mo152xb9724478() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback = this.f204716d.f204699v;
            if (notifyViewCallback == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            r45.tl6 tl6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e) ((ir2.u1) this.f204717e).f375760a).f204814m;
            if (tl6Var != null) {
                if (notifyViewCallback.f204735p == null) {
                    android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(notifyViewCallback.f204731i).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570618ee2, (android.view.ViewGroup) null);
                    notifyViewCallback.f204735p = inflate;
                    if (inflate != null) {
                        inflate.setBackgroundColor(inflate.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
                        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.tu8);
                        if (findViewById != null) {
                            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
                            layoutParams2.setMarginStart(findViewById.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
                            findViewById.setLayoutParams(layoutParams2);
                        }
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = notifyViewCallback.f204729g;
                        if (c22801x87cbdc00 != null) {
                            com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5.c(c22801x87cbdc00, inflate, false, 2, null);
                        }
                    }
                }
                android.view.View view = notifyViewCallback.f204735p;
                if (view != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a, view, tl6Var, "make_red_envelope_roof_banner", null, null, null, 56, null);
                }
            }
            return jz5.f0.f384359a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14828xbb4f58d9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter) {
        super(1);
        this.f204715d = notifyPresenter;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        so2.i iVar;
        ir2.v1 state = (ir2.v1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (state instanceof ir2.s1) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter.B;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeLoaderState FirstScreenState isNotEmpty:");
            if (this.f204715d.f204697t == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0);
                throw null;
            }
            sb6.append(!((java.util.ArrayList) r10.f375624d).isEmpty());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (this.f204715d.f204697t == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0);
                throw null;
            }
            if (!((java.util.ArrayList) r2.f375624d).isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback = this.f204715d.f204699v;
                if (notifyViewCallback == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14832x3ce15cd4(notifyViewCallback));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter = this.f204715d;
            no2.c cVar = notifyPresenter.f204698u;
            if (cVar != null) {
                java.util.List data = ((ir2.s1) state).f375750a.f375662a;
                int i17 = notifyPresenter.f204688h;
                int i18 = notifyPresenter.f204686f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
                ir2.a1 a1Var = cVar.f420275b;
                if (a1Var != null) {
                    cVar.a(data, new java.util.ArrayList(a1Var.f375624d), i17, i18);
                }
            }
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.T6).mo141623x754a37bb()).r()).intValue() == 1 && (iVar = (so2.i) kz5.n0.Z(((ir2.s1) state).f375750a.f375662a)) != null) {
                dm.pd pdVar = iVar.f491944d;
                pdVar.f66129x2262335f = 33;
                pdVar.f66079xad49e234 = "为你加人气， 把你推荐给100人";
                r45.fb1 fb1Var = new r45.fb1();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                c19786x6a1e2862.m76550x2592a27b(6);
                r45.k74 k74Var = new r45.k74();
                k74Var.set(0, "wxalited00aacfb50f5dd1a839f104a56d7e048");
                k74Var.set(1, "pages/model/index");
                k74Var.set(7, java.lang.Boolean.TRUE);
                c19786x6a1e2862.m76551x3af0573b(k74Var);
                fb1Var.set(0, c19786x6a1e2862);
                pdVar.f66094x434c90c3 = fb1Var;
                pdVar.f66076x418206d5 = 0L;
            }
        } else if (state instanceof ir2.u1) {
            ir2.u1 u1Var = (ir2.u1) state;
            ir2.e1 e1Var = u1Var.f375760a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(e1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e c14861xdd35421e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e) e1Var;
            long a17 = c01.id.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter2 = this.f204715d;
            long j17 = a17 - notifyPresenter2.f204695r;
            ir2.a1 a1Var2 = notifyPresenter2.f204697t;
            if (a1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0);
                throw null;
            }
            boolean isEmpty = ((java.util.ArrayList) a1Var2.f375624d).isEmpty();
            this.f204715d.f204695r = 0L;
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter.B;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "observeLoaderState errorType:" + c14861xdd35421e.f375617f + " errorCode:" + c14861xdd35421e.f375618g);
            if (c14861xdd35421e.f375617f == 0 && c14861xdd35421e.f375618g == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter3 = this.f204715d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e c14861xdd35421e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.p1610x38eb0007.C14861xdd35421e) u1Var.f375760a;
                notifyPresenter3.f204692o = c14861xdd35421e2.f204812k;
                notifyPresenter3.f204693p = c14861xdd35421e2.f204813l;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "tabIndex:" + this.f204715d.f204688h + " RefreshedState refreshTime:" + j17 + " isEmpty:" + isEmpty + " size:" + u1Var.f375760a.f375662a.size());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback2 = this.f204715d.f204699v;
                if (notifyViewCallback2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14834xfd748509(isEmpty, notifyViewCallback2));
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14828xbb4f58d9.AnonymousClass2(this.f204715d, state));
            } else if (isEmpty) {
                final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback3 = this.f204715d.f204699v;
                if (notifyViewCallback3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                notifyViewCallback3.f204730h = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$showRefreshViewOnError$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573430el4);
                        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30);
                        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback.f204725t;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback.this.s(string, color, true);
                    }
                };
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                if (j17 >= ((java.lang.Number) t70Var.F2().r()).longValue()) {
                    java.lang.Runnable runnable = notifyViewCallback3.f204730h;
                    if (runnable != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.RunnableC14851xb529c6df) runnable).run();
                    }
                } else {
                    java.lang.Runnable runnable2 = notifyViewCallback3.f204730h;
                    if (runnable2 != null) {
                        long longValue = ((java.lang.Number) t70Var.F2().r()).longValue() - j17;
                        java.util.regex.Pattern pattern = pm0.v.f438335a;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable2, longValue);
                    }
                }
            }
        } else if (state instanceof ir2.t1) {
            long a18 = c01.id.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter4 = this.f204715d;
            long j18 = a18 - notifyPresenter4.f204696s;
            notifyPresenter4.f204696s = 0L;
            java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter.B;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tabIndex:");
            sb7.append(this.f204715d.f204688h);
            sb7.append("  LoadedMoreState loadMoreTime:");
            sb7.append(j18);
            sb7.append(" size:");
            ir2.t1 t1Var = (ir2.t1) state;
            sb7.append(t1Var.f375756a.f375662a.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback notifyViewCallback4 = this.f204715d.f204699v;
            if (notifyViewCallback4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            java.util.List msgList = t1Var.f375756a.f375662a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
            java.util.ArrayList c17 = notifyViewCallback4.f204727e.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyViewCallback.f204725t, "finishLoadMore .getData(" + notifyViewCallback4.f204728f + ": " + c17.hashCode() + " --- " + c17 + ')');
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            pm0.v.V(j18 >= ((java.lang.Number) t70Var2.F2().r()).longValue() ? 0L : ((java.lang.Number) t70Var2.F2().r()).longValue() - j18, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14833xaceb7ee7(notifyViewCallback4, msgList));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14820x55f2b87f.NotifyPresenter notifyPresenter5 = this.f204715d;
            no2.c cVar2 = notifyPresenter5.f204698u;
            if (cVar2 != null) {
                java.util.List data2 = t1Var.f375756a.f375662a;
                int i19 = notifyPresenter5.f204688h;
                int i27 = notifyPresenter5.f204686f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data2, "data");
                ir2.a1 a1Var3 = cVar2.f420275b;
                if (a1Var3 != null) {
                    cVar2.a(data2, new java.util.ArrayList(a1Var3.f375624d), i19, i27);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
