package com.tencent.mm.feature.appbrand.support;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/luggage/sdk/launching/OnWXAppResultXPCWrapper$SafeParcelableWrapper;", "kotlin.jvm.PlatformType", "wrap", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/luggage/sdk/launching/OnWXAppResultXPCWrapper$SafeParcelableWrapper;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class o<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.appbrand.support.o f65096d = new com.tencent.mm.feature.appbrand.support.o();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Parcelable parcelable = ((com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.SafeParcelableWrapper) obj).f47607d;
        com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent startActivityFromAppBrandEvent = parcelable instanceof com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent ? (com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent) parcelable : null;
        if (startActivityFromAppBrandEvent != null) {
            startActivityFromAppBrandEvent.e();
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(startActivityFromAppBrandEvent != null ? startActivityFromAppBrandEvent.f78016h : false));
        }
    }
}
