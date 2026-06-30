package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class OpenFileRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.file.m2();

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f81018h = "MicroMsg.AppBrand.OpenFileRequest";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f81019d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f81020e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f81021f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f81022g;

    /* loaded from: classes7.dex */
    public static final class OpenResult extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.OpenResult> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.file.v2();

        /* renamed from: d, reason: collision with root package name */
        public int f81023d;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult
        public void readParcel(android.os.Parcel parcel) {
            this.f81023d = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f81023d);
        }
    }

    /* loaded from: classes8.dex */
    public static final class a extends com.tencent.mm.plugin.appbrand.ipc.v {

        /* renamed from: p, reason: collision with root package name */
        private static final int f81024p = com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a.class.hashCode() & 65535;

        /* renamed from: i, reason: collision with root package name */
        private boolean f81030i;

        /* renamed from: o, reason: collision with root package name */
        private byte f81033o;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f81025d = "";

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f81026e = "";

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f81027f = "";

        /* renamed from: g, reason: collision with root package name */
        private java.lang.String f81028g = "";

        /* renamed from: h, reason: collision with root package name */
        private java.lang.String f81029h = "";

        /* renamed from: m, reason: collision with root package name */
        private uh0.v f81031m = null;

        /* renamed from: n, reason: collision with root package name */
        private android.webkit.ValueCallback<java.lang.String> f81032n = new com.tencent.mm.plugin.appbrand.jsapi.file.u2(this);

        @mk0.a
        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static final class C0048a implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.ipcinvoker.type.IPCInteger> {
            private C0048a() {
            }

            @Override // com.tencent.mm.ipcinvoker.j
            public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
                com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
                if (iPCString == null) {
                    com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.f81018h, "IPCFav data null");
                    return;
                }
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                java.lang.String str = com.tencent.mm.vfs.w6.q(iPCString.f68406d) + "." + com.tencent.mm.vfs.w6.n(iPCString.f68406d);
                o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
                java.lang.String str2 = iPCString.f68406d;
                ((com.tencent.mm.pluginsdk.model.b2) c5Var).getClass();
                com.tencent.mm.pluginsdk.model.a2.k(doFavoriteEvent, 13, str2, str, "", "");
                doFavoriteEvent.e();
                if (rVar != null) {
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(doFavoriteEvent.f54091h.f6433a));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F() {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(this.f81026e), com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a.C0048a.class, new com.tencent.mm.plugin.appbrand.jsapi.file.q2(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public uh0.v G(boolean z17) {
            uh0.v vVar;
            if (!z17 && (vVar = this.f81031m) != null) {
                return vVar;
            }
            uh0.v vVar2 = this.f81031m;
            if (vVar2 != null) {
                vVar2.f427739a = true;
            }
            this.f81031m = new com.tencent.mm.plugin.appbrand.jsapi.file.o2(this);
            if (getAppBrandTaskProxyUI() != null) {
                getAppBrandTaskProxyUI().f78378z = this.f81031m;
            }
            return this.f81031m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(java.lang.String str, java.lang.String str2) {
            java.lang.String b17 = q75.g.b(str2);
            com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.OpenResult openResult = new com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.OpenResult();
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setPackage(null);
                intent.setAction("android.intent.action.VIEW");
                com.tencent.mm.sdk.platformtools.i1.f(getActivityContext(), intent, new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)), b17, false);
                intent.addFlags(268435456);
                intent.addFlags(524288);
                com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityContext, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/file/OpenFileRequest$OpenLogic", "openOuterAppDirectly", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityContext.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityContext, "com/tencent/mm/plugin/appbrand/jsapi/file/OpenFileRequest$OpenLogic", "openOuterAppDirectly", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                openResult.f81023d = 0;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.f81018h, "start outer view with mime(%s), e = %s", b17, e17);
                openResult.f81023d = 2147483646;
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.file.n2(this));
            }
            finishProcess(openResult);
        }

        private void I() {
            com.tencent.mm.ui.v9.f(getActivityContext(), b3.l.getColor(getActivityContext(), com.tencent.mm.R.color.a07));
            ((th0.u) ((uh0.r) i95.n0.c(uh0.r.class))).getClass();
            com.tencent.mm.xwebutil.i.f214840b = null;
            if (getAppBrandTaskProxyUI() == null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("extra_param_open_file_scene", java.lang.String.valueOf(10));
                uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
                com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
                java.lang.String str = this.f81026e;
                java.lang.String str2 = this.f81027f;
                java.lang.String str3 = this.f81028g;
                java.lang.String str4 = this.f81029h;
                android.webkit.ValueCallback<java.lang.String> valueCallback = this.f81032n;
                uh0.v G = G(true);
                boolean z17 = this.f81030i;
                ((th0.u) rVar).getClass();
                com.tencent.mm.xwebutil.i.d(activityContext, str, str2, str3, str4, false, hashMap, valueCallback, G, z17);
                return;
            }
            getAppBrandTaskProxyUI().f78370r = this.f81025d;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI appBrandTaskProxyUI = getAppBrandTaskProxyUI();
            java.lang.String str5 = this.f81026e;
            java.lang.String str6 = this.f81028g;
            java.lang.String str7 = this.f81029h;
            java.lang.String str8 = this.f81027f;
            boolean z18 = this.f81030i;
            appBrandTaskProxyUI.f78371s = str5;
            appBrandTaskProxyUI.f78372t = str6;
            appBrandTaskProxyUI.f78373u = str7;
            appBrandTaskProxyUI.f78374v = str8;
            appBrandTaskProxyUI.f78375w = z18;
            getAppBrandTaskProxyUI().A = this.f81032n;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI appBrandTaskProxyUI2 = getAppBrandTaskProxyUI();
            appBrandTaskProxyUI2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskProxyUI", "creatFilesFloatball() processName:%s", bm5.f1.a());
            rh1.a aVar = new rh1.a(new ak3.i(appBrandTaskProxyUI2.getContext()));
            appBrandTaskProxyUI2.f78369q = aVar;
            java.lang.String str9 = appBrandTaskProxyUI2.f78371s;
            java.lang.String str10 = appBrandTaskProxyUI2.f78372t;
            java.lang.String str11 = appBrandTaskProxyUI2.f78370r;
            java.lang.String a17 = bm5.f1.a();
            boolean z19 = appBrandTaskProxyUI2.f78375w;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFilesMultiTaskHelper", "onCreate, filePath:%s fileExt:%s ", str9, str10);
            aVar.f395623y = appBrandTaskProxyUI2;
            aVar.y(4, qp1.n.c(str9));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            r45.qs0 qs0Var = aVar.f395622x;
            qs0Var.set(0, bool);
            qs0Var.set(1, str9);
            qs0Var.set(2, str10);
            qs0Var.set(3, str11);
            qs0Var.set(4, a17);
            qs0Var.set(6, java.lang.Boolean.valueOf(z19));
            qs0Var.set(5, 0);
            try {
                aVar.f300077a.field_data = qs0Var.toByteArray();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandFilesMultiTaskHelper", "handleMultiTaskInfoClicked", e17);
            }
            aVar.J();
            rh1.a aVar2 = appBrandTaskProxyUI2.f78369q;
            java.lang.String str12 = appBrandTaskProxyUI2.f78372t;
            java.lang.String str13 = appBrandTaskProxyUI2.f78374v;
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = aVar2.f300077a;
            multiTaskInfo.v0().set(1, str13);
            multiTaskInfo.v0().set(4, str12);
            aVar2.J();
            com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(appBrandTaskProxyUI2.f78370r, appBrandTaskProxyUI2.C);
            uh0.s sVar = (uh0.s) i95.n0.c(uh0.s.class);
            boolean s17 = getAppBrandTaskProxyUI().f78369q.s();
            com.tencent.mm.ui.MMActivity activityContext2 = getActivityContext();
            java.lang.String str14 = this.f81026e;
            java.lang.String str15 = this.f81027f;
            java.lang.String str16 = this.f81028g;
            java.lang.String str17 = this.f81029h;
            android.webkit.ValueCallback<java.lang.String> valueCallback2 = this.f81032n;
            uh0.v G2 = G(true);
            java.lang.String str18 = this.f81025d;
            boolean z27 = this.f81030i;
            ((th0.w) sVar).getClass();
            vt0.c.f(s17, false, false, activityContext2, str14, str15, str16, "", str17, 10, valueCallback2, G2, true, str18, z27, false);
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.v
        public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
            java.lang.String str;
            com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest openFileRequest = (com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest) appBrandProxyUIProcessTask$ProcessRequest;
            this.f81025d = openFileRequest.f81021f;
            this.f81026e = openFileRequest.f81019d;
            this.f81028g = openFileRequest.f81020e;
            this.f81030i = openFileRequest.f81022g;
            this.f81029h = java.lang.Integer.toString(getActivityContext().hashCode());
            if (com.tencent.mm.sdk.platformtools.a0.c()) {
                H(this.f81026e, this.f81028g);
                return;
            }
            try {
                int lastIndexOf = this.f81026e.lastIndexOf(47) + 1;
                if (lastIndexOf < 0 || lastIndexOf == this.f81026e.length()) {
                    lastIndexOf = 0;
                }
                java.lang.String str2 = this.f81026e;
                str = str2.substring(lastIndexOf, str2.length());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.f81018h, "get file name error " + e17.getMessage());
                str = "";
            }
            this.f81027f = str;
            I();
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.v, com.tencent.mm.ui.xc
        public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
            if (f81024p != i17) {
                finishProcess(null);
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.OpenResult openResult = new com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.OpenResult();
            if (-1 == i18) {
                openResult.f81023d = 0;
            } else {
                openResult.f81023d = Integer.MAX_VALUE;
            }
            finishProcess(openResult);
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.v
        public void onConfigurationChanged(android.content.res.Configuration configuration) {
            super.onConfigurationChanged(configuration);
            com.tencent.mm.plugin.appbrand.ui.na.g(getActivityContext(), 2 == configuration.orientation);
        }

        @Override // com.tencent.mm.plugin.appbrand.ipc.v
        public void onProcessInterrupted() {
            super.onProcessInterrupted();
            getActivityContext().getWindow().setBackgroundDrawableResource(com.tencent.mm.R.color.a9e);
        }
    }

    public OpenFileRequest() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.String getUIAlias() {
        return "QbDocumentReader";
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean noActionBar() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        super.readParcel(parcel);
        this.f81019d = parcel.readString();
        this.f81020e = parcel.readString();
        this.f81021f = parcel.readString();
        this.f81022g = parcel.readInt() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f81019d);
        parcel.writeString(this.f81020e);
        parcel.writeString(this.f81021f);
        parcel.writeInt(this.f81022g ? 1 : 0);
    }

    public OpenFileRequest(android.os.Parcel parcel) {
        super(parcel);
    }
}
