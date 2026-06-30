package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public class kr implements fs2.a, com.tencent.mm.plugin.finder.feed.fp, com.tencent.mm.plugin.finder.feed.k8, im5.b {
    public final zy2.h8 A;
    public final boolean B;
    public final int C;
    public final o25.y1 D;
    public final sc2.a9 E;
    public com.tencent.mm.plugin.finder.view.ContactUninterestEventListener F;
    public fc2.d G;
    public final com.tencent.mm.plugin.finder.feed.gp H;
    public final cw2.f8 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$feedExposeInfoChangeListener$1 f107229J;
    public final com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$feedProgressListener$1 K;
    public final com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$noInterestFeedScrollListener$1 L;
    public final com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$feedDislikeListener$1 M;
    public long N;
    public android.animation.AnimatorSet P;
    public android.animation.Animator Q;
    public java.lang.ref.WeakReference R;
    public java.lang.ref.WeakReference S;
    public final float T;
    public final float U;
    public boolean V;
    public boolean W;
    public final yz5.l X;
    public boolean Y;
    public final yz5.l Z;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f107230d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107231e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f107232f;

    /* renamed from: g, reason: collision with root package name */
    public final long f107233g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f107234h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f107235i;

    /* renamed from: m, reason: collision with root package name */
    public long f107236m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f107237n;

    /* renamed from: o, reason: collision with root package name */
    public final int f107238o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f107239p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.a34 f107240q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f107241r;

    /* renamed from: s, reason: collision with root package name */
    public final r45.q13 f107242s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f107243t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f107244u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f107245v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f107246w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.xr f107247x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f107248y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.l0 f107249z;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$feedDislikeListener$1] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$feedExposeInfoChangeListener$1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$feedProgressListener$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$noInterestFeedScrollListener$1] */
    public kr(final com.tencent.mm.ui.MMActivity context, java.lang.String username, boolean z17, long j17, boolean z18, boolean z19, long j18, java.lang.String nonceId, int i17, java.lang.String str, r45.a34 a34Var, java.lang.String encryptedObjectId, r45.q13 q13Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(encryptedObjectId, "encryptedObjectId");
        this.f107230d = context;
        this.f107231e = username;
        this.f107232f = z17;
        this.f107233g = j17;
        this.f107234h = z18;
        this.f107235i = z19;
        this.f107236m = j18;
        this.f107237n = nonceId;
        this.f107238o = i17;
        this.f107239p = str;
        this.f107240q = a34Var;
        this.f107241r = encryptedObjectId;
        this.f107242s = q13Var;
        this.f107243t = "Finder.ProfileTimelinePresenter";
        this.f107244u = jz5.h.b(com.tencent.mm.plugin.finder.feed.tq.f109105d);
        this.f107245v = new java.util.ArrayList();
        this.f107246w = new java.util.concurrent.CopyOnWriteArraySet();
        this.f107248y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.kp(this));
        this.f107249z = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
        this.A = ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(context).c(zy2.g8.class))).f417974d;
        int i18 = 0;
        int i19 = 1;
        boolean z27 = username.equals(xy2.c.e(context)) && z17;
        this.B = z27;
        this.C = z27 ? 1 : 2;
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.D = new com.tencent.mm.pluginsdk.forward.m();
        this.E = new sc2.a9();
        this.H = new com.tencent.mm.plugin.finder.feed.gp(this);
        this.I = new cw2.f8(i18, i19, null);
        this.f107229J = new com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener() { // from class: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$feedExposeInfoChangeListener$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.String f106111d;

            {
                this.f106111d = com.tencent.mm.plugin.finder.feed.kr.this.f107243t;
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            public com.tencent.mm.plugin.finder.storage.FinderItem c(long j19) {
                com.tencent.mm.plugin.finder.feed.kr krVar = com.tencent.mm.plugin.finder.feed.kr.this;
                com.tencent.mm.plugin.finder.feed.xr xrVar = krVar.f107247x;
                if (xrVar == null) {
                    return null;
                }
                androidx.recyclerview.widget.f2 adapter = xrVar.getRecyclerView().getAdapter();
                kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
                androidx.recyclerview.widget.k3 Y = in5.n0.Y((in5.n0) adapter, j19, false, 2, null);
                if (Y == null) {
                    return null;
                }
                so2.j5 j5Var = (so2.j5) krVar.m().safeGet(Y.getAdapterPosition());
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    return ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject();
                }
                return null;
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            /* renamed from: d, reason: from getter */
            public java.lang.String getF106111d() {
                return this.f106111d;
            }

            @Override // com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener
            public void e(long j19, r45.yl2 yl2Var) {
                com.tencent.mm.plugin.finder.feed.xr xrVar = com.tencent.mm.plugin.finder.feed.kr.this.f107247x;
                if (xrVar != null) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = xrVar.getRecyclerView();
                    androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                    kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
                    androidx.recyclerview.widget.k3 Y = in5.n0.Y((in5.n0) adapter, j19, false, 2, null);
                    if (Y != null) {
                        int adapterPosition = Y.getAdapterPosition();
                        androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
                        if (adapter2 != null) {
                            adapter2.notifyItemChanged(adapterPosition, new jz5.l(1, yl2Var));
                        }
                    }
                }
            }
        };
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.K = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.kr krVar = com.tencent.mm.plugin.finder.feed.kr.this;
                java.lang.String str2 = krVar.f107243t;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f54250g;
                sb6.append(gaVar.f6749a);
                sb6.append(", progress:");
                sb6.append(gaVar.f6750b);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                krVar.m().updateProgressByLocalId(gaVar.f6749a);
                return true;
            }
        };
        this.L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent>(context) { // from class: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$noInterestFeedScrollListener$1
            {
                this.__eventId = 1966115342;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent finderNoInterestFeedScrollEvent) {
                com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent event = finderNoInterestFeedScrollEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.tc tcVar = event.f54314g;
                if (tcVar == null) {
                    return false;
                }
                boolean z28 = tcVar.f7998a;
                com.tencent.mm.plugin.finder.feed.kr krVar = com.tencent.mm.plugin.finder.feed.kr.this;
                com.tencent.mm.plugin.finder.feed.xr xrVar = krVar.f107247x;
                if (xrVar != null) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = xrVar.getRecyclerView();
                    com.tencent.mm.plugin.finder.feed.xr xrVar2 = krVar.f107247x;
                    if (xrVar2 != null) {
                        xrVar2.j(recyclerView, z28);
                    }
                }
                return true;
            }
        };
        this.M = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderFeedDislikeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$feedDislikeListener$1
            {
                this.__eventId = -633386071;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderFeedDislikeEvent finderFeedDislikeEvent) {
                com.tencent.mm.plugin.finder.feed.xr xrVar;
                com.tencent.mm.autogen.events.FinderFeedDislikeEvent event = finderFeedDislikeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.kr krVar = com.tencent.mm.plugin.finder.feed.kr.this;
                java.util.ArrayList f17 = krVar.f();
                if (f17 == null) {
                    return false;
                }
                java.util.Iterator it = f17.iterator();
                int i27 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i27 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() == event.f54274g.f6547a) {
                        break;
                    }
                    i27++;
                }
                if (i27 < 0) {
                    return false;
                }
                java.lang.Object obj = f17.get(i27);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.tencent.mars.xlog.Log.i(krVar.f107243t, "[handleNoInterest] removeAt " + i27 + ", " + ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj).getFeedObject() + ",dataSize=" + f17.size());
                if (i27 < f17.size() - 1 && !bd2.r.f19284a.b() && (xrVar = krVar.f107247x) != null) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = xrVar.getRecyclerView();
                    com.tencent.mm.plugin.finder.feed.xr xrVar2 = krVar.f107247x;
                    if (xrVar2 != null) {
                        xrVar2.j(recyclerView, true);
                    }
                }
                return true;
            }
        };
        this.T = 0.95f;
        this.U = 0.5f;
        this.X = new com.tencent.mm.plugin.finder.feed.jr(this);
        this.Z = new com.tencent.mm.plugin.finder.feed.sq(this);
    }

    public static final void g(com.tencent.mm.plugin.finder.feed.kr krVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, db5.g4 g4Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        java.lang.String string;
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        com.tencent.mm.ui.MMActivity mMActivity = krVar.f107230d;
        y4Var.k(mMActivity, g4Var, baseFinderFeed);
        y4Var.s(mMActivity, g4Var, baseFinderFeed);
        com.tencent.mm.plugin.finder.feed.xr xrVar = krVar.f107247x;
        if (xrVar != null) {
            string = com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.f133635x.a(xrVar.getRecyclerView());
        } else {
            string = mMActivity.getString(com.tencent.mm.R.string.gue);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        y4Var.G(g4Var, baseFinderFeed, string);
        y4Var.y(krVar.f107230d, baseFinderFeed, g4Var, k0Var, 200);
    }

    public static final void h(com.tencent.mm.plugin.finder.feed.kr krVar, android.view.MenuItem menuItem, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 s0Var, int i17) {
        r45.q23 video_tmpl_info;
        cw2.da videoView;
        krVar.getClass();
        java.lang.String str = "getMoreMenuItemSelectedListener feed " + feed + " menuItem:" + menuItem.getItemId();
        java.lang.String str2 = krVar.f107243t;
        com.tencent.mars.xlog.Log.i(str2, str);
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
        if (itemId == 99) {
            int c17 = krVar.c(feed);
            if (c17 > 0) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_uninterest_clk", s0Var.itemView, null, 24617);
            }
            if (c17 >= 0) {
                java.util.ArrayList f17 = krVar.f();
                if (f17 != null) {
                    f17.size();
                }
                bd2.r.f19284a.e(krVar.f107230d, feed.getFeedObject().getId(), feed.w(), feed.getFeedObject().getObjectNonceId(), (r17 & 16) != 0 ? false : false, (r17 & 32) != 0 ? null : s0Var);
            } else {
                com.tencent.mars.xlog.Log.i(str2, "[handleNoInterest] pos error " + c17);
            }
            x3Var.c(krVar.f107230d, "button_uninterested", feed.getItemId(), i17);
            return;
        }
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        if (itemId == 109) {
            com.tencent.mm.plugin.finder.assist.y4.T(y4Var, krVar.f107230d, feed, s0Var, i17, 0, 16, null);
            return;
        }
        com.tencent.mm.ui.MMActivity activity = krVar.f107230d;
        if (itemId == 118) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = feed.getFeedObject().getFeedObject().getObjectDesc();
            r45.q23 video_tmpl_info2 = objectDesc != null ? objectDesc.getVideo_tmpl_info() : null;
            if (video_tmpl_info2 == null) {
                db5.t7.g(activity, activity.getString(com.tencent.mm.R.string.d0c));
            } else {
                android.content.Intent intent = new android.content.Intent();
                int i18 = video_tmpl_info2.f383586e;
                int i19 = i18 != 1 ? i18 != 3 ? -1 : 16 : 13;
                com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                p2Var.W(p2Var.i(activity, 53, false));
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("shoot_same_feedid", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(feed.getFeedObject().getFeedObject().getId()));
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                p2Var.V(r26.i0.t(jSONObject2, ",", ";", false));
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                intent.putExtra("key_maas_entrance", 5);
                intent.putExtra("key_ref_feed_id", feed.getFeedObject().getFeedObject().getId());
                intent.putExtra("key_ref_feed_dup_flag", feed.w());
                intent.putExtra("KEY_FINDER_NEED_POST_TO_COMMENT", true);
                intent.putExtra("KEY_FINDER_TARGET_TEMPLATE_ID", video_tmpl_info2.f383585d);
                intent.putExtra("KEY_FINDER_TARGET_TEMPLATE_TYPE", video_tmpl_info2.f383586e);
                ((c61.l7) b6Var).tj(activity, video_tmpl_info2, intent, i19);
                com.tencent.mm.plugin.finder.report.p2.L(p2Var, krVar.f107230d, 93, video_tmpl_info2, 0L, 0, 24, null);
            }
            kotlin.jvm.internal.o.g(activity, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            com.tencent.mm.plugin.finder.report.b6 b6Var2 = com.tencent.mm.plugin.finder.report.b6.f124969a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = feed.getFeedObject().getFeedObject().getObjectDesc();
            java.lang.Object obj = (objectDesc2 == null || (video_tmpl_info = objectDesc2.getVideo_tmpl_info()) == null) ? null : video_tmpl_info.f383585d;
            if (obj == null) {
                obj = 0;
            }
            jSONObject3.put("templateId", obj);
            b6Var2.c(V6, "shoot_same_video", true, jSONObject3);
            return;
        }
        if (itemId == 120) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(feed, "feed");
            fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
            byte[] byteArray = feed.getFeedObject().getFeedObject().toByteArray();
            ((ee0.n4) k4Var).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
            if (byteArray == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                return;
            } else {
                je4.a.f299315a.a(activity, 2, byteArray, 0, 9);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                return;
            }
        }
        if (itemId == 200) {
            y4Var.Y(feed, activity, cu2.f0.f222391a.f(feed.getFeedObject().getFromAppId()));
            return;
        }
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        if (itemId == 208) {
            n7Var.I(activity, feed.getFeedObject());
            return;
        }
        if (itemId == 213) {
            com.tencent.mm.plugin.finder.assist.k2 k2Var = com.tencent.mm.plugin.finder.assist.k2.f102306a;
            k2Var.a(feed.getFeedObject());
            k2Var.b(activity);
            return;
        }
        if (itemId == 219) {
            y4Var.d0(activity, feed, s0Var);
            return;
        }
        if (itemId == 403) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            r45.s02 s02Var = new r45.s02();
            s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
            s02Var.set(3, 1);
            ((b92.d1) zbVar).uj(activity, s02Var);
            r45.qt2 V62 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.W2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1")), V62.getString(1), java.lang.Integer.valueOf(V62.getInteger(5)).toString(), null, null, false, 112, null);
            return;
        }
        cu2.m mVar = cu2.m.f222420a;
        if (itemId == 106) {
            mVar.b(activity, feed, false, new com.tencent.mm.plugin.finder.feed.fq(krVar));
            return;
        }
        if (itemId == 107) {
            mVar.b(activity, feed, true, new com.tencent.mm.plugin.finder.feed.eq(krVar));
            return;
        }
        vs5.a aVar = vs5.a.f439924a;
        if (itemId == 113) {
            com.tencent.mm.plugin.finder.assist.n7.H(n7Var, activity, feed, null, 0, 12, null);
            x3Var.c(krVar.f107230d, "textstatus_in_menu", feed.getItemId(), i17);
            if (feed.getFeedObject().isLiveFeed()) {
                r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
                aVar.a(java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null), java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId()), feed.getFeedObject().getFeedObject().getUsername(), com.tencent.mm.plugin.finder.convert.zf.D1, "3", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
            }
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.t1 t1Var = ml2.t1.f327967n;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((b92.d1) zbVar2).rj(t1Var, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
            return;
        }
        if (itemId == 114) {
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
            kotlin.jvm.internal.o.d(finderFullSeekBarLayout);
            cw2.ca.d(finderFullSeekBarLayout, null, false, 3, null);
            com.tencent.mm.plugin.finder.assist.y5.e(com.tencent.mm.plugin.finder.assist.y5.f102716a, krVar.f107230d, feed, 2L, false, null, null, 0, s0Var, new com.tencent.mm.plugin.finder.feed.gq(finderFullSeekBarLayout, krVar), 120, null);
            x3Var.c(krVar.f107230d, "button_set_bell", feed.getItemId(), i17);
            return;
        }
        if (itemId == 312) {
            y4Var.M(activity, s0Var, feed, krVar.I);
            return;
        }
        if (itemId == 313) {
            y4Var.K(activity, feed, s0Var, menuItem);
            return;
        }
        switch (itemId) {
            case 101:
                boolean C = zl2.q4.f473933a.C(feed);
                bd2.b bVar = bd2.b.f19244a;
                if (C) {
                    r45.nw1 liveInfo2 = feed.getFeedObject().getLiveInfo();
                    if (liveInfo2 != null) {
                        long j17 = liveInfo2.getLong(0);
                        kotlin.jvm.internal.o.g(activity, "activity");
                        bVar.j(activity, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), j17, feed.getFeedObject().getUserName(), (i18 & 16) != 0 ? null : null, (i18 & 32) != 0 ? 62 : 0, (i18 & 64) != 0 ? null : null);
                    }
                } else {
                    bd2.b.c(bVar, krVar.f107230d, feed, 0L, 0, 12, null);
                }
                x3Var.c(krVar.f107230d, "button_complaint", feed.getItemId(), i17);
                return;
            case 102:
                c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
                ml2.t1 t1Var2 = ml2.t1.f327954i;
                kotlin.jvm.internal.o.g(activity, "activity");
                ((b92.d1) zbVar3).rj(t1Var2, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
                com.tencent.mm.plugin.finder.assist.n7.C(n7Var, krVar.f107230d, feed.getFeedObject(), null, 3, new com.tencent.mm.plugin.finder.feed.dq(feed), 4, null);
                x3Var.c(krVar.f107230d, "button_forward_friend", feed.getItemId(), i17);
                return;
            case 103:
                com.tencent.mm.plugin.finder.assist.n7.F(n7Var, activity, feed, null, 0, 0, 28, null);
                if (feed.getFeedObject().isLiveFeed()) {
                    r45.nw1 liveInfo3 = feed.getFeedObject().getLiveInfo();
                    aVar.a(java.lang.String.valueOf(liveInfo3 != null ? java.lang.Long.valueOf(liveInfo3.getLong(0)) : null), java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId()), feed.getFeedObject().getFeedObject().getUsername(), com.tencent.mm.plugin.finder.convert.zf.D1, "2", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                }
                x3Var.c(krVar.f107230d, "button_forward_friendcircle", feed.getItemId(), i17);
                c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
                ml2.t1 t1Var3 = ml2.t1.f327964m;
                kotlin.jvm.internal.o.g(activity, "activity");
                ((b92.d1) zbVar4).rj(t1Var3, feed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
                return;
            case 104:
                so2.v0.b(so2.v0.f410644a, feed, activity, null, null, 12, null);
                i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3.Rk((com.tencent.mm.plugin.finder.report.o3) c19, krVar.f107230d, true, feed.getItemId(), false, 8, null);
                return;
            default:
                switch (itemId) {
                    case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE /* 307 */:
                        kotlin.jvm.internal.o.g(activity, "activity");
                        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.f2.class);
                        kotlin.jvm.internal.o.f(a17, "get(...)");
                        ((com.tencent.mm.plugin.finder.viewmodel.component.f2) a17).Q6(s0Var, false);
                        return;
                    case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR /* 308 */:
                        y4Var.I(activity, feed);
                        return;
                    case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL /* 309 */:
                        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
                        vn2.u0.f438387a.a(krVar.f107243t, "", krVar.f107230d, feed, true, true, (finderVideoLayout == null || (videoView = finderVideoLayout.getVideoView()) == null) ? 0.0f : ((float) videoView.getCurrentPlayMs()) / ((float) videoView.getVideoDurationMs()));
                        return;
                    default:
                        return;
                }
        }
    }

    public static final void i(com.tencent.mm.plugin.finder.feed.kr krVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        boolean isFinishing = krVar.f107230d.isFinishing();
        java.lang.String str = krVar.f107243t;
        if (isFinishing || !k0Var.i()) {
            com.tencent.mars.xlog.Log.i(str, "context is finishing or not showing :" + k0Var.i());
        } else {
            try {
                k0Var.j();
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a(str, "", e17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.rp(feed, this, sheet, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 D1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder, yz5.a aVar) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.yp(aVar, this, holder, feed, i17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: H1 */
    public cw2.f8 getF122653q() {
        return this.I;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.s4 K0(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.tp(this, feed, bottomSheet, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void W4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.ui.MMActivity activity = this.f107230d;
        kotlin.jvm.internal.o.g(activity, "activity");
        so2.e2.f410328a.b(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), i17, feed.getFeedObject(), z17, z18, 2, feed.getShowLikeTips(), z19, hc2.s.f(feed.getContact()), bc1Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return com.tencent.mm.plugin.finder.feed.sp.f109001d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.fp
    public int c(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        return m().getDataListJustForAdapter().indexOf(feed);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 c4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return com.tencent.mm.plugin.finder.feed.aq.f106321d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return this.B;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public androidx.recyclerview.widget.y2 e2() {
        return (androidx.recyclerview.widget.y2) ((jz5.n) this.f107244u).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.fp
    public java.util.ArrayList f() {
        return m().getDataListJustForAdapter();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: getActivity */
    public com.tencent.mm.ui.MMActivity getF122643d() {
        return this.f107230d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.f5 j2() {
        com.tencent.mm.ui.MMActivity activity = this.f107230d;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((com.tencent.mm.plugin.finder.viewmodel.component.u6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).P6();
    }

    @Override // im5.b
    public void keep(im5.a p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f107246w.add(p07);
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader m() {
        return (com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader) this.f107248y.getValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void n0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, int i17, r45.qt2 qt2Var) {
        int i18;
        kotlin.jvm.internal.o.g(feed, "feed");
        if (qt2Var == null) {
            com.tencent.mm.ui.MMActivity activity = this.f107230d;
            kotlin.jvm.internal.o.g(activity, "activity");
            qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        so2.z1.f410730a.a(this.f107230d, qt2Var, feed, z17 ? 1 : 2, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : i17);
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 contact = feed.getContact();
        java.lang.String D0 = contact != null ? contact.D0() : "";
        if (z17) {
            l75.e0 e0Var = ya2.b2.O2;
            i18 = ya2.b2.Q2;
        } else {
            l75.e0 e0Var2 = ya2.b2.O2;
            i18 = 0;
        }
        gVar.i(D0, i18);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void o0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(feed, "feed");
        super.o0(holder, feed);
        int initPos = m().getInitPos();
        com.tencent.mars.xlog.Log.i(this.f107243t, "initPosition " + initPos + " isProfileAdFeed " + feed.getIsProfileAdFeed());
        if (feed.getIsProfileAdFeed()) {
            return;
        }
        java.util.ArrayList arrayList = this.f107245v;
        if (!arrayList.isEmpty()) {
            long itemId = feed.getItemId();
            java.util.Iterator it = m().getDataListJustForAdapter().iterator();
            int i17 = 0;
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                boolean z17 = j5Var.getItemId() == itemId;
                if (!z17 && (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                    if (!baseFinderFeed.getIsProfileAdFeed() && kotlin.jvm.internal.o.b(baseFinderFeed.getFeedObject().getUserName(), this.f107231e)) {
                        i17++;
                    }
                }
                if (z17) {
                    break;
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (((com.tencent.mm.plugin.finder.feed.yr) obj).f111188a == i17 - initPos) {
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.finder.feed.yr yrVar = (com.tencent.mm.plugin.finder.feed.yr) obj;
            if (yrVar != null) {
                if (this.V) {
                    s("debug:请求中, 跳过");
                    return;
                }
                if (yrVar.f111190c != 0) {
                    s("debug:已插入, 跳过");
                    return;
                }
                this.V = true;
                if (yrVar.f111191d != null) {
                    s("debug:插入缓存");
                    com.tencent.mm.plugin.finder.feed.xr xrVar = this.f107247x;
                    if (xrVar != null) {
                        xrVar.a(yrVar.f111191d, yrVar, m().getDataListJustForAdapter(), m().getInitPos());
                    }
                    this.V = false;
                    return;
                }
                s("debug:开始请求 getPosition " + yrVar.f111188a + ' ' + pm0.v.u(feed.getItemId()));
                pf5.u uVar = pf5.u.f353936a;
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.c(this.f107230d).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                long itemId2 = feed.getItemId();
                java.lang.String w17 = feed.w();
                jz5.l P6 = ((ey2.k0) uVar.e(c61.l7.class).a(ey2.k0.class)).P6();
                pm0.v.T(new bq.b(V6, null, itemId2, w17, ((java.lang.Number) P6.f302833d).floatValue(), ((java.lang.Number) P6.f302834e).floatValue(), 0, 0, V6.getInteger(5), yrVar.f111189b).l(), new cq.m(new com.tencent.mm.plugin.finder.feed.cr(this, yrVar), new com.tencent.mm.plugin.finder.feed.dr(this), (cq.k) c17, V6));
            }
        }
    }

    @Override // fs2.a
    public void onDetach() {
        fc2.c n17;
        fc2.c n18;
        fc2.c n19;
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f107249z;
        l0Var.onDetach();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.ui.MMActivity mMActivity = this.f107230d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(mMActivity);
        if (e17 != null && (n19 = zy2.ra.n1(e17, 0, 1, null)) != null) {
            n19.d(l0Var);
        }
        zy2.h8 h8Var = this.A;
        ((com.tencent.mm.plugin.finder.feed.model.s3) h8Var).onDetach();
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(mMActivity);
        if (e18 != null && (n18 = zy2.ra.n1(e18, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
            s3Var.getClass();
            n18.d(s3Var);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(mMActivity);
        if (e19 != null && (n17 = zy2.ra.n1(e19, 0, 1, null)) != null) {
            fc2.d dVar = this.G;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("observerForExposeReport");
                throw null;
            }
            n17.d(dVar);
        }
        bu2.n.f24550a.c();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f107246w;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).dead();
        }
        copyOnWriteArraySet.clear();
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f107247x;
        if (xrVar != null) {
            xrVar.getRecyclerView().V0(this.H);
        }
        q();
        this.f107247x = null;
        dead();
        dead();
        if (bd2.r.f19284a.b()) {
            dead();
        }
        dead();
        com.tencent.mm.plugin.finder.view.ContactUninterestEventListener contactUninterestEventListener = this.F;
        if (contactUninterestEventListener != null) {
            contactUninterestEventListener.dead();
        }
        com.tencent.mm.plugin.finder.feed.xr xrVar2 = this.f107247x;
        androidx.recyclerview.widget.RecyclerView recyclerView = xrVar2 != null ? xrVar2.getRecyclerView() : null;
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView : null;
        if (finderRecyclerView != null) {
            finderRecyclerView.setSkipsTouchInterceptionListener(null);
        }
        com.tencent.mm.plugin.finder.feed.xr xrVar3 = this.f107247x;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = xrVar3 != null ? xrVar3.getRecyclerView() : null;
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView2 = recyclerView2 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView2 : null;
        if (finderRecyclerView2 == null) {
            return;
        }
        finderRecyclerView2.setInterceptTouchEventListener(null);
    }

    public com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader p() {
        boolean z17;
        com.tencent.mm.ui.MMActivity activity = this.f107230d;
        if (!lk5.s.b(activity)) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.F9).getValue()).r()).intValue() != 1) {
                z17 = false;
                com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var = com.tencent.mm.plugin.finder.feed.model.internal.m0.f108025r;
                java.lang.String str = this.f107231e;
                kotlin.jvm.internal.o.g(activity, "activity");
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader(m0Var, str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), false, z17, 0, null, this.f107234h, this.f107236m, this.f107237n, this.f107238o, this.f107239p, this.f107240q, 72, null);
                finderProfileFeedLoader.setCurTopicId(this.f107233g);
                finderProfileFeedLoader.setEnableGuideToDiscoverPlaceHolder(true);
                android.content.Intent intent = activity.getIntent();
                kotlin.jvm.internal.o.f(intent, "getIntent(...)");
                finderProfileFeedLoader.initFromCache(intent);
                finderProfileFeedLoader.setScrollCallback(new com.tencent.mm.plugin.finder.feed.cq(this));
                return finderProfileFeedLoader;
            }
        }
        z17 = true;
        com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var2 = com.tencent.mm.plugin.finder.feed.model.internal.m0.f108025r;
        java.lang.String str2 = this.f107231e;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader2 = new com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader(m0Var2, str2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), false, z17, 0, null, this.f107234h, this.f107236m, this.f107237n, this.f107238o, this.f107239p, this.f107240q, 72, null);
        finderProfileFeedLoader2.setCurTopicId(this.f107233g);
        finderProfileFeedLoader2.setEnableGuideToDiscoverPlaceHolder(true);
        android.content.Intent intent2 = activity.getIntent();
        kotlin.jvm.internal.o.f(intent2, "getIntent(...)");
        finderProfileFeedLoader2.initFromCache(intent2);
        finderProfileFeedLoader2.setScrollCallback(new com.tencent.mm.plugin.finder.feed.cq(this));
        return finderProfileFeedLoader2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 p1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.qp(feed, this, sheet);
    }

    public final void q() {
        java.lang.ref.WeakReference weakReference = this.R;
        android.widget.TextView textView = weakReference != null ? (android.widget.TextView) weakReference.get() : null;
        java.lang.ref.WeakReference weakReference2 = this.S;
        android.view.View view = weakReference2 != null ? (android.view.View) weakReference2.get() : null;
        this.R = null;
        this.S = null;
        android.animation.AnimatorSet animatorSet = this.P;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.P = null;
        android.animation.Animator animator = this.Q;
        if (animator != null) {
            animator.cancel();
        }
        this.Q = null;
        if (textView != null) {
            android.view.ViewPropertyAnimator animate = textView.animate();
            if (animate != null) {
                animate.cancel();
            }
            textView.setAlpha(0.0f);
            textView.setVisibility(8);
        }
        if (view != null) {
            android.view.ViewPropertyAnimator animate2 = view.animate();
            if (animate2 != null) {
                animate2.cancel();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter", "hideAdFeedToastImmediately", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter", "hideAdFeedToastImmediately", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public final void s(java.lang.String tips) {
        kotlin.jvm.internal.o.g(tips, "tips");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128030y0).getValue()).r()).booleanValue()) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f107230d);
            e4Var.f211776c = tips;
            e4Var.c();
        }
        com.tencent.mars.xlog.Log.i(this.f107243t, "profilePromotion ".concat(tips));
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void s0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(feed, "feed");
        java.util.Collection listOfType = m().getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
        java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
        synchronized (listOfType) {
            int i17 = 0;
            for (java.lang.Object obj : listOfType) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
                if ((baseFinderFeed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && baseFinderFeed.getFeedObject().getId() == feed.getFeedObject().getId()) {
                    linkedList.add(0, new jz5.l(java.lang.Integer.valueOf(i17), baseFinderFeed));
                }
                i17 = i18;
            }
        }
        for (jz5.l lVar : linkedList) {
            m().getDataListJustForAdapter().remove(lVar.f302834e);
            com.tencent.mm.plugin.finder.feed.xr xrVar = this.f107247x;
            if (xrVar != null && (adapter = xrVar.getRecyclerView().getAdapter()) != null) {
                adapter.notifyItemRangeRemoved(((java.lang.Number) lVar.f302833d).intValue(), 1);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void u2(com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, in5.s0 s0Var, int i17, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        so2.v0.d(so2.v0.f410644a, this.f107230d, feed, z17, 2, i17, null, bc1Var, 32, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 w4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.pp(this, feed, i17, sheet);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.r4 z6(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.zp(this, feed);
    }
}
