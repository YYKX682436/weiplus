package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sd implements com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 {

    /* renamed from: c, reason: collision with root package name */
    private static final int f132861c = 15;

    /* renamed from: a, reason: collision with root package name */
    int f132862a;

    /* renamed from: b, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se f132863b;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee f132864d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener> f132865e;

    /* renamed from: f, reason: collision with root package name */
    private int f132866f;

    /* renamed from: g, reason: collision with root package name */
    private int f132867g;

    /* renamed from: h, reason: collision with root package name */
    private float f132868h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f132869i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f132870j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f132871k;

    /* renamed from: l, reason: collision with root package name */
    private final java.lang.String f132872l;

    /* renamed from: m, reason: collision with root package name */
    private final java.lang.String f132873m;

    /* renamed from: n, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d f132874n;

    /* renamed from: o, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el f132875o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f132876p = true;

    /* renamed from: q, reason: collision with root package name */
    private volatile int f132877q = -1;

    /* renamed from: com.tencent.mapsdk.internal.sd$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener {
        public AnonymousClass3() {
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener
        /* renamed from: onVectorOverlayLoaded */
        public final void mo35424xb494ef93(boolean z17) {
            if (z17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.a(0);
            } else {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.a(20);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.sd$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass4 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayClickListener {
        public AnonymousClass4() {
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayClickListener
        /* renamed from: onClicked */
        public final void mo36965x82f09148(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.a(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.EventType.f16686xd2931708, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35875xa34611bd(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4245xebf1088f.ClickEventParams(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132872l, c26041x873d1d26, str, str2)));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.sd$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass5 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener {
        public AnonymousClass5() {
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener
        /* renamed from: onAnimatorEnd */
        public final void mo36966x61363115() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.a(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.EventType.f16688x9e685b02, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35875xa34611bd(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4245xebf1088f.TranslateAnimationCompleteEventParams(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132872l)));
        }
    }

    public sd(com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4274xbcec938d c4274xbcec938d) {
        java.lang.String substring = c4274xbcec938d.m35541x3b4d0a16().substring(0, c4274xbcec938d.m35541x3b4d0a16().lastIndexOf("_") == -1 ? c4274xbcec938d.m35541x3b4d0a16().length() : c4274xbcec938d.m35541x3b4d0a16().lastIndexOf("_"));
        this.f132873m = substring;
        int intValue = c4274xbcec938d.m35541x3b4d0a16().lastIndexOf("_") != -1 ? java.lang.Integer.valueOf(c4274xbcec938d.m35541x3b4d0a16().substring(c4274xbcec938d.m35541x3b4d0a16().lastIndexOf("_") + 1)).intValue() : 0;
        if (intValue == 0) {
            this.f132872l = substring;
        } else {
            this.f132872l = substring + "_" + intValue;
        }
        a(c4274xbcec938d);
    }

    private <T extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el> T c() {
        return (T) this.f132875o;
    }

    private java.lang.String d() {
        return this.f132873m;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1
    /* renamed from: addLayerStatusChangedListener */
    public final void mo35529xc254a1e6(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener onLayerStatusChangedListener) {
        if (this.f132865e == null) {
            this.f132865e = new java.util.ArrayList();
        }
        this.f132865e.remove(onLayerStatusChangedListener);
        this.f132865e.add(onLayerStatusChangedListener);
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1
    /* renamed from: clearCache */
    public final void mo35530xd2bef135() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar;
        if (mo36411x1e855fd6() || android.text.TextUtils.isEmpty(this.f132872l) || (eeVar = this.f132864d) == null) {
            return;
        }
        eeVar.c(this.f132872l);
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1
    /* renamed from: copy */
    public final com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 mo35531x2eaf75() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar = this.f132864d;
        if (eeVar == null) {
            return null;
        }
        return this.f132864d.a(new com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4274xbcec938d(this.f132873m + "_" + eeVar.a(this.f132873m)).mo35547x3136c9db().m35550x52b5721c(this.f132868h).m35554x2cb3cb7a(this.f132867g).m35553xcda70c34(this.f132862a).m35551xa8034b69(this.f132871k).mo35549x59bc66e());
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: enableClick */
    public final void mo35532xa947a9c5(boolean z17) {
        if (this.f132871k != z17) {
            this.f132871k = z17;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d = this.f132874n;
            if (interfaceC26098x1cf1c96d != null) {
                interfaceC26098x1cf1c96d.mo35532xa947a9c5(z17);
            }
        }
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1
    /* renamed from: executeCommand */
    public final java.lang.String mo35533xf3bb2216(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 interfaceC25961x718093f7, java.lang.String str) {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(str);
        if (a17 == null) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse));
        }
        java.lang.String str2 = a17.f16376x268d3c43;
        if (android.text.TextUtils.isEmpty(str2)) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.unsupported));
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "executeCommand functionType: [" + str2 + "]");
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(str, str2);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d = this.f132874n;
        if (interfaceC26098x1cf1c96d == null) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.internal.m35429x3d29bbb6("mOverlay is null")));
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus mo36853x3384840e = interfaceC26098x1cf1c96d.mo36853x3384840e(a18);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "executeCommand returnJson:" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(mo36853x3384840e));
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(mo36853x3384840e);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: executeCommandFunction */
    public final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus mo36853x3384840e(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction baseCommandFunction) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d = this.f132874n;
        if (interfaceC26098x1cf1c96d != null) {
            return interfaceC26098x1cf1c96d.mo36853x3384840e(baseCommandFunction);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25976x76534b5d
    /* renamed from: getAlpha */
    public final float mo36432x742757a8() {
        return this.f132868h;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7
    /* renamed from: getId */
    public final java.lang.String mo36409x5db1b11() {
        return this.f132872l;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: getLevel */
    public final int mo36418x74bf41ce() {
        return this.f132866f;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: getType */
    public final java.lang.String mo36854xfb85f7b0() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d = this.f132874n;
        return interfaceC26098x1cf1c96d == null ? "" : interfaceC26098x1cf1c96d.mo36854xfb85f7b0();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: getZIndex */
    public final int mo36420x397e976e() {
        return this.f132867g;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: isClickEnabled */
    public final boolean mo35534x93c986e3() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d = this.f132874n;
        if (interfaceC26098x1cf1c96d != null) {
            return interfaceC26098x1cf1c96d.mo35534x93c986e3();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: isRemoved */
    public final boolean mo36411x1e855fd6() {
        return this.f132869i;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852
    /* renamed from: isVisible */
    public final boolean mo36423xf94337e8() {
        return this.f132870j;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: releaseData */
    public final void mo36412xcb03051() {
        if (mo36411x1e855fd6() || android.text.TextUtils.isEmpty(this.f132872l)) {
            return;
        }
        a();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: remove */
    public final void mo36414xc84af884() {
        java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener> list = this.f132865e;
        if (list != null) {
            list.clear();
            this.f132865e = null;
        }
        a();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar = this.f132864d;
        if (eeVar != null) {
            eeVar.b(this.f132872l);
            this.f132864d = null;
        }
        this.f132869i = true;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1
    /* renamed from: removeLayerStatusChangedListener */
    public final void mo35535x5b8f3c09(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener onLayerStatusChangedListener) {
        java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener> list = this.f132865e;
        if (list != null) {
            list.remove(onLayerStatusChangedListener);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25976x76534b5d
    /* renamed from: setAlpha */
    public final void mo36457x52b5721c(float f17) {
        if (this.f132868h != f17) {
            this.f132868h = f17;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d = this.f132874n;
            if (interfaceC26098x1cf1c96d != null) {
                interfaceC26098x1cf1c96d.mo36855x65b68149(f17);
            }
        }
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: setLevel */
    public final void mo35536x534d5c42(int i17) {
        if (this.f132866f == i17 || i17 == 0) {
            return;
        }
        this.f132866f = i17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d = this.f132874n;
        if (interfaceC26098x1cf1c96d != null) {
            interfaceC26098x1cf1c96d.mo35536x534d5c42(i17);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd
    /* renamed from: setOpacity */
    public final void mo36855x65b68149(float f17) {
        mo36457x52b5721c(f17);
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1
    /* renamed from: setTimeInterval */
    public final void mo35537xcda70c34(int i17) {
        if (this.f132862a != i17) {
            this.f132876p = true;
            this.f132862a = i17;
            if (i17 > 0 && i17 < 15) {
                this.f132862a = 15;
            }
            c(this.f132864d);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd
    /* renamed from: setVisibility */
    public final void mo36856x901b6914(boolean z17) {
        mo36427xcd1079b0(z17);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852
    /* renamed from: setVisible */
    public final void mo36427xcd1079b0(boolean z17) {
        if (this.f132870j != z17) {
            this.f132870j = z17;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d = this.f132874n;
            if (interfaceC26098x1cf1c96d != null) {
                interfaceC26098x1cf1c96d.mo36856x901b6914(z17);
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: setZIndex */
    public final void mo36429x2cb3cb7a(int i17) {
        if (this.f132867g != i17) {
            this.f132867g = i17;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d = this.f132874n;
            if (interfaceC26098x1cf1c96d != null) {
                interfaceC26098x1cf1c96d.mo36857x2cb3cb7a(i17);
            }
        }
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se seVar) {
        this.f132863b = seVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar) {
        if (eeVar == null || !this.f132876p) {
            return;
        }
        this.f132876p = false;
        int i17 = this.f132862a;
        if (i17 > 0) {
            if (i17 < 15) {
                this.f132862a = 15;
            }
            eeVar.a(this.f132872l, this.f132862a);
            return;
        }
        eeVar.g(this.f132872l);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    private void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + this.f132872l + "] #drawLayer");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar = this.f132875o;
        if (elVar == null || !elVar.c() || eeVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar2 = this.f132875o;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se seVar = this.f132863b;
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 a17 = seVar != null ? seVar.a(elVar2) : null;
        if (a17 == null) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + this.f132872l + "] 创建OverlayProvider失败");
            a(4);
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + this.f132872l + "] 创建OverlayProvider:" + a17);
        a17.mo35598x90f12d04((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.AnonymousClass3());
        a17.m35597x8da4ebd1(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.AnonymousClass4());
        if (a17 instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d) {
            ((com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d) a17).m35706xef09bc02(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.AnonymousClass5());
        }
        a17.mo35584xa947a9c5(this.f132871k);
        if (this.f132874n == null) {
            this.f132874n = eeVar.mo36621x2de760a9().f130532b.mo36068xb5885626().mo36547xe98f1e6c(a17);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + this.f132872l + "] 创建Overlay:" + this.f132874n);
            return;
        }
        eeVar.mo36621x2de760a9().f130532b.mo36068xb5885626().mo36620xea2fdf44(this.f132874n, a17);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + this.f132872l + "] 更新Overlay:" + this.f132874n);
    }

    private int b() {
        return this.f132862a;
    }

    public final void a() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d = this.f132874n;
        if (interfaceC26098x1cf1c96d != null) {
            interfaceC26098x1cf1c96d.m100060xc84af884();
            this.f132874n = null;
        }
    }

    public final void b(final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar) {
        if (eeVar == null) {
            return;
        }
        eeVar.b(this.f132872l, new com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<byte[]>() { // from class: com.tencent.mapsdk.internal.sd.2
            private void a(byte[] bArr) {
                if (bArr != null && bArr.length > 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132872l + "] 刷新图层数据[" + bArr.length + "]");
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.a(bArr, true)) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this, eeVar);
                        eeVar.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132872l, bArr);
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.c(eeVar);
            }

            @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
            /* renamed from: callback */
            public final /* synthetic */ void mo35806xf5bc2045(byte[] bArr) {
                byte[] bArr2 = bArr;
                if (bArr2 != null && bArr2.length > 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132872l + "] 刷新图层数据[" + bArr2.length + "]");
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.a(bArr2, true)) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this, eeVar);
                        eeVar.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132872l, bArr2);
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.c(eeVar);
            }
        });
    }

    private boolean b(int i17) {
        if (this.f132877q == i17) {
            return false;
        }
        int i18 = this.f132877q;
        if (i18 == 0 ? i17 > this.f132877q : !(i18 != 1 && i18 != 2 && i18 != 3 && i18 != 4 && i18 != 20)) {
            i17 = this.f132877q;
        }
        if (this.f132877q == i17) {
            return false;
        }
        this.f132877q = i17;
        return true;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: setZIndex */
    public final void mo36428x2cb3cb7a(float f17) {
        mo36429x2cb3cb7a((int) f17);
    }

    public final void a(final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar) {
        this.f132864d = eeVar;
        if (eeVar.e(this.f132872l)) {
            eeVar.a(this.f132872l, new com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<byte[]>() { // from class: com.tencent.mapsdk.internal.sd.1
                private void a(byte[] bArr) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("图层id[");
                    sb6.append(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132872l);
                    sb6.append("] 读取本地图层数据[");
                    sb6.append(bArr != null ? bArr.length : 0);
                    sb6.append("]");
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, sb6.toString());
                    if (bArr != null && bArr.length > 0 && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.a(bArr, false)) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this, eeVar);
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.b(eeVar);
                }

                @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
                /* renamed from: callback */
                public final /* synthetic */ void mo35806xf5bc2045(byte[] bArr) {
                    byte[] bArr2 = bArr;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("图层id[");
                    sb6.append(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132872l);
                    sb6.append("] 读取本地图层数据[");
                    sb6.append(bArr2 != null ? bArr2.length : 0);
                    sb6.append("]");
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, sb6.toString());
                    if (bArr2 != null && bArr2.length > 0 && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.a(bArr2, false)) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this, eeVar);
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.b(eeVar);
                }
            });
        } else if (eeVar.a()) {
            a(2);
        } else {
            eeVar.f(this.f132872l);
        }
    }

    public final void a(com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4274xbcec938d c4274xbcec938d) {
        if (c4274xbcec938d != null) {
            mo36457x52b5721c(c4274xbcec938d.m35540x742757a8());
            mo35536x534d5c42(c4274xbcec938d.m35542x74bf41ce());
            mo35537xcda70c34(c4274xbcec938d.m35543x975e1128());
            mo36427xcd1079b0(c4274xbcec938d.m35546xf94337e8());
            mo36429x2cb3cb7a(c4274xbcec938d.m35544x397e976e());
            mo35532xa947a9c5(c4274xbcec938d.m35545x93c986e3());
        }
    }

    public final boolean a(byte[] bArr, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar;
        com.tencent.mapsdk.internal.el.b bVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("图层id[");
        sb6.append(this.f132872l);
        sb6.append("] #parseLayerData[");
        sb6.append(bArr != null ? bArr.length : 0);
        sb6.append("]");
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, sb6.toString());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se seVar = this.f132863b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a17 = seVar != null ? seVar.a(bArr) : null;
        this.f132875o = a17;
        if (a17 != null && this.f132864d != null && a17.c()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar2 = this.f132875o;
            java.lang.String d17 = this.f132864d.d(this.f132872l);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se seVar2 = this.f132863b;
            this.f132875o = seVar2 != null ? seVar2.a(elVar2, d17) : null;
            this.f132864d.a(mo36409x5db1b11(), this.f132875o.a(), this.f132875o.b());
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + this.f132872l + "] 创建Protocol对象：成功");
            return true;
        }
        if (z17 && (elVar = this.f132875o) != null && (bVar = elVar.f130825b) != null && bVar.f130844a == 0) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + this.f132872l + "] 创建Protocol对象：网络返回数据版本无变化, 无需更新本地数据");
            return false;
        }
        a(3);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + this.f132872l + "] 创建Protocol对象：失败");
        return false;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a(byte[] bArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se seVar = this.f132863b;
        if (seVar != null) {
            return seVar.a(bArr);
        }
        return null;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar, java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se seVar = this.f132863b;
        if (seVar != null) {
            return seVar.a(elVar, str);
        }
        return null;
    }

    private com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se seVar = this.f132863b;
        if (seVar != null) {
            return seVar.a(elVar);
        }
        return null;
    }

    public final void a(final int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + this.f132872l + "] notifyStatusChange want from[" + this.f132877q + "]to[" + i17 + "]");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.sd.6
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this, i17) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132865e != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132872l + "] notifyStatusChange do success");
                    java.util.ArrayList arrayList = new java.util.ArrayList(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132865e);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.a(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.EventType.f16687x9f34659e, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35875xa34611bd(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4245xebf1088f.LoadFinishEventParams(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132872l, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4245xebf1088f.LoadFinishEventParams.LoadFinishInfo.m35294xfb7dc448(i17))));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener onLayerStatusChangedListener = (com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener) it.next();
                        if (onLayerStatusChangedListener != null) {
                            onLayerStatusChangedListener.mo35539x8e86c96b(i17);
                        }
                    }
                }
            }
        }, 10L);
    }

    public final void a(final java.lang.String str, final java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.sd.7
            @Override // java.lang.Runnable
            public final void run() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132865e == null) {
                    return;
                }
                java.util.Iterator it = new java.util.ArrayList(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.this.f132865e).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener onLayerStatusChangedListener = (com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener) it.next();
                    if (onLayerStatusChangedListener != null) {
                        onLayerStatusChangedListener.mo35538xaf8c47fb(this, str, str2);
                    }
                }
            }
        }, 10L);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee eeVar) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + sdVar.f132872l + "] #drawLayer");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar = sdVar.f132875o;
        if (elVar == null || !elVar.c() || eeVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar2 = sdVar.f132875o;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se seVar = sdVar.f132863b;
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 a17 = seVar != null ? seVar.a(elVar2) : null;
        if (a17 == null) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + sdVar.f132872l + "] 创建OverlayProvider失败");
            sdVar.a(4);
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + sdVar.f132872l + "] 创建OverlayProvider:" + a17);
        a17.mo35598x90f12d04((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.AnonymousClass3());
        a17.m35597x8da4ebd1(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.AnonymousClass4());
        if (a17 instanceof com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d) {
            ((com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d) a17).m35706xef09bc02(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd.AnonymousClass5());
        }
        a17.mo35584xa947a9c5(sdVar.f132871k);
        if (sdVar.f132874n == null) {
            sdVar.f132874n = eeVar.mo36621x2de760a9().f130532b.mo36068xb5885626().mo36547xe98f1e6c(a17);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + sdVar.f132872l + "] 创建Overlay:" + sdVar.f132874n);
            return;
        }
        eeVar.mo36621x2de760a9().f130532b.mo36068xb5885626().mo36620xea2fdf44(sdVar.f132874n, a17);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "图层id[" + sdVar.f132872l + "] 更新Overlay:" + sdVar.f132874n);
    }

    public static /* synthetic */ boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar, int i17) {
        if (sdVar.f132877q == i17) {
            return false;
        }
        int i18 = sdVar.f132877q;
        if (i18 == 0 ? i17 > sdVar.f132877q : !(i18 != 1 && i18 != 2 && i18 != 3 && i18 != 4 && i18 != 20)) {
            i17 = sdVar.f132877q;
        }
        if (sdVar.f132877q == i17) {
            return false;
        }
        sdVar.f132877q = i17;
        return true;
    }
}
