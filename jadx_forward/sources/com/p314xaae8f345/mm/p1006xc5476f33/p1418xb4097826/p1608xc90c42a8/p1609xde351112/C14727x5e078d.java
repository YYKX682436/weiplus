package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract;", "", "<init>", "()V", "MsgPresenter", "MsgViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract */
/* loaded from: classes10.dex */
public final class C14727x5e078d {

    /* renamed from: a */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d f204353a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d();

    /* renamed from: b */
    public static long f204354b = android.os.SystemClock.uptimeMillis();

    /* renamed from: c */
    public static final int f204355c = 20;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgPresenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter */
    /* loaded from: classes10.dex */
    public static final class MsgPresenter implements fs2.a {

        /* renamed from: d */
        public final int f204356d;

        /* renamed from: e */
        public final int f204357e;

        /* renamed from: f */
        public final int[] f204358f;

        /* renamed from: g */
        public final java.lang.String f204359g;

        /* renamed from: h */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback f204360h;

        /* renamed from: i */
        public final java.util.ArrayList f204361i;

        /* renamed from: m */
        public long f204362m;

        /* renamed from: n */
        public final jz5.g f204363n;

        /* renamed from: o */
        public long f204364o;

        /* renamed from: p */
        public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6544xa7bd9d01 f204365p;

        /* renamed from: q */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14732xcf6c1de5 f204366q;

        /* renamed from: r */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14735xbdea1239 f204367r;

