package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pw implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436 {

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f132322c = "AoiLayer";

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py f132323a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px f132324b;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f132325d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f132328g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f132329h;

    /* renamed from: j, reason: collision with root package name */
    private int[] f132331j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f132332k;

    /* renamed from: l, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener f132333l;

    /* renamed from: e, reason: collision with root package name */
    private int f132326e = 20;

    /* renamed from: f, reason: collision with root package name */
    private int f132327f = -1;

    /* renamed from: i, reason: collision with root package name */
    private boolean f132330i = true;

    /* renamed from: com.tencent.mapsdk.internal.pw$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 extends com.tencent.mapsdk.internal.ko.a<java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.List f132336a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.List f132337b;

        public AnonymousClass3(java.util.List list, java.util.List list2) {
            this.f132336a = list;
            this.f132337b = list2;
        }

        @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
        /* renamed from: callback */
        public final void mo35806xf5bc2045(java.lang.Object obj) {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132329h) {
                return;
            }
            int size = this.f132336a.size();
            int size2 = this.f132337b.size();
            if (size != size2) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.f132322c, "PoiLayer的子点渲染缺失！！count:" + size2 + "/" + size);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this, this.f132337b);
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132333l != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132333l.mo36920x40ec4b7a(true, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.pw$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass4 extends com.tencent.mapsdk.internal.ko.g<java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.List f132339a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.List f132340b;

        public AnonymousClass4(java.util.List list, java.util.List list2) {
            this.f132339a = list;
            this.f132340b = list2;
        }

        @Override // java.util.concurrent.Callable
        public final java.lang.Object call() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132329h) {
                return null;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this, this.f132339a, new com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<com.tencent.mapsdk.internal.px.d>() { // from class: com.tencent.mapsdk.internal.pw.4.1
                private void a(com.tencent.mapsdk.internal.px.d dVar) {
                    if (dVar != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.AnonymousClass4.this.f132340b.add(dVar);
                    }
                }

                @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
                /* renamed from: callback */
                public final /* synthetic */ void mo35806xf5bc2045(com.tencent.mapsdk.internal.px.d dVar) {
                    com.tencent.mapsdk.internal.px.d dVar2 = dVar;
                    if (dVar2 != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.AnonymousClass4.this.f132340b.add(dVar2);
                    }
                }
            });
            return null;
        }
    }

    public pw(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar, java.lang.String str, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26007x97be4188 c26007x97be4188, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        this.f132323a = pyVar;
        this.f132325d = str;
        this.f132333l = onAoiLayerLoadListener;
        a(c26007x97be4188);
    }

    public static /* synthetic */ boolean e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar) {
        pwVar.f132328g = false;
        return false;
    }

    public static /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        java.lang.String str = f132322c;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str, "请求poiDetail[" + pwVar.f132325d + "]");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = pwVar.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null) {
            return null;
        }
        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36689x14d0573b = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.db) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dq) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dq.class)).i()).m36689x14d0573b(pwVar.f132325d, neVar.F().f130542a);
        m36689x14d0573b.f16974x2c0d614c = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c;
        com.tencent.mapsdk.internal.ec.a aVar = new com.tencent.mapsdk.internal.ec.a(m36689x14d0573b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px.class);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str, "poiDetail[" + pwVar.f132325d + "] resp:" + aVar.mo36017xd4418ac9());
        if (aVar.mo36017xd4418ac9()) {
            return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px) aVar.f130769b;
        }
        return null;
    }

    /* renamed from: equals */
    public final boolean m36908xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw)) {
            return false;
        }
        java.lang.String str = this.f132325d;
        java.lang.String str2 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw) obj).f132325d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7
    /* renamed from: getId */
    public final java.lang.String mo36409x5db1b11() {
        return this.f132325d;
    }

    /* renamed from: hashCode */
    public final int m36909x8cdac1b() {
        java.lang.String str = this.f132325d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436
    /* renamed from: location */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 mo36910x714f9fb5() {
        com.tencent.mapsdk.internal.px.d dVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar = this.f132324b;
        if (pxVar == null || (dVar = pxVar.f132343a) == null) {
            return null;
        }
        return dVar.f132359h;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436
    /* renamed from: name */
    public final java.lang.String mo36911x337a8b() {
        com.tencent.mapsdk.internal.px.d dVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar = this.f132324b;
        if (pxVar == null || (dVar = pxVar.f132343a) == null) {
            return null;
        }
        return dVar.f132354c;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436
    /* renamed from: remove */
    public final boolean mo36912xc84af884() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        boolean z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng a17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f132323a;
        if (pyVar == null || this.f132329h || (neVar = pyVar.f132375b) == null) {
            return false;
        }
        int[] iArr = this.f132332k;
        if (iArr != null) {
            for (int i17 : iArr) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi biVar = neVar.f132043j;
                if (biVar != null && (a17 = biVar.a((java.lang.Class<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng>) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc.class, i17)) != null) {
                    a17.m36849xc84af884();
                }
            }
            this.f132332k = null;
            z17 = true;
        } else {
            z17 = false;
        }
        int[] iArr2 = this.f132331j;
        if (iArr2 != null) {
            for (int i18 : iArr2) {
                neVar.a(i18);
            }
            this.f132331j = null;
            z17 = true;
        }
        this.f132324b = null;
        this.f132323a.f132374a.remove(this);
        this.f132329h = true;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "移除poiLayer[" + this.f132325d + "]");
        return z17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436
    /* renamed from: showSubPois */
    public final void mo36913xa7c1800c(boolean z17) {
        com.tencent.mapsdk.internal.px.d dVar;
        java.util.List<com.tencent.mapsdk.internal.px.d> list;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.f132330i == z17) {
            return;
        }
        this.f132330i = z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar = this.f132324b;
        if (pxVar == null || (dVar = pxVar.f132343a) == null || (list = dVar.f132361j) == null || (pyVar = this.f132323a) == null || (neVar = pyVar.f132375b) == null) {
            return;
        }
        for (com.tencent.mapsdk.internal.px.d dVar2 : list) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw a17 = a(d(dVar2.f132357f), dVar2);
            a17.f131006a = dVar2.f132352a;
            if (!this.f132330i) {
                a17.f131013h = "";
            }
            neVar.a(a17);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc ocVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) neVar.f132043j.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc.class, a17.f131006a);
            if (ocVar != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oe oeVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oe) ocVar.f132100d;
                oeVar.m35420x1bd1f072(this.f132330i);
                ocVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) oeVar);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "显示/隐藏子点成功！" + dVar2.a() + "显示状态: " + this.f132330i);
            }
        }
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar = this.f132324b;
        if (pxVar != null) {
            return a(pxVar.f132343a);
        }
        return null;
    }

    private static android.graphics.Point[] c(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        if (list == null || list.isEmpty()) {
            return new android.graphics.Point[0];
        }
        int size = list.size();
        android.graphics.Point[] pointArr = new android.graphics.Point[size];
        for (int i17 = 0; i17 < size; i17++) {
            pointArr[i17] = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(list.get(i17)).m35337xba582bd5();
        }
        return pointArr;
    }

    private com.tencent.mapsdk.internal.px.e d(java.util.List<com.tencent.mapsdk.internal.px.e> list) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.tencent.mapsdk.internal.px.e eVar = new com.tencent.mapsdk.internal.px.e();
        if (list == null || (pyVar = this.f132323a) == null || (neVar = pyVar.f132375b) == null) {
            return eVar;
        }
        boolean o17 = neVar.o();
        for (com.tencent.mapsdk.internal.px.e eVar2 : list) {
            if ((o17 && eVar2.f132364c == 1) || (!o17 && eVar2.f132364c == 0)) {
                return eVar2;
            }
        }
        return eVar;
    }

    private com.tencent.mapsdk.internal.px.c e(java.util.List<com.tencent.mapsdk.internal.px.e> list) {
        return d(list).f132373l;
    }

    private void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar) {
        com.tencent.mapsdk.internal.px.d dVar;
        boolean z17;
        com.tencent.mapsdk.internal.px.b bVar;
        java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> list;
        if (pxVar == null || (dVar = pxVar.f132343a) == null) {
            return;
        }
        com.tencent.mapsdk.internal.px.c cVar = d(dVar.f132357f).f132373l;
        com.tencent.mapsdk.internal.px.a aVar = pxVar.f132343a.f132360i;
        java.lang.String str = f132322c;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str, "绘制PoiLayer的面，aoiStyle:" + cVar + "|poiArea:" + aVar);
        if (aVar != null && (bVar = aVar.f132346c) != null && "Polygon".equalsIgnoreCase(bVar.f132347a) && (list = aVar.f132346c.f132348b) != null) {
            a(cVar, list);
            z17 = true;
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(str, "PoiLayer的面渲染失败！");
            z17 = false;
        }
        this.f132324b = pxVar;
        if (!z17) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener onAoiLayerLoadListener = this.f132333l;
            if (onAoiLayerLoadListener != null) {
                onAoiLayerLoadListener.mo36920x40ec4b7a(false, this);
                return;
            }
            return;
        }
        java.util.List<com.tencent.mapsdk.internal.px.d> list2 = pxVar.f132343a.f132361j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str, "绘制PoiLayer的子点，remotePois:".concat(java.lang.String.valueOf(list2)));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.AnonymousClass4(list2, arrayList)).a((com.tencent.mapsdk.internal.ko.b.a) null, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.AnonymousClass3(list2, arrayList));
    }

    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26007x97be4188 c26007x97be4188) {
        if (c26007x97be4188 != null) {
            if (c26007x97be4188.m99298x931b01f6() != -1) {
                this.f132326e = c26007x97be4188.m99298x931b01f6();
            }
            if (c26007x97be4188.m99299x293c65c8() != -1) {
                this.f132327f = c26007x97be4188.m99299x293c65c8();
            }
        }
        if (this.f132328g) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "开始更新POI[" + this.f132325d + "]的详情数据");
        this.f132328g = true;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px>() { // from class: com.tencent.mapsdk.internal.pw.2
            private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px a() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132329h) {
                    return null;
                }
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this);
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132329h) {
                    return null;
                }
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this);
            }
        }).a((com.tencent.mapsdk.internal.ko.b.a) null, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) new com.tencent.mapsdk.internal.ko.a<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px>() { // from class: com.tencent.mapsdk.internal.pw.1
            private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.f132322c, "POI[" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132325d + "]的详情数据：" + pxVar);
                if (pxVar != null && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132329h) {
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132327f < 0) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this;
                        pwVar.f132327f = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.a(pwVar, pxVar);
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this, pxVar);
                } else if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132333l != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132333l.mo36920x40ec4b7a(false, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.f132322c, "结束POI[" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132325d + "]详情数据的更新");
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
            /* renamed from: callback */
            public final /* synthetic */ void mo35806xf5bc2045(java.lang.Object obj) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px) obj;
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.f132322c, "POI[" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132325d + "]的详情数据：" + pxVar);
                if (pxVar != null && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132329h) {
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132327f < 0) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this;
                        pwVar.f132327f = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.a(pwVar, pxVar);
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this, pxVar);
                } else if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132333l != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132333l.mo36920x40ec4b7a(false, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.f132322c, "结束POI[" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.this.f132325d + "]详情数据的更新");
            }
        });
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        java.lang.String str = f132322c;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str, "请求poiDetail[" + this.f132325d + "]");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null) {
            return null;
        }
        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36689x14d0573b = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.db) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dq) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dq.class)).i()).m36689x14d0573b(this.f132325d, neVar.F().f130542a);
        m36689x14d0573b.f16974x2c0d614c = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c;
        com.tencent.mapsdk.internal.ec.a aVar = new com.tencent.mapsdk.internal.ec.a(m36689x14d0573b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px.class);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str, "poiDetail[" + this.f132325d + "] resp:" + aVar.mo36017xd4418ac9());
        if (aVar.mo36017xd4418ac9()) {
            return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px) aVar.f130769b;
        }
        return null;
    }

    private int a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b a17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null || pxVar == null || (a17 = a(pxVar.f132343a)) == null) {
            return 0;
        }
        return ((int) neVar.f132046m.a(a17.m99551x9ddba266(), a17.m99548x19ca87ec(), 0, 0, 0, 0, null)) - 2;
    }

    private void a(com.tencent.mapsdk.internal.px.c cVar, java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> list) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null) {
            return;
        }
        int i17 = 0;
        if (this.f132331j == null) {
            this.f132331j = new int[list.size()];
            java.util.Iterator<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 b17 = b(cVar, it.next());
                if (!this.f132329h) {
                    int i18 = i17 + 1;
                    this.f132331j[i17] = neVar.a(b17);
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "添加PoiLayer成功,ID=" + this.f132331j[i18 - 1] + "|model:" + b17);
                    i17 = i18;
                }
            }
            return;
        }
        java.util.Iterator<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> it6 = list.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 b18 = b(cVar, it6.next());
            int i19 = i17 + 1;
            b18.f16589xe0df7f5 = this.f132331j[i17];
            if (!this.f132329h) {
                neVar.b(b18);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "更新PoiLayer成功");
            }
            i17 = i19;
        }
    }

    private void b(java.util.List<com.tencent.mapsdk.internal.px.d> list) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null) {
            return;
        }
        for (com.tencent.mapsdk.internal.px.d dVar : list) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw a17 = a(d(dVar.f132357f), dVar);
            a17.f131006a = dVar.f132352a;
            if (!this.f132330i) {
                a17.f131013h = "";
            }
            neVar.a(a17);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc ocVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) neVar.f132043j.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc.class, a17.f131006a);
            if (ocVar != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oe oeVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oe) ocVar.f132100d;
                oeVar.m35420x1bd1f072(this.f132330i);
                ocVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) oeVar);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "显示/隐藏子点成功！" + dVar.a() + "显示状态: " + this.f132330i);
            }
        }
    }

    private void a(java.util.List<com.tencent.mapsdk.internal.px.d> list) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        int i17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null) {
            return;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int i18 = 0;
        for (com.tencent.mapsdk.internal.px.d dVar : list) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw a17 = a(d(dVar.f132357f), dVar);
            int i19 = dVar.f132352a;
            if (i19 < 0) {
                if (neVar.f132043j != null && a17.f131026u != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc ocVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) neVar.f132043j.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.b(a17));
                    if (ocVar != null) {
                        i17 = ocVar.b();
                        dVar.f132352a = i17;
                        int i27 = i18 + 1;
                        iArr[i18] = i17;
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "添加子点成功！" + dVar.a() + "|id:" + a17.f131013h);
                        i18 = i27;
                    }
                }
                i17 = -1;
                dVar.f132352a = i17;
                int i272 = i18 + 1;
                iArr[i18] = i17;
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "添加子点成功！" + dVar.a() + "|id:" + a17.f131013h);
                i18 = i272;
            } else {
                a17.f131006a = i19;
                neVar.a(a17);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "更新子点成功！" + dVar.a());
            }
        }
        int[] iArr2 = new int[size];
        this.f132332k = iArr2;
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, size);
    }

    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 b(com.tencent.mapsdk.internal.px.c cVar, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        android.content.Context mo36630x76847179;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null || (mo36630x76847179 = neVar.mo36630x76847179()) == null) {
            return c4257x25d9a8e8;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(mo36630x76847179);
        c4257x25d9a8e8.f16588xc56c5ce3 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[]) list.toArray(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[0]);
        if (cVar != null) {
            c4257x25d9a8e8.f16580x2c2c84fa = cVar.f132351c;
            c4257x25d9a8e8.f16578x2b158697 = android.graphics.Color.parseColor(cVar.f132350b);
            c4257x25d9a8e8.f16581x5a72f63 = android.graphics.Color.parseColor(cVar.f132349a);
            c4257x25d9a8e8.f16584x6219b84 = 1;
            c4257x25d9a8e8.f16586x985d244c = this.f132327f;
            c4257x25d9a8e8.f16585x2bbef4de = this.f132326e;
        }
        return c4257x25d9a8e8;
    }

    public static /* synthetic */ void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar) {
        com.tencent.mapsdk.internal.px.d dVar;
        boolean z17;
        com.tencent.mapsdk.internal.px.b bVar;
        java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> list;
        if (pxVar == null || (dVar = pxVar.f132343a) == null) {
            return;
        }
        com.tencent.mapsdk.internal.px.c cVar = pwVar.d(dVar.f132357f).f132373l;
        com.tencent.mapsdk.internal.px.a aVar = pxVar.f132343a.f132360i;
        java.lang.String str = f132322c;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str, "绘制PoiLayer的面，aoiStyle:" + cVar + "|poiArea:" + aVar);
        if (aVar != null && (bVar = aVar.f132346c) != null && "Polygon".equalsIgnoreCase(bVar.f132347a) && (list = aVar.f132346c.f132348b) != null) {
            pwVar.a(cVar, list);
            z17 = true;
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(str, "PoiLayer的面渲染失败！");
            z17 = false;
        }
        pwVar.f132324b = pxVar;
        if (!z17) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener onAoiLayerLoadListener = pwVar.f132333l;
            if (onAoiLayerLoadListener != null) {
                onAoiLayerLoadListener.mo36920x40ec4b7a(false, pwVar);
                return;
            }
            return;
        }
        java.util.List<com.tencent.mapsdk.internal.px.d> list2 = pxVar.f132343a.f132361j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str, "绘制PoiLayer的子点，remotePois:".concat(java.lang.String.valueOf(list2)));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.AnonymousClass4(list2, arrayList)).a((com.tencent.mapsdk.internal.ko.b.a) null, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw.AnonymousClass3(list2, arrayList));
    }

    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b a(com.tencent.mapsdk.internal.px.d dVar) {
        com.tencent.mapsdk.internal.px.a aVar;
        com.tencent.mapsdk.internal.px.b bVar;
        java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> list;
        if (dVar != null && (aVar = dVar.f132360i) != null && (bVar = aVar.f132346c) != null && (list = bVar.f132348b) != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder builder = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder();
            java.util.Iterator<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> it = list.iterator();
            while (it.hasNext()) {
                builder.m99565x73c954a8(it.next());
            }
            try {
                return builder.m99563x59bc66e();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(android.util.Log.getStackTraceString(e17));
            }
        }
        return null;
    }

    private void a(java.util.List<com.tencent.mapsdk.internal.px.d> list, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<com.tencent.mapsdk.internal.px.d> interfaceC4308xf9968465) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        android.content.Context mo36630x76847179;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2;
        android.content.Context mo36630x768471792;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null || (mo36630x76847179 = neVar.mo36630x76847179()) == null || list == null || list.isEmpty()) {
            return;
        }
        for (int i17 = 0; i17 < list.size() && !this.f132329h; i17++) {
            com.tencent.mapsdk.internal.px.d dVar = list.get(i17);
            com.tencent.mapsdk.internal.px.e d17 = d(dVar.f132357f);
            java.lang.String str = d17.f132365d;
            if (!android.text.TextUtils.isEmpty(str)) {
                new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar2 = this.f132323a;
                if (pyVar2 != null && (neVar2 = pyVar2.f132375b) != null && (mo36630x768471792 = neVar2.mo36630x76847179()) != null) {
                    int a17 = (int) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(mo36630x768471792);
                    str = a17 <= 1 ? str.replace("{density}", "") : a17 <= 2 ? str.replace("{density}", "@2x") : str.replace("{density}", "@3x");
                }
            }
            java.lang.String str2 = f132322c;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str2, "请求子点[" + dVar.a() + "]icon url:" + str);
            if (!android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36628x18d39f1a = neVar.mo36628x18d39f1a(str, 8);
                d17.f132362a = mo36628x18d39f1a;
                mo36628x18d39f1a.m99321x981c205a().mo36727x53aeca08(2);
                if (d17.f132362a.m99320x12501425(mo36630x76847179) != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str2, "子点[" + dVar.a() + "]icon下载成功");
                    if (d17.f132366e == 1) {
                        com.tencent.mapsdk.internal.fs.a aVar = new com.tencent.mapsdk.internal.fs.a(dVar.a(), d17.f132368g, android.graphics.Color.parseColor(d17.f132367f));
                        aVar.f130992f = neVar.mo36637x5392760d() == null ? android.graphics.Typeface.DEFAULT : neVar.mo36637x5392760d();
                        aVar.f130991e = android.graphics.Color.parseColor(d17.f132369h);
                        aVar.f130990d = d17.f132370i;
                        aVar.f130993g = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(mo36630x76847179) / 2.0f;
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36627x18d39f1a = neVar.mo36627x18d39f1a(aVar, 9);
                        d17.f132363b = mo36627x18d39f1a;
                        if (mo36627x18d39f1a.m99320x12501425(mo36630x76847179) != null) {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str2, "子点[" + dVar.a() + "]文本图片创建成功");
                        } else {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(str2, "子点[" + dVar.a() + "]文本图片创建失败！");
                        }
                    }
                    if (interfaceC4308xf9968465 != null) {
                        interfaceC4308xf9968465.mo35806xf5bc2045(dVar);
                    }
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(str2, "子点[" + dVar.a() + "]icon下载失败！");
                }
            }
        }
    }

    private java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        android.content.Context mo36630x76847179;
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null || (mo36630x76847179 = neVar.mo36630x76847179()) == null) {
            return str;
        }
        int a17 = (int) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(mo36630x76847179);
        if (a17 <= 1) {
            return str.replace("{density}", "");
        }
        if (a17 <= 2) {
            return str.replace("{density}", "@2x");
        }
        return str.replace("{density}", "@3x");
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw a(com.tencent.mapsdk.internal.px.e eVar, com.tencent.mapsdk.internal.px.d dVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        android.content.Context mo36630x76847179;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw fwVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = this.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null || (mo36630x76847179 = neVar.mo36630x76847179()) == null || eVar == null) {
            return fwVar;
        }
        int i17 = eVar.f132366e;
        if (i17 == 0) {
            fwVar.f131016k = "";
        } else if (i17 == 1) {
            fwVar.f131016k = dVar.a();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e = eVar.f132363b;
            if (c26010x4177761e != null) {
                fwVar.f131013h = c26010x4177761e.m99321x981c205a().mo36721xbe9ba820();
                android.graphics.Bitmap m99320x12501425 = c26010x4177761e.m99320x12501425(mo36630x76847179);
                if (m99320x12501425 != null) {
                    fwVar.f131014i = m99320x12501425.getWidth();
                    fwVar.f131015j = m99320x12501425.getHeight();
                }
            }
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e2 = eVar.f132362a;
        if (c26010x4177761e2 == null) {
            return fwVar;
        }
        fwVar.f131007b = c26010x4177761e2.m99321x981c205a().mo36721xbe9ba820();
        android.graphics.Bitmap m99320x125014252 = c26010x4177761e2.m99320x12501425(mo36630x76847179);
        if (m99320x125014252 != null) {
            fwVar.f131008c = m99320x125014252.getWidth();
            fwVar.f131009d = m99320x125014252.getHeight();
        }
        fwVar.f131021p = 2;
        int i18 = eVar.f132372k;
        fwVar.f131022q = i18;
        fwVar.f131023r = ((eVar.f132371j + 1) * 10000) + i18;
        fwVar.f131026u = dVar.f132359h;
        fwVar.f131024s = this.f132327f;
        fwVar.f131025t = this.f132326e;
        fwVar.f131012g = 1.0f;
        return fwVar;
    }

    private com.tencent.mapsdk.internal.px.d a(long j17) {
        com.tencent.mapsdk.internal.px.d dVar;
        java.util.List<com.tencent.mapsdk.internal.px.d> list;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar = this.f132324b;
        if (pxVar == null || (dVar = pxVar.f132343a) == null || (list = dVar.f132361j) == null) {
            return null;
        }
        for (com.tencent.mapsdk.internal.px.d dVar2 : list) {
            if (((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) this.f132323a.f132375b.f132043j.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc.class, dVar2.f132352a)) != null && r2.a() == j17) {
                return dVar2;
            }
        }
        return null;
    }

    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26084x9440c00a a(java.lang.String str, com.tencent.mapsdk.internal.px.d dVar) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26084x9440c00a c26084x9440c00a = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26084x9440c00a();
        c26084x9440c00a.m99974xbc9e2de7(str);
        c26084x9440c00a.m99973x684351d(dVar.f132353b);
        c26084x9440c00a.m99627x764daa0d(dVar.a());
        c26084x9440c00a.m99628xa32537ab(dVar.f132359h);
        return c26084x9440c00a;
    }

    public static /* synthetic */ int a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.px pxVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b a17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = pwVar.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null || pxVar == null || (a17 = a(pxVar.f132343a)) == null) {
            return 0;
        }
        return ((int) neVar.f132046m.a(a17.m99551x9ddba266(), a17.m99548x19ca87ec(), 0, 0, 0, 0, null)) - 2;
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar, java.util.List list) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        int i17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = pwVar.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null) {
            return;
        }
        int size = list.size();
        int[] iArr = new int[size];
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.px.d dVar = (com.tencent.mapsdk.internal.px.d) it.next();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw a17 = pwVar.a(pwVar.d(dVar.f132357f), dVar);
            int i19 = dVar.f132352a;
            if (i19 < 0) {
                if (neVar.f132043j != null && a17.f131026u != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc ocVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oc) neVar.f132043j.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.b(a17));
                    if (ocVar != null) {
                        i17 = ocVar.b();
                        dVar.f132352a = i17;
                        int i27 = i18 + 1;
                        iArr[i18] = i17;
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "添加子点成功！" + dVar.a() + "|id:" + a17.f131013h);
                        i18 = i27;
                    }
                }
                i17 = -1;
                dVar.f132352a = i17;
                int i272 = i18 + 1;
                iArr[i18] = i17;
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "添加子点成功！" + dVar.a() + "|id:" + a17.f131013h);
                i18 = i272;
            } else {
                a17.f131006a = i19;
                neVar.a(a17);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(f132322c, "更新子点成功！" + dVar.a());
            }
        }
        int[] iArr2 = new int[size];
        pwVar.f132332k = iArr2;
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, size);
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pw pwVar, java.util.List list, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465 interfaceC4308xf9968465) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        android.content.Context mo36630x76847179;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2;
        android.content.Context mo36630x768471792;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar = pwVar.f132323a;
        if (pyVar == null || (neVar = pyVar.f132375b) == null || (mo36630x76847179 = neVar.mo36630x76847179()) == null || list == null || list.isEmpty()) {
            return;
        }
        for (int i17 = 0; i17 < list.size() && !pwVar.f132329h; i17++) {
            com.tencent.mapsdk.internal.px.d dVar = (com.tencent.mapsdk.internal.px.d) list.get(i17);
            com.tencent.mapsdk.internal.px.e d17 = pwVar.d(dVar.f132357f);
            java.lang.String str = d17.f132365d;
            if (!android.text.TextUtils.isEmpty(str)) {
                new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fw();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.py pyVar2 = pwVar.f132323a;
                if (pyVar2 != null && (neVar2 = pyVar2.f132375b) != null && (mo36630x768471792 = neVar2.mo36630x76847179()) != null) {
                    int a17 = (int) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(mo36630x768471792);
                    str = a17 <= 1 ? str.replace("{density}", "") : a17 <= 2 ? str.replace("{density}", "@2x") : str.replace("{density}", "@3x");
                }
            }
            java.lang.String str2 = f132322c;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str2, "请求子点[" + dVar.a() + "]icon url:" + str);
            if (!android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36628x18d39f1a = neVar.mo36628x18d39f1a(str, 8);
                d17.f132362a = mo36628x18d39f1a;
                mo36628x18d39f1a.m99321x981c205a().mo36727x53aeca08(2);
                if (d17.f132362a.m99320x12501425(mo36630x76847179) != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str2, "子点[" + dVar.a() + "]icon下载成功");
                    if (d17.f132366e == 1) {
                        com.tencent.mapsdk.internal.fs.a aVar = new com.tencent.mapsdk.internal.fs.a(dVar.a(), d17.f132368g, android.graphics.Color.parseColor(d17.f132367f));
                        aVar.f130992f = neVar.mo36637x5392760d() == null ? android.graphics.Typeface.DEFAULT : neVar.mo36637x5392760d();
                        aVar.f130991e = android.graphics.Color.parseColor(d17.f132369h);
                        aVar.f130990d = d17.f132370i;
                        aVar.f130993g = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(mo36630x76847179) / 2.0f;
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36627x18d39f1a = neVar.mo36627x18d39f1a(aVar, 9);
                        d17.f132363b = mo36627x18d39f1a;
                        if (mo36627x18d39f1a.m99320x12501425(mo36630x76847179) != null) {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(str2, "子点[" + dVar.a() + "]文本图片创建成功");
                        } else {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(str2, "子点[" + dVar.a() + "]文本图片创建失败！");
                        }
                    }
                    interfaceC4308xf9968465.mo35806xf5bc2045(dVar);
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(str2, "子点[" + dVar.a() + "]icon下载失败！");
                }
            }
        }
    }
}
