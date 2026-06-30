package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest */
/* loaded from: classes7.dex */
public final class C12105x9a9f8a9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9> f34175x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.m2();

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f162551h = "MicroMsg.AppBrand.OpenFileRequest";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f162552d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f162553e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f162554f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f162555g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$OpenResult */
    /* loaded from: classes7.dex */
    public static final class OpenResult extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.OpenResult> f34176x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v2();

        /* renamed from: d, reason: collision with root package name */
        public int f162556d;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600
        /* renamed from: readParcel */
        public void mo50320xdc053d3f(android.os.Parcel parcel) {
            this.f162556d = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f162556d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$a */
    /* loaded from: classes8.dex */
    public static final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

        /* renamed from: p, reason: collision with root package name */
        private static final int f162557p = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a.class.hashCode() & 65535;

        /* renamed from: i, reason: collision with root package name */
        private boolean f162563i;

        /* renamed from: o, reason: collision with root package name */
        private byte f162566o;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f162558d = "";

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f162559e = "";

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f162560f = "";

        /* renamed from: g, reason: collision with root package name */
        private java.lang.String f162561g = "";

        /* renamed from: h, reason: collision with root package name */
        private java.lang.String f162562h = "";

        /* renamed from: m, reason: collision with root package name */
        private uh0.v f162564m = null;

        /* renamed from: n, reason: collision with root package name */
        private android.webkit.ValueCallback<java.lang.String> f162565n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.u2(this);

        @mk0.a
        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class C30918a implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2> {
            private C30918a() {
            }

            @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
            /* renamed from: invoke */
            public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
                if (c10756x2a5d7b2d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.f162551h, "IPCFav data null");
                    return;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                java.lang.String str = com.p314xaae8f345.mm.vfs.w6.q(c10756x2a5d7b2d.f149939d) + "." + com.p314xaae8f345.mm.vfs.w6.n(c10756x2a5d7b2d.f149939d);
                o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
                java.lang.String str2 = c10756x2a5d7b2d.f149939d;
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) c5Var).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.k(c5303xc75d2f73, 13, str2, str, "", "");
                c5303xc75d2f73.e();
                if (rVar != null) {
                    rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(c5303xc75d2f73.f135624h.f87966a));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F() {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(this.f162559e), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a.C30918a.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.q2(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public uh0.v G(boolean z17) {
            uh0.v vVar;
            if (!z17 && (vVar = this.f162564m) != null) {
                return vVar;
            }
            uh0.v vVar2 = this.f162564m;
            if (vVar2 != null) {
                vVar2.f509272a = true;
            }
            this.f162564m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.o2(this);
            if (m50422x8f77ef41() != null) {
                m50422x8f77ef41().f159911z = this.f162564m;
            }
            return this.f162564m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(java.lang.String str, java.lang.String str2) {
            java.lang.String b17 = q75.g.b(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.OpenResult openResult = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.OpenResult();
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setPackage(null);
                intent.setAction("android.intent.action.VIEW");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(m50421x3c6fed6a(), intent, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)), b17, false);
                intent.addFlags(268435456);
                intent.addFlags(524288);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m50421x3c6fed6a, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/file/OpenFileRequest$OpenLogic", "openOuterAppDirectly", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                m50421x3c6fed6a.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(m50421x3c6fed6a, "com/tencent/mm/plugin/appbrand/jsapi/file/OpenFileRequest$OpenLogic", "openOuterAppDirectly", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                openResult.f162556d = 0;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.f162551h, "start outer view with mime(%s), e = %s", b17, e17);
                openResult.f162556d = 2147483646;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n2(this));
            }
            m50420x7b736e5c(openResult);
        }

        private void I() {
            com.p314xaae8f345.mm.ui.v9.f(m50421x3c6fed6a(), b3.l.m9702x7444d5ad(m50421x3c6fed6a(), com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
            ((th0.u) ((uh0.r) i95.n0.c(uh0.r.class))).getClass();
            com.p314xaae8f345.mm.p2829xfa87f9de.i.f296373b = null;
            if (m50422x8f77ef41() == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("extra_param_open_file_scene", java.lang.String.valueOf(10));
                uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
                java.lang.String str = this.f162559e;
                java.lang.String str2 = this.f162560f;
                java.lang.String str3 = this.f162561g;
                java.lang.String str4 = this.f162562h;
                android.webkit.ValueCallback<java.lang.String> valueCallback = this.f162565n;
                uh0.v G = G(true);
                boolean z17 = this.f162563i;
                ((th0.u) rVar).getClass();
                com.p314xaae8f345.mm.p2829xfa87f9de.i.d(m50421x3c6fed6a, str, str2, str3, str4, false, hashMap, valueCallback, G, z17);
                return;
            }
            m50422x8f77ef41().f159903r = this.f162558d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57 m50422x8f77ef41 = m50422x8f77ef41();
            java.lang.String str5 = this.f162559e;
            java.lang.String str6 = this.f162561g;
            java.lang.String str7 = this.f162562h;
            java.lang.String str8 = this.f162560f;
            boolean z18 = this.f162563i;
            m50422x8f77ef41.f159904s = str5;
            m50422x8f77ef41.f159905t = str6;
            m50422x8f77ef41.f159906u = str7;
            m50422x8f77ef41.f159907v = str8;
            m50422x8f77ef41.f159908w = z18;
            m50422x8f77ef41().A = this.f162565n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57 m50422x8f77ef412 = m50422x8f77ef41();
            m50422x8f77ef412.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskProxyUI", "creatFilesFloatball() processName:%s", bm5.f1.a());
            rh1.a aVar = new rh1.a(new ak3.i(m50422x8f77ef412.mo55332x76847179()));
            m50422x8f77ef412.f159902q = aVar;
            java.lang.String str9 = m50422x8f77ef412.f159904s;
            java.lang.String str10 = m50422x8f77ef412.f159905t;
            java.lang.String str11 = m50422x8f77ef412.f159903r;
            java.lang.String a17 = bm5.f1.a();
            boolean z19 = m50422x8f77ef412.f159908w;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFilesMultiTaskHelper", "onCreate, filePath:%s fileExt:%s ", str9, str10);
            aVar.f477156y = m50422x8f77ef412;
            aVar.y(4, qp1.n.c(str9));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            r45.qs0 qs0Var = aVar.f477155x;
            qs0Var.set(0, bool);
            qs0Var.set(1, str9);
            qs0Var.set(2, str10);
            qs0Var.set(3, str11);
            qs0Var.set(4, a17);
            qs0Var.set(6, java.lang.Boolean.valueOf(z19));
            qs0Var.set(5, 0);
            try {
                aVar.f381610a.f66790x225a93cf = qs0Var.mo14344x5f01b1f6();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFilesMultiTaskHelper", "handleMultiTaskInfoClicked", e17);
            }
            aVar.J();
            rh1.a aVar2 = m50422x8f77ef412.f159902q;
            java.lang.String str12 = m50422x8f77ef412.f159905t;
            java.lang.String str13 = m50422x8f77ef412.f159907v;
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = aVar2.f381610a;
            c16601x7ed0e40c.v0().set(1, str13);
            c16601x7ed0e40c.v0().set(4, str12);
            aVar2.J();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.B(m50422x8f77ef412.f159903r, m50422x8f77ef412.C);
            uh0.s sVar = (uh0.s) i95.n0.c(uh0.s.class);
            boolean s17 = m50422x8f77ef41().f159902q.s();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a2 = m50421x3c6fed6a();
            java.lang.String str14 = this.f162559e;
            java.lang.String str15 = this.f162560f;
            java.lang.String str16 = this.f162561g;
            java.lang.String str17 = this.f162562h;
            android.webkit.ValueCallback<java.lang.String> valueCallback2 = this.f162565n;
            uh0.v G2 = G(true);
            java.lang.String str18 = this.f162558d;
            boolean z27 = this.f162563i;
            ((th0.w) sVar).getClass();
            vt0.c.f(s17, false, false, m50421x3c6fed6a2, str14, str15, str16, "", str17, 10, valueCallback2, G2, true, str18, z27, false);
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
        /* renamed from: handleRequest */
        public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
            java.lang.String str;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9 c12105x9a9f8a9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9) abstractC11887x3610e10c;
            this.f162558d = c12105x9a9f8a9.f162554f;
            this.f162559e = c12105x9a9f8a9.f162552d;
            this.f162561g = c12105x9a9f8a9.f162553e;
            this.f162563i = c12105x9a9f8a9.f162555g;
            this.f162562h = java.lang.Integer.toString(m50421x3c6fed6a().hashCode());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                H(this.f162559e, this.f162561g);
                return;
            }
            try {
                int lastIndexOf = this.f162559e.lastIndexOf(47) + 1;
                if (lastIndexOf < 0 || lastIndexOf == this.f162559e.length()) {
                    lastIndexOf = 0;
                }
                java.lang.String str2 = this.f162559e;
                str = str2.substring(lastIndexOf, str2.length());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.f162551h, "get file name error " + e17.getMessage());
                str = "";
            }
            this.f162560f = str;
            I();
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v, com.p314xaae8f345.mm.ui.xc
        /* renamed from: mmOnActivityResult */
        public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
            if (f162557p != i17) {
                m50420x7b736e5c(null);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.OpenResult openResult = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.OpenResult();
            if (-1 == i18) {
                openResult.f162556d = 0;
            } else {
                openResult.f162556d = Integer.MAX_VALUE;
            }
            m50420x7b736e5c(openResult);
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
        /* renamed from: onConfigurationChanged */
        public void mo50425x50e1c15d(android.content.res.Configuration configuration) {
            super.mo50425x50e1c15d(configuration);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.g(m50421x3c6fed6a(), 2 == configuration.orientation);
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
        /* renamed from: onProcessInterrupted */
        public void mo50427x5b335c92() {
            super.mo50427x5b335c92();
            m50421x3c6fed6a().getWindow().setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
    }

    public C12105x9a9f8a9() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getUIAlias */
    public java.lang.String mo50398xeb5ebc06() {
        return "QbDocumentReader";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: noActionBar */
    public boolean mo50400x69604d3c() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: readParcel */
    public void mo50318xdc053d3f(android.os.Parcel parcel) {
        super.mo50318xdc053d3f(parcel);
        this.f162552d = parcel.readString();
        this.f162553e = parcel.readString();
        this.f162554f = parcel.readString();
        this.f162555g = parcel.readInt() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f162552d);
        parcel.writeString(this.f162553e);
        parcel.writeString(this.f162554f);
        parcel.writeInt(this.f162555g ? 1 : 0);
    }

    public C12105x9a9f8a9(android.os.Parcel parcel) {
        super(parcel);
    }
}
