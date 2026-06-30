package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass */
/* loaded from: classes13.dex */
public class C4258xcc41788d {

    /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$BaseBooleanReturnInfo */
    /* loaded from: classes13.dex */
    public static class BaseBooleanReturnInfo extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus {

        /* renamed from: value */
        public boolean f16593x6ac9171;

        public BaseBooleanReturnInfo(boolean z17) {
            this.f16609xcacdcff2 = ya.b.f77504xbb80cbe3;
            this.f16593x6ac9171 = z17;
        }
    }

    /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$BaseFloatReturnInfo */
    /* loaded from: classes13.dex */
    public static class BaseFloatReturnInfo extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus {

        /* renamed from: value */
        public float f16594x6ac9171;

        public BaseFloatReturnInfo(float f17) {
            this.f16609xcacdcff2 = ya.b.f77504xbb80cbe3;
            this.f16594x6ac9171 = f17;
        }
    }

    /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$BaseIntReturnInfo */
    /* loaded from: classes13.dex */
    public static class BaseIntReturnInfo extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus {

        /* renamed from: value */
        public int f16595x6ac9171;

        public BaseIntReturnInfo(int i17) {
            this.f16609xcacdcff2 = ya.b.f77504xbb80cbe3;
            this.f16595x6ac9171 = i17;
        }
    }

    /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$BaseStringReturnInfo */
    /* loaded from: classes13.dex */
    public static class BaseStringReturnInfo extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus {

        /* renamed from: value */
        public java.lang.String f16596x6ac9171;

        public BaseStringReturnInfo(java.lang.String str) {
            this.f16609xcacdcff2 = ya.b.f77504xbb80cbe3;
            this.f16596x6ac9171 = str;
        }
    }

    /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$ErrorReturnInfo */
    /* loaded from: classes13.dex */
    public static class ErrorReturnInfo extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus {

        /* renamed from: errorCode */
        public int f16597x139cb015;

        /* renamed from: errorMsg */
        public java.lang.String f16598x5336c059;

        /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$ErrorReturnInfo$ErrorMsg */
        /* loaded from: classes13.dex */
        public enum ErrorMsg {
            success(0, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc),
            jsonparse(1, "json parse error"),
            unsupported(2, "unsupported function"),
            internal(3, com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16697x69dc35be),
            invalidparam(4, "invalid param error");


            /* renamed from: errorCode */
            private int f16605x139cb015;

            /* renamed from: errorMsg */
            private java.lang.String f16606x5336c059;

            ErrorMsg(int i17, java.lang.String str) {
                this.f16605x139cb015 = i17;
                this.f16606x5336c059 = str;
            }

            /* renamed from: bindErrorMsg */
            public final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg m35429x3d29bbb6(java.lang.String str) {
                this.f16606x5336c059 += com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa + str;
                return this;
            }

            /* renamed from: getErrorCode */
            public final int m35430x130a215f() {
                return this.f16605x139cb015;
            }

            /* renamed from: getErrorMsg */
            public final java.lang.String m35431xcf10fdcf() {
                return this.f16606x5336c059;
            }
        }

        public ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg errorMsg) {
            this.f16609xcacdcff2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d;
            this.f16597x139cb015 = errorMsg.m35430x130a215f();
            this.f16598x5336c059 = errorMsg.m35431xcf10fdcf();
        }
    }

    /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$MaterialVariantsReturnInfo */
    /* loaded from: classes13.dex */
    public static class MaterialVariantsReturnInfo extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus {

        /* renamed from: value */
        public com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MaterialVariantsInfoParams f16607x6ac9171;

        public MaterialVariantsReturnInfo(java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MaterialVariantInfo> list) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MaterialVariantsInfoParams materialVariantsInfoParams = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.MaterialVariantsInfoParams();
            this.f16607x6ac9171 = materialVariantsInfoParams;
            materialVariantsInfoParams.f16402x5a2e21ea = list;
        }
    }

    /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$PositionReturnInfo */
    /* loaded from: classes13.dex */
    public static class PositionReturnInfo extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus {

        /* renamed from: value */
        public com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.PositionParams f16608x6ac9171;

        public PositionReturnInfo(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.PositionParams positionParams = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.PositionParams();
            this.f16608x6ac9171 = positionParams;
            positionParams.lat = c26041x873d1d26.f49501xaa2bac6c;
            positionParams.lng = c26041x873d1d26.f49502x83009af;
            positionParams.f16408x79634aa2 = c26041x873d1d26.f49500x79634aa2;
        }
    }

    /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$ReturnStatus */
    /* loaded from: classes13.dex */
    public static class ReturnStatus extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

        /* renamed from: status */
        public java.lang.String f16609xcacdcff2 = ya.b.f77504xbb80cbe3;
    }

    /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$RotationReturnInfo */
    /* loaded from: classes13.dex */
    public static class RotationReturnInfo extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus {

        /* renamed from: value */
        public com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.RotationParams f16610x6ac9171;

        public RotationReturnInfo(float f17, float f18, float f19) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.RotationParams rotationParams = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.RotationParams();
            this.f16610x6ac9171 = rotationParams;
            rotationParams.f16409xb588e09a = f17;
            rotationParams.f16410xb588e09b = f18;
            rotationParams.f16411xb588e09c = f19;
        }
    }

    /* renamed from: com.tencent.map.lib.models.ReturnInfoModelClass$SkeletonAnimationReturnInfo */
    /* loaded from: classes13.dex */
    public static class SkeletonAnimationReturnInfo extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus {

        /* renamed from: value */
        public com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.SkeletonAnimationParams f16611x6ac9171;

        public SkeletonAnimationReturnInfo(java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.AnimationInfo> list) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.SkeletonAnimationParams skeletonAnimationParams = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4242x5b425a20.SkeletonAnimationParams();
            this.f16611x6ac9171 = skeletonAnimationParams;
            skeletonAnimationParams.f16413x211b3e10 = list == null ? new java.util.ArrayList<>() : list;
        }
    }
}
