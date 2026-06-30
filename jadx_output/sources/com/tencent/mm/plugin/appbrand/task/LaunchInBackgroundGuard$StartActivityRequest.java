package com.tencent.mm.plugin.appbrand.task;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0018J\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"com/tencent/mm/plugin/appbrand/task/LaunchInBackgroundGuard$StartActivityRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "", "oneShotForeground", "usePendingIntentOnBackground", "preferRunOnUiThreadForStartingProcessProxyUI", "Landroid/os/Parcel;", "dest", "", "flags", "Ljz5/f0;", "writeToParcel", "describeContents", "d", "I", "a", "()I", "hash", "<init>", "(I)V", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/task/p1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class LaunchInBackgroundGuard$StartActivityRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.task.p1 CREATOR = new com.tencent.mm.plugin.appbrand.task.p1(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int hash;

    public LaunchInBackgroundGuard$StartActivityRequest(int i17) {
        this.hash = i17;
    }

    /* renamed from: a, reason: from getter */
    public final int getHash() {
        return this.hash;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.task.q1.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean oneShotForeground() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean preferRunOnUiThreadForStartingProcessProxyUI() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean usePendingIntentOnBackground() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeInt(this.hash);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LaunchInBackgroundGuard$StartActivityRequest(android.os.Parcel parcel) {
        this(parcel.readInt());
        kotlin.jvm.internal.o.g(parcel, "parcel");
    }
}
