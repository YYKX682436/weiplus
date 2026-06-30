package com.p314xaae8f345.p414x32b0ec.p419x373aa5;

/* renamed from: com.tencent.live.view.V2LiveRenderViewFactory */
/* loaded from: classes13.dex */
public class C3872xa0192a67 extends io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 implements com.p314xaae8f345.p414x32b0ec.p419x373aa5.InterfaceC3870x98608373 {

    /* renamed from: SIGN */
    public static final java.lang.String f15268x26d5bd = "v2_live_view_factory";
    private static final java.lang.String TAG = "TRTCCloudFlutter";

    /* renamed from: mContext */
    private android.content.Context f15269xd6cfe882;

    /* renamed from: mMessenger */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f15270x251e0526;

    /* renamed from: mViewMap */
    private java.util.Map<java.lang.Integer, com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3871x3d8ca123> f15271xb92b674a;

    public C3872xa0192a67(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
        super(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);
        this.f15271xb92b674a = new java.util.HashMap();
        this.f15269xd6cfe882 = context;
        this.f15270x251e0526 = interfaceC28679x1b8c77f2;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12
    /* renamed from: create */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc(android.content.Context context, int i17, java.lang.Object obj) {
        com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3871x3d8ca123 c3871x3d8ca123 = this.f15271xb92b674a.get(java.lang.Integer.valueOf(i17));
        if (c3871x3d8ca123 != null) {
            return c3871x3d8ca123;
        }
        com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3871x3d8ca123 c3871x3d8ca1232 = new com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3871x3d8ca123(i17, context, this.f15270x251e0526, this);
        this.f15271xb92b674a.put(java.lang.Integer.valueOf(i17), c3871x3d8ca1232);
        return c3871x3d8ca1232;
    }

    /* renamed from: getViewById */
    public com.p314xaae8f345.p414x32b0ec.p419x373aa5.C3871x3d8ca123 m31849xc3196d8d(int i17) {
        return this.f15271xb92b674a.get(java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.p414x32b0ec.p419x373aa5.InterfaceC3870x98608373
    /* renamed from: onDestroy */
    public void mo31845xac79a11b(int i17) {
        if (this.f15271xb92b674a.containsKey(java.lang.Integer.valueOf(i17))) {
            this.f15271xb92b674a.remove(java.lang.Integer.valueOf(i17));
        }
    }

    public C3872xa0192a67(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> interfaceC28686xbb96606f) {
        super(interfaceC28686xbb96606f);
        this.f15271xb92b674a = new java.util.HashMap();
    }
}
