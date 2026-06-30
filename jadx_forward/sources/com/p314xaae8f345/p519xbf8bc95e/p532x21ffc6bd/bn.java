package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class bn implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 {

    /* renamed from: f, reason: collision with root package name */
    private static final java.util.Map<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> f130526f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private static final java.util.Set<com.tencent.mapsdk.internal.bn.a> f130527g;

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f130528h = "map-context.cache";

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f130529i = "navi_marker_location.png";

    /* renamed from: j, reason: collision with root package name */
    private static final java.lang.String f130530j = "color_texture_flat_style.png";

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 f130531a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo f130532b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg f130533c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f130534d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f130535e = true;

    /* renamed from: k, reason: collision with root package name */
    private final android.content.Context f130536k;

    /* renamed from: l, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn f130537l;

    /* renamed from: m, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gm f130538m;

    /* renamed from: n, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz f130539n;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> f130540a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> f130541b;

        public a(java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls, java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls2) {
            this.f130540a = cls;
            this.f130541b = cls2;
        }

        /* renamed from: equals */
        public final boolean m36638xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && com.tencent.mapsdk.internal.bn.a.class == obj.getClass()) {
                com.tencent.mapsdk.internal.bn.a aVar = (com.tencent.mapsdk.internal.bn.a) obj;
                java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls = this.f130540a;
                if (cls == null ? aVar.f130540a != null : !cls.equals(aVar.f130540a)) {
                    return false;
                }
                java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls2 = this.f130541b;
                java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls3 = aVar.f130541b;
                if (cls2 != null) {
                    return cls2.equals(cls3);
                }
                if (cls3 == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: hashCode */
        public final int m36639x8cdac1b() {
            java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls = this.f130540a;
            int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
            java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls2 = this.f130541b;
            return hashCode + (cls2 != null ? cls2.hashCode() : 0);
        }
    }

    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f130542a;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f130544c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f130545d;

        /* renamed from: f, reason: collision with root package name */
        java.lang.String f130547f;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f130543b = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.m();

        /* renamed from: e, reason: collision with root package name */
        java.lang.String f130546e = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.n();

        public b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
            this.f130547f = "undefined";
            this.f130542a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a();
            if (c25966x7e4576a7 != null) {
                if (!android.text.TextUtils.isEmpty(c25966x7e4576a7.m99204x24a25659())) {
                    this.f130542a = c25966x7e4576a7.m99204x24a25659();
                }
                if (!android.text.TextUtils.isEmpty(c25966x7e4576a7.m99217x2ff2e2f5())) {
                    this.f130544c = c25966x7e4576a7.m99217x2ff2e2f5();
                }
                if (!android.text.TextUtils.isEmpty(c25966x7e4576a7.m99216x7528ddc5())) {
                    this.f130545d = c25966x7e4576a7.m99216x7528ddc5();
                }
                this.f130547f = c25966x7e4576a7.m99195x7b651f8d();
            }
        }

        private java.lang.String d() {
            return this.f130542a;
        }

        private java.lang.String e() {
            return this.f130543b;
        }

        private java.lang.String f() {
            return this.f130544c;
        }

        private java.lang.String g() {
            return this.f130545d;
        }

        private java.lang.String h() {
            return this.f130546e;
        }

        private java.lang.String i() {
            return this.f130547f;
        }

        private java.lang.String j() {
            return this.f130542a + "-" + this.f130543b + "-" + this.f130544c + "-" + this.f130545d;
        }

        private java.lang.String k() {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(a());
        }

        public final java.lang.String a() {
            return this.f130546e + "-" + this.f130542a + "-" + this.f130543b + "-" + this.f130544c + "-" + this.f130545d;
        }

        public final java.lang.String b() {
            return android.text.TextUtils.isEmpty(this.f130544c) ? this.f130542a : this.f130544c;
        }

        public final java.lang.String c() {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(this.f130542a + "-" + this.f130543b + "-" + this.f130544c + "-" + this.f130545d);
        }
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f130527g = hashSet;
        hashSet.add(new com.tencent.mapsdk.internal.bn.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25967x14299faf.class, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.class));
        hashSet.add(new com.tencent.mapsdk.internal.bn.a(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4267xd8224c64.class, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.class));
    }

    public bn(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo boVar) {
        this.f130536k = context.getApplicationContext();
        this.f130531a = c25966x7e4576a7;
        this.f130532b = boVar;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99325x14ea20d8(this);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.a(c25966x7e4576a7);
    }

    public static android.os.Bundle C() {
        byte[] c17;
        java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f131719d, f130528h);
        if (!file.exists() || (c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(file)) == null || c17.length <= 0) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(c17, 0, c17.length);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.readFromParcel(obtain);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file);
        obtain.recycle();
        return bundle;
    }

    private void a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn gnVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn(this);
        this.f130537l = gnVar;
        if (gnVar.f131149a == 0) {
            gnVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.AnonymousClass1(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn.AnonymousClass2()));
        }
        gnVar.f131149a++;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mapsdk.internal.gn.e.a(com.tencent.mapsdk.internal.gn.c.CREATE).f131184e = java.lang.Long.valueOf(currentTimeMillis);
        this.f130533c = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg(currentTimeMillis);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gn gnVar2 = this.f130537l;
        java.lang.String str = gnVar2.f131151c;
        java.lang.String str2 = gnVar2.f131152d;
        java.lang.String m17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.m();
        java.lang.String str3 = gnVar2.f131153e;
        java.lang.String h17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.h();
        java.lang.String d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.j());
        this.f130538m = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gm(new com.tencent.mapsdk.internal.gl.b(str, str2, m17, str3, h17, d17, sb6.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.k(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.n(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.c(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.g()));
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg b() {
        return this.f130533c;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gm c() {
        return this.f130538m;
    }

    private void e() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (bundle.size() > 0) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f131719d, f130528h), obtain.marshall());
            obtain.recycle();
        }
        D();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99332x75c480a6(this);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.r();
    }

    private boolean f() {
        return this.f130534d;
    }

    private boolean g() {
        return this.f130535e;
    }

    private void h() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (bundle.size() > 0) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f131719d, f130528h), obtain.marshall());
            obtain.recycle();
        }
        D();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99332x75c480a6(this);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.r();
    }

    private void i() {
        java.util.Map<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>> B = B();
        if (B != null) {
            for (java.util.Map.Entry<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>> entry : B.entrySet()) {
                f130527g.add(new com.tencent.mapsdk.internal.bn.a(entry.getKey(), entry.getValue()));
            }
        }
        for (com.tencent.mapsdk.internal.bn.a aVar : f130527g) {
            java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls = aVar.f130540a;
            java.util.Map<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> map = f130526f;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component component = map.get(cls);
            java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls2 = aVar.f130541b;
            if (component == null && cls2 != null && cls.isAssignableFrom(cls2)) {
                component = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(cls2, new java.lang.Object[0]);
                if (component instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) component).a(mo36630x76847179());
                }
                map.put(cls, component);
            }
            if (component instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) component).a(this);
            }
        }
    }

    private void j() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>> it = f130526f.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component value = it.next().getValue();
            if (value instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) value).b(this);
            }
        }
    }

    private void k() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>> it = f130526f.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component value = it.next().getValue();
            if (value instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) value).c(this);
            }
        }
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25967x14299faf l() {
        return (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25967x14299faf) mo36632x16607177(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25967x14299faf.class);
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 m() {
        return this.f130531a;
    }

    private java.io.File n() {
        return E().c();
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 p() {
        return this.f130531a.m99212xe8392720();
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db q() {
        return this.f130531a.m99206xf81c97c5();
    }

    public final void A() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>> it = f130526f.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component value = it.next().getValue();
            if (value instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) value).c(this);
            }
        }
    }

    public java.util.Map<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>> B() {
        return null;
    }

    public final void D() {
        for (java.util.Map.Entry<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> entry : f130526f.entrySet()) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component value = entry.getValue();
            if (value instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm bmVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) value;
                bmVar.d(this);
                if (bmVar.f130524a.size() == 0) {
                    f130526f.remove(entry.getKey());
                    bmVar.b_();
                }
            }
        }
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz E() {
        if (this.f130539n == null) {
            this.f130539n = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(this.f130536k, this.f130531a);
        }
        return this.f130539n;
    }

    public final com.tencent.mapsdk.internal.bn.b F() {
        return new com.tencent.mapsdk.internal.bn.b(this.f130531a);
    }

    public abstract java.lang.String G();

    public abstract java.lang.String H();

    public abstract java.lang.String I();

    public abstract com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bs J();

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525
    /* renamed from: createBitmapDescriptor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36625x18d39f1a(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs fsVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs(mo36630x76847179(), i18);
        fsVar.f130969a = i17;
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(fsVar);
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.InterfaceC4363x6b3e72e1 d() {
        return this.f130532b;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8
    /* renamed from: getContext */
    public final android.content.Context mo36630x76847179() {
        return this.f130536k;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525
    /* renamed from: getDefaultMyLocationStyle */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 mo36631xc790bf25() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 c26072x8cb38890 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890();
        c26072x8cb38890.m99808x313c79(mo36628x18d39f1a(f130529i, 2));
        return c26072x8cb38890;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8
    /* renamed from: getMapComponent */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6 mo36633x16607177() {
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8
    /* renamed from: getMapResource */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525 mo36634x9c80f854() {
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6
    /* renamed from: getMapServiceProtocol */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76 mo36635xd89fc567() {
        return (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25969x979c0b76) mo36632x16607177(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25967x14299faf.class);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525
    /* renamed from: getScreenPixels */
    public int mo36636xf72cbcaf() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525
    /* renamed from: getTypeface */
    public android.graphics.Typeface mo36637x5392760d() {
        return this.f130531a.m99219x5392760d();
    }

    public abstract boolean o();

    public final void w() {
        com.tencent.mapsdk.internal.bn.b F = F();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a(this.f130536k, F.f130542a, F.f130543b, F.f130547f);
        java.util.Map<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>> B = B();
        if (B != null) {
            for (java.util.Map.Entry<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>> entry : B.entrySet()) {
                f130527g.add(new com.tencent.mapsdk.internal.bn.a(entry.getKey(), entry.getValue()));
            }
        }
        for (com.tencent.mapsdk.internal.bn.a aVar : f130527g) {
            java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls = aVar.f130540a;
            java.util.Map<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> map = f130526f;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component component = map.get(cls);
            java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> cls2 = aVar.f130541b;
            if (component == null && cls2 != null && cls.isAssignableFrom(cls2)) {
                component = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(cls2, new java.lang.Object[0]);
                if (component instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) component).a(mo36630x76847179());
                }
                map.put(cls, component);
            }
            if (component instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) component).a(this);
            }
        }
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cr x() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25967x14299faf l17 = l();
        return l17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp ? ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp) l17).e().f130665b : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.f();
    }

    public abstract void y();

    public final void z() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Class<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component>> it = f130526f.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component value = it.next().getValue();
            if (value instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) value).b(this);
            }
        }
    }

    private void b(boolean z17) {
        this.f130535e = z17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6
    /* renamed from: getMapComponent */
    public <T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> T mo36632x16607177(java.lang.Class<T> cls) {
        T t17 = (T) f130526f.get(cls);
        if (t17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) t17).a(this, null);
        }
        return t17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525
    /* renamed from: createBitmapDescriptor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36628x18d39f1a(java.lang.String str, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs fsVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs(mo36630x76847179(), i17);
        if (i17 == 2) {
            fsVar.f130970b = str;
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(fsVar);
        }
        if (i17 == 3) {
            fsVar.f130971c = str;
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(fsVar);
        }
        if (i17 == 4) {
            fsVar.f130972d = str;
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(fsVar);
        }
        if (i17 != 8) {
            return null;
        }
        fsVar.f130974f = str;
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(fsVar);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525
    /* renamed from: createBitmapDescriptor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36623x18d39f1a(float f17, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs fsVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs(mo36630x76847179(), i17);
        fsVar.f130973e = f17;
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(fsVar);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525
    /* renamed from: createBitmapDescriptor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36627x18d39f1a(android.os.Parcelable parcelable, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs fsVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs(mo36630x76847179(), i17);
        if (i17 == 9) {
            if (!(parcelable instanceof com.tencent.mapsdk.internal.fs.a)) {
                return null;
            }
            fsVar.f130975g = (com.tencent.mapsdk.internal.fs.a) parcelable;
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(fsVar);
        }
        if (i17 == 7 && (parcelable instanceof android.graphics.Bitmap)) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(fsVar.a((android.graphics.Bitmap) parcelable));
        }
        return null;
    }

    private void a(boolean z17) {
        this.f130534d = z17;
    }

    private static void a(android.os.Bundle bundle) {
        if (bundle.size() > 0) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f131719d, f130528h), obtain.marshall());
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525
    /* renamed from: createBitmapDescriptor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36626x18d39f1a(android.graphics.Bitmap bitmap, int i17) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs(mo36630x76847179(), i17).a(bitmap));
    }

    private <T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> T a(java.lang.Class<T> cls) {
        T t17 = (T) f130526f.get(cls);
        if (t17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm) t17).a(this, null);
        }
        return t17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525
    /* renamed from: createBitmapDescriptor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36629x18d39f1a(android.graphics.Bitmap[] bitmapArr, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs fsVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs(mo36630x76847179(), i17);
        fsVar.f130976h = bitmapArr;
        fsVar.mo36720x12501425(fsVar.f130977i);
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(fsVar);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25968x3acad525
    /* renamed from: createBitmapDescriptor */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e mo36624x18d39f1a(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs fsVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fs(mo36630x76847179(), i17);
        if (i17 == 5) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e(fsVar);
        }
        return null;
    }
}
