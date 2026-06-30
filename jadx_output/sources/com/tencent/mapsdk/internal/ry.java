package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ry implements com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f51302a = "yyyy/MM/dd HH时";

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String[] f51303c = {"交通事故", "交通管制", "道路施工", "路上障碍物", "活动", "恶劣天气", "灾害", "拥堵", "检查", "一般事故", "积水", "其他事件"};

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String[] f51304d = {"发生", "出现", "有", "有", "有", "出现", "有", "出现", "有", "发生", "有", "有"};

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail f51305b;

    public ry(com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail detail) {
        this.f51305b = detail;
    }

    private com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail a() {
        return this.f51305b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final java.lang.String getDescription() {
        int i17 = this.f51305b.basic.type;
        java.lang.String str = i17 > f51303c.length ? f51304d[r1.length - 1] : f51304d[i17 - 1];
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(f51302a, java.util.Locale.US);
        return simpleDateFormat.format(new java.util.Date(this.f51305b.basic.start_time * 1000)) + " - " + simpleDateFormat.format(new java.util.Date(this.f51305b.basic.end_time * 1000)) + (char) 65292 + getRoadName() + str + getType();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final int getEndTime() {
        return this.f51305b.basic.end_time;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final java.lang.String getMessage() {
        return this.f51305b.basic.message;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final java.lang.String getRoadName() {
        return this.f51305b.basic.roadname;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final java.lang.String getSource() {
        return this.f51305b.basic.source;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final int getStartTime() {
        return this.f51305b.basic.start_time;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final java.lang.String getType() {
        int i17 = this.f51305b.basic.type;
        java.lang.String[] strArr = f51303c;
        return i17 > strArr.length ? strArr[strArr.length - 1] : strArr[i17 - 1];
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent
    public final int getUpdateTime() {
        return this.f51305b.basic.update_time;
    }
}
