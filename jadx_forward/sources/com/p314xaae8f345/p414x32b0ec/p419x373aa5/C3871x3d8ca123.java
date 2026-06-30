package com.p314xaae8f345.p414x32b0ec.p419x373aa5;

/* renamed from: com.tencent.live.view.V2LiveRenderView */
/* loaded from: classes13.dex */
public class C3871x3d8ca123 implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {
    private static final java.lang.String TAG = "V2LiveRenderView";

    /* renamed from: mChannel */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f15262xca242fd6;

    /* renamed from: mContext */
    private android.content.Context f15263xd6cfe882;

    /* renamed from: mListener */
    private com.p314xaae8f345.p414x32b0ec.p419x373aa5.InterfaceC3870x98608373 f15264x753a6c41;

    /* renamed from: mMessenger */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f15265x251e0526;

    /* renamed from: mRemoteView */
    private com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f15266x1a440c58;

    /* renamed from: mViewId */
    private int f15267x1ebf556d;

    public C3871x3d8ca123(int i17, android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, com.p314xaae8f345.p414x32b0ec.p419x373aa5.InterfaceC3870x98608373 interfaceC3870x98608373) {
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(2, "V2LiveRenderView, V2LiveRenderView create viewId:" + i17);
        this.f15263xd6cfe882 = context;
        this.f15265x251e0526 = interfaceC28679x1b8c77f2;
        this.f15267x1ebf556d = i17;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = new com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf(context);
        this.f15266x1a440c58 = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46533x473bda1f(new android.view.TextureView(context));
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(this.f15265x251e0526, "tx_Live_video_view_" + this.f15267x1ebf556d);
        this.f15262xca242fd6 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
        this.f15264x753a6c41 = interfaceC3870x98608373;
    }

    /* renamed from: destroyRenderView */
    private void m31846xe16e80f5() {
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(2, "V2LiveRenderView, V2LiveRenderView destroy viewId:" + this.f15267x1ebf556d);
        com.p314xaae8f345.p414x32b0ec.p419x373aa5.InterfaceC3870x98608373 interfaceC3870x98608373 = this.f15264x753a6c41;
        if (interfaceC3870x98608373 != null) {
            interfaceC3870x98608373.mo31845xac79a11b(this.f15267x1ebf556d);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: dispose */
    public void mo31847x63a5261f() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8
    /* renamed from: getView */
    public android.view.View mo31848xfb86a31b() {
        return this.f15266x1a440c58;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p414x32b0ec.p418x6a710b1.C3868x87fce1b0.m31840x6f02d9a1(2, "V2LiveRenderView, V2LiveRenderView( " + this.f15267x1ebf556d + ")onMethodCall -> method:" + c28687x4bb242ff.f71610xbfc5d0e1 + ", arguments:" + c28687x4bb242ff.f71609x86ac7956);
        java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
        str.getClass();
        if (str.equals("destroyRenderView")) {
            m31846xe16e80f5();
        }
    }
}