        /* JADX WARN: Type inference failed for: r3v3, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$msgUpdateListener$1] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$thanksUpdateListener$1] */
        public MsgPresenter(int i17, int i18, int[] msgTypes) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTypes, "msgTypes");
            this.f204356d = i17;
            this.f204357e = i18;
            this.f204358f = msgTypes;
            this.f204359g = "Finder.FinderFinderMsgContract.MsgPresenter." + hashCode();
            this.f204361i = new java.util.ArrayList();
            this.f204363n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14731x22d9c090(this));
            this.f204365p = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6544xa7bd9d01();
            com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            this.f204366q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded>(a0Var) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$msgUpdateListener$1
                {
                    this.f39173x3fe91575 = -2136143875;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded c5508x3c9dcded) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5508x3c9dcded event = c5508x3c9dcded;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    am.lc lcVar = event.f135839g;
                    if (lcVar == null) {
                        return false;
                    }
                    long j17 = lcVar.f88769a;
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14733xfe16fbb1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter.this, j17, j17, event));
                    return false;
                }
            };
            this.f204367r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922>(a0Var) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$thanksUpdateListener$1
                {
                    this.f39173x3fe91575 = 1097932050;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 event = c5542xa257d922;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    am.md mdVar = event.f135866g;
                    java.lang.String str = mdVar != null ? mdVar.f88872c : null;
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14736xe762cadd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter.this, mdVar != null ? java.lang.Long.valueOf(mdVar.f88870a) : null, str, mdVar != null ? java.lang.Integer.valueOf(mdVar.f88873d) : null, event));
                    return false;
                }
            };
        }

        public final void c() {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = this.f204360h;
            p3325xe03a0797.p3326xc267989b.y0 b17 = (msgViewCallback == null || (abstractActivityC21394xb3d2c0cf = msgViewCallback.f204393g) == null) ? null : v65.m.b(abstractActivityC21394xb3d2c0cf);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f204359g, "viewCallback?.getActivity()?.lifecycleScope is null");
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            cq.j1.h((cq.k) c17, this.f204356d, this.f204357e, (java.lang.String) ((jz5.n) this.f204363n).mo141623x754a37bb(), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14728x13a055e8(b17, this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14729x13a055e9(this, b17), 8, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            c14727x5e078d.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204354b = uptimeMillis;
        }

        public final int f(long j17, int i17, boolean z17, boolean z18) {
            java.util.List b17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = this.f204360h;
            if (msgViewCallback == null) {
                return -1;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            cu2.a0 a0Var = cu2.b0.f303904a;
            b17 = a0Var.b(j17, i17, (r18 & 4) != 0 ? new int[0] : this.f204358f, this.f204356d, (java.lang.String) ((jz5.n) this.f204363n).mo141623x754a37bb(), (r18 & 32) != 0 ? 0 : 0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                so2.i j18 = a0Var.j((dm.pd) it.next());
                if (j18 != null) {
                    arrayList2.add(j18);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f204359g, "loadMoreData mentionId:" + j17 + " limit:" + i17 + " list:" + arrayList2.size());
            arrayList.addAll(arrayList2);
            if (this.f204356d == 1) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    dm.pd pdVar = ((so2.i) it6.next()).f491944d;
                    long j19 = pdVar.f66095xc8a07680;
                    long j27 = this.f204362m;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6544xa7bd9d01 c6544xa7bd9d01 = this.f204365p;
                    if (j19 < j27 || j27 == 0) {
                        int i18 = pdVar.f66129x2262335f;
                        if (i18 == 1) {
                            c6544xa7bd9d01.f138969m++;
                        } else if (i18 == 2) {
                            c6544xa7bd9d01.f138970n++;
                        } else if (i18 == 3) {
                            c6544xa7bd9d01.f138971o++;
                        } else if (i18 == 5) {
                            c6544xa7bd9d01.f138972p++;
                        }
                        c6544xa7bd9d01.f138964h++;
                    } else {
                        int i19 = pdVar.f66129x2262335f;
                        if (i19 == 1) {
                            c6544xa7bd9d01.f138965i++;
                        } else if (i19 == 2) {
                            c6544xa7bd9d01.f138966j++;
                        } else if (i19 == 3) {
                            c6544xa7bd9d01.f138967k++;
                        } else if (i19 == 5) {
                            c6544xa7bd9d01.f138968l++;
                        }
                        c6544xa7bd9d01.f138963g++;
                    }
                    c6544xa7bd9d01.f138962f++;
                }
            }
            msgViewCallback.s(arrayList, z17, z18);
            return arrayList2.size();
        }

        public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback callback) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            bq.p0 p0Var = bq.q0.f105046t;
            bq.q0.f105047u.clear();
            mo48813x58998cd();
            mo48813x58998cd();
            this.f204360h = callback;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f204359g, "onAttach " + this.f204357e);
            if (this.f204356d == 1) {
                java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                if (Ri == null) {
                    Ri = "";
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6544xa7bd9d01 c6544xa7bd9d01 = this.f204365p;
                c6544xa7bd9d01.f138960d = c6544xa7bd9d01.b("SessionId", Ri, true);
            }
        }

        @Override // fs2.a
        /* renamed from: onDetach */
        public void mo979x3f5eee52() {
            mo48814x2efc64();
            mo48814x2efc64();
            if (this.f204356d == 1) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6544xa7bd9d01 c6544xa7bd9d01 = this.f204365p;
                c6544xa7bd9d01.k();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6544xa7bd9d01);
            }
            this.f204360h = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f204359g, "onDetach " + this.f204357e);
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgPresenter;", "Lym5/l1;", "UICallbackListener", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback */
    /* loaded from: classes10.dex */
    public static final class MsgViewCallback implements fs2.c, ym5.l1 {

        /* renamed from: d */
        public final java.lang.String f204390d;

        /* renamed from: e */
        public final int f204391e;

        /* renamed from: f */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter f204392f;

        /* renamed from: g */
        public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204393g;

        /* renamed from: h */
        public final android.view.View f204394h;

        /* renamed from: i */
        public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f204395i;

        /* renamed from: m */
        public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f204396m;

        /* renamed from: n */
        public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f204397n;

        /* renamed from: o */
        public rl5.r f204398o;

        /* renamed from: p */
        public android.widget.TextView f204399p;

        /* renamed from: q */
        public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f204400q;

        /* renamed from: r */
        public db2.g4 f204401r;

        /* renamed from: s */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.UICallbackListener f204402s;

        /* renamed from: t */
        public db2.n4 f204403t;

        @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$UICallbackListener;", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$UICallbackListener */
        /* loaded from: classes8.dex */
        public interface UICallbackListener {
            void F(dm.pd pdVar);
        }

        public MsgViewCallback(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.view.View msgView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter presenter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.UICallbackListener uICallbackListener) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgView, "msgView");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
            this.f204390d = "Finder.FinderMsgContract.MsgViewCallback." + hashCode();
            this.f204391e = 100;
            this.f204392f = presenter;
            this.f204393g = activity;
            this.f204394h = msgView;
            this.f204402s = uICallbackListener;
        }

        public static final void l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback, int i17) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = msgViewCallback.f204393g;
            switch (i17) {
                case -8003:
                    db5.e1.i(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30867xcad56011.f573602f45, 0);
                    return;
                case -8002:
                    db5.e1.i(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30867xcad56011.cwu, 0);
                    return;
                case -8001:
                    db5.e1.i(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30867xcad56011.cv_, 0);
                    return;
                default:
                    return;
            }
        }

        public static final void o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback, final dm.pd pdVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter = msgViewCallback.f204392f;
            final int i17 = msgPresenter.f204356d == 1 ? 7 : 5;
            long j17 = pdVar.f66108x2327e25f;
            java.lang.String str = pdVar.f66109x2812d6a6;
            int i18 = msgPresenter.f204356d;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = msgViewCallback.f204393g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            db2.g4 g4Var = new db2.g4(j17, str, i17, i18, "", true, null, null, 0L, null, false, false, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
            msgViewCallback.f204401r = g4Var;
            pq5.g l17 = g4Var.l();
            l17.f(context);
            l17.h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$getCommentDetail$1
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
                
                    if (r2.f66076x418206d5 != 0) goto L40;
                 */
                /* JADX WARN: Removed duplicated region for block: B:57:0x01c4  */
                @Override // gm5.a
                /* renamed from: call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object mo1059x2e7a5e(java.lang.Object r34) {
                    /*
                        Method dump skipped, instructions count: 526
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14740x7e10ef97.mo1059x2e7a5e(java.lang.Object):java.lang.Object");
                }
            });
        }

        public static final void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback, boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, long j17) {
            java.lang.String str;
            jz5.f0 f0Var;
            java.lang.String str2;
            java.lang.String str3;
            java.lang.String str4;
            java.lang.String str5;
            java.lang.String str6;
            r45.ef2 m76971x25b90ced;
            r45.hf2 hf2Var;
            r45.ef2 m76971x25b90ced2;
            r45.hf2 hf2Var2;
            r45.ef2 m76971x25b90ced3;
            r45.hf2 hf2Var3;
            r45.ef2 m76971x25b90ced4;
            r45.hf2 hf2Var4;
            r45.ef2 m76971x25b90ced5;
            r45.hf2 hf2Var5;
            r45.ef2 m76971x25b90ced6;
            r45.hf2 hf2Var6;
            r45.ef2 m76971x25b90ced7;
            r45.hf2 hf2Var7;
            r45.ef2 m76971x25b90ced8;
            r45.hf2 hf2Var8;
            r45.ef2 m76971x25b90ced9;
            r45.hf2 hf2Var9;
            r45.ef2 m76971x25b90ced10;
            r45.hf2 hf2Var10;
            r45.ef2 m76971x25b90ced11;
            r45.hf2 hf2Var11;
            r45.ef2 m76971x25b90ced12;
            r45.hf2 hf2Var12;
            r45.ef2 m76971x25b90ced13;
            r45.hf2 hf2Var13;
            r45.ef2 m76971x25b90ced14;
            r45.hf2 hf2Var14;
            r45.if2 if2Var;
            r45.ef2 m76971x25b90ced15;
            r45.hf2 hf2Var15;
            r45.ef2 m76971x25b90ced16;
            r45.hf2 hf2Var16;
            r45.ef2 m76971x25b90ced17;
            r45.hf2 hf2Var17;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
            r45.ef2 m76971x25b90ced18;
            r45.hf2 hf2Var18;
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
            msgViewCallback.getClass();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c19792x256d2725.m76802x2dd01666();
            if (m76802x2dd016662 == null || (m76962x74cd162e = m76802x2dd016662.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) {
                str = null;
            } else {
                str = c19788xd7cfd73e.m76623xd93f812f() + c19788xd7cfd73e.m76624x4c9b7dca();
            }
            if ((str == null || str.length() == 0) && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76971x25b90ced18 = m76802x2dd01666.m76971x25b90ced()) != null && (hf2Var18 = (r45.hf2) m76971x25b90ced18.m75936x14adae67(1)) != null && (str = hf2Var18.m75945x2fec8307(8)) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
            java.lang.String m76184x8010e5e4 = m76760x76845fea != null ? m76760x76845fea.m76184x8010e5e4() : null;
            r45.xs4 xs4Var = new r45.xs4();
            long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
            java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
            java.lang.String str7 = msgViewCallback.f204390d;
            if (str == null || m76184x8010e5e4 == null || m76803x6c285d75 == null) {
                f0Var = null;
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_mv_cover_url", str);
                intent.putExtra("key_mv_feed_id", pm0.v.u(m76784x5db1b11));
                intent.putExtra("key_mv_nonce_id", m76803x6c285d75);
                intent.putExtra("key_mv_poster", m76184x8010e5e4);
                intent.putExtra("key_launch_mv_comment", z17);
                intent.putExtra("key_refer_mv_comment_id", j17);
                intent.putExtra("key_need_update_music_ball_url", true);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd016663 == null || (m76971x25b90ced17 = m76802x2dd016663.m76971x25b90ced()) == null || (hf2Var17 = (r45.hf2) m76971x25b90ced17.m75936x14adae67(1)) == null || (str2 = hf2Var17.m75945x2fec8307(12)) == null) {
                    str2 = "";
                }
                intent.putExtra("key_mv_extra_info", str2);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd016664 == null || (m76971x25b90ced16 = m76802x2dd016664.m76971x25b90ced()) == null || (hf2Var16 = (r45.hf2) m76971x25b90ced16.m75936x14adae67(1)) == null || (str3 = hf2Var16.m75945x2fec8307(13)) == null) {
                    str3 = "";
                }
                intent.putExtra("key_mv_identification", str3);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016665 = c19792x256d2725.m76802x2dd01666();
                intent.putExtra("key_mv_music_duration", (m76802x2dd016665 == null || (m76971x25b90ced15 = m76802x2dd016665.m76971x25b90ced()) == null || (hf2Var15 = (r45.hf2) m76971x25b90ced15.m75936x14adae67(1)) == null) ? 0 : hf2Var15.m75939xb282bd08(14));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016666 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd016666 == null || (m76971x25b90ced14 = m76802x2dd016666.m76971x25b90ced()) == null || (hf2Var14 = (r45.hf2) m76971x25b90ced14.m75936x14adae67(1)) == null || (if2Var = (r45.if2) hf2Var14.m75936x14adae67(17)) == null || (str4 = if2Var.m75945x2fec8307(0)) == null) {
                    str4 = "";
                }
                intent.putExtra("key_mv_music_operation_url", str4);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016667 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd016667 == null || (m76971x25b90ced13 = m76802x2dd016667.m76971x25b90ced()) == null || (hf2Var13 = (r45.hf2) m76971x25b90ced13.m75936x14adae67(1)) == null || (str5 = hf2Var13.m75945x2fec8307(18)) == null) {
                    str5 = "";
                }
                intent.putExtra("key_mv_song_mid", str5);
                xs4Var.set(0, pm0.v.u(m76784x5db1b11));
                xs4Var.set(1, m76803x6c285d75);
                xs4Var.set(2, str);
                xs4Var.set(3, m76184x8010e5e4);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016668 = c19792x256d2725.m76802x2dd01666();
                xs4Var.set(4, (m76802x2dd016668 == null || (m76971x25b90ced12 = m76802x2dd016668.m76971x25b90ced()) == null || (hf2Var12 = (r45.hf2) m76971x25b90ced12.m75936x14adae67(1)) == null) ? null : hf2Var12.m75945x2fec8307(1));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016669 = c19792x256d2725.m76802x2dd01666();
                xs4Var.set(5, (m76802x2dd016669 == null || (m76971x25b90ced11 = m76802x2dd016669.m76971x25b90ced()) == null || (hf2Var11 = (r45.hf2) m76971x25b90ced11.m75936x14adae67(1)) == null) ? null : hf2Var11.m75945x2fec8307(7));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd0166610 = c19792x256d2725.m76802x2dd01666();
                xs4Var.set(6, (m76802x2dd0166610 == null || (m76971x25b90ced10 = m76802x2dd0166610.m76971x25b90ced()) == null || (hf2Var10 = (r45.hf2) m76971x25b90ced10.m75936x14adae67(1)) == null) ? null : hf2Var10.m75945x2fec8307(12));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd0166611 = c19792x256d2725.m76802x2dd01666();
                xs4Var.set(7, (m76802x2dd0166611 == null || (m76971x25b90ced9 = m76802x2dd0166611.m76971x25b90ced()) == null || (hf2Var9 = (r45.hf2) m76971x25b90ced9.m75936x14adae67(1)) == null) ? null : hf2Var9.m75945x2fec8307(9));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd0166612 = c19792x256d2725.m76802x2dd01666();
                xs4Var.set(8, java.lang.Long.valueOf((m76802x2dd0166612 == null || (m76971x25b90ced8 = m76802x2dd0166612.m76971x25b90ced()) == null || (hf2Var8 = (r45.hf2) m76971x25b90ced8.m75936x14adae67(1)) == null) ? 0L : hf2Var8.m75942xfb822ef2(11)));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd0166613 = c19792x256d2725.m76802x2dd01666();
                xs4Var.set(9, (m76802x2dd0166613 == null || (m76971x25b90ced7 = m76802x2dd0166613.m76971x25b90ced()) == null || (hf2Var7 = (r45.hf2) m76971x25b90ced7.m75936x14adae67(1)) == null) ? null : hf2Var7.m75945x2fec8307(1));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd0166614 = c19792x256d2725.m76802x2dd01666();
                xs4Var.set(10, java.lang.Integer.valueOf((m76802x2dd0166614 == null || (m76971x25b90ced6 = m76802x2dd0166614.m76971x25b90ced()) == null || (hf2Var6 = (r45.hf2) m76971x25b90ced6.m75936x14adae67(1)) == null) ? 0 : hf2Var6.m75939xb282bd08(14)));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd0166615 = c19792x256d2725.m76802x2dd01666();
                xs4Var.set(14, (m76802x2dd0166615 == null || (m76971x25b90ced5 = m76802x2dd0166615.m76971x25b90ced()) == null || (hf2Var5 = (r45.hf2) m76971x25b90ced5.m75936x14adae67(1)) == null) ? null : hf2Var5.m75945x2fec8307(0));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd0166616 = c19792x256d2725.m76802x2dd01666();
                xs4Var.set(15, (m76802x2dd0166616 == null || (m76971x25b90ced4 = m76802x2dd0166616.m76971x25b90ced()) == null || (hf2Var4 = (r45.hf2) m76971x25b90ced4.m75936x14adae67(1)) == null) ? null : hf2Var4.m75945x2fec8307(6));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd0166617 = c19792x256d2725.m76802x2dd01666();
                xs4Var.set(16, (m76802x2dd0166617 == null || (m76971x25b90ced3 = m76802x2dd0166617.m76971x25b90ced()) == null || (hf2Var3 = (r45.hf2) m76971x25b90ced3.m75936x14adae67(1)) == null) ? null : hf2Var3.m75945x2fec8307(8));
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd0166618 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd0166618 == null || (m76971x25b90ced2 = m76802x2dd0166618.m76971x25b90ced()) == null || (hf2Var2 = (r45.hf2) m76971x25b90ced2.m75936x14adae67(1)) == null || (str6 = hf2Var2.m75945x2fec8307(18)) == null) {
                    str6 = "";
                }
                xs4Var.set(11, str6);
                xs4Var.set(13, str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "jump to musicMvMainUI");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd0166619 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd0166619 != null && (m76971x25b90ced = m76802x2dd0166619.m76971x25b90ced()) != null && (hf2Var = (r45.hf2) m76971x25b90ced.m75936x14adae67(1)) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.oa0.f208835a.e(hf2Var, pm0.v.u(c19792x256d2725.m76784x5db1b11()), 13, xs4Var);
                }
                r45.bt4 bt4Var = new r45.bt4();
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
                bt4Var.f452570e = uuid;
                bt4Var.f452571f = 86;
                bt4Var.f452572g = pm0.v.u(c19792x256d2725.m76784x5db1b11());
                bt4Var.f452569d = 5;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = msgViewCallback.f204393g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                bt4Var.f452574i = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
                intent.putExtra("key_mv_report_data", bt4Var.mo14344x5f01b1f6());
                java.lang.String m75945x2fec8307 = xs4Var.m75945x2fec8307(14);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                intent.putExtra("key_mv_song_name", m75945x2fec8307);
                java.lang.String m75945x2fec83072 = xs4Var.m75945x2fec8307(15);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                intent.putExtra("key_mv_song_lyric", m75945x2fec83072);
                java.lang.String m75945x2fec83073 = xs4Var.m75945x2fec8307(4);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                intent.putExtra("key_mv_singer_name", m75945x2fec83073);
                java.lang.String m75945x2fec83074 = xs4Var.m75945x2fec8307(5);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                intent.putExtra("key_mv_album_name", m75945x2fec83074);
                java.lang.String m75945x2fec83075 = xs4Var.m75945x2fec8307(7);
                if (m75945x2fec83075 == null) {
                    m75945x2fec83075 = "";
                }
                intent.putExtra("key_mv_music_genre", m75945x2fec83075);
                intent.putExtra("key_mv_issue_date", java.lang.String.valueOf(xs4Var.m75942xfb822ef2(8)));
                java.lang.String m75945x2fec83076 = xs4Var.m75945x2fec8307(16);
                if (m75945x2fec83076 == null) {
                    m75945x2fec83076 = "";
                }
                intent.putExtra("key_mv_album_cover_url", m75945x2fec83076);
                java.lang.String m75945x2fec83077 = xs4Var.m75945x2fec8307(9);
                if (m75945x2fec83077 == null) {
                    m75945x2fec83077 = "";
                }
                intent.putExtra("key_mv_identification", m75945x2fec83077);
                java.lang.String m75945x2fec83078 = xs4Var.m75945x2fec8307(6);
                if (m75945x2fec83078 == null) {
                    m75945x2fec83078 = "";
                }
                intent.putExtra("key_mv_extra_info", m75945x2fec83078);
                intent.putExtra("key_mv_music_duration", xs4Var.m75939xb282bd08(10));
                intent.putExtra("key_mv_music_operation_url", xs4Var.m75945x2fec8307(12));
                intent.putExtra("key_mv_song_mid", xs4Var.m75945x2fec8307(11));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Pk(activity, intent);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "jump to musicMvMainUI error " + str + ' ' + m76184x8010e5e4 + ' ' + c19792x256d2725.m76784x5db1b11() + ' ' + c19792x256d2725.m76803x6c285d75());
            }
        }

        @Override // ym5.l1
        public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f204390d, "[onOverStart] dy=" + i18);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f204397n;
            if (c22627xa933f8e4 != null) {
                c22627xa933f8e4.b(i18 / ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561217cj)));
                return false;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlProcessBar");
            throw null;
        }

        public final void b() {
            fc2.o Z6;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f204393g;
            this.f204398o = new rl5.r(context);
            android.view.View view = this.f204394h;
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.m6e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
            this.f204396m = c22801x87cbdc00;
            c22801x87cbdc00.m82696x5dd8f4d3(((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562029zi)) - ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu)));
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f204396m;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.m82702xfa5d1e8f(((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj)) - ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562029zi)));
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f204396m;
            if (c22801x87cbdc003 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc003.m82686x6e84640(1.85f);
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.m6l);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            this.f204397n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) findViewById2;
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = this.f204396m;
            if (c22801x87cbdc004 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            this.f204395i = c22801x87cbdc004.m82555x4905e9fa();
            android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.f567534ju1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            this.f204399p = (android.widget.TextView) findViewById3;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f204395i;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
            android.widget.TextView textView = this.f204399p;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshTip");
                throw null;
            }
            textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.f204392f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = msgPresenter.f204360h;
                    if (msgViewCallback != null) {
                        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14752x6c10ad9a(null, msgViewCallback, false, 0));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback2 = msgPresenter.f204360h;
                    if (msgViewCallback2 != null) {
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = msgViewCallback2.f204396m;
                        if (c22801x87cbdc005 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                            throw null;
                        }
                        c22801x87cbdc005.L(false);
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$2
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.f204392f.f204356d != 2) {
                        if (type == so2.c4.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                        }
                        if (type == so2.y3.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                        }
                        if (type == so2.o3.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                        }
                        if (type == so2.d4.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pq();
                        }
                        if (type == so2.r3.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                        }
                        if (type == so2.a4.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                        }
                        if (type == so2.w3.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                        }
                        if (type == so2.v3.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                        }
                        if (type == so2.b4.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.mq();
                        }
                        if (type == so2.s3.class.getName().hashCode()) {
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                        }
                        hc2.l.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.f204390d, type);
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                    }
                    if (type == so2.c4.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                    }
                    if (type == so2.y3.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                    }
                    if (type == so2.o3.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t(), null, null, 6, null);
                    }
                    if (type == so2.d4.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pq();
                    }
                    if (type == so2.r3.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                    }
                    if (type == so2.a4.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                    }
                    if (type == so2.w3.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                    }
                    if (type == so2.v3.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                    }
                    if (type == so2.b4.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.mq();
                    }
                    if (type == so2.t3.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.aq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                    }
                    if (type == so2.q3.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                    }
                    if (type == so2.x3.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.t());
                    }
                    hc2.l.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.f204390d, type);
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                }
            };
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter = this.f204392f;
            java.util.ArrayList arrayList = msgPresenter.f204361i;
            if (msgPresenter.f204356d == 1 && msgPresenter.f204357e == 1) {
                dm.pd pdVar = new dm.pd();
                pdVar.f66095xc8a07680 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
                pdVar.f66080xac3be4e = Integer.MAX_VALUE;
                arrayList.add(0, new so2.d4(pdVar));
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(sVar, arrayList, true);
            this.f204400q = c22848x6ddd90cf;
            c22848x6ddd90cf.F = new in5.y0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$4
                @Override // in5.y0
                public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.w0 data) {
                    java.lang.String m75945x2fec8307;
                    java.lang.String m75945x2fec83072;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
                    for (in5.x0 x0Var : data.f374689i) {
                        int h17 = x0Var.f374691a.h();
                        int hashCode = so2.d4.class.getName().hashCode();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this;
                        if (h17 == hashCode) {
                            m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
                            int i17 = I1 != null ? I1.f68721x6e5f342 : 0;
                            if (i17 > 0) {
                                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
                                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context2 = msgViewCallback.f204393g;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj(o3Var, "5", 4, 1, 5, 0, i17, null, null, 0L, nyVar != null ? nyVar.V6() : null, 0, 0, 3520, null);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "NotificitionCenterNotify", xy2.c.e(msgViewCallback.f204393g), false, false, 12, null);
                            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context3 = msgViewCallback.f204393g;
                            r45.f03 b07 = nk6.b0("NotificitionCenterNotify", xy2.c.e(context3));
                            if (S0 != null && b07 != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "5", S0, b07, 1, nyVar2 != null ? nyVar2.V6() : null, 0, null, 0, 0, 480, null);
                            }
                        }
                        in5.c cVar = x0Var.f374691a;
                        if (cVar.h() == so2.c4.class.getName().hashCode() && (cVar instanceof so2.c4)) {
                            dm.pd pdVar2 = ((so2.c4) cVar).f491944d;
                            if (pdVar2.f66107x7dac62e != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(pdVar2.f66107x7dac62e.m75939xb282bd08(2));
                                sb6.append(",1,");
                                sb6.append(pm0.v.u(pdVar2.f66095xc8a07680));
                                sb6.append(',');
                                sb6.append(xy2.c.e(msgViewCallback.f204393g));
                                sb6.append(',');
                                r45.rk2 rk2Var = pdVar2.f66107x7dac62e;
                                java.lang.String str = "";
                                sb6.append((rk2Var == null || (m75945x2fec83072 = rk2Var.m75945x2fec8307(6)) == null) ? "" : r26.i0.t(m75945x2fec83072, ",", ";", false));
                                sb6.append(',');
                                r45.rk2 rk2Var2 = pdVar2.f66107x7dac62e;
                                if (rk2Var2 != null && (m75945x2fec8307 = rk2Var2.m75945x2fec8307(9)) != null) {
                                    str = r26.i0.t(m75945x2fec8307, ",", ";", false);
                                }
                                sb6.append(str);
                                g0Var.mo68478xbd3cda5f(20849, sb6.toString());
                            }
                        }
                    }
                }
            };
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            if (nyVar != null && (Z6 = nyVar.Z6(-1)) != null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f204395i;
                if (c1163xf1deaba42 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                Z6.d(c1163xf1deaba42);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f204395i;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c1163xf1deaba43.mo7960x6cab2c8d(this.f204400q);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f204400q;
            if (c22848x6ddd90cf2 != null) {
                c22848x6ddd90cf2.f374638o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$5
                    @Override // in5.x
                    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view2, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
                        in5.s0 holder = (in5.s0) k3Var;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                        int a07 = i17 - ((in5.n0) adapter).a0();
                        if (a07 >= 0) {
                            final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this;
                            if (a07 < msgViewCallback.f204392f.f204361i.size()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter2 = msgViewCallback.f204392f;
                                java.lang.Object obj = msgPresenter2.f204361i.get(a07);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                                so2.i iVar = (so2.i) obj;
                                final dm.pd pdVar2 = iVar.f491944d;
                                int i18 = pdVar2.f66072xe412923f;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(msgViewCallback.f204390d, "onClick " + a07 + " id:" + pdVar2.f66095xc8a07680 + " commentId:" + pdVar2.f66076x418206d5);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.UICallbackListener uICallbackListener = msgViewCallback.f204402s;
                                if (uICallbackListener != null) {
                                    uICallbackListener.F(pdVar2);
                                }
                                int i19 = msgPresenter2.f204356d;
                                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context2 = msgViewCallback.f204393g;
                                if (i19 == 1 && msgPresenter2.f204357e == 1 && a07 == 0) {
                                    m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
                                    int i27 = I1 != null ? I1.f68721x6e5f342 : 0;
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ej(i27, 2L);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).xj(context2, null, 1);
                                    if (i27 > 0) {
                                        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.uj(o3Var, "5", 4, 2, 5, 0, i27, null, null, 0L, nyVar2 != null ? nyVar2.V6() : null, 0, 0, 3520, null);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "NotificitionCenterNotify", xy2.c.e(context2), false, false, 12, null);
                                    r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("NotificitionCenterNotify", xy2.c.e(context2));
                                    if (S0 == null || b07 == null) {
                                        return;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "5", S0, b07, 2, nyVar3 != null ? nyVar3.V6() : null, 0, null, 0, 0, 480, null);
                                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().y("NotificitionCenterNotify", xy2.c.e(context2));
                                    ((c61.l7) i95.n0.c(c61.l7.class)).nk().y("AuthorProfileNotify", xy2.c.e(context2));
                                    return;
                                }
                                int i28 = pdVar2.f66129x2262335f;
                                if (i28 == 1) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a.p(context2, pdVar2, i19, true);
                                    return;
                                }
                                android.content.Context context3 = holder.f374654e;
                                if (i28 == 10 || i28 == 11) {
                                    if (i28 != 11 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar2.f66131xdec927b)) {
                                        return;
                                    }
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.putExtra("finder_username", pdVar2.f66131xdec927b);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context3, intent, 0L, null, 0, 9, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context3, intent);
                                    return;
                                }
                                if (i28 == 17) {
                                    android.content.Intent intent2 = new android.content.Intent();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                                    i0Var.Ik(context3, intent2);
                                    return;
                                }
                                dm.pd pdVar3 = iVar.f491944d;
                                if (i28 == 2 && (pdVar2.f66082x26b1b2e8 & 16) > 0) {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Cj(pdVar2.f66129x2262335f, pdVar2.u0() ? 1 : 0, pdVar2.v0(), pdVar3.f66108x2327e25f);
                                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a.o(context2, pdVar2, msgPresenter2.f204356d)) {
                                        return;
                                    }
                                    db2.n4 n4Var = msgViewCallback.f204403t;
                                    if (n4Var != null) {
                                        n4Var.j();
                                    }
                                    db2.g4 g4Var = msgViewCallback.f204401r;
                                    if (g4Var != null) {
                                        g4Var.j();
                                    }
                                    long j17 = pdVar2.f66113xacc57927;
                                    java.lang.String str = "";
                                    java.lang.String field_refVideoObjectNonceId = pdVar2.f66114x64cc3cde;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_refVideoObjectNonceId, "field_refVideoObjectNonceId");
                                    int i29 = 0;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                    db2.n4 n4Var2 = new db2.n4(j17, str, field_refVideoObjectNonceId, i29, nyVar4 != null ? nyVar4.V6() : null, 8, null);
                                    msgViewCallback.f204403t = n4Var2;
                                    pq5.g l17 = n4Var2.l();
                                    l17.f(context2);
                                    l17.h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$checkMegaVideoDetail$1
                                        @Override // gm5.a
                                        /* renamed from: call */
                                        public java.lang.Object mo1059x2e7a5e(java.lang.Object obj2) {
                                            r45.wj4 wj4Var;
                                            r45.wj4 wj4Var2;
                                            com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj2;
                                            final dm.pd pdVar4 = pdVar2;
                                            final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this;
                                            if (fVar == null) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(msgViewCallback2.f204390d, "result == null id " + pdVar4.f66095xc8a07680 + " content " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(pdVar4.f66079xad49e234));
                                            } else if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                                                java.lang.String str2 = msgViewCallback2.f204390d;
                                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get mega video detail success, id = ");
                                                db2.n4 n4Var3 = msgViewCallback2.f204403t;
                                                sb6.append(n4Var3 != null ? java.lang.Long.valueOf(n4Var3.f309632t) : null);
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                                                r45.xf2 xf2Var = new r45.xf2();
                                                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
                                                xf2Var.set(0, (r45.oj4) ((r45.tj4) fVar2).m75936x14adae67(1));
                                                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = fVar.f152151d;
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MegaVideoDetailResponse");
                                                xf2Var.set(1, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.tj4) fVar3).m75936x14adae67(2));
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter3 = msgViewCallback2.f204392f;
                                                int i37 = msgPresenter3.f204356d == 1 ? 7 : 5;
                                                r45.oj4 oj4Var = (r45.oj4) xf2Var.m75936x14adae67(0);
                                                if (oj4Var != null && (wj4Var = (r45.wj4) oj4Var.m75936x14adae67(18)) != null) {
                                                    long m75942xfb822ef2 = wj4Var.m75942xfb822ef2(0);
                                                    r45.oj4 oj4Var2 = (r45.oj4) xf2Var.m75936x14adae67(0);
                                                    java.lang.String m75945x2fec8307 = (oj4Var2 == null || (wj4Var2 = (r45.wj4) oj4Var2.m75936x14adae67(18)) == null) ? null : wj4Var2.m75945x2fec8307(1);
                                                    int i38 = msgPresenter3.f204356d;
                                                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context4 = msgViewCallback2.f204393g;
                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
                                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                                    db2.g4 g4Var2 = new db2.g4(m75942xfb822ef2, m75945x2fec8307, i37, i38, "", true, null, null, 0L, null, false, false, null, nyVar5 != null ? nyVar5.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
                                                    msgViewCallback2.f204401r = g4Var2;
                                                    g4Var2.l().h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$checkMegaVideoDetail$1$1$1
                                                        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
                                                        
                                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r1 != null ? r1.m76197x6c03c64c() : null, xy2.c.e(r15)) != false) goto L26;
                                                         */
                                                        @Override // gm5.a
                                                        /* renamed from: call */
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                            To view partially-correct add '--show-bad-code' argument
                                                        */
                                                        public java.lang.Object mo1059x2e7a5e(java.lang.Object r21) {
                                                            /*
                                                                Method dump skipped, instructions count: 231
                                                                To view this dump add '--comments-level debug' option
                                                            */
                                                            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14738x4004cac9.mo1059x2e7a5e(java.lang.Object):java.lang.Object");
                                                        }
                                                    });
                                                }
                                            } else {
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.l(msgViewCallback2, fVar.f152149b);
                                            }
                                            return jz5.f0.f384359a;
                                        }
                                    });
                                    return;
                                }
                                if (i28 != 4) {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Cj(pdVar2.f66129x2262335f, pdVar2.u0() ? 1 : 0, pdVar2.v0(), pdVar3.f66108x2327e25f);
                                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a.o(context2, pdVar2, msgPresenter2.f204356d)) {
                                        return;
                                    }
                                    db2.g4 g4Var2 = msgViewCallback.f204401r;
                                    if (g4Var2 != null) {
                                        g4Var2.j();
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.o(msgViewCallback, pdVar2);
                                    return;
                                }
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Cj(pdVar2.f66129x2262335f, pdVar2.u0() ? 1 : 0, pdVar2.v0(), pdVar3.f66108x2327e25f);
                                r45.rk2 rk2Var = pdVar2.f66107x7dac62e;
                                if (rk2Var != null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(pdVar2.f66107x7dac62e.m75939xb282bd08(2));
                                    sb6.append(",2,");
                                    sb6.append(pm0.v.u(pdVar2.f66095xc8a07680));
                                    sb6.append(',');
                                    sb6.append(xy2.c.e(context2));
                                    sb6.append(',');
                                    java.lang.String m75945x2fec8307 = rk2Var.m75945x2fec8307(6);
                                    sb6.append(m75945x2fec8307 != null ? r26.i0.t(m75945x2fec8307, ",", ";", false) : "");
                                    sb6.append(',');
                                    java.lang.String m75945x2fec83072 = rk2Var.m75945x2fec8307(9);
                                    sb6.append(m75945x2fec83072 != null ? r26.i0.t(m75945x2fec83072, ",", ";", false) : "");
                                    g0Var.mo68478xbd3cda5f(20849, sb6.toString());
                                    int m75939xb282bd08 = rk2Var.m75939xb282bd08(2);
                                    if (m75939xb282bd08 == 1) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
                                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = msgViewCallback.f204393g;
                                        java.lang.String m75945x2fec83073 = rk2Var.m75945x2fec8307(4);
                                        java.lang.String m75945x2fec83074 = rk2Var.m75945x2fec8307(3);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                                        c12559xbdae8559.f169323f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.u0.f34063x366c91de;
                                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).aj(abstractActivityC21394xb3d2c0cf, m75945x2fec83073, "", 0, 0, m75945x2fec83074, c12559xbdae8559);
                                        return;
                                    }
                                    if (m75939xb282bd08 == 2) {
                                        android.content.Intent intent3 = new android.content.Intent();
                                        intent3.putExtra("rawUrl", rk2Var.m75945x2fec8307(3));
                                        j45.l.j(context2, "webview", ".ui.tools.WebViewUI", intent3, null);
                                        return;
                                    }
                                    if (m75939xb282bd08 == 3 || m75939xb282bd08 == 4) {
                                        db2.g4 g4Var3 = msgViewCallback.f204401r;
                                        if (g4Var3 != null) {
                                            g4Var3.j();
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.o(msgViewCallback, pdVar2);
                                        return;
                                    }
                                    if (m75939xb282bd08 != 6) {
                                        if (m75939xb282bd08 != 8) {
                                            return;
                                        }
                                        db2.g4 g4Var4 = msgViewCallback.f204401r;
                                        if (g4Var4 != null) {
                                            g4Var4.j();
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.o(msgViewCallback, pdVar2);
                                        return;
                                    }
                                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) rk2Var.m75936x14adae67(7);
                                    if (c19786x6a1e2862 != null) {
                                        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                                        xc2.y2 y2Var = xc2.y2.f534876a;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                                        xc2.y2.i(y2Var, context3, p0Var, 6, null, 8, null);
                                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Yk(context3, p0Var, pdVar2.f66095xc8a07680, true);
                                    }
                                }
                            }
                        }
                    }
                };
            }
            if (c22848x6ddd90cf2 != null) {
                c22848x6ddd90cf2.f374637n = new in5.y() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$6
                    @Override // in5.y
                    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, final android.view.View view2, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
                        in5.s0 holder = (in5.s0) k3Var;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                        final int a07 = i17 - ((in5.n0) adapter).a0();
                        if (a07 < 0) {
                            return true;
                        }
                        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this;
                        if (a07 >= msgViewCallback.f204392f.f204361i.size()) {
                            return true;
                        }
                        java.lang.Object obj = msgViewCallback.f204392f.f204361i.get(a07);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClick ");
                        sb6.append(a07);
                        sb6.append(" id:");
                        final dm.pd pdVar2 = ((so2.i) obj).f491944d;
                        sb6.append(pdVar2.f66095xc8a07680);
                        sb6.append(" commentId:");
                        sb6.append(pdVar2.f66076x418206d5);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(msgViewCallback.f204390d, sb6.toString());
                        rl5.r rVar = msgViewCallback.f204398o;
                        if (rVar == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
                            throw null;
                        }
                        rVar.a();
                        rl5.r rVar2 = msgViewCallback.f204398o;
                        if (rVar2 != null) {
                            rVar2.h(view2, new android.view.View.OnCreateContextMenuListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$1
                                @Override // android.view.View.OnCreateContextMenuListener
                                public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view3, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                                    contextMenu.add(0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.f204391e, 0, view2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ev_));
                                }
                            }, new db5.t4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2

                                @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr45/e11;", "it", "Ljz5/f0;", "invoke", "(Lr45/e11;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2$1, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f204428d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback f204429e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f204430f;

                                    /* renamed from: g, reason: collision with root package name */
                                    public final /* synthetic */ int f204431g;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass1(az2.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback, dm.pd pdVar, int i17) {
                                        super(1);
                                        this.f204428d = fVar;
                                        this.f204429e = msgViewCallback;
                                        this.f204430f = pdVar;
                                        this.f204431g = i17;
                                    }

                                    @Override // yz5.l
                                    /* renamed from: invoke */
                                    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                                        r45.e11 it = (r45.e11) obj;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
                                        this.f204428d.b();
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = this.f204429e;
                                        java.lang.String str = msgViewCallback.f204390d;
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mentionId: ");
                                        dm.pd pdVar = this.f204430f;
                                        sb6.append(pdVar.f66095xc8a07680);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                                        cu2.a0 a0Var = cu2.b0.f303904a;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter = msgViewCallback.f204392f;
                                        a0Var.a(pdVar, msgPresenter.f204356d);
                                        java.util.ArrayList arrayList = msgPresenter.f204361i;
                                        int i17 = this.f204431g;
                                        arrayList.remove(i17);
                                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = msgViewCallback.f204400q;
                                        if (c22848x6ddd90cf != null) {
                                            c22848x6ddd90cf.m8155x27702c4(i17);
                                        }
                                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = msgViewCallback.f204393g;
                                        db5.t7.m123883x26a183b(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.erj), 0).show();
                                        return jz5.f0.f384359a;
                                    }
                                }

                                @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/tencent/mm/modelbase/f;", "Lr45/e11;", "it", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/modelbase/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2$2, reason: invalid class name */
                                /* loaded from: classes10.dex */
                                final class AnonymousClass2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f204432d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback f204433e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ dm.pd f204434f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass2(az2.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback, dm.pd pdVar) {
                                        super(1);
                                        this.f204432d = fVar;
                                        this.f204433e = msgViewCallback;
                                        this.f204434f = pdVar;
                                    }

                                    @Override // yz5.l
                                    /* renamed from: invoke */
                                    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                                        this.f204432d.b();
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = this.f204433e;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(msgViewCallback.f204390d, "del mention network error!: " + this.f204434f.f66095xc8a07680);
                                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = msgViewCallback.f204393g;
                                        db5.t7.m123883x26a183b(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eri), 0).show();
                                        return jz5.f0.f384359a;
                                    }
                                }

                                @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                                /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$onLongClick$2$3, reason: invalid class name */
                                /* loaded from: classes5.dex */
                                final class AnonymousClass3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ az2.f f204435d;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public AnonymousClass3(az2.f fVar) {
                                        super(0);
                                        this.f204435d = fVar;
                                    }

                                    @Override // yz5.a
                                    /* renamed from: invoke */
                                    public java.lang.Object mo152xb9724478() {
                                        this.f204435d.b();
                                        return jz5.f0.f384359a;
                                    }
                                }

                                @Override // db5.t4
                                /* renamed from: onMMMenuItemSelected */
                                public final void mo888x34063ac(android.view.MenuItem menuItem, int i18) {
                                    int itemId = menuItem.getItemId();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this;
                                    if (itemId == msgViewCallback2.f204391e) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                                        dm.pd pdVar3 = pdVar2;
                                        o3Var.rj(0, 1, pdVar3.f66129x2262335f);
                                        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bq.p0.e(bq.q0.f105046t, 2, 0, xy2.c.e(msgViewCallback2.f204393g), false, 8, null));
                                        az2.c cVar = az2.f.f97658d;
                                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = msgViewCallback2.f204393g;
                                        az2.f a17 = az2.c.a(cVar, abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 200L, null, 8, null);
                                        a17.a();
                                        i95.m c17 = i95.n0.c(cq.k.class);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                        cq.j1.e((cq.k) c17, "", pdVar3.f66095xc8a07680, null, pdVar3.f66108x2327e25f, pdVar3.f66076x418206d5, b17, pdVar3.f66129x2262335f, pdVar3.f66124x65f321b, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14751xb1e5c2eb.AnonymousClass1(a17, msgViewCallback2, pdVar3, a07), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14751xb1e5c2eb.AnonymousClass2(a17, msgViewCallback2, pdVar3), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14751xb1e5c2eb.AnonymousClass3(a17));
                                    }
                                }
                            }, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
                            return true;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
                        throw null;
                    }
                };
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = this.f204396m;
            if (c22801x87cbdc005 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc005.m82562xefb63abb(this);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc006 = this.f204396m;
            if (c22801x87cbdc006 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc006.m82683xb165a19d(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$7
                @Override // ym5.q3
                public void b(int i17) {
                    boolean b17 = bq.q0.f105046t.b();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this;
                    if (b17) {
                        msgViewCallback.f204392f.c();
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter2 = msgViewCallback.f204392f;
                    long j17 = ((so2.i) kz5.n0.i0(msgPresenter2.f204361i)).f491944d.f66095xc8a07680;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a.getClass();
                    msgPresenter2.f(j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204355c, true, false);
                }

                @Override // ym5.q3
                public void c(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                }

                @Override // ym5.q3
                public void d(int i17, rn5.a aVar, boolean z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this;
                    msgViewCallback.f204392f.c();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = msgViewCallback.f204395i;
                    if (c1163xf1deaba44 != null) {
                        c1163xf1deaba44.m7964x8d4ad49c(new uw2.n0());
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                        throw null;
                    }
                }

                @Override // ym5.q3
                public void e(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this;
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc007 = msgViewCallback.f204396m;
                    if (c22801x87cbdc007 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.u(c22801x87cbdc007, null, 1, null);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = msgViewCallback.f204395i;
                    if (c1163xf1deaba44 != null) {
                        c1163xf1deaba44.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$7$onRefreshEnd$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback.this.f204395i;
                                if (c1163xf1deaba45 != null) {
                                    c1163xf1deaba45.m7964x8d4ad49c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.z());
                                } else {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                                    throw null;
                                }
                            }
                        }, 1000L);
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                        throw null;
                    }
                }
            });
            if (!bq.q0.f105046t.b()) {
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14748x24806cd9(this));
            }
            pm0.v.V(300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14749x24806cda(this));
        }

        @Override // ym5.l1
        public void g(int i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f204390d, "[onOverStop]");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f204397n;
            if (c22627xa933f8e4 != null) {
                c22627xa933f8e4.d();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlProcessBar");
                throw null;
            }
        }

        @Override // fs2.c
        /* renamed from: getActivity */
        public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
            return this.f204393g;
        }

        @Override // ym5.l1
        public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f204390d, "[onOverEnd] dy=" + i18);
            return false;
        }

        public final void s(java.util.List msgList, boolean z17, boolean z18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            f0Var.f391649d = this.f204392f.f204361i.size();
            long j17 = 0;
            if (z17) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a.getClass();
                long j18 = uptimeMillis - com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204354b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                if (j18 < ((java.lang.Number) t70Var.F2().r()).longValue()) {
                    j17 = ((java.lang.Number) t70Var.F2().r()).longValue() - j18;
                }
            }
            pm0.v.V(j17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14739xaf38b1cb(this, msgList, z18, f0Var));
        }

        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp t() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter = this.f204392f;
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp(msgPresenter.f204356d, msgPresenter.f204357e);
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[kv2.i.m144458xcee59d22().length];
            try {
                iArr[0] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                kv2.i iVar = kv2.i.f394198d;
                iArr[1] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                kv2.i iVar2 = kv2.i.f394198d;
                iArr[2] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                kv2.i iVar3 = kv2.i.f394198d;
                iArr[3] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                kv2.i iVar4 = kv2.i.f394198d;
                iArr[4] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    private C14727x5e078d() {
    }

    public static /* synthetic */ java.lang.String e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34, int i17, so2.e0 e0Var, int i18, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, r45.k60 k60Var, org.json.JSONObject jSONObject, java.lang.Boolean bool, int i19, java.lang.Object obj) {
        return c14727x5e078d.d(c15270x6d877a34, i17, e0Var, i18, interfaceC4987x84e327cb, k60Var, (i19 & 64) != 0 ? null : jSONObject, (i19 & 128) != 0 ? null : bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c4, code lost:
    
        if (r7 != null) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x014a, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0146, code lost:
    
        if (pm0.v.z(r27.f66082x26b1b2e8, 128) != false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x009e, code lost:
    
        if (r9 != 33) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0120, code lost:
    
        if (pm0.v.z(r27.f66082x26b1b2e8, 128) != false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0148, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028a A[LOOP:0: B:135:0x0284->B:137:0x028a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f8  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r7v6, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d r22, android.content.Context r23, int r24, boolean r25, java.lang.String r26, dm.pd r27, boolean r28, boolean r29, boolean r30, boolean r31, int r32, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.l(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract, android.content.Context, int, boolean, java.lang.String, dm.pd, boolean, boolean, boolean, boolean, int, java.lang.Object):java.lang.String");
    }

    public static void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d, final android.view.View redPacketBanner, final r45.tl6 tl6Var, java.lang.String viewId, java.lang.String str, java.lang.Integer num, yz5.a aVar, int i17, java.lang.Object obj) {
        final java.lang.String str2 = (i17 & 8) != 0 ? null : str;
        final java.lang.Integer num2 = (i17 & 16) != 0 ? null : num;
        final yz5.a aVar2 = (i17 & 32) != 0 ? null : aVar;
        c14727x5e078d.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redPacketBanner, "redPacketBanner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        if (tl6Var == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(redPacketBanner, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(redPacketBanner, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.String m75945x2fec8307 = tl6Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        android.widget.TextView textView = (android.widget.TextView) redPacketBanner.findViewById(com.p314xaae8f345.mm.R.id.tua);
        textView.setText(((ht2.y0) ((zy2.s6) i95.n0.c(zy2.s6.class))).mj(m75945x2fec8307, (int) textView.getTextSize(), false));
        int m75939xb282bd08 = tl6Var.m75939xb282bd08(0);
        if (m75939xb282bd08 == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(redPacketBanner, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(redPacketBanner, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (m75939xb282bd08 == 1) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(redPacketBanner, arrayList3.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(redPacketBanner, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$refreshRedPackBanner$1$1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(view);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$refreshRedPackBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    xc2.y2 y2Var = xc2.y2.f534876a;
                    android.content.Context context = view.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                    c19786x6a1e2862.m76541x751b57e5((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198) tl6Var.m75936x14adae67(3));
                    y2Var.I(context, new xc2.p0(c19786x6a1e2862), null);
                    yz5.a aVar3 = yz5.a.this;
                    if (aVar3 != null) {
                        aVar3.mo152xb9724478();
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$refreshRedPackBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        } else if (m75939xb282bd08 == 2 || m75939xb282bd08 == 3) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(redPacketBanner, arrayList4.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(redPacketBanner, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract", "refreshRedPackBanner", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/ThankRedPackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            redPacketBanner.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$refreshRedPackBanner$1$2
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(view);
                    java.lang.Object[] array = arrayList5.toArray();
                    arrayList5.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$refreshRedPackBanner$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    xc2.y2 y2Var = xc2.y2.f534876a;
                    android.content.Context context = view.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                    c19786x6a1e2862.m76552x7d3cf1b2((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8) tl6Var.m75936x14adae67(2));
                    xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                    p0Var.f534784m = new l81.b1();
                    xc2.y2.P(y2Var, context, p0Var, 0, false, null, 0.0f, 60, null);
                    yz5.a aVar3 = yz5.a.this;
                    if (aVar3 != null) {
                        aVar3.mo152xb9724478();
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$refreshRedPackBanner$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.pk(redPacketBanner, viewId);
        aVar3.ik(redPacketBanner, 8, 29309);
        aVar3.Ai(redPacketBanner, new ly1.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$refreshRedPackBanner$1$3$1
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str3) {
                android.content.Context context = redPacketBanner.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                jz5.l[] lVarArr = new jz5.l[6];
                lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
                lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
                lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
                r45.tl6 tl6Var2 = tl6Var;
                lVarArr[3] = new jz5.l("red_envelope_banner_type", tl6Var2 != null ? java.lang.Integer.valueOf(tl6Var2.m75939xb282bd08(0)) : null);
                lVarArr[4] = new jz5.l("feed_id", str2);
                lVarArr[5] = new jz5.l("like_panel", num2);
                return kz5.c1.k(lVarArr);
            }
        });
        aVar3.Tj(redPacketBanner, 40, 1, false);
    }

    public final void a(android.content.Context context, int i17) {
        r45.dt5 dt5Var;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MENTION_LIST_INTERACTION_JUMP_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        if (v17.length() > 0) {
            r45.et5 et5Var = new r45.et5();
            try {
                et5Var.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(v17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            java.util.LinkedList m75941xfb821914 = et5Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getReward_tips_infos(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r45.dt5) obj).m75941xfb821914(0).contains(java.lang.Integer.valueOf(i17))) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.dt5 dt5Var2 = (r45.dt5) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgContract", "trigger_type: " + i17 + ", listSize: " + et5Var.m75941xfb821914(0).size());
            java.util.LinkedList m75941xfb8219142 = et5Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getReward_tips_infos(...)");
            int i18 = 0;
            for (java.lang.Object obj2 : m75941xfb8219142) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.dt5 dt5Var3 = (r45.dt5) obj2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgContract", "read RewardTipsInfo, index: " + i18 + ", triggerType: " + dt5Var3.m75941xfb821914(0) + ", jumpType: " + dt5Var3.m75939xb282bd08(1) + ", showType: " + dt5Var3.m75939xb282bd08(2) + ", link: " + dt5Var3.m75945x2fec8307(3) + ", expireTime: " + dt5Var3.m75942xfb822ef2(4));
                i18 = i19;
            }
            et5Var.m75941xfb821914(0).remove(dt5Var2);
            try {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MENTION_LIST_INTERACTION_JUMP_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(et5Var.mo14344x5f01b1f6()));
            } catch (java.lang.Exception unused) {
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFinderMentionListInteractionInfo, url: ");
            sb6.append(dt5Var2 != null ? dt5Var2.m75945x2fec8307(3) : null);
            sb6.append(", showType: ");
            sb6.append(dt5Var2 != null ? java.lang.Integer.valueOf(dt5Var2.m75939xb282bd08(2)) : null);
            sb6.append(", jumpType: ");
            sb6.append(dt5Var2 != null ? java.lang.Integer.valueOf(dt5Var2.m75939xb282bd08(1)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgContract", sb6.toString());
            dt5Var = dt5Var2;
        } else {
            dt5Var = null;
        }
        if (dt5Var == null) {
            return;
        }
        if (dt5Var.m75942xfb822ef2(4) < c01.id.e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgContract", "info invaild");
            return;
        }
        if (dt5Var.m75939xb282bd08(1) == 1) {
            if (dt5Var.m75939xb282bd08(2) == 1) {
                java.lang.String m75945x2fec8307 = dt5Var.m75945x2fec8307(3);
                n(context, m75945x2fec8307 != null ? m75945x2fec8307 : "", true);
            } else {
                java.lang.String m75945x2fec83072 = dt5Var.m75945x2fec8307(3);
                n(context, m75945x2fec83072 != null ? m75945x2fec83072 : "", false);
            }
        }
    }

    public final void b(final in5.s0 holder, long j17, long j18, int i17, r45.e60 e60Var, boolean z17) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.g60 g60Var = (e60Var == null || (m75941xfb821914 = e60Var.m75941xfb821914(0)) == null) ? null : (r45.g60) kz5.n0.Z(m75941xfb821914);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.swc);
        if (viewGroup == null) {
            return;
        }
        if (z17 || i17 != 1 || g60Var == null) {
            viewGroup.setVisibility(8);
            return;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665) holder.p(com.p314xaae8f345.mm.R.id.sw_);
        c15276x168ec665.m62015x86c391e1(holder.f374654e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn));
        c15276x168ec665.m62016x93dd6bcf(c15276x168ec665.getEmojiMaxSize() / 2);
        final p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6 n6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class);
        java.lang.String m75945x2fec8307 = g60Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        h0Var.f391656d = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) n6Var).Bi(m75945x2fec8307, g60Var.m75934xbce7f2f(5));
        viewGroup.setVisibility(0);
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.f0().r()).booleanValue()) {
            java.lang.String mo42933xb5885648 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).mo42933xb5885648();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
            if (!r26.i0.y(mo42933xb5885648, "failedTest", false)) {
                h0Var.f391656d = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class))).Bi("failedTest:" + ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).mo42933xb5885648(), null);
            }
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb m43708x63ed375e = c15276x168ec665.m43708x63ed375e();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m43708x63ed375e != null ? m43708x63ed375e.mo42933xb5885648() : null, ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d).mo42933xb5885648())) {
            c15276x168ec665.m43712xc040f7d2((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d);
            c15276x168ec665.requestLayout();
        }
        final android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.swd);
        final android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ddp);
        final android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.t7i);
        final android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.t7j);
        c15276x168ec665.m62014x7619e5de(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14753xdfffeb0(j18, j17, i17, h0Var));
        c15276x168ec665.m43715x36e51bc8(new sr.b() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentEmoji$2
            @Override // sr.b
            public void a(int i18) {
                boolean E0 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) p3321xbce91901.jvm.p3324x21ffc6bd.h0.this.f391656d).E0();
                android.view.ViewGroup viewGroup3 = viewGroup2;
                if (E0 || i18 == 1) {
                    viewGroup3.setVisibility(8);
                    return;
                }
                if (i18 == 0) {
                    viewGroup3.setVisibility(0);
                    android.view.View view = p17;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = p18;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = p19;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                if (i18 == -1) {
                    viewGroup3.setVisibility(0);
                    android.view.View view4 = p17;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view5 = p18;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view6 = p19;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        });
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Pc).mo141623x754a37bb()).r()).booleanValue()) {
            c15276x168ec665.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentEmoji$3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = p3321xbce91901.jvm.p3324x21ffc6bd.h0.this;
                    java.lang.String mo42933xb58856482 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var2.f391656d).mo42933xb5885648();
                    if (mo42933xb58856482 == null) {
                        mo42933xb58856482 = "";
                    }
                    objArr[0] = mo42933xb58856482;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec6652 = c15276x168ec665;
                    objArr[1] = java.lang.Integer.valueOf(c15276x168ec6652.getStatus());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgContract", "emoji longClick: %s status:%d", objArr);
                    if (c15276x168ec6652.getStatus() == -1) {
                        c15276x168ec6652.getDelegate().mo165059xc84a8199();
                    } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var2.f391656d).mo42933xb5885648())) {
                        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5 v5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class);
                        java.lang.String mo42933xb58856483 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var2.f391656d).mo42933xb5885648();
                        if (mo42933xb58856483 == null) {
                            mo42933xb58856483 = "";
                        }
                        if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) v5Var).Bi(mo42933xb58856483) == null) {
                            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6 n6Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class);
                            java.lang.String mo42933xb58856484 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var2.f391656d).mo42933xb5885648();
                            if (mo42933xb58856484 == null) {
                                mo42933xb58856484 = "";
                            }
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) n6Var2).wi(mo42933xb58856484, (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var2.f391656d);
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Vi((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var2.f391656d);
                        }
                        java.lang.String mo42933xb58856485 = ((com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var2.f391656d).mo42933xb5885648();
                        qk.u uVar = new qk.u(mo42933xb58856485 != null ? mo42933xb58856485 : "", (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var2.f391656d);
                        uVar.f445688a = 41;
                        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
                        if (p6Var != null) {
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(holder.f374654e, uVar);
                        }
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentEmoji$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
    }

    public final void c(final in5.s0 holder, final long j17, final long j18, final int i17, r45.e60 e60Var, boolean z17) {
        java.lang.String str;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.swi);
        final r45.j60 j60Var = (e60Var == null || (m75941xfb821914 = e60Var.m75941xfb821914(1)) == null) ? null : (r45.j60) kz5.n0.Z(m75941xfb821914);
        if (z17 || i17 != 2 || j60Var == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        final android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.c7_);
        int dimensionPixelSize = holder.f374654e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        int min = java.lang.Math.min(j60Var.m75939xb282bd08(2), j60Var.m75939xb282bd08(3));
        float max = min == 0 ? 1.0f : java.lang.Math.max(j60Var.m75939xb282bd08(2), j60Var.m75939xb282bd08(3)) / min;
        if (max > 1.3333334f) {
            max = 1.3333334f;
        }
        if (j60Var.m75939xb282bd08(3) > j60Var.m75939xb282bd08(2)) {
            viewGroup.getLayoutParams().width = dimensionPixelSize;
            viewGroup.getLayoutParams().height = (int) (dimensionPixelSize * max);
        } else {
            viewGroup.getLayoutParams().width = (int) (dimensionPixelSize * max);
            viewGroup.getLayoutParams().height = dimensionPixelSize;
        }
        final p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        final p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        g0Var.f391654d = 1L;
        java.lang.String m75945x2fec8307 = j60Var.m75945x2fec8307(7);
        str = "";
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            h0Var.f391656d = j60Var.m75945x2fec8307(0);
            java.lang.String m75945x2fec83072 = j60Var.m75945x2fec8307(1);
            str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
            g0Var.f391654d = 0L;
        } else {
            h0Var.f391656d = j60Var.m75945x2fec8307(7);
            java.lang.String m75945x2fec83073 = j60Var.m75945x2fec8307(8);
            if (m75945x2fec83073 != null) {
                str = m75945x2fec83073;
            }
        }
        final java.lang.String str2 = str;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.f0().r()).booleanValue()) {
            h0Var.f391656d = "failedTest:" + ((java.lang.String) h0Var.f391656d);
        }
        final android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.swj);
        final android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.u3z);
        final android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.u3l);
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        wo0.c a17 = d1Var.a(ya2.l.f542035a.e(((java.lang.String) h0Var.f391656d) + str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        ep0.e eVar = new ep0.e() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$1
            @Override // ep0.e
            public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imageLoader: result:");
                sb6.append(bitmap != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgContract", sb6.toString());
                boolean z18 = bitmap != null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14760xecd808d1(z18, viewGroup2, p18, p17));
            }
        };
        a17.getClass();
        a17.f529406d = eVar;
        a17.f529412j = new ep0.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$2
            @Override // ep0.a
            public final void a(boolean z18, java.lang.Object[] objArr) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgContract", "imageLoader: download:" + z18);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6478x668bc50a c6478x668bc50a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6478x668bc50a();
                c6478x668bc50a.q(pm0.v.u(j18));
                c6478x668bc50a.p(pm0.v.u(j17));
                c6478x668bc50a.f138219f = i17;
                c6478x668bc50a.f138220g = !z18 ? 1L : 0L;
                c6478x668bc50a.f138221h = java.lang.System.currentTimeMillis() - currentTimeMillis;
                c6478x668bc50a.f138222i = c6478x668bc50a.b("Url", (java.lang.String) h0Var.f391656d, true);
                c6478x668bc50a.f138225l = c6478x668bc50a.b("Token", str2, true);
                c6478x668bc50a.f138223j = g0Var.f391654d;
                c6478x668bc50a.k();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2091L, z18 ? 2L : 3L, 1L, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14760xecd808d1(z18, viewGroup2, p18, p17));
            }
        };
        a17.f529411i = new ep0.b(viewGroup2, p18, p17) { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$3

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ android.view.View f204465a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ android.view.View f204466b;

            {
                this.f204465a = p18;
                this.f204466b = p17;
            }
        };
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.b(imageView, true);
        viewGroup.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$convertCommentImage$4
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                android.content.Intent intent = new android.content.Intent();
                r45.j60 j60Var2 = r45.j60.this;
                java.lang.String m75945x2fec83074 = j60Var2.m75945x2fec8307(0);
                java.lang.String m75945x2fec83075 = j60Var2.m75945x2fec8307(1);
                if (m75945x2fec83075 == null) {
                    m75945x2fec83075 = "";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(j60Var2.m75945x2fec8307(7));
                java.lang.String m75945x2fec83076 = j60Var2.m75945x2fec8307(8);
                sb6.append(m75945x2fec83076 != null ? m75945x2fec83076 : "");
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Wc).mo141623x754a37bb()).r()).booleanValue()) {
                    m75945x2fec83074 = android.net.Uri.parse(j60Var2.m75945x2fec8307(0)).buildUpon().clearQuery().toString() + "-failedTest";
                }
                intent.putExtra("nowUrl", m75945x2fec83074 + m75945x2fec83075);
                intent.putExtra("thumbUrl", sb7);
                intent.putExtra("urlList", new java.lang.String[]{m75945x2fec83074 + m75945x2fec83075});
                intent.putExtra("ShowIndicator", false);
                intent.putExtra("BottomSheetStyle", 0);
                intent.putExtra("FinderScene", 1);
                intent.putExtra("FinderCommentId", j17);
                intent.putExtra("FinderFeedId", j18);
                intent.putExtra("FinderRawUrl", m75945x2fec83074);
                intent.putExtra("FinderUrlToken", m75945x2fec83075);
                in5.s0 s0Var = holder;
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                intent.putExtra("key_ref_comment_scene", V6 != null ? V6.m75939xb282bd08(5) : 0);
                intent.putExtra("key_click_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
                intent.putExtra("key_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
                android.graphics.Rect rect = new android.graphics.Rect();
                imageView.getGlobalVisibleRect(rect);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgContract", "doPreviewImg left %d, top %d, w %d, h %d", java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()));
                intent.putExtra("img_gallery_width", rect.width()).putExtra("img_gallery_height", rect.height()).putExtra("img_gallery_left", rect.left).putExtra("img_gallery_top", rect.top);
                int width = rect.width();
                android.content.Context context2 = s0Var.f374654e;
                if (width > 0 && rect.height() > 0 && rect.height() < i65.a.k(context2)) {
                    intent.putExtra("shouldRunDragAnimation", true);
                }
                j45.l.j(context2, "subapp", ".ui.gallery.GestureGalleryUI", intent, null);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$convertCommentImage$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34, int i17, so2.e0 e0Var, int i18, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, r45.k60 k60Var, org.json.JSONObject jSONObject, java.lang.Boolean bool) {
        java.lang.String str;
        int i19;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1665x5c28046.C15399x9819e226 m61881x9abd1e2e;
        str = "0";
        if (c15270x6d877a34 != null && (m61881x9abd1e2e = c15270x6d877a34.m61881x9abd1e2e()) != null) {
            str = (m61881x9abd1e2e.getPickEmojiStr().length() > 0) == true ? m61881x9abd1e2e.getPickEmojiStr() : "0";
            m61881x9abd1e2e.m62677xc0eb58ce("");
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("CandidateEmoji", str);
        jSONObject2.put("comment_source", c15270x6d877a34 != null ? c15270x6d877a34.getCommentSource() : 1);
        jSONObject2.put("Entertype", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).tk(i17));
        if (e0Var != null) {
            jSONObject2.put("click_choose_finder_cnt", e0Var.f491854a);
            jSONObject2.put("input_finder_cnt", e0Var.f491855b);
            jSONObject2.put("remind_finder_list", e0Var.f491856c);
        }
        if (i18 == 2) {
            jSONObject2.put("you_might_want_to_send_picture", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) ? 1 : 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = f204353a;
        c14727x5e078d.getClass();
        if (k60Var == null || (m75941xfb821914 = k60Var.m75941xfb821914(0)) == null) {
            i19 = 0;
        } else {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.h60) obj).m75945x2fec8307(0), c01.z1.r())) {
                    break;
                }
            }
            i19 = obj == null ? m75941xfb821914.size() : m75941xfb821914.size() - 1;
        }
        jSONObject2.put("friend_recommend_cnt", i19);
        c14727x5e078d.getClass();
        jSONObject2.put("ContentType", i18);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (interfaceC4987x84e327cb != null) {
            jSONObject3.put("pid", interfaceC4987x84e327cb.mo42930x4f4a97c4());
            jSONObject3.put("emoticon_designerid", interfaceC4987x84e327cb.X0());
            jSONObject3.put("emoticon_activityid", interfaceC4987x84e327cb.S0());
        }
        jSONObject2.put("big_sticker_info", jSONObject3);
        java.lang.Object mo42933xb5885648 = interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null;
        jSONObject2.put("EmoticonMd5", mo42933xb5885648 != null ? mo42933xb5885648 : "");
        c14727x5e078d.getClass();
        if (jSONObject != null) {
            try {
                jSONObject2.put("posterinfo", jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMsgContract", e17.getMessage());
            }
        }
        java.lang.String jSONObject4 = jSONObject2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        return r26.i0.t(jSONObject4, ",", ";", false);
    }

    public final void f(final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, final dm.pd mention, final int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        final int i18 = i17 == 1 ? 7 : 5;
        long j17 = mention.f66108x2327e25f;
        java.lang.String str = mention.f66109x2812d6a6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        pq5.g l17 = new db2.g4(j17, str, i18, i17, "", true, null, null, 0L, null, false, false, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null).l();
        l17.f(context);
        l17.h(new gm5.a() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$getCommentDetail$1
            /* JADX WARN: Removed duplicated region for block: B:49:0x019b  */
            @Override // gm5.a
            /* renamed from: call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object mo1059x2e7a5e(java.lang.Object r37) {
                /*
                    Method dump skipped, instructions count: 481
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14762x32960c5e.mo1059x2e7a5e(java.lang.Object):java.lang.Object");
            }
        });
    }

    public final int g(dm.pd mention) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        return m(mention.f66078xad49d1db) ? 1 : 2;
    }

    public final int h(android.content.Context context, int i17) {
        if (i17 == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fp.class)).X6();
            }
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar2 = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return ((vy2.e) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(vy2.e.class)).X6();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final org.json.JSONObject i(int i17, r45.e60 e60Var) {
        java.util.LinkedList m75941xfb821914;
        r45.j60 j60Var;
        java.lang.String m75945x2fec8307;
        if (i17 == 2 && e60Var != null && (m75941xfb821914 = e60Var.m75941xfb821914(1)) != null && (j60Var = (r45.j60) kz5.n0.Z(m75941xfb821914)) != null && (m75945x2fec8307 = j60Var.m75945x2fec8307(0)) != null) {
            try {
                java.lang.String m7340x351be6 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(m75945x2fec8307).m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3310x158f2670);
                if (m7340x351be6 != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(m7340x351be6);
                    if (jSONObject.has("poster_type")) {
                        if (jSONObject.has("poster_num")) {
                            return jSONObject;
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMsgContract", e17.getMessage());
            }
        }
        return null;
    }

    public final java.lang.String j(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("comment_source", i17);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    public final r45.qt2 k(android.content.Context context, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar == null) {
            return null;
        }
        r45.qt2 V6 = nyVar.V6();
        V6.set(5, java.lang.Integer.valueOf(i17));
        return V6;
    }

    public final boolean m(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa) {
        java.lang.String m76197x6c03c64c;
        return (c19782x23db1cfa == null || (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) == null || !r26.i0.n(m76197x6c03c64c, "@finder", false)) ? false : true;
    }

    public final void n(android.content.Context context, java.lang.String str, boolean z17) {
        if (z17) {
            i95.m c17 = i95.n0.c(zg0.u2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) zg0.u2.K2((zg0.u2) c17, context, str, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1(0.0f, 0.0f, null, false, false, 1, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 2, false, false, false, 7864015, null), 4, null)).show();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public final boolean o(android.content.Context context, dm.pd mention, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        if (mention.f66110xf8be237e != 6) {
            return false;
        }
        java.lang.String str = mention.f66104x89e93fac;
        if (str == null || str.length() == 0) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                db5.t7.m123883x26a183b(context, "no providerUsername", 1).show();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgContract", "no providerUsername");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_member_top_feed", mention.f66108x2327e25f);
            intent.putExtra("key_member_inlet_source", 26);
            intent.putExtra("feed_object_id", mention.f66108x2327e25f);
            intent.putExtra("mention_id", mention.f66095xc8a07680);
            intent.putExtra("mention_create_time", mention.f66080xac3be4e);
            intent.putExtra("from_scene", i17);
            u(intent, mention);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(context, intent);
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P0().r()).intValue() == 1) {
                r45.t64 t64Var = mention.f66101x5f78ee8a;
                if ((t64Var != null ? t64Var.m75939xb282bd08(2) : 0) > 0) {
                    intent.putExtra("key_show_first_like_tag", true);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            java.lang.String field_memberProviderFinderusername = mention.f66104x89e93fac;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_memberProviderFinderusername, "field_memberProviderFinderusername");
            i0Var.Nk(context, intent, field_memberProviderFinderusername, 0, 0);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
    
        if (r23.f66100x4185df7 != 0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
    
        if (r3 != 0) goto L304;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(final android.content.Context r22, dm.pd r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.p(android.content.Context, dm.pd, int, boolean):void");
    }

    public final int q(dm.pd mention, int i17) {
        java.lang.String str;
        r45.so2 so2Var;
        if (i17 != 1) {
            if (i17 != 2) {
                return 0;
            }
            if ((mention.u0() || (mention.f66082x26b1b2e8 & 1) == 0) ? false : true) {
                return 2;
            }
            return (mention.t0() && ya2.g.h(ya2.h.f542017a, mention.f66131xdec927b, null, false, false, 14, null)) ? 1 : 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        int i18 = mention.f66129x2262335f;
        boolean z17 = i18 == 1 || i18 == 10 || i18 == 11;
        boolean z18 = i18 == 17;
        r45.r31 r31Var = mention.f66091x7b4a207a;
        boolean z19 = (r31Var == null || r31Var.m75939xb282bd08(0) == 0) ? false : true;
        r45.pg2 pg2Var = mention.f66123xabd3e0e0;
        if (pg2Var == null || (so2Var = (r45.so2) pg2Var.m75936x14adae67(53)) == null || (str = so2Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        if ((mention.u0() || (mention.f66082x26b1b2e8 & 1) == 0) ? false : true) {
            return 6;
        }
        if ((mention.f66082x26b1b2e8 & 64) > 0) {
            return 1;
        }
        if (z17 && z19) {
            return 3;
        }
        if (str.length() > 0) {
            return 7;
        }
        if (!z17 && !z18 && mention.f66089x404ea322 == 1) {
            return 2;
        }
        if (mention.f66111xe4b06ec6 > 0) {
            return 4;
        }
        return mention.f66096x722c2 > 0 ? 5 : 0;
    }

    public final void s(android.view.View view, dm.pd pdVar, int i17, int i18, boolean z17) {
        int i19 = z17 ? 16 : i17 == 1 ? 14 : 15;
        int i27 = pdVar.t0() ? 1 : 2;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        long j17 = i19;
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = pdVar.f66078xad49d1db;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj(o3Var, context, j17, 1L, false, i27, i18, l(this, context2, i17, false, c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, pdVar, z17, false, true, false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q3.f34709x366c91de, null), 8, null);
    }

    public final void t(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.qt2 k17 = k(context, 97);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 6);
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, k17, "", i17, jSONObject, false, null, 48, null);
    }

    public final void u(android.content.Intent intent, dm.pd mention) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        intent.putExtra("mention_finder", mention.f66123xabd3e0e0.mo14344x5f01b1f6());
    }

    public final void v(android.view.View view, final so2.i msg, final int i17, final boolean z17, final boolean z18, final boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (view != null) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$setClickListener$1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    boolean z27;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view2);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (currentTimeMillis - qd2.h.f443300a >= 500) {
                        z27 = false;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
                        z27 = true;
                    }
                    qd2.h.f443300a = currentTimeMillis;
                    if (z27) {
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    dm.pd pdVar = so2.i.this.f491944d;
                    android.content.Context context = view2.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    this.p(context, pdVar, i17, z18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
                    android.content.Context context2 = view2.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    c14727x5e078d.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, c14727x5e078d.k(context2, 117), "protrait", 1, null, false, null, 56, null);
                    if (z17) {
                        this.s(view2, pdVar, i17, 1, z19);
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
    }

    public final void w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15385xab9dd69 view, final dm.pd mention, final int i17) {
        r45.so2 so2Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        int q17 = q(mention, i17);
        if (i17 == 1) {
            view.setVisibility(0);
            java.lang.String str = "";
            switch (q17) {
                case 1:
                    view.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss.f214608d, null);
                    break;
                case 2:
                    view.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss.f214609e, null);
                    break;
                case 3:
                    int m75939xb282bd08 = mention.f66091x7b4a207a.m75939xb282bd08(0);
                    if (m75939xb282bd08 == 1) {
                        str = view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxx);
                    } else if (m75939xb282bd08 == 2) {
                        str = view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxv);
                    } else if (m75939xb282bd08 == 3) {
                        str = view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxw);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    view.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss.f214611g, str);
                    break;
                case 4:
                    view.g(mention.f66111xe4b06ec6);
                    break;
                case 5:
                    view.e(mention.f66096x722c2);
                    break;
                case 6:
                    view.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss.f214612h, null);
                    break;
                case 7:
                    r45.pg2 pg2Var = mention.f66123xabd3e0e0;
                    if (pg2Var != null && (so2Var = (r45.so2) pg2Var.m75936x14adae67(53)) != null && (m75945x2fec8307 = so2Var.m75945x2fec8307(0)) != null) {
                        str = m75945x2fec8307;
                    }
                    view.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss.f214613i, str);
                    break;
                default:
                    view.setVisibility(8);
                    break;
            }
        } else if (i17 == 2) {
            view.setVisibility(0);
            if (q17 == 1) {
                view.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss.f214610f, null);
            } else if (q17 != 2) {
                view.setVisibility(8);
            } else {
                view.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ss.f214612h, null);
            }
        }
        if (view.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209174cc).mo141623x754a37bb()).r()).intValue() == 1) {
                view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$setMentionUserTag$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view2);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setMentionUserTag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        if (view2 == null) {
                            yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setMentionUserTag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        android.content.Context context = view2.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.this.p(context, mention, i17, true);
                        dm.pd pdVar = mention;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.this.s(view2, pdVar, i17, 7, pdVar.f66129x2262335f == 17);
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$setMentionUserTag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            }
        }
    }

    public final void x(android.content.Intent intent, int i17, int i18) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (i17 == 1) {
            if (i18 != 0) {
                if (i18 == 1) {
                    i19 = 35;
                }
                i19 = 0;
            } else {
                i19 = 37;
            }
        } else if (i18 != 0) {
            if (i18 == 1) {
                i19 = 34;
            }
            i19 = 0;
        } else {
            i19 = 36;
        }
        intent.putExtra("key_enter_profile_type", i19);
    }

    public final void y(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String string = resources != null ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epi) : null;
        if (string == null || string.length() == 0) {
            return;
        }
        db5.t7.m123883x26a183b(context, string, 0).show();
    }

    public final dm.pd z(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractActivityC21394xb3d2c0cf, "<this>");
        if (!abstractActivityC21394xb3d2c0cf.getIntent().hasExtra("mention_finder")) {
            return null;
        }
        r45.pg2 pg2Var = new r45.pg2();
        byte[] byteArrayExtra = abstractActivityC21394xb3d2c0cf.getIntent().getByteArrayExtra("mention_finder");
        if (byteArrayExtra != null) {
            try {
                pg2Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        return cu2.b0.f303904a.k(i17, pg2Var, "");
    }
}
