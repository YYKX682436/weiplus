package com.tencent.mm.plugin.audio.flutter.plugin;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/audio/flutter/plugin/FlutterBizAudioPlugin;", "Lcom/tencent/pigeon/biz_audio/BizAudioApi;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FlutterBizAudioPlugin implements com.tencent.pigeon.biz_audio.BizAudioApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f92491d;

    @Override // com.tencent.pigeon.biz_audio.BizAudioApi
    public void addToPreload(java.lang.String url, long j17, long j18, java.lang.String str) {
        kotlin.jvm.internal.o.g(url, "url");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(url, (int) j17, (int) j18, str, new java.lang.Object[0]);
    }

    @Override // com.tencent.pigeon.biz_audio.BizAudioApi
    public void addToStar(byte[] listenItemData, boolean z17, com.tencent.pigeon.biz_audio.BizStarSnapInfo bizStarSnapInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(listenItemData, "listenItemData");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            bw5.v70 parseFrom = new bw5.v70().parseFrom(listenItemData);
            mx.e eVar = new mx.e(new mx.f(this.f92491d));
            kotlin.jvm.internal.o.d(parseFrom);
            eVar.d0(parseFrom, z17, null, null, new vm1.y0(callback));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FlutterBizAudioPlugin", "addToStar Exception=" + e17);
        }
    }

    @Override // com.tencent.pigeon.biz_audio.BizAudioApi
    public void containsInStar(java.util.List listenId, yz5.l callback) {
        kotlin.jvm.internal.o.g(listenId, "listenId");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listenId.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
            multiTaskInfo.field_id = str;
            multiTaskInfo.field_type = 24;
            if (((com.tencent.mm.plugin.multitask.p1) l0Var).Ri(multiTaskInfo)) {
                arrayList.add(str);
            }
        }
        com.tencent.mars.xlog.Log.i("FlutterBizAudioPlugin", "containsInStar check " + arrayList.size());
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(arrayList)));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("FlutterBizAudioPlugin", "onAttachedToActivity");
        android.app.Activity activity = binding.getActivity();
        this.f92491d = activity;
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity == null || (mo133getLifecycle = mMActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz_audio.BizAudioApi.Companion companion = com.tencent.pigeon.biz_audio.BizAudioApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_audio.BizAudioApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        androidx.lifecycle.o mo133getLifecycle;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        android.app.Activity activity = this.f92491d;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : null);
        com.tencent.mars.xlog.Log.i("FlutterBizAudioPlugin", sb6.toString());
        android.app.Activity activity2 = this.f92491d;
        com.tencent.mm.ui.MMActivity mMActivity = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
        if (mMActivity != null && (mo133getLifecycle = mMActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(this);
        }
        this.f92491d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f92491d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz_audio.BizAudioApi.Companion companion = com.tencent.pigeon.biz_audio.BizAudioApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_audio.BizAudioApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f92491d = binding.getActivity();
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("FlutterBizAudioPlugin", "onStateChanged() event = " + event);
    }

    @Override // com.tencent.pigeon.biz_audio.BizAudioApi
    public void openUrl(com.tencent.pigeon.biz_audio.BizAudioArticleInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vm1.z0(null), 3, null);
        yw.h1 h1Var = yw.h1.f466332a;
        com.tencent.pigeon.biz_base.BizArticleInfo bizArticleInfo = new com.tencent.pigeon.biz_base.BizArticleInfo(info.getMsgId(), info.getSvrId(), info.getPos(), info.getPosInCard(), info.getOpenScene(), info.getSubScene(), info.getUrl(), info.getItemShowType(), info.getUserName(), info.getNickName(), info.getTitle(), info.getCoverUrl(), info.getBizFinderEnterId(), info.getRankSessionId(), info.getMsgLocalId(), info.getBizSessionId(), info.getJumpPaths(), info.getHideShareMenu());
        android.content.Context context = this.f92491d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        h1Var.s(bizArticleInfo, context);
    }

    @Override // com.tencent.pigeon.biz_audio.BizAudioApi
    public void removeStar(byte[] listenItemData, yz5.l callback) {
        kotlin.jvm.internal.o.g(listenItemData, "listenItemData");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            try {
                bw5.v70 parseFrom = new bw5.v70().parseFrom(listenItemData);
                mx.e eVar = new mx.e(new mx.f(this.f92491d));
                java.lang.String listenId = parseFrom.getListenId();
                kotlin.jvm.internal.o.f(listenId, "getListenId(...)");
                eVar.e0(listenId, this.f92491d);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FlutterBizAudioPlugin", "removeStar Exception=" + e17);
            }
        }
    }
}
