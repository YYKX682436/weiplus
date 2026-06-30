package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1441x3e7b17c6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/detector/FinderMMPlayerDetector;", "Lcom/tencent/plugin/finder/detector/api/detect/FinderEventDetector;", "Lyb2/a;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.detector.FinderMMPlayerDetector */
/* loaded from: classes10.dex */
public final class C13711x533e3bcd extends com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25299xa70d21da<yb2.a> {
    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public java.lang.String g() {
        return "MMPlayerDetector";
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public long h() {
        return 0L;
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public java.util.Map i(java.lang.String detectorSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectorSource, "detectorSource");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f296759d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            android.view.View mo58782x6b2da91c = ((yb2.a) ((ls5.f) entry.getValue()).f402664a).mo58782x6b2da91c();
            android.app.Activity f17 = f(mo58782x6b2da91c);
            ls5.k mo58776x51603325 = ((yb2.a) ((ls5.f) entry.getValue()).f402664a).mo58776x51603325();
            android.view.View view = mo58776x51603325 != null ? ((ls5.d) mo58776x51603325).f402655b : null;
            boolean isDestroyed = f17 != null ? f17.isDestroyed() : true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLeaks eventName: ");
            sb6.append(((ls5.f) entry.getValue()).b());
            sb6.append(" detectorSource: ");
            sb6.append(detectorSource);
            sb6.append(" playerView: ");
            sb6.append(mo58782x6b2da91c);
            sb6.append(" pageContext: ");
            sb6.append(f17);
            sb6.append(" hasCode: ");
            sb6.append(f17 != null ? java.lang.Integer.valueOf(f17.hashCode()) : null);
            sb6.append(" isActivityDestroyed: ");
            sb6.append(isDestroyed);
            sb6.append(" miniWindowView: ");
            sb6.append(view);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f296760e, sb6.toString());
            if ((!isDestroyed || r(mo58782x6b2da91c) || r(view)) ? false : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public int j() {
        return 5;
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public java.lang.String k(ls5.f event, ns5.a detectParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectParams, "detectParams");
        java.lang.Object obj = event.f402664a;
        android.view.View mo58782x6b2da91c = ((yb2.a) obj).mo58782x6b2da91c();
        android.app.Activity f17 = f(mo58782x6b2da91c);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("player", obj);
        jSONObject.put("isMute", java.lang.Boolean.valueOf(((yb2.a) obj).mo58786xb9a62e63()));
        java.lang.Object obj2 = mo58782x6b2da91c;
        if (mo58782x6b2da91c == null) {
            obj2 = "null";
        }
        jSONObject.put("playerView", obj2);
        jSONObject.put("activityContext", f17 != null ? f17 : "null");
        jSONObject.put("detectorSource", detectParams.f421225a);
        jSONObject.put("isDestroyed", f17 != null ? f17.isDestroyed() : true);
        jSONObject.put("traceDump", detectParams.f421226b);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public void l(ls5.f event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public boolean m() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C0).mo141623x754a37bb()).r()).intValue() == 1;
    }
}
