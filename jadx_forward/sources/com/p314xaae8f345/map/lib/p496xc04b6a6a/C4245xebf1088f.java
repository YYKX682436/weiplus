package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.EventParamsModelClass */
/* loaded from: classes13.dex */
public class C4245xebf1088f {

    /* renamed from: com.tencent.map.lib.models.EventParamsModelClass$ClickEventParams */
    /* loaded from: classes13.dex */
    public static class ClickEventParams extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4245xebf1088f.EventParams {

        /* renamed from: clickedPosition */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "clickedPosition")
        public float[] f16440x8e947670;

        /* renamed from: identifier */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e)
        public java.lang.String f16441x9f88aca9;

        /* renamed from: name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)
        public java.lang.String f16442x337a8b;

        public ClickEventParams(java.lang.String str, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, java.lang.String str2, java.lang.String str3) {
            this.f16443x1df98f4 = com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.EventType.f16686xd2931708;
            this.f16444xfd7fce4c = str;
            this.f16440x8e947670 = r3;
            float[] fArr = {(float) c26041x873d1d26.m99509x2605e9e2()};
            this.f16440x8e947670[1] = (float) c26041x873d1d26.m99510x79d7af9();
            this.f16441x9f88aca9 = str2;
            this.f16442x337a8b = str3;
        }
    }

    /* renamed from: com.tencent.map.lib.models.EventParamsModelClass$EventParams */
    /* loaded from: classes13.dex */
    public static class EventParams extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

        /* renamed from: eventType */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "eventType")
        public java.lang.String f16443x1df98f4;

        /* renamed from: layerId */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "layerId")
        public java.lang.String f16444xfd7fce4c;
    }

    /* renamed from: com.tencent.map.lib.models.EventParamsModelClass$LoadFinishEventParams */
    /* loaded from: classes13.dex */
    public static class LoadFinishEventParams extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4245xebf1088f.EventParams {

        /* renamed from: errorCode */
        public int f16445x139cb015;

        /* renamed from: errorMsg */
        public java.lang.String f16446x5336c059;

        /* renamed from: com.tencent.map.lib.models.EventParamsModelClass$LoadFinishEventParams$LoadFinishInfo */
        /* loaded from: classes13.dex */
        public enum LoadFinishInfo {
            ok(0, ""),
            errNetwork(1, com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16698x477d0536),
            errAuth(2, com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16694xdf0f4780),
            errDataDecode(3, com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16696x3147d34b),
            errDataAvailable(4, com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16695x8af2742c),
            errInternal(20, com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16697x69dc35be);


            /* renamed from: errorCode */
            private int f16453x139cb015;

            /* renamed from: errorMsg */
            private java.lang.String f16454x5336c059;

            LoadFinishInfo(int i17, java.lang.String str) {
                this.f16453x139cb015 = i17;
                this.f16454x5336c059 = str;
            }

            /* renamed from: getById */
            public static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4245xebf1088f.LoadFinishEventParams.LoadFinishInfo m35294xfb7dc448(int i17) {
                for (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4245xebf1088f.LoadFinishEventParams.LoadFinishInfo loadFinishInfo : m35296xcee59d22()) {
                    if (loadFinishInfo.m35297x2dc8bb1a(i17)) {
                        return loadFinishInfo;
                    }
                }
                return ok;
            }

            /* renamed from: checkStatus */
            public final boolean m35297x2dc8bb1a(int i17) {
                return this.f16453x139cb015 == i17;
            }

            /* renamed from: getErrorCode */
            public final int m35298x130a215f() {
                return this.f16453x139cb015;
            }

            /* renamed from: getErrorMsg */
            public final java.lang.String m35299xcf10fdcf() {
                return this.f16454x5336c059;
            }
        }

        public LoadFinishEventParams(java.lang.String str, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4245xebf1088f.LoadFinishEventParams.LoadFinishInfo loadFinishInfo) {
            this.f16443x1df98f4 = com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.EventType.f16687x9f34659e;
            this.f16444xfd7fce4c = str;
            this.f16445x139cb015 = loadFinishInfo.f16453x139cb015;
            this.f16446x5336c059 = loadFinishInfo.f16454x5336c059;
        }
    }

    /* renamed from: com.tencent.map.lib.models.EventParamsModelClass$TranslateAnimationCompleteEventParams */
    /* loaded from: classes13.dex */
    public static class TranslateAnimationCompleteEventParams extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4245xebf1088f.EventParams {
        public TranslateAnimationCompleteEventParams(java.lang.String str) {
            this.f16443x1df98f4 = com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.EventType.f16688x9e685b02;
            this.f16444xfd7fce4c = str;
        }
    }
}
