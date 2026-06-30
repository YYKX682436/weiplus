package com.tencent.gpudetector;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0086 R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/gpudetector/JniGPUDetector;", "", "()V", "gpuArchInfo", "", "getGpuArchInfo", "()Ljava/lang/String;", "gpuCodeInfo", "", "getGpuCodeInfo", "()I", "gpuCoreSumInfo", "getGpuCoreSumInfo", "gpuInfo", "", "getGpuInfo", "()[I", "gpuPerfScoreInfo", "getGpuPerfScoreInfo", "GetGPUDeviceModel", "", "deviceModel", "Lcom/tencent/gpudetector/JniGPUDetector$GpuDeviceModel;", "Companion", "GpuDeviceModel", "gpudetector_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes14.dex */
public final class JniGPUDetector {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.gpudetector.JniGPUDetector.Companion INSTANCE = new com.tencent.gpudetector.JniGPUDetector.Companion(null);
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> gpuDetailList = kz5.c1.i(new jz5.l(-1, "GpuDeviceArchUnknown"), new jz5.l(0, "GpuDeviceArchAMDGeneric"), new jz5.l(1, "GpuDeviceArchAppleGeneric"), new jz5.l(2, "GpuDeviceArchAppleA"), new jz5.l(3, "GpuDeviceArchARMGeneric"), new jz5.l(4, "GpuDeviceArchMaliMidgardT"), new jz5.l(5, "GpuDeviceArchMaliBifrostG"), new jz5.l(6, "GpuDeviceArchMaliValhallG"), new jz5.l(7, "GpuDeviceArchImaginationGeneric"), new jz5.l(8, "GpuDeviceArchPowerVRSGX"), new jz5.l(9, "GpuDeviceArchPowerVRRogueGeneric"), new jz5.l(10, "GpuDeviceArchPowerVRRogueG"), new jz5.l(11, "GpuDeviceArchPowerVRRogueGX"), new jz5.l(12, "GpuDeviceArchPowerVRRogueGT"), new jz5.l(13, "GpuDeviceArchPowerVRRogueGE"), new jz5.l(14, "GpuDeviceArchPowerVRRogueGM"), new jz5.l(15, "GpuDeviceArchPowerVRFurianBegin"), new jz5.l(16, "GpuDeviceArchPowerVRFurianGT"), new jz5.l(17, "GpuDeviceArchImgAlbiorixGeneric"), new jz5.l(18, "GpuDeviceArchImgAlbiorixAXE"), new jz5.l(19, "GpuDeviceArchImgAlbiorixAXM"), new jz5.l(20, "GpuDeviceArchImgAlbiorixAXT"), new jz5.l(21, "GpuDeviceArchImgBSericesGeneric"), new jz5.l(22, "GpuDeviceArchImgBSericesBX"), new jz5.l(23, "GpuDeviceArchImgBSericesBXS"), new jz5.l(24, "GpuDeviceArchImgBSericesBXM"), new jz5.l(25, "GpuDeviceArchImgBSericesBXE"), new jz5.l(26, "GpuDeviceArchImgBSericesBXT"), new jz5.l(27, "GpuDeviceArchIntelGeneric"), new jz5.l(28, "GpuDeviceArchNVIDIAGeneric"), new jz5.l(29, "GpuDeviceArchQualcommGeneric"), new jz5.l(30, "GpuDeviceArchAdreno3XX"), new jz5.l(31, "GpuDeviceArchAdreno4XX"), new jz5.l(32, "GpuDeviceArchAdreno5XX"), new jz5.l(33, "GpuDeviceArchAdreno6XX"), new jz5.l(34, "GpuDeviceArchAdreno7XX"), new jz5.l(35, "GpuDeviceArchHuaweiGeneric"), new jz5.l(36, "GpuDeviceArchMaleoon9xx"));
    private byte _hellAccFlag_;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/tencent/gpudetector/JniGPUDetector$Companion;", "", "()V", "gpuDetailList", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getGpuDetailList", "()Ljava/util/HashMap;", "getArchNameDetail", "arch", "getVersion", "showGpuDeviceModel", "gpudetector_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final java.lang.String getArchNameDetail(int arch) {
            return arch + '(' + getGpuDetailList().get(java.lang.Integer.valueOf(arch)) + ')';
        }

        public final java.util.HashMap<java.lang.Integer, java.lang.String> getGpuDetailList() {
            return com.tencent.gpudetector.JniGPUDetector.gpuDetailList;
        }

        public final java.lang.String getVersion() {
            return "1.0.0-44";
        }

        public final java.lang.String showGpuDeviceModel() {
            com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel gpuDeviceModel = new com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel();
            if (!new com.tencent.gpudetector.JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel)) {
                return "Failed to detect GPU";
            }
            java.lang.String format = java.lang.String.format("GPU arch: %s\n, code: %d, numCores: %d, perfScore: %d\nvendor: %s\nname: %s\nversion: %s\n", java.util.Arrays.copyOf(new java.lang.Object[]{getArchNameDetail(gpuDeviceModel.getArch()), java.lang.Integer.valueOf(gpuDeviceModel.getCode()), java.lang.Integer.valueOf(gpuDeviceModel.getNumCores()), java.lang.Integer.valueOf(gpuDeviceModel.getPerfScore()), gpuDeviceModel.getVendor(), gpuDeviceModel.getName(), gpuDeviceModel.getVersion()}, 7));
            kotlin.jvm.internal.o.c(format, "java.lang.String.format(format, *args)");
            return format;
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/tencent/gpudetector/JniGPUDetector$GpuDeviceModel;", "", "()V", "arch", "", "getArch", "()I", "setArch", "(I)V", "code", "getCode", "setCode", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "numCores", "getNumCores", "setNumCores", "perfScore", "getPerfScore", "setPerfScore", "vendor", "getVendor", "setVendor", "version", "getVersion", "setVersion", "gpudetector_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes14.dex */
    public static final class GpuDeviceModel {
        private int arch;
        private int code;
        private int numCores;
        private int perfScore;
        private java.lang.String vendor = "Unknown";
        private java.lang.String name = "Unknown";
        private java.lang.String version = "Unknown";

        public final int getArch() {
            return this.arch;
        }

        public final int getCode() {
            return this.code;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final int getNumCores() {
            return this.numCores;
        }

        public final int getPerfScore() {
            return this.perfScore;
        }

        public final java.lang.String getVendor() {
            return this.vendor;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final void setArch(int i17) {
            this.arch = i17;
        }

        public final void setCode(int i17) {
            this.code = i17;
        }

        public final void setName(java.lang.String str) {
            kotlin.jvm.internal.o.h(str, "<set-?>");
            this.name = str;
        }

        public final void setNumCores(int i17) {
            this.numCores = i17;
        }

        public final void setPerfScore(int i17) {
            this.perfScore = i17;
        }

        public final void setVendor(java.lang.String str) {
            kotlin.jvm.internal.o.h(str, "<set-?>");
            this.vendor = str;
        }

        public final void setVersion(java.lang.String str) {
            kotlin.jvm.internal.o.h(str, "<set-?>");
            this.version = str;
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("GPUDetector");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/gpudetector/JniGPUDetector", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/gpudetector/JniGPUDetector", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public final native boolean GetGPUDeviceModel(com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel deviceModel);

    public final java.lang.String getGpuArchInfo() {
        com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel gpuDeviceModel = new com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel();
        return new com.tencent.gpudetector.JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel) ? INSTANCE.getArchNameDetail(gpuDeviceModel.getArch()) : INSTANCE.getArchNameDetail(-1);
    }

    public final int getGpuCodeInfo() {
        com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel gpuDeviceModel = new com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel();
        if (new com.tencent.gpudetector.JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel)) {
            return gpuDeviceModel.getCode();
        }
        return -1;
    }

    public final int getGpuCoreSumInfo() {
        com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel gpuDeviceModel = new com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel();
        if (new com.tencent.gpudetector.JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel)) {
            return gpuDeviceModel.getNumCores();
        }
        return -1;
    }

    public final int[] getGpuInfo() {
        com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel gpuDeviceModel = new com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel();
        if (!new com.tencent.gpudetector.JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel)) {
            return null;
        }
        gpuDeviceModel.getArch();
        gpuDeviceModel.getCode();
        gpuDeviceModel.getNumCores();
        return null;
    }

    public final int getGpuPerfScoreInfo() {
        com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel gpuDeviceModel = new com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel();
        if (new com.tencent.gpudetector.JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel)) {
            return gpuDeviceModel.getPerfScore();
        }
        return -1;
    }
}
