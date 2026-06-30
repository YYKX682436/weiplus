package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f189240d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f189241e;

    /* renamed from: f, reason: collision with root package name */
    public final int f189242f;

    /* renamed from: g, reason: collision with root package name */
    public final long f189243g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f189244h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f189245i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, cl0.g data) {
        super(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f189240d = j17;
        this.f189241e = "";
        this.f189244h = "";
        this.f189245i = "";
        java.lang.String mo15082x48bce8a4 = data.mo15082x48bce8a4("url");
        this.f189241e = mo15082x48bce8a4;
        int optInt = data.optInt("ad_type");
        this.f189242f = optInt;
        java.lang.String mo15082x48bce8a42 = data.mo15082x48bce8a4("uxinfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a42, "optString(...)");
        this.f189244h = mo15082x48bce8a42;
        long optLong = data.optLong("canvas_id");
        this.f189243g = optLong;
        int optInt2 = data.optInt("canvas_type");
        java.lang.String mo15082x48bce8a43 = data.mo15082x48bce8a4("button_title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a43, "optString(...)");
        this.f189245i = mo15082x48bce8a43;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSnsCache", "data:" + data + " url :" + mo15082x48bce8a4 + " type :" + optInt + " canvasId:" + optLong + " canvasType:" + optInt2 + " buttonTitle:" + mo15082x48bce8a43 + " uxInfo:" + mo15082x48bce8a42);
    }

    /* renamed from: toString */
    public java.lang.String m56314x9616526c() {
        return "AdSnsCache id:" + pm0.v.u(this.f189240d) + " type:" + this.f189242f + " canvasId:" + this.f189243g + " url:" + this.f189241e;
    }
}
