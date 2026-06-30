package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes15.dex */
public class v0 extends android.widget.HorizontalScrollView {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView f80718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView wxaScrollView, android.content.Context context) {
        super(context);
        this.f80718d = wxaScrollView;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView wxaScrollView = this.f80718d;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.r0 r0Var = wxaScrollView.f80651g;
        if (r0Var != null) {
            r0Var.a(wxaScrollView, i17, i18, i19, i27);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2 || this.f80718d.f80653i) {
            return super.onTouchEvent(motionEvent);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaScrollView", "can not move");
        return false;
    }
}
