package com.tencent.mm.plugin.appbrand.jsapi.media;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/media/GetSightParamsIPCTask;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/appbrand/jsapi/media/GetSightParamsIPCTask$TaskParams;", "Lcom/tencent/mm/plugin/mmsight/SightParams;", "<init>", "()V", "TaskParams", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class GetSightParamsIPCTask implements com.tencent.mm.ipcinvoker.k0 {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/media/GetSightParamsIPCTask$TaskParams;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/media/o1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public static final /* data */ class TaskParams implements android.os.Parcelable {
        public static final com.tencent.mm.plugin.appbrand.jsapi.media.o1 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.o1(null);

        /* renamed from: d, reason: collision with root package name */
        public final int f81615d;

        /* renamed from: e, reason: collision with root package name */
        public final int f81616e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f81617f;

        public TaskParams(int i17, int i18, boolean z17) {
            this.f81615d = i17;
            this.f81616e = i18;
            this.f81617f = z17;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask.TaskParams)) {
                return false;
            }
            com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask.TaskParams taskParams = (com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask.TaskParams) obj;
            return this.f81615d == taskParams.f81615d && this.f81616e == taskParams.f81616e && this.f81617f == taskParams.f81617f;
        }

        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.f81615d) * 31) + java.lang.Integer.hashCode(this.f81616e)) * 31) + java.lang.Boolean.hashCode(this.f81617f);
        }

        public java.lang.String toString() {
            return "TaskParams(sightMode=" + this.f81615d + ", maxDuration=" + this.f81616e + ", isFront=" + this.f81617f + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel dest, int i17) {
            kotlin.jvm.internal.o.g(dest, "dest");
            dest.writeInt(this.f81615d);
            dest.writeInt(this.f81616e);
            dest.writeByte(this.f81617f ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask.TaskParams data = (com.tencent.mm.plugin.appbrand.jsapi.media.GetSightParamsIPCTask.TaskParams) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("microMsg_");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = lp0.b.m() + "microMsg." + sb7 + ".mp4";
        java.lang.String str2 = lp0.b.m() + "microMsg." + sb7 + ".jpeg";
        int i17 = data.f81615d;
        if (i17 == 2) {
            com.tencent.mm.plugin.mmsight.SightParams sightParams = new com.tencent.mm.plugin.mmsight.SightParams(3, 2);
            sightParams.f148823m = lp0.b.m();
            sightParams.f148822i = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            return sightParams;
        }
        com.tencent.mm.plugin.mmsight.SightParams sightParams2 = new com.tencent.mm.plugin.mmsight.SightParams(3, 1);
        sightParams2.f148818e = data.f81617f ? 1 : 2;
        sightParams2.f148817d = i17;
        if (sightParams2.f148819f == null) {
            sightParams2.f148819f = new com.tencent.mm.modelcontrol.VideoTransPara();
        }
        sightParams2.f148819f.f71195h = data.f81616e;
        sightParams2.f148826p = false;
        sightParams2.a(sb7, str, str2, q75.c.d() + "capture" + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        return sightParams2;
    }
}
