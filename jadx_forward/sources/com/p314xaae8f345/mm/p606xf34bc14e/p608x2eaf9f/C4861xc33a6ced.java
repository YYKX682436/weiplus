package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR*\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccInjectionInterceptReporter;", "Lcom/tencent/mm/accessibility/core/AccFrequencyControlReporter;", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "EventId", "getEventId", "setEventId", "Lcom/tencent/mm/sdk/platformtools/o4;", "kotlin.jvm.PlatformType", "mmkv", "Lcom/tencent/mm/sdk/platformtools/o4;", "getMmkv", "()Lcom/tencent/mm/sdk/platformtools/o4;", "setMmkv", "(Lcom/tencent/mm/sdk/platformtools/o4;)V", "", "routeRule", "I", "getRouteRule", "()I", "setRouteRule", "(I)V", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.AccInjectionInterceptReporter */
/* loaded from: classes8.dex */
public final class C4861xc33a6ced extends com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.AbstractC4860x5cf1a1e3 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4861xc33a6ced f21026x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4861xc33a6ced();
    private static java.lang.String TAG = "MicroMsg.AccTouchInterceptReporter";
    private static java.lang.String EventId = "injection_intercept";
    private static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mmkv = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AccTouchInterceptReporter");
    private static int routeRule = 33811;

    private C4861xc33a6ced() {
    }

    @Override // x51.i0
    /* renamed from: getEventId */
    public java.lang.String mo42415xebc1791f() {
        return EventId;
    }

    @Override // x51.i0
    /* renamed from: getMmkv */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mo42416xfb829b81() {
        return mmkv;
    }

    @Override // x51.i0
    /* renamed from: getRouteRule */
    public int mo42417x96ae22f() {
        return routeRule;
    }

    @Override // x51.i0
    /* renamed from: getTAG */
    public java.lang.String mo42418xb5886c64() {
        return TAG;
    }

    @Override // x51.i0
    /* renamed from: setEventId */
    public void mo42419x5f32c693(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        EventId = str;
    }

    @Override // x51.i0
    /* renamed from: setMmkv */
    public void mo42420x764d628d(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var) {
        mmkv = o4Var;
    }

    @Override // x51.i0
    /* renamed from: setRouteRule */
    public void mo42421x65bea2a3(int i17) {
        routeRule = i17;
    }

    @Override // x51.i0
    /* renamed from: setTAG */
    public void mo42422xca0293d8(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        TAG = str;
    }
}
