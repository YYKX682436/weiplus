package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.plugin.finder.feed.model.internal.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f107707d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107708e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107709f;

    /* renamed from: g, reason: collision with root package name */
    public final long f107710g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f107711h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f107712i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, cl0.g data) {
        super(j17);
        kotlin.jvm.internal.o.g(data, "data");
        this.f107707d = j17;
        this.f107708e = "";
        this.f107711h = "";
        this.f107712i = "";
        java.lang.String optString = data.optString("url");
        this.f107708e = optString;
        int optInt = data.optInt("ad_type");
        this.f107709f = optInt;
        java.lang.String optString2 = data.optString("uxinfo");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f107711h = optString2;
        long optLong = data.optLong("canvas_id");
        this.f107710g = optLong;
        int optInt2 = data.optInt("canvas_type");
        java.lang.String optString3 = data.optString("button_title");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        this.f107712i = optString3;
        com.tencent.mars.xlog.Log.i("AdSnsCache", "data:" + data + " url :" + optString + " type :" + optInt + " canvasId:" + optLong + " canvasType:" + optInt2 + " buttonTitle:" + optString3 + " uxInfo:" + optString2);
    }

    public java.lang.String toString() {
        return "AdSnsCache id:" + pm0.v.u(this.f107707d) + " type:" + this.f107709f + " canvasId:" + this.f107710g + " url:" + this.f107708e;
    }
}
