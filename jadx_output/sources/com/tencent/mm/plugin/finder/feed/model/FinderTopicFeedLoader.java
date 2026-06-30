package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderTopicFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/a9", "com/tencent/mm/plugin/finder/feed/model/b9", "com/tencent/mm/plugin/finder/feed/model/c9", "com/tencent/mm/plugin/finder/feed/model/d9", "com/tencent/mm/plugin/finder/feed/model/e9", "com/tencent/mm/plugin/finder/feed/model/f9", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderTopicFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {
    public static final /* synthetic */ int B = 0;
    public yz5.a A;

    /* renamed from: d, reason: collision with root package name */
    public final int f107668d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107669e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f107670f;

    /* renamed from: g, reason: collision with root package name */
    public int f107671g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f107672h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.a9 f107673i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ze2 f107674m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Long f107675n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f107676o;

    /* renamed from: p, reason: collision with root package name */
    public r45.xu2 f107677p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f107678q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f107679r;

    /* renamed from: s, reason: collision with root package name */
    public long f107680s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f107681t;

    /* renamed from: u, reason: collision with root package name */
    public int f107682u;

    /* renamed from: v, reason: collision with root package name */
    public int f107683v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f107684w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f107685x;

    /* renamed from: y, reason: collision with root package name */
    public final ey2.p2 f107686y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f107687z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FinderTopicFeedLoader(int r2, java.lang.String r3, r45.qt2 r4, java.lang.String r5, int r6, int r7, kotlin.jvm.internal.i r8) {
        /*
            r1 = this;
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L6
            r4 = r0
        L6:
            r8 = r7 & 8
            if (r8 == 0) goto Lb
            r5 = r0
        Lb:
            r7 = r7 & 16
            if (r7 == 0) goto L10
            r6 = 0
        L10:
            java.lang.String r7 = "topic"
            kotlin.jvm.internal.o.g(r3, r7)
            r1.<init>(r4)
            r1.f107668d = r2
            r1.f107669e = r3
            r1.f107670f = r5
            r1.f107671g = r6
            com.tencent.mm.plugin.finder.feed.model.a9 r2 = new com.tencent.mm.plugin.finder.feed.model.a9
            r2.<init>(r1)
            r1.f107673i = r2
            java.lang.String r2 = ""
            r1.f107676o = r2
            r1.f107679r = r2
            r1.f107681t = r2
            r2 = -1
            r1.f107683v = r2
            pf5.u r2 = pf5.u.f353936a
            java.lang.Class<c61.l7> r3 = c61.l7.class
            pf5.v r2 = r2.e(r3)
            java.lang.Class<ey2.p2> r3 = ey2.p2.class
            androidx.lifecycle.c1 r2 = r2.a(r3)
            java.lang.String r3 = "get(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            ey2.p2 r2 = (ey2.p2) r2
            r1.f107686y = r2
            java.util.concurrent.ConcurrentLinkedQueue r2 = new java.util.concurrent.ConcurrentLinkedQueue
            r2.<init>()
            r1.f107687z = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader.<init>(int, java.lang.String, r45.qt2, java.lang.String, int, int, kotlin.jvm.internal.i):void");
    }

    public final com.tencent.mm.protobuf.g c(java.lang.String str) {
        return str == null || str.length() == 0 ? getLastBuffer() : this.f107672h;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return this.f107673i;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.i9(this);
    }

    public void d(int i17, r45.xn5 xn5Var) {
        java.lang.String str;
        java.util.LinkedList list;
        r45.r03 r03Var;
        java.util.LinkedList list2;
        r45.r03 r03Var2;
        if (this.f107678q) {
            com.tencent.mars.xlog.Log.i(getF123427d(), "already load more,return");
            return;
        }
        this.f107678q = true;
        com.tencent.mm.protobuf.g c17 = c((xn5Var == null || (list2 = xn5Var.getList(0)) == null || (r03Var2 = (r45.r03) list2.get(0)) == null) ? null : r03Var2.getString(0));
        java.lang.String f123427d = getF123427d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestLoadMore tag: ");
        if (xn5Var == null || (list = xn5Var.getList(0)) == null || (r03Var = (r45.r03) list.get(0)) == null || (str = r03Var.getString(0)) == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append("  topic:");
        sb6.append(this.f107669e);
        sb6.append(" innerTabType:");
        sb6.append(this.f107682u);
        com.tencent.mars.xlog.Log.i(f123427d, sb6.toString());
        com.tencent.mm.plugin.finder.feed.model.c9 c9Var = new com.tencent.mm.plugin.finder.feed.model.c9(new com.tencent.mm.plugin.finder.feed.model.m9(this.f107668d, this.f107669e, this.f107679r, this.f107680s, this.f107681t, this.f107682u, this.f107674m, this.f107675n, c17, this.f107677p, this.f107676o, i17, xn5Var, -1, getContextObj(), this.f107670f, 0L, null, this.f107671g, null, 720896, null));
        com.tencent.mars.xlog.Log.i(c9Var.f107831a, c9Var.toString());
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.request$default(this, c9Var, null, 2, null);
        this.f107687z.add(c9Var);
    }

    public final void e(int i17, r45.xn5 xn5Var, int i18) {
        java.lang.String str;
        java.util.LinkedList list;
        r45.r03 r03Var;
        java.lang.String f123427d = getF123427d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestRefresh tag: ");
        if (xn5Var == null || (list = xn5Var.getList(0)) == null || (r03Var = (r45.r03) list.get(0)) == null || (str = r03Var.getString(0)) == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append("  topic:");
        sb6.append(this.f107669e);
        sb6.append(" innerTabType:");
        sb6.append(this.f107682u);
        sb6.append(" this:");
        sb6.append(this);
        sb6.append(" pullType:");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i(f123427d, sb6.toString());
        com.tencent.mm.plugin.finder.feed.model.d9 d9Var = new com.tencent.mm.plugin.finder.feed.model.d9(new com.tencent.mm.plugin.finder.feed.model.m9(this.f107668d, this.f107669e, this.f107679r, this.f107680s, this.f107681t, this.f107682u, this.f107674m, this.f107675n, null, this.f107677p, this.f107676o, i17, xn5Var, i18, getContextObj(), this.f107670f, 0L, null, this.f107671g, null, 720896, null));
        com.tencent.mars.xlog.Log.i(d9Var.f107831a, d9Var.toString());
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.request$default(this, d9Var, null, 2, null);
        this.f107687z.add(d9Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public boolean isObservePostEvent() {
        int i17 = this.f107668d;
        if (i17 == 4 || i17 == 7 || i17 == 12 || i17 == 15) {
            return true;
        }
        return this instanceof com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        java.lang.String b17;
        java.util.LinkedList list;
        r45.r03 r03Var;
        java.util.LinkedList list2;
        r45.r03 r03Var2;
        java.lang.String string;
        java.util.LinkedList list3;
        r45.r03 r03Var3;
        kotlin.jvm.internal.o.g(response, "response");
        java.lang.String f123427d = getF123427d();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.List incrementList = response.getIncrementList();
        objArr[0] = incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null;
        com.tencent.mars.xlog.Log.i(f123427d, "onFetchDone %d feeds", objArr);
        if (response instanceof com.tencent.mm.plugin.finder.feed.model.f9) {
            java.lang.String f123427d2 = getF123427d();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementCount ");
            java.util.List incrementList2 = response.getIncrementList();
            sb6.append(incrementList2 != null ? java.lang.Integer.valueOf(incrementList2.size()) : null);
            sb6.append(", totalCount ");
            com.tencent.mm.plugin.finder.feed.model.f9 f9Var = (com.tencent.mm.plugin.finder.feed.model.f9) response;
            sb6.append(f9Var.f107862b);
            sb6.append(", lastBuffer ");
            java.lang.String str = "null";
            if (getLastBuffer() == null) {
                b17 = "null";
            } else {
                com.tencent.mm.protobuf.g lastBuffer = getLastBuffer();
                b17 = com.tencent.mm.sdk.platformtools.w2.b(lastBuffer != null ? lastBuffer.f192156a : null);
            }
            sb6.append(b17);
            sb6.append(", resp buffer ");
            if (response.getLastBuffer() != null) {
                com.tencent.mm.protobuf.g lastBuffer2 = response.getLastBuffer();
                str = com.tencent.mm.sdk.platformtools.w2.b(lastBuffer2 != null ? lastBuffer2.f192156a : null);
            }
            sb6.append(str);
            sb6.append(", pullType = ");
            sb6.append(response.getPullType());
            com.tencent.mars.xlog.Log.i(f123427d2, sb6.toString());
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f107687z;
            com.tencent.mm.plugin.finder.feed.model.e9 e9Var = (com.tencent.mm.plugin.finder.feed.model.e9) kz5.n0.Y(concurrentLinkedQueue);
            if (e9Var != null) {
                concurrentLinkedQueue.remove();
            }
            boolean z17 = e9Var instanceof com.tencent.mm.plugin.finder.feed.model.d9;
            if (z17) {
                r45.xn5 xn5Var = ((com.tencent.mm.plugin.finder.feed.model.d9) e9Var).f107811c.f108197l;
                java.lang.String string2 = (xn5Var == null || (list3 = xn5Var.getList(0)) == null || (r03Var3 = (r45.r03) list3.get(0)) == null) ? null : r03Var3.getString(0);
                com.tencent.mm.protobuf.g lastBuffer3 = response.getLastBuffer();
                if (string2 == null || string2.length() == 0) {
                    setLastBuffer(lastBuffer3);
                } else {
                    this.f107672h = lastBuffer3;
                }
                java.util.List incrementList3 = response.getIncrementList();
                r45.r03 r03Var4 = f9Var.f107861a;
                if (r03Var4 != null && (string = r03Var4.getString(0)) != null && incrementList3 != null) {
                    this.f107686y.O6(ey2.p2.f257467g.a(this.f107680s, this.f107681t, string, this.f107671g, this.f107682u), incrementList3, r03Var4);
                }
            } else if (e9Var instanceof com.tencent.mm.plugin.finder.feed.model.c9) {
                r45.xn5 xn5Var2 = ((com.tencent.mm.plugin.finder.feed.model.c9) e9Var).f107762c.f108197l;
                java.lang.String string3 = (xn5Var2 == null || (list = xn5Var2.getList(0)) == null || (r03Var = (r45.r03) list.get(0)) == null) ? null : r03Var.getString(0);
                com.tencent.mm.protobuf.g lastBuffer4 = response.getLastBuffer();
                if (string3 == null || string3.length() == 0) {
                    setLastBuffer(lastBuffer4);
                } else {
                    this.f107672h = lastBuffer4;
                }
            }
            if (z17) {
                int pullType = response.getPullType();
                if (pullType == 2) {
                    pm0.z.b(xy2.b.f458155b, "TopicFeedLoaderRefreshCheck", false, null, null, false, false, com.tencent.mm.plugin.finder.feed.model.j9.f108098d, 60, null);
                } else if (pullType != 1000) {
                    this.f107685x = true;
                } else {
                    pm0.z.b(xy2.b.f458155b, "TopicFeedLoaderRefreshCheck", false, null, null, false, false, com.tencent.mm.plugin.finder.feed.model.k9.f108120d, 60, null);
                }
                int i17 = ((com.tencent.mm.plugin.finder.feed.model.d9) e9Var).f107811c.f108198m;
                if (i17 != -1) {
                    response.setPullType(i17);
                } else {
                    response.setPullType(1);
                }
            } else if ((e9Var instanceof com.tencent.mm.plugin.finder.feed.model.c9) && response.getPullType() != 1000) {
                pm0.z.b(xy2.b.f458155b, "TopicFeedLoaderRefreshCheck", this.f107685x, null, null, false, false, com.tencent.mm.plugin.finder.feed.model.l9.f108158d, 60, null);
                response.setPullType(2);
                this.f107678q = false;
            }
            if (2 == response.getPullType()) {
                setInnerLoadingMore(false);
            }
            com.tencent.mars.xlog.Log.i(getF123427d(), "resp tag: " + f9Var.f107865e);
            if (z17) {
                r45.xn5 xn5Var3 = ((com.tencent.mm.plugin.finder.feed.model.d9) e9Var).f107811c.f108197l;
                java.lang.String string4 = (xn5Var3 == null || (list2 = xn5Var3.getList(0)) == null || (r03Var2 = (r45.r03) list2.get(0)) == null) ? null : r03Var2.getString(0);
                if (string4 == null || string4.length() == 0) {
                    yz5.a aVar = this.A;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    java.lang.String str2 = f9Var.f107865e;
                    if ((str2 == null || str2.equals(string4)) ? false : true) {
                        com.tencent.mars.xlog.Log.i(getF123427d(), "resp tag: " + f9Var.f107865e + " ,not match current tag " + string4 + ",return");
                        return;
                    }
                    yz5.a aVar2 = this.A;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            }
        }
        super.onFetchDone(response);
        xc2.k0 k0Var = (xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
        java.util.List incrementList4 = response.getIncrementList();
        r45.qt2 contextObj = getContextObj();
        k0Var.h7(incrementList4, contextObj != null ? contextObj.getInteger(5) : 0);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchInitDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse initResponse) {
        kotlin.jvm.internal.o.g(initResponse, "initResponse");
        com.tencent.mm.plugin.finder.feed.model.f9 f9Var = initResponse instanceof com.tencent.mm.plugin.finder.feed.model.f9 ? (com.tencent.mm.plugin.finder.feed.model.f9) initResponse : null;
        if (f9Var != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.q0 initDone = getInitDone();
            com.tencent.mm.plugin.finder.feed.model.b9 b9Var = initDone instanceof com.tencent.mm.plugin.finder.feed.model.b9 ? (com.tencent.mm.plugin.finder.feed.model.b9) initDone : null;
            if (b9Var != null) {
                com.tencent.mm.plugin.finder.feed.ui.an anVar = (com.tencent.mm.plugin.finder.feed.ui.an) b9Var;
                r45.r03 r03Var = f9Var.f107861a;
                long integer = r03Var != null ? r03Var.getInteger(2) : 0L;
                com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI = anVar.f109683a;
                finderTopicFeedUI.E = integer;
                if (finderTopicFeedUI.F == 0) {
                    finderTopicFeedUI.F = r03Var != null ? r03Var.getLong(1) : 0L;
                }
                long j17 = finderTopicFeedUI.F;
                java.lang.String topicName = anVar.f109685c;
                kotlin.jvm.internal.o.g(topicName, "topicName");
                com.tencent.mm.plugin.finder.viewmodel.component.ut utVar = (com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.a(finderTopicFeedUI).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
                utVar.P6("feedid", pm0.v.u(anVar.f109684b));
                utVar.P6("topicid", pm0.v.u(j17));
                utVar.P6("topicname", topicName);
                com.tencent.mm.plugin.finder.feed.x10 x10Var = finderTopicFeedUI.f109576v;
                if (x10Var == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                android.view.View w17 = x10Var.w();
                java.lang.String h17 = com.tencent.mm.plugin.finder.assist.w2.h(r03Var != null ? r03Var.getInteger(2) : 0);
                android.widget.TextView textView = w17 != null ? (android.widget.TextView) w17.findViewById(com.tencent.mm.R.id.ogu) : null;
                if (textView != null) {
                    textView.setText(finderTopicFeedUI.getContext().getResources().getString(com.tencent.mm.R.string.f8n, h17));
                }
                finderTopicFeedUI.e7(r03Var);
            }
        }
        super.onFetchInitDone(initResponse);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onSaveLastBuffer(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public boolean requestLoadMore(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void requestRefresh() {
    }
}
