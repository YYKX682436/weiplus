package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView f80719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80720e;

    public w(com.tencent.mm.plugin.appbrand.jsapi.coverview.x xVar, com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView wxaScrollView, int i17) {
        this.f80719d = wxaScrollView;
        this.f80720e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView wxaScrollView = this.f80719d;
        wxaScrollView.scrollTo(wxaScrollView.getScrollX(), this.f80720e);
    }
}
