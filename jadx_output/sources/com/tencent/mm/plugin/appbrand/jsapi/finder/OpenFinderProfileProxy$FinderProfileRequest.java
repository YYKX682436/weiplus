package com.tencent.mm.plugin.appbrand.jsapi.finder;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\t\b\u0016¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0014J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/OpenFinderProfileProxy$FinderProfileRequest", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "", "oneShotForeground", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "Landroid/os/Parcel;", "in", "Ljz5/f0;", "readParcel", "dest", "", "flags", "writeToParcel", "Landroid/content/Intent;", "d", "Landroid/content/Intent;", "a", "()Landroid/content/Intent;", "b", "(Landroid/content/Intent;)V", "intent", "<init>", "()V", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/finder/j1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class OpenFinderProfileProxy$FinderProfileRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.finder.j1 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.j1(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private android.content.Intent intent;

    public OpenFinderProfileProxy$FinderProfileRequest() {
    }

    /* renamed from: a, reason: from getter */
    public final android.content.Intent getIntent() {
        return this.intent;
    }

    public final void b(android.content.Intent intent) {
        this.intent = intent;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<? extends com.tencent.mm.plugin.appbrand.ipc.v> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderProfileProxy$FinderProfileTask.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public boolean oneShotForeground() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public void readParcel(android.os.Parcel parcel) {
        this.intent = parcel != null ? (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader()) : null;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeParcelable(this.intent, i17);
    }

    public OpenFinderProfileProxy$FinderProfileRequest(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        this.intent = intent;
    }

    public OpenFinderProfileProxy$FinderProfileRequest(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        readParcel(parcel);
    }
}
