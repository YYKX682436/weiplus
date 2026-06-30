package rs0;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final rs0.j f480839d = new rs0.j(null);

    /* renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f480840a;

    /* renamed from: b, reason: collision with root package name */
    public rs0.h f480841b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f480842c;

    static {
        fp.d0.o("GPUDetector");
    }

    public final void a() {
        try {
            rs0.j jVar = f480839d;
            if (jVar.c() != -1) {
                java.lang.String string = jVar.d().getString("gl_extension_support_list", "");
                if (string == null) {
                    string = "";
                }
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, "") && jVar.b() != null && jVar.a() != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.p341xc9e73c72.C2944xdb52bcd.INSTANCE.m21997x52c258a2(), jVar.a())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GpuDetectorUtil", "sp has value and not to do queryGpuInfo");
                    return;
                }
            }
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("GpuDetectorUtil", 5);
            this.f480840a = a17;
            a17.start();
            android.os.HandlerThread handlerThread = this.f480840a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread != null ? handlerThread.getLooper() : null);
            this.f480842c = n3Var;
            n3Var.mo50293x3498a0(new rs0.l(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.GpuDetectorUtil", "error happened " + e17, new java.lang.Object[0]);
        }
    }

    public final void b(int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, int i27, java.lang.String str4, int i28) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GpuDetectorUtil", "report gpu info archName:" + i17 + ",code:" + i18 + ",coreSum:" + i19 + ",name:" + str + ",vendor:" + str2 + ",version:" + str3 + ",rating:" + i27 + ",archNameDetail:" + str4 + ",glOesExtensionSupported:" + i28);
        jx3.f.INSTANCE.r(20128, true, true, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, str2, str3, java.lang.Integer.valueOf(i27), str4, java.lang.Integer.valueOf(i28));
    }

    public final void c(com.p314xaae8f345.p341xc9e73c72.C2944xdb52bcd.GpuDeviceModel gpuDeviceModel) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("arch", java.lang.String.valueOf(gpuDeviceModel.getArch()));
        jSONObject.put("code", java.lang.String.valueOf(gpuDeviceModel.getCode()));
        jSONObject.put("numCores", java.lang.String.valueOf(gpuDeviceModel.getNumCores()));
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, gpuDeviceModel.getName());
        jSONObject.put("vendor", gpuDeviceModel.getVendor());
        jSONObject.put("version", gpuDeviceModel.getVersion());
        jSONObject.put("archDetail", com.p314xaae8f345.p341xc9e73c72.C2944xdb52bcd.INSTANCE.m21995x6068b0a8(gpuDeviceModel.getArch()));
        f480839d.d().putString("gpu_info_device_model", jSONObject.toString());
    }
}
