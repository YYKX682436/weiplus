package rs0;

/* loaded from: classes14.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs0.n f480837d;

    public l(rs0.n nVar) {
        this.f480837d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.g gVar = rs0.i.f480829a;
        rs0.h n17 = rs0.g.n(gVar, null, null, 1, 1, null, 16, null);
        rs0.n nVar = this.f480837d;
        nVar.f480841b = n17;
        java.lang.String glGetString = android.opengl.GLES20.glGetString(7939);
        if (glGetString == null || glGetString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GpuDetectorUtil", "queryGpuInfo: GL_EXTENSIONS is null or empty");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(glGetString);
            nVar.getClass();
            rs0.n.f480839d.d().putString("gl_extension_support_list", glGetString);
        }
        nVar.getClass();
        try {
            com.p314xaae8f345.p341xc9e73c72.C2944xdb52bcd.GpuDeviceModel gpuDeviceModel = new com.p314xaae8f345.p341xc9e73c72.C2944xdb52bcd.GpuDeviceModel();
            com.p314xaae8f345.p341xc9e73c72.C2944xdb52bcd c2944xdb52bcd = new com.p314xaae8f345.p341xc9e73c72.C2944xdb52bcd();
            if (c2944xdb52bcd.m21989xd6f936fd(gpuDeviceModel)) {
                int i17 = gVar.e("GL_OES_EGL_image_external_essl3") ? 1 : 0;
                int arch = gpuDeviceModel.getArch();
                int code = gpuDeviceModel.getCode();
                int numCores = gpuDeviceModel.getNumCores();
                java.lang.String name = gpuDeviceModel.getName();
                java.lang.String vendor = gpuDeviceModel.getVendor();
                java.lang.String version = gpuDeviceModel.getVersion();
                int m21994x1f59dfa1 = c2944xdb52bcd.m21994x1f59dfa1();
                com.p314xaae8f345.p341xc9e73c72.C2944xdb52bcd.Companion companion = com.p314xaae8f345.p341xc9e73c72.C2944xdb52bcd.INSTANCE;
                nVar.b(arch, code, numCores, name, vendor, version, m21994x1f59dfa1, companion.m21995x6068b0a8(gpuDeviceModel.getArch()), i17);
                int m21994x1f59dfa12 = c2944xdb52bcd.m21994x1f59dfa1();
                rs0.j jVar = rs0.n.f480839d;
                jVar.d().putInt("gpu_info_rating", m21994x1f59dfa12);
                jVar.d().putString("gpu_detector_version", companion.m21997x52c258a2());
                nVar.c(gpuDeviceModel);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.GpuDetectorUtil", "Failed to detect GPU " + e17, new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = nVar.f480842c;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = nVar.f480842c;
        if (n3Var2 != null) {
            n3Var2.mo50293x3498a0(new rs0.k(nVar));
        }
    }
}
