package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveKTVReplayUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Lvm2/f;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveKTVReplayUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI implements vm2.f {
    public static final /* synthetic */ int D = 0;
    public android.widget.TextView A;
    public dk2.ca B;

    /* renamed from: v, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f109377v;

    /* renamed from: w, reason: collision with root package name */
    public r45.b54 f109378w;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.FrameLayout f109380y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveKTVReplayCircleProgressView f109381z;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f109379x = new java.util.ArrayList();
    public final jz5.g C = jz5.h.b(com.tencent.mm.plugin.finder.feed.ui.ga.f110080d);

    public final void d7(java.util.List list) {
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayUI", "startDownloadVideos: videoCount=" + list.size());
        android.widget.FrameLayout frameLayout = this.f109380y;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveKTVReplayCircleProgressView finderLiveKTVReplayCircleProgressView = this.f109381z;
        if (finderLiveKTVReplayCircleProgressView != null) {
            finderLiveKTVReplayCircleProgressView.setProgress(0);
        }
        int size = list.size();
        android.widget.TextView textView = this.A;
        if (textView != null) {
            textView.setText(getString(com.tencent.mm.R.string.ot9, 0, java.lang.Integer.valueOf(size)));
        }
        kotlinx.coroutines.l.d(v65.m.b(this), null, null, new com.tencent.mm.plugin.finder.feed.ui.pa(this, list, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488909ea0;
    }

    @Override // vm2.f
    public void m1(dk2.rf micReplayInfo, int i17) {
        kotlin.jvm.internal.o.g(micReplayInfo, "micReplayInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickItem: micReplayInfo = ");
        sb6.append(micReplayInfo);
        sb6.append(",status = ");
        int i18 = micReplayInfo.f234045m;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayUI", sb6.toString());
        if (i18 != 3) {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayUI", "onClickItem: status is not success,status: " + i18);
            return;
        }
        java.lang.String str = micReplayInfo.f234039d;
        if (str == null) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("openFinderPostGallery: mediaId = ");
        sb7.append(str);
        sb7.append(",coverImageUrl = ");
        java.lang.String str2 = micReplayInfo.f234041f;
        sb7.append(str2);
        sb7.append(",micReplayUrl = ");
        java.lang.String str3 = micReplayInfo.f234040e;
        sb7.append(str3);
        sb7.append(",duration = ");
        float f17 = micReplayInfo.f234042g;
        sb7.append(f17);
        sb7.append(",liveId = ");
        java.lang.Long l17 = micReplayInfo.f234046n;
        sb7.append(l17);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayUI", sb7.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams finderLiveGalleryParams = new com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams();
        finderLiveGalleryParams.f66603d = 1;
        finderLiveGalleryParams.f66604e = str;
        finderLiveGalleryParams.f66605f = str2;
        finderLiveGalleryParams.f66606g = str3;
        finderLiveGalleryParams.f66607h = f17;
        finderLiveGalleryParams.f66608i = java.lang.String.valueOf(l17);
        arrayList.add(finderLiveGalleryParams);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        t40.b bVar = new t40.b("task_FinderCdnDownloader", 2, 0, com.tencent.mm.plugin.finder.assist.e9.f102138g, t40.d.f415480h, 111);
        s40.x0 x0Var = (s40.x0) i95.n0.c(s40.x0.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((ci5.h) x0Var).wi(context, bVar, arrayList);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        androidx.recyclerview.widget.f2 adapter;
        java.util.LinkedList<r45.gl4> list;
        java.util.LinkedList list2;
        r45.gl4 gl4Var;
        java.util.LinkedList list3;
        r45.gl4 gl4Var2;
        java.lang.String l17;
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.oud);
        setActionbarColor(getColor(com.tencent.mm.R.color.f478494f));
        setBackGroundColorResource(com.tencent.mm.R.color.f478494f);
        hideActionbarLine();
        setBounceEnabled(false);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.ha(this));
        try {
            r45.b54 b54Var = new r45.b54();
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_PARAMS_REPLAY_INFO");
            if (byteArrayExtra != null && b54Var.parseFrom(byteArrayExtra) != null) {
                this.f109378w = b54Var;
                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f484693tk0);
                this.f109377v = recyclerView;
                if (recyclerView != null) {
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context));
                }
                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f109377v;
                java.util.ArrayList arrayList = this.f109379x;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(new vm2.e(arrayList, this));
                }
                this.f109380y = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.tjy);
                this.f109381z = (com.tencent.mm.plugin.finder.live.widget.FinderLiveKTVReplayCircleProgressView) findViewById(com.tencent.mm.R.id.tjx);
                this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.tjz);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                this.B = new dk2.ca(this, com.tencent.mm.plugin.finder.assist.e9.f102138g);
                java.lang.String str2 = "";
                if (this.f109378w == null) {
                    com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayUI", "updateRecyclerView: no replay info");
                } else {
                    com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayUI", "updateRecyclerView,old size: " + arrayList.size());
                    arrayList.clear();
                    arrayList.add(new vm2.k(1));
                    i95.m c17 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c17;
                    ml2.u1 u1Var = ml2.u1.f328078q3;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    r45.b54 b54Var2 = this.f109378w;
                    if (b54Var2 == null || (list2 = b54Var2.getList(0)) == null || (gl4Var = (r45.gl4) kz5.n0.Z(list2)) == null || (str = java.lang.Long.valueOf(gl4Var.getLong(10)).toString()) == null) {
                        str = "";
                    }
                    linkedHashMap.put("live_id", str);
                    zy2.zb.I8(zbVar, u1Var, linkedHashMap, null, "378", null, null, false, 52, null);
                    int a17 = com.tencent.mm.ui.zk.a(getContext(), 16);
                    r45.b54 b54Var3 = this.f109378w;
                    if (b54Var3 != null && (list = b54Var3.getList(0)) != null) {
                        for (r45.gl4 gl4Var3 : list) {
                            kotlin.jvm.internal.o.d(gl4Var3);
                            dk2.rf rfVar = new dk2.rf(gl4Var3);
                            com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayUI", "add info: " + rfVar);
                            int i17 = rfVar.f234045m;
                            if (i17 == 3) {
                                arrayList.add(new vm2.n(rfVar, a17));
                            } else {
                                com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayUI", "add info: status is not success,status: " + i17);
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayUI", "updateRecyclerView,new size: " + arrayList.size());
                    androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f109377v;
                    if (recyclerView3 != null && (adapter = recyclerView3.getAdapter()) != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
                i95.m c18 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.u1 u1Var2 = ml2.u1.f328075p3;
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                r45.b54 b54Var4 = this.f109378w;
                if (b54Var4 != null && (list3 = b54Var4.getList(0)) != null && (gl4Var2 = (r45.gl4) kz5.n0.Z(list3)) != null && (l17 = java.lang.Long.valueOf(gl4Var2.getLong(10)).toString()) != null) {
                    str2 = l17;
                }
                linkedHashMap2.put("live_id", str2);
                zy2.zb.I8(zbVar2, u1Var2, linkedHashMap2, null, "378", null, null, false, 52, null);
                return;
            }
            com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayUI", "onCreate: no replay info");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayUI", "onCreate: " + e17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dk2.ca caVar = this.B;
        if (caVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelAllTasks: taskCount=");
            java.util.Map map = caVar.f233292b;
            sb6.append(map.size());
            com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", sb6.toString());
            caVar.f233293c = false;
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                ((dn.o) entry.getValue()).f241815c2 = null;
                ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                t21.o2.Di().g(str, new java.lang.Object[0]);
            }
            linkedHashMap.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if ((r4 == null || r4.length() == 0) == false) goto L36;
     */
    @Override // vm2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s5() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI.s5():void");
    }
}
