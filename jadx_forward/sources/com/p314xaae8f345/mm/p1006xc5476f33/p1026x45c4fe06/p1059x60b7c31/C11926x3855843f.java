package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\r\u0010\u000eB7\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016¨\u0006\u001b"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiOnWebPageUrlExposed$WebPagePrefetchTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "in", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "parcel", "", "flags", "writeToParcel", "describeContents", "<init>", "()V", "Lcom/tencent/mm/plugin/appbrand/jsapi/k0;", "api", "Lcom/tencent/mm/plugin/appbrand/jsapi/l;", "component", "callbackId", "", "urlListStr", "bizType", "(Lcom/tencent/mm/plugin/appbrand/jsapi/k0;Lcom/tencent/mm/plugin/appbrand/jsapi/l;ILjava/lang/String;I)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/n8", "plugin-luggage-wechat-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed$WebPagePrefetchTask */
/* loaded from: classes7.dex */
final class C11926x3855843f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n8 f33659x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n8(null);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160100f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160101g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160102h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160103i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160104m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160105n;

    /* renamed from: o, reason: collision with root package name */
    public int f160106o;

    public C11926x3855843f() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4.readInt() == 1) goto L12;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
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
            r3.f160103i = r0
            r0 = 0
            if (r4 == 0) goto L18
            int r1 = r4.readInt()
            r2 = 1
            if (r1 != r2) goto L18
            goto L19
        L18:
            r2 = r0
        L19:
            r3.f160104m = r2
            if (r4 == 0) goto L21
            int r0 = r4.readInt()
        L21:
            r3.f160106o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11926x3855843f.v(android.os.Parcel):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f160103i);
        parcel.writeInt(this.f160104m ? 1 : 0);
        parcel.writeInt(this.f160106o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        x();
        boolean z17 = this.f160104m;
        java.lang.String str = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160100f;
        int i17 = this.f160102h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160101g;
        if (z17) {
            if (lVar != null) {
                if (k0Var != null) {
                    java.lang.String str2 = this.f160105n;
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
                java.lang.String str3 = this.f160105n;
                if (str3 == null) {
                    str3 = "fail";
                }
                str = k0Var.o(str3);
            }
            lVar.a(i17, str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        this.f160104m = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160103i)) {
            this.f160105n = "fail:urlList is null";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:urlList is null");
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                cl0.e eVar = new cl0.e(this.f160103i);
                if (eVar.mo15056xbe0e3ae6() <= 0) {
                    this.f160105n = "fail:urlList is decode array fail";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:urlList is decode array fail");
                } else {
                    int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
                    int i17 = 0;
                    while (true) {
                        boolean z17 = true;
                        if (i17 >= mo15056xbe0e3ae6) {
                            break;
                        }
                        cl0.g k17 = eVar.k(i17);
                        java.lang.String mo15082x48bce8a4 = k17.mo15082x48bce8a4("url");
                        if (mo15082x48bce8a4 == null || !r26.n0.N(mo15082x48bce8a4)) {
                            z17 = false;
                        }
                        if (z17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "decode url is empty");
                        } else {
                            int optInt = k17.optInt("bizScene");
                            java.lang.String mo15082x48bce8a42 = k17.mo15082x48bce8a4("extInfo");
                            zq1.i0 i0Var = new zq1.i0();
                            i0Var.f556516a = mo15082x48bce8a4;
                            i0Var.f556524i = mo15082x48bce8a42;
                            i0Var.f556518c = 177;
                            i0Var.f556525j = optInt;
                            i0Var.f556517b = k17.mo15083x48bce8a4("prefetchId", "");
                            arrayList.add(i0Var);
                        }
                        i17++;
                    }
                    if (arrayList.isEmpty()) {
                        this.f160105n = "fail:decode list is empty";
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:decode list is empty");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "doOnWebPageUrlExposed  bizType:" + this.f160106o);
                        if (this.f160106o == 1) {
                            ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).i(arrayList);
                        } else {
                            ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList);
                        }
                        this.f160105n = "ok";
                        this.f160104m = true;
                    }
                }
            } catch (java.lang.Exception unused) {
                this.f160105n = "fail:parse error";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnWebPageUrlExposed.WebPagePrefetchTask", "fail:parse error");
            }
        }
        c();
    }

    public C11926x3855843f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, int i18) {
        this();
        this.f160100f = k0Var;
        this.f160101g = lVar;
        this.f160102h = i17;
        this.f160103i = str;
        this.f160106o = i18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11926x3855843f(android.os.Parcel parcel) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f160103i = parcel.readString();
        this.f160104m = parcel.readInt() == 1;
        this.f160106o = parcel.readInt();
    }
}
