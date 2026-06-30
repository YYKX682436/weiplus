package com.luggage.trace;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 Bw\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\fj\b\u0012\u0004\u0012\u00020\u0013`\u000e\u0012\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00160\fj\b\u0012\u0004\u0012\u00020\u0016`\u000e\u0012\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00190\fj\b\u0012\u0004\u0012\u00020\u0019`\u000e¢\u0006\u0004\b\u001c\u0010\u001dBI\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\fj\b\u0012\u0004\u0012\u00020\u0013`\u000e¢\u0006\u0004\b\u001c\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\fj\b\u0012\u0004\u0012\u00020\u0013`\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R'\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00160\fj\b\u0012\u0004\u0012\u00020\u0016`\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R'\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00190\fj\b\u0012\u0004\u0012\u00020\u0019`\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012¨\u0006!"}, d2 = {"Lcom/luggage/trace/ProfileInfo;", "", "", "toString", "toJsonString", "", "startTime", "D", "getStartTime", "()D", "endTime", "getEndTime", "Ljava/util/ArrayList;", "Lcom/luggage/trace/Frame;", "Lkotlin/collections/ArrayList;", "frameList", "Ljava/util/ArrayList;", "getFrameList", "()Ljava/util/ArrayList;", "Lcom/luggage/trace/Event;", "eventList", "getEventList", "Lcom/luggage/trace/ScreenShotInfo;", "screenShotInfoList", "getScreenShotInfoList", "Lcom/luggage/trace/MemoryUsages;", "memoryUsagesList", "getMemoryUsagesList", "<init>", "(DDLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "(DDLjava/util/ArrayList;Ljava/util/ArrayList;)V", "Companion", "pb/d", "trace_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ProfileInfo {
    public static final pb.d Companion = new pb.d(null);
    private final double endTime;
    private final java.util.ArrayList<com.luggage.trace.Event> eventList;
    private final java.util.ArrayList<com.luggage.trace.Frame> frameList;
    private final java.util.ArrayList<com.luggage.trace.MemoryUsages> memoryUsagesList;
    private final java.util.ArrayList<com.luggage.trace.ScreenShotInfo> screenShotInfoList;
    private final double startTime;

    public ProfileInfo(double d17, double d18, java.util.ArrayList<com.luggage.trace.Frame> frameList, java.util.ArrayList<com.luggage.trace.Event> eventList, java.util.ArrayList<com.luggage.trace.ScreenShotInfo> screenShotInfoList, java.util.ArrayList<com.luggage.trace.MemoryUsages> memoryUsagesList) {
        kotlin.jvm.internal.o.g(frameList, "frameList");
        kotlin.jvm.internal.o.g(eventList, "eventList");
        kotlin.jvm.internal.o.g(screenShotInfoList, "screenShotInfoList");
        kotlin.jvm.internal.o.g(memoryUsagesList, "memoryUsagesList");
        this.startTime = d17;
        this.endTime = d18;
        this.frameList = frameList;
        this.eventList = eventList;
        this.screenShotInfoList = screenShotInfoList;
        this.memoryUsagesList = memoryUsagesList;
    }

    public final double getEndTime() {
        return this.endTime;
    }

    public final java.util.ArrayList<com.luggage.trace.Event> getEventList() {
        return this.eventList;
    }

    public final java.util.ArrayList<com.luggage.trace.Frame> getFrameList() {
        return this.frameList;
    }

    public final java.util.ArrayList<com.luggage.trace.MemoryUsages> getMemoryUsagesList() {
        return this.memoryUsagesList;
    }

    public final java.util.ArrayList<com.luggage.trace.ScreenShotInfo> getScreenShotInfoList() {
        return this.screenShotInfoList;
    }

    public final double getStartTime() {
        return this.startTime;
    }

    public final java.lang.String toJsonString() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("startTime", this.startTime);
        jSONObject.put("endTime", this.endTime);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.luggage.trace.Frame> it = this.frameList.iterator();
        while (it.hasNext()) {
            com.luggage.trace.Frame next = it.next();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, next.getName());
            jSONObject2.put("category", next.getCategory());
            jSONObject2.put("startTime", next.getStartTime());
            jSONObject2.put("endTime", next.getEndTime());
            jSONObject2.put("thread", next.getThread());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("frameList", jSONArray);
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        java.util.Iterator<com.luggage.trace.Event> it6 = this.eventList.iterator();
        while (it6.hasNext()) {
            com.luggage.trace.Event next2 = it6.next();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, next2.getName());
            jSONObject3.put("category", next2.getCategory());
            jSONObject3.put("startTime", next2.getStartTime());
            jSONObject3.put("thread", next2.getThread());
            jSONArray2.put(jSONObject3);
        }
        jSONObject.put("eventList", jSONArray2);
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        java.util.Iterator<com.luggage.trace.ScreenShotInfo> it7 = this.screenShotInfoList.iterator();
        while (it7.hasNext()) {
            com.luggage.trace.ScreenShotInfo next3 = it7.next();
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, next3.getData());
            jSONObject4.put("startTime", next3.getStartTime());
            jSONArray3.put(jSONObject4);
        }
        jSONObject.put("screenShotInfoList", jSONArray3);
        org.json.JSONArray jSONArray4 = new org.json.JSONArray();
        java.util.Iterator<com.luggage.trace.MemoryUsages> it8 = this.memoryUsagesList.iterator();
        while (it8.hasNext()) {
            com.luggage.trace.MemoryUsages next4 = it8.next();
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("jsHeapSizeUsed", next4.getJsHeapSizeUsed());
            jSONObject5.put("allUsed", next4.getAllUsed());
            jSONObject5.put("startTime", next4.getStartTime());
            jSONArray4.put(jSONObject5);
        }
        jSONObject.put("memoryUsagesList", jSONArray4);
        java.lang.String jSONObject6 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject6, "jsonObject.toString()");
        return jSONObject6;
    }

    public java.lang.String toString() {
        return "ProfileInfo:startTime:" + this.startTime + " endTime:" + this.endTime + "\nFrames:\n" + kz5.n0.g0(this.frameList, "\n", null, null, 0, null, pb.f.f353115d, 30, null) + "\nEvents:\n" + kz5.n0.g0(this.eventList, "\n", null, null, 0, null, pb.e.f353114d, 30, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileInfo(double d17, double d18, java.util.ArrayList<com.luggage.trace.Frame> frameList, java.util.ArrayList<com.luggage.trace.Event> eventList) {
        this(d17, d18, frameList, eventList, new java.util.ArrayList(), new java.util.ArrayList());
        kotlin.jvm.internal.o.g(frameList, "frameList");
        kotlin.jvm.internal.o.g(eventList, "eventList");
    }
}
