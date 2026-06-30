package com.p314xaae8f345.map.sdk.p497x5a73344.vis;

/* renamed from: com.tencent.map.sdk.comps.vis.VisualLayer */
/* loaded from: classes13.dex */
public interface InterfaceC4273x137f8dd1 extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25976x76534b5d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d {

    /* renamed from: com.tencent.map.sdk.comps.vis.VisualLayer$OnLayerStatusChangedListener */
    /* loaded from: classes13.dex */
    public interface OnLayerStatusChangedListener {

        /* renamed from: com.tencent.map.sdk.comps.vis.VisualLayer$OnLayerStatusChangedListener$EventType */
        /* loaded from: classes13.dex */
        public @interface EventType {

            /* renamed from: ON_CLICK */
            public static final java.lang.String f16686xd2931708 = "onClickEvent";

            /* renamed from: ON_LAYER_LOAD_FINISH */
            public static final java.lang.String f16687x9f34659e = "onLayerLoadFinishEvent";

            /* renamed from: ON_TRANSLATEANIMATION_COMPLETE */
            public static final java.lang.String f16688x9e685b02 = "onTranslateAnimationCompleteEvent";
        }

        /* renamed from: com.tencent.map.sdk.comps.vis.VisualLayer$OnLayerStatusChangedListener$LayerStatus */
        /* loaded from: classes13.dex */
        public @interface LayerStatus {

            /* renamed from: ERR_AUTH */
            public static final int f16689x82b70462 = 2;

            /* renamed from: ERR_DATA_AVAILABLE */
            public static final int f16690x6f04fe8e = 4;

            /* renamed from: ERR_DATA_DECODE */
            public static final int f16691x857e3429 = 3;

            /* renamed from: ERR_INTERNAL_ERROR */
            public static final int f16692x4deec020 = 20;

            /* renamed from: ERR_NETWORK */
            public static final int f16693x4528514 = 1;
            public static final int OK = 0;
        }

        /* renamed from: com.tencent.map.sdk.comps.vis.VisualLayer$OnLayerStatusChangedListener$LayerStatusMsg */
        /* loaded from: classes13.dex */
        public @interface LayerStatusMsg {

            /* renamed from: MSG_ERR_AUTH */
            public static final java.lang.String f16694xdf0f4780 = "authentication error";

            /* renamed from: MSG_ERR_DATA_AVAILABLE */
            public static final java.lang.String f16695x8af2742c = "data check available error";

            /* renamed from: MSG_ERR_DATA_DECODE */
            public static final java.lang.String f16696x3147d34b = "data protocol decode error";

            /* renamed from: MSG_ERR_INTERNAL_ERROR */
            public static final java.lang.String f16697x69dc35be = "internal error";

            /* renamed from: MSG_ERR_NETWORK */
            public static final java.lang.String f16698x477d0536 = "network error";

            /* renamed from: MSG_OK */
            public static final java.lang.String f16699x88187b7a = "";
        }

        /* renamed from: onEvent */
        boolean mo35538xaf8c47fb(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 interfaceC4273x137f8dd1, java.lang.String str, java.lang.String str2);

        /* renamed from: onLayerLoadFinish */
        void mo35539x8e86c96b(int i17);
    }

    /* renamed from: addLayerStatusChangedListener */
    void mo35529xc254a1e6(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener onLayerStatusChangedListener);

    /* renamed from: clearCache */
    void mo35530xd2bef135();

    /* renamed from: copy */
    com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 mo35531x2eaf75();

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: enableClick */
    void mo35532xa947a9c5(boolean z17);

    /* renamed from: executeCommand */
    java.lang.String mo35533xf3bb2216(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 interfaceC25961x718093f7, java.lang.String str);

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: isClickEnabled */
    boolean mo35534x93c986e3();

    /* renamed from: removeLayerStatusChangedListener */
    void mo35535x5b8f3c09(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener onLayerStatusChangedListener);

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: setLevel */
    void mo35536x534d5c42(int i17);

    /* renamed from: setTimeInterval */
    void mo35537xcda70c34(int i17);
}
