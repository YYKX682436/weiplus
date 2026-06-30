package com.tencent.mm.feature.appbrand.support;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\u00020\t\"\u0010\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00012\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032*\u0010\b\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/tencent/mm/sdk/event/IEvent;", "Landroid/os/Parcelable;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/luggage/sdk/launching/OnWXAppResultXPCWrapper$SafeParcelableWrapper;", "kotlin.jvm.PlatformType", "wrap", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/luggage/sdk/launching/OnWXAppResultXPCWrapper$SafeParcelableWrapper;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class n<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.appbrand.support.n f65092d = new com.tencent.mm.feature.appbrand.support.n();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.Object obj2 = ((com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.SafeParcelableWrapper) obj).f47607d;
        com.tencent.mm.sdk.event.IEvent iEvent = obj2 instanceof com.tencent.mm.sdk.event.IEvent ? (com.tencent.mm.sdk.event.IEvent) obj2 : null;
        if (iEvent != null) {
            iEvent.b(android.os.Looper.getMainLooper());
        }
        if (rVar != null) {
            uk0.a.a(rVar);
        }
    }
}
