package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\r\u0010\u000eB7\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016¨\u0006\u001b"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiOnWebPageUrlExposed$WebPagePrefetchTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "in", org.chromium.base.BaseSwitches.V, "parcel", "", "flags", "writeToParcel", "describeContents", "<init>", "()V", "Lcom/tencent/mm/plugin/appbrand/jsapi/k0;", "api", "Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "component", "callbackId", "", "urlListStr", "bizType", "(Lcom/tencent/mm/plugin/appbrand/jsapi/k0;Lcom/tencent/mm/plugin/appbrand/jsapi/l;ILjava/lang/String;I)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/n8", "plugin-luggage-wechat-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class JsApiOnWebPageUrlExposed$WebPagePrefetchTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final com.tencent.mm.plugin.appbrand.jsapi.n8 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.n8(null);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78567f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f78568g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78569h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f78570i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78571m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f78572n;

    /* renamed from: o, reason: collision with root package name */
    public int f78573o;

    public JsApiOnWebPageUrlExposed$WebPagePrefetchTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4.readInt() == 1) goto L12;
     */
    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(android.os.Parcel r4) {
        /*
            r3 = this;
            super.v(r4)
            if (r4 == 0) goto La
            java.lang.String r0 = r4.readString()
            goto Lb
        La:
            r0 = 0
        Lb:
            r3.f78570i = r0
            r0 = 0
            if (r4 == 0) goto L18
            int r1 = r4.readInt()
            r2 = 1
            if (r1 != r2) goto L18
            goto L19
        L18:
            r2 = r0
        L19:
            r3.f78571m = r2
            if (r4 == 0) goto L21
            int r0 = r4.readInt()
        L21:
            r3.f78573o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed$WebPagePrefetchTask.v(android.os.Parcel):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f78570i);
        parcel.writeInt(this.f78571m ? 1 : 0);
        parcel.writeInt(this.f78573o);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        x();
        boolean z17 = this.f78571m;
        java.lang.String str = null;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78567f;
        int i17 = this.f78569h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f78568g;
        if (z17) {
            if (lVar != null) {
                if (k0Var != null) {
                    java.lang.String str2 = this.f78572n;
                    if (str2 == null) {
                        str2 = "ok";
                    }
                    str = k0Var.o(str2);
                }
                lVar.a(i17, str);
                return;
            }
            return;
        }
        if (lVar != null) {
            if (k0Var != null) {
                java.lang.String str3 = this.f78572n;
                if (str3 == null) {
                    str3 = "fail";
                }
                str = k0Var.o(str3);
            }
            lVar.a(i17, str);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        this.f78571m = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78570i)) {
            this.f78572n = "fail:urlList is null";
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:urlList is null");
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                cl0.e eVar = new cl0.e(this.f78570i);
                if (eVar.length() <= 0) {
                    this.f78572n = "fail:urlList is decode array fail";
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:urlList is decode array fail");
                } else {
                    int length = eVar.length();
                    int i17 = 0;
                    while (true) {
                        boolean z17 = true;
                        if (i17 >= length) {
                            break;
                        }
                        cl0.g k17 = eVar.k(i17);
                        java.lang.String optString = k17.optString("url");
                        if (optString == null || !r26.n0.N(optString)) {
                            z17 = false;
                        }
                        if (z17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "decode url is empty");
                        } else {
                            int optInt = k17.optInt("bizScene");
                            java.lang.String optString2 = k17.optString("extInfo");
                            zq1.i0 i0Var = new zq1.i0();
                            i0Var.f474983a = optString;
                            i0Var.f474991i = optString2;
                            i0Var.f474985c = 177;
                            i0Var.f474992j = optInt;
                            i0Var.f474984b = k17.optString("prefetchId", "");
                            arrayList.add(i0Var);
                        }
                        i17++;
                    }
                    if (arrayList.isEmpty()) {
                        this.f78572n = "fail:decode list is empty";
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:decode list is empty");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "doOnWebPageUrlExposed  bizType:" + this.f78573o);
                        if (this.f78573o == 1) {
                            ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).i(arrayList);
                        } else {
                            ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList);
                        }
                        this.f78572n = "ok";
                        this.f78571m = true;
                    }
                }
            } catch (java.lang.Exception unused) {
                this.f78572n = "fail:parse error";
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:parse error");
            }
        }
        c();
    }

    public JsApiOnWebPageUrlExposed$WebPagePrefetchTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, java.lang.String str, int i18) {
        this();
        this.f78567f = k0Var;
        this.f78568g = lVar;
        this.f78569h = i17;
        this.f78570i = str;
        this.f78573o = i18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsApiOnWebPageUrlExposed$WebPagePrefetchTask(android.os.Parcel parcel) {
        this();
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f78570i = parcel.readString();
        this.f78571m = parcel.readInt() == 1;
        this.f78573o = parcel.readInt();
    }
}
