package com.tencent.mm.plugin.appbrand.jsapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class JsApiOpenWeRunSetting$OpenWeRunSetting extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.ua();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78586f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f78587g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78588h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f78589i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78590m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f78591n;

    public JsApiOpenWeRunSetting$OpenWeRunSetting(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWeRunSetting", "OpenWeRunSetting");
        this.f78586f = k0Var;
        this.f78587g = lVar;
        this.f78588h = i17;
        this.f78591n = z17;
    }

    public static void B(com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting jsApiOpenWeRunSetting$OpenWeRunSetting) {
        if (!jsApiOpenWeRunSetting$OpenWeRunSetting.f78591n || jsApiOpenWeRunSetting$OpenWeRunSetting.f78589i) {
            ((ue4.w) ((ve4.e) i95.n0.c(ve4.e.class))).getClass();
            boolean e17 = com.tencent.mm.plugin.sport.model.c0.e();
            jsApiOpenWeRunSetting$OpenWeRunSetting.f78590m = e17;
            if (jsApiOpenWeRunSetting$OpenWeRunSetting.f78591n && e17) {
                ((ue4.w) ((ve4.e) i95.n0.c(ve4.e.class))).getClass();
                if (((ue4.r) i95.n0.c(ue4.r.class)).wi() != null) {
                    com.tencent.mm.plugin.sport.model.d wi6 = ((ue4.r) i95.n0.c(ue4.r.class)).wi();
                    long a17 = wi6.a();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Sport.DeviceStepManager", "forceUploadDeviceStep %d", java.lang.Long.valueOf(a17));
                    wi6.d(a17);
                }
            }
        }
        jsApiOpenWeRunSetting$OpenWeRunSetting.c();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78589i = parcel.readByte() != 0;
        this.f78590m = parcel.readByte() != 0;
        this.f78591n = parcel.readByte() != 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f78589i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f78590m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f78591n ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f78591n;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78586f;
        int i17 = this.f78588h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f78587g;
        if (z17 && !this.f78589i) {
            lVar.a(i17, k0Var.o("fail device not support"));
            x();
            return;
        }
        if (this.f78590m) {
            lVar.a(i17, k0Var.o("ok"));
            x();
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            lVar.a(i17, k0Var.o("fail:internal error invalid android context"));
            x();
            return;
        }
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f305841d)) {
            lVar.a(i17, k0Var.o("fail"));
            x();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("OpenWeRunSettingName", z0Var.f305841d);
        intent.setClass(context, com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI.class);
        nf.g.a(context).j(intent, new com.tencent.mm.plugin.appbrand.jsapi.ta(this));
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.plugin.appbrand.jsapi.ra raVar = new com.tencent.mm.plugin.appbrand.jsapi.ra(this);
        if (gm0.j1.i().f273208a.f273299d) {
            raVar.run();
        } else {
            gm0.j1.i().m(new com.tencent.mm.plugin.appbrand.jsapi.sa(this, raVar));
        }
    }

    public JsApiOpenWeRunSetting$OpenWeRunSetting(android.os.Parcel parcel) {
        v(parcel);
    }
}
