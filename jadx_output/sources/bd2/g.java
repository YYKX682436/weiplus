package bd2;

/* loaded from: classes2.dex */
public final class g implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.finder.FinderDislikeNativeAPI {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f19249d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19250e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f19251f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f19252g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19253h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.pigeon.finder.FinderDislikeFlutterAPI f19254i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f19255m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.pigeon.finder.FinderDislikeReasonFetchResult f19256n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19257o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f19258p;

    public g(android.content.Context context, long j17, java.lang.String str, java.lang.String objectNonceId, boolean z17, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        this.f19249d = context;
        this.f19250e = j17;
        this.f19251f = str;
        this.f19252g = objectNonceId;
        this.f19253h = z17;
        this.f19255m = new java.lang.ref.WeakReference(finderVideoLayout);
        this.f19256n = new com.tencent.pigeon.finder.FinderDislikeReasonFetchResult(true, false, null, 4, null);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f19257o = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128005wb).getValue()).r()).intValue() == 1;
        this.f19258p = kz5.p0.f313996d;
    }

    public final void a() {
        com.tencent.pigeon.finder.FinderDislikeReasonFetchResult finderDislikeReasonFetchResult = new com.tencent.pigeon.finder.FinderDislikeReasonFetchResult(true, false, null, 4, null);
        this.f19256n = finderDislikeReasonFetchResult;
        com.tencent.pigeon.finder.FinderDislikeFlutterAPI finderDislikeFlutterAPI = this.f19254i;
        if (finderDislikeFlutterAPI != null) {
            finderDislikeFlutterAPI.updateDislikeReasonFetchResult(finderDislikeReasonFetchResult, bd2.f.f19248d);
        }
        bd2.r.f19284a.a(this.f19249d, this.f19250e, this.f19251f, this.f19253h, new bd2.c(this), new bd2.d(this));
    }

    @Override // com.tencent.pigeon.finder.FinderDislikeNativeAPI
    public long getPlayPercent() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) this.f19255m.get();
        if (finderVideoLayout != null) {
            cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
            boolean z17 = false;
            if (playInfo != null && (feedData = playInfo.f223745a) != null && feedData.getFeedId() == this.f19250e) {
                z17 = true;
            }
            if (!z17) {
                finderVideoLayout = null;
            }
            if (finderVideoLayout != null) {
                return finderVideoLayout.getPlayPercent();
            }
        }
        return 0L;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderDislikeNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderDislikeNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderDislikeNativeAPI.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f19254i = new com.tencent.pigeon.finder.FinderDislikeFlutterAPI(binaryMessenger2, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderDislikeNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderDislikeNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderDislikeNativeAPI.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f19254i = null;
        this.f19255m.clear();
    }

    @Override // com.tencent.pigeon.finder.FinderDislikeNativeAPI
    public void onDislikePanelDismiss(com.tencent.pigeon.finder.FinderDislikePanelDismissType dismissType) {
        kotlin.jvm.internal.o.g(dismissType, "dismissType");
        com.tencent.mars.xlog.Log.i("FinderFlutterDislikePlugin", "onDislikePanelDismiss: " + dismissType);
        bd2.r rVar = bd2.r.f19284a;
        if (rVar.b()) {
            com.tencent.pigeon.finder.FinderDislikePanelDismissType finderDislikePanelDismissType = com.tencent.pigeon.finder.FinderDislikePanelDismissType.CANCEL;
            android.content.Context context = this.f19249d;
            long j17 = this.f19250e;
            if (dismissType != finderDislikePanelDismissType) {
                boolean z17 = this.f19253h;
                if (z17) {
                    com.tencent.mm.autogen.events.LiveNotInterestedClickEvent liveNotInterestedClickEvent = new com.tencent.mm.autogen.events.LiveNotInterestedClickEvent();
                    liveNotInterestedClickEvent.f54474g.f8381a = j17;
                    liveNotInterestedClickEvent.e();
                }
                rVar.c(this.f19249d, this.f19250e, this.f19251f, this.f19252g, java.lang.Boolean.valueOf(z17), this.f19258p);
                rVar.d(context, j17, false);
            } else {
                com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent finderNoInterestFeedScrollEvent = new com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent();
                am.tc tcVar = finderNoInterestFeedScrollEvent.f54314g;
                tcVar.f7998a = false;
                tcVar.f7999b = j17;
                finderNoInterestFeedScrollEvent.e();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = context.getString(com.tencent.mm.R.string.oex);
                e4Var.b(com.tencent.mm.R.raw.icons_filled_done);
                e4Var.c();
            }
        }
        this.f19255m.clear();
    }

    @Override // com.tencent.pigeon.finder.FinderDislikeNativeAPI
    public void retryFetchDislikeReasons() {
        a();
    }

    @Override // com.tencent.pigeon.finder.FinderDislikeNativeAPI
    public void submitFeedDislikeReasons(java.util.List selectedReasons) {
        kotlin.jvm.internal.o.g(selectedReasons, "selectedReasons");
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
        java.util.Iterator it = selectedReasons.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((byte[]) next) != null) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList<r45.rw4> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (byte[] bArr : arrayList) {
            r45.rw4 rw4Var = new r45.rw4();
            rw4Var.parseFrom(bArr);
            arrayList2.add(rw4Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("submitFeedDislikeReasons:");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        for (r45.rw4 rw4Var2 : arrayList2) {
            arrayList3.add(rw4Var2.getInteger(0) + '-' + rw4Var2.getString(1));
        }
        sb6.append(kz5.n0.g0(arrayList3, ",", null, null, 0, null, null, 62, null));
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("FinderFlutterDislikePlugin", sb6.toString());
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        for (r45.rw4 rw4Var3 : arrayList2) {
            r45.qw4 qw4Var = new r45.qw4();
            qw4Var.set(0, java.lang.Integer.valueOf(rw4Var3.getInteger(0)));
            qw4Var.set(1, rw4Var3.getString(2));
            arrayList4.add(qw4Var);
        }
        this.f19258p = arrayList4;
        bd2.r rVar = bd2.r.f19284a;
        if (!rVar.b()) {
            rVar.c(this.f19249d, this.f19250e, this.f19251f, this.f19252g, java.lang.Boolean.valueOf(this.f19253h), this.f19258p);
        }
        if (this.f19257o) {
            return;
        }
        rVar.d(this.f19249d, this.f19250e, true);
    }
}
