package com.tencent.mm.plugin.finder.detector;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/detector/FinderMMPlayerDetector;", "Lcom/tencent/plugin/finder/detector/api/detect/FinderEventDetector;", "Lyb2/a;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderMMPlayerDetector extends com.tencent.plugin.finder.detector.api.detect.FinderEventDetector<yb2.a> {
    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public java.lang.String g() {
        return "MMPlayerDetector";
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public long h() {
        return 0L;
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public java.util.Map i(java.lang.String detectorSource) {
        kotlin.jvm.internal.o.g(detectorSource, "detectorSource");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215226d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            android.view.View playerView = ((yb2.a) ((ls5.f) entry.getValue()).f321131a).getPlayerView();
            android.app.Activity f17 = f(playerView);
            ls5.k eventDetectorAdapter = ((yb2.a) ((ls5.f) entry.getValue()).f321131a).getEventDetectorAdapter();
            android.view.View view = eventDetectorAdapter != null ? ((ls5.d) eventDetectorAdapter).f321122b : null;
            boolean isDestroyed = f17 != null ? f17.isDestroyed() : true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLeaks eventName: ");
            sb6.append(((ls5.f) entry.getValue()).b());
            sb6.append(" detectorSource: ");
            sb6.append(detectorSource);
            sb6.append(" playerView: ");
            sb6.append(playerView);
            sb6.append(" pageContext: ");
            sb6.append(f17);
            sb6.append(" hasCode: ");
            sb6.append(f17 != null ? java.lang.Integer.valueOf(f17.hashCode()) : null);
            sb6.append(" isActivityDestroyed: ");
            sb6.append(isDestroyed);
            sb6.append(" miniWindowView: ");
            sb6.append(view);
            com.tencent.mars.xlog.Log.i(this.f215227e, sb6.toString());
            if ((!isDestroyed || r(playerView) || r(view)) ? false : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public int j() {
        return 5;
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public java.lang.String k(ls5.f event, ns5.a detectParams) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(detectParams, "detectParams");
        java.lang.Object obj = event.f321131a;
        android.view.View playerView = ((yb2.a) obj).getPlayerView();
        android.app.Activity f17 = f(playerView);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("player", obj);
        jSONObject.put("isMute", java.lang.Boolean.valueOf(((yb2.a) obj).isMute()));
        java.lang.Object obj2 = playerView;
        if (playerView == null) {
            obj2 = "null";
        }
        jSONObject.put("playerView", obj2);
        jSONObject.put("activityContext", f17 != null ? f17 : "null");
        jSONObject.put("detectorSource", detectParams.f339692a);
        jSONObject.put("isDestroyed", f17 != null ? f17.isDestroyed() : true);
        jSONObject.put("traceDump", detectParams.f339693b);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public void l(ls5.f event) {
        kotlin.jvm.internal.o.g(event, "event");
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public boolean m() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C0).getValue()).r()).intValue() == 1;
    }
}
