package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.api.ext;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u001d\b\u0017\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u0015"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/nfc/hce/api/ext/HceServiceBase$CheckIsSupportHCETask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "y", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "in", org.chromium.base.BaseSwitches.V, "Led1/k;", "api", "", "checkSystemSwitch", "<init>", "(Led1/k;Z)V", "(Landroid/os/Parcel;)V", "CREATOR", "ed1/j", "luggage-commons-jsapi-nfc-ext_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class HceServiceBase$CheckIsSupportHCETask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final ed1.j CREATOR = new ed1.j(null);

    /* renamed from: f, reason: collision with root package name */
    public final ed1.k f82406f;

    /* renamed from: g, reason: collision with root package name */
    public int f82407g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f82408h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82409i;

    public HceServiceBase$CheckIsSupportHCETask(ed1.k kVar) {
        this(kVar, false, 2, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        super.v(in6);
        this.f82407g = in6.readInt();
        this.f82408h = in6.readString();
        this.f82409i = 1 == in6.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        dest.writeInt(this.f82407g);
        dest.writeString(this.f82408h);
        dest.writeInt(this.f82409i ? 1 : 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        super.y();
        x();
        ed1.k kVar = this.f82406f;
        if (kVar != null) {
            kotlin.jvm.internal.o.d(kVar);
            int i17 = this.f82407g;
            java.lang.String str = this.f82408h;
            com.tencent.mars.xlog.Log.i("HceApiBaseService", "checkIsSupport resultCallback errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
            if (i17 == 0) {
                ed1.i iVar = kVar.f251249a;
                if (iVar != null) {
                    iVar.onResult(i17, str);
                    return;
                }
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = "unknown error";
            }
            ed1.i iVar2 = kVar.f251249a;
            if (iVar2 != null) {
                iVar2.onResult(i17, str);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (!fd1.d.b()) {
            this.f82407g = 13000;
            this.f82408h = "not support NFC";
        } else if (!fd1.d.a()) {
            this.f82407g = 13002;
            this.f82408h = "not support HCE";
        } else if (!this.f82409i || fd1.d.c()) {
            this.f82407g = 0;
            this.f82408h = "support HCE and system NFC switch is opened";
        } else {
            this.f82407g = 13001;
            this.f82408h = "system NFC switch not opened";
        }
        c();
    }

    public HceServiceBase$CheckIsSupportHCETask(ed1.k kVar, boolean z17) {
        this.f82406f = kVar;
        this.f82409i = z17;
    }

    public /* synthetic */ HceServiceBase$CheckIsSupportHCETask(ed1.k kVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(kVar, (i17 & 2) != 0 ? false : z17);
    }

    public HceServiceBase$CheckIsSupportHCETask(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        v(in6);
    }
}
